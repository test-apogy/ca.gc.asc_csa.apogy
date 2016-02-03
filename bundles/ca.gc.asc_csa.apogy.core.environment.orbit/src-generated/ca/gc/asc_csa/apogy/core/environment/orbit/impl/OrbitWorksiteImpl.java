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
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitWorksiteImpl#getActiveOrbitModel <em>Active Orbit Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OrbitWorksiteImpl extends WorksiteImpl implements OrbitWorksite {
	/**
	 * The cached value of the '{@link #getActiveOrbitModel() <em>Active Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected AbstractOrbitModel activeOrbitModel;

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
	public AbstractOrbitModel getActiveOrbitModel() {
		if (activeOrbitModel != null && activeOrbitModel.eIsProxy()) {
			InternalEObject oldActiveOrbitModel = (InternalEObject)activeOrbitModel;
			activeOrbitModel = (AbstractOrbitModel)eResolveProxy(oldActiveOrbitModel);
			if (activeOrbitModel != oldActiveOrbitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL, oldActiveOrbitModel, activeOrbitModel));
			}
		}
		return activeOrbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOrbitModel basicGetActiveOrbitModel() {
		return activeOrbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveOrbitModel(AbstractOrbitModel newActiveOrbitModel) {
		AbstractOrbitModel oldActiveOrbitModel = activeOrbitModel;
		activeOrbitModel = newActiveOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL, oldActiveOrbitModel, activeOrbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				if (resolve) return getActiveOrbitModel();
				return basicGetActiveOrbitModel();
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				setActiveOrbitModel((AbstractOrbitModel)newValue);
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				setActiveOrbitModel((AbstractOrbitModel)null);
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
			case ApogyCoreEnvironmentOrbitPackage.ORBIT_WORKSITE__ACTIVE_ORBIT_MODEL:
				return activeOrbitModel != null;
		}
		return super.eIsSet(featureID);
	}

} //OrbitWorksiteImpl
