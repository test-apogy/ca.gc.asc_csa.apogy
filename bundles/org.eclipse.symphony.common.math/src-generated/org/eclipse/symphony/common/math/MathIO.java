/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.math;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.math.MathPackage#getMathIO()
 * @model
 * @generated
 */
public interface MathIO extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.math.Exception" fileNameUnique="false"
	 * @generated
	 */
	Matrix4x4 readTrMatrix(String fileName) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.math.Exception" trMatrixUnique="false" fileNameUnique="false"
	 * @generated
	 */
	void writeTrMatrix(Matrix4x4 trMatrix, String fileName) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.math.Exception" trMatrixDataType="org.eclipse.symphony.common.math.Matrix4d" trMatrixUnique="false" fileNameUnique="false"
	 * @generated
	 */
	void writeTrMatrix(Matrix4d trMatrix, String fileName) throws Exception;

} // MathIO
