package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface VectorSceneObject extends SceneObject {
	public int getLineWidth();

	public void setLineWidth(int lineWidth);

	public void initialize();
}
