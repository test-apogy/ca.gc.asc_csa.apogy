package ca.gc.asc_csa.apogy.common.io.jinput.impl;
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EComponent Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentQualifierImpl#getEComponentName <em>EComponent Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.impl.EComponentQualifierImpl#getEControllerName <em>EController Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EComponentQualifierImpl extends MinimalEObjectImpl.Container implements EComponentQualifier {
	/**
	 * The default value of the '{@link #getEComponentName() <em>EComponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String ECOMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEComponentName() <em>EComponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEComponentName()
	 * @generated
	 * @ordered
	 */
	protected String eComponentName = ECOMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEControllerName() <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEControllerName()
	 * @generated
	 * @ordered
	 */
	protected static final String ECONTROLLER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEControllerName() <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEControllerName()
	 * @generated
	 * @ordered
	 */
	protected String eControllerName = ECONTROLLER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EComponentQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEComponentName() {
		return eComponentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEComponentName(String newEComponentName) {
		String oldEComponentName = eComponentName;
		eComponentName = newEComponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME, oldEComponentName, eComponentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEControllerName() {
		return eControllerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEControllerName(String newEControllerName) {
		String oldEControllerName = eControllerName;
		eControllerName = newEControllerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME, oldEControllerName, eControllerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				return getEComponentName();
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				return getEControllerName();
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
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				setEComponentName((String)newValue);
				return;
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				setEControllerName((String)newValue);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				setEComponentName(ECOMPONENT_NAME_EDEFAULT);
				return;
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				setEControllerName(ECONTROLLER_NAME_EDEFAULT);
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
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
				return ECOMPONENT_NAME_EDEFAULT == null ? eComponentName != null : !ECOMPONENT_NAME_EDEFAULT.equals(eComponentName);
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				return ECONTROLLER_NAME_EDEFAULT == null ? eControllerName != null : !ECONTROLLER_NAME_EDEFAULT.equals(eControllerName);
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
		result.append(" (eComponentName: ");
		result.append(eComponentName);
		result.append(", eControllerName: ");
		result.append(eControllerName);
		result.append(')');
		return result.toString();
	}

} //EComponentQualifierImpl
