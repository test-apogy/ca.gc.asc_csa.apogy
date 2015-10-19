/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

import org.eclipse.symphony.common.math.Matrix3x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.TopologyPackage#getRotationNode()
 * @model
 * @generated
 */
public interface RotationNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Matrix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Matrix</em>' containment reference.
	 * @see #setRotationMatrix(Matrix3x3)
	 * @see org.eclipse.symphony.common.topology.TopologyPackage#getRotationNode_RotationMatrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix3x3 getRotationMatrix();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Matrix</em>' containment reference.
	 * @see #getRotationMatrix()
	 * @generated
	 */
	void setRotationMatrix(Matrix3x3 value);

} // RotationNode
