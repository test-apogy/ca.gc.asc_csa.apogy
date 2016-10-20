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

import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;

import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Program Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.NewProgramSettingsImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.NewProgramSettingsImpl#getProgramSettings <em>Program Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewProgramSettingsImpl extends MinimalEObjectImpl.Container implements NewProgramSettings {
	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getProgramSettings() <em>Program Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramSettings()
	 * @generated
	 * @ordered
	 */
	protected ProgramSettings programSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewProgramSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorUIPackage.Literals.NEW_PROGRAM_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEClass(EClass newEClass, NotificationChain msgs) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS, oldEClass, newEClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		if (newEClass != eClass) {
			NotificationChain msgs = null;
			if (eClass != null)
				msgs = ((InternalEObject)eClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS, null, msgs);
			if (newEClass != null)
				msgs = ((InternalEObject)newEClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS, null, msgs);
			msgs = basicSetEClass(newEClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS, newEClass, newEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSettings getProgramSettings() {
		return programSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramSettings(ProgramSettings newProgramSettings, NotificationChain msgs) {
		ProgramSettings oldProgramSettings = programSettings;
		programSettings = newProgramSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS, oldProgramSettings, newProgramSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramSettings(ProgramSettings newProgramSettings) {
		if (newProgramSettings != programSettings) {
			NotificationChain msgs = null;
			if (programSettings != null)
				msgs = ((InternalEObject)programSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS, null, msgs);
			if (newProgramSettings != null)
				msgs = ((InternalEObject)newProgramSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS, null, msgs);
			msgs = basicSetProgramSettings(newProgramSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS, newProgramSettings, newProgramSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS:
				return basicSetEClass(null, msgs);
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS:
				return basicSetProgramSettings(null, msgs);
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
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS:
				return getEClass();
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS:
				return getProgramSettings();
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
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS:
				setEClass((EClass)newValue);
				return;
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS:
				setProgramSettings((ProgramSettings)newValue);
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
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS:
				setEClass((EClass)null);
				return;
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS:
				setProgramSettings((ProgramSettings)null);
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
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__ECLASS:
				return eClass != null;
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS:
				return programSettings != null;
		}
		return super.eIsSet(featureID);
	}

} //NewProgramSettingsImpl
