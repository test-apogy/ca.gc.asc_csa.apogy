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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ui.dialogs.ResetPositionDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ResetPositionCommandHandler extends AbstractHandler implements IHandler
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
		
		while (selections.hasNext())
		{
			Object selection = selections.next();
			
			if (selection instanceof PositionSensor)
			{
				final PositionSensor positionSensor = (PositionSensor) selection;
				
				ResetPositionDialog  editPositionNodePositionDialog = new ResetPositionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
																							  positionSensor);
				
				editPositionNodePositionDialog.create();
				editPositionNodePositionDialog.open();
				editPositionNodePositionDialog.getReturnCode();
				
				break;
			}
		}
		
		return null;
	}
}
