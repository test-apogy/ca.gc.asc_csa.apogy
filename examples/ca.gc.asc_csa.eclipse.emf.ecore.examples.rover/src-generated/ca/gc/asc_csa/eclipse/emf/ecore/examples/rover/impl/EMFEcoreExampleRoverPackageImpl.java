/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.EMFEcoreExampleMobilePlatformPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.Battery;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.EMFEcoreExampleRoverFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.EMFEcoreExampleRoverPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.PowerSystem;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.Rover;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.RoverSimulated;
import ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.RoverStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleRoverPackageImpl extends EPackageImpl implements EMFEcoreExampleRoverPackage
{
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerSystemEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roverEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roverStubEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roverSimulatedEClass = null;

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.EMFEcoreExampleRoverPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreExampleRoverPackageImpl()
  {
		super(eNS_URI, EMFEcoreExampleRoverFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreExampleRoverPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreExampleRoverPackage init()
  {
		if (isInited) return (EMFEcoreExampleRoverPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleRoverPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreExampleRoverPackageImpl theEMFEcoreExampleRoverPackage = (EMFEcoreExampleRoverPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreExampleRoverPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreExampleRoverPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcoreExampleMobilePlatformPackage.eINSTANCE.eClass();
		EMFEcoreExampleCameraPackage.eINSTANCE.eClass();
		EMFEcoreExampleRoboticArmPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreExampleRoverPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreExampleRoverPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreExampleRoverPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreExampleRoverPackage.eNS_URI, theEMFEcoreExampleRoverPackage);
		return theEMFEcoreExampleRoverPackage;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattery() {
		return batteryEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_Active() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_Voltage() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattery_Current() {
		return (EAttribute)batteryEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBattery__Activate() {
		return batteryEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBattery__Deactivate() {
		return batteryEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerSystem() {
		return powerSystemEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSystem_Batteries() {
		return (EReference)powerSystemEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerSystem_ActiveBattery() {
		return (EReference)powerSystemEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSystem_CurrentVoltage() {
		return (EAttribute)powerSystemEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerSystem_CurrentCurrent() {
		return (EAttribute)powerSystemEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPowerSystem__ChangeActiveBatteryTo__int() {
		return powerSystemEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRover()
  {
		return roverEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRover_RoboticArm()
  {
		return (EReference)roverEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRover_MobilePlatform()
  {
		return (EReference)roverEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRover_ArmCamera() {
		return (EReference)roverEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRover_CenterCamera() {
		return (EReference)roverEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRover_PowerSystem() {
		return (EReference)roverEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRover_LinearVelocity() {
		return (EAttribute)roverEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRover_AngularVelocity() {
		return (EAttribute)roverEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRover_Initialized() {
		return (EAttribute)roverEClass.getEStructuralFeatures().get(7);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRover_Disposed() {
		return (EAttribute)roverEClass.getEStructuralFeatures().get(8);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRover__Init()
  {
		return roverEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRover__CmdLinearVelocity__double() {
		return roverEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRover__CmdAngularVelocity__double() {
		return roverEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRover__CmdVelocities__double_double() {
		return roverEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoverStub()
  {
		return roverStubEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoverSimulated() {
		return roverSimulatedEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleRoverFactory getEMFEcoreExampleRoverFactory()
  {
		return (EMFEcoreExampleRoverFactory)getEFactoryInstance();
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
		batteryEClass = createEClass(BATTERY);
		createEAttribute(batteryEClass, BATTERY__ACTIVE);
		createEAttribute(batteryEClass, BATTERY__VOLTAGE);
		createEAttribute(batteryEClass, BATTERY__CURRENT);
		createEOperation(batteryEClass, BATTERY___ACTIVATE);
		createEOperation(batteryEClass, BATTERY___DEACTIVATE);

		powerSystemEClass = createEClass(POWER_SYSTEM);
		createEReference(powerSystemEClass, POWER_SYSTEM__BATTERIES);
		createEReference(powerSystemEClass, POWER_SYSTEM__ACTIVE_BATTERY);
		createEAttribute(powerSystemEClass, POWER_SYSTEM__CURRENT_VOLTAGE);
		createEAttribute(powerSystemEClass, POWER_SYSTEM__CURRENT_CURRENT);
		createEOperation(powerSystemEClass, POWER_SYSTEM___CHANGE_ACTIVE_BATTERY_TO__INT);

		roverEClass = createEClass(ROVER);
		createEReference(roverEClass, ROVER__ROBOTIC_ARM);
		createEReference(roverEClass, ROVER__MOBILE_PLATFORM);
		createEReference(roverEClass, ROVER__ARM_CAMERA);
		createEReference(roverEClass, ROVER__CENTER_CAMERA);
		createEReference(roverEClass, ROVER__POWER_SYSTEM);
		createEAttribute(roverEClass, ROVER__LINEAR_VELOCITY);
		createEAttribute(roverEClass, ROVER__ANGULAR_VELOCITY);
		createEAttribute(roverEClass, ROVER__INITIALIZED);
		createEAttribute(roverEClass, ROVER__DISPOSED);
		createEOperation(roverEClass, ROVER___INIT);
		createEOperation(roverEClass, ROVER___CMD_LINEAR_VELOCITY__DOUBLE);
		createEOperation(roverEClass, ROVER___CMD_ANGULAR_VELOCITY__DOUBLE);
		createEOperation(roverEClass, ROVER___CMD_VELOCITIES__DOUBLE_DOUBLE);

		roverStubEClass = createEClass(ROVER_STUB);

		roverSimulatedEClass = createEClass(ROVER_SIMULATED);
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
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		EMFEcoreExampleRoboticArmPackage theEMFEcoreExampleRoboticArmPackage = (EMFEcoreExampleRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleRoboticArmPackage.eNS_URI);
		EMFEcoreExampleMobilePlatformPackage theEMFEcoreExampleMobilePlatformPackage = (EMFEcoreExampleMobilePlatformPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleMobilePlatformPackage.eNS_URI);
		EMFEcoreExampleCameraPackage theEMFEcoreExampleCameraPackage = (EMFEcoreExampleCameraPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleCameraPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roverEClass.getESuperTypes().add(theEMFEcorePackage.getDisposable());
		roverStubEClass.getESuperTypes().add(this.getRover());
		roverSimulatedEClass.getESuperTypes().add(this.getRover());

		// Initialize classes, features, and operations; add parameters
		initEClass(batteryEClass, Battery.class, "Battery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBattery_Active(), theEcorePackage.getEBoolean(), "active", null, 0, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBattery_Voltage(), theEcorePackage.getEDouble(), "voltage", "0.0", 0, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBattery_Current(), theEcorePackage.getEDouble(), "current", "0.0", 0, 1, Battery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBattery__Activate(), null, "activate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getBattery__Deactivate(), null, "deactivate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(powerSystemEClass, PowerSystem.class, "PowerSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerSystem_Batteries(), this.getBattery(), null, "batteries", null, 1, -1, PowerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerSystem_ActiveBattery(), this.getBattery(), null, "activeBattery", null, 1, 1, PowerSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerSystem_CurrentVoltage(), theEcorePackage.getEDouble(), "currentVoltage", null, 0, 1, PowerSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowerSystem_CurrentCurrent(), theEcorePackage.getEDouble(), "currentCurrent", null, 0, 1, PowerSystem.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPowerSystem__ChangeActiveBatteryTo__int(), null, "changeActiveBatteryTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "batteryIndex", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(roverEClass, Rover.class, "Rover", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRover_RoboticArm(), theEMFEcoreExampleRoboticArmPackage.getRoboticArm(), null, "roboticArm", null, 1, 1, Rover.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRover_MobilePlatform(), theEMFEcoreExampleMobilePlatformPackage.getMobilePlatform(), null, "mobilePlatform", null, 1, 1, Rover.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRover_ArmCamera(), theEMFEcoreExampleCameraPackage.getPTUCamera(), null, "armCamera", null, 1, 1, Rover.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRover_CenterCamera(), theEMFEcoreExampleCameraPackage.getPTUCamera(), null, "centerCamera", null, 1, 1, Rover.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRover_PowerSystem(), this.getPowerSystem(), null, "powerSystem", null, 1, 1, Rover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRover_LinearVelocity(), theEcorePackage.getEDouble(), "linearVelocity", null, 0, 1, Rover.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRover_AngularVelocity(), theEcorePackage.getEDouble(), "angularVelocity", null, 0, 1, Rover.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRover_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, Rover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRover_Disposed(), theEcorePackage.getEBoolean(), "disposed", "false", 0, 1, Rover.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRover__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRover__CmdLinearVelocity__double(), null, "cmdLinearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "linearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRover__CmdAngularVelocity__double(), null, "cmdAngularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRover__CmdVelocities__double_double(), null, "cmdVelocities", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "linearVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angularVelocity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(roverStubEClass, RoverStub.class, "RoverStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roverSimulatedEClass, RoverSimulated.class, "RoverSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "EMFEcoreExampleRover",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015",
			 "modelName", "EMFEcoreExampleRover",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/ca.gc.asc_csa.eclipse.emf.ecore.examples.rover/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.eclipse.emf.ecore.examples"
		   });	
		addAnnotation
		  (batteryEClass, 
		   source, 
		   new String[] {
			 "documentation", "This class represents a battery in the rover\'s\npower system; note that the rover\'s power supply\nis comprised of several battery."
		   });	
		addAnnotation
		  (getBattery__Activate(), 
		   source, 
		   new String[] {
			 "documentation", "This is used to activate this battery, changing\nthe voltage and current that it outputs from zero."
		   });	
		addAnnotation
		  (getBattery__Deactivate(), 
		   source, 
		   new String[] {
			 "documentation", "This is used to deactivate this battery, changing\nthe voltage and current that it outputs to zero."
		   });	
		addAnnotation
		  (getBattery_Active(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the battery is active",
			 "notify", "true",
			 "children", "false",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getBattery_Voltage(), 
		   source, 
		   new String[] {
			 "documentation", "This is the voltage output by the battery,\nas measured in volts; initially, zero",
			 "notify", "true",
			 "csa_units", "V",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getBattery_Current(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current output by the battery,\nas measured in amps; initially, zero",
			 "notify", "true",
			 "csa_units", "A",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (powerSystemEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is the rover\'s internal power system, which is\nused to return the"
		   });	
		addAnnotation
		  (getPowerSystem__ChangeActiveBatteryTo__int(), 
		   source, 
		   new String[] {
			 "documentation", "This is used to change the active battery to\nthe battery located at the given index in the\nlist (or array) of batteries.\n@param batteryIndex The index of the battery to change to"
		   });	
		addAnnotation
		  (getPowerSystem_Batteries(), 
		   source, 
		   new String[] {
			 "documentation", "This is the array of batteries comprising the\npower system.",
			 "notify", "true",
			 "createChild", "false"
		   });	
		addAnnotation
		  (getPowerSystem_ActiveBattery(), 
		   source, 
		   new String[] {
			 "documentation", "This is the currently active battery",
			 "notify", "true"
		   });	
		addAnnotation
		  (getPowerSystem_CurrentVoltage(), 
		   source, 
		   new String[] {
			 "documentation", "This is used to get the voltage that the power system\nis currently outputting.",
			 "notify", "true",
			 "csa_units", "V",
			 "get", "<%ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.Battery%> _activeBattery = this.getActiveBattery();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_activeBattery, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.Battery%> _activeBattery_1 = this.getActiveBattery();\n\treturn _activeBattery_1.getVoltage();\n}\nelse\n{\n\treturn 0.0;\n}"
		   });	
		addAnnotation
		  (getPowerSystem_CurrentCurrent(), 
		   source, 
		   new String[] {
			 "documentation", "This is used to get the current that the power system\nis currently outputting.",
			 "notify", "true",
			 "csa_units", "A",
			 "get", "<%ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.Battery%> _activeBattery = this.getActiveBattery();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_activeBattery, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.examples.rover.Battery%> _activeBattery_1 = this.getActiveBattery();\n\treturn _activeBattery_1.getCurrent();\n}\nelse\n{\n\treturn 0.0;\n}"
		   });	
		addAnnotation
		  (roverEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represents a rover assembly, including\nits relevant state (e.g. component parts) as well as the\noperations that it can perform."
		   });	
		addAnnotation
		  (getRover__Init(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to perform the required initialization functions\non the rover assembly; this may involve bootstrapping the components\nof the rover (e.g. mobile platform, cameras, etc.)\n@return Whether or not the rover assembly was successfully initialized"
		   });	
		addAnnotation
		  (getRover__CmdLinearVelocity__double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the linear velocity of the rover\nassembly to the provided value (given in m/s); internally, this is\nlikely to cause a change to the mobile platform, as it is this component\nwhich actually moves the rover.\n<p>\nNote: Unlike the traditional definition of linear velocity as a vector,\nthis is simply a signed scalar; a positive value indicates the speed\nforward while a negative value is the speed backwards.  Zero means there\nis no movement.\n\n@param linearVelocity The rover assembly\'s new linear velocity (in m/s)\n@see #cmdVelocities(double, double)"
		   });	
		addAnnotation
		  ((getRover__CmdLinearVelocity__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "m/s"
		   });	
		addAnnotation
		  (getRover__CmdAngularVelocity__double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change the angular velocity of the rover\nassembly to the provided value (given in radians / second); internally,\nthis is likely to cause a change to the mobile platform, as it is this\ncomponent which actually moves the rover.\n<p>\nNote: Unlike the traditional definition of angular velocity as a vector,\nthis is simply a signed scalar; a positive value is the rotation in the\nclockwise direction while a negative value implies the rotation is in the\ncounter-clockwise direction.  Zero means there is no rotation.\n\n@param angularVelocity The rover assembly\'s new angular velocity (in rad/s)\n@see #cmdVelocities(double, double)"
		   });	
		addAnnotation
		  ((getRover__CmdAngularVelocity__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad/s"
		   });	
		addAnnotation
		  (getRover__CmdVelocities__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "This operation is used to change both the linear velocity (given in m/s)\nand angular velocity (given in rad/s) of the rover assembly to the\nprovided values; internally, this is likely to cause a change to the\nmobile platform, as it is this component which actually moves the rover.\n<p>\nNote 1: Unlike the traditional definition of linear velocity as a vector,\nthis is simply a signed scalar; a positive value indicates the speed\nforward while a negative value is the speed backwards.  Zero means there\nis no movement.\n<p>\nNote 2: Unlike the traditional definition of angular velocity as a vector,\nthis is simply a signed scalar; a positive value is the rotation in the\nclockwise direction while a negative value implies the rotation is in the\ncounter-clockwise direction.  Zero means there is no rotation.\n\n@param linearVelocity The rover assembly\'s new linear velocity (in m/s)\n@param angularVelocity The rover assembly\'s new angular velocity (in rad/s)\n@see #cmdLinearVelocity(double)\n@see #cmdAngularVelocity(double)"
		   });	
		addAnnotation
		  ((getRover__CmdVelocities__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "m/s"
		   });	
		addAnnotation
		  ((getRover__CmdVelocities__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "csa_units", "rad/s"
		   });	
		addAnnotation
		  (getRover_RoboticArm(), 
		   source, 
		   new String[] {
			 "documentation", "A robotic arm used by the rover assembly to interact\nwith the environment.",
			 "notify", "true",
			 "propertyCategory", "Subcomponents",
			 "children", "true"
		   });	
		addAnnotation
		  (getRover_MobilePlatform(), 
		   source, 
		   new String[] {
			 "documentation", "A mobile platform used by the rover assembly to move\naround the environment",
			 "notify", "true",
			 "propertyCategory", "Subcomponents",
			 "children", "true"
		   });	
		addAnnotation
		  (getRover_ArmCamera(), 
		   source, 
		   new String[] {
			 "documentation", "A camera mounted on the arm of the rover assembly to\ntake pictures of the environment; from those photos,\nadditional visual information may be extracted.",
			 "notify", "true",
			 "propertyCategory", "Subcomponents",
			 "children", "true"
		   });	
		addAnnotation
		  (getRover_CenterCamera(), 
		   source, 
		   new String[] {
			 "documentation", "A camera mounted on the center of the rover mast assembly to\ntake pictures of the environment; from those photos,\nadditional visual information may be extracted.",
			 "notify", "true",
			 "propertyCategory", "Subcomponents",
			 "children", "true"
		   });	
		addAnnotation
		  (getRover_PowerSystem(), 
		   source, 
		   new String[] {
			 "documentation", "A power system which is used to power the Rover.",
			 "notify", "true",
			 "propertyCategory", "Subcomponents"
		   });	
		addAnnotation
		  (getRover_LinearVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This is the linear velocity of the rover (given in\nmetres per second.)\n<p>\nNote: Unlike the traditional definition of linear velocity\nas a vector, this is simply a signed scalar; a positive\nvalue indicates the speed forward while a negative value\nis the speed backwards.  Zero means there is no movement.",
			 "children", "false",
			 "notify", "true",
			 "csa_units", "m/s",
			 "property", "Readonly",
			 "propertyCategory", "Velocities",
			 "get", "<%ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.MobilePlatform%> _mobilePlatform = this.getMobilePlatform();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_mobilePlatform, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.MobilePlatform%> _mobilePlatform_1 = this.getMobilePlatform();\n\treturn _mobilePlatform_1.getLinearVelocity();\n}\nelse\n{\n\treturn 0.0;\n}"
		   });	
		addAnnotation
		  (getRover_AngularVelocity(), 
		   source, 
		   new String[] {
			 "documentation", "This is the angular velocity of the rover (given in\nradians per second.)\n<p>\nNote: Unlike the traditional definition of angular\nvelocity as a vector, this is simply a signed scalar;\na positive value is the rotation in the clockwise\ndirection while a negative value implies the rotation\nis in the counter-clockwise direction.  Zero means\nthere is no rotation.",
			 "children", "false",
			 "notify", "true",
			 "csa_units", "rad/s",
			 "property", "Readonly",
			 "propertyCategory", "Velocities",
			 "get", "<%ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.MobilePlatform%> _mobilePlatform = this.getMobilePlatform();\nboolean _notEquals = (!<%com.google.common.base.Objects%>.equal(_mobilePlatform, null));\nif (_notEquals)\n{\n\t<%ca.gc.asc_csa.eclipse.emf.ecore.examples.mobile_platform.MobilePlatform%> _mobilePlatform_1 = this.getMobilePlatform();\n\treturn _mobilePlatform_1.getAngularVelocity();\n}\nelse\n{\n\treturn 0.0;\n}"
		   });	
		addAnnotation
		  (getRover_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the rover has been initialized\nsuccessfully; initially false.\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getRover_Disposed(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the rover has been disposed\nsuccessfully; initially false.\n@see #dispose()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (roverStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the rover, in which all operations\nare stubs and hence, non-functional; the operations should simply log a\nmessage, indicating that they were performed."
		   });	
		addAnnotation
		  (roverSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the rover, where all operations\nare executed upon a simulated (i.e. virtual) rover. While there are no\nphysical components interacted with, it attempts to emulate, wherever\npossible, the actions and results of its real world counterpart(s)."
		   });
	}

} //EMFEcoreExampleRoverPackageImpl
