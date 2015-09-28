package ca.gc.space.mrt.sensors.fov.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;

import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.DistanceRange;
import ca.gc.space.mrt.sensors.fov.FovPackage;
import ca.gc.space.mrt.sensors.fov.ui.jme3.Activator;
import ca.gc.space.mrt.sensors.fov.ui.jme3.utils.AbstractFieldOfViewImageProjectorControl;
import ca.gc.space.mrt.sensors.fov.ui.jme3.utils.ConicalFieldOfViewImageProjectorControl;
import ca.gc.space.mrt.sensors.fov.ui.jme3.utils.JME3FovUtilities;
import ca.gc.space.mrt.sensors.fov.ui.scene_objects.ConicalFieldOfViewSceneObject;
import ca.gc.space.topology.core.primitives.ui.jme3.JME3PrimitivesUtilities;
import ca.gc.space.topology.ui.MeshPresentationMode;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;

public class ConicalFieldOfViewJME3Object extends AbstractFieldOfViewJME3Object<ConicalFieldOfView> implements ConicalFieldOfViewSceneObject 																											   
{		
	public static float DEFAULT_ANGLE_INCREMENT = (float) Math.toRadians(10.0);	
	private Adapter adapter;
	
	private AssetManager assetManager;	
	
	private Geometry frontHemisphereGeometry = null;
	private Geometry rearHemisphereGeometry = null;
	private Geometry truncatedConeGeometry = null;
	
	private ConicalFieldOfViewImageProjectorControl conicalFieldOfViewImageProjectorControl;
		
	public ConicalFieldOfViewJME3Object(ConicalFieldOfView node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);

		if (node == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
				
		this.assetManager = jme3Application.getAssetManager();			
		
		// Updates the geometry.
		updateGeometry();								
		
		// Listens for change on the ConicalFieldOfView.
		node.eAdapters().add(getAdapter());		
		node.getRange().eAdapters().add(getAdapter());		
	}
	
	@Override
	public void dispose() 
	{
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getAdapter());	
			
			if(getTopologyNode().getRange() != null)
			{
				getTopologyNode().getRange().eAdapters().remove(getAdapter());		
			}
		}
				
		if(conicalFieldOfViewImageProjectorControl != null)
		{
			conicalFieldOfViewImageProjectorControl.dispose();
			conicalFieldOfViewImageProjectorControl = null;
		}
		
		super.dispose();
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(frontHemisphereGeometry);
		geometries.add(rearHemisphereGeometry);
		geometries.add(truncatedConeGeometry);		
		return geometries;
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Set Color <" + rgb + ")", EventSeverity.OK);
		super.setColor(rgb);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{				
				try
				{
					if(frontHemisphereGeometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Diffuse", fovColor.clone());
						mat.setColor("Ambient", fovColor.clone());
						mat.setColor("Specular", fovColor.clone());			
						frontHemisphereGeometry.setMaterial(mat);
					}
					
					if(rearHemisphereGeometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Diffuse", fovColor.clone());
						mat.setColor("Ambient", fovColor.clone());
						mat.setColor("Specular", fovColor.clone());			
						rearHemisphereGeometry.setMaterial(mat);
					}
					
					if(truncatedConeGeometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Diffuse", fovColor.clone());
						mat.setColor("Ambient", fovColor.clone());
						mat.setColor("Specular", fovColor.clone());			
						truncatedConeGeometry.setMaterial(mat);
					}
				}
				catch(Throwable t)
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set color to <" + rgb + ">!", EventSeverity.ERROR, t);
				}
				return null;
			}
		});
			
	}
	
	@Override
	public void setShowProjection(boolean showProjection) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "setShowProjection(" + showProjection + ")", EventSeverity.INFO);
		
		// Set the image projector enablement.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				getConicalFieldOfViewImageProjectorControl().setEnabled(showProjection);
				return null;
			}
		});
				
		this.showProjection = showProjection;
	}

	@Override
	public void setShowOutlineOnly(boolean showOutlineOnly) 
	{
		// TODO Auto-generated method stub	
	}

	
	@Override
	public void setPresentationMode(MeshPresentationMode mode) 
	{		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{			
				internalSetPresentationMode(mode);
						
				return null;
			}
		});
	}
	
	@Override
	public AbstractFieldOfViewImageProjectorControl<ConicalFieldOfView> getAbstractFieldOfViewImageProjectorControl() 
	{	
		return getConicalFieldOfViewImageProjectorControl();
	}
	
	
	private void updateGeometry()
	{
		// Updates the geometry.
		Job job = new Job("ConicalFieldOfViewJME3Object : Updating Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{			
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{
						// Removes previous geometries if applicable.
						if(truncatedConeGeometry != null) getAttachmentNode().detachChild(truncatedConeGeometry);	
						if(frontHemisphereGeometry != null) getAttachmentNode().detachChild(frontHemisphereGeometry);		
						if(rearHemisphereGeometry != null) getAttachmentNode().detachChild(rearHemisphereGeometry);	
						
						// Creates new mesh.		
						float apexAngle = (float) getTopologyNode().getFieldOfViewAngle();
						float minRadius = (float) getTopologyNode().getRange().getMinimumDistance();
						float maxRadius = (float) getTopologyNode().getRange().getMaximumDistance();
						
						Mesh truncatedConeMesh = JME3FovUtilities.createTruncatedCone(apexAngle, minRadius, maxRadius, 36);
						truncatedConeGeometry = new Geometry("Sides", truncatedConeMesh);
						truncatedConeGeometry.setMaterial(createMaterial());		
					
						
						Mesh frontHemisphereMesh = JME3PrimitivesUtilities.createSphericalCap(maxRadius, (float) (Math.toRadians(90.0) - apexAngle / 2.0), (float) Math.toRadians(90.0), 36);	
						frontHemisphereGeometry = new Geometry("Front", frontHemisphereMesh);
						frontHemisphereGeometry.setMaterial(createMaterial());
						
						Mesh rearHemisphereMesh = JME3PrimitivesUtilities.createSphericalCap(minRadius, (float) (Math.toRadians(90.0) - apexAngle / 2.0), (float) Math.toRadians(90.0), 36);	
						rearHemisphereGeometry = new Geometry("Rear", rearHemisphereMesh);
						rearHemisphereGeometry.setMaterial(createMaterial());
								
						// Attaches new geometries.
						getAttachmentNode().attachChild(truncatedConeGeometry);
						getAttachmentNode().attachChild(frontHemisphereGeometry);
						getAttachmentNode().attachChild(rearHemisphereGeometry);
						
						// Sets the presentation mode.
						internalSetPresentationMode(meshPresentationMode);											
						
						getAttachmentNode().addControl(getConicalFieldOfViewImageProjectorControl());
						
						return null;
					}
				});																							
				return Status.OK_STATUS;
			}
		};
		job.schedule();	
		
	}
	
	private void internalSetPresentationMode(MeshPresentationMode mode)
	{				
		switch (mode.getValue()) 
		{							
			case MeshPresentationMode.SURFACE_VALUE:
				if(truncatedConeGeometry != null)
				{
					truncatedConeGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);	
					truncatedConeGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				if(rearHemisphereGeometry != null)
				{
					rearHemisphereGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);	
					rearHemisphereGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				if(frontHemisphereGeometry != null)
				{
					frontHemisphereGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);	
					frontHemisphereGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				break;
			case MeshPresentationMode.WIREFRAME_VALUE:

				if(truncatedConeGeometry != null)
				{
					truncatedConeGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);	
					truncatedConeGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				if(rearHemisphereGeometry != null)
				{
					rearHemisphereGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);	
					rearHemisphereGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				if(frontHemisphereGeometry != null)
				{
					frontHemisphereGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);	
					frontHemisphereGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
									
				break;
			case MeshPresentationMode.POINTS_VALUE:
				if(truncatedConeGeometry != null)
				{
					truncatedConeGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);	
					truncatedConeGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Points);
				}
				if(rearHemisphereGeometry != null)
				{
					rearHemisphereGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);	
					rearHemisphereGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Points);
				}
				if(frontHemisphereGeometry != null)
				{
					frontHemisphereGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);	
					frontHemisphereGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Points);
				}						
				break;
				
			default:
				break;
		}	
		
	}
	
	
	private Material createMaterial()
	{		
		Material mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");	
		
		if(fovColor != null)
		{
			mat.setColor("Diffuse", fovColor.clone());
			mat.setColor("Ambient", fovColor.clone());
			mat.setColor("Specular", fovColor.clone());
		}		
				
		mat.setFloat("Shininess",64f); 	
		mat.setBoolean("UseMaterialColors",true);    	
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);
		
		return mat;
	}
	
	private Adapter getAdapter() 
	{
		if (adapter == null) 
		{
			adapter = new AdapterImpl() 
			{			
				public void notifyChanged(Notification notification) 
				{
					try 
					{
						if(notification.getNotifier() instanceof ConicalFieldOfView)
						{
							int featureId = notification.getFeatureID(ConicalFieldOfView.class);
							
							switch (featureId) 
							{
								case FovPackage.CONICAL_FIELD_OF_VIEW__FIELD_OF_VIEW_ANGLE:
									updateGeometry();
									
									// Updates the FOV Settings of the projector.
									getConicalFieldOfViewImageProjectorControl().updateProjectorFOVSettings();
									
								break;

								case FovPackage.CONICAL_FIELD_OF_VIEW__RANGE:
									
									if(notification.getOldValue() instanceof DistanceRange)
									{
										DistanceRange oldValue = (DistanceRange) notification.getOldValue();
										oldValue.eAdapters().remove(getAdapter());
									}
									
									if(notification.getNewValue() instanceof DistanceRange)
									{
										DistanceRange newValue = (DistanceRange) notification.getNewValue();
										newValue.eAdapters().add(getAdapter());
									}
									
									// Updates the geometry.
									updateGeometry();	
																		
								default:
								break;
							}							
							
							
						}
						else if(notification.getNotifier() instanceof DistanceRange)
						{
							int featureId = notification.getFeatureID(DistanceRange.class);
							
							switch (featureId) 
							{
								case FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE:
								case FovPackage.DISTANCE_RANGE__MINIMUM_DISTANCE:
									
									// Updates the geometry.
									updateGeometry();
								break;

							default:
								break;
							}
						}						
					} 
					catch (Exception e) 
					{
						Logger.INSTANCE.log(Activator.ID, this, "Error during update of ConicalFieldOfView geometry!", EventSeverity.ERROR, e);
					}
				}
			};
		}

		return adapter;
	}
	
	private ConicalFieldOfViewImageProjectorControl getConicalFieldOfViewImageProjectorControl()
	{
		if(conicalFieldOfViewImageProjectorControl == null)
		{
			conicalFieldOfViewImageProjectorControl = new ConicalFieldOfViewImageProjectorControl(jme3Application, getTopologyNode());
		}
		
		return conicalFieldOfViewImageProjectorControl;
	}
}
