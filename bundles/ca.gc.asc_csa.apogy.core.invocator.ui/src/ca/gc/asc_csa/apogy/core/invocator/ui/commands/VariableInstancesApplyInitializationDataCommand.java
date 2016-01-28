package org.eclipse.symphony.core.invocator.ui.commands;

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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.Variable;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class VariableInstancesApplyInitializationDataCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof Environment) 
			{						
				applyInitializationData((Environment) selection);
				// Symphony__CoreInvocatorFacade.INSTANCE.applyInitializationData((Environment) selection);
			}
		}
		return null;
	}		
	
	protected void applyInitializationData(final Environment environment)
	{
		// Open pop-up and save.
		IWorkbench wb = PlatformUI.getWorkbench();
		Shell shell = wb.getActiveWorkbenchWindow().getShell();								 				
				
		try
		{
			IRunnableWithProgress runnable = new IRunnableWithProgress()
			{
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException 
				{					
					monitor.beginTask("Applying Initialization Data", environment.getVariablesList().getVariables().size());
					
					for (Variable variable : environment.getVariablesList().getVariables()) 
					{						
						monitor.subTask("Applying data on Variable <" + variable.getName() + ">...");
						
						Symphony__CoreInvocatorFacade.INSTANCE.applyInitializationData(variable);
						monitor.worked(1);
						
						if (monitor.isCanceled()) return;
					}
				}
			};
			
			ProgressMonitorDialog progressMonitorDialog =  new ProgressMonitorDialog(shell);
			progressMonitorDialog.run(true, true, runnable);
		}
		catch(InvocationTargetException e)
		{	
			// Opens Error Dialog.
		}	
		catch(InterruptedException e)
		{
			// Cancels.			
		}
	}
}
