package ca.gc.asc_csa.apogy.addons.vehicle.ui.commands;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.addons.vehicle.VehiclePoseCorrector;
import ca.gc.asc_csa.apogy.addons.vehicle.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

public class ReInitializeWheeledVehiclePoseCorrectorCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof VehiclePoseCorrector) 
			{
				final VehiclePoseCorrector corrector = (VehiclePoseCorrector) selection;
				
				if(!corrector.isInitializing())
				{
					Job job = new Job("ReInitialize WheeledVehiculePoseCorrector")
					{
						@Override
						protected IStatus run(IProgressMonitor monitor) 
						{
							try
							{
								corrector.reInitialize();
								return Status.OK_STATUS;
							}
							catch(Throwable t)
							{
								return new Status(IStatus.ERROR, Activator.ID, "Failed to ReInitialize VehiclePoseCorrector !", t);
							}
							
						}
					};
					job.schedule();
				}
				else
				{
					return new Status(IStatus.WARNING, Activator.ID, "ReInitialize rejected : corrector is already initializing.");
				}				
			}
		}
		return null;
	}
}
