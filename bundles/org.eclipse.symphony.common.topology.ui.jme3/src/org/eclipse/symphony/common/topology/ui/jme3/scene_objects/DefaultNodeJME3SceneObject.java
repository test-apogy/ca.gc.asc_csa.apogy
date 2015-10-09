package org.eclipse.symphony.common.topology.ui.jme3.scene_objects;

import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;

import ca.gc.space.topology.Node;

public class DefaultNodeJME3SceneObject extends DefaultJME3SceneObject<Node> 
{
	public DefaultNodeJME3SceneObject(Node topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);		
	}
}
