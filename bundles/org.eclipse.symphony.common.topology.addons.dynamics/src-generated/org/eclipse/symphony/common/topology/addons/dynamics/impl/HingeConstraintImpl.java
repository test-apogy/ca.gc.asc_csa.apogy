/**
 * <copyright>
 * </copyright>
 *
 * $Id: HingeConstraintImpl.java,v 1.3.2.2 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState;
import org.eclipse.symphony.common.topology.addons.dynamics.HingeConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hinge Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.HingeConstraintImpl#getAngularCurrentState <em>Angular Current State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HingeConstraintImpl extends AbstractConstraintImpl implements HingeConstraint {
	/**
	 * The cached value of the '{@link #getAngularCurrentState() <em>Angular Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularCurrentState()
	 * @generated
	 * @ordered
	 */
	protected ConstraintState angularCurrentState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HingeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.HINGE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintState getAngularCurrentState() {
		return angularCurrentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngularCurrentState(ConstraintState newAngularCurrentState, NotificationChain msgs) {
		ConstraintState oldAngularCurrentState = angularCurrentState;
		angularCurrentState = newAngularCurrentState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE, oldAngularCurrentState, newAngularCurrentState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularCurrentState(ConstraintState newAngularCurrentState) {
		if (newAngularCurrentState != angularCurrentState) {
			NotificationChain msgs = null;
			if (angularCurrentState != null)
				msgs = ((InternalEObject)angularCurrentState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE, null, msgs);
			if (newAngularCurrentState != null)
				msgs = ((InternalEObject)newAngularCurrentState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE, null, msgs);
			msgs = basicSetAngularCurrentState(newAngularCurrentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE, newAngularCurrentState, newAngularCurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE:
				return basicSetAngularCurrentState(null, msgs);
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
			case TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE:
				return getAngularCurrentState();
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
			case TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE:
				setAngularCurrentState((ConstraintState)newValue);
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
			case TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE:
				setAngularCurrentState((ConstraintState)null);
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
			case TopologyDynamicsPackage.HINGE_CONSTRAINT__ANGULAR_CURRENT_STATE:
				return angularCurrentState != null;
		}
		return super.eIsSet(featureID);
	}

} //HingeConstraintImpl
