/**
 * Canadian Space Agency 2007.
 *
 * $Id: MobilePlateformImpl.java,v 1.4.4.2 2015/05/21 15:51:27 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.mobility.MobilePlateform;
import org.eclipse.symphony.addons.mobility.MobilePlateformStatus;
import org.eclipse.symphony.addons.mobility.MobilityPackage;
import org.eclipse.symphony.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mobile Plateform</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.impl.MobilePlateformImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.impl.MobilePlateformImpl#getMobilePlateformStatus <em>Mobile Plateform Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobilePlateformImpl extends AggregateGroupNodeImpl implements
		MobilePlateform {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2007.";

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
	 * The default value of the '{@link #getMobilePlateformStatus() <em>Mobile Plateform Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePlateformStatus()
	 * @generated
	 * @ordered
	 */
	protected static final MobilePlateformStatus MOBILE_PLATEFORM_STATUS_EDEFAULT = MobilePlateformStatus.OFF;

	/**
	 * The cached value of the '{@link #getMobilePlateformStatus() <em>Mobile Plateform Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePlateformStatus()
	 * @generated
	 * @ordered
	 */
	protected MobilePlateformStatus mobilePlateformStatus = MOBILE_PLATEFORM_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePlateformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobilityPackage.Literals.MOBILE_PLATEFORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobilityPackage.MOBILE_PLATEFORM__MOVING, oldMoving, moving));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlateformStatus getMobilePlateformStatus() {
		return mobilePlateformStatus;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilePlateformStatus(
			MobilePlateformStatus newMobilePlateformStatus) {
		MobilePlateformStatus oldMobilePlateformStatus = mobilePlateformStatus;
		mobilePlateformStatus = newMobilePlateformStatus == null ? MOBILE_PLATEFORM_STATUS_EDEFAULT : newMobilePlateformStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobilityPackage.MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS, oldMobilePlateformStatus, mobilePlateformStatus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobilityPackage.MOBILE_PLATEFORM__MOVING:
				return isMoving();
			case MobilityPackage.MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS:
				return getMobilePlateformStatus();
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
			case MobilityPackage.MOBILE_PLATEFORM__MOVING:
				setMoving((Boolean)newValue);
				return;
			case MobilityPackage.MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS:
				setMobilePlateformStatus((MobilePlateformStatus)newValue);
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
			case MobilityPackage.MOBILE_PLATEFORM__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case MobilityPackage.MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS:
				setMobilePlateformStatus(MOBILE_PLATEFORM_STATUS_EDEFAULT);
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
			case MobilityPackage.MOBILE_PLATEFORM__MOVING:
				return moving != MOVING_EDEFAULT;
			case MobilityPackage.MOBILE_PLATEFORM__MOBILE_PLATEFORM_STATUS:
				return mobilePlateformStatus != MOBILE_PLATEFORM_STATUS_EDEFAULT;
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
		result.append(", mobilePlateformStatus: ");
		result.append(mobilePlateformStatus);
		result.append(')');
		return result.toString();
	}

} // MobilePlateformImpl
