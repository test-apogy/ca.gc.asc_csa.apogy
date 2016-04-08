package ca.gc.asc_csa.apogy.examples.robotic_arm;
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
 * <!-- begin-model-doc -->
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
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.ApogyExamplesRoboticArmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesRoboticArm' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyExamplesRoboticArm' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.examples.robotic_arm/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.robotic_arm.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples'"
 * @generated
 */
public interface ApogyExamplesRoboticArmPackage extends EPackage
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
  String eNS_URI = "ca.gc.asc_csa.apogy.examples.robotic_arm";

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
  ApogyExamplesRoboticArmPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmImpl <em>Robotic Arm</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmImpl
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getRoboticArm()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmStubImpl <em>Robotic Arm Stub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmStubImpl
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getRoboticArmStub()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmSimulatedImpl <em>Robotic Arm Simulated</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmSimulatedImpl
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getRoboticArmSimulated()
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
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel <em>Move Speed Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getMoveSpeedLevel()
	 * @generated
	 */
	int MOVE_SPEED_LEVEL = 3;

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm <em>Robotic Arm</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm
	 * @generated
	 */
  EClass getRoboticArm();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getSpeed()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_Speed();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#init() <em>Init</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#init()
	 * @generated
	 */
	EOperation getRoboticArm__Init();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getTurretAngle <em>Turret Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Turret Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getTurretAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_TurretAngle();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getShoulderAngle <em>Shoulder Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoulder Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getShoulderAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
  EAttribute getRoboticArm_ShoulderAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getElbowAngle <em>Elbow Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elbow Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getElbowAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
  EAttribute getRoboticArm_ElbowAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getWristAngle <em>Wrist Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrist Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#getWristAngle()
	 * @see #getRoboticArm()
	 * @generated
	 */
  EAttribute getRoboticArm_WristAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#isInitialized <em>Initialized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialized</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#isInitialized()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_Initialized();

		/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#isArmMoving <em>Arm Moving</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arm Moving</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#isArmMoving()
	 * @see #getRoboticArm()
	 * @generated
	 */
	EAttribute getRoboticArm_ArmMoving();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#moveTo(double, double, double, double) <em>Move To</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#moveTo(double, double, double, double)
	 * @generated
	 */
  EOperation getRoboticArm__MoveTo__double_double_double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#stow() <em>Stow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stow</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#stow()
	 * @generated
	 */
	EOperation getRoboticArm__Stow();

		/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#cmdMoveSpeedLevel(ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel) <em>Cmd Move Speed Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cmd Move Speed Level</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm#cmdMoveSpeedLevel(ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel)
	 * @generated
	 */
	EOperation getRoboticArm__CmdMoveSpeedLevel__MoveSpeedLevel();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArmStub <em>Robotic Arm Stub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Stub</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArmStub
	 * @generated
	 */
	EClass getRoboticArmStub();

		/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArmSimulated <em>Robotic Arm Simulated</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robotic Arm Simulated</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArmSimulated
	 * @generated
	 */
  EClass getRoboticArmSimulated();

  /**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel <em>Move Speed Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Move Speed Level</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel
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
	ApogyExamplesRoboticArmFactory getApogyExamplesRoboticArmFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmImpl <em>Robotic Arm</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmImpl
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getRoboticArm()
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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmStubImpl <em>Robotic Arm Stub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmStubImpl
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getRoboticArmStub()
		 * @generated
		 */
		EClass ROBOTIC_ARM_STUB = eINSTANCE.getRoboticArmStub();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmSimulatedImpl <em>Robotic Arm Simulated</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmSimulatedImpl
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getRoboticArmSimulated()
		 * @generated
		 */
    EClass ROBOTIC_ARM_SIMULATED = eINSTANCE.getRoboticArmSimulated();

				/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel <em>Move Speed Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel
		 * @see ca.gc.asc_csa.apogy.examples.robotic_arm.impl.ApogyExamplesRoboticArmPackageImpl#getMoveSpeedLevel()
		 * @generated
		 */
		EEnum MOVE_SPEED_LEVEL = eINSTANCE.getMoveSpeedLevel();

  }

} //ApogyExamplesRoboticArmPackage
