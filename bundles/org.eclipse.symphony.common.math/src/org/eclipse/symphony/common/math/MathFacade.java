/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.math.impl.MathFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.math.MathPackage#getMathFacade()
 * @model
 * @generated
 */
public interface MathFacade extends EObject {

	public static final MathFacade INSTANCE = MathFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model unique="false" matrixDataType="org.eclipse.symphony.common.math.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	Matrix4x4 createMatrix4x4(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixDataType="org.eclipse.symphony.common.math.Matrix3d" matrixUnique="false"
	 * @generated
	 */
	Matrix3x3 createMatrix3x3(Matrix3d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" tupleDataType="org.eclipse.symphony.common.math.VecmathTuple3d" tupleUnique="false"
	 * @generated
	 */
	Tuple3d createTuple3d(javax.vecmath.Tuple3d tuple);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	Tuple3d createTuple3d(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param coeffs
	 *   The coefficients of the polynomial, sorted in increasing order.
	 *   coeffs[n-1]*x^n-1 + coeffs[n-2]*x^n-2 + ... + coeffs[0]
	 * <!-- end-model-doc -->
	 * @model unique="false" coeffsDataType="org.eclipse.symphony.common.math.EDoubleArray" coeffsUnique="false"
	 * @generated
	 */
	Polynomial createPolynomial(double[] coeffs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Matrix4x4 createIdentityMatrix4x4();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Matrix3x3 createIdentityMatrix3x3();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixUnique="false"
	 * @generated
	 */
	Tuple3d extractPosition(Matrix4x4 matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" matrixUnique="false"
	 * @generated
	 */
	Tuple3d extractOrientation(Matrix4x4 matrix);

} // MathFacade
