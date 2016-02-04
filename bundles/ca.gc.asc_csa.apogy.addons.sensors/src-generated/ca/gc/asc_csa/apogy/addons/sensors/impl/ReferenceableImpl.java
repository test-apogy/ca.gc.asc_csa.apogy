package ca.gc.asc_csa.apogy.addons.sensors.impl;
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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.addons.sensors.Referenceable;
import ca.gc.asc_csa.apogy.addons.sensors.ApogyAddonsSensorsPackage;

import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.impl.ReferenceableImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceableImpl extends MinimalEObjectImpl.Container implements Referenceable {
	/**
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected Node referenceFrame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPackage.Literals.REFERENCEABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getReferenceFrame() {
		if (referenceFrame != null && referenceFrame.eIsProxy()) {
			InternalEObject oldReferenceFrame = (InternalEObject)referenceFrame;
			referenceFrame = (Node)eResolveProxy(oldReferenceFrame);
			if (referenceFrame != oldReferenceFrame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsSensorsPackage.REFERENCEABLE__REFERENCE_FRAME, oldReferenceFrame, referenceFrame));
			}
		}
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetReferenceFrame() {
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFrame(Node newReferenceFrame) {
		Node oldReferenceFrame = referenceFrame;
		referenceFrame = newReferenceFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPackage.REFERENCEABLE__REFERENCE_FRAME, oldReferenceFrame, referenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				if (resolve) return getReferenceFrame();
				return basicGetReferenceFrame();
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
			case ApogyAddonsSensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				setReferenceFrame((Node)newValue);
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
			case ApogyAddonsSensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				setReferenceFrame((Node)null);
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
			case ApogyAddonsSensorsPackage.REFERENCEABLE__REFERENCE_FRAME:
				return referenceFrame != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceableImpl
