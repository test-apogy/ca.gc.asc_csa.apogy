package org.eclipse.symphony.addons.ui.commands;

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
import org.eclipse.symphony.addons.Simple3DTool;
import org.eclipse.symphony.addons.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleSimpleToolActiveCommand extends AbstractHandler implements IHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof Simple3DTool) 
			{
				final Simple3DTool tool = (Simple3DTool) selection;
				
				Job job = new Job("Toggle Simple3DTool Active.")
				{
					@Override
					protected IStatus run(IProgressMonitor monitor) 
					{
						try
						{			
							tool.setActive(!tool.isActive());
							return Status.OK_STATUS;
						}
						catch(Throwable t)
						{
							return new Status(IStatus.ERROR, Activator.ID, "Failed to toggle Simple3DTool Active !", t);
						}
						
					}
				};
				job.schedule();
			}						
		}		
		return null;
	}
}
