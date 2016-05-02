/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsListProgramRuntime;
import ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Calls List Program Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OperationCallsListProgramRuntimeImpl extends AbstractProgramRuntimeImpl implements OperationCallsListProgramRuntime {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallsListProgramRuntimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.OPERATION_CALLS_LIST_PROGRAM_RUNTIME;
	}

	// FIXME To Implement.
	@Override
	public void init() {
		System.out.println("OperationCallsListProgramRuntimeImpl.init()");
		setState(ProgramRuntimeState.INITIALIZED);
	}

	// FIXME To Implement.
	@Override
	public void terminate() {
		System.out.println("OperationCallsListProgramRuntimeImpl.terminate()");
		setState(ProgramRuntimeState.TERMINATED);
	}

	// FIXME To Implement.
	@Override
	public void resume() {
		System.out.println("OperationCallsListProgramRuntimeImpl.resume()");
		setState(ProgramRuntimeState.RUNNING);
	}

	// FIXME To Implement.
	@Override
	public void suspend() {
		System.out.println("OperationCallsListProgramRuntimeImpl.suspend()");
		setState(ProgramRuntimeState.SUSPENDED);
	}

	// FIXME To Implement.
	@Override
	public void stepInto() {
		System.out.println("OperationCallsListProgramRuntimeImpl.stepInto()");		
	}

	// FIXME To Implement.
	@Override
	public void stepOver() {
		System.out.println("OperationCallsListProgramRuntimeImpl.stepOver()");
	}

	// FIXME To Implement.
	@Override
	public void stepReturn() {
		System.out.println("OperationCallsListProgramRuntimeImpl.stepReturn()");		
	}

} //OperationCallsListProgramRuntimeImpl