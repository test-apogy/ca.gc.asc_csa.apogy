/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.math;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getMathIO()
 * @model
 * @generated
 */
public interface MathIO extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.math.Exception" fileNameUnique="false"
	 * @generated
	 */
	Matrix4x4 readTrMatrix(String fileName) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.math.Exception" trMatrixUnique="false" fileNameUnique="false"
	 * @generated
	 */
	void writeTrMatrix(Matrix4x4 trMatrix, String fileName) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.math.Exception" trMatrixDataType="ca.gc.asc_csa.apogy.common.math.Matrix4d" trMatrixUnique="false" fileNameUnique="false"
	 * @generated
	 */
	void writeTrMatrix(Matrix4d trMatrix, String fileName) throws Exception;

} // MathIO
