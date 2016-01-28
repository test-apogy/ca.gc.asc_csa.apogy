package ca.gc.asc_csa.apogy.core.ui.commands;

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
import ca.gc.asc_csa.apogy.core.Activator;
import ca.gc.asc_csa.apogy.core.Updatable;
import org.eclipse.ui.handlers.HandlerUtil;

public class UpdatableUpdateCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof Updatable) 
			{
				final Updatable updatable = (Updatable) selection;
				if(!updatable.isUpdating())
				{
					Job job = new Job("Update")
					{
						@Override
						protected IStatus run(IProgressMonitor monitor) 
						{						
							try
							{
								updatable.update();
							}
							catch(Throwable t)
							{
								return new Status(Status.ERROR, Activator.ID, "Updatable failed to update!", t);
							}
							
							return Status.OK_STATUS;
						}
					};
					job.schedule();
				}
				
			}	
		}
		return null;
	}
}
