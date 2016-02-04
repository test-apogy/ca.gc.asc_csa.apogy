package ca.gc.asc_csa.apogy.addons.sensors.pose.ui.handlers;
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

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.AbstractHandler;
import ca.gc.asc_csa.apogy.addons.sensors.pose.OrientationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.dialogs.ResetOrientationDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ResetOrientationCommandHandler extends AbstractHandler implements IHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext())
		{
			Object selection = selections.next();
			
			if (selection instanceof OrientationSensor)
			{
				final OrientationSensor orientationSensor = (OrientationSensor) selection;
				
				ResetOrientationDialog  editPositionNodePositionDialog = new ResetOrientationDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
						                                                                            orientationSensor);
				
				editPositionNodePositionDialog.create();
				editPositionNodePositionDialog.open();
				editPositionNodePositionDialog.getReturnCode();
				
				break;
			}
		}
		
		return null;
	}

}
