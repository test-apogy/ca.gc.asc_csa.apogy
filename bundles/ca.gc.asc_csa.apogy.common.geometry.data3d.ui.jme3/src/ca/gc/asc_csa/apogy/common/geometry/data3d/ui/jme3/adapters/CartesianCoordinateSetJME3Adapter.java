package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.adapters;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.scene_objects.CartesianCoordinatesSetJME3Object;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

public class CartesianCoordinateSetJME3Adapter implements JME3Adapter 
{

	public CartesianCoordinateSetJME3Adapter() {
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) 
	{

		JME3SceneObject object = null;

		if (isAdapterFor(obj)) 
		{
			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException("Context must be a JME3RenderEngineDelegate.");
			}
			
			ContentNode<CartesianCoordinatesSet> cNode = (ContentNode<CartesianCoordinatesSet>) obj;
			object = new CartesianCoordinatesSetJME3Object<CartesianCoordinatesSet>(cNode, (JME3RenderEngineDelegate) context);
		}

		return object;
	}

	@Override
	public boolean isAdapterFor(Node obj) {

		boolean matches = false;

		System.out.println("CartesianCoordinateSetJME3Adapter.isAdapterFor(" + obj + ")");
		
		if (obj instanceof ContentNode) 
		{
			ContentNode<?> node = (ContentNode<?>) obj;
			matches = node.getContent() instanceof CartesianCoordinatesSet;
		}		

		return matches;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CartesianCoordinatesSet.class;
	}
}
