/**
 * <copyright>
 * </copyright>
 *
 * $Id: RPROConstraintImpl.java,v 1.3.2.2 2015/02/03 20:01:36 rlarcheveque Exp $
 */
package org.eclipse.symphony.common.topology.addons.dynamics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.common.topology.addons.dynamics.RPROConstraint;
import org.eclipse.symphony.common.topology.addons.dynamics.Symphony__CommonTopologyDynamicsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPRO Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.RPROConstraintImpl#getLinearStrength <em>Linear Strength</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.impl.RPROConstraintImpl#getAngularStrength <em>Angular Strength</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPROConstraintImpl extends AbstractConstraintImpl implements RPROConstraint {
	/**
	 * The cached value of the '{@link #getLinearStrength() <em>Linear Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStrength()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d linearStrength;

	/**
	 * The cached value of the '{@link #getAngularStrength() <em>Angular Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularStrength()
	 * @generated
	 * @ordered
	 */
	protected Tuple3d angularStrength;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPROConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonTopologyDynamicsPackage.Literals.RPRO_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getLinearStrength() {
		if (linearStrength != null && linearStrength.eIsProxy()) {
			InternalEObject oldLinearStrength = (InternalEObject)linearStrength;
			linearStrength = (Tuple3d)eResolveProxy(oldLinearStrength);
			if (linearStrength != oldLinearStrength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__LINEAR_STRENGTH, oldLinearStrength, linearStrength));
			}
		}
		return linearStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetLinearStrength() {
		return linearStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStrength(Tuple3d newLinearStrength) {
		Tuple3d oldLinearStrength = linearStrength;
		linearStrength = newLinearStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__LINEAR_STRENGTH, oldLinearStrength, linearStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d getAngularStrength() {
		if (angularStrength != null && angularStrength.eIsProxy()) {
			InternalEObject oldAngularStrength = (InternalEObject)angularStrength;
			angularStrength = (Tuple3d)eResolveProxy(oldAngularStrength);
			if (angularStrength != oldAngularStrength) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__ANGULAR_STRENGTH, oldAngularStrength, angularStrength));
			}
		}
		return angularStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d basicGetAngularStrength() {
		return angularStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngularStrength(Tuple3d newAngularStrength) {
		Tuple3d oldAngularStrength = angularStrength;
		angularStrength = newAngularStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__ANGULAR_STRENGTH, oldAngularStrength, angularStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__LINEAR_STRENGTH:
				if (resolve) return getLinearStrength();
				return basicGetLinearStrength();
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__ANGULAR_STRENGTH:
				if (resolve) return getAngularStrength();
				return basicGetAngularStrength();
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
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__LINEAR_STRENGTH:
				setLinearStrength((Tuple3d)newValue);
				return;
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__ANGULAR_STRENGTH:
				setAngularStrength((Tuple3d)newValue);
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
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__LINEAR_STRENGTH:
				setLinearStrength((Tuple3d)null);
				return;
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__ANGULAR_STRENGTH:
				setAngularStrength((Tuple3d)null);
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
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__LINEAR_STRENGTH:
				return linearStrength != null;
			case Symphony__CommonTopologyDynamicsPackage.RPRO_CONSTRAINT__ANGULAR_STRENGTH:
				return angularStrength != null;
		}
		return super.eIsSet(featureID);
	}

} //RPROConstraintImpl
