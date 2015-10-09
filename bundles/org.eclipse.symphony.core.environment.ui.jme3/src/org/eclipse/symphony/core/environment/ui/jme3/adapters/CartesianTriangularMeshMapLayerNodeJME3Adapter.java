package org.eclipse.symphony.core.environment.ui.jme3.adapters;

import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayerNode;
import org.eclipse.symphony.core.environment.ui.jme3.scene_objects.CartesianTriangularMeshMapLayerNodeJM3SceneObject;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;

public class CartesianTriangularMeshMapLayerNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof CartesianTriangularMeshMapLayerNode;
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

			sceneObject = new CartesianTriangularMeshMapLayerNodeJM3SceneObject((CartesianTriangularMeshMapLayerNode) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CartesianTriangularMeshMapLayerNode.class;
	}

}
