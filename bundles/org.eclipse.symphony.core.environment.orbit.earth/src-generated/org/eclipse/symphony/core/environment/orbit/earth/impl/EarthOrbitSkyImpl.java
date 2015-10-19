/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.environment.Earth;
import org.eclipse.symphony.core.environment.Moon;
import org.eclipse.symphony.core.environment.impl.SkyImpl;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit Sky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthOrbitSkyImpl#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthOrbitSkyImpl#getMoon <em>Moon</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthOrbitSkyImpl#getEarth <em>Earth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthOrbitSkyImpl extends SkyImpl implements EarthOrbitSky {
	/**
	 * The cached value of the '{@link #getMoon() <em>Moon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoon()
	 * @generated
	 * @ordered
	 */
	protected Moon moon;

	/**
	 * The cached value of the '{@link #getEarth() <em>Earth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarth()
	 * @generated
	 * @ordered
	 */
	protected Earth earth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitSkyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.EARTH_ORBIT_SKY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitWorksite getEarthOrbitWorksite() {
		if (eContainerFeatureID() != SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE) return null;
		return (EarthOrbitWorksite)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitWorksite basicGetEarthOrbitWorksite() {
		if (eContainerFeatureID() != SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE) return null;
		return (EarthOrbitWorksite)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEarthOrbitWorksite(EarthOrbitWorksite newEarthOrbitWorksite, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEarthOrbitWorksite, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarthOrbitWorksite(EarthOrbitWorksite newEarthOrbitWorksite) {
		if (newEarthOrbitWorksite != eInternalContainer() || (eContainerFeatureID() != SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE && newEarthOrbitWorksite != null)) {
			if (EcoreUtil.isAncestor(this, newEarthOrbitWorksite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEarthOrbitWorksite != null)
				msgs = ((InternalEObject)newEarthOrbitWorksite).eInverseAdd(this, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY, EarthOrbitWorksite.class, msgs);
			msgs = basicSetEarthOrbitWorksite(newEarthOrbitWorksite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE, newEarthOrbitWorksite, newEarthOrbitWorksite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moon getMoon() {
		if (moon != null && moon.eIsProxy()) {
			InternalEObject oldMoon = (InternalEObject)moon;
			moon = (Moon)eResolveProxy(oldMoon);
			if (moon != oldMoon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__MOON, oldMoon, moon));
			}
		}
		return moon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moon basicGetMoon() {
		return moon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earth getEarth() {
		if (earth != null && earth.eIsProxy()) {
			InternalEObject oldEarth = (InternalEObject)earth;
			earth = (Earth)eResolveProxy(oldEarth);
			if (earth != oldEarth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH, oldEarth, earth));
			}
		}
		return earth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earth basicGetEarth() {
		return earth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMoonAngularDiameter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEarthAngularDiameter() {
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEarthOrbitWorksite((EarthOrbitWorksite)otherEnd, msgs);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				return basicSetEarthOrbitWorksite(null, msgs);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				return eInternalContainer().eInverseRemove(this, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY, EarthOrbitWorksite.class, msgs);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				if (resolve) return getEarthOrbitWorksite();
				return basicGetEarthOrbitWorksite();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__MOON:
				if (resolve) return getMoon();
				return basicGetMoon();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH:
				if (resolve) return getEarth();
				return basicGetEarth();
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				setEarthOrbitWorksite((EarthOrbitWorksite)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				setEarthOrbitWorksite((EarthOrbitWorksite)null);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE:
				return basicGetEarthOrbitWorksite() != null;
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__MOON:
				return moon != null;
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH:
				return earth != null;
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY___GET_MOON_ANGULAR_DIAMETER:
				return getMoonAngularDiameter();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY___GET_EARTH_ANGULAR_DIAMETER:
				return getEarthAngularDiameter();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EarthOrbitSkyImpl
