package ca.gc.asc_csa.symphony.tools.telecoms.ui.jme3.adapters;

import ca.gc.asc_csa.symphony.tools.telecoms.AbstractAntennaRadiationPattern;
import ca.gc.asc_csa.symphony.tools.telecoms.ui.jme3.scene_objects.AbstractAntennaRadiationPatternJME3Object;
import ca.gc.asc_csa.topology.ui.jme3.JME3Adapter;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.topology.Node;

public class AbstractAntennaRadiationPatternJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof AbstractAntennaRadiationPattern;
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

			sceneObject = new AbstractAntennaRadiationPatternJME3Object((AbstractAntennaRadiationPattern) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return AbstractAntennaRadiationPattern.class;
	}

}
