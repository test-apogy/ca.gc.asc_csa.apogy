package ca.gc.asc_csa.apogy.common.math.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.MathIO;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.math.Matrix3x3;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;
import ca.gc.asc_csa.apogy.common.math.Polynomial;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class ApogyCommonMathPackageImpl extends EPackageImpl implements ApogyCommonMathPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrix4x4EClass = null;

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
	private EClass apogyCommonMathFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonMathPackageImpl() {
		super(eNS_URI, ApogyCommonMathFactory.eINSTANCE);
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
	 * This method is used to initialize {@link ApogyCommonMathPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonMathPackage init() {
		if (isInited) return (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonMathPackageImpl theApogyCommonMathPackage = (ApogyCommonMathPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonMathPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonMathPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCommonMathPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonMathPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonMathPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonMathPackage.eNS_URI, theApogyCommonMathPackage);
		return theApogyCommonMathPackage;
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
	public EClass getApogyCommonMathFacade() {
		return apogyCommonMathFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreateMatrix4x4__Matrix4d() {
		return apogyCommonMathFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreateMatrix3x3__Matrix3d() {
		return apogyCommonMathFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreateTuple3d__Tuple3d() {
		return apogyCommonMathFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreateTuple3d__double_double_double() {
		return apogyCommonMathFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreatePolynomial__double() {
		return apogyCommonMathFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreateIdentityMatrix4x4() {
		return apogyCommonMathFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__CreateIdentityMatrix3x3() {
		return apogyCommonMathFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__ExtractPosition__Matrix4x4() {
		return apogyCommonMathFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonMathFacade__ExtractOrientation__Matrix4x4() {
		return apogyCommonMathFacadeEClass.getEOperations().get(8);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonMathFactory getApogyCommonMathFactory() {
		return (ApogyCommonMathFactory)getEFactoryInstance();
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
		tuple3dEClass = createEClass(TUPLE3D);
		createEAttribute(tuple3dEClass, TUPLE3D__X);
		createEAttribute(tuple3dEClass, TUPLE3D__Y);
		createEAttribute(tuple3dEClass, TUPLE3D__Z);
		createEOperation(tuple3dEClass, TUPLE3D___AS_TUPLE3D);

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

		polynomialEClass = createEClass(POLYNOMIAL);
		createEAttribute(polynomialEClass, POLYNOMIAL__DEGREE);
		createEAttribute(polynomialEClass, POLYNOMIAL__COEFFS);
		createEAttribute(polynomialEClass, POLYNOMIAL__REAL_ROOTS);
		createEAttribute(polynomialEClass, POLYNOMIAL__IMAGINARY_ROOTS);

		apogyCommonMathFacadeEClass = createEClass(APOGY_COMMON_MATH_FACADE);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_MATRIX4X4__MATRIX4D);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_MATRIX3X3__MATRIX3D);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_TUPLE3D__TUPLE3D);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_TUPLE3D__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_POLYNOMIAL__DOUBLE);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_IDENTITY_MATRIX4X4);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___CREATE_IDENTITY_MATRIX3X3);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___EXTRACT_POSITION__MATRIX4X4);
		createEOperation(apogyCommonMathFacadeEClass, APOGY_COMMON_MATH_FACADE___EXTRACT_ORIENTATION__MATRIX4X4);

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
		initEClass(tuple3dEClass, Tuple3d.class, "Tuple3d", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuple3d_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Tuple3d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuple3d_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Tuple3d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuple3d_Z(), theEcorePackage.getEDouble(), "z", null, 0, 1, Tuple3d.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTuple3d__AsTuple3d(), this.getVecmathTuple3d(), "asTuple3d", 0, 1, !IS_UNIQUE, IS_ORDERED);

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

		initEClass(polynomialEClass, Polynomial.class, "Polynomial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolynomial_Degree(), theEcorePackage.getEInt(), "degree", "0", 0, 1, Polynomial.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolynomial_Coeffs(), this.getEDoubleArray(), "coeffs", null, 0, 1, Polynomial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolynomial_RealRoots(), this.getEDoubleArray(), "realRoots", null, 0, 1, Polynomial.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolynomial_ImaginaryRoots(), this.getEDoubleArray(), "imaginaryRoots", null, 0, 1, Polynomial.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(apogyCommonMathFacadeEClass, ApogyCommonMathFacade.class, "ApogyCommonMathFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonMathFacade__CreateMatrix4x4__Matrix4d(), this.getMatrix4x4(), "createMatrix4x4", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonMathFacade__CreateMatrix3x3__Matrix3d(), this.getMatrix3x3(), "createMatrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix3d(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonMathFacade__CreateTuple3d__Tuple3d(), this.getTuple3d(), "createTuple3d", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVecmathTuple3d(), "tuple", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonMathFacade__CreateTuple3d__double_double_double(), this.getTuple3d(), "createTuple3d", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonMathFacade__CreatePolynomial__double(), this.getPolynomial(), "createPolynomial", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEDoubleArray(), "coeffs", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyCommonMathFacade__CreateIdentityMatrix4x4(), this.getMatrix4x4(), "createIdentityMatrix4x4", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyCommonMathFacade__CreateIdentityMatrix3x3(), this.getMatrix3x3(), "createIdentityMatrix3x3", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonMathFacade__ExtractPosition__Matrix4x4(), this.getTuple3d(), "extractPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4x4(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonMathFacade__ExtractOrientation__Matrix4x4(), this.getTuple3d(), "extractOrientation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMatrix4x4(), "matrix", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
		initEDataType(eDoubleArrayEDataType, double[].class, "EDoubleArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matrix3dEDataType, Matrix3d.class, "Matrix3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(matrix4dEDataType, Matrix4d.class, "Matrix4d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vecmathTuple3dEDataType, javax.vecmath.Tuple3d.class, "VecmathTuple3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCommonMath",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCommonMath",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.common.math/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.common.math.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.common"
		   });	
		addAnnotation
		  (getPolynomial_Coeffs(), 
		   source, 
		   new String[] {
			 "documentation", "The coefficients of the polynomial, sorted in increasing order.\ncoeffs[n-1]*x^n-1 + coeffs[n-2]*x^n-2 + ... + coeffs[0].\n\nFor instance: polynomial 3*x^2 + 5*x + 2, the coefficients would be:\ncoeffs = { 2, 5, 3 }."
		   });	
		addAnnotation
		  (getApogyCommonMathFacade__CreatePolynomial__double(), 
		   source, 
		   new String[] {
			 "documentation", "@param coeffs The coefficients of the polynomial, sorted in increasing order.\\ncoeffs[n-1]*x^n-1 + coeffs[n-2]*x^n-2 + ... + coeffs[0]"
		   });
	}

} // ApogyCommonMathPackageImpl
