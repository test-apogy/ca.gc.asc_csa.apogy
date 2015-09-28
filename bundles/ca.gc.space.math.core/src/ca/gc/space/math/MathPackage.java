/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.math;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.space.math.MathFactory
 * @model kind="package"
 * @generated
 */
public interface MathPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "math";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ca/gc/space/math.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ca.gc.space";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MathPackage eINSTANCE = ca.gc.space.math.impl.MathPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.space.math.impl.Matrix4x4Impl <em>Matrix4x4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.Matrix4x4Impl
	 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix4x4()
	 * @generated
	 */
	int MATRIX4X4 = 0;

	/**
	 * The feature id for the '<em><b>M00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M00 = 0;

	/**
	 * The feature id for the '<em><b>M01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M01 = 1;

	/**
	 * The feature id for the '<em><b>M02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M02 = 2;

	/**
	 * The feature id for the '<em><b>M03</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M03 = 3;

	/**
	 * The feature id for the '<em><b>M10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M10 = 4;

	/**
	 * The feature id for the '<em><b>M11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M11 = 5;

	/**
	 * The feature id for the '<em><b>M12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M12 = 6;

	/**
	 * The feature id for the '<em><b>M13</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M13 = 7;

	/**
	 * The feature id for the '<em><b>M20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M20 = 8;

	/**
	 * The feature id for the '<em><b>M21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M21 = 9;

	/**
	 * The feature id for the '<em><b>M22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M22 = 10;

	/**
	 * The feature id for the '<em><b>M23</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M23 = 11;

	/**
	 * The feature id for the '<em><b>M30</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATRIX4X4__M30 = 12;

  /**
	 * The feature id for the '<em><b>M31</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M31 = 13;

	/**
	 * The feature id for the '<em><b>M32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M32 = 14;

	/**
	 * The feature id for the '<em><b>M33</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4__M33 = 15;

	/**
	 * The number of structural features of the '<em>Matrix4x4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link ca.gc.space.math.impl.MathFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.MathFacadeImpl
	 * @see ca.gc.space.math.impl.MathPackageImpl#getMathFacade()
	 * @generated
	 */
	int MATH_FACADE = 1;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_FACADE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.space.math.impl.Matrix3x3Impl <em>Matrix3x3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.Matrix3x3Impl
	 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix3x3()
	 * @generated
	 */
	int MATRIX3X3 = 2;

	/**
	 * The feature id for the '<em><b>M00</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M00 = 0;

	/**
	 * The feature id for the '<em><b>M01</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M01 = 1;

	/**
	 * The feature id for the '<em><b>M02</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M02 = 2;

	/**
	 * The feature id for the '<em><b>M10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M10 = 3;

	/**
	 * The feature id for the '<em><b>M11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M11 = 4;

	/**
	 * The feature id for the '<em><b>M12</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M12 = 5;

	/**
	 * The feature id for the '<em><b>M20</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M20 = 6;

	/**
	 * The feature id for the '<em><b>M21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M21 = 7;

	/**
	 * The feature id for the '<em><b>M22</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3__M22 = 8;

	/**
	 * The number of structural features of the '<em>Matrix3x3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link ca.gc.space.math.impl.Tuple3dImpl <em>Tuple3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.Tuple3dImpl
	 * @see ca.gc.space.math.impl.MathPackageImpl#getTuple3d()
	 * @generated
	 */
	int TUPLE3D = 3;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE3D__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE3D__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE3D__Z = 2;

	/**
	 * The number of structural features of the '<em>Tuple3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE3D_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ca.gc.space.math.impl.PolynomialImpl <em>Polynomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.PolynomialImpl
	 * @see ca.gc.space.math.impl.MathPackageImpl#getPolynomial()
	 * @generated
	 */
	int POLYNOMIAL = 4;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL__DEGREE = 0;

	/**
	 * The feature id for the '<em><b>Coeffs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL__COEFFS = 1;

	/**
	 * The feature id for the '<em><b>Real Roots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL__REAL_ROOTS = 2;

	/**
	 * The feature id for the '<em><b>Imaginary Roots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL__IMAGINARY_ROOTS = 3;

	/**
	 * The number of structural features of the '<em>Polynomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link ca.gc.space.math.impl.MathIOImpl <em>IO</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.MathIOImpl
	 * @see ca.gc.space.math.impl.MathPackageImpl#getMathIO()
	 * @generated
	 */
  int MATH_IO = 5;

  /**
	 * The number of structural features of the '<em>IO</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MATH_IO_FEATURE_COUNT = 0;

  /**
	 * The meta object id for the '<em>EDouble Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.space.math.impl.MathPackageImpl#getEDoubleArray()
	 * @generated
	 */
	int EDOUBLE_ARRAY = 6;

	/**
	 * The meta object id for the '<em>Matrix3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix3d
	 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix3d()
	 * @generated
	 */
	int MATRIX3D = 7;

		/**
	 * The meta object id for the '<em>Matrix4d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix4d
	 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix4d()
	 * @generated
	 */
	int MATRIX4D = 8;

		/**
	 * The meta object id for the '<em>Vecmath Tuple3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Tuple3d
	 * @see ca.gc.space.math.impl.MathPackageImpl#getVecmathTuple3d()
	 * @generated
	 */
	int VECMATH_TUPLE3D = 9;

		/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.space.math.impl.MathPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 10;

	/**
	 * Returns the meta object for class '{@link ca.gc.space.math.Matrix4x4 <em>Matrix4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix4x4</em>'.
	 * @see ca.gc.space.math.Matrix4x4
	 * @generated
	 */
	EClass getMatrix4x4();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM00 <em>M00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M00</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM00()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M00();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM01 <em>M01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M01</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM01()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M01();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM02 <em>M02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M02</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM02()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M02();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM03 <em>M03</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M03</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM03()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M03();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM10 <em>M10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M10</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM10()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M10();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM11 <em>M11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M11</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM11()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M11();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM12 <em>M12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M12</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM12()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M12();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM13 <em>M13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M13</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM13()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M13();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM20 <em>M20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M20</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM20()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M20();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM21 <em>M21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M21</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM21()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M21();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM22 <em>M22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M22</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM22()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M22();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM23 <em>M23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M23</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM23()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M23();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM30 <em>M30</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M30</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM30()
	 * @see #getMatrix4x4()
	 * @generated
	 */
  EAttribute getMatrix4x4_M30();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM31 <em>M31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M31</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM31()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M31();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM32 <em>M32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M32</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM32()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M32();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix4x4#getM33 <em>M33</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M33</em>'.
	 * @see ca.gc.space.math.Matrix4x4#getM33()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M33();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.math.MathFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.space.math.MathFacade
	 * @generated
	 */
	EClass getMathFacade();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.math.Matrix3x3 <em>Matrix3x3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix3x3</em>'.
	 * @see ca.gc.space.math.Matrix3x3
	 * @generated
	 */
	EClass getMatrix3x3();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM00 <em>M00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M00</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM00()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M00();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM01 <em>M01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M01</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM01()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M01();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM02 <em>M02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M02</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM02()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M02();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM10 <em>M10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M10</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM10()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M10();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM11 <em>M11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M11</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM11()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M11();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM12 <em>M12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M12</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM12()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M12();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM20 <em>M20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M20</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM20()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M20();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM21 <em>M21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M21</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM21()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M21();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Matrix3x3#getM22 <em>M22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M22</em>'.
	 * @see ca.gc.space.math.Matrix3x3#getM22()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M22();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.math.Tuple3d <em>Tuple3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple3d</em>'.
	 * @see ca.gc.space.math.Tuple3d
	 * @generated
	 */
	EClass getTuple3d();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Tuple3d#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ca.gc.space.math.Tuple3d#getX()
	 * @see #getTuple3d()
	 * @generated
	 */
	EAttribute getTuple3d_X();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Tuple3d#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ca.gc.space.math.Tuple3d#getY()
	 * @see #getTuple3d()
	 * @generated
	 */
	EAttribute getTuple3d_Y();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Tuple3d#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see ca.gc.space.math.Tuple3d#getZ()
	 * @see #getTuple3d()
	 * @generated
	 */
	EAttribute getTuple3d_Z();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.math.Polynomial <em>Polynomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polynomial</em>'.
	 * @see ca.gc.space.math.Polynomial
	 * @generated
	 */
	EClass getPolynomial();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Polynomial#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see ca.gc.space.math.Polynomial#getDegree()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_Degree();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Polynomial#getCoeffs <em>Coeffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeffs</em>'.
	 * @see ca.gc.space.math.Polynomial#getCoeffs()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_Coeffs();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Polynomial#getRealRoots <em>Real Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Roots</em>'.
	 * @see ca.gc.space.math.Polynomial#getRealRoots()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_RealRoots();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.space.math.Polynomial#getImaginaryRoots <em>Imaginary Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imaginary Roots</em>'.
	 * @see ca.gc.space.math.Polynomial#getImaginaryRoots()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_ImaginaryRoots();

	/**
	 * Returns the meta object for class '{@link ca.gc.space.math.MathIO <em>IO</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO</em>'.
	 * @see ca.gc.space.math.MathIO
	 * @generated
	 */
  EClass getMathIO();

  /**
	 * Returns the meta object for data type '<em>EDouble Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Array</em>'.
	 * @model instanceClass="double[]"
	 * @generated
	 */
	EDataType getEDoubleArray();

	/**
	 * Returns the meta object for data type '{@link javax.vecmath.Matrix3d <em>Matrix3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Matrix3d</em>'.
	 * @see javax.vecmath.Matrix3d
	 * @model instanceClass="javax.vecmath.Matrix3d"
	 * @generated
	 */
	EDataType getMatrix3d();

		/**
	 * Returns the meta object for data type '{@link javax.vecmath.Matrix4d <em>Matrix4d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Matrix4d</em>'.
	 * @see javax.vecmath.Matrix4d
	 * @model instanceClass="javax.vecmath.Matrix4d"
	 * @generated
	 */
	EDataType getMatrix4d();

		/**
	 * Returns the meta object for data type '{@link javax.vecmath.Tuple3d <em>Vecmath Tuple3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vecmath Tuple3d</em>'.
	 * @see javax.vecmath.Tuple3d
	 * @model instanceClass="javax.vecmath.Tuple3d"
	 * @generated
	 */
	EDataType getVecmathTuple3d();

		/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MathFactory getMathFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.space.math.impl.Matrix4x4Impl <em>Matrix4x4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.Matrix4x4Impl
		 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix4x4()
		 * @generated
		 */
		EClass MATRIX4X4 = eINSTANCE.getMatrix4x4();

		/**
		 * The meta object literal for the '<em><b>M00</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M00 = eINSTANCE.getMatrix4x4_M00();

		/**
		 * The meta object literal for the '<em><b>M01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M01 = eINSTANCE.getMatrix4x4_M01();

		/**
		 * The meta object literal for the '<em><b>M02</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M02 = eINSTANCE.getMatrix4x4_M02();

		/**
		 * The meta object literal for the '<em><b>M03</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M03 = eINSTANCE.getMatrix4x4_M03();

		/**
		 * The meta object literal for the '<em><b>M10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M10 = eINSTANCE.getMatrix4x4_M10();

		/**
		 * The meta object literal for the '<em><b>M11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M11 = eINSTANCE.getMatrix4x4_M11();

		/**
		 * The meta object literal for the '<em><b>M12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M12 = eINSTANCE.getMatrix4x4_M12();

		/**
		 * The meta object literal for the '<em><b>M13</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M13 = eINSTANCE.getMatrix4x4_M13();

		/**
		 * The meta object literal for the '<em><b>M20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M20 = eINSTANCE.getMatrix4x4_M20();

		/**
		 * The meta object literal for the '<em><b>M21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M21 = eINSTANCE.getMatrix4x4_M21();

		/**
		 * The meta object literal for the '<em><b>M22</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M22 = eINSTANCE.getMatrix4x4_M22();

		/**
		 * The meta object literal for the '<em><b>M23</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M23 = eINSTANCE.getMatrix4x4_M23();

		/**
		 * The meta object literal for the '<em><b>M30</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute MATRIX4X4__M30 = eINSTANCE.getMatrix4x4_M30();

    /**
		 * The meta object literal for the '<em><b>M31</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M31 = eINSTANCE.getMatrix4x4_M31();

		/**
		 * The meta object literal for the '<em><b>M32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M32 = eINSTANCE.getMatrix4x4_M32();

		/**
		 * The meta object literal for the '<em><b>M33</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX4X4__M33 = eINSTANCE.getMatrix4x4_M33();

		/**
		 * The meta object literal for the '{@link ca.gc.space.math.impl.MathFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.MathFacadeImpl
		 * @see ca.gc.space.math.impl.MathPackageImpl#getMathFacade()
		 * @generated
		 */
		EClass MATH_FACADE = eINSTANCE.getMathFacade();

		/**
		 * The meta object literal for the '{@link ca.gc.space.math.impl.Matrix3x3Impl <em>Matrix3x3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.Matrix3x3Impl
		 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix3x3()
		 * @generated
		 */
		EClass MATRIX3X3 = eINSTANCE.getMatrix3x3();

		/**
		 * The meta object literal for the '<em><b>M00</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M00 = eINSTANCE.getMatrix3x3_M00();

		/**
		 * The meta object literal for the '<em><b>M01</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M01 = eINSTANCE.getMatrix3x3_M01();

		/**
		 * The meta object literal for the '<em><b>M02</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M02 = eINSTANCE.getMatrix3x3_M02();

		/**
		 * The meta object literal for the '<em><b>M10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M10 = eINSTANCE.getMatrix3x3_M10();

		/**
		 * The meta object literal for the '<em><b>M11</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M11 = eINSTANCE.getMatrix3x3_M11();

		/**
		 * The meta object literal for the '<em><b>M12</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M12 = eINSTANCE.getMatrix3x3_M12();

		/**
		 * The meta object literal for the '<em><b>M20</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M20 = eINSTANCE.getMatrix3x3_M20();

		/**
		 * The meta object literal for the '<em><b>M21</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M21 = eINSTANCE.getMatrix3x3_M21();

		/**
		 * The meta object literal for the '<em><b>M22</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX3X3__M22 = eINSTANCE.getMatrix3x3_M22();

		/**
		 * The meta object literal for the '{@link ca.gc.space.math.impl.Tuple3dImpl <em>Tuple3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.Tuple3dImpl
		 * @see ca.gc.space.math.impl.MathPackageImpl#getTuple3d()
		 * @generated
		 */
		EClass TUPLE3D = eINSTANCE.getTuple3d();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE3D__X = eINSTANCE.getTuple3d_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE3D__Y = eINSTANCE.getTuple3d_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUPLE3D__Z = eINSTANCE.getTuple3d_Z();

		/**
		 * The meta object literal for the '{@link ca.gc.space.math.impl.PolynomialImpl <em>Polynomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.PolynomialImpl
		 * @see ca.gc.space.math.impl.MathPackageImpl#getPolynomial()
		 * @generated
		 */
		EClass POLYNOMIAL = eINSTANCE.getPolynomial();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYNOMIAL__DEGREE = eINSTANCE.getPolynomial_Degree();

		/**
		 * The meta object literal for the '<em><b>Coeffs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYNOMIAL__COEFFS = eINSTANCE.getPolynomial_Coeffs();

		/**
		 * The meta object literal for the '<em><b>Real Roots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYNOMIAL__REAL_ROOTS = eINSTANCE.getPolynomial_RealRoots();

		/**
		 * The meta object literal for the '<em><b>Imaginary Roots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYNOMIAL__IMAGINARY_ROOTS = eINSTANCE.getPolynomial_ImaginaryRoots();

		/**
		 * The meta object literal for the '{@link ca.gc.space.math.impl.MathIOImpl <em>IO</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.MathIOImpl
		 * @see ca.gc.space.math.impl.MathPackageImpl#getMathIO()
		 * @generated
		 */
    EClass MATH_IO = eINSTANCE.getMathIO();

    /**
		 * The meta object literal for the '<em>EDouble Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.space.math.impl.MathPackageImpl#getEDoubleArray()
		 * @generated
		 */
		EDataType EDOUBLE_ARRAY = eINSTANCE.getEDoubleArray();

				/**
		 * The meta object literal for the '<em>Matrix3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix3d
		 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix3d()
		 * @generated
		 */
		EDataType MATRIX3D = eINSTANCE.getMatrix3d();

				/**
		 * The meta object literal for the '<em>Matrix4d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix4d
		 * @see ca.gc.space.math.impl.MathPackageImpl#getMatrix4d()
		 * @generated
		 */
		EDataType MATRIX4D = eINSTANCE.getMatrix4d();

				/**
		 * The meta object literal for the '<em>Vecmath Tuple3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Tuple3d
		 * @see ca.gc.space.math.impl.MathPackageImpl#getVecmathTuple3d()
		 * @generated
		 */
		EDataType VECMATH_TUPLE3D = eINSTANCE.getVecmathTuple3d();

				/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.space.math.impl.MathPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //MathPackage
