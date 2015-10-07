/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.invocator.impl.AbstractInitializationDataImpl;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;
import org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData;
import org.eclipse.symphony.examples.satellite.SatelliteInitializationData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Constellation Initialization Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl#getSatelliteData <em>Satellite Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl#getGroundStations <em>Ground Stations</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteConstellationInitializationDataImpl#getPendingImageOrders <em>Pending Image Orders</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SatelliteConstellationInitializationDataImpl extends AbstractInitializationDataImpl implements SatelliteConstellationInitializationData {
	/**
	 * The cached value of the '{@link #getSatelliteData() <em>Satellite Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatelliteData()
	 * @generated
	 * @ordered
	 */
	protected EList<SatelliteInitializationData> satelliteData;

	/**
	 * The cached value of the '{@link #getGroundStations() <em>Ground Stations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStations()
	 * @generated
	 * @ordered
	 */
	protected EList<GroundStation> groundStations;

	/**
	 * The cached value of the '{@link #getPendingImageOrders() <em>Pending Image Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingImageOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageOrder> pendingImageOrders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteConstellationInitializationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_CONSTELLATION_INITIALIZATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SatelliteInitializationData> getSatelliteData() {
		if (satelliteData == null) {
			satelliteData = new EObjectContainmentEList<SatelliteInitializationData>(SatelliteInitializationData.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA);
		}
		return satelliteData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroundStation> getGroundStations() {
		if (groundStations == null) {
			groundStations = new EObjectContainmentEList<GroundStation>(GroundStation.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS);
		}
		return groundStations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImageOrder> getPendingImageOrders() {
		if (pendingImageOrders == null) {
			pendingImageOrders = new EObjectContainmentEList<ImageOrder>(ImageOrder.class, this, EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS);
		}
		return pendingImageOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA:
				return ((InternalEList<?>)getSatelliteData()).basicRemove(otherEnd, msgs);
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS:
				return ((InternalEList<?>)getGroundStations()).basicRemove(otherEnd, msgs);
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS:
				return ((InternalEList<?>)getPendingImageOrders()).basicRemove(otherEnd, msgs);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA:
				return getSatelliteData();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS:
				return getGroundStations();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS:
				return getPendingImageOrders();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA:
				getSatelliteData().clear();
				getSatelliteData().addAll((Collection<? extends SatelliteInitializationData>)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS:
				getGroundStations().clear();
				getGroundStations().addAll((Collection<? extends GroundStation>)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS:
				getPendingImageOrders().clear();
				getPendingImageOrders().addAll((Collection<? extends ImageOrder>)newValue);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA:
				getSatelliteData().clear();
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS:
				getGroundStations().clear();
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS:
				getPendingImageOrders().clear();
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__SATELLITE_DATA:
				return satelliteData != null && !satelliteData.isEmpty();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__GROUND_STATIONS:
				return groundStations != null && !groundStations.isEmpty();
			case EMFEcoreExampleSatellitePackage.SATELLITE_CONSTELLATION_INITIALIZATION_DATA__PENDING_IMAGE_ORDERS:
				return pendingImageOrders != null && !pendingImageOrders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SatelliteConstellationInitializationDataImpl
