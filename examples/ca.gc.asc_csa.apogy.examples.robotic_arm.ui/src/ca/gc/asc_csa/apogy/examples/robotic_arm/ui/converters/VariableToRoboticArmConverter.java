package ca.gc.asc_csa.apogy.examples.robotic_arm.ui.converters;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;

public class VariableToRoboticArmConverter implements IConverter
{
	@Override
	public boolean canConvert(Object object)
	{
		InvocatorSession activeSession = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		
		if (activeSession != null)
		{
			EObject inst = ApogyCoreInvocatorFacade.INSTANCE.getInstance((Variable) object);
			
			if ((inst instanceof RoboticArm) == true)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public Object convert(Object object) throws Exception
	{
		return ApogyCoreInvocatorFacade.INSTANCE.getInstance((Variable) object);	
	}

	@Override
	public Class<?> getInputType()
	{
		return Variable.class;
	}

	@Override
	public Class<?> getOutputType()
	{
		return RoboticArm.class;
	}
}