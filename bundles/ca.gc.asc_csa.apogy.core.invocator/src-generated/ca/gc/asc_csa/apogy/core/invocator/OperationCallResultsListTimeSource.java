package ca.gc.asc_csa.apogy.core.invocator;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.emf.CollectionTimedTimeSource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Results List Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Specialized Time Sources
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource#getOpsCallList <em>Ops Call List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getOperationCallResultsListTimeSource()
 * @model
 * @generated
 */
public interface OperationCallResultsListTimeSource extends CollectionTimedTimeSource {
	/**
	 * Returns the value of the '<em><b>Ops Call List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops Call List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops Call List</em>' reference.
	 * @see #setOpsCallList(OperationCallResultsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getOperationCallResultsListTimeSource_OpsCallList()
	 * @model
	 * @generated
	 */
	OperationCallResultsList getOpsCallList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsListTimeSource#getOpsCallList <em>Ops Call List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ops Call List</em>' reference.
	 * @see #getOpsCallList()
	 * @generated
	 */
	void setOpsCallList(OperationCallResultsList value);

} // OperationCallResultsListTimeSource
