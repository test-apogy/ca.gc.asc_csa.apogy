/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.symphony.examples.satellite.AbstractConstellationRequest;
import org.eclipse.symphony.examples.satellite.ConstellationRequestsList;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Requests List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ConstellationRequestsListImpl#getConstellationRequests <em>Constellation Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationRequestsListImpl extends MinimalEObjectImpl.Container implements ConstellationRequestsList {
	/**
	 * The cached value of the '{@link #getConstellationRequests() <em>Constellation Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstellationRequest> constellationRequests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationRequestsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.CONSTELLATION_REQUESTS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstellationRequest> getConstellationRequests() {
		if (constellationRequests == null) {
			constellationRequests = new EObjectContainmentEList<AbstractConstellationRequest>(AbstractConstellationRequest.class, this, Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS);
		}
		return constellationRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
				return ((InternalEList<?>)getConstellationRequests()).basicRemove(otherEnd, msgs);
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
				return getConstellationRequests();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
				getConstellationRequests().clear();
				getConstellationRequests().addAll((Collection<? extends AbstractConstellationRequest>)newValue);
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
				getConstellationRequests().clear();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
				return constellationRequests != null && !constellationRequests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationRequestsListImpl
