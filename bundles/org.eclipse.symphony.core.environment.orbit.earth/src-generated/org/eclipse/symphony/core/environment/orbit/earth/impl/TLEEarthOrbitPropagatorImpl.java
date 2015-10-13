/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.TLE;
import org.eclipse.symphony.core.environment.orbit.earth.TLEEarthOrbitPropagator;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.analytical.tle.TLEPropagator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.TLEEarthOrbitPropagatorImpl#getTle <em>Tle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TLEEarthOrbitPropagatorImpl extends EarthOrbitPropagatorImpl implements TLEEarthOrbitPropagator 
{
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
		return SymphonyEarthOrbitEnvironmentPackage.Literals.TLE_EARTH_ORBIT_PROPAGATOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, oldTle, newTle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTle(TLE newTle) 
	{
		setTleGen(newTle);
		
		if(newTle != null)
		{
			setValidFromDate(new Date(newTle.getEpoch().getTime()));
			setValidToDate(new Date(newTle.getEpoch().getTime() + TLE_VALIDITY_PERIOD_MS));
		}
		else
		{
			setValidFromDate(null);
			setValidToDate(null);
		}
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
				msgs = ((InternalEObject)tle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, null, msgs);
			if (newTle != null)
				msgs = ((InternalEObject)newTle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, null, msgs);
			msgs = basicSetTle(newTle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE, newTle, newTle));
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
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
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
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				return getTle();
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
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				setTle((TLE)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				setTle((TLE)null);
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
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				return tle != null;
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
			case SymphonyEarthOrbitEnvironmentPackage.TLE_EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_TLE_PROPAGATOR:
				return getOreKitTLEPropagator();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TLEEarthOrbitPropagatorImpl
