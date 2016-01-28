package ca.gc.asc_csa.apogy.addons.ui.commands;

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
import ca.gc.asc_csa.apogy.addons.AbstractTwoPoints3DTool;
import ca.gc.asc_csa.apogy.addons.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

public class AbstractTwoPoints3DToolLockToNodeCommand extends AbstractHandler implements IHandler 
{
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof AbstractTwoPoints3DTool) 
			{
				final AbstractTwoPoints3DTool tool = (AbstractTwoPoints3DTool) selection;
				
				Job job = new Job("Toggle Abstract TwoPoints 3D Tool To Node Lock.")
				{
					@Override
					protected IStatus run(IProgressMonitor monitor) 
					{
						try
						{			
							tool.setToNodeLock(!tool.isToNodeLock());
							return Status.OK_STATUS;
						}
						catch(Throwable t)
						{
							return new Status(IStatus.ERROR, Activator.ID, "Failed to toggle  Abstract TwoPoints 3D Tool To Node Lock !", t);
						}
						
					}
				};
				job.schedule();
			}						
		}		
		return null;
	}
}
