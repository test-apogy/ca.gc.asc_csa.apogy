package ca.gc.asc_csa.apogy.common.emf.impl;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.EObjectReferenceImpl#getEObject <em>EObject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EObjectReferenceImpl extends MinimalEObjectImpl.Container implements EObjectReference {
	/**
	 * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject eObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.EOBJECT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEObject() {
		if (eObject != null && eObject.eIsProxy()) {
			InternalEObject oldEObject = (InternalEObject)eObject;
			eObject = eResolveProxy(oldEObject);
			if (eObject != oldEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonEMFPackage.EOBJECT_REFERENCE__EOBJECT, oldEObject, eObject));
			}
		}
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEObject() {
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEObject(EObject newEObject) {
		EObject oldEObject = eObject;
		eObject = newEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.EOBJECT_REFERENCE__EOBJECT, oldEObject, eObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonEMFPackage.EOBJECT_REFERENCE__EOBJECT:
				if (resolve) return getEObject();
				return basicGetEObject();
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
			case ApogyCommonEMFPackage.EOBJECT_REFERENCE__EOBJECT:
				setEObject((EObject)newValue);
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
			case ApogyCommonEMFPackage.EOBJECT_REFERENCE__EOBJECT:
				setEObject((EObject)null);
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
			case ApogyCommonEMFPackage.EOBJECT_REFERENCE__EOBJECT:
				return eObject != null;
		}
		return super.eIsSet(featureID);
	}

} //EObjectReferenceImpl
