package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.impl.OrbitImpl;
import org.orekit.orbits.Orbit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitImpl#getInitialOrbitBasedEarthOrbitModel <em>Initial Orbit Based Earth Orbit Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EarthOrbitImpl extends OrbitImpl implements EarthOrbit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.EARTH_ORBIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialOrbitBasedEarthOrbitModel getInitialOrbitBasedEarthOrbitModel() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL) return null;
		return (InitialOrbitBasedEarthOrbitModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialOrbitBasedEarthOrbitModel basicGetInitialOrbitBasedEarthOrbitModel() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL) return null;
		return (InitialOrbitBasedEarthOrbitModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialOrbitBasedEarthOrbitModel(InitialOrbitBasedEarthOrbitModel newInitialOrbitBasedEarthOrbitModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitialOrbitBasedEarthOrbitModel, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialOrbitBasedEarthOrbitModel(InitialOrbitBasedEarthOrbitModel newInitialOrbitBasedEarthOrbitModel) {
		if (newInitialOrbitBasedEarthOrbitModel != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL && newInitialOrbitBasedEarthOrbitModel != null)) {
			if (EcoreUtil.isAncestor(this, newInitialOrbitBasedEarthOrbitModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitialOrbitBasedEarthOrbitModel != null)
				msgs = ((InternalEObject)newInitialOrbitBasedEarthOrbitModel).eInverseAdd(this, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT, InitialOrbitBasedEarthOrbitModel.class, msgs);
			msgs = basicSetInitialOrbitBasedEarthOrbitModel(newInitialOrbitBasedEarthOrbitModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, newInitialOrbitBasedEarthOrbitModel, newInitialOrbitBasedEarthOrbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getOreKitOrbit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitialOrbitBasedEarthOrbitModel((InitialOrbitBasedEarthOrbitModel)otherEnd, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				return basicSetInitialOrbitBasedEarthOrbitModel(null, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT, InitialOrbitBasedEarthOrbitModel.class, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				if (resolve) return getInitialOrbitBasedEarthOrbitModel();
				return basicGetInitialOrbitBasedEarthOrbitModel();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				setInitialOrbitBasedEarthOrbitModel((InitialOrbitBasedEarthOrbitModel)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				setInitialOrbitBasedEarthOrbitModel((InitialOrbitBasedEarthOrbitModel)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				return basicGetInitialOrbitBasedEarthOrbitModel() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT___GET_ORE_KIT_ORBIT:
				return getOreKitOrbit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EarthOrbitImpl
