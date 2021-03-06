package ca.gc.asc_csa.apogy.core.ui.sirius.type.java_actions;
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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import ca.gc.asc_csa.apogy.core.ui.sirius.util.ObjIdDescWizard;
import ca.gc.asc_csa.apogy.core.ui.sirius.util.WizardUtil;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.ConnectionPoint;
import ca.gc.asc_csa.apogy.core.ApogySystem;

public class CreateConnectionPointExternalAction implements IExternalJavaAction
{
	// Constants used to keep track of the expected parameter names
	private static final String APOGY_SYSTEM_PARAM_STR = "ApogySystem";
	
	// Constants used to define the default connection point information
	private static final String DEF_CONNECT_POINT_NAME = "NEW_CONNECTION_POINT";
	
	// Constants used for the wizard
	private static final String WIZARD_STR = "Name";
	
	// Get the EClass for ConnectionPoint
	private static final String CONNECTION_POINT_CLASS_STR = "ca.gc.asc_csa.apogy.core.ConnectionPoint";
	private static final EClass CONNECTION_POINT_ECLASS = ApogyCommonEMFFacade.INSTANCE.getEClass(CONNECTION_POINT_CLASS_STR);
	
	// Actually execute the external action and create the connection point
	@Override
	public void execute(Collection<? extends EObject> selections,
						Map<String, Object> parameters)
	{
		// If the required parameter is not present
		if (parameters.containsKey(APOGY_SYSTEM_PARAM_STR) == false)
		{
			// Cannot proceed; just return
			return;
		}

		// Extract the parameter from the map
		Object symSys = parameters.get(APOGY_SYSTEM_PARAM_STR);
		
		// If the parameter has the correct type
		if (symSys instanceof ApogySystem)
		{
			// Cast down
			ApogySystem apogySystem = (ApogySystem) symSys;
			
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
			
			// Add it to the ApogySystem
			apogySystem.getConnectionPointsList().getConnectionPoints().add(connPoint);
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
