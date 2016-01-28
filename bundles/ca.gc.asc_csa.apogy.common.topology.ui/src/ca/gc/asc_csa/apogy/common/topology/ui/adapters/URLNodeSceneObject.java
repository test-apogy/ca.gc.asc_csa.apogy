package ca.gc.asc_csa.apogy.common.topology.ui.adapters;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface URLNodeSceneObject extends SceneObject {

	public void setAxisVisible(boolean visible);

	public void setAxisLength(double length);
	
	public void setPresentationMode(MeshPresentationMode mode);
}
