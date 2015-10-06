/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.impl;

import java.lang.reflect.InvocationTargetException;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.GeometricUtils;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Polynomial;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MathFacadeImpl extends MinimalEObjectImpl.Container implements MathFacade {

	private static MathFacade instance;

	public static MathFacade getInstance() {
		if (instance == null) {
			instance = new MathFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MathFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MathPackage.Literals.MATH_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix4x4 createMatrix4x4(Matrix4d matrix) {

		Matrix4x4 result = MathFactory.eINSTANCE.createMatrix4x4();

		// Row 0
		result.setM00(matrix.m00);
		result.setM01(matrix.m01);
		result.setM02(matrix.m02);
		result.setM03(matrix.m03);

		// Row 1
		result.setM10(matrix.m10);
		result.setM11(matrix.m11);
		result.setM12(matrix.m12);
		result.setM13(matrix.m13);

		// Row 2
		result.setM20(matrix.m20);
		result.setM21(matrix.m21);
		result.setM22(matrix.m22);
		result.setM23(matrix.m23);

		// Row 3
		result.setM30(matrix.m30);
		result.setM31(matrix.m31);
		result.setM32(matrix.m32);
		result.setM33(matrix.m33);

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Matrix3x3 createMatrix3x3(Matrix3d matrix) {

		Matrix3x3 result = MathFactory.eINSTANCE.createMatrix3x3();
		// Row 0
		result.setM00(matrix.m00);
		result.setM01(matrix.m01);
		result.setM02(matrix.m02);

		// Row 1
		result.setM10(matrix.m10);
		result.setM11(matrix.m11);
		result.setM12(matrix.m12);

		// Row 2
		result.setM20(matrix.m20);
		result.setM21(matrix.m21);
		result.setM22(matrix.m22);

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d createTuple3d(javax.vecmath.Tuple3d tuple) 
	{
		org.eclipse.symphony.common.math.Tuple3d result = MathFactory.eINSTANCE.createTuple3d();

		result.setX(tuple.x);
		result.setY(tuple.y);
		result.setZ(tuple.z);

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public org.eclipse.symphony.common.math.Tuple3d createTuple3d(double x, double y, double z) {
		org.eclipse.symphony.common.math.Tuple3d result = MathFactory.eINSTANCE.createTuple3d();

		result.setX(x);
		result.setY(y);
		result.setZ(z);

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polynomial createPolynomial(double coeffs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Polynomial createPolynomial(double[] coeffs) {
		Polynomial poly = MathFactory.eINSTANCE.createPolynomial();

		poly.setCoeffs(coeffs);

		return poly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Matrix4x4 createIdentityMatrix4x4() 
	{
		Matrix4d m = new Matrix4d();
		m.setIdentity();		
		return createMatrix4x4(m);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Matrix3x3 createIdentityMatrix3x3() 
	{
		Matrix3d m = new Matrix3d();
		m.setIdentity();		
		return createMatrix3x3(m);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d extractPosition(Matrix4x4 matrix) {
		Tuple3d position = MathFactory.eINSTANCE.createTuple3d();
		Vector3d v = new Vector3d();
		matrix.asMatrix4d().get(v);
		position.setX(v.x);
		position.setY(v.y);
		position.setZ(v.z);
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d extractOrientation(Matrix4x4 matrix) 
	{
		Tuple3d orientation = MathFactory.eINSTANCE.createTuple3d();
		Matrix3d rotation = new Matrix3d();
		rotation.setIdentity();
		matrix.asMatrix4d().get(rotation);
		
		Vector3d rotationVector = GeometricUtils.extractRotationFromXYZRotMatrix(rotation);
		orientation.setX(rotationVector.x);
		orientation.setY(rotationVector.y);
		orientation.setZ(rotationVector.z);

		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MathPackage.MATH_FACADE___CREATE_MATRIX4X4__MATRIX4D:
				return createMatrix4x4((Matrix4d)arguments.get(0));
			case MathPackage.MATH_FACADE___CREATE_MATRIX3X3__MATRIX3D:
				return createMatrix3x3((Matrix3d)arguments.get(0));
			case MathPackage.MATH_FACADE___CREATE_TUPLE3D__TUPLE3D:
				return createTuple3d((javax.vecmath.Tuple3d)arguments.get(0));
			case MathPackage.MATH_FACADE___CREATE_TUPLE3D__DOUBLE_DOUBLE_DOUBLE:
				return createTuple3d((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case MathPackage.MATH_FACADE___CREATE_POLYNOMIAL__DOUBLE:
				return createPolynomial((Double)arguments.get(0));
			case MathPackage.MATH_FACADE___CREATE_IDENTITY_MATRIX4X4:
				return createIdentityMatrix4x4();
			case MathPackage.MATH_FACADE___CREATE_IDENTITY_MATRIX3X3:
				return createIdentityMatrix3x3();
			case MathPackage.MATH_FACADE___EXTRACT_POSITION__MATRIX4X4:
				return extractPosition((Matrix4x4)arguments.get(0));
			case MathPackage.MATH_FACADE___EXTRACT_ORIENTATION__MATRIX4X4:
				return extractOrientation((Matrix4x4)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // MathFacadeImpl
