package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl;
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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfigurationList;
import ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.EarthViewConfigurationListImpl#getEarthViewConfigurations <em>Earth View Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthViewConfigurationListImpl extends AbstractToolsListContainerImpl implements EarthViewConfigurationList {
	/**
	 * The cached value of the '{@link #getEarthViewConfigurations() <em>Earth View Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarthViewConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<EarthViewConfiguration> earthViewConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthViewConfigurationListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.EARTH_VIEW_CONFIGURATION_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EarthViewConfiguration> getEarthViewConfigurations() {
		if (earthViewConfigurations == null) {
			earthViewConfigurations = new EObjectContainmentEList<EarthViewConfiguration>(EarthViewConfiguration.class, this, ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS);
		}
		return earthViewConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				return ((InternalEList<?>)getEarthViewConfigurations()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				return getEarthViewConfigurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				getEarthViewConfigurations().clear();
				getEarthViewConfigurations().addAll((Collection<? extends EarthViewConfiguration>)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				getEarthViewConfigurations().clear();
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
			case ApogyCoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS:
				return earthViewConfigurations != null && !earthViewConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EarthViewConfigurationListImpl
