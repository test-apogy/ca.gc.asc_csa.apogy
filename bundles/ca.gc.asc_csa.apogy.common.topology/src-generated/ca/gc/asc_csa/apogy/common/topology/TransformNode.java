/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology;

import javax.vecmath.Matrix4d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getTransformNode()
 * @model
 * @generated
 */
public interface TransformNode extends PositionNode, RotationNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" unique="false"
	 * @generated
	 */
	Matrix4d asMatrix4d();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model matrixDataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	void setTransformation(Matrix4d matrix);

} // TransformNode
