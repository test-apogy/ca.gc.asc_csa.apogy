/**
 * <copyright>
 * </copyright>
 *
 * $Id: AngularVelocitySensorImpl.java,v 1.3.4.2 2015/05/21 15:50:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.motion.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.motion.AngularVelocitySensor;
import org.eclipse.symphony.addons.sensors.motion.MotionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angular Velocity Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.motion.impl.AngularVelocitySensorImpl#getZAngularVelocity <em>ZAngular Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngularVelocitySensorImpl extends SelfMotionSensorImpl implements AngularVelocitySensor {
	/**
	 * The default value of the '{@link #getXAngularVelocity() <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double XANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXAngularVelocity() <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double xAngularVelocity = XANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getYAngularVelocity() <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double YANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYAngularVelocity() <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double yAngularVelocity = YANGULAR_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getZAngularVelocity() <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ZANGULAR_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZAngularVelocity() <em>ZAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected double zAngularVelocity = ZANGULAR_VELOCITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularVelocitySensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MotionPackage.Literals.ANGULAR_VELOCITY_SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXAngularVelocity() {
		return xAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAngularVelocity(double newXAngularVelocity) {
		double oldXAngularVelocity = xAngularVelocity;
		xAngularVelocity = newXAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MotionPackage.ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY, oldXAngularVelocity, xAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYAngularVelocity() {
		return yAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYAngularVelocity(double newYAngularVelocity) {
		double oldYAngularVelocity = yAngularVelocity;
		yAngularVelocity = newYAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MotionPackage.ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY, oldYAngularVelocity, yAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZAngularVelocity() {
		return zAngularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZAngularVelocity(double newZAngularVelocity) {
		double oldZAngularVelocity = zAngularVelocity;
		zAngularVelocity = newZAngularVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MotionPackage.ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY, oldZAngularVelocity, zAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY:
				return getXAngularVelocity();
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY:
				return getYAngularVelocity();
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY:
				return getZAngularVelocity();
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
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY:
				setXAngularVelocity((Double)newValue);
				return;
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY:
				setYAngularVelocity((Double)newValue);
				return;
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY:
				setZAngularVelocity((Double)newValue);
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
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY:
				setXAngularVelocity(XANGULAR_VELOCITY_EDEFAULT);
				return;
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY:
				setYAngularVelocity(YANGULAR_VELOCITY_EDEFAULT);
				return;
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY:
				setZAngularVelocity(ZANGULAR_VELOCITY_EDEFAULT);
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
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__XANGULAR_VELOCITY:
				return xAngularVelocity != XANGULAR_VELOCITY_EDEFAULT;
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__YANGULAR_VELOCITY:
				return yAngularVelocity != YANGULAR_VELOCITY_EDEFAULT;
			case MotionPackage.ANGULAR_VELOCITY_SENSOR__ZANGULAR_VELOCITY:
				return zAngularVelocity != ZANGULAR_VELOCITY_EDEFAULT;
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
		result.append(" (xAngularVelocity: ");
		result.append(xAngularVelocity);
		result.append(", yAngularVelocity: ");
		result.append(yAngularVelocity);
		result.append(", zAngularVelocity: ");
		result.append(zAngularVelocity);
		result.append(')');
		return result.toString();
	}

} //AngularVelocitySensorImpl
