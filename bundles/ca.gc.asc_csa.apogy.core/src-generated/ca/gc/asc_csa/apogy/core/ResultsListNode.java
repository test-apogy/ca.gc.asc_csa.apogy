/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.core.invocator.ResultsList;

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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ResultsListNode#getResultsList <em>Results List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultsListNode()
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
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultsListNode_ResultsList()
	 * @model transient="true"
	 * @generated
	 */
	ResultsList getResultsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ResultsListNode#getResultsList <em>Results List</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Results List</em>' reference.
	 * @see #getResultsList()
	 * @generated
	 */
	void setResultsList(ResultsList value);

} // ResultsListNode
