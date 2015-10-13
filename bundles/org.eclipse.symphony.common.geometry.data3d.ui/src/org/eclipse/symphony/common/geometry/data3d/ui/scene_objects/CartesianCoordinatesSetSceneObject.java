package org.eclipse.symphony.common.geometry.data3d.ui.scene_objects;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface CartesianCoordinatesSetSceneObject extends SceneObject {

	public CartesianCoordinatesSet getPoints();

	public void setPointSize(int pointSize);

}
