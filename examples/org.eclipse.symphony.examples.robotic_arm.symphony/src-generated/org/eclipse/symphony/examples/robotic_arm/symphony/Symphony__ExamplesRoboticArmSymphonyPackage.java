/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.symphony;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;

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
 * @see org.eclipse.symphony.examples.robotic_arm.symphony.Symphony__ExamplesRoboticArmSymphonyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__ExamplesRoboticArmSymphony' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='Symphony__ExamplesRoboticArmSymphony' modelDirectory='/org.eclipse.symphony.examples.robotic_arm.symphony/src-generated' editDirectory='/org.eclipse.symphony.examples.robotic_arm.symphony.edit/src-generated' basePackage='org.eclipse.symphony.examples.robotic_arm'"
 * @generated
 */
public interface Symphony__ExamplesRoboticArmSymphonyPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "symphony";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.examples.robotic_arm.symphony";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "symphony";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__ExamplesRoboticArmSymphonyPackage eINSTANCE = org.eclipse.symphony.examples.robotic_arm.symphony.impl.Symphony__ExamplesRoboticArmSymphonyPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmSymphonySystemApiAdapterImpl <em>Robotic Arm Symphony System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmSymphonySystemApiAdapterImpl
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.Symphony__ExamplesRoboticArmSymphonyPackageImpl#getRoboticArmSymphonySystemApiAdapter()
	 * @generated
	 */
  int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER = 0;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ENVIRONMENT;

		/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__INSTANCE;

		/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

		/**
	 * The feature id for the '<em><b>Symphony System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER__SYMPHONY_SYSTEM;

  /**
	 * The number of structural features of the '<em>Robotic Arm Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

		/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

		/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

		/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___DISPOSE;

		/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

		/**
	 * The number of operations of the '<em>Robotic Arm Symphony System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT = Symphony__CorePackage.SYMPHONY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmDataImpl <em>Robotic Arm Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmDataImpl
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.Symphony__ExamplesRoboticArmSymphonyPackageImpl#getRoboticArmData()
	 * @generated
	 */
  int ROBOTIC_ARM_DATA = 1;

  /**
	 * The feature id for the '<em><b>Initial Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__INITIAL_POSE_TRANSFORM = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_DATA__INITIALIZED = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_DATA__SPEED = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_DATA__TURRET_ANGLE = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__SHOULDER_ANGLE = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__ELBOW_ANGLE = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__WRIST_ANGLE = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Robotic Arm Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA_FEATURE_COUNT = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Robotic Arm Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA_OPERATION_COUNT = Symphony__CorePackage.SYMPHONY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmSymphonySystemApiAdapter <em>Robotic Arm Symphony System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Symphony System Api Adapter</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmSymphonySystemApiAdapter
	 * @generated
	 */
  EClass getRoboticArmSymphonySystemApiAdapter();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData <em>Robotic Arm Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Data</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData
	 * @generated
	 */
  EClass getRoboticArmData();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#isInitialized()
	 * @see #getRoboticArmData()
	 * @generated
	 */
	EAttribute getRoboticArmData_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getSpeed()
	 * @see #getRoboticArmData()
	 * @generated
	 */
	EAttribute getRoboticArmData_Speed();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getTurretAngle <em>Turret Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turret Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getTurretAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
	EAttribute getRoboticArmData_TurretAngle();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getShoulderAngle <em>Shoulder Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoulder Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getShoulderAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
  EAttribute getRoboticArmData_ShoulderAngle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getElbowAngle <em>Elbow Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elbow Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getElbowAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
  EAttribute getRoboticArmData_ElbowAngle();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getWristAngle <em>Wrist Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrist Angle</em>'.
	 * @see org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData#getWristAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
  EAttribute getRoboticArmData_WristAngle();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__ExamplesRoboticArmSymphonyFactory getSymphony__ExamplesRoboticArmSymphonyFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmSymphonySystemApiAdapterImpl <em>Robotic Arm Symphony System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmSymphonySystemApiAdapterImpl
		 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.Symphony__ExamplesRoboticArmSymphonyPackageImpl#getRoboticArmSymphonySystemApiAdapter()
		 * @generated
		 */
    EClass ROBOTIC_ARM_SYMPHONY_SYSTEM_API_ADAPTER = eINSTANCE.getRoboticArmSymphonySystemApiAdapter();
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmDataImpl <em>Robotic Arm Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.RoboticArmDataImpl
		 * @see org.eclipse.symphony.examples.robotic_arm.symphony.impl.Symphony__ExamplesRoboticArmSymphonyPackageImpl#getRoboticArmData()
		 * @generated
		 */
    EClass ROBOTIC_ARM_DATA = eINSTANCE.getRoboticArmData();
    /**
		 * The meta object literal for the '<em><b>Initialized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM_DATA__INITIALIZED = eINSTANCE.getRoboticArmData_Initialized();
				/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM_DATA__SPEED = eINSTANCE.getRoboticArmData_Speed();
				/**
		 * The meta object literal for the '<em><b>Turret Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROBOTIC_ARM_DATA__TURRET_ANGLE = eINSTANCE.getRoboticArmData_TurretAngle();
				/**
		 * The meta object literal for the '<em><b>Shoulder Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROBOTIC_ARM_DATA__SHOULDER_ANGLE = eINSTANCE.getRoboticArmData_ShoulderAngle();
    /**
		 * The meta object literal for the '<em><b>Elbow Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROBOTIC_ARM_DATA__ELBOW_ANGLE = eINSTANCE.getRoboticArmData_ElbowAngle();
    /**
		 * The meta object literal for the '<em><b>Wrist Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ROBOTIC_ARM_DATA__WRIST_ANGLE = eINSTANCE.getRoboticArmData_WristAngle();

  }

} //Symphony__ExamplesRoboticArmSymphonyPackage
