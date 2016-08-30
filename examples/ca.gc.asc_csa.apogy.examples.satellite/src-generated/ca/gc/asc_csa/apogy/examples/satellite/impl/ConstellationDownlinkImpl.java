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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationDownlinkItem;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlink;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Downlink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinkImpl#getConstellationDownlinksList <em>Constellation Downlinks List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationDownlinkImpl#getDownlinkItems <em>Downlink Items</em>}</li>
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
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_DOWNLINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDownlinksList getConstellationDownlinksList() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST) return null;
		return (ConstellationDownlinksList)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDownlinksList basicGetConstellationDownlinksList() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST) return null;
		return (ConstellationDownlinksList)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationDownlinksList(ConstellationDownlinksList newConstellationDownlinksList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationDownlinksList, ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationDownlinksList(ConstellationDownlinksList newConstellationDownlinksList) {
		if (newConstellationDownlinksList != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST && newConstellationDownlinksList != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationDownlinksList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationDownlinksList != null)
				msgs = ((InternalEObject)newConstellationDownlinksList).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINKS_LIST__DOWNLINKS, ConstellationDownlinksList.class, msgs);
			msgs = basicSetConstellationDownlinksList(newConstellationDownlinksList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST, newConstellationDownlinksList, newConstellationDownlinksList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstellationDownlinkItem> getDownlinkItems() {
		if (downlinkItems == null) {
			downlinkItems = new EObjectContainmentEList<AbstractConstellationDownlinkItem>(AbstractConstellationDownlinkItem.class, this, ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS);
		}
		return downlinkItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationDownlinksList((ConstellationDownlinksList)otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				return basicSetConstellationDownlinksList(null, msgs);
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINKS_LIST__DOWNLINKS, ConstellationDownlinksList.class, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				if (resolve) return getConstellationDownlinksList();
				return basicGetConstellationDownlinksList();
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				setConstellationDownlinksList((ConstellationDownlinksList)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				setConstellationDownlinksList((ConstellationDownlinksList)null);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__CONSTELLATION_DOWNLINKS_LIST:
				return basicGetConstellationDownlinksList() != null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_DOWNLINK__DOWNLINK_ITEMS:
				return downlinkItems != null && !downlinkItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationDownlinkImpl
