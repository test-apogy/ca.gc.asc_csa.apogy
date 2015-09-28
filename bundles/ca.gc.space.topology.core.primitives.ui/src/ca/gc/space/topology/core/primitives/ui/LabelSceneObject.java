package ca.gc.space.topology.core.primitives.ui;

import ca.gc.space.topology.core.primitives.Label;
import ca.gc.space.topology.ui.SceneObject;

public interface LabelSceneObject extends SceneObject {

	public void setText(String text);

	public String getText();

	public Label getLabel();

	public void setLabel(Label label);
}
