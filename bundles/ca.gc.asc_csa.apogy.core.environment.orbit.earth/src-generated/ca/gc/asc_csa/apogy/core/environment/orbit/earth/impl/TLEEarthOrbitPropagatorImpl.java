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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.analytical.tle.TLEPropagator;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit;
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
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl#getOrbitAtEpoch <em>Orbit At Epoch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLEEarthOrbitPropagatorImpl extends EarthOrbitPropagatorImpl implements TLEEarthOrbitPropagator 
{
	private Adapter tleAdapter;
	
	public static final long TLE_VALIDITY_PERIOD_MS = 24*60*60*1000; 
	
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
	 * The cached value of the '{@link #getOrbitAtEpoch() <em>Orbit At Epoch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitAtEpoch()
	 * @generated
	 * @ordered
	 */
	protected Orbit orbitAtEpoch;

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
	 * @generated_NOT
	 */
	public NotificationChain basicSetTle(TLE newTle, NotificationChain msgs) 
	{
		TLE oldTle = tle;
		tle = newTle;
		if (eNotificationRequired()) 
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, oldTle, newTle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		
		updateTLERelatedAttributes();
		
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTle(TLE newTle) 
	{
		// Unregister from previous TLE if applicable
		if(getTle() != null)
		{
			getTle().eAdapters().remove(getTLEAdapter());
		}
		
		// Updates the reference.
		setTleGen(newTle);
		
		updateTLERelatedAttributes();
		
		// Register to the new TLE if applicable
		if(newTle != null)
		{									
			newTle.eAdapters().add(getTLEAdapter());
		}
		
		setValidFromDate(null);
		setValidToDate(null);		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTleGen(TLE newTle) {
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
	public Orbit getOrbitAtEpoch() {
		return orbitAtEpoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrbitAtEpoch(Orbit newOrbitAtEpoch, NotificationChain msgs) {
		Orbit oldOrbitAtEpoch = orbitAtEpoch;
		orbitAtEpoch = newOrbitAtEpoch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH, oldOrbitAtEpoch, newOrbitAtEpoch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitAtEpoch(Orbit newOrbitAtEpoch) {
		if (newOrbitAtEpoch != orbitAtEpoch) {
			NotificationChain msgs = null;
			if (orbitAtEpoch != null)
				msgs = ((InternalEObject)orbitAtEpoch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH, null, msgs);
			if (newOrbitAtEpoch != null)
				msgs = ((InternalEObject)newOrbitAtEpoch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH, null, msgs);
			msgs = basicSetOrbitAtEpoch(newOrbitAtEpoch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH, newOrbitAtEpoch, newOrbitAtEpoch));
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH:
				return basicSetOrbitAtEpoch(null, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH:
				return getOrbitAtEpoch();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH:
				setOrbitAtEpoch((Orbit)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH:
				setOrbitAtEpoch((Orbit)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.TLE_EARTH_ORBIT_PROPAGATOR__ORBIT_AT_EPOCH:
				return orbitAtEpoch != null;
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
		
	private void updateTLERelatedAttributes()
	{
		if(getTle() != null)
		{
			Date newEpoch = getTle().getEpoch();
			
			if(newEpoch != null)
			{
				
				// TODO : Perform these in a transaction friendly way.
				setValidFromDate(new Date(newEpoch.getTime()));
				setValidToDate(new Date(newEpoch.getTime() + TLE_VALIDITY_PERIOD_MS));
				
				try 
				{
					KeplerianEarthOrbit keo = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createKeplerianOrbit(TLEEarthOrbitPropagatorImpl.this);
					setInitialOrbit(keo);
				} 
				catch (Exception e) 	
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return;
			}
		}
		
		// TODO : Perform these in a transaction friendly way.
		setValidFromDate(null);
		setValidToDate(null);
		setInitialOrbit(null);
		
	}
	
	protected Adapter getTLEAdapter()
	{
		if(tleAdapter == null)
		{
			tleAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof TLE)
					{
						updateTLERelatedAttributes();												
					}
				}
			};
		}
		
		return tleAdapter;
	}
} //TLEEarthOrbitPropagatorImpl
