package org.eclipse.symphony.core.invocator.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallsList;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.UIJob;

public class ExecuteOperationCallCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		new Job("EMFEcoreInvocator: Execute Operation Call") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final Iterator<?> selections = ((IStructuredSelection) HandlerUtil
						.getActiveMenuSelection(event)).iterator();

				while (selections.hasNext()) {

					final Object selection = selections.next();
					if (selection instanceof OperationCall) {
						EMFEcoreInvocatorFacade.INSTANCE
								.exec((OperationCall) selection);
					} else if (selection instanceof OperationCallsList) {
						EMFEcoreInvocatorFacade.INSTANCE
								.exec((OperationCallsList) selection);
					}

					/** Update the command stack if any editing domain associated to the selection. */
					if (selection != null){
						new UIJob("New data product.  Update Command Stack...") {							
							@Override
							public IStatus runInUIThread(IProgressMonitor monitor) {
								EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(selection);
								domain.getCommandStack().execute(IdentityCommand.INSTANCE);
								return Status.OK_STATUS;
							}
						}.schedule();						
					}
				}				
				
				return Status.OK_STATUS;
			}
		}.schedule();
		return null;
	}
}