package org.eclipse.symphony.core.environment.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.core.environment.ui.TrajectoryProvider;
import org.eclipse.ui.handlers.HandlerUtil;

public class TrajectoryProviderInitializeCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) 
		{
			Object selection = selections.next();

			if (selection instanceof TrajectoryProvider) 
			{
				final TrajectoryProvider trajectoryProvider = (TrajectoryProvider) selection;
				trajectoryProvider.initialize();					
			}
		}
		return null;
	}
}