package ca.gc.space.mrt.sensors.pose.ui.scene_objects;

import ca.gc.space.topology.ui.SceneObject;

public interface PositionSensorSceneObject extends SceneObject 
{		
	public boolean isFrameVisible();

	public void setFrameVisible(boolean frameVisible);
}
