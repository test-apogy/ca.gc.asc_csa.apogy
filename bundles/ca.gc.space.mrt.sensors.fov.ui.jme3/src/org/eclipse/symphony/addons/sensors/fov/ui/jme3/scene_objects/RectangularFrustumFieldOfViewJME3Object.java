package org.eclipse.symphony.addons.sensors.fov.ui.jme3.scene_objects;

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
import org.eclipse.symphony.addons.sensors.fov.ui.jme3.Activator;
import org.eclipse.symphony.addons.sensors.fov.ui.jme3.utils.AbstractFieldOfViewImageProjectorControl;
import org.eclipse.symphony.addons.sensors.fov.ui.jme3.utils.JME3FovUtilities;
import org.eclipse.symphony.addons.sensors.fov.ui.jme3.utils.RectangularFrustrumFieldOfViewImageProjectorControl;
import org.eclipse.symphony.addons.sensors.fov.ui.scene_objects.RectangularFrustrumFieldOfViewSceneObject;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;
import ca.gc.space.mrt.sensors.fov.DistanceRange;
import ca.gc.space.mrt.sensors.fov.FovPackage;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.topology.ui.MeshPresentationMode;

import com.jme3.asset.AssetManager;
import com.jme3.asset.plugins.FileLocator;
import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;

public class RectangularFrustumFieldOfViewJME3Object extends AbstractFieldOfViewJME3Object<RectangularFrustrumFieldOfView> implements RectangularFrustrumFieldOfViewSceneObject
{		
	public static ColorRGBA DEFAULT_CIRCULAR_SECTOR_FOV_COLOR = new ColorRGBA(0f, 1f, 0.0f, 1.0f);
	public static float DEFAULT_ANGLE_INCREMENT = (float) Math.toRadians(10.0);
	
	private MeshPresentationMode meshPresentationMode = MeshPresentationMode.WIREFRAME;
	
	private Adapter fovAdapter;
	private Adapter rangeAdapter;
	
	private AssetManager assetManager;	
	private Geometry fovGeometry = null;		
		
	// Projective textures	
	private RectangularFrustrumFieldOfViewImageProjectorControl rectangularFrustrumFieldOfViewImageProjectorControl;
	
	public RectangularFrustumFieldOfViewJME3Object(RectangularFrustrumFieldOfView node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);
	
		assetManager = jme3Application.getAssetManager();
		assetManager.registerLocator("/", FileLocator.class);				
		
		Job job = new Job("RectangularFrustumFieldOfViewJME3Object") 
		{			
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{									
				updateGeometry();									
				
				// Listens for change on the RectangularFrustrumFieldOfView.
				node.eAdapters().add(getFOVAdapter());		
				if(node.getRange() != null)
				{
					node.getRange().eAdapters().add(getRangeAdapter());
				}
	
				return Status.OK_STATUS;
			}
		};
		job.schedule();														
	}
	
	@Override
	public void dispose() 
	{
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getFOVAdapter());
			
			if(getTopologyNode().getRange() != null)
			{
				getTopologyNode().getRange().eAdapters().remove(getRangeAdapter());
			}
		}
		
		if(rectangularFrustrumFieldOfViewImageProjectorControl != null)
		{
			rectangularFrustrumFieldOfViewImageProjectorControl.dispose();
			rectangularFrustrumFieldOfViewImageProjectorControl = null;
		}
		
		super.dispose();
	}

	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(fovGeometry);
		return geometries;
	}
	
	
	@Override
	public void setColor(RGB rgb) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Set Color <" + rgb + ")", EventSeverity.OK);
		super.setColor(rgb);		
		try
		{						
			if(fovGeometry != null)
			{								
				final Material mat = createMaterial();
				mat.setColor("Diffuse", fovColor);
				mat.setColor("Ambient", fovColor);
				mat.setColor("Specular", fovColor);	
				
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{
						fovGeometry.setMaterial(mat);
						return null;
					}
				});
			}
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to set color to <" + rgb + ">!", EventSeverity.ERROR, t);
		}
	}
	
	@Override
	public void setPresentationMode(MeshPresentationMode mode) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "setPresentationMode(" + mode + ").", EventSeverity.INFO);
				
		this.meshPresentationMode = mode;
		
		if(fovGeometry != null && fovGeometry.getMaterial() != null)
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
	}

	@Override
	public void setShowProjection(final boolean showProjection) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "setShowProjection(" + showProjection + ")", EventSeverity.INFO);
		
		// Set the image projector enablement.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				getRectangularFrustrumFieldOfViewImageProjectorControl().setEnabled(showProjection);
				return null;
			}
		});
				
		this.showProjection = showProjection;
	}
	
	@Override
	public void setShowOutlineOnly(boolean showOutlineOnly) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AbstractFieldOfViewImageProjectorControl<RectangularFrustrumFieldOfView> getAbstractFieldOfViewImageProjectorControl() 
	{	
		return getRectangularFrustrumFieldOfViewImageProjectorControl();
	}
	
	private void internalSetPresentationMode(MeshPresentationMode mode)
	{
		if(fovGeometry != null && fovGeometry.getMesh() != null)
		{
			Mesh mesh = fovGeometry.getMesh();
			switch (mode.getValue()) 
			{							
				case MeshPresentationMode.SURFACE_VALUE:
					fovGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Triangles);
					break;
				case MeshPresentationMode.WIREFRAME_VALUE:
					fovGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Triangles);
					break;
				case MeshPresentationMode.POINTS_VALUE:
					fovGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Points);					
					break;
					
				default:
					break;
			}	
		}
	}
	
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				// Removes previous geometry if applicable.
				if(fovGeometry != null)
				{
					getAttachmentNode().detachChild(fovGeometry);			
				}
						
				int numberOfDivision = 5;

				if(getTopologyNode().getHorizontalFieldOfViewAngle() > 5*DEFAULT_ANGLE_INCREMENT)
				{
					numberOfDivision = (int) Math.round(getTopologyNode().getHorizontalFieldOfViewAngle() / DEFAULT_ANGLE_INCREMENT);
				}
				else
				{
					numberOfDivision = 5;
				}

				
				Mesh mesh = JME3FovUtilities.createRectangularFrustum(getTopologyNode(), numberOfDivision, numberOfDivision);				
				
				// Creates new geometry.
				if(getTopologyNode().getNodeId() != null) fovGeometry = new Geometry(getTopologyNode().getNodeId(), mesh);
				else fovGeometry = new Geometry("?", mesh);		
				fovGeometry.setMaterial(createMaterial());
				
				// Attaches new geometry.
				getAttachmentNode().attachChild(fovGeometry);														
				
				// Sets the presentation mode.
				internalSetPresentationMode(meshPresentationMode);											
										
				getAttachmentNode().addControl(getRectangularFrustrumFieldOfViewImageProjectorControl());
				
				return null;
			}
		});	
				
	}	
	
	private Material createMaterial()
	{
		Material mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");	
		
		if(getColor() != null)
		{
			mat.setColor("Diffuse", JME3Utilities.convertToColorRGBA(getColor()));
			mat.setColor("Ambient", JME3Utilities.convertToColorRGBA(getColor()));
			mat.setColor("Specular", JME3Utilities.convertToColorRGBA(getColor()));
		}
		else
		{
			mat.setColor("Diffuse", DEFAULT_CIRCULAR_SECTOR_FOV_COLOR.clone());
			mat.setColor("Ambient", DEFAULT_CIRCULAR_SECTOR_FOV_COLOR.clone());
			mat.setColor("Specular", DEFAULT_CIRCULAR_SECTOR_FOV_COLOR.clone());
		}
				
		mat.setFloat("Shininess",64f); 	
		mat.setBoolean("UseMaterialColors",true);    	
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);
		
		return mat;
	}
			
	private Adapter getFOVAdapter()
	{
		if (fovAdapter == null)
		{
			fovAdapter = new AdapterImpl()
			{
				public void notifyChanged(Notification notification)
				{
					if(notification.getNotifier() instanceof RectangularFrustrumFieldOfView)
					{
						int featureId = notification.getFeatureID(RectangularFrustrumFieldOfView.class);
						
						if (featureId == FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE || 
							featureId == FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE)
						{
							updateGeometry();
							
							// Updates the FOV Settings of the projector.
							getRectangularFrustrumFieldOfViewImageProjectorControl().updateProjectorFOVSettings();
						} 					
						else if(featureId == FovPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE)
						{
							if(notification.getOldValue() instanceof DistanceRange)
							{
								DistanceRange oldDistanceRange = (DistanceRange) notification.getOldValue();
								oldDistanceRange.eAdapters().remove(getRangeAdapter());
							}
							
							updateGeometry();
							
							if(notification.getNewValue() instanceof DistanceRange)
							{
								DistanceRange newDistanceRange = (DistanceRange) notification.getNewValue();
																						
								// Add adapter to the new range.
								newDistanceRange.eAdapters().add(getRangeAdapter());
							}						
						}
					}
				}
			};
		}

		return fovAdapter;
	}
	
	private Adapter getRangeAdapter()
	{
		if (rangeAdapter == null)
		{
			rangeAdapter = new AdapterImpl()
			{			
				public void notifyChanged(Notification notification)
				{
					if(notification.getNotifier() instanceof DistanceRange)
					{
						int featureId = notification.getFeatureID(DistanceRange.class);
						if (featureId == FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE || 
							featureId == FovPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE )
						{
							updateGeometry();
						} 
					}
											
				}
			};
		}

		return rangeAdapter;
	}
	
	private RectangularFrustrumFieldOfViewImageProjectorControl getRectangularFrustrumFieldOfViewImageProjectorControl()
	{
		if(rectangularFrustrumFieldOfViewImageProjectorControl == null)
		{
			rectangularFrustrumFieldOfViewImageProjectorControl = new RectangularFrustrumFieldOfViewImageProjectorControl(jme3Application, getTopologyNode());
		}
		
		return rectangularFrustrumFieldOfViewImageProjectorControl;
	}
}
