package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects;

import com.jme3.math.Vector3f;
import com.jme3.post.SimpleTextureProjector;
import com.jme3.scene.debug.WireFrustum;

public class ProjectorData 
{
	public SimpleTextureProjector projector;
	public WireFrustum frustum;
	public Vector3f[] frustumPoints;
}
