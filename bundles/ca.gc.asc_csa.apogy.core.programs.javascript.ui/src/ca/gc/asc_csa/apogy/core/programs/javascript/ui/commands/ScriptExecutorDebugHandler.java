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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
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
import org.eclipse.wst.jsdt.debug.internal.core.Constants;
import org.eclipse.wst.jsdt.debug.internal.core.launching.ILaunchConstants;

import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;
import ca.gc.asc_csa.apogy.core.programs.javascript.RhinoDebuggerFrontend;
import ca.gc.asc_csa.apogy.core.programs.javascript.ScriptExecutor;
import ca.gc.asc_csa.apogy.core.programs.javascript.ui.Activator;

/**
 * Handler of the Debug context menu item.
 * 
 */
@SuppressWarnings("restriction")
public class ScriptExecutorDebugHandler extends AbstractHandler {

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
	 * Debugs a {@link JavaScriptProgram}.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		new Job("Debug JavaScriptProgram") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				JavaScriptProgram jsProgram = getJavaScriptProgram(event);

				String projectName = getProjectNameOfJavaScriptProgram(jsProgram);
				ApogyRhinoDebuggerFrontend debug = new ApogyRhinoDebuggerFrontend(projectName);

				try {
					ScriptExecutor.executeProgram(jsProgram, debug);
				} catch (Exception e) {
					Activator.getDefault().getLog().log(new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()));
				}

				return Status.OK_STATUS;
			}
		}.schedule();

		return null;
	}

	class ApogyRhinoDebuggerFrontend implements RhinoDebuggerFrontend {
		private static final String LAUNCH_CONFIGURATION_PREFIX = "apogy";
		

		// Source: org.eclipse.wst.jsdt.debug.core/plugin.xml
		private static final String REMOTE_JS_SOURCE_LOCATOR_ID = "org.eclipse.wst.jsdt.debug.core.sourceLocator";

		// Source:
		// org.eclipse.wst.jsdt.debug.internal.rhino.jsdi.connect.RhinoAttachingConnector.id
		private static final String RHINO_ATTACHING_CONNECTOR_ID = "rhino.attaching.connector";

		private String projectName;

		public ApogyRhinoDebuggerFrontend(String projectName) {
			this.projectName = projectName;
		}

		@Override
		public void start(String address, int port) throws CoreException {
			ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType launchConfigurationType = manager.getLaunchConfigurationType(Constants.LAUNCH_CONFIG_ID);

			// Create launch configuration
			ILaunchConfigurationWorkingCopy remoteJavaScriptLaunchConfiguration = launchConfigurationType.newInstance(null, manager.generateLaunchConfigurationName(LAUNCH_CONFIGURATION_PREFIX));

			// Set container id
			remoteJavaScriptLaunchConfiguration.setAttribute(ILaunchConstants.CONNECTOR_ID, RHINO_ATTACHING_CONNECTOR_ID);

			// Set source locator
			AbstractSourceLookupDirector sourceLocator = (AbstractSourceLookupDirector) DebugPlugin.getDefault().getLaunchManager().newSourceLocator(REMOTE_JS_SOURCE_LOCATOR_ID);
			ProjectSourceContainer projectSourceContainer = new ProjectSourceContainer(ResourcesPlugin.getWorkspace().getRoot().getProject(projectName), false);
			sourceLocator.setSourceContainers(new ISourceContainer[] { projectSourceContainer });
			remoteJavaScriptLaunchConfiguration.setAttribute(ILaunchConfiguration.ATTR_SOURCE_LOCATOR_MEMENTO, sourceLocator.getMemento());

			// Set address
			Map<String, String> arguments = new HashMap<>();
			arguments.put(ILaunchConstants.HOST, address);
			arguments.put(ILaunchConstants.PORT, Integer.toString(port));
			remoteJavaScriptLaunchConfiguration.setAttribute(ILaunchConstants.ARGUMENT_MAP, arguments);

			// Launch
			remoteJavaScriptLaunchConfiguration.launch(ILaunchManager.DEBUG_MODE, null);

			// We don't have to save the launch configuration to use it, but in
			// case you want to see it from the LaunchConfigurationDialog, you
			// can save it with the following statement:
			// remoteJavaScriptLaunchConfiguration.doSave()
		}
	}

	/**
	 * Gets the name of the project of a JavaScriptProgram. The scriptPath
	 * attribute is in the format /<project name>/path/to/script.js . This
	 * function extracts the first part.
	 * 
	 * @return The project name or null if the script path has not the right
	 *         format
	 */
	private static String getProjectNameOfJavaScriptProgram(JavaScriptProgram program) {
		String scriptPath = program.getScriptPath();
		if (scriptPath == null) {
			return null;
		}

		IPath path = new Path(scriptPath);
		return path.segment(0);
	}
}
