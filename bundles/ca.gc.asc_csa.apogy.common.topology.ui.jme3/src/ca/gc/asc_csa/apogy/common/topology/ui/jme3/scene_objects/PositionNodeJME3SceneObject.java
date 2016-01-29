package ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class PositionNodeJME3SceneObject extends AbstractTransformationJME3SceneObject<PositionNode> {
	
	public PositionNodeJME3SceneObject(PositionNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);				
	}
}
