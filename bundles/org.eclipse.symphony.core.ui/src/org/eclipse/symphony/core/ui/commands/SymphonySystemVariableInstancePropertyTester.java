package org.eclipse.symphony.core.ui.commands;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.symphony.core.SymphonySystemApiAdapter;
import org.eclipse.symphony.core.invocator.AbstractTypeImplementation;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.invocator.VariableImplementation;

public class SymphonySystemVariableInstancePropertyTester extends PropertyTester {
	
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) 
	{
		Variable variable = (Variable) receiver;		
		if(property.equals("instanceOfSymphonySystem"))
		{
			boolean result = false;
			
			AbstractTypeImplementation ati = EMFEcoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
			if(ati instanceof VariableImplementation)
			{
				VariableImplementation va = (VariableImplementation) ati;			
				if(va.getAdapterInstance() instanceof SymphonySystemApiAdapter)
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
