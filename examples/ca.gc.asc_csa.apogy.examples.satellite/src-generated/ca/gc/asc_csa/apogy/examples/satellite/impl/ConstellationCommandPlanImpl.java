package ca.gc.asc_csa.apogy.examples.satellite.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlanItem;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Command Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationCommandPlanImpl#getConstellationCommandPlanItems <em>Constellation Command Plan Items</em>}</li>
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
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_COMMAND_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstellationCommandPlanItem> getConstellationCommandPlanItems() {
		if (constellationCommandPlanItems == null) {
			constellationCommandPlanItems = new EObjectContainmentEList<ConstellationCommandPlanItem>(ConstellationCommandPlanItem.class, this, ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_COMMAND_PLAN__CONSTELLATION_COMMAND_PLAN_ITEMS:
				return constellationCommandPlanItems != null && !constellationCommandPlanItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationCommandPlanImpl
