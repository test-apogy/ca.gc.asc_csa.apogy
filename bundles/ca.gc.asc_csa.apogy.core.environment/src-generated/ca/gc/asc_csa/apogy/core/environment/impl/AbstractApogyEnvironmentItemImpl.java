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
package ca.gc.asc_csa.apogy.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.core.environment.AbstractApogyEnvironmentItem;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Apogy Environment Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.AbstractApogyEnvironmentItemImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractApogyEnvironmentItemImpl extends MinimalEObjectImpl.Container implements AbstractApogyEnvironmentItem {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractApogyEnvironmentItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.ABSTRACT_APOGY_ENVIRONMENT_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment getEnvironment() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT) return null;
		return (ApogyEnvironment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyEnvironment basicGetEnvironment() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT) return null;
		return (ApogyEnvironment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(ApogyEnvironment newEnvironment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnvironment, ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(ApogyEnvironment newEnvironment) {
		if (newEnvironment != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT && newEnvironment != null)) {
			if (EcoreUtil.isAncestor(this, newEnvironment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT__ENVIRONMENT_ITEMS, ApogyEnvironment.class, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnvironment((ApogyEnvironment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentPackage.APOGY_ENVIRONMENT__ENVIRONMENT_ITEMS, ApogyEnvironment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__NAME:
				return getName();
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION:
				return getDescription();
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				setEnvironment((ApogyEnvironment)newValue);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				setEnvironment((ApogyEnvironment)null);
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
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__ENVIRONMENT:
				return basicGetEnvironment() != null;
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
				case ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreEnvironmentPackage.ABSTRACT_APOGY_ENVIRONMENT_ITEM__DESCRIPTION;
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
		result.append(')');
		return result.toString();
	}

} //AbstractApogyEnvironmentItemImpl
