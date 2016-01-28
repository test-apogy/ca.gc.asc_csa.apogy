/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.math;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonMath' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)' modelName='ApogyCommonMath' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.common.math/src-generated' editDirectory='/ca.gc.asc_csa.apogy.common.math.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.common'"
 * @generated
 */
public interface ApogyCommonMathPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.common.math";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "math";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonMathPackage eINSTANCE = ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.impl.Tuple3dImpl <em>Tuple3d</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.Tuple3dImpl
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getTuple3d()
	 * @generated
	 */
	int TUPLE3D = 0;

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
	 * The operation id for the '<em>As Tuple3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE3D___AS_TUPLE3D = 0;

	/**
	 * The number of operations of the '<em>Tuple3d</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE3D_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl <em>Matrix3x3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix3x3()
	 * @generated
	 */
	int MATRIX3X3 = 1;

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
	 * The operation id for the '<em>As Matrix3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3___AS_MATRIX3D = 0;

	/**
	 * The number of operations of the '<em>Matrix3x3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX3X3_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix4x4Impl <em>Matrix4x4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.Matrix4x4Impl
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix4x4()
	 * @generated
	 */
	int MATRIX4X4 = 2;

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
	 * The operation id for the '<em>As Matrix4d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4___AS_MATRIX4D = 0;

	/**
	 * The number of operations of the '<em>Matrix4x4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX4X4_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.impl.PolynomialImpl <em>Polynomial</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.PolynomialImpl
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getPolynomial()
	 * @generated
	 */
	int POLYNOMIAL = 3;

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
	 * The number of operations of the '<em>Polynomial</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYNOMIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getApogyCommonMathFacade()
	 * @generated
	 */
	int APOGY_COMMON_MATH_FACADE = 4;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Matrix4x4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_MATRIX4X4__MATRIX4D = 0;

	/**
	 * The operation id for the '<em>Create Matrix3x3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_MATRIX3X3__MATRIX3D = 1;

	/**
	 * The operation id for the '<em>Create Tuple3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_TUPLE3D__TUPLE3D = 2;

	/**
	 * The operation id for the '<em>Create Tuple3d</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_TUPLE3D__DOUBLE_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Create Polynomial</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_POLYNOMIAL__DOUBLE = 4;

	/**
	 * The operation id for the '<em>Create Identity Matrix4x4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_IDENTITY_MATRIX4X4 = 5;

	/**
	 * The operation id for the '<em>Create Identity Matrix3x3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___CREATE_IDENTITY_MATRIX3X3 = 6;

	/**
	 * The operation id for the '<em>Extract Position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___EXTRACT_POSITION__MATRIX4X4 = 7;

	/**
	 * The operation id for the '<em>Extract Orientation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE___EXTRACT_ORIENTATION__MATRIX4X4 = 8;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_MATH_FACADE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.math.impl.MathIOImpl <em>Math IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.MathIOImpl
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMathIO()
	 * @generated
	 */
	int MATH_IO = 5;

	/**
	 * The number of structural features of the '<em>Math IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_IO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Read Tr Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_IO___READ_TR_MATRIX__STRING = 0;

	/**
	 * The operation id for the '<em>Write Tr Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_IO___WRITE_TR_MATRIX__MATRIX4X4_STRING = 1;

	/**
	 * The operation id for the '<em>Write Tr Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_IO___WRITE_TR_MATRIX__MATRIX4D_STRING = 2;

	/**
	 * The number of operations of the '<em>Math IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATH_IO_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '<em>EDouble Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getEDoubleArray()
	 * @generated
	 */
	int EDOUBLE_ARRAY = 6;

	/**
	 * The meta object id for the '<em>Matrix3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix3d
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix3d()
	 * @generated
	 */
	int MATRIX3D = 7;

	/**
	 * The meta object id for the '<em>Matrix4d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Matrix4d
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix4d()
	 * @generated
	 */
	int MATRIX4D = 8;

	/**
	 * The meta object id for the '<em>Vecmath Tuple3d</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.vecmath.Tuple3d
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getVecmathTuple3d()
	 * @generated
	 */
	int VECMATH_TUPLE3D = 9;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 10;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d <em>Tuple3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple3d</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Tuple3d
	 * @generated
	 */
	EClass getTuple3d();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Tuple3d#getX()
	 * @see #getTuple3d()
	 * @generated
	 */
	EAttribute getTuple3d_X();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Tuple3d#getY()
	 * @see #getTuple3d()
	 * @generated
	 */
	EAttribute getTuple3d_Y();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Tuple3d#getZ()
	 * @see #getTuple3d()
	 * @generated
	 */
	EAttribute getTuple3d_Z();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.Tuple3d#asTuple3d() <em>As Tuple3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Tuple3d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.Tuple3d#asTuple3d()
	 * @generated
	 */
	EOperation getTuple3d__AsTuple3d();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3 <em>Matrix3x3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix3x3</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3
	 * @generated
	 */
	EClass getMatrix3x3();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM00 <em>M00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M00</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM00()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M00();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM01 <em>M01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M01</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM01()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M01();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM02 <em>M02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M02</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM02()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M02();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM10 <em>M10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M10</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM10()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M10();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM11 <em>M11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M11</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM11()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M11();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM12 <em>M12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M12</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM12()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M12();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM20 <em>M20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M20</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM20()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M20();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM21 <em>M21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M21</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM21()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M21();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM22 <em>M22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M22</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#getM22()
	 * @see #getMatrix3x3()
	 * @generated
	 */
	EAttribute getMatrix3x3_M22();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.Matrix3x3#asMatrix3d() <em>As Matrix3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Matrix3d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix3x3#asMatrix3d()
	 * @generated
	 */
	EOperation getMatrix3x3__AsMatrix3d();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4 <em>Matrix4x4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix4x4</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4
	 * @generated
	 */
	EClass getMatrix4x4();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM00 <em>M00</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M00</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM00()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M00();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM01 <em>M01</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M01</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM01()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M01();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM02 <em>M02</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M02</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM02()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M02();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM03 <em>M03</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M03</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM03()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M03();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM10 <em>M10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M10</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM10()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M10();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM11 <em>M11</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M11</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM11()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M11();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM12 <em>M12</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M12</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM12()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M12();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM13 <em>M13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M13</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM13()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M13();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM20 <em>M20</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M20</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM20()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M20();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM21 <em>M21</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M21</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM21()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M21();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM22 <em>M22</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M22</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM22()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M22();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM23 <em>M23</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M23</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM23()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M23();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM30 <em>M30</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M30</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM30()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M30();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM31 <em>M31</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M31</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM31()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M31();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM32 <em>M32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M32</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM32()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M32();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM33 <em>M33</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M33</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#getM33()
	 * @see #getMatrix4x4()
	 * @generated
	 */
	EAttribute getMatrix4x4_M33();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.Matrix4x4#asMatrix4d() <em>As Matrix4d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>As Matrix4d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.Matrix4x4#asMatrix4d()
	 * @generated
	 */
	EOperation getMatrix4x4__AsMatrix4d();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.Polynomial <em>Polynomial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polynomial</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Polynomial
	 * @generated
	 */
	EClass getPolynomial();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Polynomial#getDegree()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_Degree();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getCoeffs <em>Coeffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coeffs</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Polynomial#getCoeffs()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_Coeffs();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getRealRoots <em>Real Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Roots</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Polynomial#getRealRoots()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_RealRoots();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getImaginaryRoots <em>Imaginary Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imaginary Roots</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.Polynomial#getImaginaryRoots()
	 * @see #getPolynomial()
	 * @generated
	 */
	EAttribute getPolynomial_ImaginaryRoots();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade
	 * @generated
	 */
	EClass getApogyCommonMathFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createMatrix4x4(javax.vecmath.Matrix4d) <em>Create Matrix4x4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Matrix4x4</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createMatrix4x4(javax.vecmath.Matrix4d)
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreateMatrix4x4__Matrix4d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createMatrix3x3(javax.vecmath.Matrix3d) <em>Create Matrix3x3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Matrix3x3</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createMatrix3x3(javax.vecmath.Matrix3d)
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreateMatrix3x3__Matrix3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createTuple3d(javax.vecmath.Tuple3d) <em>Create Tuple3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Tuple3d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createTuple3d(javax.vecmath.Tuple3d)
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreateTuple3d__Tuple3d();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createTuple3d(double, double, double) <em>Create Tuple3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Tuple3d</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createTuple3d(double, double, double)
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreateTuple3d__double_double_double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createPolynomial(double[]) <em>Create Polynomial</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Polynomial</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createPolynomial(double[])
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreatePolynomial__double();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createIdentityMatrix4x4() <em>Create Identity Matrix4x4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Identity Matrix4x4</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createIdentityMatrix4x4()
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreateIdentityMatrix4x4();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createIdentityMatrix3x3() <em>Create Identity Matrix3x3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Identity Matrix3x3</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#createIdentityMatrix3x3()
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__CreateIdentityMatrix3x3();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#extractPosition(ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Extract Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Position</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#extractPosition(ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__ExtractPosition__Matrix4x4();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#extractOrientation(ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Extract Orientation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Orientation</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade#extractOrientation(ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	EOperation getApogyCommonMathFacade__ExtractOrientation__Matrix4x4();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.math.MathIO <em>Math IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Math IO</em>'.
	 * @see ca.gc.asc_csa.apogy.common.math.MathIO
	 * @generated
	 */
	EClass getMathIO();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.MathIO#readTrMatrix(java.lang.String) <em>Read Tr Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Tr Matrix</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.MathIO#readTrMatrix(java.lang.String)
	 * @generated
	 */
	EOperation getMathIO__ReadTrMatrix__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.MathIO#writeTrMatrix(ca.gc.asc_csa.apogy.common.math.Matrix4x4, java.lang.String) <em>Write Tr Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Tr Matrix</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.MathIO#writeTrMatrix(ca.gc.asc_csa.apogy.common.math.Matrix4x4, java.lang.String)
	 * @generated
	 */
	EOperation getMathIO__WriteTrMatrix__Matrix4x4_String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.math.MathIO#writeTrMatrix(javax.vecmath.Matrix4d, java.lang.String) <em>Write Tr Matrix</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Write Tr Matrix</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.math.MathIO#writeTrMatrix(javax.vecmath.Matrix4d, java.lang.String)
	 * @generated
	 */
	EOperation getMathIO__WriteTrMatrix__Matrix4d_String();

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
	ApogyCommonMathFactory getApogyCommonMathFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.impl.Tuple3dImpl <em>Tuple3d</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.Tuple3dImpl
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getTuple3d()
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
		 * The meta object literal for the '<em><b>As Tuple3d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TUPLE3D___AS_TUPLE3D = eINSTANCE.getTuple3d__AsTuple3d();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl <em>Matrix3x3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.Matrix3x3Impl
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix3x3()
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
		 * The meta object literal for the '<em><b>As Matrix3d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATRIX3X3___AS_MATRIX3D = eINSTANCE.getMatrix3x3__AsMatrix3d();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.impl.Matrix4x4Impl <em>Matrix4x4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.Matrix4x4Impl
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix4x4()
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
		 * The meta object literal for the '<em><b>As Matrix4d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATRIX4X4___AS_MATRIX4D = eINSTANCE.getMatrix4x4__AsMatrix4d();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.impl.PolynomialImpl <em>Polynomial</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.PolynomialImpl
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getPolynomial()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getApogyCommonMathFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_MATH_FACADE = eINSTANCE.getApogyCommonMathFacade();

		/**
		 * The meta object literal for the '<em><b>Create Matrix4x4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_MATRIX4X4__MATRIX4D = eINSTANCE.getApogyCommonMathFacade__CreateMatrix4x4__Matrix4d();

		/**
		 * The meta object literal for the '<em><b>Create Matrix3x3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_MATRIX3X3__MATRIX3D = eINSTANCE.getApogyCommonMathFacade__CreateMatrix3x3__Matrix3d();

		/**
		 * The meta object literal for the '<em><b>Create Tuple3d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_TUPLE3D__TUPLE3D = eINSTANCE.getApogyCommonMathFacade__CreateTuple3d__Tuple3d();

		/**
		 * The meta object literal for the '<em><b>Create Tuple3d</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_TUPLE3D__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getApogyCommonMathFacade__CreateTuple3d__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Create Polynomial</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_POLYNOMIAL__DOUBLE = eINSTANCE.getApogyCommonMathFacade__CreatePolynomial__double();

		/**
		 * The meta object literal for the '<em><b>Create Identity Matrix4x4</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_IDENTITY_MATRIX4X4 = eINSTANCE.getApogyCommonMathFacade__CreateIdentityMatrix4x4();

		/**
		 * The meta object literal for the '<em><b>Create Identity Matrix3x3</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___CREATE_IDENTITY_MATRIX3X3 = eINSTANCE.getApogyCommonMathFacade__CreateIdentityMatrix3x3();

		/**
		 * The meta object literal for the '<em><b>Extract Position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___EXTRACT_POSITION__MATRIX4X4 = eINSTANCE.getApogyCommonMathFacade__ExtractPosition__Matrix4x4();

		/**
		 * The meta object literal for the '<em><b>Extract Orientation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_MATH_FACADE___EXTRACT_ORIENTATION__MATRIX4X4 = eINSTANCE.getApogyCommonMathFacade__ExtractOrientation__Matrix4x4();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.math.impl.MathIOImpl <em>Math IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.MathIOImpl
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMathIO()
		 * @generated
		 */
		EClass MATH_IO = eINSTANCE.getMathIO();

		/**
		 * The meta object literal for the '<em><b>Read Tr Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATH_IO___READ_TR_MATRIX__STRING = eINSTANCE.getMathIO__ReadTrMatrix__String();

		/**
		 * The meta object literal for the '<em><b>Write Tr Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATH_IO___WRITE_TR_MATRIX__MATRIX4X4_STRING = eINSTANCE.getMathIO__WriteTrMatrix__Matrix4x4_String();

		/**
		 * The meta object literal for the '<em><b>Write Tr Matrix</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MATH_IO___WRITE_TR_MATRIX__MATRIX4D_STRING = eINSTANCE.getMathIO__WriteTrMatrix__Matrix4d_String();

		/**
		 * The meta object literal for the '<em>EDouble Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getEDoubleArray()
		 * @generated
		 */
		EDataType EDOUBLE_ARRAY = eINSTANCE.getEDoubleArray();

		/**
		 * The meta object literal for the '<em>Matrix3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix3d
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix3d()
		 * @generated
		 */
		EDataType MATRIX3D = eINSTANCE.getMatrix3d();

		/**
		 * The meta object literal for the '<em>Matrix4d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Matrix4d
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getMatrix4d()
		 * @generated
		 */
		EDataType MATRIX4D = eINSTANCE.getMatrix4d();

		/**
		 * The meta object literal for the '<em>Vecmath Tuple3d</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.vecmath.Tuple3d
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getVecmathTuple3d()
		 * @generated
		 */
		EDataType VECMATH_TUPLE3D = eINSTANCE.getVecmathTuple3d();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.common.math.impl.ApogyCommonMathPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ApogyCommonMathPackage
