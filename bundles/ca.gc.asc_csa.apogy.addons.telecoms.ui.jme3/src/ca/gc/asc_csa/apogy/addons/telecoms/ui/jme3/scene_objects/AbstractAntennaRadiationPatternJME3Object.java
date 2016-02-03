package ca.gc.asc_csa.apogy.addons.telecoms.ui.jme3.scene_objects;
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
import ca.gc.asc_csa.apogy.addons.telecoms.AbstractAntennaRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.ui.AbstractAntennaRadiationPatternSceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.util.BufferUtils;

public class AbstractAntennaRadiationPatternJME3Object extends DefaultJME3SceneObject<AbstractAntennaRadiationPattern> implements AbstractAntennaRadiationPatternSceneObject
{
	private boolean useShading = true;
	private boolean updatingGeometry = false;
	private AssetManager assetManager;	
	private Geometry radiationPatternGeometry = null;
	private com.jme3.scene.Mesh jme3mMesh = null;
	// private MeshPresentationMode meshPresentationMode = MeshPresentationMode.SURFACE;
	
	private ColorRGBA meshColor = getDefaultMeshColor();
		
	public AbstractAntennaRadiationPatternJME3Object(AbstractAntennaRadiationPattern abstractAntennaRadiationPattern, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(abstractAntennaRadiationPattern, jme3RenderEngineDelegate);	
		
		if (abstractAntennaRadiationPattern == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
		
		this.assetManager = jme3Application.getAssetManager();
		
		
		// Updates the geometry.
		Job job = new Job("AbstractAntennaRadiationPatternJME3Object : Updating Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{					
				// Creates the new mesh.
				final Mesh newMesh = createMesh(abstractAntennaRadiationPattern);
				
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{					
						updateGeometryInternal(newMesh);													
						return null;
					}
				});
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(radiationPatternGeometry);
		return geometries;				
	}
	
	@Override
	public void dispose() 
	{
		super.dispose();
	}
	
	/**
	 * Updates geometry. NOT THREAD SAFE.
	 */
	private void updateGeometryInternal(final Mesh newMesh)
	{	
		try
		{
			if(!updatingGeometry)
			{
				updatingGeometry = true;
				
				// Detach previous geometry if required.
				if(radiationPatternGeometry != null)
				{
					getAttachmentNode().detachChild(radiationPatternGeometry);						
				}
				
				jme3mMesh = newMesh;
				
				// Updates the mesh if applicable.
				if(jme3mMesh != null)
				{
					if(getTopologyNode().getNodeId() != null)
					{
						radiationPatternGeometry = new Geometry(getTopologyNode().getNodeId(), jme3mMesh);
					}
					else
					{
						radiationPatternGeometry = new Geometry("AbstractAntennaRadiationPattern", jme3mMesh);
					}
									
					radiationPatternGeometry.setMaterial(createMaterial());
					radiationPatternGeometry.setShadowMode(ShadowMode.CastAndReceive);				
					
					getAttachmentNode().attachChild(radiationPatternGeometry);
				}
				
				updatingGeometry = false;
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	private Material createMaterial()
	{
		Material mat = null;		
		
		if(useShading)
		{	
			mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");				
		
			if(meshColor != null)
			{
				mat.setColor("Diffuse", meshColor);
				mat.setColor("Ambient", meshColor);
				mat.setColor("Specular", meshColor);
			}		
					
			mat.setFloat("Shininess",64f); 	
			mat.setBoolean("UseMaterialColors",true);  							
		}
		else
		{
			mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");
			if(meshColor != null)
			{
				mat.setColor("Color", meshColor);
			}
		}		
			
		return mat;
	}
	
	private com.jme3.scene.Mesh createMesh(AbstractAntennaRadiationPattern abstractAntennaRadiationPattern)
	{		
		List<Vector3f> verticeList = new ArrayList<Vector3f>();
		
		double thetaIncrement = Math.toRadians(10);
		double phiIncrement = Math.toRadians(10);
		
		double theta = 0;
		while(theta <= Math.PI)
		{
			double phi = -Math.PI;
			while(phi <= Math.PI)
			{								
				double gain = abstractAntennaRadiationPattern.computeGain(theta, phi);	
				double r = Math.pow(10, gain / 10.0);	
				
				float x = (float)(r * Math.sin(theta) * Math.cos(phi));
				float y = (float)(r * Math.sin(theta) * Math.sin(phi));
				float z = (float)(r * Math.cos(theta));
														
				Vector3f v = new Vector3f(x, y, z);								
				verticeList.add(v);		
				
				phi += phiIncrement;
			}
			
			theta += thetaIncrement;
		}
		
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Points);			
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticeList)));
//		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 3, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));
//		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Normal, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(normalslList)));
//		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.TexCoord, 2, BufferUtils.createFloatBuffer(textureCoordArray));			
		mesh.updateBound();
		mesh.updateCounts();
		
		return mesh;
	}
	
	private ColorRGBA getDefaultMeshColor()
	{
//		ColorRGBA rgba = null;
//		
//		IPreferenceStore store = ca.gc.asc_csa.apogy.common.geometry.data3d.ui.Activator.getDefault().getPreferenceStore();
//		
//		// Change color.
//		RGB rgb = PreferenceConverter.getColor(store, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR_ID);
//		
//		if(rgb != null)
//		{
//			rgba = JME3Utilities.convertToColorRGBA(rgb);
//		}
//		else
//		{
//			rgba = new ColorRGBA(1.0f, 0f, 0.0f, 1.0f);
//		}
//		
//		return rgba;
		
		return new ColorRGBA(1.0f, 1.0f, 1.0f, 1.0f);
	}
}
