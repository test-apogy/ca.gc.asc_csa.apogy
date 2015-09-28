package ca.gc.asc_csa.topology.ui.jme3.scene_objects;

import javax.vecmath.Point3d;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.space.topology.GroupNode;

public class GroupNodeJM3SceneObject extends DefaultJME3SceneObject<GroupNode> {

	private Point3d centroid;

	public GroupNodeJM3SceneObject(GroupNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);

		centroid = new Point3d(0, 0, 0);
	}

	@Override
	public Point3d getCentroid() {
		return centroid;
	}

}
