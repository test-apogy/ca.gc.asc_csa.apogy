package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface CircularExclusionZoneSceneObject extends SceneObject {

	public void setRadius(float radius);
	
	public float getRadius();
	
	public void setHeight(double height);
	
	public double getHeight();
	
	public MeshPresentationMode getPresentationMode();

	public void setPresentationMode(MeshPresentationMode presentationMode);
}
