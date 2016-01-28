package ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects;

import javax.vecmath.Point3d;

import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class ReferencedGroupNodeJM3SceneObject extends DefaultJME3SceneObject<ReferencedGroupNode> {

	private Point3d centroid;

	public ReferencedGroupNodeJM3SceneObject(ReferencedGroupNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);

		centroid = new Point3d(0, 0, 0);

	}

	@Override
	public Point3d getCentroid() {
		return centroid;
	}

}
