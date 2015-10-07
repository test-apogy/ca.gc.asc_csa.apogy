/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import ca.gc.space.topology.AggregateGroupNode;

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
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ResultNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getResultNode()
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
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getResultNode_Result()
	 * @model transient="true"
	 * @generated
	 */
	PositionedResult getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ResultNode#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(PositionedResult value);

} // ResultNode
