package ca.gc.asc_csa.apogy.core.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface ResultNodeSceneObject extends SceneObject
{
	  float getFlagPoleHeight();
	  void setFlagPoleHeight(float value);
	  boolean isFlagVisible();
	  void setFlagVisible(boolean value);
}
