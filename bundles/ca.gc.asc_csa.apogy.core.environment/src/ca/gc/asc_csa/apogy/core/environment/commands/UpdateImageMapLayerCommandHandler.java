package ca.gc.asc_csa.apogy.core.environment.commands;
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

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayer;
import org.eclipse.ui.handlers.HandlerUtil;

public class UpdateImageMapLayerCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof ImageMapLayer) 
			{
				final ImageMapLayer layer = (ImageMapLayer) selection;
				IRunnableWithProgress runnable = new IRunnableWithProgress() 
				{				
					@Override
					public void run(IProgressMonitor monitor) throws InvocationTargetException,	InterruptedException 
					{						
						layer.updateImage(monitor);	
					}
				};
				
				try 
				{
					new ProgressMonitorDialog(Display.getCurrent().getActiveShell()).run(true, true, runnable);
				} 
				catch (InvocationTargetException e) 
				{				
					e.printStackTrace();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
