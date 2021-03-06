package ca.gc.asc_csa.apogy.common.topology.ui.internal;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;

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
							case ApogyCommonTopologyPackage.GROUP_NODE__CHILDREN:
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
