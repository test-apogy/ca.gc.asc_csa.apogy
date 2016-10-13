package ca.gc.asc_csa.apogy.examples.satellite.impl;
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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractUID;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constellation Downlink Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationDownlinkItemImpl#getRequestUID <em>Request UID</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationDownlinkItemImpl#getRequest <em>Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationDownlinkItemImpl extends MinimalEObjectImpl.Container implements AbstractConstellationDownlinkItem {
	/**
	 * The cached value of the '{@link #getRequestUID() <em>Request UID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestUID()
	 * @generated
	 * @ordered
	 */
	protected AbstractUID requestUID;

	/**
	 * The cached value of the '{@link #getRequest() <em>Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequest()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstellationRequest request;

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
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractUID getRequestUID() {
		return requestUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestUID(AbstractUID newRequestUID, NotificationChain msgs) {
		AbstractUID oldRequestUID = requestUID;
		requestUID = newRequestUID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID, oldRequestUID, newRequestUID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestUID(AbstractUID newRequestUID) {
		if (newRequestUID != requestUID) {
			NotificationChain msgs = null;
			if (requestUID != null)
				msgs = ((InternalEObject)requestUID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID, null, msgs);
			if (newRequestUID != null)
				msgs = ((InternalEObject)newRequestUID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID, null, msgs);
			msgs = basicSetRequestUID(newRequestUID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID, newRequestUID, newRequestUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationRequest getRequest() {
		if (request != null && request.eIsProxy()) {
			InternalEObject oldRequest = (InternalEObject)request;
			request = (AbstractConstellationRequest)eResolveProxy(oldRequest);
			if (request != oldRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST, oldRequest, request));
			}
		}
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationRequest basicGetRequest() {
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequest(AbstractConstellationRequest newRequest) {
		AbstractConstellationRequest oldRequest = request;
		request = newRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST, oldRequest, request));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				return basicSetRequestUID(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				return getRequestUID();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				setRequestUID((AbstractUID)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST:
				setRequest((AbstractConstellationRequest)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				setRequestUID((AbstractUID)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST:
				setRequest((AbstractConstellationRequest)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST_UID:
				return requestUID != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_DOWNLINK_ITEM__REQUEST:
				return request != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractConstellationDownlinkItemImpl
