package ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.UniversalConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universal Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.UniversalConstraintImpl#getAngular0CurrentState <em>Angular0 Current State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.UniversalConstraintImpl#getAngular1CurrentState <em>Angular1 Current State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversalConstraintImpl extends AbstractConstraintImpl implements UniversalConstraint {
	/**
	 * The cached value of the '{@link #getAngular0CurrentState() <em>Angular0 Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngular0CurrentState()
	 * @generated
	 * @ordered
	 */
	protected ConstraintState angular0CurrentState;

	/**
	 * The cached value of the '{@link #getAngular1CurrentState() <em>Angular1 Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngular1CurrentState()
	 * @generated
	 * @ordered
	 */
	protected ConstraintState angular1CurrentState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversalConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.UNIVERSAL_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintState getAngular0CurrentState() {
		return angular0CurrentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngular0CurrentState(ConstraintState newAngular0CurrentState, NotificationChain msgs) {
		ConstraintState oldAngular0CurrentState = angular0CurrentState;
		angular0CurrentState = newAngular0CurrentState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE, oldAngular0CurrentState, newAngular0CurrentState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngular0CurrentState(ConstraintState newAngular0CurrentState) {
		if (newAngular0CurrentState != angular0CurrentState) {
			NotificationChain msgs = null;
			if (angular0CurrentState != null)
				msgs = ((InternalEObject)angular0CurrentState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE, null, msgs);
			if (newAngular0CurrentState != null)
				msgs = ((InternalEObject)newAngular0CurrentState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE, null, msgs);
			msgs = basicSetAngular0CurrentState(newAngular0CurrentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE, newAngular0CurrentState, newAngular0CurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintState getAngular1CurrentState() {
		return angular1CurrentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngular1CurrentState(ConstraintState newAngular1CurrentState, NotificationChain msgs) {
		ConstraintState oldAngular1CurrentState = angular1CurrentState;
		angular1CurrentState = newAngular1CurrentState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE, oldAngular1CurrentState, newAngular1CurrentState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngular1CurrentState(ConstraintState newAngular1CurrentState) {
		if (newAngular1CurrentState != angular1CurrentState) {
			NotificationChain msgs = null;
			if (angular1CurrentState != null)
				msgs = ((InternalEObject)angular1CurrentState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE, null, msgs);
			if (newAngular1CurrentState != null)
				msgs = ((InternalEObject)newAngular1CurrentState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE, null, msgs);
			msgs = basicSetAngular1CurrentState(newAngular1CurrentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE, newAngular1CurrentState, newAngular1CurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE:
				return basicSetAngular0CurrentState(null, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE:
				return basicSetAngular1CurrentState(null, msgs);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE:
				return getAngular0CurrentState();
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE:
				return getAngular1CurrentState();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE:
				setAngular0CurrentState((ConstraintState)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE:
				setAngular1CurrentState((ConstraintState)newValue);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE:
				setAngular0CurrentState((ConstraintState)null);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE:
				setAngular1CurrentState((ConstraintState)null);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR0_CURRENT_STATE:
				return angular0CurrentState != null;
			case ApogyCommonTopologyAddonsDynamicsPackage.UNIVERSAL_CONSTRAINT__ANGULAR1_CURRENT_STATE:
				return angular1CurrentState != null;
		}
		return super.eIsSet(featureID);
	}

} //UniversalConstraintImpl
