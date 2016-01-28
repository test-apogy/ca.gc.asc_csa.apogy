package ca.gc.asc_csa.apogy.core.environment.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface EarthSurfaceWorksiteSceneObject extends SceneObject {

	 public void setAxisVisible(boolean newAxisVisible);
	
	 public void setAxisLength(double newAxisLength);
	 
	 public void setAzimuthVisible(boolean newAzimuthVisible);
	 
	 public void setElevationLinesVisible(boolean newElevationLinesVisible);
	 
	 public void setAzimuthLinesVisible(boolean newAzimuthLinesVisible);
	 
	 public void setPlaneVisible(boolean newPlaneVisible);
	 
	 public void setPlaneParameters(double newPlaneGridSize, double newPlaneSize);
	
}
