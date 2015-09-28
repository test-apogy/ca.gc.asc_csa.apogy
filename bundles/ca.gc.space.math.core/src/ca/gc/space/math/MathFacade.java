/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.math;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.math.impl.MathFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.math.MathPackage#getMathFacade()
 * @model
 * @generated
 */
public interface MathFacade extends EObject {

	public static final MathFacade INSTANCE = MathFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model matrixDataType="ca.gc.space.math.Matrix4d"
	 * @generated
	 */
	Matrix4x4 createMatrix4x4(Matrix4d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model matrixDataType="ca.gc.space.math.Matrix3d"
	 * @generated
	 */
	Matrix3x3 createMatrix3x3(Matrix3d matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model tupleDataType="ca.gc.space.math.VecmathTuple3d"
	 * @generated
	 */
	Tuple3d createTuple3d(javax.vecmath.Tuple3d tuple);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
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
	 * @model coeffsDataType="ca.gc.space.math.EDoubleArray"
	 * @generated
	 */
	Polynomial createPolynomial(double[] coeffs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Matrix4x4 createIdentityMatrix4x4();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Matrix3x3 createIdentityMatrix3x3();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tuple3d extractPosition(Matrix4x4 matrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Tuple3d extractOrientation(Matrix4x4 matrix);

} // MathFacade
