package org.eclipse.symphony.common.geometry.data3d.ui.scene_objects;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface TriangularMeshSceneObject extends SceneObject {

	public void setPresentationMode(MeshPresentationMode mode);

	public void setPointSize(int pointSize);

	public void setUseShading(boolean useShading);	
}
