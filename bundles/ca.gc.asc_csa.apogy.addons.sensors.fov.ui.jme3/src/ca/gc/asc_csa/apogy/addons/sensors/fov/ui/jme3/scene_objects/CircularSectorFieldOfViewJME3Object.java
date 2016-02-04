package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan;
import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils.AbstractFieldOfViewImageProjectorControl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils.CircularSectorFieldOfViewImageProjectorControl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils.JME3FovUtilities;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.scene_objects.CircularSectorFieldOfViewSceneObject;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;

public class CircularSectorFieldOfViewJME3Object extends AbstractFieldOfViewJME3Object<CircularSectorFieldOfView> implements CircularSectorFieldOfViewSceneObject
{		
	public static ColorRGBA DEFAULT_CIRCULAR_SECTOR_FOV_COLOR = new ColorRGBA(0f, 1f, 0.0f, 1.0f);
	public static float DEFAULT_ANGLE_INCREMENT = (float) Math.toRadians(10.0);
	
	private float angleIncrement = DEFAULT_ANGLE_INCREMENT;
	
	private Adapter angularSpanAdapter;
	private Adapter rangeAdapter;
		
	private AssetManager assetManager;	
	private Geometry fovGeometry = null;	
		
	// Projective textures	
	private CircularSectorFieldOfViewImageProjectorControl circularSectorFieldOfViewImageProjectorControl;

	
	public CircularSectorFieldOfViewJME3Object(CircularSectorFieldOfView node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);

		if (node == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
						
		this.assetManager = jme3Application.getAssetManager();
		
		
		Job job = new Job("CircularSectorFieldOfViewJME3Object : Updating Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				// Updates the geometry.
				updateGeometry();
				
				// Listens for change on the CircularSectorFieldOfView.
				node.getAngularSpan().eAdapters().add(getAngularSpanAdapter());
				node.getRange().eAdapters().add(getRangeAdapter());								
				
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
			if(getTopologyNode().getAngularSpan() != null)
			{
				getTopologyNode().getAngularSpan().eAdapters().remove(getAngularSpanAdapter());
			}
			
			if(getTopologyNode().getRange() != null)
			{
				getTopologyNode().getRange().eAdapters().remove(getRangeAdapter());
			}
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
		super.setColor(rgb);
		try
		{			
			if(fovGeometry != null)
			{
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{							
						Material mat = createMaterial();
						mat.setColor("Diffuse", fovColor);
						mat.setColor("Ambient", fovColor);
						mat.setColor("Specular", fovColor);			
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
	public float getAngleIncrement() {		
		return angleIncrement;
	}

	@Override
	public void setAngleIncrement(float angleIncrement) 
	{	
		if(angleIncrement <= 0)
		{
			throw new IllegalArgumentException("Angle increment must be greater than zero !");
		}	
		else
		{
			this.angleIncrement = angleIncrement;
			updateGeometry();
		}
	}

	@Override
	public MeshPresentationMode getPresentationMode() 
	{		
		return meshPresentationMode;
	}
	
	@Override
	public void setPresentationMode(final MeshPresentationMode mode) 
	{			
		Logger.INSTANCE.log(Activator.ID, this, "Setting Presentation Mode to <" + mode + ">...", EventSeverity.INFO);
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
	public void setShowProjection(boolean showProjection) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "setShowProjection(" + showProjection + ")", EventSeverity.INFO);				
		
		// Set the image projector enablement.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				getCircularSectorFieldOfViewImageProjectorControl().setEnabled(showProjection);
				return null;
			}
		});
				
		this.showProjection = showProjection;
	}
	
	@Override
	public float getTransparency() {		
		return transparency;
	}

	@Override
	public void setShowOutlineOnly(boolean showOutlineOnly) 
	{
		// TODO Auto-generated method stub		
	}
	
	@Override
	public AbstractFieldOfViewImageProjectorControl<CircularSectorFieldOfView> getAbstractFieldOfViewImageProjectorControl() 
	{	
		return getCircularSectorFieldOfViewImageProjectorControl();
	}
	
	private void internalSetPresentationMode(final MeshPresentationMode mode)
	{	
		if(fovGeometry != null)
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
		
		meshPresentationMode = mode;
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
				
				// Creates new mesh.		
				double minAngle = getTopologyNode().getAngularSpan().getMinimumAngle();
				double maxAngle = getTopologyNode().getAngularSpan().getMaximumAngle();
				double minRadius = getTopologyNode().getRange().getMinimumDistance();
				double maxRadius = getTopologyNode().getRange().getMaximumDistance();	
				
				int numberOfDivision = (int) Math.round(getTopologyNode().getAngularSpan().getSpanningAngle() / getAngleIncrement());		
				Mesh mesh = JME3FovUtilities.createCircularSector(minAngle, maxAngle, minRadius, maxRadius, numberOfDivision, true);				
				
				// Creates new geometry.
				if(getTopologyNode().getNodeId() != null) fovGeometry = new Geometry("", mesh);
				else fovGeometry = new Geometry("?", mesh);		
				fovGeometry.setMaterial(createMaterial());
				
				// Attaches new geometry.
				getAttachmentNode().attachChild(fovGeometry);
				
				// Updates Presentation mode.
				internalSetPresentationMode(meshPresentationMode);
				
				// Attache image projector control.
				getAttachmentNode().addControl(getCircularSectorFieldOfViewImageProjectorControl());
				
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
	
	private Adapter getAngularSpanAdapter()
	{
		if (angularSpanAdapter == null)
		{
			angularSpanAdapter = new AdapterImpl()
			{
				public void notifyChanged(Notification notification)
				{
					if(notification.getNotifier() instanceof AngularSpan)
					{
						int featureId = notification.getFeatureID(AngularSpan.class);
						
						switch (featureId) 
						{
							case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MAXIMUM_ANGLE:
							case ApogyAddonsSensorsFOVPackage.ANGULAR_SPAN__MINIMUM_ANGLE:							
								
								// Updates Geometry.
								updateGeometry();
								
								// Updates the FOV Settings of the projector.
								getCircularSectorFieldOfViewImageProjectorControl().updateProjectorFOVSettings();
							break;

						default:
							break;
						}
					}										
				}
			};
		}

		return angularSpanAdapter;
	}

	private Adapter getRangeAdapter()
	{
		if (rangeAdapter == null)
		{
			rangeAdapter = new AdapterImpl()
			{				
				public void notifyChanged(Notification notification)
				{					
					if (notification.getFeatureID(CircularSectorFieldOfView.class) == ApogyAddonsSensorsFOVPackage.DISTANCE_RANGE__MAXIMUM_DISTANCE)
					{
						updateGeometry();	
						
						// Updates the FOV Settings of the projector.
						getCircularSectorFieldOfViewImageProjectorControl().updateProjectorFOVSettings();
					} 
					else if (notification.getFeatureID(CircularSectorFieldOfView.class) == ApogyAddonsSensorsFOVPackage.DISTANCE_RANGE__MINIMUM_DISTANCE)
					{
						updateGeometry();
						
						// Updates the FOV Settings of the projector.
						getCircularSectorFieldOfViewImageProjectorControl().updateProjectorFOVSettings();
					}
				}			
			};
		}

		return rangeAdapter;
	}
	
	private CircularSectorFieldOfViewImageProjectorControl getCircularSectorFieldOfViewImageProjectorControl()
	{
		if(circularSectorFieldOfViewImageProjectorControl == null)
		{
			circularSectorFieldOfViewImageProjectorControl = new CircularSectorFieldOfViewImageProjectorControl(jme3Application, getTopologyNode());
		}
		
		return circularSectorFieldOfViewImageProjectorControl;
	}
}
