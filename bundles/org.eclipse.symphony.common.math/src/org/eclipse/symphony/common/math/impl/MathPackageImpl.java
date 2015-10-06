/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.math.impl;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.math.MathIO;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.math.Polynomial;
import org.eclipse.symphony.common.math.Tuple3d;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MathPackageImpl extends EPackageImpl implements MathPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrix4x4EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mathFacadeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrix3x3EClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuple3dEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polynomialEClass = null;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mathIOEClass = null;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eDoubleArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matrix3dEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType matrix4dEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vecmathTuple3dEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.common.math.MathPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MathPackageImpl() {
		super(eNS_URI, MathFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link MathPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MathPackage init() {
		if (isInited) return (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);

		// Obtain or create and register package
		MathPackageImpl theMathPackage = (MathPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MathPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MathPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMathPackage.createPackageContents();

		// Initialize created meta-data
		theMathPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMathPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MathPackage.eNS_URI, theMathPackage);
		return theMathPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix4x4() {
		return matrix4x4EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M00() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M01() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M02() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M03() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M10() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M11() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M12() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M13() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M20() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M21() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M22() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M23() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMatrix4x4_M30()
  {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(12);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M31() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M32() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix4x4_M33() {
		return (EAttribute)matrix4x4EClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatrix4x4__AsMatrix4d() {
		return matrix4x4EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMathFacade() {
		return mathFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreateMatrix4x4__Matrix4d() {
		return mathFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreateMatrix3x3__Matrix3d() {
		return mathFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreateTuple3d__Tuple3d() {
		return mathFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreateTuple3d__double_double_double() {
		return mathFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreatePolynomial__double() {
		return mathFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreateIdentityMatrix4x4() {
		return mathFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__CreateIdentityMatrix3x3() {
		return mathFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__ExtractPosition__Matrix4x4() {
		return mathFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathFacade__ExtractOrientation__Matrix4x4() {
		return mathFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix3x3() {
		return matrix3x3EClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M00() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M01() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M02() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M10() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M11() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M12() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M20() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M21() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix3x3_M22() {
		return (EAttribute)matrix3x3EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMatrix3x3__AsMatrix3d() {
		return matrix3x3EClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuple3d() {
		return tuple3dEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuple3d_X() {
		return (EAttribute)tuple3dEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuple3d_Y() {
		return (EAttribute)tuple3dEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuple3d_Z() {
		return (EAttribute)tuple3dEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTuple3d__AsTuple3d() {
		return tuple3dEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolynomial() {
		return polynomialEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolynomial_Degree() {
		return (EAttribute)polynomialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolynomial_Coeffs() {
		return (EAttribute)polynomialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolynomial_RealRoots() {
		return (EAttribute)polynomialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolynomial_ImaginaryRoots() {
		return (EAttribute)polynomialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMathIO()
  {
		return mathIOEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathIO__ReadTrMatrix__String() {
		return mathIOEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathIO__WriteTrMatrix__Matrix4x4_String() {
		return mathIOEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMathIO__WriteTrMatrix__Matrix4d_String() {
		return mathIOEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEDoubleArray() {
		return eDoubleArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatrix3d() {
		return matrix3dEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMatrix4d() {
		return matrix4dEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVecmathTuple3d() {
		return vecmathTuple3dEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MathFactory getMathFactory() {
		return (MathFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		matrix4x4EClass = createEClass(MATRIX4X4);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M00);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M01);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M02);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M03);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M10);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M11);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M12);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M13);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M20);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M21);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M22);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M23);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M30);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M31);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M32);
		createEAttribute(matrix4x4EClass, MATRIX4X4__M33);
		createEOperation(matrix4x4EClass, MATRIX4X4___AS_MATRIX4D);

		mathFacadeEClass = createEClass(MATH_FACADE);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_MATRIX4X4__MATRIX4D);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_MATRIX3X3__MATRIX3D);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_TUPLE3D__TUPLE3D);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_TUPLE3D__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_POLYNOMIAL__DOUBLE);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_IDENTITY_MATRIX4X4);
		createEOperation(mathFacadeEClass, MATH_FACADE___CREATE_IDENTITY_MATRIX3X3);
		createEOperation(mathFacadeEClass, MATH_FACADE___EXTRACT_POSITION__MATRIX4X4);
		createEOperation(mathFacadeEClass, MATH_FACADE___EXTRACT_ORIENTATION__MATRIX4X4);

		matrix3x3EClass = createEClass(MATRIX3X3);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M00);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M01);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M02);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M10);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M11);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M12);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M20);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M21);
		createEAttribute(matrix3x3EClass, MATRIX3X3__M22);
		createEOperation(matrix3x3EClass, MATRIX3X3___AS_MATRIX3D);

		tuple3dEClass = createEClass(TUPLE3D);
		createEAttribute(tuple3dEClass, TUPLE3D__X);
		createEAttribute(tuple3dEClass, TUPLE3D__Y);
		createEAttribute(tuple3dEClass, TUPLE3D__Z);
		createEOperation(tuple3dEClass, TUPLE3D___AS_TUPLE3D);

		polynomialEClass = createEClass(POLYNOMIAL);
		createEAttribute(polynomialEClass, POLYNOMIAL__DEGREE);
		createEAttribute(polynomialEClass, POLYNOMIAL__COEFFS);
		createEAttribute(polynomialEClass, POLYNOMIAL__REAL_ROOTS);
		createEAttribute(polynomialEClass, POLYNOMIAL__IMAGINARY_ROOTS);

		mathIOEClass = createEClass(MATH_IO);
		createEOperation(mathIOEClass, MATH_IO___READ_TR_MATRIX__STRING);
		createEOperation(mathIOEClass, MATH_IO___WRITE_TR_MATRIX__MATRIX4X4_STRING);
		createEOperation(mathIOEClass, MATH_IO___WRITE_TR_MATRIX__MATRIX4D_STRING);

		// Create data types
		eDoubleArrayEDataType = createEDataType(EDOUBLE_ARRAY);
		matrix3dEDataType = createEDataType(MATRIX3D);
		matrix4dEDataType = createEDataType(MATRIX4D);
		vecmathTuple3dEDataType = createEDataType(VECMATH_TUPLE3D);
		exceptionEDataType = createEDataType(EXCEPTION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(matrix4x4EClass, Matrix4x4.class, "Matrix4x4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix4x4_M00(), theEcorePackage.getEDouble(), "m00", "1.0", 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M01(), theEcorePackage.getEDouble(), "m01", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M02(), theEcorePackage.getEDouble(), "m02", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M03(), theEcorePackage.getEDouble(), "m03", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M10(), theEcorePackage.getEDouble(), "m10", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M11(), theEcorePackage.getEDouble(), "m11", "1.0", 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M12(), theEcorePackage.getEDouble(), "m12", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M13(), theEcorePackage.getEDouble(), "m13", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M20(), theEcorePackage.getEDouble(), "m20", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M21(), theEcorePackage.getEDouble(), "m21", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M22(), theEcorePackage.getEDouble(), "m22", "1.0", 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M23(), theEcorePackage.getEDouble(), "m23", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M30(), theEcorePackage.getEDouble(), "m30", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M31(), theEcorePackage.getEDouble(), "m31", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M32(), theEcorePackage.getEDouble(), "m32", null, 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix4x4_M33(), theEcorePackage.getEDouble(), "m33", "1.0", 0, 1, Matrix4x4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMatrix4x4__AsMatrix4d(), this.getMatrix4d(), "asMatrix4d", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(mathFacadeEClass, MathFacade.class, "MathFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getMathFacade__CreateMatrix4x4__Matrix4d(), this.getMatrix4x4(), "createMatrix4x4", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMathFacade__CreateMatrix3x3__Matrix3d(), this.getMatrix3x3(), "createMatrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix3d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMathFacade__CreateTuple3d__Tuple3d(), this.getTuple3d(), "createTuple3d", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVecmathTuple3d(), "tuple", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMathFacade__CreateTuple3d__double_double_double(), this.getTuple3d(), "createTuple3d", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMathFacade__CreatePolynomial__double(), this.getPolynomial(), "createPolynomial", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDoubleArray(), "coeffs", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMathFacade__CreateIdentityMatrix4x4(), this.getMatrix4x4(), "createIdentityMatrix4x4", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMathFacade__CreateIdentityMatrix3x3(), this.getMatrix3x3(), "createIdentityMatrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMathFacade__ExtractPosition__Matrix4x4(), this.getTuple3d(), "extractPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4x4(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMathFacade__ExtractOrientation__Matrix4x4(), this.getTuple3d(), "extractOrientation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4x4(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(matrix3x3EClass, Matrix3x3.class, "Matrix3x3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix3x3_M00(), theEcorePackage.getEDouble(), "m00", "1.0", 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M01(), theEcorePackage.getEDouble(), "m01", null, 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M02(), theEcorePackage.getEDouble(), "m02", null, 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M10(), theEcorePackage.getEDouble(), "m10", null, 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M11(), theEcorePackage.getEDouble(), "m11", "1.0", 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M12(), theEcorePackage.getEDouble(), "m12", null, 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M20(), theEcorePackage.getEDouble(), "m20", null, 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M21(), theEcorePackage.getEDouble(), "m21", null, 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix3x3_M22(), theEcorePackage.getEDouble(), "m22", "1.0", 0, 1, Matrix3x3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMatrix3x3__AsMatrix3d(), this.getMatrix3d(), "asMatrix3d", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(tuple3dEClass, Tuple3d.class, "Tuple3d", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuple3d_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Tuple3d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuple3d_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Tuple3d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuple3d_Z(), theEcorePackage.getEDouble(), "z", null, 0, 1, Tuple3d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTuple3d__AsTuple3d(), this.getVecmathTuple3d(), "asTuple3d", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(polynomialEClass, Polynomial.class, "Polynomial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolynomial_Degree(), theEcorePackage.getEInt(), "degree", "0", 0, 1, Polynomial.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolynomial_Coeffs(), this.getEDoubleArray(), "coeffs", null, 0, 1, Polynomial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolynomial_RealRoots(), this.getEDoubleArray(), "realRoots", null, 0, 1, Polynomial.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolynomial_ImaginaryRoots(), this.getEDoubleArray(), "imaginaryRoots", null, 0, 1, Polynomial.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mathIOEClass, MathIO.class, "MathIO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMathIO__ReadTrMatrix__String(), this.getMatrix4x4(), "readTrMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getMathIO__WriteTrMatrix__Matrix4x4_String(), null, "writeTrMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4x4(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		op = initEOperation(getMathIO__WriteTrMatrix__Matrix4d_String(), null, "writeTrMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "trMatrix", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "fileName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getException());

		// Initialize data types
		initEDataType(eDoubleArrayEDataType, double.class, "EDoubleArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matrix3dEDataType, Matrix3d.class, "Matrix3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matrix4dEDataType, Matrix4d.class, "Matrix4d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vecmathTuple3dEDataType, javax.vecmath.Tuple3d.class, "VecmathTuple3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // MathPackageImpl
