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
import org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates;
import org.eclipse.symphony.core.environment.orbit.earth.CartesianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;
import org.orekit.orbits.CartesianOrbit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cartesian Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.CartesianEarthOrbitImpl#getPvaCoordinates <em>Pva Coordinates</em>}</li>
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
		return Symphony__CoreEnvironmentOrbitEarthPackage.Literals.CARTESIAN_EARTH_ORBIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, oldPvaCoordinates, newPvaCoordinates);
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
				msgs = ((InternalEObject)pvaCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, null, msgs);
			if (newPvaCoordinates != null)
				msgs = ((InternalEObject)newPvaCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, null, msgs);
			msgs = basicSetPvaCoordinates(newPvaCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES, newPvaCoordinates, newPvaCoordinates));
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT__PVA_COORDINATES:
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.CARTESIAN_EARTH_ORBIT___GET_ORE_KIT_CARTESIAN_ORBIT:
				return getOreKitCartesianOrbit();
		}
		return super.eInvoke(operationID, arguments);
	}

} //CartesianEarthOrbitImpl
