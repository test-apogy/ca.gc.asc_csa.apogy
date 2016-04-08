package ca.gc.asc_csa.apogy.examples.lander.impl;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehiclePackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderFactory;
import ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage;
import ca.gc.asc_csa.apogy.examples.lander.Lander;
import ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension;
import ca.gc.asc_csa.apogy.examples.lander.LanderSimulated;
import ca.gc.asc_csa.apogy.examples.lander.LanderStub;
import ca.gc.asc_csa.apogy.examples.lander.Position;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesLanderPackageImpl extends EPackageImpl implements ApogyExamplesLanderPackage
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
  private EClass landerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landerStubEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass landerSimulatedEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum landerLegExtensionEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType matrix3dEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyExamplesLanderPackageImpl()
  {
		super(eNS_URI, ApogyExamplesLanderFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyExamplesLanderPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyExamplesLanderPackage init()
  {
		if (isInited) return (ApogyExamplesLanderPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyExamplesLanderPackage.eNS_URI);

		// Obtain or create and register package
		ApogyExamplesLanderPackageImpl theApogyExamplesLanderPackage = (ApogyExamplesLanderPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyExamplesLanderPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyExamplesLanderPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyAddonsVehiclePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyExamplesLanderPackage.createPackageContents();

		// Initialize created meta-data
		theApogyExamplesLanderPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyExamplesLanderPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyExamplesLanderPackage.eNS_URI, theApogyExamplesLanderPackage);
		return theApogyExamplesLanderPackage;
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
  public EAttribute getPosition_Z()
  {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPosition_Attitude()
  {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getLander()
  {
		return landerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getLander_Position()
  {
		return (EReference)landerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLander_Thruster() {
		return (EReference)landerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_LegAPosition()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_LegAExtension()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_LegBPosition()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_LegBExtension()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_LegCPosition()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_LegCExtension()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_XAngularVelocity()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getLander_YAngularVelocity()
  {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_Mass() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(10);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_FuelMass() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(11);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_GravitationalPull() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(12);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_FlyingEnabled() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(16);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_Initialized() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(17);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_Disposed() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(18);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_ChangingLegs() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(13);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_ChangingAttitude() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(14);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLander_ChangingLocation() {
		return (EAttribute)landerEClass.getEStructuralFeatures().get(15);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__Init() {
		return landerEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__CommandLegPosition__LanderLegExtension_LanderLegExtension_LanderLegExtension() {
		return landerEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__MoveTo__double_double_double() {
		return landerEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__ChangeAttitude__double_double_double() {
		return landerEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__ResetAttitude() {
		return landerEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__CommandAngularVelocities__double_double() {
		return landerEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getLander__CommandThrust__double()
  {
		return landerEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__ChangeThrustBy__double() {
		return landerEClass.getEOperations().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__StartFlying__boolean() {
		return landerEClass.getEOperations().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLander__StopFlying() {
		return landerEClass.getEOperations().get(9);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanderStub() {
		return landerStubEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanderSimulated() {
		return landerSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getLanderLegExtension()
  {
		return landerLegExtensionEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getMatrix3d()
  {
		return matrix3dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesLanderFactory getApogyExamplesLanderFactory() {
		return (ApogyExamplesLanderFactory)getEFactoryInstance();
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
		createEAttribute(positionEClass, POSITION__Z);
		createEAttribute(positionEClass, POSITION__ATTITUDE);

		landerEClass = createEClass(LANDER);
		createEReference(landerEClass, LANDER__POSITION);
		createEReference(landerEClass, LANDER__THRUSTER);
		createEAttribute(landerEClass, LANDER__LEG_AEXTENSION);
		createEAttribute(landerEClass, LANDER__LEG_BEXTENSION);
		createEAttribute(landerEClass, LANDER__LEG_CEXTENSION);
		createEAttribute(landerEClass, LANDER__LEG_APOSITION);
		createEAttribute(landerEClass, LANDER__LEG_BPOSITION);
		createEAttribute(landerEClass, LANDER__LEG_CPOSITION);
		createEAttribute(landerEClass, LANDER__XANGULAR_VELOCITY);
		createEAttribute(landerEClass, LANDER__YANGULAR_VELOCITY);
		createEAttribute(landerEClass, LANDER__MASS);
		createEAttribute(landerEClass, LANDER__FUEL_MASS);
		createEAttribute(landerEClass, LANDER__GRAVITATIONAL_PULL);
		createEAttribute(landerEClass, LANDER__CHANGING_LEGS);
		createEAttribute(landerEClass, LANDER__CHANGING_ATTITUDE);
		createEAttribute(landerEClass, LANDER__CHANGING_LOCATION);
		createEAttribute(landerEClass, LANDER__FLYING_ENABLED);
		createEAttribute(landerEClass, LANDER__INITIALIZED);
		createEAttribute(landerEClass, LANDER__DISPOSED);
		createEOperation(landerEClass, LANDER___INIT);
		createEOperation(landerEClass, LANDER___COMMAND_LEG_POSITION__LANDERLEGEXTENSION_LANDERLEGEXTENSION_LANDERLEGEXTENSION);
		createEOperation(landerEClass, LANDER___MOVE_TO__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(landerEClass, LANDER___CHANGE_ATTITUDE__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(landerEClass, LANDER___RESET_ATTITUDE);
		createEOperation(landerEClass, LANDER___COMMAND_ANGULAR_VELOCITIES__DOUBLE_DOUBLE);
		createEOperation(landerEClass, LANDER___COMMAND_THRUST__DOUBLE);
		createEOperation(landerEClass, LANDER___CHANGE_THRUST_BY__DOUBLE);
		createEOperation(landerEClass, LANDER___START_FLYING__BOOLEAN);
		createEOperation(landerEClass, LANDER___STOP_FLYING);

		landerStubEClass = createEClass(LANDER_STUB);

		landerSimulatedEClass = createEClass(LANDER_SIMULATED);

		// Create enums
		landerLegExtensionEEnum = createEEnum(LANDER_LEG_EXTENSION);

		// Create data types
		matrix3dEDataType = createEDataType(MATRIX3D);
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
		ApogyAddonsVehiclePackage theApogyAddonsVehiclePackage = (ApogyAddonsVehiclePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyAddonsVehiclePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		landerEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDisposable());
		landerStubEClass.getESuperTypes().add(this.getLander());
		landerSimulatedEClass.getESuperTypes().add(this.getLander());

		// Initialize classes, features, and operations; add parameters
		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPosition_X(), theEcorePackage.getEDouble(), "x", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Y(), theEcorePackage.getEDouble(), "y", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Z(), theEcorePackage.getEDouble(), "z", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Attitude(), this.getMatrix3d(), "attitude", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landerEClass, Lander.class, "Lander", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLander_Position(), this.getPosition(), null, "position", null, 1, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLander_Thruster(), theApogyAddonsVehiclePackage.getThruster(), null, "thruster", null, 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_LegAExtension(), this.getLanderLegExtension(), "legAExtension", null, 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_LegBExtension(), this.getLanderLegExtension(), "legBExtension", null, 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_LegCExtension(), this.getLanderLegExtension(), "legCExtension", null, 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_LegAPosition(), theEcorePackage.getEDouble(), "legAPosition", "0", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_LegBPosition(), theEcorePackage.getEDouble(), "legBPosition", "0", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_LegCPosition(), theEcorePackage.getEDouble(), "legCPosition", "0", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_XAngularVelocity(), theEcorePackage.getEDouble(), "xAngularVelocity", "0", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_YAngularVelocity(), theEcorePackage.getEDouble(), "yAngularVelocity", "0", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_Mass(), theEcorePackage.getEDouble(), "mass", null, 0, 1, Lander.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_FuelMass(), theEcorePackage.getEDouble(), "fuelMass", null, 0, 1, Lander.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_GravitationalPull(), theEcorePackage.getEDouble(), "gravitationalPull", null, 0, 1, Lander.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_ChangingLegs(), theEcorePackage.getEBoolean(), "changingLegs", "false", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_ChangingAttitude(), theEcorePackage.getEBoolean(), "changingAttitude", "false", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_ChangingLocation(), theEcorePackage.getEBoolean(), "changingLocation", "false", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_FlyingEnabled(), theEcorePackage.getEBoolean(), "flyingEnabled", "false", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLander_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, Lander.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLander__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getLander__CommandLegPosition__LanderLegExtension_LanderLegExtension_LanderLegExtension(), null, "commandLegPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLanderLegExtension(), "legAExtension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLanderLegExtension(), "legBExtension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLanderLegExtension(), "legCExtension", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLander__MoveTo__double_double_double(), null, "moveTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "z", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLander__ChangeAttitude__double_double_double(), null, "changeAttitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "xAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "yAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getLander__ResetAttitude(), null, "resetAttitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLander__CommandAngularVelocities__double_double(), null, "commandAngularVelocities", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "xAngularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "yAngularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLander__CommandThrust__double(), null, "commandThrust", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "thrustLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLander__ChangeThrustBy__double(), null, "changeThrustBy", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "thrustOffset", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLander__StartFlying__boolean(), null, "startFlying", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "logStateChanges", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getLander__StopFlying(), null, "stopFlying", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(landerStubEClass, LanderStub.class, "LanderStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(landerSimulatedEClass, LanderSimulated.class, "LanderSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(landerLegExtensionEEnum, LanderLegExtension.class, "LanderLegExtension");
		addEEnumLiteral(landerLegExtensionEEnum, LanderLegExtension.LEG_POSITION1);
		addEEnumLiteral(landerLegExtensionEEnum, LanderLegExtension.LEG_POSITION2);
		addEEnumLiteral(landerLegExtensionEEnum, LanderLegExtension.LEG_POSITION3);
		addEEnumLiteral(landerLegExtensionEEnum, LanderLegExtension.LEG_POSITION4);

		// Initialize data types
		initEDataType(matrix3dEDataType, Matrix3d.class, "Matrix3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "ApogyExamplesLander",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyExamplesLander",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.examples.lander/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.examples.lander.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.examples"
		   });	
		addAnnotation
		  (matrix3dEDataType, 
		   source, 
		   new String[] {
			 "documentation", "A 3x3 Matrix, used to help implement the lander\'s position,\nnamely the 3D pose of the lander."
		   });	
		addAnnotation
		  (positionEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class defines the position of an object in 3D space.\nIn particular, it provides the object\'s Cartesian coordinates\n(x, y, z) as a 3x3 matrix corresponding to its current rotation\nin all three axes."
		   });	
		addAnnotation
		  (getPosition_X(), 
		   source, 
		   new String[] {
			 "documentation", "This is an object\'s X position in 3D space\n@see #y\n@see #z",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Location",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Y(), 
		   source, 
		   new String[] {
			 "documentation", "This is an object\'s Y position in 3D space\n@see #x\n@see #z",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Location",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Z(), 
		   source, 
		   new String[] {
			 "documentation", "This is an object\'s Z position in 3D space\n@see #x\n@see #y",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Location",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getPosition_Attitude(), 
		   source, 
		   new String[] {
			 "documentation", "This is a 3x3 matrix, representing an object\'s rotations\n(if any) in all three of the primary axes.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Attitude"
		   });	
		addAnnotation
		  (landerLegExtensionEEnum, 
		   source, 
		   new String[] {
			 "documentation", "This enumeration is used to define the possible levels\nof extension that the lander\'s legs can have."
		   });	
		addAnnotation
		  (landerLegExtensionEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "documentation", "This defines a lander leg position in which the\nleg is not extended at all.\n@see #LegPosition2\n@see #LegPosition3\n@see #LegPosition4"
		   });	
		addAnnotation
		  (landerLegExtensionEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "documentation", "This defines a lander leg position in which the\nleg is extended a third of a full possible extension.\n@see #LegPosition1\n@see #LegPosition3\n@see #LegPosition4"
		   });	
		addAnnotation
		  (landerLegExtensionEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "documentation", "This defines a lander leg position in which the\nleg is extended two-thirds of a full possible extension.\n@see #LegPosition1\n@see #LegPosition2\n@see #LegPosition4"
		   });	
		addAnnotation
		  (landerLegExtensionEEnum.getELiterals().get(3), 
		   source, 
		   new String[] {
			 "documentation", "This defines a lander leg position in which the\nleg is completely extended.\n@see #LegPosition1\n@see #LegPosition2\n@see #LegPosition3"
		   });	
		addAnnotation
		  (landerEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represents a four-legged lander,\nincluding all of its relevant state information (e.g.\nposition, current leg extensions, etc.) as well as\nthe operations that it can perform."
		   });	
		addAnnotation
		  (getLander__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation performs the steps required in order to\ninitialize the lander.\n@return Whether or not the lander was successfully initialized"
		   });	
		addAnnotation
		  (getLander__CommandLegPosition__LanderLegExtension_LanderLegExtension_LanderLegExtension(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the extension positions\nfor each of the legs of the lander.  Note that extending or\nretracting the legs is a non-instantaneous process and it\'s\nlikely it will take some period of time to move the lander\'s\nlegs to the target positions.\n@param legAExtension The new leg extension position for leg A.\n@param legBExtension The new leg extension position for leg B.\n@param legCExtension The new leg extension position for leg C."
		   });	
		addAnnotation
		  (getLander__MoveTo__double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to move the lander to the specified X, Y and\nZ coordinates.\n@param x The lander\'s new desired X coordinate\n@param y The lander\'s new desired Y coordinate\n@param z The lander\'s new desired Z coordinate"
		   });	
		addAnnotation
		  (getLander__ChangeAttitude__double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the lander\'s attitude /\norientation to the specified angles.\n@param xAngle The lander\'s new angle of rotation (in radians) around the X axis\n@param yAngle The lander\'s new angle of rotation (in radians) around the Y axis\n@param zAngle The lander\'s new angle of rotation (in radians) around the Z axis"
		   });	
		addAnnotation
		  ((getLander__ChangeAttitude__double_double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getLander__ChangeAttitude__double_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  ((getLander__ChangeAttitude__double_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getLander__ResetAttitude(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to reset the lander\'s attitude /\nposition to its initial state, namely where there is no\nrotation from any of the primary axes (X, Y, Z)."
		   });	
		addAnnotation
		  (getLander__CommandAngularVelocities__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to update the both the lander\'s\nX and Y angular velocities (in radians per second.)\n<p>\nNote 1: These velocities are only used while the lander\n\t\t   is flying; while not flying, changing these values\n        will have no effect.\n<p>\nNote 2: Unlike the traditional definition of angular velocity\n        as a vector, this is simply a signed scalar; a positive\n        value is the rotation in the counter-clockwise direction\n        while a negative value implies the rotation is in the\n        clockwise direction.  Zero means there is no rotation.\n@param xAngularVelocity The new X angular velocity for the lander (given in radians / second)\n@param yAngularVelocity The new Y angular velocity for the lander (given in radians / second)"
		   });	
		addAnnotation
		  ((getLander__CommandAngularVelocities__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  ((getLander__CommandAngularVelocities__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "rad/s"
		   });	
		addAnnotation
		  (getLander__CommandThrust__double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to update the lander\'s thrust level\n(which is given in newtons.)\n<p>\nNote: The thrust level is always bounded by\n\t\t [thruster.getMinimumThrust(), thruster.getMaximumThrust()]\n\n@param thrustLevel The lander\'s new thrust level (given in N)"
		   });	
		addAnnotation
		  ((getLander__CommandThrust__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "N"
		   });	
		addAnnotation
		  (getLander__ChangeThrustBy__double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the lander\'s current thrust\nlevel by the specified (absolute) offset (which is given in\nnewtons.)\n<p>\nNote: The thrust level is always bounded by\n\t\t [thruster.getMinimumThrust(), thruster.getMaximumThrust()]\n\n@param thrustOffset The amount (in N) that the thrust level should be increased / decreased."
		   });	
		addAnnotation
		  ((getLander__ChangeThrustBy__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "N"
		   });	
		addAnnotation
		  (getLander__StartFlying__boolean(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to permit the lander to start flying.\n<p>\nWhether or not the lander is able to actually fly is dependent on\nthe mass of the lander, the lander\'s current thrust and the gravity\nbeing used (e.g. the Earth\'s gravity, g ~= -9.81); there may\npotentially be other factors as well.\n@param logStateChanges Whether or not to log the state changes that occur because it has started flying\n@see #canFly()\n@see #stopFlying()"
		   });	
		addAnnotation
		  (getLander__StopFlying(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to indicate that the lander is no longer\nallowed to fly and should stop doing so; it may need to perform\nactions to land the lander.\n@see #canFly()\n@see #startFlying(boolean)"
		   });	
		addAnnotation
		  (getLander_Position(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the lander\'s position in 3D space,\nboth in terms of Cartesian coordinates as well\nas the current 3D orientation of lander (represented\nas rotations from the primary axes)",
			 "notify", "true",
			 "propertyCategory", "Position"
		   });	
		addAnnotation
		  (getLander_Thruster(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the lander\'s thruster, which controls\nthe",
			 "notify", "true",
			 "propertyCategory", "Flight"
		   });	
		addAnnotation
		  (getLander_LegAExtension(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the desired / selected level of\nextension for the lander\'s leg A.",
			 "children", "false",
			 "notify", "true",
			 "propertyCategory", "Leg Extension Levels"
		   });	
		addAnnotation
		  (getLander_LegBExtension(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the desired / selected level of\nextension for the lander\'s leg B.",
			 "children", "false",
			 "notify", "true",
			 "propertyCategory", "Leg Extension Levels"
		   });	
		addAnnotation
		  (getLander_LegCExtension(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the desired / selected level of\nextension for the lander\'s leg C.",
			 "children", "false",
			 "notify", "true",
			 "propertyCategory", "Leg Extension Levels"
		   });	
		addAnnotation
		  (getLander_LegAPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the current extension position\nfor the lander\'s leg A.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "m",
			 "propertyCategory", "Leg Positions"
		   });	
		addAnnotation
		  (getLander_LegBPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the current extension position\nfor the lander\'s leg B.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "m",
			 "propertyCategory", "Leg Positions"
		   });	
		addAnnotation
		  (getLander_LegCPosition(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the current extension position\nfor the lander\'s leg C.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "apogy_units", "m",
			 "propertyCategory", "Leg Positions"
		   });	
		addAnnotation
		  (getLander_XAngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the current angular velocity\n(in radians per second) of the lander in the X\ndirection.\n<p>\nNote: Unlike the traditional definition of angular\nvelocity as a vector, this is simply a signed scalar;\na positive value is the rotation in the counter-\nclockwise direction while a negative value implies the\nrotation is in the clockwise direction.  Zero means\nthere is no rotation.\n@see #commandAngularVelocities(double, double)",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "rad/s",
			 "propertyCategory", "Velocities"
		   });	
		addAnnotation
		  (getLander_YAngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the current angular velocity\n(in radians per second) of the lander in the Y\ndirection.\n<p>\nNote: Unlike the traditional definition of angular\nvelocity as a vector, this is simply a signed scalar;\na positive value is the rotation in the counter-\nclockwise direction while a negative value implies the\nrotation is in the clockwise direction.  Zero means\nthere is no rotation.\n@see #commandAngularVelocities(double, double)",
			 "children", "false",
			 "notify", "true",
			 "apogy_units", "rad/s",
			 "propertyCategory", "Velocities"
		   });	
		addAnnotation
		  (getLander_Mass(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the mass of the lander (in kg).",
			 "children", "false",
			 "apogy_units", "kg",
			 "property", "Readonly",
			 "propertyCategory", "Flight"
		   });	
		addAnnotation
		  (getLander_FuelMass(), 
		   source, 
		   new String[] {
			 "documentation", "This represents the fuel mass of the lander (in kg).",
			 "children", "false",
			 "apogy_units", "kg",
			 "property", "Readonly",
			 "propertyCategory", "Flight"
		   });	
		addAnnotation
		  (getLander_GravitationalPull(), 
		   source, 
		   new String[] {
			 "documentation", "This is the amount of force (in N) of gravity that is being\nimposed upon the lander.\n<p>\nRecall that that the gravitational force impose on an object\n(like a lander) in relation to a celestial body is affected by:\n<ul>\n\t <li>the mass of the lander</li>\n  <li>the mass of the celestial body the lander is on / above</li>\n  <li>the distance between the lander and the body</li>\n</ul>\n@return The amount of gravitational force (in N) imposed upon the lander",
			 "children", "false",
			 "apogy_units", "N",
			 "property", "Readonly",
			 "propertyCategory", "Flight"
		   });	
		addAnnotation
		  (getLander_ChangingLegs(), 
		   source, 
		   new String[] {
			 "documentation", "This represents whether or not the lander\'s legs are\ncurrently extending / retracting, as a result of a\ncommandLegPosition() operation; initially false.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getLander_ChangingAttitude(), 
		   source, 
		   new String[] {
			 "documentation", "This represents whether or not the lander is currently\nchanging its attitude, as a result of a changeAttitude() /\nresetAttitude() operation; initially false.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getLander_ChangingLocation(), 
		   source, 
		   new String[] {
			 "documentation", "This represents whether or not the lander is currently\nchanging its coordinate location, as a result of a moveTo()\noperation; initially false.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status",
			 "propertyDescription", ""
		   });	
		addAnnotation
		  (getLander_FlyingEnabled(), 
		   source, 
		   new String[] {
			 "documentation", "This represents whether the lander is currently permitted\nto fly.  Just note that this does not necessary mean that\nthe lander will actually fly; that\'s dependent on a number\nof factors.\n@see #startFlying()\n@see #stopFlying()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Flight"
		   });	
		addAnnotation
		  (getLander_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This represents whether or not the lander has been\nsuccessfully initialized; initially false.\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getLander_Disposed(), 
		   source, 
		   new String[] {
			 "documentation", "This represents whether or not the lander has been\nsuccessfully disposed; initially false.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (landerStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the lander, in which all\noperations are stubs and hence, non-functional; the methods\nshould simply output a message indicating that they were performed."
		   });	
		addAnnotation
		  (landerSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the lander, in which all\noperations are simulated; while there is no physical components\ninteracted with, it attempts to emulate, wherever possible, the\nactions and results of its real world counterpart."
		   });
	}

} //ApogyExamplesLanderPackageImpl
