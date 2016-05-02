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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Runtimes List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is a container of {@link AbstractProgramRuntime}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getSession <em>Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getProgramRuntimes <em>Program Runtimes</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramRuntimesList()
 * @model
 * @generated
 */
public interface ProgramRuntimesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramRuntimesList <em>Program Runtimes List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the session that contains the list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session</em>' container reference.
	 * @see #setSession(InvocatorSession)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramRuntimesList_Session()
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramRuntimesList
	 * @model opposite="programRuntimesList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' notify='true'"
	 * @generated
	 */
	InvocatorSession getSession();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList#getSession <em>Session</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' container reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(InvocatorSession value);

	/**
	 * Returns the value of the '<em><b>Program Runtimes</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List that contains runtimes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Runtimes</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramRuntimesList_ProgramRuntimes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractProgramRuntime> getProgramRuntimes();

} // ProgramRuntimesList
