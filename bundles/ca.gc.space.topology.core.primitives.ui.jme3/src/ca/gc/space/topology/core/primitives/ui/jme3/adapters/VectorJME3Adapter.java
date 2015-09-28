package ca.gc.space.topology.core.primitives.ui.jme3.adapters;

import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.core.primitives.Vector;
import ca.gc.space.topology.core.primitives.ui.jme3.scene_objects.VectorJME3SceneObject;

public class VectorJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof Vector;
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
			
			sceneObject = new VectorJME3SceneObject((Vector) obj, (JME3RenderEngineDelegate) context);
		}
		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return Vector.class;
	}

}
