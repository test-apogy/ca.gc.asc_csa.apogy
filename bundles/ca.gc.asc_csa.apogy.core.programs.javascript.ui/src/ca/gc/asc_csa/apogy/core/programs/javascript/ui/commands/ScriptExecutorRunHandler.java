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

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;

import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import ca.gc.asc_csa.apogy.core.programs.javascript.ui.Activator;

/**
 * Handler of the Execute context menu item.
 */
public class ScriptExecutorRunHandler extends ScriptExecutorHandler {

    /**
     * Runs a {@link JavaScriptProgram}.
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        new Job("Debug JavaScriptProgram") {
            @Override
            protected IStatus run(IProgressMonitor monitor) {
                try {
                    JavaScriptProgram jsProgram = getJavaScriptProgram(event);
                    ILaunchConfiguration configuration = lookupConfiguration(jsProgram);

                    if (configuration == null) {
                        configuration = createConfiguration(jsProgram);
                    }

                    configuration.launch(ILaunchManager.RUN_MODE, null);
                } catch (CoreException e) {
                    Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Run launch failed", e));
                }

                return Status.OK_STATUS;
            }
        }.schedule();

        return null;
    }
}
