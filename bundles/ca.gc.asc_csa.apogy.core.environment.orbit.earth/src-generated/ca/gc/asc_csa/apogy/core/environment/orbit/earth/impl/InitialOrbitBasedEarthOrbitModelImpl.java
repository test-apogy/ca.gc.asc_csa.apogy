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
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial Orbit Based Earth Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.InitialOrbitBasedEarthOrbitModelImpl#getInitalOrbit <em>Inital Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.InitialOrbitBasedEarthOrbitModelImpl#getPropagator <em>Propagator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialOrbitBasedEarthOrbitModelImpl extends EarthOrbitModelImpl implements InitialOrbitBasedEarthOrbitModel {
	/**
	 * The cached value of the '{@link #getInitalOrbit() <em>Inital Orbit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitalOrbit()
	 * @generated
	 * @ordered
	 */
	protected EarthOrbit initalOrbit;

	/**
	 * The cached value of the '{@link #getPropagator() <em>Propagator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagator()
	 * @generated
	 * @ordered
	 */
	protected EarthOrbitPropagator propagator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InitialOrbitBasedEarthOrbitModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbit getInitalOrbit() {
		return initalOrbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitalOrbit(EarthOrbit newInitalOrbit, NotificationChain msgs) {
		EarthOrbit oldInitalOrbit = initalOrbit;
		initalOrbit = newInitalOrbit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT, oldInitalOrbit, newInitalOrbit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitalOrbit(EarthOrbit newInitalOrbit) {
		if (newInitalOrbit != initalOrbit) {
			NotificationChain msgs = null;
			if (initalOrbit != null)
				msgs = ((InternalEObject)initalOrbit).eInverseRemove(this, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, EarthOrbit.class, msgs);
			if (newInitalOrbit != null)
				msgs = ((InternalEObject)newInitalOrbit).eInverseAdd(this, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, EarthOrbit.class, msgs);
			msgs = basicSetInitalOrbit(newInitalOrbit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT, newInitalOrbit, newInitalOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitPropagator getPropagator() {
		return propagator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropagator(EarthOrbitPropagator newPropagator, NotificationChain msgs) {
		EarthOrbitPropagator oldPropagator = propagator;
		propagator = newPropagator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR, oldPropagator, newPropagator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagator(EarthOrbitPropagator newPropagator) {
		if (newPropagator != propagator) {
			NotificationChain msgs = null;
			if (propagator != null)
				msgs = ((InternalEObject)propagator).eInverseRemove(this, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, EarthOrbitPropagator.class, msgs);
			if (newPropagator != null)
				msgs = ((InternalEObject)newPropagator).eInverseAdd(this, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, EarthOrbitPropagator.class, msgs);
			msgs = basicSetPropagator(newPropagator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR, newPropagator, newPropagator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT:
				if (initalOrbit != null)
					msgs = ((InternalEObject)initalOrbit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT, null, msgs);
				return basicSetInitalOrbit((EarthOrbit)otherEnd, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR:
				if (propagator != null)
					msgs = ((InternalEObject)propagator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR, null, msgs);
				return basicSetPropagator((EarthOrbitPropagator)otherEnd, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT:
				return basicSetInitalOrbit(null, msgs);
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR:
				return basicSetPropagator(null, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT:
				return getInitalOrbit();
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR:
				return getPropagator();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT:
				setInitalOrbit((EarthOrbit)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR:
				setPropagator((EarthOrbitPropagator)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT:
				setInitalOrbit((EarthOrbit)null);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR:
				setPropagator((EarthOrbitPropagator)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__INITAL_ORBIT:
				return initalOrbit != null;
			case ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR:
				return propagator != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public org.orekit.propagation.Propagator getOreKitPropagator() 
	{
		if(getPropagator() != null)
		{
			return getPropagator().getOreKitPropagator();
		}
		else
		{
			return null;
		}		
	}
	
	@Override
	public List<VisibilityPass> getTargetPasses(EarthSurfaceLocation earthSurfaceLocation, Date startDate, Date endDate,
			ElevationMask elevationMask) throws Exception 
	{	
		return getPropagator().getTargetPasses(earthSurfaceLocation, startDate, endDate, elevationMask);				
	}
	
	@Override
	public List<VisibilityPass> getGroundStationPasses(GroundStation groundStation, Date startDate, Date endDate)
			throws Exception 
	{	
		return getPropagator().getGroundStationPasses(groundStation, startDate, endDate);
	}
	
	@Override
	public List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval)
			throws Exception 
	{	
		return getPropagator().getSpacecraftStates(startDate, endDate, timeInterval);
	}

	@Override
	public Date getFromValidDate() 
	{
		if(getPropagator() != null)
		{
			return getPropagator().getFromValidDate();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Date getToValidDate() 
	{
		if(getPropagator() != null)
		{
			return getPropagator().getToValidDate();
		}
		else
		{
			return null;
		}
	}

	@Override
	public SpacecraftState propagate(Date targetDate) throws Exception 
	{
		if(getPropagator() != null)
		{
			return getPropagator().propagate(targetDate);
		}
		else
		{
			return null;
		}
	}

	@Override
	public boolean isDateInValidRange(Date date) 
	{
		return ApogyCoreEnvironmentOrbitFacade.INSTANCE.isDateInValidRange(getFromValidDate(), getToValidDate(), date);
	}
} //InitialOrbitBasedEarthOrbitModelImpl
