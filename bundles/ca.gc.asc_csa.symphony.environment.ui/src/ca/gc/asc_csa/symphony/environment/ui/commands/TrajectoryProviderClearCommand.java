package ca.gc.asc_csa.symphony.environment.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.symphony.environment.ui.TrajectoryProvider;

public class TrajectoryProviderClearCommand extends AbstractHandler implements
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
				trajectoryProvider.clear();							
			}
		}
		return null;
	}
}
