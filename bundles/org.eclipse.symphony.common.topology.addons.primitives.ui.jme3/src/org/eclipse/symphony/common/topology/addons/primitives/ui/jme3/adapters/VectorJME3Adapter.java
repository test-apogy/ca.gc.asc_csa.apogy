package org.eclipse.symphony.common.topology.addons.primitives.ui.jme3.adapters;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.addons.primitives.Vector;
import org.eclipse.symphony.common.topology.addons.primitives.ui.jme3.scene_objects.VectorJME3SceneObject;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;

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
