package org.eclipse.symphony.examples.robotic_arm.ui.converters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;

public class VariableToRoboticArmConverter implements IConverter
{
	@Override
	public boolean canConvert(Object object)
	{
		InvocatorSession activeSession = Symphony__CoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		
		if (activeSession != null)
		{
			EObject inst = Symphony__CoreInvocatorFacade.INSTANCE.getInstance((Variable) object);
			
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
		return Symphony__CoreInvocatorFacade.INSTANCE.getInstance((Variable) object);	
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