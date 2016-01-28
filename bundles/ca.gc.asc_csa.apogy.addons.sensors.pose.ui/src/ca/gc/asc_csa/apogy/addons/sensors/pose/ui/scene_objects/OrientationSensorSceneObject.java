package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface OrientationSensorSceneObject extends SceneObject 
{		
	public boolean isFrameVisible();

	public void setFrameVisible(boolean frameVisible);
}
