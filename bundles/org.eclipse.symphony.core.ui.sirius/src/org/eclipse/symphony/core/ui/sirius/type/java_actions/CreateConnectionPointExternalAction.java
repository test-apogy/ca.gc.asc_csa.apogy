package org.eclipse.symphony.core.ui.sirius.type.java_actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.symphony.core.ui.sirius.util.ObjIdDescWizard;
import org.eclipse.symphony.core.ui.sirius.util.WizardUtil;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.core.ConnectionPoint;
import org.eclipse.symphony.core.SymphonySystem;

public class CreateConnectionPointExternalAction implements IExternalJavaAction
{
	// Constants used to keep track of the expected parameter names
	private static final String SYMPHONY_SYSTEM_PARAM_STR = "SymphonySystem";
	
	// Constants used to define the default connection point information
	private static final String DEF_CONNECT_POINT_NAME = "NEW_CONNECTION_POINT";
	
	// Constants used for the wizard
	private static final String WIZARD_STR = "Name";
	
	// Get the EClass for ConnectionPoint
	private static final String CONNECTION_POINT_CLASS_STR = "org.eclipse.symphony.core.ConnectionPoint";
	private static final EClass CONNECTION_POINT_ECLASS = Symphony__CommonEMFFacade.INSTANCE.getEClass(CONNECTION_POINT_CLASS_STR);
	
	// Actually execute the external action and create the connection point
	@Override
	public void execute(Collection<? extends EObject> selections,
						Map<String, Object> parameters)
	{
		// If the required parameter is not present
		if (parameters.containsKey(SYMPHONY_SYSTEM_PARAM_STR) == false)
		{
			// Cannot proceed; just return
			return;
		}

		// Extract the parameter from the map
		Object symSys = parameters.get(SYMPHONY_SYSTEM_PARAM_STR);
		
		// If the parameter has the correct type
		if (symSys instanceof SymphonySystem)
		{
			// Cast down
			SymphonySystem symphonySystem = (SymphonySystem) symSys;
			
			// Create a new wizard to select the type for the new node
			ObjIdDescWizard wizard = new ObjIdDescWizard(WIZARD_STR);
			
			// Open up the new wizard and keep track of the result
			int result = WizardUtil.displayWizard(wizard);			
						
			// If the result was not OK
			if (result != Window.OK)
			{
				// Just return
				return;
			}
			
			// Extract the values from the wizard
			String pointName = wizard.getEnteredObjId();
			String pointDesc = wizard.getEnteredDesc();
			
			// If no name was provided
			if (pointName.length() == 0)
			{
				// The name and description for the connection point
				pointName = DEF_CONNECT_POINT_NAME;
			}
			
			// Create a new connection point
			ConnectionPoint connPoint = (ConnectionPoint) CONNECTION_POINT_ECLASS.getEPackage().
															getEFactoryInstance().create(CONNECTION_POINT_ECLASS);
			
			// Set its values accordingly
			connPoint.setName(pointName);
			connPoint.setDescription(pointDesc);
			
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
