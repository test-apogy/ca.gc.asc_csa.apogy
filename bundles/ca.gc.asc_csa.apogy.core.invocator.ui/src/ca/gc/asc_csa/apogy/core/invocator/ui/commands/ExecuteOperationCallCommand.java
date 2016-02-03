package ca.gc.asc_csa.apogy.core.invocator.ui.commands;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

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
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.UIJob;

public class ExecuteOperationCallCommand extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		new Job("ApogyCoreInvocator: Execute Operation Call") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final Iterator<?> selections = ((IStructuredSelection) HandlerUtil
						.getActiveMenuSelection(event)).iterator();

				while (selections.hasNext()) {

					final Object selection = selections.next();
					if (selection instanceof OperationCall) {
						ApogyCoreInvocatorFacade.INSTANCE
								.exec((OperationCall) selection);
					} else if (selection instanceof OperationCallsList) {
						ApogyCoreInvocatorFacade.INSTANCE
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