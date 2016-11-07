/**
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
package ca.gc.asc_csa.apogy.common.ui.impl;

import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiPackage;
import ca.gc.asc_csa.apogy.common.ui.ApogySelection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.jface.viewers.ISelection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Apogy Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.ui.impl.ApogySelectionImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.ui.impl.ApogySelectionImpl#getPartID <em>Part ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogySelectionImpl extends MinimalEObjectImpl.Container implements ApogySelection {
	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final ISelection SELECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected ISelection selection = SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartID() <em>Part ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartID()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartID() <em>Part ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartID()
	 * @generated
	 * @ordered
	 */
	protected String partID = PART_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogySelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonUiPackage.Literals.APOGY_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISelection getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(ISelection newSelection) {
		ISelection oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonUiPackage.APOGY_SELECTION__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartID() {
		return partID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartID(String newPartID) {
		String oldPartID = partID;
		partID = newPartID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonUiPackage.APOGY_SELECTION__PART_ID, oldPartID, partID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonUiPackage.APOGY_SELECTION__SELECTION:
				return getSelection();
			case ApogyCommonUiPackage.APOGY_SELECTION__PART_ID:
				return getPartID();
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
			case ApogyCommonUiPackage.APOGY_SELECTION__SELECTION:
				setSelection((ISelection)newValue);
				return;
			case ApogyCommonUiPackage.APOGY_SELECTION__PART_ID:
				setPartID((String)newValue);
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
			case ApogyCommonUiPackage.APOGY_SELECTION__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case ApogyCommonUiPackage.APOGY_SELECTION__PART_ID:
				setPartID(PART_ID_EDEFAULT);
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
			case ApogyCommonUiPackage.APOGY_SELECTION__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case ApogyCommonUiPackage.APOGY_SELECTION__PART_ID:
				return PART_ID_EDEFAULT == null ? partID != null : !PART_ID_EDEFAULT.equals(partID);
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
		result.append(" (selection: ");
		result.append(selection);
		result.append(", PartID: ");
		result.append(partID);
		result.append(')');
		return result.toString();
	}

} //ApogySelectionImpl
