package org.eclipse.symphony.common.topology.ui.jme3.scene_objects;

import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class RotationNodeJME3SceneObject extends AbstractTransformationJME3SceneObject<RotationNode> {
	
	public RotationNodeJME3SceneObject(RotationNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);				
	}
}
