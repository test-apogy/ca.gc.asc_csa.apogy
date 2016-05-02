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
package ca.gc.asc_csa.apogy.core.invocator;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Program Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class provides the runtime context used while running a {@link Program}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getState <em>State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractProgramRuntime()
 * @model abstract="true"
 * @generated
 */
public interface AbstractProgramRuntime extends Named, Described {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>"Not Initialized"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Actual state of the runtime.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState
	 * @see #setState(ProgramRuntimeState)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractProgramRuntime_State()
	 * @model default="Not Initialized" unique="false"
	 * @generated
	 */
	ProgramRuntimeState getState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimeState
	 * @see #getState()
	 * @generated
	 */
	void setState(ProgramRuntimeState value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Refers the program to execute and monitor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractProgramRuntime_Program()
	 * @model
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializes the runtime.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clears and terminates the runtime.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void terminate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resumes the execution.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void resume();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Suspends the execution.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void suspend();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steps into the next function/operation/program call at the currently executing piece of code.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stepInto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steps over the next function/operation/program call at the currently executing piece of code.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stepOver();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns from a method/operation/program which has been stepped into. Even though we return from the method,
	 * the remainder of the code inside the method will be executed normally.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stepReturn();

} // AbstractProgramRuntime
