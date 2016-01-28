package ca.gc.asc_csa.apogy.common.topology.ui.jme3.internal;

import java.lang.ref.WeakReference;

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3SceneObject;

import com.jme3.scene.Geometry;

public class SceneGraphObjectPredicate
		implements
		org.apache.commons.collections4.Predicate<WeakReference<NodePresentation>> {

	private Object sceneGraphObject;

	public SceneGraphObjectPredicate(Object sceneGraphObject) {
		this.sceneGraphObject = sceneGraphObject;
	}

	@Override
	public boolean evaluate(WeakReference<NodePresentation> np) 
	{
		boolean matches = false;

		matches = np != null && np.get() != null;

		if (matches) {

			matches = np.get().getSceneObject() instanceof JME3SceneObject;

			if (matches) 
			{
				JME3SceneObject jme3SceneObject = (JME3SceneObject) np.get().getSceneObject();

				for (Geometry shape : jme3SceneObject.getGeometries()) 
				{
					matches = shape == sceneGraphObject;
					if (matches) 
					{
						break;
					}
				}
			}
		}

		return matches;
	}

}
