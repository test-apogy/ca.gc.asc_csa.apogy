package ca.gc.asc_csa.apogy.core.environment.orbit.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.common.notify.Notification;
import ca.gc.asc_csa.apogy.core.AbstractOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitWorksiteImpl#getOrbitModel <em>Orbit Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OrbitWorksiteImpl extends WorksiteImpl implements OrbitWorksite {
	/**
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected AbstractOrbitModel orbitModel;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitWorksiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitPackage.Literals.ORBIT_WORKSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOrbitModel getOrbitModel() {
		if (orbitModel != null && orbitModel.eIsProxy()) {
			InternalEObject oldOrbitModel = (InternalEObject)orbitModel;
			orbitModel = (AbstractOrbitModel)eResolveProxy(oldOrbitModel);
			if (orbitModel != oldOrbitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBIT_MODEL, oldOrbitModel, orbitModel));
			}
		}
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOrbitModel basicGetOrbitModel() {
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModel(AbstractOrbitModel newOrbitModel) {
		AbstractOrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBIT_MODEL, oldOrbitModel, orbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBIT_MODEL:
				setOrbitModel((AbstractOrbitModel)newValue);
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBIT_MODEL:
				setOrbitModel((AbstractOrbitModel)null);
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ORBIT_MODEL:
				return orbitModel != null;
		}
		return super.eIsSet(featureID);
	}

} //OrbitWorksiteImpl
