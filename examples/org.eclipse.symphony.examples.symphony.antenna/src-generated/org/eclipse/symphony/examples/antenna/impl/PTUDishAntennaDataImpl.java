/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.impl;

import ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl;
import ca.gc.space.mrt.sensors.fov.ConicalFieldOfView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.examples.antenna.PTUDishAntennaData;
import org.eclipse.symphony.examples.antenna.SymphonyExampleAntennaSymphonyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Dish Antenna Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaDataImpl#getFov <em>Fov</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaDataImpl#getPanAngle <em>Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaDataImpl#getTiltAngle <em>Tilt Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaDataImpl#isTrackingSun <em>Tracking Sun</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.antenna.impl.PTUDishAntennaDataImpl#isInitialized <em>Initialized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTUDishAntennaDataImpl extends SymphonyInitializationDataImpl implements PTUDishAntennaData {
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected ConicalFieldOfView fov;

	/**
	 * The default value of the '{@link #getPanAngle() <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double PAN_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPanAngle() <em>Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanAngle()
	 * @generated
	 * @ordered
	 */
	protected double panAngle = PAN_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TILT_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTiltAngle() <em>Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltAngle()
	 * @generated
	 * @ordered
	 */
	protected double tiltAngle = TILT_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrackingSun() <em>Tracking Sun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackingSun()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACKING_SUN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrackingSun() <em>Tracking Sun</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackingSun()
	 * @generated
	 * @ordered
	 */
	protected boolean trackingSun = TRACKING_SUN_EDEFAULT;

	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTUDishAntennaDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleAntennaSymphonyPackage.Literals.PTU_DISH_ANTENNA_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConicalFieldOfView getFov() {
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFov(ConicalFieldOfView newFov, NotificationChain msgs) {
		ConicalFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV, oldFov, newFov);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFov(ConicalFieldOfView newFov) {
		if (newFov != fov) {
			NotificationChain msgs = null;
			if (fov != null)
				msgs = ((InternalEObject)fov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV, null, msgs);
			if (newFov != null)
				msgs = ((InternalEObject)newFov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV, null, msgs);
			msgs = basicSetFov(newFov, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV, newFov, newFov));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPanAngle() {
		return panAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanAngle(double newPanAngle) {
		double oldPanAngle = panAngle;
		panAngle = newPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__PAN_ANGLE, oldPanAngle, panAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTiltAngle() {
		return tiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiltAngle(double newTiltAngle) {
		double oldTiltAngle = tiltAngle;
		tiltAngle = newTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TILT_ANGLE, oldTiltAngle, tiltAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrackingSun() {
		return trackingSun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackingSun(boolean newTrackingSun) {
		boolean oldTrackingSun = trackingSun;
		trackingSun = newTrackingSun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TRACKING_SUN, oldTrackingSun, trackingSun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV:
				return basicSetFov(null, msgs);
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
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV:
				return getFov();
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__PAN_ANGLE:
				return getPanAngle();
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TILT_ANGLE:
				return getTiltAngle();
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TRACKING_SUN:
				return isTrackingSun();
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__INITIALIZED:
				return isInitialized();
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
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV:
				setFov((ConicalFieldOfView)newValue);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__PAN_ANGLE:
				setPanAngle((Double)newValue);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TILT_ANGLE:
				setTiltAngle((Double)newValue);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TRACKING_SUN:
				setTrackingSun((Boolean)newValue);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__INITIALIZED:
				setInitialized((Boolean)newValue);
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
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV:
				setFov((ConicalFieldOfView)null);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__PAN_ANGLE:
				setPanAngle(PAN_ANGLE_EDEFAULT);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TILT_ANGLE:
				setTiltAngle(TILT_ANGLE_EDEFAULT);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TRACKING_SUN:
				setTrackingSun(TRACKING_SUN_EDEFAULT);
				return;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
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
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__FOV:
				return fov != null;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__PAN_ANGLE:
				return panAngle != PAN_ANGLE_EDEFAULT;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TILT_ANGLE:
				return tiltAngle != TILT_ANGLE_EDEFAULT;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__TRACKING_SUN:
				return trackingSun != TRACKING_SUN_EDEFAULT;
			case SymphonyExampleAntennaSymphonyPackage.PTU_DISH_ANTENNA_DATA__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
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
		result.append(" (panAngle: ");
		result.append(panAngle);
		result.append(", tiltAngle: ");
		result.append(tiltAngle);
		result.append(", trackingSun: ");
		result.append(trackingSun);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(')');
		return result.toString();
	}

} //PTUDishAntennaDataImpl
