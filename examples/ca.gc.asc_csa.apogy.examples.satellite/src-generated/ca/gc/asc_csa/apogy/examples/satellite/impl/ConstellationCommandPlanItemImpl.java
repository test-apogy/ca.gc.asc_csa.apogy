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
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Command Plan Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanItemImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanItemImpl#getSatelliteCommand <em>Satellite Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationCommandPlanItemImpl extends MinimalEObjectImpl.Container implements ConstellationCommandPlanItem {
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
	protected ConstellationCommandPlanItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_COMMAND_PLAN_ITEM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST, oldRequest, request));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST, oldRequest, request));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND, oldSatelliteCommand, newSatelliteCommand);
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
				msgs = ((InternalEObject)satelliteCommand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND, null, msgs);
			if (newSatelliteCommand != null)
				msgs = ((InternalEObject)newSatelliteCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND, null, msgs);
			msgs = basicSetSatelliteCommand(newSatelliteCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND, newSatelliteCommand, newSatelliteCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST:
				if (resolve) return getRequest();
				return basicGetRequest();
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST:
				setRequest((AbstractConstellationRequest)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST:
				setRequest((AbstractConstellationRequest)null);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__REQUEST:
				return request != null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN_ITEM__SATELLITE_COMMAND:
				return satelliteCommand != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstellationCommandPlanItemImpl
