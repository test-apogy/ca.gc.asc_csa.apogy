package ca.gc.asc_csa.symphony.tools.vehicle.ui.jme3.adapters;

import ca.gc.asc_csa.symphony.tools.vehicle.PathPlannerToolNode;
import ca.gc.asc_csa.symphony.tools.vehicle.ui.jme3.scene_objects.PathPlannerToolNodeJME3Object;
import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;

public class PathPlannerToolNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof PathPlannerToolNode;
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

			sceneObject = new PathPlannerToolNodeJME3Object((PathPlannerToolNode) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return PathPlannerToolNode.class;
	}

}
