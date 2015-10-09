package ca.gc.space.mrt.sensors.range.ui.scene_objects;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.SceneObject;

public interface RasterScanDataSceneObject extends SceneObject 
{		
	public boolean isFovVisible();

	public void setFovVisible(boolean fovVisible);
	
	public boolean isDataVisible();

	public void setDataVisible(boolean dataVisible);
	
	public MeshPresentationMode getFovMeshPresentationMode();

	public void setFovMeshPresentationMode(MeshPresentationMode fovMeshPresentationMode);
}
