package org.eclipse.symphony.common.topology.addons.primitives.ui;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface VectorSceneObject extends SceneObject {
	public int getLineWidth();

	public void setLineWidth(int lineWidth);

	public void initialize();
}
