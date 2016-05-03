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

import com.google.common.base.Objects;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Requests List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationRequestsListImpl#getConstellationRequests <em>Constellation Requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationRequestsListImpl extends MinimalEObjectImpl.Container implements ConstellationRequestsList {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
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
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_REQUESTS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsListsContainer getConstellationRequestsListsContainer() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER) return null;
		return (ConstellationRequestsListsContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsListsContainer basicGetConstellationRequestsListsContainer() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER) return null;
		return (ConstellationRequestsListsContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationRequestsListsContainer(ConstellationRequestsListsContainer newConstellationRequestsListsContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationRequestsListsContainer, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequestsListsContainer(ConstellationRequestsListsContainer newConstellationRequestsListsContainer) {
		if (newConstellationRequestsListsContainer != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER && newConstellationRequestsListsContainer != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationRequestsListsContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationRequestsListsContainer != null)
				msgs = ((InternalEObject)newConstellationRequestsListsContainer).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LISTS_CONTAINER__CONSTELLATION_REQUESTS_LISTS, ConstellationRequestsListsContainer.class, msgs);
			msgs = basicSetConstellationRequestsListsContainer(newConstellationRequestsListsContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER, newConstellationRequestsListsContainer, newConstellationRequestsListsContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState getConstellationState() {
		ConstellationRequestsListsContainer _constellationRequestsListsContainer = this.getConstellationRequestsListsContainer();
		boolean _equals = Objects.equal(_constellationRequestsListsContainer, null);
		if (_equals) {
			return null;
		}
		else {
			ConstellationRequestsListsContainer _constellationRequestsListsContainer_1 = this.getConstellationRequestsListsContainer();
			return _constellationRequestsListsContainer_1.getConstellationState();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstellationRequest> getConstellationRequests() {
		if (constellationRequests == null) {
			constellationRequests = new EObjectContainmentEList<AbstractConstellationRequest>(AbstractConstellationRequest.class, this, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS);
		}
		return constellationRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationRequestsListsContainer((ConstellationRequestsListsContainer)otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				return basicSetConstellationRequestsListsContainer(null, msgs);
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LISTS_CONTAINER__CONSTELLATION_REQUESTS_LISTS, ConstellationRequestsListsContainer.class, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__NAME:
				return getName();
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION:
				return getDescription();
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				if (resolve) return getConstellationRequestsListsContainer();
				return basicGetConstellationRequestsListsContainer();
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_STATE:
				return getConstellationState();
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__NAME:
				setName((String)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				setConstellationRequestsListsContainer((ConstellationRequestsListsContainer)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				setConstellationRequestsListsContainer((ConstellationRequestsListsContainer)null);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
				return basicGetConstellationRequestsListsContainer() != null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_STATE:
				return getConstellationState() != null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__CONSTELLATION_REQUESTS:
				return constellationRequests != null && !constellationRequests.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyExamplesSatellitePackage.CONSTELLATION_REQUESTS_LIST__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ConstellationRequestsListImpl
