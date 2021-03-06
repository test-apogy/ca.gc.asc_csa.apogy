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
import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import org.orekit.orbits.CartesianOrbit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.CartesianEarthOrbitImpl#getPvaCoordinates <em>Pva Coordinates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CartesianEarthOrbitImpl extends EarthOrbitImpl implements CartesianEarthOrbit {
	/**
	 * The cached value of the '{@link #getPvaCoordinates() <em>Pva Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPvaCoordinates()
	 * @generated
	 * @ordered
	 */
	protected TimedStampedPVACoordinates pvaCoordinates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianEarthOrbitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.CARTESIAN_EARTH_ORBIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStampedPVACoordinates getPvaCoordinates() {
		return pvaCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPvaCoordinates(TimedStampedPVACoordinates newPvaCoordinates, NotificationChain msgs) {
		TimedStampedPVACoordinates oldPvaCoordinates = pvaCoordinates;
		pvaCoordinates = newPvaCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, oldPvaCoordinates, newPvaCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPvaCoordinates(TimedStampedPVACoordinates newPvaCoordinates) {
		if (newPvaCoordinates != pvaCoordinates) {
			NotificationChain msgs = null;
			if (pvaCoordinates != null)
				msgs = ((InternalEObject)pvaCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, null, msgs);
			if (newPvaCoordinates != null)
				msgs = ((InternalEObject)newPvaCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, null, msgs);
			msgs = basicSetPvaCoordinates(newPvaCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, newPvaCoordinates, newPvaCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianOrbit getOreKitCartesianOrbit() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
				return basicSetPvaCoordinates(null, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
				return getPvaCoordinates();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
				setPvaCoordinates((TimedStampedPVACoordinates)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
				setPvaCoordinates((TimedStampedPVACoordinates)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
				return pvaCoordinates != null;
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
			case ApogyCoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT___GET_ORE_KIT_CARTESIAN_ORBIT:
				return getOreKitCartesianOrbit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CartesianEarthOrbitImpl
