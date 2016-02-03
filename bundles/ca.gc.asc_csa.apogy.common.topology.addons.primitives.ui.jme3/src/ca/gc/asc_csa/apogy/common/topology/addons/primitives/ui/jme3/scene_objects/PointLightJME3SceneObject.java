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

import java.util.concurrent.Callable;

import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.light.PointLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

public class PointLightJME3SceneObject extends DefaultJME3SceneObject<ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight> 
{
	public static float DEFAULT_POINT_LIGHT_RADIUS = 1000.0f;
		
	@SuppressWarnings("unused")
	private AssetManager assetManager;
	
	private PointLight pointLight;
	
	public PointLightJME3SceneObject(ca.gc.asc_csa.apogy.common.topology.addons.primitives.PointLight topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);
														
		this.assetManager = jme3Application.getAssetManager();
		
		updateGeometry();
	}

	private void updateGeometry()
	{
		Job job = new Job("PointLightJME3SceneObject : Updating Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{				
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{	
						if(pointLight == null)
						{
							getAttachmentNode().addLight(getPointLight());
						}
						return null;
					}
				});
				return Status.OK_STATUS;
			}
		};
		job.schedule();	
		
	}
	
	private PointLight getPointLight()
	{
		if(pointLight == null)
		{
			pointLight = new PointLight();
			pointLight.setColor(ColorRGBA.White);
			pointLight.setRadius(DEFAULT_POINT_LIGHT_RADIUS);
			
			Vector3f lightPosition = new Vector3f();
			if(getTopologyNode() != null)
			{
				Matrix4d m = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(getTopologyNode());
				Vector3d position = new Vector3d();
				m.get(position);
								
				lightPosition = new Vector3f((float) position.x, (float) position.y, (float) position.z);
			}
			pointLight.setPosition(lightPosition);	
			
			if(getTopologyNode().getNodeId() != null) pointLight.setName(getTopologyNode().getNodeId());
		}
		
		return pointLight;
	}	
}
