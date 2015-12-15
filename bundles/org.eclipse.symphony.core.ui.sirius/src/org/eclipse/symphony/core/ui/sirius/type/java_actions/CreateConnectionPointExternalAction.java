package org.eclipse.symphony.core.ui.sirius.type.java_actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.symphony.core.ui.sirius.util.NameDescWizard;
import org.eclipse.symphony.core.ui.sirius.util.WizardUtil;

import org.eclipse.symphony.common.topology.GroupNode;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.SymphonySystem;

public class CreateConnectionPointExternalAction implements IExternalJavaAction
{
	// Constants used to keep track of the expected parameter names
	private static final String NODE_PARAM_STR = "Node";
	private static final String CONTAINER_PARAM_STR = "Container";
	
	// Constants used to define the default connection point information
	private static final String DEF_CONNECT_POINT_NAME = "NEW_CONNECTION_POINT";
	private static final String DEF_CONNECT_POINT_DESC = "";
	
	// Get the EClass for ConnectionPoint
	private static final String CONNECTION_POINT_CLASS_STR = "org.eclipse.symphony.core.ConnectionPoint";
	private static final EClass CONNECTION_POINT_ECLASS = Symphony__CommonEMFFacade.INSTANCE.getEClass(CONNECTION_POINT_CLASS_STR);
	
	// Actually execute the external action and create the connection point
	@Override
	public void execute(Collection<? extends EObject> selections,
						Map<String, Object> parameters)
	{
		// If the required parameters are not present
		if (parameters.containsKey(NODE_PARAM_STR) == false ||
			parameters.containsKey(CONTAINER_PARAM_STR) == false)
		{
			// Cannot proceed; just return
			return;
		}

		// Extract the parameters from the map
		Object node = parameters.get(NODE_PARAM_STR);
		Object container = parameters.get(CONTAINER_PARAM_STR);
		
		// If the parameters have the correct types
		if (node instanceof GroupNode &&
			container instanceof SymphonySystem)
		{
			// Cast down
			GroupNode topologyNode = (GroupNode) node;
			SymphonySystem symphonySystem = (SymphonySystem) container;
			
			// Create a new wizard to select the type for the new node
			NameDescWizard wizard = new NameDescWizard();
			
			// Open up the new wizard and keep track of the result
			int result = WizardUtil.displayWizard(wizard);			
			
			// The name and description for the connection point
			String pointName = DEF_CONNECT_POINT_NAME;
			String pointDesc = DEF_CONNECT_POINT_DESC;
			
			// If the result was OK
			if (result == Window.OK)
			{
				pointName = wizard.getEnteredName();
				pointDesc = wizard.getEnteredDesc();
			}
			
			// Create a new connection point
			ConnectionPoint connPoint = (ConnectionPoint) CONNECTION_POINT_ECLASS.getEPackage().
															getEFactoryInstance().create(CONNECTION_POINT_ECLASS);
			
			// Set its values accordingly
			connPoint.setName(pointName);
			connPoint.setDescription(pointDesc);
			connPoint.setNode(topologyNode);
			
			// Add it to the SymphonySystem
			symphonySystem.getConnectionPointsList().getConnectionPoints().add(connPoint);
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections)
	{
		// Assume to be true; the specific logic of whether or not it
		// will execute is dependent on the parameters given and as such,
		// it will be handled in execute()
		return true;
	}
}
