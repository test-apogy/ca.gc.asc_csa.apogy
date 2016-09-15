/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mathieu Larose (mathieu.larose@savoirfairelinux.com)
 *     Alexey Balyberdin (alexey.balyberdin@savoirfairelinux.com)
 *     Savoir-faire Linux - Initial API and implementation
 */

package ca.gc.asc_csa.apogy.core.programs.javascript.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.ProjectSourceContainer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.wst.jsdt.debug.internal.core.launching.ILaunchConstants;

import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;

/**
 * Abstract {@link JavaScriptProgram} execution command handler. Contains common functions to create 
 * Apogy launch configurations.
 */
public abstract class ScriptExecutorHandler extends AbstractHandler {

    // Apogy debug configuration type name
    public static final String LAUNCH_CONFIG_ID = "ca.gc.asc_csa.apogy.core.programs.javascript.launchConfigurationType";

    // Additional attribute to store the path to the script in the configuration
    public static final String PROGRAM_NAME = "apogy.javascript.scriptPath";

    // Prefix for debug configurations
    private static final String LAUNCH_CONFIGURATION_PREFIX = "Apogy ";

    // Source: org.eclipse.wst.jsdt.debug.core/plugin.xml
    private static final String REMOTE_JS_SOURCE_LOCATOR_ID = "org.eclipse.wst.jsdt.debug.core.sourceLocator";

    // Source:
    // org.eclipse.wst.jsdt.debug.internal.rhino.jsdi.connect.RhinoAttachingConnector.id
    private static final String RHINO_ATTACHING_CONNECTOR_ID = "rhino.attaching.connector";

    /**
     * Gets the {@link JavaScriptProgram} from the event.
     */
    protected static JavaScriptProgram getJavaScriptProgram(ExecutionEvent event) {
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
     * Creates a new eclipse Apogy debug configuration and stores it for future reuse
     * @param program the program to run
     * @return the persister configuration
     * @throws CoreException failed to create the configuration
     */
    protected ILaunchConfiguration createConfiguration(JavaScriptProgram program) throws CoreException {
        ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType launchConfigurationType = manager.getLaunchConfigurationType(LAUNCH_CONFIG_ID);

        // Create launch configuration
        ILaunchConfigurationWorkingCopy remoteJavaScriptLaunchConfiguration = launchConfigurationType.newInstance(null, 
                manager.generateLaunchConfigurationName(LAUNCH_CONFIGURATION_PREFIX + program.getName()));

        // Set container id
        remoteJavaScriptLaunchConfiguration.setAttribute(ILaunchConstants.CONNECTOR_ID, RHINO_ATTACHING_CONNECTOR_ID);

        // Set source locator
        String projectName = getProjectName(program.getScriptPath());

        AbstractSourceLookupDirector sourceLocator = (AbstractSourceLookupDirector) DebugPlugin.getDefault().getLaunchManager().newSourceLocator(REMOTE_JS_SOURCE_LOCATOR_ID);
        ProjectSourceContainer projectSourceContainer = new ProjectSourceContainer(ResourcesPlugin.getWorkspace().getRoot().getProject(projectName), false);
        sourceLocator.setSourceContainers(new ISourceContainer[] { projectSourceContainer });
        remoteJavaScriptLaunchConfiguration.setAttribute(ILaunchConfiguration.ATTR_SOURCE_LOCATOR_MEMENTO, sourceLocator.getMemento());

        // set source file location
        remoteJavaScriptLaunchConfiguration.setAttribute(PROGRAM_NAME, program.getName());

        // Persist the launch configuration
        remoteJavaScriptLaunchConfiguration.doSave();

        return remoteJavaScriptLaunchConfiguration;
    }

    /**
     * Checks the list of existing configurations to find it there is already one created for the given program
     * @param program the program to run
     * @return found configuration or null
     * @throws CoreException configurations retrieval exception
     */
    protected ILaunchConfiguration lookupConfiguration(JavaScriptProgram program) throws CoreException {
        ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType launchConfigurationType = manager.getLaunchConfigurationType(LAUNCH_CONFIG_ID);

        ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(launchConfigurationType);

        for (ILaunchConfiguration config : configurations) {
            String programName = config.getAttribute(PROGRAM_NAME, "");
            if (programName.equals(program.getName())) {
                return config;
            }
        }
        return null;
    }

    /**
     * Gets the name of the project of a JavaScriptProgram. The scriptPath
     * attribute is in the format /<project name>/path/to/script.js . This
     * function extracts the first part.
     * 
     * @return The project name or null if the script path has not the right
     *         format
     */
    protected String getProjectName(String scriptPath) {
        if (scriptPath == null) {
            return null;
        }

        IPath path = new Path(scriptPath);
        return path.segment(0);
    }
}
