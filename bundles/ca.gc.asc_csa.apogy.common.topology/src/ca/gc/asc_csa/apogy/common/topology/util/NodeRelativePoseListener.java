package ca.gc.asc_csa.apogy.common.topology.util;
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

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;

public class NodeRelativePoseListener 
{
	private Adapter adapter = null;
	private List<Node> nodes = new ArrayList<Node>();

	private Node fromNode;
	private Node toNode;
	
	/**
	 * Method called when a change in relative pose is detected. Sub-classes should override this method.
	 * @param newPose The new pose. Can be null if to or from node is null.
	 */
	public void relativePoseChanged(Matrix4d newPose) 
	{		
	}
	
	public Node getFromNode() 
	{
		return fromNode;
	}

	public void setFromNode(Node fromNode) 
	{
		if(this.fromNode != fromNode)
		{
			this.fromNode = fromNode;
			updateNodeList();
			relativePoseChanged(computeNewPose());
		}
	}

	public Node getToNode() 
	{
		return toNode;
	}

	public void setToNode(Node toNode) 
	{
		if(this.toNode != toNode)
		{
			this.toNode = toNode;
			updateNodeList();
			relativePoseChanged(computeNewPose());
		}
	}
	
	/**
	 * Dispose of this NodeRelativePoseListener. 
	 * The adapter is removed from all node and the adapter is then set to null.
	 * Should be called when the NodeRelativePoseListener is no longer needed.
	 */
	public void dispose()
	{
		unregisterAdapter();
		fromNode = null;
		toNode = null;
		adapter = null;
	}
	
	private void updateNodeList()
	{
		// Unregister from previous nodes.
		unregisterAdapter();
		
		// Clears list of nodes.
		nodes.clear();
		
		Node currentNode = fromNode;
		while(currentNode != null)
		{
			if(currentNode instanceof PositionNode || 
			   currentNode instanceof RotationNode)
			{
				if(!nodes.contains(currentNode)) nodes.add(currentNode);
			}
			
			currentNode = currentNode.getParent();
		}
							
		// Gets the lineage of to node.
		currentNode = toNode;
		while(currentNode != null)
		{			
			if(currentNode instanceof PositionNode || 
			   currentNode instanceof RotationNode)
			{
				if(!nodes.contains(currentNode)) nodes.add(currentNode);
			}
			
			currentNode = currentNode.getParent();
		}
		
		// Register to new nodes.
		registerAdapter();		
	}
	
	private void registerAdapter()
	{
		for(Node node : nodes)
		{
			node.eAdapters().add(getAdapter());
		}
	}
	
	private void unregisterAdapter()
	{
		for(Node node : nodes)
		{
			node.eAdapters().remove(getAdapter());
		}
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{								
					if(msg.getNotifier() instanceof TransformNode)
					{			
						int featureId = msg.getFeatureID(TransformNode.class);
						if(featureId == ApogyCommonTopologyPackage.TRANSFORM_NODE__POSITION ||
						   featureId == ApogyCommonTopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX)
						{
							relativePoseChanged(computeNewPose());
						}
						else if(featureId == ApogyCommonTopologyPackage.TRANSFORM_NODE__PARENT)
						{
							updateNodeList();
							relativePoseChanged(computeNewPose());
						}
					}	
					else if(msg.getNotifier() instanceof PositionNode)
					{			
						int featureId = msg.getFeatureID(PositionNode.class);
						if(featureId == ApogyCommonTopologyPackage.POSITION_NODE__POSITION)
						{
							relativePoseChanged(computeNewPose());
						}
						else if(featureId == ApogyCommonTopologyPackage.POSITION_NODE__PARENT)
						{
							updateNodeList();
							relativePoseChanged(computeNewPose());
						}
					}					
					else if(msg.getNotifier() instanceof RotationNode)
					{			
						int featureId = msg.getFeatureID(RotationNode.class);
						if(featureId == ApogyCommonTopologyPackage.ROTATION_NODE__ROTATION_MATRIX)
						{
							relativePoseChanged(computeNewPose());
						}
						else if(featureId == ApogyCommonTopologyPackage.ROTATION_NODE__PARENT)
						{
							updateNodeList();
							relativePoseChanged(computeNewPose());
						}
					}											
				}
			};
		}
		return adapter;
	}
	
	protected Matrix4d computeNewPose()
	{
		if(fromNode != null && toNode != null)
		{
			return ApogyCommonTopologyFacade.INSTANCE.expressInFrame(fromNode, toNode);
		}
		else
		{
			return null;
		}
	}
}
