package ca.gc.asc_csa.apogy.examples.mobile_platform.impl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformFactory;
import ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformPackage;
import ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform;
import ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatformSimulated;
import ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatformStub;
import ca.gc.asc_csa.apogy.examples.mobile_platform.NamedPosition;
import ca.gc.asc_csa.apogy.examples.mobile_platform.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesMobilePlatformPackageImpl extends EPackageImpl implements ApogyExamplesMobilePlatformPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass positionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass namedPositionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mobilePlatformEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mobilePlatformStubEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePlatformSimulatedEClass = null;

		/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.apogy.examples.mobile_platform.ApogyExamplesMobilePlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesMobilePlatformPackageImpl()
  {
		super(eNS_URI, ApogyExamplesMobilePlatformFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ApogyExamplesMobilePlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesMobilePlatformPackage init()
  {
		if (isInited) return (ApogyExamplesMobilePlatformPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesMobilePlatformPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesMobilePlatformPackageImpl theApogyExamplesMobilePlatformPackage = (ApogyExamplesMobilePlatformPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesMobilePlatformPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesMobilePlatformPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonEMFPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesMobilePlatformPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesMobilePlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesMobilePlatformPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesMobilePlatformPackage.eNS_URI, theApogyExamplesMobilePlatformPackage);
		return theApogyExamplesMobilePlatformPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPosition()
  {
		return positionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPosition_X()
  {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPosition_Y()
  {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPosition_Theta()
  {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getNamedPosition()
  {
		return namedPositionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getNamedPosition_Name()
  {
		return (EAttribute)namedPositionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMobilePlatform()
  {
		return mobilePlatformEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatform_Initialized() {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatform_Disposed() {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMobilePlatform_Position()
  {
		return (EReference)mobilePlatformEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMobilePlatform_PositionError()
  {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatform_LinearVelocity() {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobilePlatform_AngularVelocity() {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMobilePlatform_LeftWheelPosition()
  {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMobilePlatform_RightWheelPosition()
  {
		return (EAttribute)mobilePlatformEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMobilePlatform__Init()
  {
		return mobilePlatformEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobilePlatform__ResetPosition__Position() {
		return mobilePlatformEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobilePlatform__ClearPositionError() {
		return mobilePlatformEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMobilePlatform__Stop()
  {
		return mobilePlatformEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobilePlatform__MoveTo__double_double() {
		return mobilePlatformEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobilePlatform__CmdLinearVelocity__double() {
		return mobilePlatformEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobilePlatform__CmdAngularVelocity__double() {
		return mobilePlatformEClass.getEOperations().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobilePlatform__CmdVelocities__double_double() {
		return mobilePlatformEClass.getEOperations().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMobilePlatformStub()
  {
		return mobilePlatformStubEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePlatformSimulated() {
		return mobilePlatformSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesMobilePlatformFactory getApogyExamplesMobilePlatformFactory() {
		return (ApogyExamplesMobilePlatformFactory)getEFactoryInstance();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		positionEClass = createEClass(POSITION);
		createEAttribute(positionEClass, POSITION__X);
		createEAttribute(positionEClass, POSITION__Y);
		createEAttribute(positionEClass, POSITION__THETA);

		namedPositionEClass = createEClass(NAMED_POSITION);
		createEAttribute(namedPositionEClass, NAMED_POSITION__NAME);

		mobilePlatformEClass = createEClass(MOBILE_PLATFORM);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__INITIALIZED);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__DISPOSED);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__POSITION_ERROR);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__LINEAR_VELOCITY);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__ANGULAR_VELOCITY);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__LEFT_WHEEL_POSITION);
		createEAttribute(mobilePlatformEClass, MOBILE_PLATFORM__RIGHT_WHEEL_POSITION);
		createEReference(mobilePlatformEClass, MOBILE_PLATFORM__POSITION);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___INIT);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___RESET_POSITION__POSITION);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___CLEAR_POSITION_ERROR);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___STOP);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___MOVE_TO__DOUBLE_DOUBLE);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___CMD_LINEAR_VELOCITY__DOUBLE);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___CMD_ANGULAR_VELOCITY__DOUBLE);
		createEOperation(mobilePlatformEClass, MOBILE_PLATFORM___CMD_VELOCITIES__DOUBLE_DOUBLE);

		mobilePlatformStubEClass = createEClass(MOBILE_PLATFORM_STUB);

		mobilePlatformSimulatedEClass = createEClass(MOBILE_PLATFORM_SIMULATED);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedPositionEClass.getESuperTypes().add(this.getPosition());
		mobilePlatformEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDisposable());
		mobilePlatformStubEClass.getESuperTypes().add(this.getMobilePlatform());
		mobilePlatformSimulatedEClass.getESuperTypes().add(this.getMobilePlatform());

		// Initialize classes, features, and operations; add parameters
		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), theEcorePackage.getEDouble(), "x", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), theEcorePackage.getEDouble(), "y", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Theta(), theEcorePackage.getEDouble(), "theta", "0.0", 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedPositionEClass, NamedPosition.class, "NamedPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedPosition_Name(), theEcorePackage.getEString(), "name", "", 0, 1, NamedPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobilePlatformEClass, MobilePlatform.class, "MobilePlatform", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobilePlatform_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_PositionError(), theEcorePackage.getEDouble(), "positionError", "0.0", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_LinearVelocity(), theEcorePackage.getEDouble(), "linearVelocity", "0.0", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_AngularVelocity(), theEcorePackage.getEDouble(), "angularVelocity", "0.0", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_LeftWheelPosition(), theEcorePackage.getEDouble(), "leftWheelPosition", "0.0", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobilePlatform_RightWheelPosition(), theEcorePackage.getEDouble(), "rightWheelPosition", "0.0", 0, 1, MobilePlatform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobilePlatform_Position(), this.getPosition(), null, "position", null, 1, 1, MobilePlatform.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMobilePlatform__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getMobilePlatform__ResetPosition__Position(), null, "resetPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPosition(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMobilePlatform__ClearPositionError(), null, "clearPositionError", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMobilePlatform__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMobilePlatform__MoveTo__double_double(), null, "moveTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMobilePlatform__CmdLinearVelocity__double(), null, "cmdLinearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "linearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMobilePlatform__CmdAngularVelocity__double(), null, "cmdAngularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMobilePlatform__CmdVelocities__double_double(), null, "cmdVelocities", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "linearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(mobilePlatformStubEClass, MobilePlatformStub.class, "MobilePlatformStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobilePlatformSimulatedEClass, MobilePlatformSimulated.class, "MobilePlatformSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyExamplesMobilePlatform",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyExamplesMobilePlatform",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.mobile_platform/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.mobile_platform.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples"
		   });	
		addAnnotation
		  (positionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is used to represent a position of a particular object\nin space.  In particular, this provides both a Cartesian coordinate\nlocation as well as an angle corresponding to the object\'s pose."
		   });	
		addAnnotation
		  (getPosition_X(), 
		   source, 
		   new String[] {
			 "documentation", "This is the position\'s X coordinate (given in metres)",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Y(), 
		   source, 
		   new String[] {
			 "documentation", "This is the position\'s Y coordinate (given in metres)",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Theta(), 
		   source, 
		   new String[] {
			 "documentation", "This is the pose angle (in radians) of an object, which\nspecifies a rotation around the Z axis.",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (namedPositionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class is used to represent a named variety of position"
		   });	
		addAnnotation
		  (getNamedPosition_Name(), 
		   source, 
		   new String[] {
			 "documentation", "The name associated with this set of Cartesian coordinates and pose angle.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (mobilePlatformEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is an abstract class which represents a mobile platform, a\nwheeled robotic vehicle that like the name suggests, can move around\nthe ground.  As such, this class provides all of the fields\nand operations in order to facilitate that."
		   });	
		addAnnotation
		  (getMobilePlatform__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to initialize the mobile platform\nand as such, it will perform the required creation and\ninitialization steps.\n\n@return Whether or not the mobile platform was successfully initialized"
		   });	
		addAnnotation
		  (getMobilePlatform__ResetPosition__Position(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the mobile platform to\nhave the coordinates and pose matching the given position.\nThat new position will be considered the new starting place\nfor the mobile platform and as such, the accumulated error will\nbe cleared; all error will be relative to that new position.\n\n@param position The mobile platform\'s new desired position"
		   });	
		addAnnotation
		  (getMobilePlatform__ClearPositionError(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to clear the mobile platform\'s positional\nerror; this could be used to indicate that all error should now\nbe taken in respect to the robot\'s current position."
		   });	
		addAnnotation
		  (getMobilePlatform__Stop(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to stop the mobile platform, if it is\ncurrently moving."
		   });	
		addAnnotation
		  (getMobilePlatform__MoveTo__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used move the mobile platform to the\nspecified coordinates.\n\n@param x This is the mobile platform\'s desired X coordinate.\n@param y This is the mobile platform\'s desired Y coordinate."
		   });	
		addAnnotation
		  ((getMobilePlatform__MoveTo__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  ((getMobilePlatform__MoveTo__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getMobilePlatform__CmdLinearVelocity__double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the mobile platform\'s linear\nvelocity (in metres per second) to the specified value.\n<p>\nNote: Unlike the traditional definition of linear velocity as a vector,\nthis is simply a signed scalar; a positive value indicates the speed\nforward while a negative value is the speed backwards.  Zero means there\nis no movement.\n\n@param linearVelocity The mobile platform\'s new linear velocity (in m/s)\n@see #cmdVelocities(double, double)"
		   });	
		addAnnotation
		  ((getMobilePlatform__CmdLinearVelocity__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  (getMobilePlatform__CmdAngularVelocity__double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the mobile platform\'s angular\nvelocity (in radians per second) to the specified value.\n<p>\nNote: Unlike the traditional definition of angular velocity as a vector,\nthis is simply a signed scalar; a positive value is the rotation in the\nclockwise direction while a negative value implies the rotation is in the\ncounter-clockwise direction.  Zero means there is no rotation.\n\n@param angularVelocity The mobile platform\'s new angular velocity (in rad/s)\n@see #cmdVelocities(double, double)"
		   });	
		addAnnotation
		  ((getMobilePlatform__CmdAngularVelocity__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getMobilePlatform__CmdVelocities__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "The operation is used to change the mobile platform\'s linear and\nangular velocities, which are in metres / second and radians / second,\nrespectively.\n<p>\nNote 1: Unlike the traditional definition of linear velocity as a vector,\nthis is simply a signed scalar; a positive value indicates the speed\nforward while a negative value is the speed backwards.  Zero means there\nis no movement.\n<p>\nNote 2: Unlike the traditional definition of angular velocity as a vector,\nthis is simply a signed scalar; a positive value is the rotation in the\nclockwise direction while a negative value implies the rotation is in the\ncounter-clockwise direction.  Zero means there is no rotation.\n\n@param linearVelocity The commanded linear velocity.\n@param angularVelocity The commanded angular velocity.\n@see #cmdLinearVelocity(double)\n@see #cmdAngularVelocity(double)"
		   });	
		addAnnotation
		  ((getMobilePlatform__CmdVelocities__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  ((getMobilePlatform__CmdVelocities__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getMobilePlatform_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the mobile platform has\nbeen initialized; initially false.\n@see #init()",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getMobilePlatform_Disposed(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the mobile platform has\nbeen disposed; initially false.\n@see #dispose()",
			 "children", "false",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getMobilePlatform_PositionError(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current estimate of the error\nin its position (given in metres.)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getMobilePlatform_LinearVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current linear velocity\n(in metres per second)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Velocities",
			 "apogy_units", "m/s"
		   });	
		addAnnotation
		  (getMobilePlatform_AngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current angular velocity\n(in radians per second).",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Velocities",
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getMobilePlatform_LeftWheelPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s left wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getMobilePlatform_RightWheelPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current angular position (in radians) of\nthe mobile platform\'s right wheels.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Position",
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getMobilePlatform_Position(), 
		   source, 
		   new String[] {
			 "documentation", "This is the mobile platform\'s current position",
			 "notify", "true",
			 "propertyCategory", "Position"
		   });	
		addAnnotation
		  (mobilePlatformStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the mobile platform, in which\nall operations are stubs and hence, non-functional; the operations\nshould simply log a message, indicating that they were performed."
		   });	
		addAnnotation
		  (mobilePlatformSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the mobile platform, where all\noperations are executed upon a simulated (i.e. virtual) platform.  While\nthere are no physical components interacted with, it attempts to emulate,\nwherever possible, the actions and results of its real world counterpart(s)."
		   });
	}

} //ApogyExamplesMobilePlatformPackageImpl
