/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.symphony.examples.satellite.AbstractConstellationDownlinkItem;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constellation Downlink Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.AbstractConstellationDownlinkItemImpl#getRequestUID <em>Request UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationDownlinkItemImpl extends MinimalEObjectImpl.Container implements AbstractConstellationDownlinkItem {
	/**
	 * The default value of the '{@link #getRequestUID() <em>Request UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUID()
	 * @generated
	 * @ordered
	 */
	protected static final long REQUEST_UID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRequestUID() <em>Request UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUID()
	 * @generated
	 * @ordered
	 */
	protected long requestUID = REQUEST_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstellationDownlinkItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRequestUID() {
		return requestUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestUID(long newRequestUID) {
		long oldRequestUID = requestUID;
		requestUID = newRequestUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID, oldRequestUID, requestUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				return getRequestUID();
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				setRequestUID((Long)newValue);
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				setRequestUID(REQUEST_UID_EDEFAULT);
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				return requestUID != REQUEST_UID_EDEFAULT;
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
		result.append(" (requestUID: ");
		result.append(requestUID);
		result.append(')');
		return result.toString();
	}

} //AbstractConstellationDownlinkItemImpl