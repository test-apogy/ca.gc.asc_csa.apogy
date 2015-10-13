package org.eclipse.symphony.addons.mobility.pathplanners.ui.jme3.adapters;

import org.eclipse.symphony.addons.mobility.pathplanners.CircularExclusionZone;
import org.eclipse.symphony.addons.mobility.pathplanners.ui.jme3.scene_objects.CircularExclusionZoneJME3Object;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3SceneObject;

public class CircularExclusionZoneJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) 
	{
		return obj instanceof CircularExclusionZone;
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

			sceneObject = new CircularExclusionZoneJME3Object((CircularExclusionZone) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return CircularExclusionZone.class;
	}

}
