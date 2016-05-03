/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Steve Monnier (steve.monnier@obeo.fr), 
 *     OBEO - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.command.IdentityCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.UIJob;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;

/**
 * Trigger a debug launch config before executing the {@link OperationCall} or
 * {@link OperationCallsList} in order to debug it step by step.
 * 
 * @author <a href="mailto:steve.monnier@obeo.fr">Steve Monnier</a>
 *
 */
public class DebugOperationCallCommand extends AbstractHandler implements IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		new Job("ApogyCoreInvocator: Debug Operation Call") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final Iterator<?> selections = ((IStructuredSelection) HandlerUtil.getActiveMenuSelection(event)).iterator();

				while (selections.hasNext()) {

					// TODO ajouter ici le lancement de la launchconfig debug

					final Object selection = selections.next();
					if (selection instanceof OperationCallsList) {
						StaticData.operationCallsList = (OperationCallsList) selection;
						ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
						ILaunchConfigurationType launchConfigurationType = manager.getLaunchConfigurationType("ca.gc.asc_csa.apogy.core.invocator.ui.OperationCallListsLaunch");

						// Create launch configuration
						try {
							ILaunchConfigurationWorkingCopy remoteJavaScriptLaunchConfiguration = launchConfigurationType.newInstance(null,
									manager.generateLaunchConfigurationName("OperationCallsListLauncher"));
							remoteJavaScriptLaunchConfiguration.launch(ILaunchManager.DEBUG_MODE, null);
						} catch (CoreException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}

					/**
					 * Update the command stack if any editing domain associated
					 * to the selection.
					 */
					if (selection != null) {
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