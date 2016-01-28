package ca.gc.asc_csa.apogy.core.ui.sirius.topology.java_actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

public class DeleteNodeExternalAction implements IExternalJavaAction
{
	private static final String NODE_PARAM_STR = "Node";
	private static final String CONTAINER_PARAM_STR = "Container";
	
	@Override
	public void execute(Collection<? extends EObject> selections,
						Map<String, Object> parameters)
	{
		// If the required parameters are not present
		if ((parameters.containsKey(NODE_PARAM_STR) == false) ||
			(parameters.containsKey(CONTAINER_PARAM_STR) == false))
		{
			// Just return
			return;
		}

		// Extract the required parameters
		Object obj = parameters.get(NODE_PARAM_STR);
		Object container = parameters.get(CONTAINER_PARAM_STR);
		
		// If the variables are of the correct types
		if (obj instanceof Node &&
			container instanceof ApogySystem)
		{
			// Cast down
			Node node = (Node) obj;
			TopologyRoot root = ((ApogySystem)container).getTopologyRoot();
			
			// If the node to delete is the root of the topology
			if (node == root.getOriginNode())
			{
				// If this node could have children
				if (node instanceof GroupNode)
				{
					// Cast down
					GroupNode gNode = (GroupNode) node;
					
					// If there are children
					if (gNode.getChildren().size() > 0)
					{
						GroupNode childGroupNode = null;
						
						// Go through the children
						for (Node child : gNode.getChildren())
						{
							// If one of them can have children
							if (child instanceof GroupNode)
							{
								// Keep track of this new parent
								childGroupNode = (GroupNode) child;
								break;
							}
						}
						
						// If there was a child node that can have children
						if (childGroupNode != null)
						{
							// Get a copy of the list of children
							// to avoid ConcurrentModificationExceptions
							BasicEList<Node> childrenCopy = new BasicEList<Node>(gNode.getChildren());
							
							// Go through the children
							for (Node child : childrenCopy)
							{
								// If not the child with the children
								if (child != childGroupNode)
								{
									childGroupNode.getChildren().add(child);
									child.setParent(childGroupNode);
								}
							}
							
							// Change the origin node
							root.setOriginNode(childGroupNode);
							childGroupNode.setParent(null);
							gNode.getChildren().clear();
						}
						// Otherwise, there is no viable candidate
						else
						{
							// Just remove it from the topology root
							root.setOriginNode(null);
							gNode.getChildren().clear();
						}
					}
					// Otherwise, there are no children
					else
					{
						// Just remove it from the topology root
						root.setOriginNode(null);
					}
				}
				// Otherwise, it doesn't have children
				else
				{
					// Just remove it from the topology root
					root.setOriginNode(null);
				}
			}
			// Otherwise, the node to delete is not at the top of the topology
			else
			{
				// Get the node's parent
				GroupNode parentNode = (GroupNode) node.getParent();
				
				// If the node could have children
				if (node instanceof GroupNode)
				{
					// Cast down
					GroupNode gNode = (GroupNode) node;
					
					// If the node has children
					if (gNode.getChildren().size() > 0)
					{
						// Get a copy of the list of children
						// to avoid ConcurrentModificationExceptions
						BasicEList<Node> childrenCopy = new BasicEList<Node>(gNode.getChildren());
						
						// Go through all of the children
						for (Node child : childrenCopy)
						{
							// Move this child to the parent
							parentNode.getChildren().add(child);
						}
						
						// Clear the node's children list
						gNode.getChildren().clear();
					}

					// Remove the links between the parent and this node
					parentNode.getChildren().remove(gNode);
					gNode.setParent(null);
				}
				// Otherwise, it can't have children
				else
				{
					// Remove the links between the parent and this node
					parentNode.getChildren().remove(node);
					node.setParent(null);
				}
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections)
	{
		// Assume this to be true; specific logic will be implemented in
		// execute()
		return true;
	}

}
