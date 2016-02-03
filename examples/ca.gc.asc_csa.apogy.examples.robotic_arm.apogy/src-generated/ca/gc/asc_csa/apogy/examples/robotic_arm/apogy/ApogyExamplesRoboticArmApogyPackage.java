package ca.gc.asc_csa.apogy.examples.robotic_arm.apogy;
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
import org.eclipse.emf.ecore.EPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;

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
 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesRoboticArmApogy' copyrightText='Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015' modelName='ApogyExamplesRoboticArmApogy' modelDirectory='/ca.gc.asc_csa.apogy.examples.robotic_arm.apogy/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples.robotic_arm'"
 * @generated
 */
public interface ApogyExamplesRoboticArmApogyPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "apogy";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.examples.robotic_arm.apogy";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "apogy";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyExamplesRoboticArmApogyPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.ApogyExamplesRoboticArmApogyPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmApogySystemApiAdapterImpl <em>Robotic Arm Apogy System Api Adapter</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmApogySystemApiAdapterImpl
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.ApogyExamplesRoboticArmApogyPackageImpl#getRoboticArmApogySystemApiAdapter()
	 * @generated
	 */
  int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER = 0;

  /**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ENVIRONMENT;

		/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER__INSTANCE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__INSTANCE;

		/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__ELEMENT_TYPE;

		/**
	 * The feature id for the '<em><b>Pose Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Pose Corrector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__POSE_CORRECTOR;

		/**
	 * The feature id for the '<em><b>Apogy System</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER__APOGY_SYSTEM;

  /**
	 * The number of structural features of the '<em>Robotic Arm Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_FEATURE_COUNT + 0;

  /**
	 * The operation id for the '<em>Init</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT;

		/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_INITIALIZATION_DATA;

		/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL;

		/**
	 * The operation id for the '<em>Create Result</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION;

		/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN;

		/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___DISPOSE = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___DISPOSE;

		/**
	 * The operation id for the '<em>Create Result Matrix</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER___CREATE_RESULT_MATRIX__OPERATIONCALL;

		/**
	 * The number of operations of the '<em>Robotic Arm Apogy System Api Adapter</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT = ApogyCorePackage.APOGY_SYSTEM_API_ADAPTER_OPERATION_COUNT + 0;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl <em>Robotic Arm Data</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.ApogyExamplesRoboticArmApogyPackageImpl#getRoboticArmData()
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
  int ROBOTIC_ARM_DATA__INITIAL_POSE_TRANSFORM = ApogyCorePackage.APOGY_INITIALIZATION_DATA__INITIAL_POSE_TRANSFORM;

  /**
	 * The feature id for the '<em><b>Initialized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_DATA__INITIALIZED = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_DATA__SPEED = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOTIC_ARM_DATA__TURRET_ANGLE = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__SHOULDER_ANGLE = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__ELBOW_ANGLE = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA__WRIST_ANGLE = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 5;

  /**
	 * The number of structural features of the '<em>Robotic Arm Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA_FEATURE_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_FEATURE_COUNT + 6;

  /**
	 * The number of operations of the '<em>Robotic Arm Data</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ROBOTIC_ARM_DATA_OPERATION_COUNT = ApogyCorePackage.APOGY_INITIALIZATION_DATA_OPERATION_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmApogySystemApiAdapter <em>Robotic Arm Apogy System Api Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Apogy System Api Adapter</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmApogySystemApiAdapter
	 * @generated
	 */
  EClass getRoboticArmApogySystemApiAdapter();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData <em>Robotic Arm Data</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Data</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData
	 * @generated
	 */
  EClass getRoboticArmData();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#isInitialized()
	 * @see #getRoboticArmData()
	 * @generated
	 */
	EAttribute getRoboticArmData_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getSpeed()
	 * @see #getRoboticArmData()
	 * @generated
	 */
	EAttribute getRoboticArmData_Speed();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getTurretAngle <em>Turret Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turret Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getTurretAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
	EAttribute getRoboticArmData_TurretAngle();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getShoulderAngle <em>Shoulder Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoulder Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getShoulderAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
  EAttribute getRoboticArmData_ShoulderAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getElbowAngle <em>Elbow Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elbow Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getElbowAngle()
	 * @see #getRoboticArmData()
	 * @generated
	 */
  EAttribute getRoboticArmData_ElbowAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getWristAngle <em>Wrist Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrist Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData#getWristAngle()
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
	ApogyExamplesRoboticArmApogyFactory getApogyExamplesRoboticArmApogyFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmApogySystemApiAdapterImpl <em>Robotic Arm Apogy System Api Adapter</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmApogySystemApiAdapterImpl
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.ApogyExamplesRoboticArmApogyPackageImpl#getRoboticArmApogySystemApiAdapter()
		 * @generated
		 */
    EClass ROBOTIC_ARM_APOGY_SYSTEM_API_ADAPTER = eINSTANCE.getRoboticArmApogySystemApiAdapter();
    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl <em>Robotic Arm Data</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.ApogyExamplesRoboticArmApogyPackageImpl#getRoboticArmData()
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

} //ApogyExamplesRoboticArmApogyPackage
