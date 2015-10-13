package org.eclipse.symphony.common.topology.ui.jme3.scene_objects;

import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class TransformNodeJME3SceneObject extends AbstractTransformationJME3SceneObject<TransformNode> {
	
	public TransformNodeJME3SceneObject(TransformNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);				
	}
}
