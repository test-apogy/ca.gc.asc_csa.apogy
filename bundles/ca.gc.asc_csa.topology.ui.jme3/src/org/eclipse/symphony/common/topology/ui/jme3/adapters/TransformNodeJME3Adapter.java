package org.eclipse.symphony.common.topology.ui.jme3.adapters;

import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.TransformNodeJME3SceneObject;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.TransformNode;

public class TransformNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof TransformNode;
	}

	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) {
		
		JME3SceneObject sceneObject = null;
		
		if (isAdapterFor(obj)) 
		{
			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException("Context must be a JME3RenderEngineDelegate");
			}
			
			sceneObject = new TransformNodeJME3SceneObject((TransformNode) obj, (JME3RenderEngineDelegate) context);
		}
		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return TransformNode.class;
	}

}
