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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

import ca.gc.asc_csa.apogy.common.topology.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ApogyCommonTopologyAddonsPrimitivesPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Vector;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.VectorSceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.util.BufferUtils;

public class VectorJME3SceneObject extends DefaultJME3SceneObject<Vector> implements VectorSceneObject
{	
	private Adapter adapter = null;
	
	private ColorRGBA vectorColor = ColorRGBA.White;
	private AssetManager assetManager;
	private Geometry vectorGeometry = null;	
	
	public VectorJME3SceneObject(Vector topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);
		
		this.assetManager = jme3Application.getAssetManager();
	
		vectorGeometry = createVectorGeometry();
		getAttachmentNode().attachChild(vectorGeometry);
		
		// Listens for changes on the Vector.
		getTopologyNode().eAdapters().add(getAdapter());
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(vectorGeometry);
		return geometries;
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		if(rgb != null)
		{
			vectorColor = JME3Utilities.convertToColorRGBA(rgb);
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{
					try
					{					
						if(vectorGeometry != null)
						{
							Material mat = createVectorMaterial();						 			
							vectorGeometry.setMaterial(mat);
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
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to set color to <" + rgb + ">!", EventSeverity.ERROR);
		}
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
	public int getLineWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setLineWidth(int lineWidth) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initialize() 
	{		
		updateGeometry();
	}
	
	private void updateGeometry()
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{				
				if(vectorGeometry != null) getAttachmentNode().detachChild(vectorGeometry);
								
				// Creates the vector.
				vectorGeometry = createVectorGeometry();
				
				// Attach the new vector.
				getAttachmentNode().attachChild(vectorGeometry);
													
				return null;
			}	
		});		
	}
	
	private Geometry createVectorGeometry()
	{
		// Create the mesh
		Mesh mesh = createVectorMesh();
		
		// Create the Material
		Material material = createVectorMaterial();
		
		// Create Geometry.
		Geometry geometry = new Geometry("Vector Body", mesh);
		geometry.setMaterial(material);
		
		return geometry;
	}
	
	private Mesh createVectorMesh()
	{
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();

		Vector3f p0 = new Vector3f(0, 0, 0);
		Vector3f p1 = new Vector3f((float) getTopologyNode().getEndPoint().x, (float) getTopologyNode().getEndPoint().y, (float) getTopologyNode().getEndPoint().z);
		verticesList.add(p0);
		verticesList.add(p1);
		indexesList.add(verticesList.indexOf(p0));
		indexesList.add(verticesList.indexOf(p1));	
		
		Mesh mesh = new Mesh();
		mesh.setMode(Mesh.Mode.Lines);		
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));								
		mesh.updateBound();
		mesh.updateCounts();
		
		return mesh;
	}
	
	private Material createVectorMaterial()
	{
		Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
		material.setColor("Color", vectorColor.clone());        
        return material;     
	}

	private Adapter getAdapter() 
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof Vector)
					{
						int featureId = msg.getFeatureID(Vector.class);
						switch (featureId) 
						{
							case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__XROTATION:
							case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__YROTATION:
							case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__ZROTATION:
							case ApogyCommonTopologyAddonsPrimitivesPackage.VECTOR__LENGTH:		
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
