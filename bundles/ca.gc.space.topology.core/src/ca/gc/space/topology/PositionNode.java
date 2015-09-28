/**
 * <copyright>
 * </copyright>
 *
 * $Id: PositionNode.java,v 1.3.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import ca.gc.space.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.PositionNode#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getPositionNode()
 * @model
 * @generated
 */
public interface PositionNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Tuple3d)
	 * @see ca.gc.space.topology.TopologyPackage#getPositionNode_Position()
	 * @model containment="true"
	 * @generated
	 */
	Tuple3d getPosition();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.PositionNode#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Tuple3d value);

} // PositionNode
