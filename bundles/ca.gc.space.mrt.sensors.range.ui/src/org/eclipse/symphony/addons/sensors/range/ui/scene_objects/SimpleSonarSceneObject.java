package org.eclipse.symphony.addons.sensors.range.ui.scene_objects;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface SimpleSonarSceneObject extends SceneObject 
{		
	public boolean isDetectedRangeVisible();

	public void setDetectedRangeVisible(boolean detectedRangeVisible);
}
