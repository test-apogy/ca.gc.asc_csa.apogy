package org.eclipse.symphony.addons.sensors.pose.ui.scene_objects;

import ca.gc.space.topology.ui.SceneObject;

public interface OrientationSensorSceneObject extends SceneObject 
{		
	public boolean isFrameVisible();

	public void setFrameVisible(boolean frameVisible);
}
