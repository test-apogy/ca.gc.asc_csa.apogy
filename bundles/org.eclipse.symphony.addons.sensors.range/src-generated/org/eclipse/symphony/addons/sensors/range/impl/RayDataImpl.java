/**
 * <copyright>
 * </copyright>
 *
 * $Id: RayDataImpl.java,v 1.3.4.2 2015/05/21 15:50:21 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.RayData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ray Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RayDataImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RayDataImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RayDataImpl extends MinimalEObjectImpl.Container implements RayData {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Point3d ORIGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Point3d origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Vector3d DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Vector3d direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RayDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsSensorsRangePackage.Literals.RAY_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3d getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Point3d newOrigin) {
		Point3d oldOrigin = origin;
		origin = newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.RAY_DATA__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector3d getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Vector3d newDirection) {
		Vector3d oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsRangePackage.RAY_DATA__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__ORIGIN:
				return getOrigin();
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__DIRECTION:
				return getDirection();
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
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__ORIGIN:
				setOrigin((Point3d)newValue);
				return;
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__DIRECTION:
				setDirection((Vector3d)newValue);
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
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__ORIGIN:
				return ORIGIN_EDEFAULT == null ? origin != null : !ORIGIN_EDEFAULT.equals(origin);
			case Symphony__AddonsSensorsRangePackage.RAY_DATA__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
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
		result.append(" (origin: ");
		result.append(origin);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //RayDataImpl
