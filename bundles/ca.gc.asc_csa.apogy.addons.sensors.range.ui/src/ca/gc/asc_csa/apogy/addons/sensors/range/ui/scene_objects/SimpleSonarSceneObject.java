package ca.gc.asc_csa.apogy.addons.sensors.range.ui.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface SimpleSonarSceneObject extends SceneObject 
{		
	public boolean isDetectedRangeVisible();

	public void setDetectedRangeVisible(boolean detectedRangeVisible);
}
