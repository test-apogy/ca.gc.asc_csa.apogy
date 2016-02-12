/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Request Based Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractRequestBasedSatelliteCommandImpl#getConstellationRequest <em>Constellation Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRequestBasedSatelliteCommandImpl extends AbstractSatelliteCommandImpl implements AbstractRequestBasedSatelliteCommand {
	/**
	 * The cached value of the '{@link #getConstellationRequest() <em>Constellation Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationRequest()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstellationRequest constellationRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRequestBasedSatelliteCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationRequest getConstellationRequest() {
		if (constellationRequest != null && constellationRequest.eIsProxy()) {
			InternalEObject oldConstellationRequest = (InternalEObject)constellationRequest;
			constellationRequest = (AbstractConstellationRequest)eResolveProxy(oldConstellationRequest);
			if (constellationRequest != oldConstellationRequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST, oldConstellationRequest, constellationRequest));
			}
		}
		return constellationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationRequest basicGetConstellationRequest() {
		return constellationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequest(AbstractConstellationRequest newConstellationRequest) {
		AbstractConstellationRequest oldConstellationRequest = constellationRequest;
		constellationRequest = newConstellationRequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST, oldConstellationRequest, constellationRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				if (resolve) return getConstellationRequest();
				return basicGetConstellationRequest();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				setConstellationRequest((AbstractConstellationRequest)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				setConstellationRequest((AbstractConstellationRequest)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_REQUEST_BASED_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				return constellationRequest != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractRequestBasedSatelliteCommandImpl
