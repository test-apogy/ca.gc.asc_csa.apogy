/**
 * <copyright>
 * </copyright>
 *
 * $Id: TransformNode.java,v 1.3.2.2 2015/02/03 20:01:29 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import javax.vecmath.Matrix4d;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transform Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.topology.TopologyPackage#getTransformNode()
 * @model
 * @generated
 */
public interface TransformNode extends PositionNode, RotationNode {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	Matrix4d asMatrix4d();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model matrixDataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	void setTransformation(Matrix4d matrix);

} // TransformNode
