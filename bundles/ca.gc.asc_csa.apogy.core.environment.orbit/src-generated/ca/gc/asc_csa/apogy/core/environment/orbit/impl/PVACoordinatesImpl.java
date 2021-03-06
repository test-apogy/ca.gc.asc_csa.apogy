package ca.gc.asc_csa.apogy.core.environment.orbit.impl;
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
import ca.gc.asc_csa.apogy.core.environment.orbit.PVACoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PVA Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.impl.PVACoordinatesImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PVACoordinatesImpl extends MinimalEObjectImpl.Container implements PVACoordinates {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d position;

	/**
	 * The cached value of the '{@link #getVelocity() <em>Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVelocity()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d velocity;

	/**
	 * The cached value of the '{@link #getAcceleration() <em>Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d acceleration;

	/**
	 * The cached value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d angularVelocity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PVACoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitPackage.Literals.PVA_COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Tuple3d newPosition, NotificationChain msgs) {
		Tuple3d oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Tuple3d newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getVelocity() {
		return velocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVelocity(Tuple3d newVelocity, NotificationChain msgs) {
		Tuple3d oldVelocity = velocity;
		velocity = newVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY, oldVelocity, newVelocity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(Tuple3d newVelocity) {
		if (newVelocity != velocity) {
			NotificationChain msgs = null;
			if (velocity != null)
				msgs = ((InternalEObject)velocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY, null, msgs);
			if (newVelocity != null)
				msgs = ((InternalEObject)newVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY, null, msgs);
			msgs = basicSetVelocity(newVelocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY, newVelocity, newVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getAcceleration() {
		return acceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcceleration(Tuple3d newAcceleration, NotificationChain msgs) {
		Tuple3d oldAcceleration = acceleration;
		acceleration = newAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION, oldAcceleration, newAcceleration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceleration(Tuple3d newAcceleration) {
		if (newAcceleration != acceleration) {
			NotificationChain msgs = null;
			if (acceleration != null)
				msgs = ((InternalEObject)acceleration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION, null, msgs);
			if (newAcceleration != null)
				msgs = ((InternalEObject)newAcceleration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION, null, msgs);
			msgs = basicSetAcceleration(newAcceleration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION, newAcceleration, newAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getAngularVelocity() {
		return angularVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularVelocity(Tuple3d newAngularVelocity, NotificationChain msgs) {
		Tuple3d oldAngularVelocity = angularVelocity;
		angularVelocity = newAngularVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY, oldAngularVelocity, newAngularVelocity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularVelocity(Tuple3d newAngularVelocity) {
		if (newAngularVelocity != angularVelocity) {
			NotificationChain msgs = null;
			if (angularVelocity != null)
				msgs = ((InternalEObject)angularVelocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY, null, msgs);
			if (newAngularVelocity != null)
				msgs = ((InternalEObject)newAngularVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY, null, msgs);
			msgs = basicSetAngularVelocity(newAngularVelocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY, newAngularVelocity, newAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION:
				return basicSetPosition(null, msgs);
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY:
				return basicSetVelocity(null, msgs);
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION:
				return basicSetAcceleration(null, msgs);
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY:
				return basicSetAngularVelocity(null, msgs);
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
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION:
				return getPosition();
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY:
				return getVelocity();
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION:
				return getAcceleration();
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY:
				return getAngularVelocity();
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
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION:
				setPosition((Tuple3d)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY:
				setVelocity((Tuple3d)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION:
				setAcceleration((Tuple3d)newValue);
				return;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY:
				setAngularVelocity((Tuple3d)newValue);
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
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION:
				setPosition((Tuple3d)null);
				return;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY:
				setVelocity((Tuple3d)null);
				return;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION:
				setAcceleration((Tuple3d)null);
				return;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY:
				setAngularVelocity((Tuple3d)null);
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
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__POSITION:
				return position != null;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__VELOCITY:
				return velocity != null;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ACCELERATION:
				return acceleration != null;
			case ApogyCoreEnvironmentOrbitPackage.PVA_COORDINATES__ANGULAR_VELOCITY:
				return angularVelocity != null;
		}
		return super.eIsSet(featureID);
	}

} //PVACoordinatesImpl
