package ca.gc.space.mrt.sensors.imaging.ui;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface ImageSnapshotSceneObject extends SceneObject 
{		
	public MeshPresentationMode getPresentationMode();

	public void setPresentationMode(MeshPresentationMode presentationMode);
	
	public boolean isImageProjectionEnabled();
	
	public void setImageProjectionEnabled(boolean enabled);
	
	public boolean isImageProjectionOnFOVEnabled();
	
	public void setImageProjectionOnFOVEnabled(boolean enabled);
	
}
