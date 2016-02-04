package ca.gc.asc_csa.apogy.core.environment.ui.commands;
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

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import ca.gc.asc_csa.apogy.core.environment.ui.views.CoordinateConversionView;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleCoordinateConversionViewSelectionEnabledCommand extends AbstractHandler
{
	private static final String COORD_CONVERSION_VIEW_ID = "ca.gc.asc_csa.apogy.core.environment.ui.views.CoordinateConversionView";
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		try
		{
			// Get the conversion coordinate view
			CoordinateConversionView coordConvView = (CoordinateConversionView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().
																					getActivePage().showView(COORD_CONVERSION_VIEW_ID);
			
			// Toggle the command state
			boolean enableSelections = !(HandlerUtil.toggleCommandState(event.getCommand()));
			
			// Toggle whether the coordinate view is allowed to make selections
			coordConvView.enableSelections(enableSelections);
		}
		catch(PartInitException ex)
		{
			// Print the stack trace
			ex.printStackTrace();
		}
		
		// Just return null
		return null;
	}
}
