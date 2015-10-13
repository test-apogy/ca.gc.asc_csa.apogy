package org.eclipse.symphony.addons.sensors.fov.ui.scene_objects;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;

import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface FieldOfViewSceneObject extends SceneObject 
{
	public MeshPresentationMode getPresentationMode();
	public void setPresentationMode(MeshPresentationMode presentationMode);
	
	public void setTransparency(float transparency);
	public float getTransparency();
			
	public void setShowOutlineOnly(boolean showOutlineOnly);	
	public boolean isShowOutlineOnly();
	
	public void setShowProjection(boolean showProjection);	
	public boolean isShowProjection();
	
	public void setProjectionColor(RGB color);
	public RGB getProjectionColor();
}
