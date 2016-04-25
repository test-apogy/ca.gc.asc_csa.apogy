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
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.wst.jsdt.debug.rhino.debugger.RhinoDebugger;
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
public class ScriptExecutor {

	public static void execute(JavaScriptProgram program, boolean debug) throws Exception {
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
	 * @param debug
	 *            Set to true to start a {@link RhinoDebugger}
	 * @throws Exception
	 *             might throw if debugger.start() fails
	 */
	public static void execute(JavaScriptProgram program, Reader reader1, Reader reader2, boolean debug) throws Exception {
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

				context.evaluateReader(scope, reader2, absolutePath.toOSString(), 1, null);

				Function main = (Function) scope.get("main", scope);
				main.call(context, scope, scope, proxies.toArray());
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
