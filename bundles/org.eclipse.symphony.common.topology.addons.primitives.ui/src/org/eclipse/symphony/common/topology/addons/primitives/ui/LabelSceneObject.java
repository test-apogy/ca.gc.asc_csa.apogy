package org.eclipse.symphony.common.topology.addons.primitives.ui;

import org.eclipse.symphony.common.topology.addons.primitives.Label;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface LabelSceneObject extends SceneObject {

	public void setText(String text);

	public String getText();

	public Label getLabel();

	public void setLabel(Label label);
}
