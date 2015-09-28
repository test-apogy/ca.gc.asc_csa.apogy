package ca.gc.space.topology.ui.adapters;

import ca.gc.space.topology.ui.MeshPresentationMode;
import ca.gc.space.topology.ui.SceneObject;

public interface URLNodeSceneObject extends SceneObject {

	public void setAxisVisible(boolean visible);

	public void setAxisLength(double length);
	
	public void setPresentationMode(MeshPresentationMode mode);
}
