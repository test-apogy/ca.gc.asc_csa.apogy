package ca.gc.space.mrt.sensors.imaging.ui.jme3.adapters;

import org.eclipse.symphony.common.topology.ui.jme3.JME3Adapter;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3SceneObject;
import ca.gc.space.mrt.sensors.imaging.ImageSnapshot;
import ca.gc.space.mrt.sensors.imaging.ui.jme3.scene_objects.ImageSnapshotJME3Object;
import ca.gc.space.topology.Node;

public class ImageSnapshotJME3Adapter implements JME3Adapter {

	@Override
	public boolean isAdapterFor(Node obj) {
		return obj instanceof ImageSnapshot;
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

			sceneObject = new ImageSnapshotJME3Object((ImageSnapshot) obj, (JME3RenderEngineDelegate) context);
		}

		return sceneObject;
	}

	@Override
	public Class<?> getAdaptedClass() {
		return ImageSnapshot.class;
	}

}
