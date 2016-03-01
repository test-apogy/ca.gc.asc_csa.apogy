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

import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.analytical.tle.TLEPropagator;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitPropagator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl#getTle <em>Tle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl#getTleValidityPeriod <em>Tle Validity Period</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl#getValidToDate <em>Valid To Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLEEarthOrbitPropagatorImpl extends EarthOrbitPropagatorImpl implements TLEEarthOrbitPropagator 
{
	

	
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
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLEEarthOrbitPropagatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.TLE_EARTH_ORBIT_PROPAGATOR;
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
	public NotificationChain basicSetTle(TLE newTle, NotificationChain msgs) 
	{
		TLE oldTle = tle;
		tle = newTle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, oldTle, newTle);
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
				msgs = ((InternalEObject)tle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, null, msgs);
			if (newTle != null)
				msgs = ((InternalEObject)newTle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, null, msgs);
			msgs = basicSetTle(newTle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, newTle, newTle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE_VALIDITY_PERIOD, oldTleValidityPeriod, tleValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getValidFromDate() 
	{
		if(getTle() != null && getTle().getEpoch() != null)
		{
			return new Date(getTle().getEpoch().getTime());
		}
			
		return null;
	}

	@Override
	public Date getFromValidDate() 
	{
		return getValidFromDate();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getValidToDate() 
	{
		if(getValidFromDate() != null)
		{
			return new Date(getValidFromDate().getTime() + getTleValidityPeriod());
		}
		
		return null;
	}
	
	@Override
	public Date getToValidDate() 
	{
		return getValidToDate();		
	}
	
	@Override
	public Orbit getInitialOrbit() 
	{
		if(getTle() != null)
		{
			try
			{
				return ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createKeplerianOrbit(this);
			}
			catch(Exception e)
			{				
			}
		}
		
		return null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TLEPropagator getOreKitTLEPropagator() 
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

	@Override
	public Propagator getOreKitPropagator() 
	{
		return getOreKitTLEPropagator();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				return getTle();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE_VALIDITY_PERIOD:
				return getTleValidityPeriod();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return getValidFromDate();
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return getValidToDate();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				setTle((TLE)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE_VALIDITY_PERIOD:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				setTle((TLE)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE_VALIDITY_PERIOD:
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				return tle != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE_VALIDITY_PERIOD:
				return tleValidityPeriod != TLE_VALIDITY_PERIOD_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? getValidFromDate() != null : !VALID_FROM_DATE_EDEFAULT.equals(getValidFromDate());
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return VALID_TO_DATE_EDEFAULT == null ? getValidToDate() != null : !VALID_TO_DATE_EDEFAULT.equals(getValidToDate());
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR:
				return getOreKitTLEPropagator();
		}
		return super.eInvoke(operationID, arguments);
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
} //TLEEarthOrbitPropagatorImpl
