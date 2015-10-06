/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmFactory;
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;
import org.eclipse.symphony.examples.robotic_arm.RoboticArmSimulated;
import org.eclipse.symphony.examples.robotic_arm.RoboticArmStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreExampleRoboticArmPackageImpl extends EPackageImpl implements EMFEcoreExampleRoboticArmPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roboticArmEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roboticArmStubEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass roboticArmSimulatedEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moveSpeedLevelEEnum = null;

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
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreExampleRoboticArmPackageImpl()
  {
		super(eNS_URI, EMFEcoreExampleRoboticArmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFEcoreExampleRoboticArmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreExampleRoboticArmPackage init()
  {
		if (isInited) return (EMFEcoreExampleRoboticArmPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreExampleRoboticArmPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreExampleRoboticArmPackageImpl theEMFEcoreExampleRoboticArmPackage = (EMFEcoreExampleRoboticArmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreExampleRoboticArmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreExampleRoboticArmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreExampleRoboticArmPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreExampleRoboticArmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreExampleRoboticArmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreExampleRoboticArmPackage.eNS_URI, theEMFEcoreExampleRoboticArmPackage);
		return theEMFEcoreExampleRoboticArmPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoboticArm()
  {
		return roboticArmEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArm_Speed() {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoboticArm__Init() {
		return roboticArmEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArm_TurretAngle() {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArm_ShoulderAngle()
  {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArm_ElbowAngle()
  {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRoboticArm_WristAngle()
  {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArm_Initialized() {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoboticArm_ArmMoving() {
		return (EAttribute)roboticArmEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRoboticArm__MoveTo__double_double_double_double()
  {
		return roboticArmEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoboticArm__Stow() {
		return roboticArmEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoboticArm__CmdMoveSpeedLevel__MoveSpeedLevel() {
		return roboticArmEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoboticArmStub() {
		return roboticArmStubEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRoboticArmSimulated()
  {
		return roboticArmSimulatedEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMoveSpeedLevel() {
		return moveSpeedLevelEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreExampleRoboticArmFactory getEMFEcoreExampleRoboticArmFactory()
  {
		return (EMFEcoreExampleRoboticArmFactory)getEFactoryInstance();
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
		roboticArmEClass = createEClass(ROBOTIC_ARM);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__TURRET_ANGLE);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__SHOULDER_ANGLE);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__ELBOW_ANGLE);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__WRIST_ANGLE);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__INITIALIZED);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__ARM_MOVING);
		createEAttribute(roboticArmEClass, ROBOTIC_ARM__SPEED);
		createEOperation(roboticArmEClass, ROBOTIC_ARM___INIT);
		createEOperation(roboticArmEClass, ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL);
		createEOperation(roboticArmEClass, ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE);
		createEOperation(roboticArmEClass, ROBOTIC_ARM___STOW);

		roboticArmStubEClass = createEClass(ROBOTIC_ARM_STUB);

		roboticArmSimulatedEClass = createEClass(ROBOTIC_ARM_SIMULATED);

		// Create enums
		moveSpeedLevelEEnum = createEEnum(MOVE_SPEED_LEVEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roboticArmStubEClass.getESuperTypes().add(this.getRoboticArm());
		roboticArmSimulatedEClass.getESuperTypes().add(this.getRoboticArm());

		// Initialize classes, features, and operations; add parameters
		initEClass(roboticArmEClass, RoboticArm.class, "RoboticArm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoboticArm_TurretAngle(), theEcorePackage.getEDouble(), "turretAngle", "0.0", 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArm_ShoulderAngle(), theEcorePackage.getEDouble(), "shoulderAngle", "90.0", 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArm_ElbowAngle(), theEcorePackage.getEDouble(), "elbowAngle", "-180.0", 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArm_WristAngle(), theEcorePackage.getEDouble(), "wristAngle", "0.0", 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArm_Initialized(), theEcorePackage.getEBoolean(), "initialized", "false", 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArm_ArmMoving(), theEcorePackage.getEBoolean(), "armMoving", "false", 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoboticArm_Speed(), this.getMoveSpeedLevel(), "speed", null, 0, 1, RoboticArm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRoboticArm__Init(), theEcorePackage.getEBoolean(), "init", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getRoboticArm__CmdMoveSpeedLevel__MoveSpeedLevel(), null, "cmdMoveSpeedLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMoveSpeedLevel(), "speedLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRoboticArm__MoveTo__double_double_double_double(), null, "moveTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "turretAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "shoulderAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "elbowAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "wristAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRoboticArm__Stow(), null, "stow", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(roboticArmStubEClass, RoboticArmStub.class, "RoboticArmStub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roboticArmSimulatedEClass, RoboticArmSimulated.class, "RoboticArmSimulated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(moveSpeedLevelEEnum, MoveSpeedLevel.class, "MoveSpeedLevel");
		addEEnumLiteral(moveSpeedLevelEEnum, MoveSpeedLevel.SLOW);
		addEEnumLiteral(moveSpeedLevelEEnum, MoveSpeedLevel.MEDIUM);
		addEEnumLiteral(moveSpeedLevelEEnum, MoveSpeedLevel.FAST);

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
			 "prefix", "EMFEcoreExampleRoboticArm",
			 "copyrightText", "Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015",
			 "modelName", "EMFEcoreExampleRoboticArm",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.examples.robotic_arm/src-generated",
			 "editDirectory", "/org.eclipse.symphony.examples.robotic_arm.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.examples"
		   });	
		addAnnotation
		  (moveSpeedLevelEEnum, 
		   source, 
		   new String[] {
			 "documentation", "This enumeration is used to indicate the overall possible\nlevels of speed that a robotic arm can move at; as\nexpected, this used by RoboticArm (and its subclasses) when\nmoveTo() is called."
		   });	
		addAnnotation
		  (moveSpeedLevelEEnum.getELiterals().get(0), 
		   source, 
		   new String[] {
			 "documentation", "This indicates that the robotic arm should move at a slower\nspeed, when compared to the other move speed levels."
		   });	
		addAnnotation
		  (moveSpeedLevelEEnum.getELiterals().get(1), 
		   source, 
		   new String[] {
			 "documentation", "This indicates that the robotic arm should move at an average\nspeed, when compared to the other move speed levels."
		   });	
		addAnnotation
		  (moveSpeedLevelEEnum.getELiterals().get(2), 
		   source, 
		   new String[] {
			 "documentation", "This indicates that the robotic arm should move at a faster\nspeed, when compared to the other move speed levels."
		   });	
		addAnnotation
		  (roboticArmEClass, 
		   source, 
		   new String[] {
			 "documentation", "This abstract class represents a robotic arm, including\nits relevant state information (e.g. joint angles) as well\nas the operations that it can perform."
		   });	
		addAnnotation
		  (getRoboticArm__Init(), 
		   source, 
		   new String[] {
			 "documentation", "Performs the required operations required in order to initialize\nthe robotic arm.\n@return Whether or not the robotic arm was successfully initialized."
		   });	
		addAnnotation
		  (getRoboticArm__CmdMoveSpeedLevel__MoveSpeedLevel(), 
		   source, 
		   new String[] {
			 "documentation", "Changes the level of speed at which the robotic arm should move; this\nis likely to be used by both moveTo() and stow() as they both involve\nmoving the arm.\n@param speedLevel The new move speed level, indicating how fast the arm should move."
		   });	
		addAnnotation
		  (getRoboticArm__MoveTo__double_double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Initiates the motion of the arm and move the arm to the specified configuration.\n@param turretAngle The expected angle (in radians) of the turret joint (joint 1) after moving\n@param shoulderAngle The expected angle (in radians) of the shoulder joint (joint 2) after moving.\n@param elbowAngle The expected angle (in radians) of the elbow joint (joint 3) after moving.\n@param wristAngle The expected angle (in radians) of the wrist joint (joint 4) after moving."
		   });	
		addAnnotation
		  ((getRoboticArm__MoveTo__double_double_double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getRoboticArm__MoveTo__double_double_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getRoboticArm__MoveTo__double_double_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getRoboticArm__MoveTo__double_double_double_double()).getEParameters().get(3), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getRoboticArm__Stow(), 
		   source, 
		   new String[] {
			 "documentation", "Initiates the motion of the arm and moves the arm to the stow configuration."
		   });	
		addAnnotation
		  (getRoboticArm_TurretAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current turret angle, in degrees.\n@see #moveTo(double, double, double, double)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Joint Angles",
			 "csa_units", "\u00b0"
		   });	
		addAnnotation
		  (getRoboticArm_ShoulderAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current shoulder angle, in degrees.\n@see #moveTo(double, double, double, double)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Joint Angles",
			 "csa_units", "\u00b0"
		   });	
		addAnnotation
		  (getRoboticArm_ElbowAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current elbow angle, in degrees.\n@see #moveTo(double, double, double, double)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Joint Angles",
			 "csa_units", "\u00b0"
		   });	
		addAnnotation
		  (getRoboticArm_WristAngle(), 
		   source, 
		   new String[] {
			 "documentation", "This is the current wrist angle, in degrees.\n@see #moveTo(double, double, double, double)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Joint Angles",
			 "csa_units", "\u00b0"
		   });	
		addAnnotation
		  (getRoboticArm_Initialized(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the robotic arm has been\ninitialized; initially false\n@see #init()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getRoboticArm_ArmMoving(), 
		   source, 
		   new String[] {
			 "documentation", "This is whether or not the robotic arm is currently\nmoving; initially false\n@see #moveTo(double, double, double, double)\n@see #stow()",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (getRoboticArm_Speed(), 
		   source, 
		   new String[] {
			 "documentation", "This indicates the level of speed that the robotic arm\nis going to move at.\n@see #cmdMoveSpeedLevel(MoveSpeedLevel)",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly",
			 "propertyCategory", "Status"
		   });	
		addAnnotation
		  (roboticArmStubEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a specific implementation of the robotic arm, in which\nall operations are stubs and hence, non-functional; the operations\nshould simply log a message, indicating that they were performed."
		   });	
		addAnnotation
		  (roboticArmSimulatedEClass, 
		   source, 
		   new String[] {
			 "documentation", "This is a simulated implementation of the robotic arm, where all\noperations are executed upon a simulated (i.e. virtual) arm. While there\nare no physical components interacted with, it attempts to emulate,\nwherever possible, the actions and results of its real world counterpart(s)."
		   });
	}

} //EMFEcoreExampleRoboticArmPackageImpl
