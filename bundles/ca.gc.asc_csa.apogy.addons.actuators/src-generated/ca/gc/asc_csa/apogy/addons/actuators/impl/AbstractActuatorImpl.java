package ca.gc.asc_csa.apogy.addons.actuators.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator;
import ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus;
import ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.actuators.impl.AbstractActuatorImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.actuators.impl.AbstractActuatorImpl#getActuatorStatus <em>Actuator Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractActuatorImpl extends NodeImpl implements AbstractActuator
{
  /**
	 * The default value of the '{@link #isMoving() <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMoving()
	 * @generated
	 * @ordered
	 */
  protected static final boolean MOVING_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMoving() <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMoving()
	 * @generated
	 * @ordered
	 */
  protected boolean moving = MOVING_EDEFAULT;

  /**
	 * The default value of the '{@link #getActuatorStatus() <em>Actuator Status</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActuatorStatus()
	 * @generated
	 * @ordered
	 */
  protected static final ActuatorStatus ACTUATOR_STATUS_EDEFAULT = ActuatorStatus.OFF;

  /**
	 * The cached value of the '{@link #getActuatorStatus() <em>Actuator Status</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActuatorStatus()
	 * @generated
	 * @ordered
	 */
  protected ActuatorStatus actuatorStatus = ACTUATOR_STATUS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractActuatorImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyAddonsActuatorsPackage.Literals.ABSTRACT_ACTUATOR;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMoving()
  {
		return moving;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMoving(boolean newMoving)
  {
		boolean oldMoving = moving;
		moving = newMoving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING, oldMoving, moving));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActuatorStatus getActuatorStatus()
  {
		return actuatorStatus;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActuatorStatus(ActuatorStatus newActuatorStatus)
  {
		ActuatorStatus oldActuatorStatus = actuatorStatus;
		actuatorStatus = newActuatorStatus == null ? ACTUATOR_STATUS_EDEFAULT : newActuatorStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS, oldActuatorStatus, actuatorStatus));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING:
				return isMoving();
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS:
				return getActuatorStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING:
				setMoving((Boolean)newValue);
				return;
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS:
				setActuatorStatus((ActuatorStatus)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS:
				setActuatorStatus(ACTUATOR_STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING:
				return moving != MOVING_EDEFAULT;
			case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS:
				return actuatorStatus != ACTUATOR_STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (moving: ");
		result.append(moving);
		result.append(", actuatorStatus: ");
		result.append(actuatorStatus);
		result.append(')');
		return result.toString();
	}

} //AbstractActuatorImpl
