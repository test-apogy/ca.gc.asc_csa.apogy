/**
 * <copyright>
 * </copyright>
 *
 * $Id: RotationNode.java,v 1.3.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import ca.gc.space.math.Matrix3x3;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Rotation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getRotationNode()
 * @model
 * @generated
 */
public interface RotationNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * The rotation is assumed to be XYZ.
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Matrix</em>' containment reference.
	 * @see #setRotationMatrix(Matrix3x3)
	 * @see ca.gc.space.topology.TopologyPackage#getRotationNode_RotationMatrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix3x3 getRotationMatrix();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Matrix</em>' containment reference.
	 * @see #getRotationMatrix()
	 * @generated
	 */
	void setRotationMatrix(Matrix3x3 value);

} // RotationNode
