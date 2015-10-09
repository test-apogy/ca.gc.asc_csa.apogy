package org.eclipse.symphony.addons.vehicle.ui.jme3.adapters;

import org.eclipse.symphony.addons.vehicle.Wheel;
import org.eclipse.symphony.addons.vehicle.ui.jme3.scene_objects.WheelJME3Object;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;

public class WheelJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof Wheel;
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

			sceneObject = new WheelJME3Object((Wheel) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return Wheel.class;
	}

}
