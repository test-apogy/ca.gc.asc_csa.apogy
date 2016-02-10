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

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestPriority;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestStatus;
import ca.gc.asc_csa.apogy.examples.satellite.UID;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Constellation Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl#getOrderPriority <em>Order Priority</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl#getOrderStatus <em>Order Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationRequestImpl#getSatelliteCommand <em>Satellite Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationRequestImpl extends MinimalEObjectImpl.Container implements AbstractConstellationRequest {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected UID uid;

	/**
	 * The default value of the '{@link #getOrderPriority() <em>Order Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPriority()
	 * @generated
	 * @ordered
	 */
	protected static final ConstellationRequestPriority ORDER_PRIORITY_EDEFAULT = ConstellationRequestPriority.NORMAL;

	/**
	 * The cached value of the '{@link #getOrderPriority() <em>Order Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderPriority()
	 * @generated
	 * @ordered
	 */
	protected ConstellationRequestPriority orderPriority = ORDER_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrderStatus() <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ConstellationRequestStatus ORDER_STATUS_EDEFAULT = ConstellationRequestStatus.NEW;

	/**
	 * The cached value of the '{@link #getOrderStatus() <em>Order Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderStatus()
	 * @generated
	 * @ordered
	 */
	protected ConstellationRequestStatus orderStatus = ORDER_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSatelliteCommand() <em>Satellite Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatelliteCommand()
	 * @generated
	 * @ordered
	 */
	protected AbstractSatelliteCommand satelliteCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstellationRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UID getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(UID newUid, NotificationChain msgs) {
		UID oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(UID newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestPriority getOrderPriority() {
		return orderPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderPriority(ConstellationRequestPriority newOrderPriority) {
		ConstellationRequestPriority oldOrderPriority = orderPriority;
		orderPriority = newOrderPriority == null ? ORDER_PRIORITY_EDEFAULT : newOrderPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY, oldOrderPriority, orderPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestStatus getOrderStatus() {
		return orderStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderStatus(ConstellationRequestStatus newOrderStatus) {
		ConstellationRequestStatus oldOrderStatus = orderStatus;
		orderStatus = newOrderStatus == null ? ORDER_STATUS_EDEFAULT : newOrderStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS, oldOrderStatus, orderStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSatelliteCommand getSatelliteCommand() {
		return satelliteCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatelliteCommand(AbstractSatelliteCommand newSatelliteCommand, NotificationChain msgs) {
		AbstractSatelliteCommand oldSatelliteCommand = satelliteCommand;
		satelliteCommand = newSatelliteCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND, oldSatelliteCommand, newSatelliteCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatelliteCommand(AbstractSatelliteCommand newSatelliteCommand) {
		if (newSatelliteCommand != satelliteCommand) {
			NotificationChain msgs = null;
			if (satelliteCommand != null)
				msgs = ((InternalEObject)satelliteCommand).eInverseRemove(this, ApogyExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST, AbstractSatelliteCommand.class, msgs);
			if (newSatelliteCommand != null)
				msgs = ((InternalEObject)newSatelliteCommand).eInverseAdd(this, ApogyExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST, AbstractSatelliteCommand.class, msgs);
			msgs = basicSetSatelliteCommand(newSatelliteCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND, newSatelliteCommand, newSatelliteCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND:
				if (satelliteCommand != null)
					msgs = ((InternalEObject)satelliteCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND, null, msgs);
				return basicSetSatelliteCommand((AbstractSatelliteCommand)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID:
				return basicSetUid(null, msgs);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND:
				return basicSetSatelliteCommand(null, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID:
				return getUid();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY:
				return getOrderPriority();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS:
				return getOrderStatus();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND:
				return getSatelliteCommand();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID:
				setUid((UID)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY:
				setOrderPriority((ConstellationRequestPriority)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS:
				setOrderStatus((ConstellationRequestStatus)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND:
				setSatelliteCommand((AbstractSatelliteCommand)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID:
				setUid((UID)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY:
				setOrderPriority(ORDER_PRIORITY_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS:
				setOrderStatus(ORDER_STATUS_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND:
				setSatelliteCommand((AbstractSatelliteCommand)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__UID:
				return uid != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_PRIORITY:
				return orderPriority != ORDER_PRIORITY_EDEFAULT;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__ORDER_STATUS:
				return orderStatus != ORDER_STATUS_EDEFAULT;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND:
				return satelliteCommand != null;
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
		result.append(" (orderPriority: ");
		result.append(orderPriority);
		result.append(", orderStatus: ");
		result.append(orderStatus);
		result.append(')');
		return result.toString();
	}

} //AbstractConstellationRequestImpl
