/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.impl;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.Symphony__CommonMathFactory;
import org.eclipse.symphony.common.math.MathIO;
import org.eclipse.symphony.common.math.Symphony__CommonMathPackage;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Polynomial;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonMathFactoryImpl extends EFactoryImpl implements Symphony__CommonMathFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CommonMathFactory init() {
		try {
			Symphony__CommonMathFactory theSymphony__CommonMathFactory = (Symphony__CommonMathFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CommonMathPackage.eNS_URI);
			if (theSymphony__CommonMathFactory != null) {
				return theSymphony__CommonMathFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CommonMathFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonMathFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__CommonMathPackage.TUPLE3D: return createTuple3d();
			case Symphony__CommonMathPackage.MATRIX3X3: return createMatrix3x3();
			case Symphony__CommonMathPackage.MATRIX4X4: return createMatrix4x4();
			case Symphony__CommonMathPackage.POLYNOMIAL: return createPolynomial();
			case Symphony__CommonMathPackage.MATH_FACADE: return createMathFacade();
			case Symphony__CommonMathPackage.MATH_IO: return createMathIO();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonMathPackage.EDOUBLE_ARRAY:
				return createEDoubleArrayFromString(eDataType, initialValue);
			case Symphony__CommonMathPackage.MATRIX3D:
				return createMatrix3dFromString(eDataType, initialValue);
			case Symphony__CommonMathPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case Symphony__CommonMathPackage.VECMATH_TUPLE3D:
				return createVecmathTuple3dFromString(eDataType, initialValue);
			case Symphony__CommonMathPackage.EXCEPTION:
				return createExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CommonMathPackage.EDOUBLE_ARRAY:
				return convertEDoubleArrayToString(eDataType, instanceValue);
			case Symphony__CommonMathPackage.MATRIX3D:
				return convertMatrix3dToString(eDataType, instanceValue);
			case Symphony__CommonMathPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case Symphony__CommonMathPackage.VECMATH_TUPLE3D:
				return convertVecmathTuple3dToString(eDataType, instanceValue);
			case Symphony__CommonMathPackage.EXCEPTION:
				return convertExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4x4 createMatrix4x4() {
		Matrix4x4Impl matrix4x4 = new Matrix4x4Impl();
		return matrix4x4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MathFacade createMathFacade() {
		MathFacadeImpl mathFacade = new MathFacadeImpl();
		return mathFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3x3 createMatrix3x3() {
		Matrix3x3Impl matrix3x3 = new Matrix3x3Impl();
		return matrix3x3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d createTuple3d() {
		Tuple3dImpl tuple3d = new Tuple3dImpl();
		return tuple3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polynomial createPolynomial() {
		PolynomialImpl polynomial = new PolynomialImpl();
		return polynomial;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MathIO createMathIO()
  {
		MathIOImpl mathIO = new MathIOImpl();
		return mathIO;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double[] createEDoubleArrayFromString(EDataType eDataType, String initialValue) {
		return (double[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3d createMatrix3dFromString(EDataType eDataType, String initialValue) {
		return (Matrix3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix4d createMatrix4dFromString(EDataType eDataType, String initialValue) {
		return (Matrix4d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatrix4dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public javax.vecmath.Tuple3d createVecmathTuple3dFromString(EDataType eDataType, String initialValue) {
		return (javax.vecmath.Tuple3d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVecmathTuple3dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exception createExceptionFromString(EDataType eDataType, String initialValue) {
		return (Exception)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExceptionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonMathPackage getSymphony__CommonMathPackage() {
		return (Symphony__CommonMathPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CommonMathPackage getPackage() {
		return Symphony__CommonMathPackage.eINSTANCE;
	}

} //Symphony__CommonMathFactoryImpl
