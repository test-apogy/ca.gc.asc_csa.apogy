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
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Archivable;
import ca.gc.asc_csa.apogy.common.emf.Described;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;

import ca.gc.asc_csa.apogy.core.invocator.SpecificProgramSettings;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramSettingsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramSettingsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramSettingsImpl#isArchived <em>Archived</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ProgramSettingsImpl#getSpecificProgramSettings <em>Specific Program Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramSettingsImpl extends MinimalEObjectImpl.Container implements ProgramSettings {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected boolean archived = ARCHIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecificProgramSettings() <em>Specific Program Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificProgramSettings()
	 * @generated
	 * @ordered
	 */
	protected SpecificProgramSettings specificProgramSettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.PROGRAM_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchived() {
		return archived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchived(boolean newArchived) {
		boolean oldArchived = archived;
		archived = newArchived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED, oldArchived, archived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificProgramSettings getSpecificProgramSettings() {
		return specificProgramSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificProgramSettings(SpecificProgramSettings newSpecificProgramSettings, NotificationChain msgs) {
		SpecificProgramSettings oldSpecificProgramSettings = specificProgramSettings;
		specificProgramSettings = newSpecificProgramSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS, oldSpecificProgramSettings, newSpecificProgramSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificProgramSettings(SpecificProgramSettings newSpecificProgramSettings) {
		if (newSpecificProgramSettings != specificProgramSettings) {
			NotificationChain msgs = null;
			if (specificProgramSettings != null)
				msgs = ((InternalEObject)specificProgramSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS, null, msgs);
			if (newSpecificProgramSettings != null)
				msgs = ((InternalEObject)newSpecificProgramSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS, null, msgs);
			msgs = basicSetSpecificProgramSettings(newSpecificProgramSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS, newSpecificProgramSettings, newSpecificProgramSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS:
				return basicSetSpecificProgramSettings(null, msgs);
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
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION:
				return getDescription();
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED:
				return isArchived();
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS:
				return getSpecificProgramSettings();
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
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED:
				setArchived((Boolean)newValue);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS:
				setSpecificProgramSettings((SpecificProgramSettings)newValue);
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
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED:
				setArchived(ARCHIVED_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS:
				setSpecificProgramSettings((SpecificProgramSettings)null);
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
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED:
				return archived != ARCHIVED_EDEFAULT;
			case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__SPECIFIC_PROGRAM_SETTINGS:
				return specificProgramSettings != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Archivable.class) {
			switch (derivedFeatureID) {
				case ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED: return ApogyCommonEMFPackage.ARCHIVABLE__ARCHIVED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == Archivable.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.ARCHIVABLE__ARCHIVED: return ApogyCoreInvocatorPackage.PROGRAM_SETTINGS__ARCHIVED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", archived: ");
		result.append(archived);
		result.append(')');
		return result.toString();
	}

} //ProgramSettingsImpl
