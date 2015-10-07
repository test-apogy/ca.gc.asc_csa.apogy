/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ResultsList;
import ca.gc.space.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Results List Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized Topology node representing a ResultsList.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ResultsListNode#getResultsList <em>Results List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getResultsListNode()
 * @model
 * @generated
 */
public interface ResultsListNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Results List</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Results List</em>' reference.
	 * @see #setResultsList(ResultsList)
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getResultsListNode_ResultsList()
	 * @model transient="true"
	 * @generated
	 */
	ResultsList getResultsList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ResultsListNode#getResultsList <em>Results List</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Results List</em>' reference.
	 * @see #getResultsList()
	 * @generated
	 */
	void setResultsList(ResultsList value);

} // ResultsListNode
