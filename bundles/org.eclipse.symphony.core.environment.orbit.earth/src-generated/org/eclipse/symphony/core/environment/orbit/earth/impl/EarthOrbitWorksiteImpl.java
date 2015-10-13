/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocationList;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.impl.OrbitWorksiteImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthOrbitWorksiteImpl#getSky <em>Sky</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.EarthOrbitWorksiteImpl#getEarthLocations <em>Earth Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthOrbitWorksiteImpl extends OrbitWorksiteImpl implements EarthOrbitWorksite {
	/**
	 * The cached value of the '{@link #getSky() <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSky()
	 * @generated
	 * @ordered
	 */
	protected EarthOrbitSky sky;

	/**
	 * The cached value of the '{@link #getEarthLocations() <em>Earth Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarthLocations()
	 * @generated
	 * @ordered
	 */
	protected EarthSurfaceLocationList earthLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitWorksiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.EARTH_ORBIT_WORKSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitSky getSky() {
		return sky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSky(EarthOrbitSky newSky, NotificationChain msgs) {
		EarthOrbitSky oldSky = sky;
		sky = newSky;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY, oldSky, newSky);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSky(EarthOrbitSky newSky) {
		if (newSky != sky) {
			NotificationChain msgs = null;
			if (sky != null)
				msgs = ((InternalEObject)sky).eInverseRemove(this, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE, EarthOrbitSky.class, msgs);
			if (newSky != null)
				msgs = ((InternalEObject)newSky).eInverseAdd(this, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_SKY__EARTH_ORBIT_WORKSITE, EarthOrbitSky.class, msgs);
			msgs = basicSetSky(newSky, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY, newSky, newSky));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocationList getEarthLocations() {
		return earthLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEarthLocations(EarthSurfaceLocationList newEarthLocations, NotificationChain msgs) {
		EarthSurfaceLocationList oldEarthLocations = earthLocations;
		earthLocations = newEarthLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS, oldEarthLocations, newEarthLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarthLocations(EarthSurfaceLocationList newEarthLocations) {
		if (newEarthLocations != earthLocations) {
			NotificationChain msgs = null;
			if (earthLocations != null)
				msgs = ((InternalEObject)earthLocations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS, null, msgs);
			if (newEarthLocations != null)
				msgs = ((InternalEObject)newEarthLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS, null, msgs);
			msgs = basicSetEarthLocations(newEarthLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS, newEarthLocations, newEarthLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY:
				if (sky != null)
					msgs = ((InternalEObject)sky).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY, null, msgs);
				return basicSetSky((EarthOrbitSky)otherEnd, msgs);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY:
				return basicSetSky(null, msgs);
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS:
				return basicSetEarthLocations(null, msgs);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY:
				return getSky();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS:
				return getEarthLocations();
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY:
				setSky((EarthOrbitSky)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS:
				setEarthLocations((EarthSurfaceLocationList)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY:
				setSky((EarthOrbitSky)null);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS:
				setEarthLocations((EarthSurfaceLocationList)null);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__SKY:
				return sky != null;
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_WORKSITE__EARTH_LOCATIONS:
				return earthLocations != null;
		}
		return super.eIsSet(featureID);
	}

} //EarthOrbitWorksiteImpl
