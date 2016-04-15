package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.adapters;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.scene_objects.CartesianTriangularMeshJM3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

/**
 * JME3 Adapter for ContentNode<CartesianTriangularMesh> nodes.
 * @author pallard
 */
public class CartesianTriangularMeshJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node node) 
	{
		boolean adapterFor = false;

		if (node instanceof ContentNode) 
		{
			ContentNode<?> contentNode = (ContentNode<?>) node;
			if (contentNode.getContent() instanceof CartesianTriangularMesh) 
			{
				adapterFor = true;
			}									
		}
		
		System.err.println("CartesianTriangularMeshJME3Adapter.isAdapterFor() = " + adapterFor);
		
		return adapterFor;
	}

	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) {

		JME3SceneObject sceneObject = null;

		if (isAdapterFor(obj)) 
		{
			
			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException("Context must be a JME3RenderEngineDelegate.");
			}
			
			@SuppressWarnings("unchecked")
			ContentNode<CartesianTriangularMesh> cNode = (ContentNode<CartesianTriangularMesh>) obj;
						
			sceneObject = new CartesianTriangularMeshJM3SceneObject(cNode, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() 
	{
		return CartesianTriangularMesh.class;
	}

}
