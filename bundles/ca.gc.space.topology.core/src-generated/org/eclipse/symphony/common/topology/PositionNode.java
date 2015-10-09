/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.PositionNode#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.TopologyPackage#getPositionNode()
 * @model
 * @generated
 */
public interface PositionNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Tuple3d)
	 * @see org.eclipse.symphony.common.topology.TopologyPackage#getPositionNode_Position()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.PositionNode#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Tuple3d value);

} // PositionNode
