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

import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#isMoving <em>Moving</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#getActuatorStatus <em>Actuator Status</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage#getAbstractActuator()
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
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage#getAbstractActuator_Moving()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION'"
	 * @generated
	 */
  boolean isMoving();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#isMoving <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moving</em>' attribute.
	 * @see #isMoving()
	 * @generated
	 */
  void setMoving(boolean value);

  /**
	 * Returns the value of the '<em><b>Actuator Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Current state of the actuator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuator Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus
	 * @see #setActuatorStatus(ActuatorStatus)
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage#getAbstractActuator_ActuatorStatus()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION'"
	 * @generated
	 */
  ActuatorStatus getActuatorStatus();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator#getActuatorStatus <em>Actuator Status</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator Status</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus
	 * @see #getActuatorStatus()
	 * @generated
	 */
  void setActuatorStatus(ActuatorStatus value);

} // AbstractActuator
