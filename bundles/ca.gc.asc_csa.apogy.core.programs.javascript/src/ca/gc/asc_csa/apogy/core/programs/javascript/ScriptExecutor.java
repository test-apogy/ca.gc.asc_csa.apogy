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
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.wst.jsdt.debug.internal.rhino.debugger.DebugSessionManager;
import org.eclipse.wst.jsdt.debug.internal.rhino.debugger.DebugSessionManager.DebugSessionThread;
import org.eclipse.wst.jsdt.debug.internal.rhino.debugger.RhinoDebuggerImpl;
import org.eclipse.wst.jsdt.debug.internal.rhino.transport.RhinoTransportService;
import org.eclipse.wst.jsdt.debug.rhino.debugger.RhinoDebugger;
import org.eclipse.wst.jsdt.debug.transport.ListenerKey;
import org.mozilla.javascript.CompilerEnvirons;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.AstNode;
import org.mozilla.javascript.ast.AstRoot;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Name;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * Executes a {@link JavaScriptProgram}.
 *
 */
@SuppressWarnings("restriction")
public class ScriptExecutor {
	private static final String LOCALHOST = "127.0.0.1";

	
	public static void execute(JavaScriptProgram program) throws Exception {
		execute(program, null);
	}

	public static void execute(JavaScriptProgram program, RhinoDebuggerFrontend debug) throws Exception {
		String relativePath = program.getScriptPath();
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);
		execute(program, new FileReader(absolutePath.toOSString()), new FileReader(absolutePath.toOSString()), debug);
	}

	/**
	 * Executes a {@link JavaScriptProgram}.
	 *
	 * @param program
	 *            The program to execute
	 * @param reader
	 *            The content file of the program
	 * @throws Exception
	 *             might throw if debugger.start() fails
	 */
	public static void execute(JavaScriptProgram program, Reader reader1, Reader reader2) throws Exception {
		execute(program, reader1, reader2, null);
	}

	/**
	 * Executes a {@link JavaScriptProgram}.
	 *
	 * @param program
	 *            The program to execute
	 * @param reader
	 *            The content file of the program
	 * @param debuggerFrontend
	 *            Rhino debugger frontend
	 * @throws Exception
	 *             might throw if debugger.start() fails
	 */
	private static void execute(JavaScriptProgram program, Reader reader1, Reader reader2, RhinoDebuggerFrontend debuggerFrontend) throws Exception {
		String relativePath = program.getScriptPath();
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);

		List<Variable> variables = getApogyVariables();

		CompilerEnvirons env = new CompilerEnvirons();
		env.setRecordingLocalJsDocComments(true);
		env.setAllowSharpComments(true);
		env.setRecordingComments(true);
		AstRoot root = new Parser(env).parse(reader1, absolutePath.toOSString(), 1);
		variables = getVariableOrder(root, variables);

		ContextFactory factory = new ContextFactory();

		RhinoDebugger debuggerBackend = null;
		if (debuggerFrontend != null) {
			// address=0 chooses a random available port see {@link
			// ServerSocket}
			debuggerBackend = new RhinoDebugger("transport=socket,suspend=n,address=0");
			factory.addListener(debuggerBackend);
			debuggerBackend.start();
			debuggerFrontend.start(LOCALHOST, getPort(debuggerBackend));
		}

		try {
			Context context = factory.enterContext();
			try {
				Scriptable scope = context.initStandardObjects();
				List<VariableProxy> proxies = createJavaScriptProxies(variables, scope, program);

				context.evaluateReader(scope, reader2, absolutePath.toOSString(), 1, null);

				Function main = (Function) scope.get("main", scope);
				main.call(context, scope, scope, proxies.toArray());
			} finally {
				Context.exit();
			}
		} finally {
			if (debuggerFrontend != null) {
				debuggerBackend.stop();
			}
		}
	}

	/**
	 * Gets the allocated port of the debugger backend.
	 * 
	 * This functions traverses a chain of private attributes to get the
	 * ServerSocket.
	 * 
	 * @param debuggerBackend
	 *            Rhino debugger backend
	 * @return Allocated port
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 * @throws InterruptedException
	 */
	private static int getPort(RhinoDebugger debuggerBackend) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
		// RhinoDebugger debuggerBackend => RhinoDebuggerImpl impl
		Field implField = RhinoDebugger.class.getDeclaredField("impl");
		implField.setAccessible(true);
		RhinoDebuggerImpl impl = (RhinoDebuggerImpl) implField.get(debuggerBackend);

		// RhinoDebuggerImpl impl => DebugSessionManager sessionManager
		Field sessionManagerField = RhinoDebuggerImpl.class.getDeclaredField("sessionManager");
		sessionManagerField.setAccessible(true);
		DebugSessionManager sessionManager = (DebugSessionManager) sessionManagerField.get(impl);

		// DebugSessionManager sessionManager => DebugSessionThread
		// debugSessionThread
		Field debugSessionThreadField = DebugSessionManager.class.getDeclaredField("debuggerThread");
		debugSessionThreadField.setAccessible(true);
		DebugSessionThread debugSessionThread = (DebugSessionThread) debugSessionThreadField.get(sessionManager);

		// DebugSessionThread debugSessionThread => ListenerKey listenerKey
		Field listenerKeyField = DebugSessionThread.class.getDeclaredField("listenerKey");
		listenerKeyField.setAccessible(true);
		ListenerKey listenerKey = null;

		// The listenerKey might not have been set at this point. So we try a
		// few times.
		//
		// Note that writes to and reads of references are always atomic,
		// regardless of whether they are implemented as 32-bit or 64-bit
		// values.
		//
		// Source:
		// http://docs.oracle.com/javase/specs/jls/se7/html/jls-17.html#jls-17.7
		for (int i = 0; i < 100 && listenerKey == null; i++) {
			Thread.sleep(100);
			listenerKey = (ListenerKey) listenerKeyField.get(debugSessionThread);
		}

		if (listenerKey == null) {
			return 0;
		}

		// DebugSessionManager sessionManager => RhinoTransportService
		// transportService
		Field transportServiceField = DebugSessionManager.class.getDeclaredField("transportService");
		transportServiceField.setAccessible(true);
		RhinoTransportService transportService = (RhinoTransportService) transportServiceField.get(sessionManager);

		ServerSocket serverSocket = transportService.getServerSocket(listenerKey);

		return serverSocket.getLocalPort();
	}

	/**
	 * Generates proxies for the Apogy variables.
	 *
	 * @param variables
	 *            Apogy variables
	 * @param topLevelScope
	 *            The script scope
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

	private static FunctionNode findMain(AstRoot root) {
		for (AstNode statement : root.getStatements()) {
			if (statement instanceof FunctionNode && "main".equals(((FunctionNode) statement).getName())) {
				return (FunctionNode) statement;
			}
		}
		return null;
	}

	/**
	 * Finds the JS Doc comment corresponding to the main function.
	 * 
	 * @param root
	 * @return
	 */
	private static String findMainJsDocComment(AstRoot root) {
		for (AstNode statement : root.getStatements()) {
			if (statement instanceof FunctionNode && "main".equals(((FunctionNode) statement).getName())) {
				return statement.getJsDoc();
			}
		}
		return null;
	}

	private static Map<String, Variable> getVariablesMapping(String comment, List<Variable> variables) throws BadVariableMapping {
		Map<String, Variable> mapping = new HashMap<>();
		Set<String> variablesUsed = new HashSet<>();

		for (String line : comment.split("\\r?\\n")) {
			int variableTagIndex = line.indexOf("@variable");
			if (variableTagIndex == -1) {
				continue;
			}
			String[] tokens = line.substring(variableTagIndex).split("\\s+");
			if (tokens.length < 3) {
				throw new BadVariableMapping("Invalid line: " + line);
			}

			if (variablesUsed.contains(tokens[1])) {
				throw new BadVariableMapping(MessageFormat.format("Duplicate {0}", tokens[1]));
			}
			variablesUsed.add(tokens[1]);

			Variable variable = null;
			for (Variable var : variables) {
				if (var.getName().equals(tokens[1])) {
					variable = var;
					break;
				}
			}

			if (variable == null) {
				throw new BadVariableMapping("Variable not found: " + tokens[1]);
			}

			mapping.put(tokens[2], variable);
		}

		return mapping;
	}

	private static List<Variable> getVariableOrder(AstRoot root, List<Variable> variables) throws BadVariableMapping {
		FunctionNode main = findMain(root);
		if (main == null) {
			throw new BadVariableMapping("main function not found");
		}

		String mainComment = findMainJsDocComment(root);
		if (mainComment == null) {
			throw new BadVariableMapping("jsDoc not found");
		}

		Map<String, Variable> variablesMapping = getVariablesMapping(mainComment, variables);
		if (variablesMapping.size() != variables.size()) {
			throw new BadVariableMapping(MessageFormat.format("Apogy session has {0} variable(s), but supplied {1} variable(s) in jsDoc", variables.size(), variablesMapping.size()));
		}

		List<Variable> variablesOrdered = new ArrayList<>();

		for (AstNode param : main.getParams()) {
			if (!(param instanceof Name)) {
				throw new BadVariableMapping("Bad param " + param);
			}
			Name name = (Name) param;
			if (!variablesMapping.containsKey(name.getIdentifier())) {
				throw new BadVariableMapping(MessageFormat.format("{0} has no variable tag", name.getIdentifier()));
			}
			variablesOrdered.add(variablesMapping.get(name.getIdentifier()));
		}

		return variablesOrdered;
	}
}

class BadVariableMapping extends Exception {
	private static final long serialVersionUID = 2977672522538072765L;

	public BadVariableMapping(String string) {
		super(string);
	}
}
