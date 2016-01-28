package org.eclipse.symphony.addons.geometry.paths.ui;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface WayPointPathSceneObject extends SceneObject 
{
	public void setPointSize(int pointSize);
	
	public int getPointSize();
	
	public void setEndPointsRadius(float endPointsRadius);
	
	public float getEndPointsRadius();
	
	public void setPathPresentationMode(PathPresentationMode mode);
	
	public PathPresentationMode getPathPresentationMode();
}