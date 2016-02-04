package ca.gc.asc_csa.apogy.examples.robotic_arm.ui.converters;
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