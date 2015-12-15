package org.eclipse.symphony.core.ui.sirius.topology.java_actions;


import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.window.Window;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.symphony.core.ui.sirius.util.NameDescWizard;
import org.eclipse.symphony.core.ui.sirius.util.WizardUtil;
import org.eclipse.symphony.core.ui.sirius.util.topology.NodeClassWizard;
import org.eclipse.symphony.core.TopologyRoot;
import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.topology.Node;

public class CreateNodeExternalAction implements IExternalJavaAction
{
	private final static String PARENT_NODE_PARAM_STR = "ParentNode";
	private final static String TARGET_CLASS_PARAM_STR = "TargetClass";
	private final static String NO_OF_INSTS_PARAM_STR = "NumInsts";
	
	@Override
	public void execute(Collection<? extends EObject> selections,
						Map<String, Object> parameters)
	{
		// If there are no parameters with the correct names
		if ((parameters.containsKey(PARENT_NODE_PARAM_STR) == false) ||
			(parameters.containsKey(TARGET_CLASS_PARAM_STR) == false) ||
			(parameters.containsKey(NO_OF_INSTS_PARAM_STR) == false))
		{
			// Just return
			return;
		}
		
		// Extract the parameters
		Object parentObj = parameters.get(PARENT_NODE_PARAM_STR);
		Object klassObj = parameters.get(TARGET_CLASS_PARAM_STR);
		Object noOfInstsObj = parameters.get(NO_OF_INSTS_PARAM_STR);
		
		// Used to keep track of the class parameter
		EClass klass = null;
		
		// If the given class parameter was not actually a
		// EClass
		if ((klassObj instanceof EClass) == false)
		{
			// Create a new wizard to select the type for the new node
			NodeClassWizard wizard = new NodeClassWizard();
			
			// Display the wizard and keep track of the result
			int result = WizardUtil.displayWizard(wizard);

			// If the result was not OK 
			if (result != Window.OK)
			{
				// Just return
				return;
			}
			
			// Get the selected node class from the wizard
			klass = wizard.getSelectedNodeClass();
		}
		// Otherwise
		else
		{
			// Cast down
			klass = (EClass) klassObj;
		}
		
		// If the given class parameter is actually a class
		// and the number of instances is actually an int
		if (noOfInstsObj instanceof Integer)
		{
			// Cast down
			int noOfInsts = ((Integer) noOfInstsObj).intValue();
			
			// If the desired parent is the topology root
			if (parentObj instanceof TopologyRoot)
			{
				// Cast down
				TopologyRoot parent = (TopologyRoot) parentObj;
			
				// Create a node
				Node newNode = makeNode(klass, noOfInsts);
				
				// If there is no origin node
				if (parent.getOriginNode() == null)
				{					
					// Just set it accordingly
					parent.setOriginNode(newNode);
					newNode.setParent(null);
				}
				// Otherwise, there is one
				else
				{
					// Get the origin node
					Node originNode = parent.getOriginNode();
					
					// If the newly created node is a group node
					if (newNode instanceof GroupNode)
					{
						// Cast down
						GroupNode newGroupNode = (GroupNode) newNode;
						
						// Make the current origin node a child of this group node
						newGroupNode.getChildren().add(originNode);
						originNode.setParent(newGroupNode);
						
						// Make this group node the new origin node
						newGroupNode.setParent(null);
						parent.setOriginNode(newGroupNode);
					}
					// Otherwise, it can't take children
					else
					{
						// If the origin node can take children
						if (originNode instanceof GroupNode)
						{
							// Cast down
							GroupNode originGroupNode = (GroupNode) originNode;
							
							// Just add the new node as a child of this
							newNode.setParent(originGroupNode);
							originGroupNode.getChildren().add(newNode);
						}
					}
				}
			}
			// Else if the desired parent is a (group) node
			else if (parentObj instanceof GroupNode)
			{
				// Cast down
				GroupNode parentGroupNode = (GroupNode) parentObj;
				
				// Create a node
				Node newNode = makeNode(klass, noOfInsts);
				
				// Just add it as a child of this parent
				newNode.setParent(parentGroupNode);
				parentGroupNode.getChildren().add(newNode);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections)
	{
		// Assume yes; actual logic will be handled in execute()
		return true;
	}

	private Node makeNode(EClass klass, int numberOfInsts)
	{
		// Create and return an object of the desired type
		Node newNode = (Node) klass.getEPackage().getEFactoryInstance().create(klass);
		
		// Create the name/desc wizard
		NameDescWizard wizard = new NameDescWizard();
		
		// Open it up and keep track of the result
		int result = WizardUtil.displayWizard(wizard);
		
		// Keep track of the node's name / description
		String newId = "";
		String newDesc = "";
		
		// If there was a name / desc entered
		if (result == Window.OK)
		{
			newId = wizard.getEnteredName();
			newDesc = wizard.getEnteredDesc();
		}
		// Otherwise, there wasn't one provided
		else
		{		
			for (int i = 0; i < klass.getName().length(); i++)
			{
				// Get the current char from the class name
				char c = klass.getName().charAt(i);
			
				// If the character is upper-case and it's not the first character
				if (Character.isUpperCase(c) &&	i != 0)
				{
					// Add an underscore to separate the words
					newId += '_';
				}
			
				// Add an upper-case version of this character
				newId += Character.toUpperCase(c);
			}
		
			// Complete the new id
			newId = "NEW_" + newId + "_" + Integer.toString(numberOfInsts);
		}
		
		// Set the node's id and description accordingly
		newNode.setNodeId(newId);
		newNode.setDescription(newDesc);
		
		// Return the new node
		return newNode;
	}
}
