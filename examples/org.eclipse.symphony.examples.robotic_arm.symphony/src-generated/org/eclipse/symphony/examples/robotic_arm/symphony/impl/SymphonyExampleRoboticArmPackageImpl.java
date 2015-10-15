/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.symphony.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData;
import org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmSymphonySystemApiAdapter;
import org.eclipse.symphony.examples.robotic_arm.symphony.SymphonyExampleRoboticArmFactory;
import org.eclipse.symphony.examples.robotic_arm.symphony.SymphonyExampleRoboticArmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyExampleRoboticArmPackageImpl extends EPackageImpl implements SymphonyExampleRoboticArmPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roboticArmSymphonySystemApiAdapterEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roboticArmDataEClass = null;
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
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.SymphonyExampleRoboticArmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyExampleRoboticArmPackageImpl()
  {
		super(eNS_URI, SymphonyExampleRoboticArmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyExampleRoboticArmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyExampleRoboticArmPackage init()
  {
		if (isInited) return (SymphonyExampleRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyExampleRoboticArmPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyExampleRoboticArmPackageImpl theSymphonyExampleRoboticArmPackage = (SymphonyExampleRoboticArmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyExampleRoboticArmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyExampleRoboticArmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcoreExampleRoboticArmPackage.eINSTANCE.eClass();
		SymphonyCorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphonyExampleRoboticArmPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyExampleRoboticArmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyExampleRoboticArmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyExampleRoboticArmPackage.eNS_URI, theSymphonyExampleRoboticArmPackage);
		return theSymphonyExampleRoboticArmPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoboticArmSymphonySystemApiAdapter()
  {
		return roboticArmSymphonySystemApiAdapterEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoboticArmData()
  {
		return roboticArmDataEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArmData_Initialized() {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArmData_Speed() {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArmData_TurretAngle() {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArmData_ShoulderAngle()
  {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArmData_ElbowAngle()
  {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArmData_WristAngle()
  {
		return (EAttribute)roboticArmDataEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyExampleRoboticArmFactory getSymphonyExampleRoboticArmFactory()
  {
		return (SymphonyExampleRoboticArmFactory)getEFactoryInstance();
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
		roboticArmSymphonySystemApiAdapterEClass = createEClass(ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER);

		roboticArmDataEClass = createEClass(ROBOTIC_ARM_DATA);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__INITIALIZED);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__SPEED);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__TURRET_ANGLE);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__SHOULDER_ANGLE);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__ELBOW_ANGLE);
		createEAttribute(roboticArmDataEClass, ROBOTIC_ARM_DATA__WRIST_ANGLE);
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
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EMFEcoreExampleRoboticArmPackage theEMFEcoreExampleRoboticArmPackage = (EMFEcoreExampleRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleRoboticArmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roboticArmSymphonySystemApiAdapterEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonySystemApiAdapter());
		roboticArmDataEClass.getESuperTypes().add(theSymphonyCorePackage.getSymphonyInitializationData());

		// Initialize classes, features, and operations; add parameters
		initEClass(roboticArmSymphonySystemApiAdapterEClass, RoboticArmSymphonySystemApiAdapter.class, "RoboticArmSymphonySystemApiAdapter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roboticArmDataEClass, RoboticArmData.class, "RoboticArmData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoboticArmData_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_Speed(), theEMFEcoreExampleRoboticArmPackage.getMoveSpeedLevel(), "speed", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_TurretAngle(), theEcorePackage.getEDouble(), "turretAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_ShoulderAngle(), theEcorePackage.getEDouble(), "shoulderAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_ElbowAngle(), theEcorePackage.getEDouble(), "elbowAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArmData_WristAngle(), theEcorePackage.getEDouble(), "wristAngle", null, 0, 1, RoboticArmData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SymphonyExampleRoboticArmPackageImpl
