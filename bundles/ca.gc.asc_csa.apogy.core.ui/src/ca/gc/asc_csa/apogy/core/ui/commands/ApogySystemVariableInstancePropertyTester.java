package ca.gc.asc_csa.apogy.core.ui.commands;
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

import org.eclipse.core.expressions.PropertyTester;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;

public class ApogySystemVariableInstancePropertyTester extends PropertyTester {
	
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) 
	{
		Variable variable = (Variable) receiver;		
		if(property.equals("instanceOfApogySystem"))
		{
			boolean result = false;
			
			AbstractTypeImplementation ati = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
			if(ati instanceof VariableImplementation)
			{
				VariableImplementation va = (VariableImplementation) ati;			
				if(va.getAdapterInstance() instanceof ApogySystemApiAdapter)
				{		
					result =  true;
				}
			}
			
			return result;
		}
		else
		{
			return false;
		}		
	}

	
	
}
