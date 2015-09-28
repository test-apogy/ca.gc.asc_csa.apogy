/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package ca.gc.space.mrt.actuators;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import ca.gc.space.topology.TopologyPackage;

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
 * @see ca.gc.space.mrt.actuators.MRTActuatorsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='MRTActuators' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)' modelName='MRTActuators' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.space.mrt.actuators/src-generated' editDirectory='/ca.gc.space.mrt.actuators.edit/src-generated' basePackage='ca.gc.space.mrt'"
 * @generated
 */
public interface MRTActuatorsPackage extends EPackage
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
  String eNS_URI = "ca.gc.space.mrt.actuators";

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
  MRTActuatorsPackage eINSTANCE = ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl.init();

  /**
	 * The meta object id for the '{@link ca.gc.space.mrt.actuators.impl.AbstractActuatorImpl <em>Abstract Actuator</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.actuators.impl.AbstractActuatorImpl
	 * @see ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl#getAbstractActuator()
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
  int ABSTRACT_ACTUATOR__PARENT = TopologyPackage.NODE__PARENT;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__DESCRIPTION = TopologyPackage.NODE__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__NODE_ID = TopologyPackage.NODE__NODE_ID;

  /**
	 * The feature id for the '<em><b>Moving</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__MOVING = TopologyPackage.NODE_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Actuator Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR__ACTUATOR_STATUS = TopologyPackage.NODE_FEATURE_COUNT + 1;

  /**
	 * The number of structural features of the '<em>Abstract Actuator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR_FEATURE_COUNT = TopologyPackage.NODE_FEATURE_COUNT + 2;

  /**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR___ACCEPT__INODEVISITOR = TopologyPackage.NODE___ACCEPT__INODEVISITOR;

  /**
	 * The number of operations of the '<em>Abstract Actuator</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int ABSTRACT_ACTUATOR_OPERATION_COUNT = TopologyPackage.NODE_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link ca.gc.space.mrt.actuators.impl.PanTiltUnitImpl <em>Pan Tilt Unit</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.actuators.impl.PanTiltUnitImpl
	 * @see ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl#getPanTiltUnit()
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
	 * The meta object id for the '{@link ca.gc.space.mrt.actuators.ActuatorStatus <em>Actuator Status</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see ca.gc.space.mrt.actuators.ActuatorStatus
	 * @see ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl#getActuatorStatus()
	 * @generated
	 */
  int ACTUATOR_STATUS = 2;


  /**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.actuators.AbstractActuator <em>Abstract Actuator</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Actuator</em>'.
	 * @see ca.gc.space.mrt.actuators.AbstractActuator
	 * @generated
	 */
  EClass getAbstractActuator();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.actuators.AbstractActuator#isMoving <em>Moving</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moving</em>'.
	 * @see ca.gc.space.mrt.actuators.AbstractActuator#isMoving()
	 * @see #getAbstractActuator()
	 * @generated
	 */
  EAttribute getAbstractActuator_Moving();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.actuators.AbstractActuator#getActuatorStatus <em>Actuator Status</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuator Status</em>'.
	 * @see ca.gc.space.mrt.actuators.AbstractActuator#getActuatorStatus()
	 * @see #getAbstractActuator()
	 * @generated
	 */
  EAttribute getAbstractActuator_ActuatorStatus();

  /**
	 * Returns the meta object for class '{@link ca.gc.space.mrt.actuators.PanTiltUnit <em>Pan Tilt Unit</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pan Tilt Unit</em>'.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit
	 * @generated
	 */
  EClass getPanTiltUnit();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getCurrentPanAngle <em>Current Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Pan Angle</em>'.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getCurrentPanAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CurrentPanAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getCurrentTiltAngle <em>Current Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Tilt Angle</em>'.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getCurrentTiltAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CurrentTiltAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getCommandedPanAngle <em>Commanded Pan Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Pan Angle</em>'.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getCommandedPanAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CommandedPanAngle();

  /**
	 * Returns the meta object for the attribute '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commanded Tilt Angle</em>'.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getCommandedTiltAngle()
	 * @see #getPanTiltUnit()
	 * @generated
	 */
  EAttribute getPanTiltUnit_CommandedTiltAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getMaximumPanAngle() <em>Get Maximum Pan Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Pan Angle</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getMaximumPanAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMaximumPanAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getMinimumPanAngle() <em>Get Minimum Pan Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Minimum Pan Angle</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getMinimumPanAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMinimumPanAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getMaximumTiltAngle() <em>Get Maximum Tilt Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Maximum Tilt Angle</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getMaximumTiltAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMaximumTiltAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#getMinimumTiltAngle() <em>Get Minimum Tilt Angle</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Minimum Tilt Angle</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#getMinimumTiltAngle()
	 * @generated
	 */
  EOperation getPanTiltUnit__GetMinimumTiltAngle();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#moveToPanTilt(double, double) <em>Move To Pan Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To Pan Tilt</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#moveToPanTilt(double, double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveToPanTilt__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#moveToPan(double) <em>Move To Pan</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To Pan</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#moveToPan(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveToPan__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#moveToTilt(double) <em>Move To Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move To Tilt</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#moveToTilt(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveToTilt__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#moveByPanTilt(double, double) <em>Move By Pan Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move By Pan Tilt</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#moveByPanTilt(double, double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveByPanTilt__double_double();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#moveByPan(double) <em>Move By Pan</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move By Pan</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#moveByPan(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveByPan__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#moveByTilt(double) <em>Move By Tilt</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move By Tilt</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#moveByTilt(double)
	 * @generated
	 */
  EOperation getPanTiltUnit__MoveByTilt__double();

  /**
	 * Returns the meta object for the '{@link ca.gc.space.mrt.actuators.PanTiltUnit#stopMotion() <em>Stop Motion</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Motion</em>' operation.
	 * @see ca.gc.space.mrt.actuators.PanTiltUnit#stopMotion()
	 * @generated
	 */
  EOperation getPanTiltUnit__StopMotion();

  /**
	 * Returns the meta object for enum '{@link ca.gc.space.mrt.actuators.ActuatorStatus <em>Actuator Status</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Status</em>'.
	 * @see ca.gc.space.mrt.actuators.ActuatorStatus
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
  MRTActuatorsFactory getMRTActuatorsFactory();

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
		 * The meta object literal for the '{@link ca.gc.space.mrt.actuators.impl.AbstractActuatorImpl <em>Abstract Actuator</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.actuators.impl.AbstractActuatorImpl
		 * @see ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl#getAbstractActuator()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.actuators.impl.PanTiltUnitImpl <em>Pan Tilt Unit</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.actuators.impl.PanTiltUnitImpl
		 * @see ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl#getPanTiltUnit()
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
		 * The meta object literal for the '{@link ca.gc.space.mrt.actuators.ActuatorStatus <em>Actuator Status</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see ca.gc.space.mrt.actuators.ActuatorStatus
		 * @see ca.gc.space.mrt.actuators.impl.MRTActuatorsPackageImpl#getActuatorStatus()
		 * @generated
		 */
    EEnum ACTUATOR_STATUS = eINSTANCE.getActuatorStatus();

  }

} //MRTActuatorsPackage
