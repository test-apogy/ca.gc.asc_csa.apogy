package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;

public class SetActiveInvocatorSessionCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Iterator<?> selections = ((IStructuredSelection) HandlerUtil
				.getActiveMenuSelection(event)).iterator();

		while (selections.hasNext()) {
			Object selection = selections.next();

			if (selection instanceof InvocatorSession) {
				EMFEcoreInvocatorFacade.INSTANCE
						.setActiveInvocatorSession((InvocatorSession) selection);
			}
		}
		return null;
	}
}
