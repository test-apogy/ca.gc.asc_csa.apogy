/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.orekit.propagation.analytical.tle.TLEPropagator;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLE Earth Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitModelImpl#getTle <em>Tle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitModelImpl#getTleValidityPeriod <em>Tle Validity Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLEEarthOrbitModelImpl extends EarthOrbitModelImpl implements TLEEarthOrbitModel {
	/**
	 * The cached value of the '{@link #getTle() <em>Tle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTle()
	 * @generated
	 * @ordered
	 */
	protected TLE tle;

	/**
	 * The default value of the '{@link #getTleValidityPeriod() <em>Tle Validity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTleValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final long TLE_VALIDITY_PERIOD_EDEFAULT = 86400000L;

	/**
	 * The cached value of the '{@link #getTleValidityPeriod() <em>Tle Validity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTleValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected long tleValidityPeriod = TLE_VALIDITY_PERIOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLEEarthOrbitModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.TLE_EARTH_ORBIT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLE getTle() {
		return tle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTle(TLE newTle, NotificationChain msgs) {
		TLE oldTle = tle;
		tle = newTle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE, oldTle, newTle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTle(TLE newTle) {
		if (newTle != tle) {
			NotificationChain msgs = null;
			if (tle != null)
				msgs = ((InternalEObject)tle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE, null, msgs);
			if (newTle != null)
				msgs = ((InternalEObject)newTle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE, null, msgs);
			msgs = basicSetTle(newTle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE, newTle, newTle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTleValidityPeriod() {
		return tleValidityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTleValidityPeriod(long newTleValidityPeriod) {
		long oldTleValidityPeriod = tleValidityPeriod;
		tleValidityPeriod = newTleValidityPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE_VALIDITY_PERIOD, oldTleValidityPeriod, tleValidityPeriod));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TLEPropagator getOreKitPropagator() 
	{
		try 
		{
			return org.orekit.propagation.analytical.tle.TLEPropagator.selectExtrapolator(getTle().getOreKitTLE());
		} 
		catch (Exception e) 
		{	
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE:
				return basicSetTle(null, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE:
				return getTle();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE_VALIDITY_PERIOD:
				return getTleValidityPeriod();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE:
				setTle((TLE)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE_VALIDITY_PERIOD:
				setTleValidityPeriod((Long)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE:
				setTle((TLE)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE_VALIDITY_PERIOD:
				setTleValidityPeriod(TLE_VALIDITY_PERIOD_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE:
				return tle != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_MODEL__TLE_VALIDITY_PERIOD:
				return tleValidityPeriod != TLE_VALIDITY_PERIOD_EDEFAULT;
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
		result.append(" (tleValidityPeriod: ");
		result.append(tleValidityPeriod);
		result.append(')');
		return result.toString();
	}

	@Override
	public Date getFromValidDate() 
	{		
		if(getTle() != null && getTle().getEpoch() != null)
		{
			return new Date(getTle().getEpoch().getTime());
		}
			
		return null;
	}
	
	@Override
	public Date getToValidDate() 
	{
		if(getFromValidDate() != null)
		{
			return new Date(getFromValidDate().getTime() + getTleValidityPeriod());
		}
		
		return null;
	}		
} //TLEEarthOrbitModelImpl
