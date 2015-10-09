package org.eclipse.symphony.addons.sensors.imaging.camera.commands;

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
import org.eclipse.symphony.addons.sensors.imaging.camera.Activator;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter;
import org.eclipse.ui.handlers.HandlerUtil;

public class ToggleImageFilterEnableCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof ImageFilter) 
			{
				final ImageFilter filter = (ImageFilter) selection;
				
				Job job = new Job("Toggle Image Filter Enablement.")
				{
					@Override
					protected IStatus run(IProgressMonitor monitor) 
					{
						try
						{
							filter.setEnabled(!filter.isEnabled());
							return Status.OK_STATUS;
						}
						catch(Throwable t)
						{
							return new Status(IStatus.ERROR, Activator.ID, "Failed to toggle filter enable !", t);
						}
						
					}
				};
				job.schedule();
			}						
		}		
		return null;
	}
}
