/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.asc_csa.apogy.common.math.impl;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.MathIO;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Polynomial;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonMathFactoryImpl extends EFactoryImpl implements ApogyCommonMathFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCommonMathFactory init() {
		try {
			ApogyCommonMathFactory theApogyCommonMathFactory = (ApogyCommonMathFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCommonMathPackage.eNS_URI);
			if (theApogyCommonMathFactory != null) {
				return theApogyCommonMathFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCommonMathFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonMathFactoryImpl() {
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
			case ApogyCommonMathPackage.TUPLE3D: return createTuple3d();
			case ApogyCommonMathPackage.MATRIX3X3: return createMatrix3x3();
			case ApogyCommonMathPackage.MATRIX4X4: return createMatrix4x4();
			case ApogyCommonMathPackage.POLYNOMIAL: return createPolynomial();
			case ApogyCommonMathPackage.APOGY_COMMON_MATH_FACADE: return createApogyCommonMathFacade();
			case ApogyCommonMathPackage.MATH_IO: return createMathIO();
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
			case ApogyCommonMathPackage.EDOUBLE_ARRAY:
				return createEDoubleArrayFromString(eDataType, initialValue);
			case ApogyCommonMathPackage.MATRIX3D:
				return createMatrix3dFromString(eDataType, initialValue);
			case ApogyCommonMathPackage.MATRIX4D:
				return createMatrix4dFromString(eDataType, initialValue);
			case ApogyCommonMathPackage.VECMATH_TUPLE3D:
				return createVecmathTuple3dFromString(eDataType, initialValue);
			case ApogyCommonMathPackage.EXCEPTION:
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
			case ApogyCommonMathPackage.EDOUBLE_ARRAY:
				return convertEDoubleArrayToString(eDataType, instanceValue);
			case ApogyCommonMathPackage.MATRIX3D:
				return convertMatrix3dToString(eDataType, instanceValue);
			case ApogyCommonMathPackage.MATRIX4D:
				return convertMatrix4dToString(eDataType, instanceValue);
			case ApogyCommonMathPackage.VECMATH_TUPLE3D:
				return convertVecmathTuple3dToString(eDataType, instanceValue);
			case ApogyCommonMathPackage.EXCEPTION:
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
	public ApogyCommonMathFacade createApogyCommonMathFacade() {
		ApogyCommonMathFacadeImpl apogyCommonMathFacade = new ApogyCommonMathFacadeImpl();
		return apogyCommonMathFacade;
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
	public ApogyCommonMathPackage getApogyCommonMathPackage() {
		return (ApogyCommonMathPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCommonMathPackage getPackage() {
		return ApogyCommonMathPackage.eINSTANCE;
	}

} //ApogyCommonMathFactoryImpl
