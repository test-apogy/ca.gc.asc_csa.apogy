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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ConstraintState;
import ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.impl.ConstraintStateImpl#getForce <em>Force</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintStateImpl extends MinimalEObjectImpl.Container implements ConstraintState {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final double POSITION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected double position = POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected double velocity = VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected static final double FORCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected double force = FORCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonTopologyAddonsDynamicsPackage.Literals.CONSTRAINT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(double newPosition) {
		double oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(double newVelocity) {
		double oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__VELOCITY, oldVelocity, velocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForce() {
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForce(double newForce) {
		double oldForce = force;
		force = newForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__FORCE, oldForce, force));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__POSITION:
				return getPosition();
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__VELOCITY:
				return getVelocity();
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__FORCE:
				return getForce();
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
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__POSITION:
				setPosition((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__VELOCITY:
				setVelocity((Double)newValue);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__FORCE:
				setForce((Double)newValue);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__VELOCITY:
				setVelocity(VELOCITY_EDEFAULT);
				return;
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__FORCE:
				setForce(FORCE_EDEFAULT);
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
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__POSITION:
				return position != POSITION_EDEFAULT;
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__VELOCITY:
				return velocity != VELOCITY_EDEFAULT;
			case ApogyCommonTopologyAddonsDynamicsPackage.CONSTRAINT_STATE__FORCE:
				return force != FORCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (position: ");
		result.append(position);
		result.append(", velocity: ");
		result.append(velocity);
		result.append(", force: ");
		result.append(force);
		result.append(')');
		return result.toString();
	}

} //ConstraintStateImpl
