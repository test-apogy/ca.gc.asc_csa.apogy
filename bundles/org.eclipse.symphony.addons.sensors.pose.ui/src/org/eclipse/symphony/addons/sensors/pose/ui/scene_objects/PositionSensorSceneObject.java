package org.eclipse.symphony.addons.sensors.pose.ui.scene_objects;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface PositionSensorSceneObject extends SceneObject 
{		
	public boolean isFrameVisible();

	public void setFrameVisible(boolean frameVisible);
}
