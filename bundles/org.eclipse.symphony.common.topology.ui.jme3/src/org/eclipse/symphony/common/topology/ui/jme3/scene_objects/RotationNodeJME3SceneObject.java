package org.eclipse.symphony.common.topology.ui.jme3.scene_objects;

import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;

import ca.gc.space.topology.RotationNode;

public class RotationNodeJME3SceneObject extends AbstractTransformationJME3SceneObject<RotationNode> {
	
	public RotationNodeJME3SceneObject(RotationNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);				
	}
}