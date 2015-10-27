package org.eclipse.symphony.core.invocator.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.ui.handlers.HandlerUtil;

public class SetActiveInvocatorSessionCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) {
			Object selection = selections.next();

			if (selection instanceof InvocatorSession) {
				Symphony__CoreInvocatorFacade.INSTANCE
						.setActiveInvocatorSession((InvocatorSession) selection);
			}
		}
		return null;
	}
}
