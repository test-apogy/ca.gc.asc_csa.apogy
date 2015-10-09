package org.eclipse.symphony.common.topology.ui.jme3.scene_objects;

import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;

import ca.gc.space.topology.PositionNode;

public class PositionNodeJME3SceneObject extends AbstractTransformationJME3SceneObject<PositionNode> {
	
	public PositionNodeJME3SceneObject(PositionNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);				
	}
}
