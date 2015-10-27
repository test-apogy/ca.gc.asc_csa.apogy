package org.eclipse.symphony.core.invocator.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.ui.handlers.HandlerUtil;

public class VariableInstancesResetCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) {
			Object selection = selections.next();

			if (selection instanceof Environment) {
				Symphony__CoreInvocatorFacade.INSTANCE
						.disposeVariableInstances((Environment) selection);
				Symphony__CoreInvocatorFacade.INSTANCE
				.initVariableInstances((Environment) selection);				
			}
		}
		return null;
	}
}
