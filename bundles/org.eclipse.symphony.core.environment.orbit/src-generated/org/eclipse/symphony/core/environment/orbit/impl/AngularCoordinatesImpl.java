/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.environment.orbit.AngularCoordinates;
import org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angular Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl#getAngularRate <em>Angular Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.AngularCoordinatesImpl#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngularCoordinatesImpl extends MinimalEObjectImpl.Container implements AngularCoordinates {
	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected Matrix3x3 rotation;

	/**
	 * The cached value of the '{@link #getAngularRate() <em>Angular Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularRate()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d angularRate;

	/**
	 * The cached value of the '{@link #getAngularAcceleration() <em>Angular Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularAcceleration()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d angularAcceleration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngularCoordinatesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyOrbitEnvironmentPackage.Literals.ANGULAR_COORDINATES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix3x3 getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotation(Matrix3x3 newRotation, NotificationChain msgs) {
		Matrix3x3 oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION, oldRotation, newRotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(Matrix3x3 newRotation) {
		if (newRotation != rotation) {
			NotificationChain msgs = null;
			if (rotation != null)
				msgs = ((InternalEObject)rotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION, null, msgs);
			if (newRotation != null)
				msgs = ((InternalEObject)newRotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION, null, msgs);
			msgs = basicSetRotation(newRotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION, newRotation, newRotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getAngularRate() {
		return angularRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularRate(Tuple3d newAngularRate, NotificationChain msgs) {
		Tuple3d oldAngularRate = angularRate;
		angularRate = newAngularRate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE, oldAngularRate, newAngularRate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularRate(Tuple3d newAngularRate) {
		if (newAngularRate != angularRate) {
			NotificationChain msgs = null;
			if (angularRate != null)
				msgs = ((InternalEObject)angularRate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE, null, msgs);
			if (newAngularRate != null)
				msgs = ((InternalEObject)newAngularRate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE, null, msgs);
			msgs = basicSetAngularRate(newAngularRate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE, newAngularRate, newAngularRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getAngularAcceleration() {
		return angularAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularAcceleration(Tuple3d newAngularAcceleration, NotificationChain msgs) {
		Tuple3d oldAngularAcceleration = angularAcceleration;
		angularAcceleration = newAngularAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION, oldAngularAcceleration, newAngularAcceleration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularAcceleration(Tuple3d newAngularAcceleration) {
		if (newAngularAcceleration != angularAcceleration) {
			NotificationChain msgs = null;
			if (angularAcceleration != null)
				msgs = ((InternalEObject)angularAcceleration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION, null, msgs);
			if (newAngularAcceleration != null)
				msgs = ((InternalEObject)newAngularAcceleration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION, null, msgs);
			msgs = basicSetAngularAcceleration(newAngularAcceleration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION, newAngularAcceleration, newAngularAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION:
				return basicSetRotation(null, msgs);
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE:
				return basicSetAngularRate(null, msgs);
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION:
				return basicSetAngularAcceleration(null, msgs);
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
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION:
				return getRotation();
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE:
				return getAngularRate();
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION:
				return getAngularAcceleration();
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
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION:
				setRotation((Matrix3x3)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE:
				setAngularRate((Tuple3d)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION:
				setAngularAcceleration((Tuple3d)newValue);
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
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION:
				setRotation((Matrix3x3)null);
				return;
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE:
				setAngularRate((Tuple3d)null);
				return;
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION:
				setAngularAcceleration((Tuple3d)null);
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
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ROTATION:
				return rotation != null;
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_RATE:
				return angularRate != null;
			case SymphonyOrbitEnvironmentPackage.ANGULAR_COORDINATES__ANGULAR_ACCELERATION:
				return angularAcceleration != null;
		}
		return super.eIsSet(featureID);
	}

} //AngularCoordinatesImpl
