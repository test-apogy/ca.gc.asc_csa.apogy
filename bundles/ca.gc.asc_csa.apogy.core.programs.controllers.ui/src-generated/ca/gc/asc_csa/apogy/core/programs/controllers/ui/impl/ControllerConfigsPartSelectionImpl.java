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

import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;

import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Configs Part Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerConfigsPartSelectionImpl#getControllersConfiguration <em>Controllers Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerConfigsPartSelectionImpl extends MinimalEObjectImpl.Container implements ControllerConfigsPartSelection {
	/**
	 * The cached value of the '{@link #getControllersConfiguration() <em>Controllers Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllersConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ControllersConfiguration controllersConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerConfigsPartSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreProgramsControllersUIPackage.Literals.CONTROLLER_CONFIGS_PART_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersConfiguration getControllersConfiguration() {
		if (controllersConfiguration != null && controllersConfiguration.eIsProxy()) {
			InternalEObject oldControllersConfiguration = (InternalEObject)controllersConfiguration;
			controllersConfiguration = (ControllersConfiguration)eResolveProxy(oldControllersConfiguration);
			if (controllersConfiguration != oldControllersConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION, oldControllersConfiguration, controllersConfiguration));
			}
		}
		return controllersConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersConfiguration basicGetControllersConfiguration() {
		return controllersConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllersConfiguration(ControllersConfiguration newControllersConfiguration) {
		ControllersConfiguration oldControllersConfiguration = controllersConfiguration;
		controllersConfiguration = newControllersConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION, oldControllersConfiguration, controllersConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION:
				if (resolve) return getControllersConfiguration();
				return basicGetControllersConfiguration();
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION:
				setControllersConfiguration((ControllersConfiguration)newValue);
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION:
				setControllersConfiguration((ControllersConfiguration)null);
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION:
				return controllersConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //ControllerConfigsPartSelectionImpl
