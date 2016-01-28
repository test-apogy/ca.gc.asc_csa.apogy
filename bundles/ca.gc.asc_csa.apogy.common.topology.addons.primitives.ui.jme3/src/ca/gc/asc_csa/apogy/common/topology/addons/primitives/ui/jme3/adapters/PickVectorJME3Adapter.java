package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3.adapters;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.PickVector;
import ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui.jme3.scene_objects.PickVectorJME3SceneObject;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

public class PickVectorJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof PickVector;
	}

	@Override
	public JME3SceneObject getAdapter(Node obj, Object context) {
		
		JME3SceneObject sceneObject = null;
		
		if (isAdapterFor(obj)) 
		{
			// Context should be an Application
			if (!(context instanceof JME3RenderEngineDelegate)) 
			{
				throw new IllegalArgumentException("Context must be a JME3RenderEngineDelegate");
			}
			
			sceneObject = new PickVectorJME3SceneObject((PickVector) obj, (JME3RenderEngineDelegate) context);
		}
		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return PickVector.class;
	}

}
