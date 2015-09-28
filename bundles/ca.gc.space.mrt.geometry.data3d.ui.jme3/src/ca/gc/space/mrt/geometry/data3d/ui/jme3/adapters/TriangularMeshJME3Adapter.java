package ca.gc.space.mrt.geometry.data3d.ui.jme3.adapters;

import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.mrt.geometry.data3d.CartesianTriangularMesh;
import ca.gc.space.mrt.geometry.data3d.ui.jme3.scene_objects.TriangularMeshJM3SceneObject;
import ca.gc.space.topology.ContentNode;
import ca.gc.space.topology.Node;

public class TriangularMeshJME3Adapter implements JME3Adapter {

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
						
			sceneObject = new TriangularMeshJM3SceneObject(cNode, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() 
	{
		return CartesianTriangularMesh.class;
	}

}
