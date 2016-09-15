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
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.ServerSocket;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
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
import static ca.gc.asc_csa.apogy.core.programs.javascript.ApogyCoreJavaScriptProgramsPackage.*;
/**
 * Executes a {@link JavaScriptProgram}.
 *
 */
@SuppressWarnings("restriction")
public class ScriptExecutor {

	public static void executeProgram(JavaScriptProgram program) throws CoreException {
		executeProgram(program, new ContextFactory());
	}
	
	public static void executeProgram(JavaScriptProgram program,
			ContextFactory contextFactory) throws CoreException {
		String relativePath = program.getScriptPath();
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);
		String source;
        try {
            source = IOUtils.toString(new FileReader(absolutePath.toOSString()));
        } catch (IOException e) {
            throw new CoreException(new Status(IStatus.ERROR, eNS_URI, "Failed to locate javascript file: " + absolutePath.toOSString(), e));
        }
		executeString(program, source, contextFactory);
	}

	/**
	 * Executes a {@link JavaScriptProgram}.
	 *
	 * @param program
	 *            The program to execute
	 * @param source
	 *            The content of the program
	 * @throws Exception
	 *             throws if variables mapping or code execution failed
	 */
	public static void executeString(JavaScriptProgram program, String source) throws CoreException {
		executeString(program, source, new ContextFactory());
	}

	/**
	 * Creates a rhino backend and starts it
	 * 
	 * @param contextFactory
	 *            the context factory to listen to
	 * @return the started debugger
	 * @throws Exception
	 *             might throw if debugger.start() fails
	 */
    public static RhinoDebugger startRhinoBackend(ContextFactory contextFactory) throws CoreException  {
        // address=0 chooses a random available port see ServerSocket
        RhinoDebugger debuggerBackend = new RhinoDebugger("transport=socket,suspend=n,address=0");
        
        // attach to context factory if present
        if (contextFactory != null) {
            contextFactory.addListener(debuggerBackend);
        }
        try {
            debuggerBackend.start();
        } catch (Exception e) {
            throw new CoreException(new Status(IStatus.ERROR, eNS_URI, "Failed to start Rhino backend", e));
        }
        return debuggerBackend;
    }

	/**
	 * Executes a {@link JavaScriptProgram}.
	 *
	 * @param program
	 *            The program to execute
	 * @param reader
	 *            The content file of the program
	 * @param contextFactory
	 *            The configured Rhino context factory with or without attached
	 *            debugger
	 * @throws Exception
	 *             throws if variables mapping or code execution failed
	 */
	private static void executeString(JavaScriptProgram program, String source,
			ContextFactory contextFactory) throws CoreException {
		String relativePath = program.getScriptPath();
		IPath absolutePath = ResourcesPlugin.getWorkspace().getRoot().getLocation().append(relativePath);

		List<Variable> variables = getApogyVariables();

		CompilerEnvirons env = new CompilerEnvirons();
		env.setRecordingLocalJsDocComments(true);
		env.setAllowSharpComments(true);
		env.setRecordingComments(true);
		AstRoot root = new Parser(env).parse(source, absolutePath.toOSString(), 1);

		Context context = contextFactory.enterContext();
		try {
		    variables = getVariableOrder(root, variables);
		    
			Scriptable scope = context.initStandardObjects();
			List<VariableProxy> proxies = createJavaScriptProxies(variables,
					scope, program);

			context.evaluateString(scope, source, absolutePath.toOSString(), 1,
					null);

			Function main = (Function) scope.get("main", scope);
			main.call(context, scope, scope, proxies.toArray());
		} catch (Exception e) {
		    throw new CoreException(new Status(IStatus.ERROR, eNS_URI, "Failed to execute Apogy javascript", e));
        } finally {
			Context.exit();
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
    public static int getPort(RhinoDebugger debuggerBackend) throws CoreException {
		try {
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
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException | InterruptedException e) {
            throw new CoreException(new Status(IStatus.ERROR, eNS_URI, "Failed to get Rhino backend port", e));
        }
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
    private static List<VariableProxy> createJavaScriptProxies(List<Variable> variables, Scriptable topLevelScope, JavaScriptProgram program) throws CoreException {
		try {
            List<VariableProxy> proxies = new ArrayList<>();
            for (Variable variable : variables) {
            	VariableProxy proxy = new VariableProxy(variable, program);
            	proxy.setParentScope(topLevelScope);
            	proxies.add(proxy);
            }
            return proxies;
        } catch (NoSuchMethodException | SecurityException e) {
            throw new CoreException(new Status(IStatus.ERROR, eNS_URI, "Failed to create Rhino variables proxies", e));
        }
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
