package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.jme3.scene_objects;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.scene_objects.CircularExclusionZoneSceneObject;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.shape.Cylinder;

public class CircularExclusionZoneJME3Object extends DefaultJME3SceneObject<CircularExclusionZone> implements CircularExclusionZoneSceneObject
{		
	private Adapter adapter;
	private float radius = 1.0f;
	private float height = 1.0f;
	
	private MeshPresentationMode meshPresentationMode = MeshPresentationMode.WIREFRAME; 
	private Geometry geometry;
	
	private ColorRGBA circularExclusionZone = ColorRGBA.Red;
				
	public CircularExclusionZoneJME3Object(CircularExclusionZone node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);

		if (node == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
				
		jme3Application.getAssetManager();
		
		// Call this on viewer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				createGeometry();	
				getTopologyNode().eAdapters().add(CircularExclusionZoneJME3Object.this.getAdapter());
				
				return null;
			}
		});						
	}
	
	@Override
	public void dispose() 
	{
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getAdapter());
		}
		
		super.dispose();
	}	
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(geometry);		
		return geometries;
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		this.circularExclusionZone = JME3Utilities.convertToColorRGBA(rgb);
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				try
				{			
					if(geometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Color", circularExclusionZone.clone());		
						geometry.setMaterial(mat);
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
	public void setRadius(float radius) 
	{			
		this.radius = radius;
		
		updateGeometry();
	}

	@Override
	public float getRadius() 
	{
		return radius;
	}

	@Override
	public void setHeight(double height) 
	{
		this.height = (float) height;
		
		updateGeometry();		
	}

	@Override
	public double getHeight() {		
		return height;
	}

	@Override
	public MeshPresentationMode getPresentationMode() 
	{
		return meshPresentationMode;
	}

	@Override
	public void setPresentationMode(MeshPresentationMode presentationMode) 
	{
		this.meshPresentationMode = presentationMode;
		
		if(geometry != null && geometry.getMaterial() != null)
		{
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{	
					switch (presentationMode.getValue()) 
					{
						case MeshPresentationMode.SURFACE_VALUE:
							geometry.getMaterial().getAdditionalRenderState().setWireframe(false);
							if(geometry.getMesh() != null) geometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
							break;
						case MeshPresentationMode.WIREFRAME_VALUE:
							geometry.getMaterial().getAdditionalRenderState().setWireframe(true);
							if(geometry.getMesh() != null) geometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Lines);
							break;
						case MeshPresentationMode.POINTS_VALUE:
							geometry.getMaterial().getAdditionalRenderState().setWireframe(false);
							if(geometry.getMesh() != null) geometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Points);					
							break;
							
						default:
							break;
					}					
					
					return null;
				}
			});
		}
		
	}
	
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{										
				if(geometry != null) getAttachmentNode().detachChild(geometry);
				
				// Create new geometry
				geometry = createCylinderGeometry();
				getAttachmentNode().attachChild(geometry);
				
				return null;
			}	
		});		
	}	
	
	private void createGeometry()
	{
		geometry = createCylinderGeometry();
		getAttachmentNode().attachChild(geometry);		
	}
	
	private Geometry createCylinderGeometry()
	{
		Mesh mesh = createMesh();				
		Geometry geometry = new Geometry("Exclusion Zone", mesh);
		geometry.setMaterial(createMaterial());				
		return geometry;		
	}
	
	private Mesh createMesh()
	{
		Cylinder cylinder = new Cylinder(4, 10, radius, height, false);			
		return cylinder;
	}
	
	private Material createMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", circularExclusionZone.clone());		
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
					if(notification.getNotifier() instanceof CircularExclusionZone)
					{
						int featureId = notification.getFeatureID(CircularExclusionZone.class);
						
						switch (featureId) 
						{
							case ApogyAddonsMobilityPathplannersPackage.CIRCULAR_EXCLUSION_ZONE__RADIUS:
								 updateGeometry();
							break;

							default:
							break;
						}						
					}
				}
			};
		}
		return adapter;
	}


}
