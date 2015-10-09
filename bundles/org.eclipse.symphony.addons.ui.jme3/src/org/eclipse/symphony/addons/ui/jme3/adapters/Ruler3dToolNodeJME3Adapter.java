package org.eclipse.symphony.addons.ui.jme3.adapters;

import org.eclipse.symphony.addons.Ruler3dToolNode;
import org.eclipse.symphony.addons.ui.jme3.scene_objects.Ruler3dToolNodeJME3Object;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;

public class Ruler3dToolNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof Ruler3dToolNode;
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

			sceneObject = new Ruler3dToolNodeJME3Object((Ruler3dToolNode) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return Ruler3dToolNode.class;
	}

}
