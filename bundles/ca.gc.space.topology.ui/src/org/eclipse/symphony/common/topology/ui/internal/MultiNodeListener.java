package org.eclipse.symphony.common.topology.ui.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;

public class MultiNodeListener 
{
	private Adapter nodeAdapter = null;
	private List<Node> registeredNodes = new ArrayList<Node>();
	
	public void registerNode(Node node)
	{	
		if(node != null && !registeredNodes.contains(node))
		{
			registeredNodes.add(node);
			node.eAdapters().add(getNodeAdapter());
		}
	}
	
	public void unregisterNode(Node node)
	{
		if(node != null && registeredNodes.contains(node))
		{
			registeredNodes.remove(node);
			node.eAdapters().remove(getNodeAdapter());
		}
	}	
	
	protected Adapter getNodeAdapter() 
	{
		if(nodeAdapter == null)
		{
			nodeAdapter = new AdapterImpl()
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof GroupNode)
					{
						GroupNode parent = (GroupNode) msg.getNotifier();
						
						int featureId = msg.getFeatureID(GraphicsContext.class);
						switch (featureId) 
						{
							case TopologyPackage.GROUP_NODE__CHILDREN:
							{
								int eventType = msg.getEventType();
								switch (eventType) 
								{
									case Notification.ADD:
									{
										if(msg.getNewValue() instanceof Node)
										{
											Node node = (Node) msg.getNewValue();
											nodeAdded(parent, node);
										}
									}	
									break;
									
									case Notification.ADD_MANY:
										List<Node> nodesAdded = (List<Node>) msg.getNewValue();
										nodesAdded(parent, nodesAdded);
									break;
									
									case Notification.REMOVE:

										if(msg.getOldValue() instanceof Node)
										{
											Node node = (Node) msg.getOldValue();
											nodeRemoved(parent, node);
										}
									break;
									
									case Notification.REMOVE_MANY:
										List<Node> nodesRemoved = (List<Node>) msg.getOldValue();
										nodesRemoved(parent, nodesRemoved);
									break;

									default:
									break;
								}
							}
							break;

							default:
							break;
						}
					}
				}
			};
		}
		
		return nodeAdapter;
	}
	
	protected void nodeAdded(GroupNode parent, Node nodeAdded)
	{
		
	}
	
	protected void nodeRemoved(GroupNode parent, Node nodeRemoved)
	{
		
	}
	
	protected void nodesAdded(GroupNode parent, List<Node> nodesAdded)
	{
		
	}
	
	protected void nodesRemoved(GroupNode parent, List<Node> nodesRemoved)
	{
		
	}
}
