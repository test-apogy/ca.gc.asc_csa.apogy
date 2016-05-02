/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Larose (mathieu.larose@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import ca.gc.asc_csa.apogy.core.programs.javascript.ScriptExecutor;
import ca.gc.asc_csa.apogy.core.programs.javascript.ui.Activator;

/**
 * Handler of the Execute context menu item.
 * 
 */
public class ScriptExecutorHandler extends AbstractHandler {

	/**
	 * Gets the {@link JavaScriptProgram} from the event.
	 */
	private static JavaScriptProgram getJavaScriptProgram(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (!(selection instanceof IStructuredSelection)) {
			return null;
		}

		IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		Object firstElement = structuredSelection.getFirstElement();
		if (!(firstElement instanceof JavaScriptProgram)) {
			return null;
		}

		return (JavaScriptProgram) firstElement;
	}

	/**
	 * Executes a {@link JavaScriptProgram}.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new Job("Execute JavaScriptProgram") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				JavaScriptProgram jsProgram = getJavaScriptProgram(event);

				try {
					ScriptExecutor.execute(jsProgram);
				} catch (Exception e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
				}

				return Status.OK_STATUS;
			}
		}.schedule();

		return null;
	}
}
