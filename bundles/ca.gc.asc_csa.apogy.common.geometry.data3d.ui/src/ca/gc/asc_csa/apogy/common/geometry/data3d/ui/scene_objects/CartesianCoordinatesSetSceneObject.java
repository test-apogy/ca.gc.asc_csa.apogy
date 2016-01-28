package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface CartesianCoordinatesSetSceneObject extends SceneObject {

	public CartesianCoordinatesSet getPoints();

	public void setPointSize(int pointSize);

}
