package ca.gc.asc_csa.apogy.core.ui.commands;

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
