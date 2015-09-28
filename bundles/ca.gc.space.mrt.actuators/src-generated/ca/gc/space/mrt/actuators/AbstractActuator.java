/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package ca.gc.space.mrt.actuators;

import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.actuators.AbstractActuator#isMoving <em>Moving</em>}</li>
 *   <li>{@link ca.gc.space.mrt.actuators.AbstractActuator#getActuatorStatus <em>Actuator Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.actuators.MRTActuatorsPackage#getAbstractActuator()
 * @model abstract="true"
 * @generated
 */
public interface AbstractActuator extends Node
{
  /**
	 * Returns the value of the '<em><b>Moving</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether or not the actuator is moving.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moving</em>' attribute.
	 * @see #setMoving(boolean)
	 * @see ca.gc.space.mrt.actuators.MRTActuatorsPackage#getAbstractActuator_Moving()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION'"
	 * @generated
	 */
  boolean isMoving();

  /**
	 * Sets the value of the '{@link ca.gc.space.mrt.actuators.AbstractActuator#isMoving <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving</em>' attribute.
	 * @see #isMoving()
	 * @generated
	 */
  void setMoving(boolean value);

  /**
	 * Returns the value of the '<em><b>Actuator Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.actuators.ActuatorStatus}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Current state of the actuator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator Status</em>' attribute.
	 * @see ca.gc.space.mrt.actuators.ActuatorStatus
	 * @see #setActuatorStatus(ActuatorStatus)
	 * @see ca.gc.space.mrt.actuators.MRTActuatorsPackage#getAbstractActuator_ActuatorStatus()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION'"
	 * @generated
	 */
  ActuatorStatus getActuatorStatus();

  /**
	 * Sets the value of the '{@link ca.gc.space.mrt.actuators.AbstractActuator#getActuatorStatus <em>Actuator Status</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Status</em>' attribute.
	 * @see ca.gc.space.mrt.actuators.ActuatorStatus
	 * @see #getActuatorStatus()
	 * @generated
	 */
  void setActuatorStatus(ActuatorStatus value);

} // AbstractActuator
