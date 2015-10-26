/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinearAccelerationSensorImpl.java,v 1.3.4.2 2015/05/21 15:50:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.motion.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.motion.LinearAccelerationSensor;
import org.eclipse.symphony.addons.sensors.motion.MotionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linear Acceleration Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl#getXAcceleration <em>XAcceleration</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl#getYAcceleration <em>YAcceleration</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.motion.impl.LinearAccelerationSensorImpl#getZAcceleration <em>ZAcceleration</em>}</li>
 * </ul>
 * </p>
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
		return MotionPackage.Literals.LINEAR_ACCELERATION_SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION, oldXAcceleration, xAcceleration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION, oldYAcceleration, yAcceleration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION, oldZAcceleration, zAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				return getXAcceleration();
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				return getYAcceleration();
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
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
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				setXAcceleration((Double)newValue);
				return;
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				setYAcceleration((Double)newValue);
				return;
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
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
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				setXAcceleration(XACCELERATION_EDEFAULT);
				return;
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				setYAcceleration(YACCELERATION_EDEFAULT);
				return;
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
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
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__XACCELERATION:
				return xAcceleration != XACCELERATION_EDEFAULT;
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__YACCELERATION:
				return yAcceleration != YACCELERATION_EDEFAULT;
			case MotionPackage.LINEAR_ACCELERATION_SENSOR__ZACCELERATION:
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
