/**
 * Canadian Space Agency 2007.
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.pose.InertialMeasurementUnit;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inertial Measurement Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.InertialMeasurementUnitImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.InertialMeasurementUnitImpl#getLinearAcceleration <em>Linear Acceleration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InertialMeasurementUnitImpl extends OrientationSensorImpl implements InertialMeasurementUnit {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InertialMeasurementUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPosePackage.Literals.INERTIAL_MEASUREMENT_UNIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY, oldAngularVelocity, newAngularVelocity);
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
				msgs = ((InternalEObject)angularVelocity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY, null, msgs);
			if (newAngularVelocity != null)
				msgs = ((InternalEObject)newAngularVelocity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY, null, msgs);
			msgs = basicSetAngularVelocity(newAngularVelocity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY, newAngularVelocity, newAngularVelocity));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION, oldLinearAcceleration, newLinearAcceleration);
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
				msgs = ((InternalEObject)linearAcceleration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION, null, msgs);
			if (newLinearAcceleration != null)
				msgs = ((InternalEObject)newLinearAcceleration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION, null, msgs);
			msgs = basicSetLinearAcceleration(newLinearAcceleration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION, newLinearAcceleration, newLinearAcceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY:
				return basicSetAngularVelocity(null, msgs);
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION:
				return basicSetLinearAcceleration(null, msgs);
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
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY:
				return getAngularVelocity();
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION:
				return getLinearAcceleration();
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
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY:
				setAngularVelocity((Tuple3d)newValue);
				return;
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION:
				setLinearAcceleration((Tuple3d)newValue);
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
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY:
				setAngularVelocity((Tuple3d)null);
				return;
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION:
				setLinearAcceleration((Tuple3d)null);
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
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__ANGULAR_VELOCITY:
				return angularVelocity != null;
			case ApogyAddonsSensorsPosePackage.INERTIAL_MEASUREMENT_UNIT__LINEAR_ACCELERATION:
				return linearAcceleration != null;
		}
		return super.eIsSet(featureID);
	}

} //InertialMeasurementUnitImpl
