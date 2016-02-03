package ca.gc.asc_csa.apogy.addons.sensors.motion.impl;
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
import ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor;
import ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Acceleration Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.impl.LinearAccelerationSensorImpl#getXAcceleration <em>XAcceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.impl.LinearAccelerationSensorImpl#getYAcceleration <em>YAcceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.impl.LinearAccelerationSensorImpl#getZAcceleration <em>ZAcceleration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearAccelerationSensorImpl extends SelfMotionSensorImpl implements LinearAccelerationSensor {
	/**
	 * The default value of the '{@link #getXAcceleration() <em>XAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAcceleration()
	 * @generated
	 * @ordered
	 */
	protected static final double XACCELERATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXAcceleration() <em>XAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAcceleration()
	 * @generated
	 * @ordered
	 */
	protected double xAcceleration = XACCELERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAcceleration() <em>YAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAcceleration()
	 * @generated
	 * @ordered
	 */
	protected static final double YACCELERATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYAcceleration() <em>YAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAcceleration()
	 * @generated
	 * @ordered
	 */
	protected double yAcceleration = YACCELERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZAcceleration() <em>ZAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAcceleration()
	 * @generated
	 * @ordered
	 */
	protected static final double ZACCELERATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZAcceleration() <em>ZAcceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAcceleration()
	 * @generated
	 * @ordered
	 */
	protected double zAcceleration = ZACCELERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearAccelerationSensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsMotionPackage.Literals.LINEAR_ACCELERATION_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXAcceleration() {
		return xAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAcceleration(double newXAcceleration) {
		double oldXAcceleration = xAcceleration;
		xAcceleration = newXAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION, oldXAcceleration, xAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYAcceleration() {
		return yAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAcceleration(double newYAcceleration) {
		double oldYAcceleration = yAcceleration;
		yAcceleration = newYAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION, oldYAcceleration, yAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZAcceleration() {
		return zAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZAcceleration(double newZAcceleration) {
		double oldZAcceleration = zAcceleration;
		zAcceleration = newZAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION, oldZAcceleration, zAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				return getXAcceleration();
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				return getYAcceleration();
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
				return getZAcceleration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				setXAcceleration((Double)newValue);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				setYAcceleration((Double)newValue);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
				setZAcceleration((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				setXAcceleration(XACCELERATION_EDEFAULT);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				setYAcceleration(YACCELERATION_EDEFAULT);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
				setZAcceleration(ZACCELERATION_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				return xAcceleration != XACCELERATION_EDEFAULT;
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				return yAcceleration != YACCELERATION_EDEFAULT;
			case ApogyAddonsSensorsMotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
				return zAcceleration != ZACCELERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xAcceleration: ");
		result.append(xAcceleration);
		result.append(", yAcceleration: ");
		result.append(yAcceleration);
		result.append(", zAcceleration: ");
		result.append(zAcceleration);
		result.append(')');
		return result.toString();
	}

} //LinearAccelerationSensorImpl
