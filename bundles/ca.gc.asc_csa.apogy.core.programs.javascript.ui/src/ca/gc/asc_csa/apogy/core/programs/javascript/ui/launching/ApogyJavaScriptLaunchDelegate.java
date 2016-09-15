/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alexey Balyberdin (alexey.balyberdin@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.launching;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.wst.jsdt.debug.internal.core.launching.ILaunchConstants;
import org.eclipse.wst.jsdt.debug.internal.core.launching.RemoteJavaScriptLaunchDelegate;
import org.eclipse.wst.jsdt.debug.rhino.debugger.RhinoDebugger;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import ca.gc.asc_csa.apogy.core.programs.javascript.ScriptExecutor;
import ca.gc.asc_csa.apogy.core.programs.javascript.ui.Activator;
import ca.gc.asc_csa.apogy.core.programs.javascript.ui.commands.ScriptExecutorHandler;

/**
 * Apogy {@link JavaScriptProgram} debug configuration.
 */
@SuppressWarnings("restriction")
public class ApogyJavaScriptLaunchDelegate extends RemoteJavaScriptLaunchDelegate {

    // rhino backend
    private RhinoDebugger debuggerBackend;

    /*
     * (non-Javadoc)
     * @see org.eclipse.wst.jsdt.debug.internal.core.launching.
     * RemoteJavaScriptLaunchDelegate#launch(org.eclipse.debug.core.
     * ILaunchConfiguration, java.lang.String, org.eclipse.debug.core.ILaunch,
     * org.eclipse.core.runtime.IProgressMonitor)
     */
    @Override
    public synchronized void launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
        // debug configuration
        ContextFactory contextFactory = null;
        if (mode.equals(ILaunchManager.DEBUG_MODE)) {
            // run backend
            contextFactory = startDebuggerBackend();
            // cleanup when finished
            contextFactory.addListener(new ContextFactory.Listener() {
                int contextsCount;
                
                @Override
                public void contextReleased(Context cx) {
                    contextsCount--;
                    // shutdown backend when no contexts left
                    if (contextsCount == 0) {
                        stopBackend();
                    }
                }

                @Override
                public void contextCreated(Context cx) {
                    contextsCount++;
                }
            });

            // Set address
            ILaunchConfigurationWorkingCopy workConfiguration = setupConnection(configuration);
            // run frontend
            super.launch(workConfiguration, mode, launch, monitor);
        }

        // start the script
        try {
            JavaScriptProgram jsProgram = findJavaScriptProgram(configuration);

            if (mode.equals(ILaunchManager.DEBUG_MODE)) {
                ScriptExecutor.executeProgram(jsProgram, contextFactory);
            } else {
                // run configuration
                ScriptExecutor.executeProgram(jsProgram);
            }
        } catch (Exception e) {
            Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
            throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Apogy JavaScript execution failure", e));
        }
    }

    /**
     * Starts {@link RhinoDebugger} opens a port and waits for the frontend to
     * connect
     * 
     * @return a context factory with attached debugger
     * @throws CoreException
     *             failed to start
     */
    private ContextFactory startDebuggerBackend() throws CoreException {
        ContextFactory contextFactory = new ContextFactory();
        try {
            debuggerBackend = ScriptExecutor.startRhinoBackend(contextFactory);

            return contextFactory;
        } catch (Exception e) {
            Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
            throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to start debugger backend", e));
        }
    }

    /**
     * Retrieves the opened port from {@link RhinoDebugger} and sets it to the
     * frontend configuration
     * 
     * @param configuration
     *            the configuration to modify
     * @return configuration ready for use
     * @throws CoreException
     *             failed to get debugger port
     */
    private ILaunchConfigurationWorkingCopy setupConnection(ILaunchConfiguration configuration) throws CoreException {
        try {
            ILaunchConfigurationWorkingCopy workConfiguration = configuration.getWorkingCopy();
            Map<String, String> arguments = new HashMap<>();
            arguments.put(ILaunchConstants.HOST, InetAddress.getLocalHost().getHostName());
            arguments.put(ILaunchConstants.PORT, Integer.toString(ScriptExecutor.getPort(debuggerBackend)));
            workConfiguration.setAttribute(ILaunchConstants.ARGUMENT_MAP, arguments);
            return workConfiguration;
        } catch (Exception e) {
            Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
            throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to get debugger backend port", e));
        }
    }

    /**
     * Looks up {@link JavaScriptProgram} in Apogy Session.
     * 
     * @param configuration
     *            the configuration
     * @return the program
     * @throws CoreException
     *             if no program found or the session is not initialized
     */
    private JavaScriptProgram findJavaScriptProgram(ILaunchConfiguration configuration) throws CoreException {
        String programName = configuration.getAttribute(ScriptExecutorHandler.PROGRAM_NAME, "");

        InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
        if (session == null)
            throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No active Apogy session"));

        for (Program program : session.getProgramsList().getPrograms()) {
            if (program instanceof JavaScriptProgram && program.getName().equals(programName)) {
                return (JavaScriptProgram) program;
            }
        }
        String errorMsg = "Apogy JavaScript not found: " + programName;
        Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, errorMsg));
        throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, errorMsg));
    }

    private void stopBackend() {
        // shutdown rhino backend
        if (debuggerBackend != null) {
            try {
                debuggerBackend.stop();
            } catch (Exception e) {
                Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Failed to stop Rhino backend", e));
            }
        }
    }

}
