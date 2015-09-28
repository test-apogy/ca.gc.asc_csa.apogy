package ca.gc.space.topology.core.primitives.ui;

import ca.gc.space.topology.ui.SceneObject;

public interface VectorSceneObject extends SceneObject {
	public int getLineWidth();

	public void setLineWidth(int lineWidth);

	public void initialize();
}
