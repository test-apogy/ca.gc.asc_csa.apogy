package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface TriangularMeshSceneObject extends SceneObject {

	public void setPresentationMode(MeshPresentationMode mode);

	public void setPointSize(int pointSize);

	public void setUseShading(boolean useShading);	
}
