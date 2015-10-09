package ca.gc.space.mrt.mobility.pathplanners.ui.scene_objects;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;

import ca.gc.space.topology.ui.SceneObject;

public interface CircularExclusionZoneSceneObject extends SceneObject {

	public void setRadius(float radius);
	
	public float getRadius();
	
	public void setHeight(double height);
	
	public double getHeight();
	
	public MeshPresentationMode getPresentationMode();

	public void setPresentationMode(MeshPresentationMode presentationMode);
}
