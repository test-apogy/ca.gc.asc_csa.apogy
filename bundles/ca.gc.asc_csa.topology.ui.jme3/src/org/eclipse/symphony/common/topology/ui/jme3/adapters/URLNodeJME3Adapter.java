package org.eclipse.symphony.common.topology.ui.jme3.adapters;

import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.URLNodeJME3TopologyObject;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.URLNode;

public class URLNodeJME3Adapter implements JME3Adapter {

	@Override
	public Class<?> getAdaptedClass() {
		return URLNode.class;
	}

	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) {

		URLNodeJME3TopologyObject jme3Object = null;
		if (isAdapterFor(obj)) {

			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException(
						"Context must be a JME3RenderEngineDelegate.");
			}

			jme3Object = new URLNodeJME3TopologyObject((URLNode) obj, (JME3RenderEngineDelegate) context);
		}
		return jme3Object;
	}

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof URLNode;
	}

}
