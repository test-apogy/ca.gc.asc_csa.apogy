package ca.gc.space.mrt.geometry.paths.ui;

import ca.gc.space.topology.ui.SceneObject;

public interface WayPointPathSceneObject extends SceneObject 
{
	public void setPointSize(int pointSize);
	
	public int getPointSize();
	
	public void setEndPointsRadius(float endPointsRadius);
	
	public float getEndPointsRadius();
	
	public void setPathPresentationMode(PathPresentationMode mode);
	
	public PathPresentationMode getPathPresentationMode();
	
	
}
