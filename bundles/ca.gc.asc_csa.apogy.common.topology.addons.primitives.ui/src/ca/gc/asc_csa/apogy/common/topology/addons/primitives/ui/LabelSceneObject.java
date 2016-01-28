package ca.gc.asc_csa.apogy.common.topology.addons.primitives.ui;

import ca.gc.asc_csa.apogy.common.topology.addons.primitives.Label;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface LabelSceneObject extends SceneObject {

	public void setText(String text);

	public String getText();

	public Label getLabel();

	public void setLabel(Label label);
}
