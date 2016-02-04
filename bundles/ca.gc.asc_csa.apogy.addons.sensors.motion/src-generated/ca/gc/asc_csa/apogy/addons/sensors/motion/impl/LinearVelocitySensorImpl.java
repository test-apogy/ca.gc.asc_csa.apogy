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
import ca.gc.asc_csa.apogy.addons.sensors.motion.LinearVelocitySensor;
import ca.gc.asc_csa.apogy.addons.sensors.motion.ApogyAddonsSensorsMotionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Velocity Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.impl.LinearVelocitySensorImpl#getXVelocity <em>XVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.impl.LinearVelocitySensorImpl#getYVelocity <em>YVelocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.motion.impl.LinearVelocitySensorImpl#getZVelocity <em>ZVelocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinearVelocitySensorImpl extends SelfMotionSensorImpl implements LinearVelocitySensor {
	/**
	 * The default value of the '{@link #getXVelocity() <em>XVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double XVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXVelocity() <em>XVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXVelocity()
	 * @generated
	 * @ordered
	 */
	protected double xVelocity = XVELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYVelocity() <em>YVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double YVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYVelocity() <em>YVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYVelocity()
	 * @generated
	 * @ordered
	 */
	protected double yVelocity = YVELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZVelocity() <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ZVELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZVelocity() <em>ZVelocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZVelocity()
	 * @generated
	 * @ordered
	 */
	protected double zVelocity = ZVELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinearVelocitySensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsMotionPackage.Literals.LINEAR_VELOCITY_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXVelocity() {
		return xVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXVelocity(double newXVelocity) {
		double oldXVelocity = xVelocity;
		xVelocity = newXVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__XVELOCITY, oldXVelocity, xVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYVelocity() {
		return yVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYVelocity(double newYVelocity) {
		double oldYVelocity = yVelocity;
		yVelocity = newYVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__YVELOCITY, oldYVelocity, yVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZVelocity() {
		return zVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZVelocity(double newZVelocity) {
		double oldZVelocity = zVelocity;
		zVelocity = newZVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__ZVELOCITY, oldZVelocity, zVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__XVELOCITY:
				return getXVelocity();
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__YVELOCITY:
				return getYVelocity();
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__ZVELOCITY:
				return getZVelocity();
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
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__XVELOCITY:
				setXVelocity((Double)newValue);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__YVELOCITY:
				setYVelocity((Double)newValue);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__ZVELOCITY:
				setZVelocity((Double)newValue);
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
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__XVELOCITY:
				setXVelocity(XVELOCITY_EDEFAULT);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__YVELOCITY:
				setYVelocity(YVELOCITY_EDEFAULT);
				return;
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__ZVELOCITY:
				setZVelocity(ZVELOCITY_EDEFAULT);
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
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__XVELOCITY:
				return xVelocity != XVELOCITY_EDEFAULT;
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__YVELOCITY:
				return yVelocity != YVELOCITY_EDEFAULT;
			case ApogyAddonsSensorsMotionPackage.LINEAR_VELOCITY_SENSOR__ZVELOCITY:
				return zVelocity != ZVELOCITY_EDEFAULT;
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
		result.append(" (xVelocity: ");
		result.append(xVelocity);
		result.append(", yVelocity: ");
		result.append(yVelocity);
		result.append(", zVelocity: ");
		result.append(zVelocity);
		result.append(')');
		return result.toString();
	}

} //LinearVelocitySensorImpl
