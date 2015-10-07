package org.eclipse.symphony.core.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.symphony.core.UserDefinedResult;
import org.eclipse.symphony.core.ui.dialogs.CreateUserDefinedResultDialog;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;


public class CreateUserDefinedResult extends AbstractHandler implements IHandler 
{
	public static String path = System.getProperty("user.home");
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof DataProductsList) 
			{
				DataProductsList dataProductsList = (DataProductsList) selection;
				
				Context context = null;
				try
				{					
					context = dataProductsList.getDataProductsListsContainer().getInvocatorSession().getEnvironment().getActiveContext();
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
				
				UserDefinedResult result = populateUserDefinedResult(event, context);							
				
				if(result != null) dataProductsList.getOperationCallResultsList().getResults().add(result);
			}
		}
		return null;
	}
	
	protected UserDefinedResult populateUserDefinedResult(ExecutionEvent event, Context context)
	{
		// Opens the CreateUserDefinedResult dialog.

		final Shell shell = HandlerUtil.getActiveSite(event).getShell();
		CreateUserDefinedResultDialog createUserDefinedResultDialog = new CreateUserDefinedResultDialog(shell, context);					
		
		// If Ok hit.
		if(createUserDefinedResultDialog.open() == Window.OK)
		{
			return createUserDefinedResultDialog.getUserDefinedResult();
		}
		else
		{
			return null;
		}			
	}
}
