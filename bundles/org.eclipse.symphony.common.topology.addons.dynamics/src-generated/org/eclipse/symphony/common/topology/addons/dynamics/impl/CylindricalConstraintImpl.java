/**
 * <copyright>
 * </copyright>
 *
 * $Id: CylindricalConstraintImpl.java,v 1.3.2.2 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.topology.addons.dynamics.ConstraintState;
import org.eclipse.symphony.common.topology.addons.dynamics.CylindricalConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cylindrical Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.CylindricalConstraintImpl#getAngularCurrentState <em>Angular Current State</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.CylindricalConstraintImpl#getLinearCurrentState <em>Linear Current State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CylindricalConstraintImpl extends AbstractConstraintImpl implements CylindricalConstraint {
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
	 * The cached value of the '{@link #getLinearCurrentState() <em>Linear Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearCurrentState()
	 * @generated
	 * @ordered
	 */
	protected ConstraintState linearCurrentState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CylindricalConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopologyDynamicsPackage.Literals.CYLINDRICAL_CONSTRAINT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE, oldAngularCurrentState, newAngularCurrentState);
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
				msgs = ((InternalEObject)angularCurrentState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE, null, msgs);
			if (newAngularCurrentState != null)
				msgs = ((InternalEObject)newAngularCurrentState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE, null, msgs);
			msgs = basicSetAngularCurrentState(newAngularCurrentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE, newAngularCurrentState, newAngularCurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintState getLinearCurrentState() {
		return linearCurrentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinearCurrentState(ConstraintState newLinearCurrentState, NotificationChain msgs) {
		ConstraintState oldLinearCurrentState = linearCurrentState;
		linearCurrentState = newLinearCurrentState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE, oldLinearCurrentState, newLinearCurrentState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearCurrentState(ConstraintState newLinearCurrentState) {
		if (newLinearCurrentState != linearCurrentState) {
			NotificationChain msgs = null;
			if (linearCurrentState != null)
				msgs = ((InternalEObject)linearCurrentState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE, null, msgs);
			if (newLinearCurrentState != null)
				msgs = ((InternalEObject)newLinearCurrentState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE, null, msgs);
			msgs = basicSetLinearCurrentState(newLinearCurrentState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE, newLinearCurrentState, newLinearCurrentState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE:
				return basicSetAngularCurrentState(null, msgs);
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE:
				return basicSetLinearCurrentState(null, msgs);
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
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE:
				return getAngularCurrentState();
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE:
				return getLinearCurrentState();
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
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE:
				setAngularCurrentState((ConstraintState)newValue);
				return;
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE:
				setLinearCurrentState((ConstraintState)newValue);
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
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE:
				setAngularCurrentState((ConstraintState)null);
				return;
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE:
				setLinearCurrentState((ConstraintState)null);
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
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__ANGULAR_CURRENT_STATE:
				return angularCurrentState != null;
			case TopologyDynamicsPackage.CYLINDRICAL_CONSTRAINT__LINEAR_CURRENT_STATE:
				return linearCurrentState != null;
		}
		return super.eIsSet(featureID);
	}

} //CylindricalConstraintImpl
