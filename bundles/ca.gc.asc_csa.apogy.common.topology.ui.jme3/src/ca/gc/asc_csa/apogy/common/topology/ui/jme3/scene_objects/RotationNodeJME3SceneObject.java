package ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class RotationNodeJME3SceneObject extends AbstractTransformationJME3SceneObject<RotationNode> {
	
	public RotationNodeJME3SceneObject(RotationNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);				
	}
}
