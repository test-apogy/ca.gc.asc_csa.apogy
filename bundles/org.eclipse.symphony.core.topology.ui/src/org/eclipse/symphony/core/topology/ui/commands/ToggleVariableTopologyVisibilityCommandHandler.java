package org.eclipse.symphony.core.topology.ui.commands;

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
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.symphony.core.topology.SymphonyTopologyFacade;
import org.eclipse.symphony.core.topology.ui.Activator;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodePresentation;

public class ToggleVariableTopologyVisibilityCommandHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof Variable) 
			{
				final Variable variable = (Variable) selection;
				
				Job job = new Job("Toggling Variable Visibility")
				{
					@Override
					protected IStatus run(IProgressMonitor monitor) 
					{
						try
						{			
							Node node = SymphonyTopologyFacade.INSTANCE.getVariableOriginNode(variable);
							if(node != null)
							{								
								NodePresentation nodePresentation = ca.gc.space.topology.ui.Activator.getTopologyPresentationRegistry().getPresentationNode(node);				
								if(nodePresentation != null)
								{
									nodePresentation.setVisible(!nodePresentation.isVisible());
								}
							}
							
							return Status.OK_STATUS;
						}
						catch(Throwable t)
						{
							return new Status(IStatus.ERROR, Activator.ID, "Failed to toggle variable <" + variable.getName() + "> visibility !", t);
						}						
					}
				};
				job.schedule();				
			}
		}
		return null;
	}
}
