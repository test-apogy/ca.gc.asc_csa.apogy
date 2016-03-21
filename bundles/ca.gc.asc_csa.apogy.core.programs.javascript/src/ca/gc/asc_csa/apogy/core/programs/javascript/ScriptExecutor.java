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

package ca.gc.asc_csa.apogy.core.programs.javascript;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.wst.jsdt.debug.rhino.debugger.RhinoDebugger;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Scriptable;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.programs.javascript.JavaScriptProgram;

/**
 * Executes a {@link JavaScriptProgram}.
 *
 */
public class ScriptExecutor {
	
	public static void execute(JavaScriptProgram program, boolean debug) throws Exception {
		String relativePath = program.getScriptPath(); 
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);
		Reader reader = new FileReader(absolutePath.toOSString());
		execute(program, reader, debug);
	}

	/**
	 * Executes a {@link JavaScriptProgram}.
	 *
	 * @param program The program to execute
	 * @param reader The content file of the program
	 * @param debug Set to true to start a {@link RhinoDebugger}
	 * @throws Exception might throw if debugger.start() fails
	 */
	public static void execute(JavaScriptProgram program, Reader reader, boolean debug) throws Exception {
		String relativePath = program.getScriptPath(); 
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);

		List<Variable> variables = getApogyVariables();

		ContextFactory factory = new ContextFactory();

		RhinoDebugger debugger = null;
		if (debug) {
			debugger = new RhinoDebugger("transport=socket,suspend=y,address=9000");
			factory.addListener(debugger);
			debugger.start();
		}

		try {
			Context context = factory.enterContext();
			try {
				Scriptable scope = context.initStandardObjects();
				List<VariableProxy> proxies = createJavaScriptProxies(variables, scope, program);

				// Inject proxies
				for (VariableProxy proxy : proxies) {
					scope.put(proxy.getName(), scope, proxy);
				}

				context.evaluateReader(scope, reader, absolutePath.toOSString(), 1, null);
			} finally {
				Context.exit();
			}
		} finally {
			if (debug) {
				debugger.stop();
			}
		}
	}

	/**
	 * Generates proxies for the Apogy variables.
	 *
	 * @param variables Apogy variables
	 * @param topLevelScope The script scope
	 * @param program
	 * @return proxies for the Apogy variables
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 */
	private static List<VariableProxy> createJavaScriptProxies(List<Variable> variables, Scriptable topLevelScope, JavaScriptProgram program) throws NoSuchMethodException, SecurityException {
		List<VariableProxy> proxies = new ArrayList<>();
		for (Variable variable : variables) {
			VariableProxy proxy = new VariableProxy(variable, program);
			proxy.setParentScope(topLevelScope);
			proxies.add(proxy);
		}
		return proxies;
	}

	/**
	 * Gets the Apogy variables of the active session.
	 *
	 * @return Apogy variables of the active session
	 */
	private static List<Variable> getApogyVariables() {
		return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList().getVariables();
	}
}
