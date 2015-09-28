package ca.gc.space.mrt.sensors.range.ui.scene_objects;

import ca.gc.space.topology.ui.SceneObject;

public interface SimpleSonarSceneObject extends SceneObject 
{		
	public boolean isDetectedRangeVisible();

	public void setDetectedRangeVisible(boolean detectedRangeVisible);
}
