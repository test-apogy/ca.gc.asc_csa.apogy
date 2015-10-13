package org.eclipse.symphony.addons.ui.jme3.adapters;

import org.eclipse.symphony.addons.SunVector3DToolNode;
import org.eclipse.symphony.addons.ui.jme3.scene_objects.SunVector3DToolNodeJME3Object;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;

public class SunVector3DToolNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof SunVector3DToolNode;
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

			sceneObject = new SunVector3DToolNodeJME3Object((SunVector3DToolNode) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return SunVector3DToolNode.class;
	}

}
