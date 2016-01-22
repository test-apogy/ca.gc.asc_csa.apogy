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

import org.eclipse.symphony.examples.satellite.AbstractConstellationDownlinkItem;
import org.eclipse.symphony.examples.satellite.ConstellationDownlink;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Downlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ConstellationDownlinkImpl#getDownlinkItems <em>Downlink Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationDownlinkImpl extends MinimalEObjectImpl.Container implements ConstellationDownlink {
	/**
	 * The cached value of the '{@link #getDownlinkItems() <em>Downlink Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownlinkItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstellationDownlinkItem> downlinkItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationDownlinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.CONSTELLATION_DOWNLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstellationDownlinkItem> getDownlinkItems() {
		if (downlinkItems == null) {
			downlinkItems = new EObjectContainmentEList<AbstractConstellationDownlinkItem>(AbstractConstellationDownlinkItem.class, this, Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS);
		}
		return downlinkItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
				return ((InternalEList<?>)getDownlinkItems()).basicRemove(otherEnd, msgs);
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
				return getDownlinkItems();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
				getDownlinkItems().clear();
				getDownlinkItems().addAll((Collection<? extends AbstractConstellationDownlinkItem>)newValue);
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
				getDownlinkItems().clear();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
				return downlinkItems != null && !downlinkItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationDownlinkImpl
