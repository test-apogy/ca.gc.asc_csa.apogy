package ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.ui.converters;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.converters.IConverter;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.RoboticArm;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Variable;

public class VariableToRoboticArmConverter implements IConverter
{
	@Override
	public boolean canConvert(Object object)
	{
		InvocatorSession activeSession = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		
		if (activeSession != null)
		{
			EObject inst = EMFEcoreInvocatorFacade.INSTANCE.getInstance((Variable) object);
			
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
		return EMFEcoreInvocatorFacade.INSTANCE.getInstance((Variable) object);	
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