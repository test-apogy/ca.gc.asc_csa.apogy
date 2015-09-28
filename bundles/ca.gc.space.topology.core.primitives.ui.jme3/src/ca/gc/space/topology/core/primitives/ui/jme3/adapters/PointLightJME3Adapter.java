package ca.gc.space.topology.core.primitives.ui.jme3.adapters;

import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.core.primitives.ui.jme3.scene_objects.PointLightJME3SceneObject;

public class PointLightJME3Adapter implements JME3Adapter 
{
	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof ca.gc.space.topology.core.primitives.PointLight;
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
			
			sceneObject = new PointLightJME3SceneObject((ca.gc.space.topology.core.primitives.PointLight) obj, (JME3RenderEngineDelegate) context);
		}
		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ca.gc.space.topology.core.primitives.PointLight.class;
	}

}
