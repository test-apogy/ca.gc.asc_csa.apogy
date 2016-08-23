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

import org.eclipse.emf.ecore.EOperation;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.NumericEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;

/**
 * Calls an operation through the {@link ApogyCoreInvocatorFacade}
 *
 */
public class OperationCallInvoker extends BaseFunction {
	private static final long serialVersionUID = 1L;
	private EOperation operation;
	private JavaScriptProgram program;
	private VariableFeatureReference variableFeatureReference;

	/**
	 *
	 * @param program The JavaScriptProgram being executed
	 * @param variableFeatureReference The variable, type member and feature
	 * @param operation The operation to execute
	 */
	public OperationCallInvoker(JavaScriptProgram program, VariableFeatureReference variableFeatureReference, EOperation operation) {
		this.program = program;
		this.operation = operation;
		this.variableFeatureReference = variableFeatureReference;
	}

	/**
	 * Converts Rhino arguments to Apogy arguments.
	 *
	 * @param args Rhino arguments
	 * @return Apogy arguments
	 */
	private static ArgumentsList createArgumentsList(Object[] args) {
		ArgumentsList argumentsList = ApogyCoreInvocatorFactory.eINSTANCE.createArgumentsList();
		for (Object arg : args) {
			NumericEDataTypeArgument argument = ApogyCoreInvocatorFactory.eINSTANCE.createNumericEDataTypeArgument();
			argument.setValue(Context.toString(arg));
			argumentsList.getArguments().add(argument);
		}

		return argumentsList;
	}

	/**
	 * Creates an {@link OperationCall} based on the private attributes and arguments.
	 *
	 * @param argumentsList Apogy arguments list for the operation call.
	 * @return an {@link OperationCall}
	 */
	private OperationCall createOperationCall(ArgumentsList argumentsList) {
		OperationCall opCall = VariableFeatureReferenceUtil.toOperationCall(variableFeatureReference);
		opCall.setName(operation.getName());
		opCall.setEOperation(operation);
		opCall.setArgumentsList(argumentsList);
		program.getOperationCalls().add(opCall);
		return opCall;
	}

	/**
	 * Invokes an operation call.
	 *
	 * @param cx Rhino context
	 * @param scope Scope of the method called
	 * @param thisObj Object of the method called
	 * @param args Arguments of the method called
	 * @return the value of the {@link OperationCallResult}
	 */
	@Override
	public Object call(Context cx, Scriptable scope, Scriptable thisObj, Object[] args) {
		ArgumentsList argumentsList = createArgumentsList(args);
		OperationCall opCall = createOperationCall(argumentsList);

		OperationCallResult opCallResult = ApogyCoreInvocatorFacade.INSTANCE.exec(opCall, true);
		Object value = ApogyCoreInvocatorFacade.INSTANCE.getValue(opCallResult);

		return Context.javaToJS(value, scope);
	}
}