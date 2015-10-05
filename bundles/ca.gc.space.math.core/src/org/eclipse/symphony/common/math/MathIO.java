/**
 */
package org.eclipse.symphony.common.math;

import java.io.IOException;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>IO</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.math.MathPackage#getMathIO()
 * @model
 * @generated
 */
public interface MathIO extends EObject {

	public static final MathIO INSTANCE = MathFactory.eINSTANCE.createMathIO();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.math.Exception"
	 * @generated
	 */
	Matrix4x4 readTrMatrix(String fileName) throws IOException, Exception;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.math.Exception"
	 * @generated
	 */
	void writeTrMatrix(Matrix4x4 trMatrix, String fileName) throws IOException, Exception;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="org.eclipse.symphony.common.math.Exception" trMatrixDataType="org.eclipse.symphony.common.math.Matrix4d"
	 * @generated
	 */
	void writeTrMatrix(Matrix4d trMatrix, String fileName) throws IOException, Exception;

} // MathIO
