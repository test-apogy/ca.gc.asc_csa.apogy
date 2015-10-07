package ca.gc.asc_csa.symphony.environment.ui.jme3.adapters;

import org.eclipse.symphony.core.FeatureOfInterestNode;

import ca.gc.asc_csa.symphony.environment.ui.jme3.scene_objects.FeatureOfInterestNodeJME3Object;
import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;

public class FeatureOfInterestNodeJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof FeatureOfInterestNode;
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

			sceneObject = new FeatureOfInterestNodeJME3Object((FeatureOfInterestNode) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return FeatureOfInterestNode.class;
	}

}
