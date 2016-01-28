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

import org.eclipse.symphony.examples.satellite.ConstellationCommandPlan;
import org.eclipse.symphony.examples.satellite.ConstellationCommandPlanItem;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Command Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ConstellationCommandPlanImpl#getConstellationCommandPlanItems <em>Constellation Command Plan Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationCommandPlanImpl extends MinimalEObjectImpl.Container implements ConstellationCommandPlan {
	/**
	 * The cached value of the '{@link #getConstellationCommandPlanItems() <em>Constellation Command Plan Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationCommandPlanItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstellationCommandPlanItem> constellationCommandPlanItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationCommandPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.CONSTELLATION_COMMAND_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstellationCommandPlanItem> getConstellationCommandPlanItems() {
		if (constellationCommandPlanItems == null) {
			constellationCommandPlanItems = new EObjectContainmentEList<ConstellationCommandPlanItem>(ConstellationCommandPlanItem.class, this, Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS);
		}
		return constellationCommandPlanItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
				return ((InternalEList<?>)getConstellationCommandPlanItems()).basicRemove(otherEnd, msgs);
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
				return getConstellationCommandPlanItems();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
				getConstellationCommandPlanItems().clear();
				getConstellationCommandPlanItems().addAll((Collection<? extends ConstellationCommandPlanItem>)newValue);
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
				getConstellationCommandPlanItems().clear();
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
			case Symphony__ExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
				return constellationCommandPlanItems != null && !constellationCommandPlanItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationCommandPlanImpl
