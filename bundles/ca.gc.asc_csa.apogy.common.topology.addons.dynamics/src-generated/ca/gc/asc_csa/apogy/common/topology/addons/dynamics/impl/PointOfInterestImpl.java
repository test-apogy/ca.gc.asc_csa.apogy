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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.KinematicState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.PointOfInterest;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Of Interest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PointOfInterestImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.PointOfInterestImpl#getKinematicState <em>Kinematic State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointOfInterestImpl extends MinimalEObjectImpl.Container implements PointOfInterest {
	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d offset;

	/**
	 * The cached value of the '{@link #getKinematicState() <em>Kinematic State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKinematicState()
	 * @generated
	 * @ordered
	 */
	protected KinematicState kinematicState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointOfInterestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.POINT_OF_INTEREST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(Tuple3d newOffset, NotificationChain msgs) {
		Tuple3d oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Tuple3d newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinematicState getKinematicState() {
		return kinematicState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinematicState(KinematicState newKinematicState, NotificationChain msgs) {
		KinematicState oldKinematicState = kinematicState;
		kinematicState = newKinematicState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE, oldKinematicState, newKinematicState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKinematicState(KinematicState newKinematicState) {
		if (newKinematicState != kinematicState) {
			NotificationChain msgs = null;
			if (kinematicState != null)
				msgs = ((InternalEObject)kinematicState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE, null, msgs);
			if (newKinematicState != null)
				msgs = ((InternalEObject)newKinematicState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE, null, msgs);
			msgs = basicSetKinematicState(newKinematicState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE, newKinematicState, newKinematicState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET:
				return basicSetOffset(null, msgs);
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE:
				return basicSetKinematicState(null, msgs);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET:
				return getOffset();
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE:
				return getKinematicState();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET:
				setOffset((Tuple3d)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE:
				setKinematicState((KinematicState)newValue);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET:
				setOffset((Tuple3d)null);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE:
				setKinematicState((KinematicState)null);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__OFFSET:
				return offset != null;
			case ApogyCommonTopologyAddonsDynamicsPackage.POINT_OF_INTEREST__KINEMATIC_STATE:
				return kinematicState != null;
		}
		return super.eIsSet(featureID);
	}

} //PointOfInterestImpl
