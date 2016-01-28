package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.SceneObject;

public interface ImageSnapshotSceneObject extends SceneObject 
{		
	public MeshPresentationMode getPresentationMode();

	public void setPresentationMode(MeshPresentationMode presentationMode);
	
	public boolean isImageProjectionEnabled();
	
	public void setImageProjectionEnabled(boolean enabled);
	
	public boolean isImageProjectionOnFOVEnabled();
	
	public void setImageProjectionOnFOVEnabled(boolean enabled);
	
}
