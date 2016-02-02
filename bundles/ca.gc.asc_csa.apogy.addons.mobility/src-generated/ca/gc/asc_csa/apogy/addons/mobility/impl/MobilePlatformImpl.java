package ca.gc.asc_csa.apogy.addons.mobility.impl;
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
import ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform;
import ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus;
import ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mobile Plateform</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.MobilePlatformImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.impl.MobilePlatformImpl#getMobilePlatformStatus <em>Mobile Platform Status</em>}</li>
 * </ul>
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
		return ApogyAddonsMobilityPackage.Literals.MOBILE_PLATFORM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOVING, oldMoving, moving));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS, oldMobilePlatformStatus, mobilePlatformStatus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				return isMoving();
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
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
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				setMoving((Boolean)newValue);
				return;
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
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
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
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
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOVING:
				return moving != MOVING_EDEFAULT;
			case ApogyAddonsMobilityPackage.MOBILE_PLATFORM__MOBILE_PLATFORM_STATUS:
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
