package ca.gc.asc_csa.symphony.core.ui.commands;

import org.eclipse.core.expressions.PropertyTester;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableImplementation;
import ca.gc.asc_csa.symphony.core.SymphonySystemApiAdapter;

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
