package org.eclipse.symphony.common.topology.ui.adapters;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface URLNodeSceneObject extends SceneObject {

	public void setAxisVisible(boolean visible);

	public void setAxisLength(double length);
	
	public void setPresentationMode(MeshPresentationMode mode);
}
