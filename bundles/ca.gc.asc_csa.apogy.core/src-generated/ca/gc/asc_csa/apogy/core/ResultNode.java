/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Result Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Specialized Nodes.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ResultNode#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultNode()
 * @model
 * @generated
 */
public interface ResultNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
	 * PositionedResult represented by this node. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(PositionedResult)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultNode_Result()
	 * @model transient="true"
	 * @generated
	 */
	PositionedResult getResult();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ResultNode#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(PositionedResult value);

} // ResultNode
