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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Activator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Based TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.URLBasedTLEEarthOrbitPropagatorImpl#getTleURL <em>Tle URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLBasedTLEEarthOrbitPropagatorImpl extends TLEEarthOrbitModelImpl implements URLBasedTLEEarthOrbitPropagator 
{	
	/**
	 * The default value of the '{@link #getTleURL() <em>Tle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTleURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTleURL() <em>Tle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTleURL()
	 * @generated
	 * @ordered
	 */
	protected String tleURL = TLE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLBasedTLEEarthOrbitPropagatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTleURL() {
		return tleURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTleURL(String newTleURL) 
	{
		setTleURLGen(newTleURL);		
		updateTLE();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTleURLGen(String newTleURL) {
		String oldTleURL = tleURL;
		tleURL = newTleURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL, oldTleURL, tleURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL:
				return getTleURL();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL:
				setTleURL((String)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL:
				setTleURL(TLE_URL_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL:
				return TLE_URL_EDEFAULT == null ? tleURL != null : !TLE_URL_EDEFAULT.equals(tleURL);
		}
		return super.eIsSet(featureID);
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
		result.append(" (tleURL: ");
		result.append(tleURL);
		result.append(')');
		return result.toString();
	}

	private void updateTLE()
	{
		try
		{
			TLE newTLE = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.loadTLE(getTleURL());
			setTle(newTLE);
			Logger.INSTANCE.log(Activator.ID, this, "Sucessfully loaded Two-Lines Element from <" + getTleURL() + ">.", EventSeverity.OK);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to load Two-Lines Element from <" + getTleURL() + ">!", EventSeverity.ERROR, t);
		}
	}
} //URLBasedTLEEarthOrbitPropagatorImpl
