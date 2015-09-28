package ca.gc.space.mrt.geometry.data3d.ui.scene_objects;

import ca.gc.space.mrt.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.space.topology.ui.SceneObject;

public interface CartesianCoordinatesSetSceneObject extends SceneObject {

	public CartesianCoordinatesSet getPoints();

	public void setPointSize(int pointSize);

}
