package ca.gc.space.mrt.sensors.fov.ui.jme3.adapters;

import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import ca.gc.space.mrt.sensors.fov.ui.jme3.scene_objects.ConicalFieldOfViewJME3Object;
import ca.gc.space.topology.Node;

public class ConicalFieldOfViewJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof ConicalFieldOfView;
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

			sceneObject = new ConicalFieldOfViewJME3Object((ConicalFieldOfView) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ConicalFieldOfView.class;
	}

}
