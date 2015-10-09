package org.eclipse.symphony.common.topology.ui.jme3.adapters;

import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.ReferencedGroupNodeJM3SceneObject;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ReferencedGroupNode;

public class ReferencedGroupNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) 
	{
		return obj instanceof ReferencedGroupNode;
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
			
			sceneObject = new ReferencedGroupNodeJM3SceneObject((ReferencedGroupNode) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ReferencedGroupNode.class;
	}

}
