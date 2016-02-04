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

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.core.PoseCorrector;
import ca.gc.asc_csa.apogy.core.ApogySystemApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import org.eclipse.ui.handlers.HandlerUtil;

public class TogglePoseCorrectorEnabledCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof PoseCorrector) 
			{
				PoseCorrector corrector = (PoseCorrector) selection;
				
				corrector.setEnabled(!corrector.isEnabled());
			}
			else if(selection instanceof Variable)
			{
				Variable variable = (Variable) selection;
				
				AbstractTypeImplementation ati = ApogyCoreInvocatorFacade.INSTANCE.getTypeImplementation(variable);
				if(ati instanceof VariableImplementation)
				{
					VariableImplementation va = (VariableImplementation) ati;
					if(va.getAdapterInstance() instanceof ApogySystemApiAdapter)
					{
						ApogySystemApiAdapter ssaa = (ApogySystemApiAdapter) va.getAdapterInstance();
						
						PoseCorrector corrector = ssaa.getPoseCorrector();
						if(corrector != null)
						{
							corrector.setEnabled(!corrector.isEnabled());
						}
					}
				}
			}
		}
		return null;
	}
}
