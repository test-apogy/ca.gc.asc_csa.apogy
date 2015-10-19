/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.invocator.impl.AbstractInitializationDataImpl;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteInitializationData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Initialization Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteInitializationDataImpl#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteInitializationDataImpl#getOrbitModel <em>Orbit Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteInitializationDataImpl extends AbstractInitializationDataImpl implements SatelliteInitializationData {
	/**
	 * The cached value of the '{@link #getSatellite() <em>Satellite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellite()
	 * @generated
	 * @ordered
	 */
	protected Satellite satellite;

	/**
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected OrbitModel orbitModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteInitializationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_INITIALIZATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite getSatellite() {
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatellite(Satellite newSatellite, NotificationChain msgs) {
		Satellite oldSatellite = satellite;
		satellite = newSatellite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE, oldSatellite, newSatellite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellite(Satellite newSatellite) {
		if (newSatellite != satellite) {
			NotificationChain msgs = null;
			if (satellite != null)
				msgs = ((InternalEObject)satellite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE, null, msgs);
			if (newSatellite != null)
				msgs = ((InternalEObject)newSatellite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE, null, msgs);
			msgs = basicSetSatellite(newSatellite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE, newSatellite, newSatellite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel getOrbitModel() {
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrbitModel(OrbitModel newOrbitModel, NotificationChain msgs) {
		OrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL, oldOrbitModel, newOrbitModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModel(OrbitModel newOrbitModel) {
		if (newOrbitModel != orbitModel) {
			NotificationChain msgs = null;
			if (orbitModel != null)
				msgs = ((InternalEObject)orbitModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL, null, msgs);
			if (newOrbitModel != null)
				msgs = ((InternalEObject)newOrbitModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL, null, msgs);
			msgs = basicSetOrbitModel(newOrbitModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL, newOrbitModel, newOrbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE:
				return basicSetSatellite(null, msgs);
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL:
				return basicSetOrbitModel(null, msgs);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE:
				return getSatellite();
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL:
				return getOrbitModel();
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE:
				setSatellite((Satellite)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE:
				setSatellite((Satellite)null);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__SATELLITE:
				return satellite != null;
			case EMFEcoreExampleSatellitePackage.SATELLITE_INITIALIZATION_DATA__ORBIT_MODEL:
				return orbitModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SatelliteInitializationDataImpl
