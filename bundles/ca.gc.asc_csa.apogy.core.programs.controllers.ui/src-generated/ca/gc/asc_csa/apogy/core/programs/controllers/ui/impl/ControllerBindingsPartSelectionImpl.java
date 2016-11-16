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
package ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Bindings Part Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerBindingsPartSelectionImpl#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerBindingsPartSelectionImpl extends MinimalEObjectImpl.Container implements ControllerBindingsPartSelection {
	/**
	 * The cached value of the '{@link #getOperationCallControllerBinding() <em>Operation Call Controller Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationCallControllerBinding()
	 * @generated
	 * @ordered
	 */
	protected OperationCallControllerBinding operationCallControllerBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerBindingsPartSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreProgramsControllersUIPackage.Literals.CONTROLLER_BINDINGS_PART_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallControllerBinding getOperationCallControllerBinding() {
		if (operationCallControllerBinding != null && operationCallControllerBinding.eIsProxy()) {
			InternalEObject oldOperationCallControllerBinding = (InternalEObject)operationCallControllerBinding;
			operationCallControllerBinding = (OperationCallControllerBinding)eResolveProxy(oldOperationCallControllerBinding);
			if (operationCallControllerBinding != oldOperationCallControllerBinding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING, oldOperationCallControllerBinding, operationCallControllerBinding));
			}
		}
		return operationCallControllerBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallControllerBinding basicGetOperationCallControllerBinding() {
		return operationCallControllerBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationCallControllerBinding(OperationCallControllerBinding newOperationCallControllerBinding) {
		OperationCallControllerBinding oldOperationCallControllerBinding = operationCallControllerBinding;
		operationCallControllerBinding = newOperationCallControllerBinding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING, oldOperationCallControllerBinding, operationCallControllerBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING:
				if (resolve) return getOperationCallControllerBinding();
				return basicGetOperationCallControllerBinding();
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING:
				setOperationCallControllerBinding((OperationCallControllerBinding)newValue);
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING:
				setOperationCallControllerBinding((OperationCallControllerBinding)null);
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING:
				return operationCallControllerBinding != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerBindingsPartSelectionImpl
