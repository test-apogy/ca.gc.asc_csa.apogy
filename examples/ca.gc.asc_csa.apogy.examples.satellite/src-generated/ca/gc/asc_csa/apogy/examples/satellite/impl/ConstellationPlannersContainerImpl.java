/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Planners Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationPlannersContainerImpl#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.ConstellationPlannersContainerImpl#getConstellationPlanners <em>Constellation Planners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationPlannersContainerImpl extends MinimalEObjectImpl.Container implements ConstellationPlannersContainer {
	/**
	 * The cached value of the '{@link #getConstellationPlanners() <em>Constellation Planners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationPlanners()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConstellationPlanner> constellationPlanners;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationPlannersContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.CONSTELLATION_PLANNERS_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState getConstellationState() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE) return null;
		return (ConstellationState)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState basicGetConstellationState() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE) return null;
		return (ConstellationState)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationState(ConstellationState newConstellationState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationState, ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationState(ConstellationState newConstellationState) {
		if (newConstellationState != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE && newConstellationState != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationState != null)
				msgs = ((InternalEObject)newConstellationState).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNERS_CONTAINER, ConstellationState.class, msgs);
			msgs = basicSetConstellationState(newConstellationState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE, newConstellationState, newConstellationState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConstellationPlanner> getConstellationPlanners() {
		if (constellationPlanners == null) {
			constellationPlanners = new EObjectContainmentWithInverseEList<AbstractConstellationPlanner>(AbstractConstellationPlanner.class, this, ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER);
		}
		return constellationPlanners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationState((ConstellationState)otherEnd, msgs);
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConstellationPlanners()).basicAdd(otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				return basicSetConstellationState(null, msgs);
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS:
				return ((InternalEList<?>)getConstellationPlanners()).basicRemove(otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNERS_CONTAINER, ConstellationState.class, msgs);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				if (resolve) return getConstellationState();
				return basicGetConstellationState();
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS:
				return getConstellationPlanners();
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				setConstellationState((ConstellationState)newValue);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS:
				getConstellationPlanners().clear();
				getConstellationPlanners().addAll((Collection<? extends AbstractConstellationPlanner>)newValue);
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				setConstellationState((ConstellationState)null);
				return;
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS:
				getConstellationPlanners().clear();
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
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_STATE:
				return basicGetConstellationState() != null;
			case ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS:
				return constellationPlanners != null && !constellationPlanners.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstellationPlannersContainerImpl
