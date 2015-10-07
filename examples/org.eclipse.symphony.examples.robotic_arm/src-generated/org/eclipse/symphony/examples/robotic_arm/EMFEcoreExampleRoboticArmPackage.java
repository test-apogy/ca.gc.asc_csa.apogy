/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreExampleRoboticArm' copyrightText='Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015' modelName='EMFEcoreExampleRoboticArm' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.robotic_arm/src-generated' editDirectory='/org.eclipse.symphony.examples.robotic_arm.edit/src-generated' basePackage='org.eclipse.symphony.examples'"
 * @generated
 */
public interface EMFEcoreExampleRoboticArmPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "robotic_arm";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.examples.robotic_arm";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "robotic_arm";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreExampleRoboticArmPackage eINSTANCE = org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl <em>Robotic Arm</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getRoboticArm()
	 * @generated
	 */
  int ROBOTIC_ARM = 0;

  /**
	 * The feature id for the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM__TURRET_ANGLE = 0;

		/**
	 * The feature id for the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM__SHOULDER_ANGLE = 1;

  /**
	 * The feature id for the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM__ELBOW_ANGLE = 2;

  /**
	 * The feature id for the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM__WRIST_ANGLE = 3;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM__INITIALIZED = 4;

		/**
	 * The feature id for the '<em><b>Arm Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM__ARM_MOVING = 5;

		/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM__SPEED = 6;

		/**
	 * The number of structural features of the '<em>Robotic Arm</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_FEATURE_COUNT = 7;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM___INIT = 0;

		/**
	 * The operation id for the '<em>Cmd Move Speed Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL = 1;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE = 2;

		/**
	 * The operation id for the '<em>Stow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM___STOW = 3;

		/**
	 * The number of operations of the '<em>Robotic Arm</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_OPERATION_COUNT = 4;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmStubImpl <em>Robotic Arm Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmStubImpl
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getRoboticArmStub()
	 * @generated
	 */
	int ROBOTIC_ARM_STUB = 1;

		/**
	 * The feature id for the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__TURRET_ANGLE = ROBOTIC_ARM__TURRET_ANGLE;

		/**
	 * The feature id for the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__SHOULDER_ANGLE = ROBOTIC_ARM__SHOULDER_ANGLE;

		/**
	 * The feature id for the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__ELBOW_ANGLE = ROBOTIC_ARM__ELBOW_ANGLE;

		/**
	 * The feature id for the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__WRIST_ANGLE = ROBOTIC_ARM__WRIST_ANGLE;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__INITIALIZED = ROBOTIC_ARM__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Arm Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__ARM_MOVING = ROBOTIC_ARM__ARM_MOVING;

		/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB__SPEED = ROBOTIC_ARM__SPEED;

		/**
	 * The number of structural features of the '<em>Robotic Arm Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB_FEATURE_COUNT = ROBOTIC_ARM_FEATURE_COUNT + 0;

		/**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB___INIT = ROBOTIC_ARM___INIT;

		/**
	 * The operation id for the '<em>Cmd Move Speed Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL = ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE = ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Stow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB___STOW = ROBOTIC_ARM___STOW;

		/**
	 * The number of operations of the '<em>Robotic Arm Stub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_STUB_OPERATION_COUNT = ROBOTIC_ARM_OPERATION_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmSimulatedImpl <em>Robotic Arm Simulated</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmSimulatedImpl
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getRoboticArmSimulated()
	 * @generated
	 */
  int ROBOTIC_ARM_SIMULATED = 2;

  /**
	 * The feature id for the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED__TURRET_ANGLE = ROBOTIC_ARM__TURRET_ANGLE;

		/**
	 * The feature id for the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SIMULATED__SHOULDER_ANGLE = ROBOTIC_ARM__SHOULDER_ANGLE;

  /**
	 * The feature id for the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SIMULATED__ELBOW_ANGLE = ROBOTIC_ARM__ELBOW_ANGLE;

  /**
	 * The feature id for the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SIMULATED__WRIST_ANGLE = ROBOTIC_ARM__WRIST_ANGLE;

		/**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED__INITIALIZED = ROBOTIC_ARM__INITIALIZED;

		/**
	 * The feature id for the '<em><b>Arm Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED__ARM_MOVING = ROBOTIC_ARM__ARM_MOVING;

		/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED__SPEED = ROBOTIC_ARM__SPEED;

		/**
	 * The number of structural features of the '<em>Robotic Arm Simulated</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SIMULATED_FEATURE_COUNT = ROBOTIC_ARM_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED___INIT = ROBOTIC_ARM___INIT;

		/**
	 * The operation id for the '<em>Cmd Move Speed Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL = ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL;

		/**
	 * The operation id for the '<em>Move To</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SIMULATED___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE = ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE;

		/**
	 * The operation id for the '<em>Stow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SIMULATED___STOW = ROBOTIC_ARM___STOW;

		/**
	 * The number of operations of the '<em>Robotic Arm Simulated</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SIMULATED_OPERATION_COUNT = ROBOTIC_ARM_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel <em>Move Speed Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel
	 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getMoveSpeedLevel()
	 * @generated
	 */
	int MOVE_SPEED_LEVEL = 3;

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm <em>Robotic Arm</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm
	 * @generated
	 */
  EClass getRoboticArm();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#getSpeed()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_Speed();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#init()
	 * @generated
	 */
	EOperation getRoboticArm__Init();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getTurretAngle <em>Turret Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turret Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#getTurretAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_TurretAngle();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getShoulderAngle <em>Shoulder Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoulder Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#getShoulderAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
  EAttribute getRoboticArm_ShoulderAngle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getElbowAngle <em>Elbow Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elbow Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#getElbowAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
  EAttribute getRoboticArm_ElbowAngle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getWristAngle <em>Wrist Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrist Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#getWristAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
  EAttribute getRoboticArm_WristAngle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#isInitialized()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#isArmMoving <em>Arm Moving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arm Moving</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#isArmMoving()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_ArmMoving();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#moveTo(double, double, double, double) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#moveTo(double, double, double, double)
	 * @generated
	 */
  EOperation getRoboticArm__MoveTo__double_double_double_double();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#stow() <em>Stow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stow</em>' operation.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#stow()
	 * @generated
	 */
	EOperation getRoboticArm__Stow();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#cmdMoveSpeedLevel(org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel) <em>Cmd Move Speed Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Move Speed Level</em>' operation.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArm#cmdMoveSpeedLevel(org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel)
	 * @generated
	 */
	EOperation getRoboticArm__CmdMoveSpeedLevel__MoveSpeedLevel();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArmStub <em>Robotic Arm Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Stub</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArmStub
	 * @generated
	 */
	EClass getRoboticArmStub();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArmSimulated <em>Robotic Arm Simulated</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Simulated</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.RoboticArmSimulated
	 * @generated
	 */
  EClass getRoboticArmSimulated();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel <em>Move Speed Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Move Speed Level</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel
	 * @generated
	 */
	EEnum getMoveSpeedLevel();

		/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EMFEcoreExampleRoboticArmFactory getEMFEcoreExampleRoboticArmFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl <em>Robotic Arm</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getRoboticArm()
		 * @generated
		 */
    EClass ROBOTIC_ARM = eINSTANCE.getRoboticArm();

    /**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM__SPEED = eINSTANCE.getRoboticArm_Speed();

				/**
		 * The meta object literal for the '<em><b>Init</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOTIC_ARM___INIT = eINSTANCE.getRoboticArm__Init();

				/**
		 * The meta object literal for the '<em><b>Turret Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM__TURRET_ANGLE = eINSTANCE.getRoboticArm_TurretAngle();

				/**
		 * The meta object literal for the '<em><b>Shoulder Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROBOTIC_ARM__SHOULDER_ANGLE = eINSTANCE.getRoboticArm_ShoulderAngle();

    /**
		 * The meta object literal for the '<em><b>Elbow Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROBOTIC_ARM__ELBOW_ANGLE = eINSTANCE.getRoboticArm_ElbowAngle();

    /**
		 * The meta object literal for the '<em><b>Wrist Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROBOTIC_ARM__WRIST_ANGLE = eINSTANCE.getRoboticArm_WristAngle();

    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM__INITIALIZED = eINSTANCE.getRoboticArm_Initialized();

				/**
		 * The meta object literal for the '<em><b>Arm Moving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM__ARM_MOVING = eINSTANCE.getRoboticArm_ArmMoving();

				/**
		 * The meta object literal for the '<em><b>Move To</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getRoboticArm__MoveTo__double_double_double_double();

    /**
		 * The meta object literal for the '<em><b>Stow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOTIC_ARM___STOW = eINSTANCE.getRoboticArm__Stow();

				/**
		 * The meta object literal for the '<em><b>Cmd Move Speed Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL = eINSTANCE.getRoboticArm__CmdMoveSpeedLevel__MoveSpeedLevel();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmStubImpl <em>Robotic Arm Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmStubImpl
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getRoboticArmStub()
		 * @generated
		 */
		EClass ROBOTIC_ARM_STUB = eINSTANCE.getRoboticArmStub();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmSimulatedImpl <em>Robotic Arm Simulated</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmSimulatedImpl
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getRoboticArmSimulated()
		 * @generated
		 */
    EClass ROBOTIC_ARM_SIMULATED = eINSTANCE.getRoboticArmSimulated();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel <em>Move Speed Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel
		 * @see org.eclipse.symphony.examples.robotic_arm.impl.EMFEcoreExampleRoboticArmPackageImpl#getMoveSpeedLevel()
		 * @generated
		 */
		EEnum MOVE_SPEED_LEVEL = eINSTANCE.getMoveSpeedLevel();

  }

} //EMFEcoreExampleRoboticArmPackage