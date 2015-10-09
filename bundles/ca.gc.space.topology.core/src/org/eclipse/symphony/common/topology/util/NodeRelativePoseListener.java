package org.eclipse.symphony.common.topology.util;

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.TransformNode;

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
						if(featureId == TopologyPackage.TRANSFORM_NODE__POSITION ||
						   featureId == TopologyPackage.TRANSFORM_NODE__ROTATION_MATRIX)
						{
							relativePoseChanged(computeNewPose());
						}
						else if(featureId == TopologyPackage.TRANSFORM_NODE__PARENT)
						{
							updateNodeList();
							relativePoseChanged(computeNewPose());
						}
					}	
					else if(msg.getNotifier() instanceof PositionNode)
					{			
						int featureId = msg.getFeatureID(PositionNode.class);
						if(featureId == TopologyPackage.POSITION_NODE__POSITION)
						{
							relativePoseChanged(computeNewPose());
						}
						else if(featureId == TopologyPackage.POSITION_NODE__PARENT)
						{
							updateNodeList();
							relativePoseChanged(computeNewPose());
						}
					}					
					else if(msg.getNotifier() instanceof RotationNode)
					{			
						int featureId = msg.getFeatureID(RotationNode.class);
						if(featureId == TopologyPackage.ROTATION_NODE__ROTATION_MATRIX)
						{
							relativePoseChanged(computeNewPose());
						}
						else if(featureId == TopologyPackage.ROTATION_NODE__PARENT)
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
			return TopologyFacade.INSTANCE.expressInFrame(fromNode, toNode);
		}
		else
		{
			return null;
		}
	}
}
