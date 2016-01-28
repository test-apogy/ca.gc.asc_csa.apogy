package ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects;

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;

public class DefaultNodeJME3SceneObject extends DefaultJME3SceneObject<Node> 
{
	public DefaultNodeJME3SceneObject(Node topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);		
	}
}
