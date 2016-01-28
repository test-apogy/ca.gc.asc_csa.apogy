package org.eclipse.symphony.core.programs.controllers.ui.commands;
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
import org.eclipse.symphony.core.programs.controllers.ControllersConfiguration;
import org.eclipse.ui.handlers.HandlerUtil;


public class DeActivateControllersConfigurationCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
			
		new Job("Activate ControllersConfiguration Command")
		{		
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();
				
				while (selections.hasNext())
				{
					Object selection = selections.next();		
					if (selection instanceof ControllersConfiguration)
					{
						ControllersConfiguration controllersConfiguration = (ControllersConfiguration) selection;
						controllersConfiguration.setActive(false);
					}					
				}
				
				return Status.OK_STATUS;
			}
		}.schedule();
		return null;
	}
}