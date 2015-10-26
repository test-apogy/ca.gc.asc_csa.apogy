/**
 * <copyright>
 * </copyright>
 *
 * $Id: KinematicStateImpl.java,v 1.5.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.addons.dynamics.KinematicState;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kinematic State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.KinematicStateImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.KinematicStateImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.KinematicStateImpl#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.KinematicStateImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.KinematicStateImpl#getLinearAcceleration <em>Linear Acceleration</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.KinematicStateImpl#getAngularAcceleration <em>Angular Acceleration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KinematicStateImpl extends MinimalEObjectImpl.Container implements KinematicState {
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
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d orientation;
	/**
	 * The cached value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d linearVelocity;
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
	 * The cached value of the '{@link #getLinearAcceleration() <em>Linear Acceleration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearAcceleration()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d linearAcceleration;
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
	protected KinematicStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.KINEMATIC_STATE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__POSITION, oldPosition, newPosition);
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
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(Tuple3d newOrientation, NotificationChain msgs) {
		Tuple3d oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(Tuple3d newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getLinearVelocity() {
		return linearVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearVelocity(Tuple3d newLinearVelocity, NotificationChain msgs) {
		Tuple3d oldLinearVelocity = linearVelocity;
		linearVelocity = newLinearVelocity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY, oldLinearVelocity, newLinearVelocity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearVelocity(Tuple3d newLinearVelocity) {
		if (newLinearVelocity != linearVelocity) {
			NotificationChain msgs = null;
			if (linearVelocity != null)
				msgs = ((InternalEObject)linearVelocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY, null, msgs);
			if (newLinearVelocity != null)
				msgs = ((InternalEObject)newLinearVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY, null, msgs);
			msgs = basicSetLinearVelocity(newLinearVelocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY, newLinearVelocity, newLinearVelocity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY, oldAngularVelocity, newAngularVelocity);
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
				msgs = ((InternalEObject)angularVelocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY, null, msgs);
			if (newAngularVelocity != null)
				msgs = ((InternalEObject)newAngularVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY, null, msgs);
			msgs = basicSetAngularVelocity(newAngularVelocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY, newAngularVelocity, newAngularVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getLinearAcceleration() {
		return linearAcceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearAcceleration(Tuple3d newLinearAcceleration, NotificationChain msgs) {
		Tuple3d oldLinearAcceleration = linearAcceleration;
		linearAcceleration = newLinearAcceleration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION, oldLinearAcceleration, newLinearAcceleration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearAcceleration(Tuple3d newLinearAcceleration) {
		if (newLinearAcceleration != linearAcceleration) {
			NotificationChain msgs = null;
			if (linearAcceleration != null)
				msgs = ((InternalEObject)linearAcceleration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION, null, msgs);
			if (newLinearAcceleration != null)
				msgs = ((InternalEObject)newLinearAcceleration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION, null, msgs);
			msgs = basicSetLinearAcceleration(newLinearAcceleration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION, newLinearAcceleration, newLinearAcceleration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION, oldAngularAcceleration, newAngularAcceleration);
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
				msgs = ((InternalEObject)angularAcceleration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION, null, msgs);
			if (newAngularAcceleration != null)
				msgs = ((InternalEObject)newAngularAcceleration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION, null, msgs);
			msgs = basicSetAngularAcceleration(newAngularAcceleration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION, newAngularAcceleration, newAngularAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyDynamicsPackage.KINEMATIC_STATE__POSITION:
				return basicSetPosition(null, msgs);
			case TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
				return basicSetLinearVelocity(null, msgs);
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
				return basicSetAngularVelocity(null, msgs);
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
				return basicSetLinearAcceleration(null, msgs);
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
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
			case TopologyDynamicsPackage.KINEMATIC_STATE__POSITION:
				return getPosition();
			case TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
				return getOrientation();
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
				return getLinearVelocity();
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
				return getAngularVelocity();
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
				return getLinearAcceleration();
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
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
			case TopologyDynamicsPackage.KINEMATIC_STATE__POSITION:
				setPosition((Tuple3d)newValue);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
				setOrientation((Tuple3d)newValue);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
				setLinearVelocity((Tuple3d)newValue);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
				setAngularVelocity((Tuple3d)newValue);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
				setLinearAcceleration((Tuple3d)newValue);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
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
			case TopologyDynamicsPackage.KINEMATIC_STATE__POSITION:
				setPosition((Tuple3d)null);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
				setOrientation((Tuple3d)null);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
				setLinearVelocity((Tuple3d)null);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
				setAngularVelocity((Tuple3d)null);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
				setLinearAcceleration((Tuple3d)null);
				return;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
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
			case TopologyDynamicsPackage.KINEMATIC_STATE__POSITION:
				return position != null;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ORIENTATION:
				return orientation != null;
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_VELOCITY:
				return linearVelocity != null;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_VELOCITY:
				return angularVelocity != null;
			case TopologyDynamicsPackage.KINEMATIC_STATE__LINEAR_ACCELERATION:
				return linearAcceleration != null;
			case TopologyDynamicsPackage.KINEMATIC_STATE__ANGULAR_ACCELERATION:
				return angularAcceleration != null;
		}
		return super.eIsSet(featureID);
	}

} //KinematicStateImpl
