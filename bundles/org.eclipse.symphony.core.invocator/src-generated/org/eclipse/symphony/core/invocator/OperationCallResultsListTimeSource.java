/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import ca.gc.asc_csa.eclipse.emf.ecore.CollectionTimedTimeSource;

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
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource#getOpsCallList <em>Ops Call List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getOperationCallResultsListTimeSource()
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
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getOperationCallResultsListTimeSource_OpsCallList()
	 * @model
	 * @generated
	 */
	OperationCallResultsList getOpsCallList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.OperationCallResultsListTimeSource#getOpsCallList <em>Ops Call List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ops Call List</em>' reference.
	 * @see #getOpsCallList()
	 * @generated
	 */
	void setOpsCallList(OperationCallResultsList value);

} // OperationCallResultsListTimeSource
