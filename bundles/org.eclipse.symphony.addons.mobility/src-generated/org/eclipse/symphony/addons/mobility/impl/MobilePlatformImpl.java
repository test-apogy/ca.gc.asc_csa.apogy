/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilePlatformImpl.java,v 1.4.4.2 2015/05/21 15:51:27 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.mobility.MobilePlatform;
import org.eclipse.symphony.addons.mobility.MobilePlatformStatus;
import org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage;
import org.eclipse.symphony.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mobile Plateform</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.impl.MobilePlatformImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.impl.MobilePlatformImpl#getMobilePlatformStatus <em>Mobile Platform Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobilePlatformImpl extends AggregateGroupNodeImpl implements
		MobilePlatform {
	/**
	 * The default value of the '{@link #isMoving() <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMoving()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoving() <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMoving()
	 * @generated
	 * @ordered
	 */
	protected boolean moving = MOVING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMobilePlatformStatus() <em>Mobile Platform Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePlatformStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MobilePlatformStatus MOBILE_PLATFORM_STATUS_EDEFAULT = MobilePlatformStatus.OFF;

	/**
	 * The cached value of the '{@link #getMobilePlatformStatus() <em>Mobile Platform Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePlatformStatus()
	 * @generated
	 * @ordered
	 */
	protected MobilePlatformStatus mobilePlatformStatus = MOBILE_PLATFORM_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePlatformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsMobilityPackage.Literals.MOBILE_PLATFORM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoving() {
		return moving;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoving(boolean newMoving) {
		boolean oldMoving = moving;
		moving = newMoving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOVING, oldMoving, moving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatformStatus getMobilePlatformStatus() {
		return mobilePlatformStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilePlatformStatus(MobilePlatformStatus newMobilePlatformStatus) {
		MobilePlatformStatus oldMobilePlatformStatus = mobilePlatformStatus;
		mobilePlatformStatus = newMobilePlatformStatus == null ? MOBILE_PLATFORM_STATUS_EDEFAULT : newMobilePlatformStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS, oldMobilePlatformStatus, mobilePlatformStatus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				return isMoving();
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
				return getMobilePlatformStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				setMoving((Boolean)newValue);
				return;
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
				setMobilePlatformStatus((MobilePlatformStatus)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
				setMobilePlatformStatus(MOBILE_PLATFORM_STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				return moving != MOVING_EDEFAULT;
			case Symphony__AddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
				return mobilePlatformStatus != MOBILE_PLATFORM_STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (moving: ");
		result.append(moving);
		result.append(", mobilePlatformStatus: ");
		result.append(mobilePlatformStatus);
		result.append(')');
		return result.toString();
	}

} // MobilePlatformImpl
