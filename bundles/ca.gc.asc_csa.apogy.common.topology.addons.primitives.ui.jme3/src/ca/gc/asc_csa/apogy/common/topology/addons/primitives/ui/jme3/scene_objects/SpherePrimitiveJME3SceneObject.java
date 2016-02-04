package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3.scene_objects;
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
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3.Activator;

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.SpherePrimitive;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Sphere;

public class SpherePrimitiveJME3SceneObject extends DefaultJME3SceneObject<SpherePrimitive> 
{
	public static int Z_SAMPLES = 100;
	public static int RADIAL_SAMPLES = 36;
	
	private Adapter sphereAdapter;
	
	private Sphere sphere = null;
	private Geometry sphereGeometry = null;
	
	private AssetManager assetManager;
	
	public SpherePrimitiveJME3SceneObject(SpherePrimitive topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);
		
		this.assetManager = jme3Application.getAssetManager();
		
		Job job = new Job("SpherePrimitiveJME3SceneObject : Initialize Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{	
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{
						getAttachmentNode().attachChild(sphereGeometry);	
						return null;
					}
				});
				return Status.OK_STATUS;
			}
		};
		job.schedule();	
		
		
				
		topologyNode.eAdapters().add(getSphereAdapter());									
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(sphereGeometry);
		return geometries;
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				try
				{					
					if(sphereGeometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Diffuse", JME3Utilities.convertToColorRGBA(rgb));
						mat.setColor("Ambient", JME3Utilities.convertToColorRGBA(rgb));
						mat.setColor("Specular", JME3Utilities.convertToColorRGBA(rgb)); 			
						sphereGeometry.setMaterial(mat);
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
	
	private Sphere getSphere()
	{
		if(sphere == null)
		{
			sphere = new Sphere(Z_SAMPLES, RADIAL_SAMPLES, (float) getTopologyNode().getRadius());
		}
		
		return sphere;
	}
	
	private void updateGeometry(float newRadius)
	{
		Job job = new Job("CircularSectorFieldOfViewJME3Object : Updating Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{	
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{
						getSphere().updateGeometry(Z_SAMPLES, RADIAL_SAMPLES, newRadius);
						return null;
					}
				});
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
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
			mat.setColor("Diffuse", ColorRGBA.White);
			mat.setColor("Ambient", ColorRGBA.White);
			mat.setColor("Specular",ColorRGBA.White);
		}
				
		mat.setFloat("Shininess",64f); 	
		mat.setBoolean("UseMaterialColors",true);    		
		
		return mat;
	}
	
	private Adapter getSphereAdapter() 
	{
		if (sphereAdapter == null) 
		{
			sphereAdapter = new Adapter() 
			{				
				@Override
				public Notifier getTarget() 
				{
					return null;
				}

				@Override
				public boolean isAdapterForType(Object type) 
				{
					return false;
				}

				@Override
				public void notifyChanged(Notification notification) 
				{
					if (notification.getFeatureID(SpherePrimitive.class) == ApogyCommonTopologyAddonsPrimitivesPackage.SPHERE_PRIMITIVE__RADIUS) 
					{
						float newRadius = (float) notification.getNewDoubleValue();						
						updateGeometry(newRadius);
					}
				}

				@Override
				public void setTarget(Notifier newTarget) 
				{
				}

			};
		}

		return sphereAdapter;
	}
	
	
}
