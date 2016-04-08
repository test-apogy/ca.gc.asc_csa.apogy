package ca.gc.asc_csa.apogy.addons.actuators;
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
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

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
 * @see ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyAddonsActuators' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' modelName='ApogyAddonsActuators' suppressGenModelAnnotations='false' dynamicTemplates='true' templateDirectory='platform:/plugin/ca.gc.asc_csa.apogy.common.emf/templates' modelDirectory='/ca.gc.asc_csa.apogy.addons.actuators/src-generated' editDirectory='/ca.gc.asc_csa.apogy.addons.actuators.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.addons'"
 * @generated
 */
public interface ApogyAddonsActuatorsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "actuators";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "ca.gc.asc_csa.apogy.addons.actuators";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "actuators";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyAddonsActuatorsPackage eINSTANCE = ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.actuators.impl.AbstractActuatorImpl <em>Abstract Actuator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.AbstractActuatorImpl
	 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl#getAbstractActuator()
	 * @generated
	 */
  int ABSTRACT_ACTUATOR = 0;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__PARENT = ApogyCommonTopologyPackage.NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__DESCRIPTION = ApogyCommonTopologyPackage.NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__NODE_ID = ApogyCommonTopologyPackage.NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__MOVING = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Actuator Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__ACTUATOR_STATUS = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Actuator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR_FEATURE_COUNT = ApogyCommonTopologyPackage.NODE_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTUATOR___ACCEPT__INODEVISITOR = ApogyCommonTopologyPackage.NODE___ACCEPT__INODEVISITOR;

		/**
	 * The number of operations of the '<em>Abstract Actuator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR_OPERATION_COUNT = ApogyCommonTopologyPackage.NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.actuators.impl.PanTiltUnitImpl <em>Pan Tilt Unit</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.PanTiltUnitImpl
	 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl#getPanTiltUnit()
	 * @generated
	 */
  int PAN_TILT_UNIT = 1;

  /**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__PARENT = ABSTRACT_ACTUATOR__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__DESCRIPTION = ABSTRACT_ACTUATOR__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__NODE_ID = ABSTRACT_ACTUATOR__NODE_ID;

  /**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__MOVING = ABSTRACT_ACTUATOR__MOVING;

  /**
	 * The feature id for the '<em><b>Actuator Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__ACTUATOR_STATUS = ABSTRACT_ACTUATOR__ACTUATOR_STATUS;

  /**
	 * The feature id for the '<em><b>Current Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__CURRENT_PAN_ANGLE = ABSTRACT_ACTUATOR_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Current Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__CURRENT_TILT_ANGLE = ABSTRACT_ACTUATOR_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Commanded Pan Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__COMMANDED_PAN_ANGLE = ABSTRACT_ACTUATOR_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Commanded Tilt Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT__COMMANDED_TILT_ANGLE = ABSTRACT_ACTUATOR_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Pan Tilt Unit</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT_FEATURE_COUNT = ABSTRACT_ACTUATOR_FEATURE_COUNT + 4;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAN_TILT_UNIT___ACCEPT__INODEVISITOR = ABSTRACT_ACTUATOR___ACCEPT__INODEVISITOR;

		/**
	 * The operation id for the '<em>Get Maximum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Get Minimum Pan Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Get Maximum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 2;

  /**
	 * The operation id for the '<em>Get Minimum Tilt Angle</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 3;

  /**
	 * The operation id for the '<em>Move To Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 4;

  /**
	 * The operation id for the '<em>Move To Pan</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 5;

  /**
	 * The operation id for the '<em>Move To Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 6;

  /**
	 * The operation id for the '<em>Move By Pan Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 7;

  /**
	 * The operation id for the '<em>Move By Pan</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 8;

  /**
	 * The operation id for the '<em>Move By Tilt</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE = ABSTRACT_ACTUATOR_OPERATION_COUNT + 9;

  /**
	 * The operation id for the '<em>Stop Motion</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT___STOP_MOTION = ABSTRACT_ACTUATOR_OPERATION_COUNT + 10;

  /**
	 * The number of operations of the '<em>Pan Tilt Unit</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PAN_TILT_UNIT_OPERATION_COUNT = ABSTRACT_ACTUATOR_OPERATION_COUNT + 11;


  /**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus <em>Actuator Status</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus
	 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl#getActuatorStatus()
	 * @generated
	 */
  int ACTUATOR_STATUS = 2;


  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator <em>Abstract Actuator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Actuator</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator
	 * @generated
	 */
  EClass getAbstractActuator();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#isMoving <em>Moving</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moving</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#isMoving()
	 * @see #getAbstractActuator()
	 * @generated
	 */
  EAttribute getAbstractActuator_Moving();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#getActuatorStatus <em>Actuator Status</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Status</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#getActuatorStatus()
	 * @see #getAbstractActuator()
	 * @generated
	 */
  EAttribute getAbstractActuator_ActuatorStatus();

  /**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit <em>Pan Tilt Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pan Tilt Unit</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit
	 * @generated
	 */
  EClass getPanTiltUnit();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCurrentPanAngle <em>Current Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Pan Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCurrentPanAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CurrentPanAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCurrentTiltAngle <em>Current Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Tilt Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCurrentTiltAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CurrentTiltAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCommandedPanAngle <em>Commanded Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Pan Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCommandedPanAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CommandedPanAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Tilt Angle</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getCommandedTiltAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CommandedTiltAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMaximumPanAngle() <em>Get Maximum Pan Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Pan Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMaximumPanAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMaximumPanAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMinimumPanAngle() <em>Get Minimum Pan Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Minimum Pan Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMinimumPanAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMinimumPanAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMaximumTiltAngle() <em>Get Maximum Tilt Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Tilt Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMaximumTiltAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMaximumTiltAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMinimumTiltAngle() <em>Get Minimum Tilt Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Minimum Tilt Angle</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#getMinimumTiltAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMinimumTiltAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveToPanTilt(double, double) <em>Move To Pan Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To Pan Tilt</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveToPanTilt(double, double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveToPanTilt__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveToPan(double) <em>Move To Pan</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To Pan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveToPan(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveToPan__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveToTilt(double) <em>Move To Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To Tilt</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveToTilt(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveToTilt__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveByPanTilt(double, double) <em>Move By Pan Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move By Pan Tilt</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveByPanTilt(double, double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveByPanTilt__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveByPan(double) <em>Move By Pan</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move By Pan</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveByPan(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveByPan__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveByTilt(double) <em>Move By Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move By Tilt</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#moveByTilt(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveByTilt__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#stopMotion() <em>Stop Motion</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Motion</em>' operation.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit#stopMotion()
	 * @generated
	 */
  EOperation getPanTiltUnit__StopMotion();

  /**
	 * Returns the meta object for enum '{@link ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus <em>Actuator Status</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Status</em>'.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus
	 * @generated
	 */
  EEnum getActuatorStatus();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyAddonsActuatorsFactory getApogyAddonsActuatorsFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.actuators.impl.AbstractActuatorImpl <em>Abstract Actuator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.AbstractActuatorImpl
		 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl#getAbstractActuator()
		 * @generated
		 */
    EClass ABSTRACT_ACTUATOR = eINSTANCE.getAbstractActuator();

    /**
		 * The meta object literal for the '<em><b>Moving</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_ACTUATOR__MOVING = eINSTANCE.getAbstractActuator_Moving();

    /**
		 * The meta object literal for the '<em><b>Actuator Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute ABSTRACT_ACTUATOR__ACTUATOR_STATUS = eINSTANCE.getAbstractActuator_ActuatorStatus();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.actuators.impl.PanTiltUnitImpl <em>Pan Tilt Unit</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.PanTiltUnitImpl
		 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl#getPanTiltUnit()
		 * @generated
		 */
    EClass PAN_TILT_UNIT = eINSTANCE.getPanTiltUnit();

    /**
		 * The meta object literal for the '<em><b>Current Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PAN_TILT_UNIT__CURRENT_PAN_ANGLE = eINSTANCE.getPanTiltUnit_CurrentPanAngle();

    /**
		 * The meta object literal for the '<em><b>Current Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PAN_TILT_UNIT__CURRENT_TILT_ANGLE = eINSTANCE.getPanTiltUnit_CurrentTiltAngle();

    /**
		 * The meta object literal for the '<em><b>Commanded Pan Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PAN_TILT_UNIT__COMMANDED_PAN_ANGLE = eINSTANCE.getPanTiltUnit_CommandedPanAngle();

    /**
		 * The meta object literal for the '<em><b>Commanded Tilt Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PAN_TILT_UNIT__COMMANDED_TILT_ANGLE = eINSTANCE.getPanTiltUnit_CommandedTiltAngle();

    /**
		 * The meta object literal for the '<em><b>Get Maximum Pan Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE = eINSTANCE.getPanTiltUnit__GetMaximumPanAngle();

    /**
		 * The meta object literal for the '<em><b>Get Minimum Pan Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE = eINSTANCE.getPanTiltUnit__GetMinimumPanAngle();

    /**
		 * The meta object literal for the '<em><b>Get Maximum Tilt Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE = eINSTANCE.getPanTiltUnit__GetMaximumTiltAngle();

    /**
		 * The meta object literal for the '<em><b>Get Minimum Tilt Angle</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE = eINSTANCE.getPanTiltUnit__GetMinimumTiltAngle();

    /**
		 * The meta object literal for the '<em><b>Move To Pan Tilt</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE = eINSTANCE.getPanTiltUnit__MoveToPanTilt__double_double();

    /**
		 * The meta object literal for the '<em><b>Move To Pan</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE = eINSTANCE.getPanTiltUnit__MoveToPan__double();

    /**
		 * The meta object literal for the '<em><b>Move To Tilt</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE = eINSTANCE.getPanTiltUnit__MoveToTilt__double();

    /**
		 * The meta object literal for the '<em><b>Move By Pan Tilt</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE = eINSTANCE.getPanTiltUnit__MoveByPanTilt__double_double();

    /**
		 * The meta object literal for the '<em><b>Move By Pan</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE = eINSTANCE.getPanTiltUnit__MoveByPan__double();

    /**
		 * The meta object literal for the '<em><b>Move By Tilt</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE = eINSTANCE.getPanTiltUnit__MoveByTilt__double();

    /**
		 * The meta object literal for the '<em><b>Stop Motion</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PAN_TILT_UNIT___STOP_MOTION = eINSTANCE.getPanTiltUnit__StopMotion();

    /**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus <em>Actuator Status</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus
		 * @see ca.gc.asc_csa.apogy.addons.actuators.impl.ApogyAddonsActuatorsPackageImpl#getActuatorStatus()
		 * @generated
		 */
    EEnum ACTUATOR_STATUS = eINSTANCE.getActuatorStatus();

  }

} //ApogyAddonsActuatorsPackage
