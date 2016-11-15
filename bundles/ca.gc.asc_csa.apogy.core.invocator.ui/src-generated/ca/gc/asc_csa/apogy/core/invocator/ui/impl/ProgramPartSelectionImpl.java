/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.ui.impl;

import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.ProgramPartSelection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Part Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.ProgramPartSelectionImpl#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramPartSelectionImpl extends MinimalEObjectImpl.Container implements ProgramPartSelection {
	/**
	 * The cached value of the '{@link #getOperationCall() <em>Operation Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCall()
	 * @generated
	 * @ordered
	 */
	protected OperationCall operationCall;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramPartSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorUIPackage.Literals.PROGRAM_PART_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall getOperationCall() {
		if (operationCall != null && operationCall.eIsProxy()) {
			InternalEObject oldOperationCall = (InternalEObject)operationCall;
			operationCall = (OperationCall)eResolveProxy(oldOperationCall);
			if (operationCall != oldOperationCall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION__OPERATION_CALL, oldOperationCall, operationCall));
			}
		}
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCall basicGetOperationCall() {
		return operationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationCall(OperationCall newOperationCall) {
		OperationCall oldOperationCall = operationCall;
		operationCall = newOperationCall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION__OPERATION_CALL, oldOperationCall, operationCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION__OPERATION_CALL:
				if (resolve) return getOperationCall();
				return basicGetOperationCall();
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
			case ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION__OPERATION_CALL:
				setOperationCall((OperationCall)newValue);
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
			case ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION__OPERATION_CALL:
				setOperationCall((OperationCall)null);
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
			case ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION__OPERATION_CALL:
				return operationCall != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramPartSelectionImpl
