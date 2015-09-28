/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.lidar.impl;

import ca.gc.asc_csa.symphony.core.impl.SymphonyInitializationDataImpl;

import ca.gc.asc_csa.symphony.examples.lidar.LidarData;
import ca.gc.asc_csa.symphony.examples.lidar.SymphonyExampleLidarPackage;

import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lidar Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.lidar.impl.LidarDataImpl#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.lidar.impl.LidarDataImpl#isInitialized <em>Initialized</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LidarDataImpl extends SymphonyInitializationDataImpl implements LidarData {
	/**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
	protected RectangularFrustrumFieldOfView fov;

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
	protected LidarDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyExampleLidarPackage.Literals.LIDAR_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularFrustrumFieldOfView getFov() {
		return fov;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFov(RectangularFrustrumFieldOfView newFov, NotificationChain msgs) {
		RectangularFrustrumFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyExampleLidarPackage.LIDAR_DATA__FOV, oldFov, newFov);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFov(RectangularFrustrumFieldOfView newFov) {
		if (newFov != fov) {
			NotificationChain msgs = null;
			if (fov != null)
				msgs = ((InternalEObject)fov).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyExampleLidarPackage.LIDAR_DATA__FOV, null, msgs);
			if (newFov != null)
				msgs = ((InternalEObject)newFov).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyExampleLidarPackage.LIDAR_DATA__FOV, null, msgs);
			msgs = basicSetFov(newFov, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleLidarPackage.LIDAR_DATA__FOV, newFov, newFov));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyExampleLidarPackage.LIDAR_DATA__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyExampleLidarPackage.LIDAR_DATA__FOV:
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
			case SymphonyExampleLidarPackage.LIDAR_DATA__FOV:
				return getFov();
			case SymphonyExampleLidarPackage.LIDAR_DATA__INITIALIZED:
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
			case SymphonyExampleLidarPackage.LIDAR_DATA__FOV:
				setFov((RectangularFrustrumFieldOfView)newValue);
				return;
			case SymphonyExampleLidarPackage.LIDAR_DATA__INITIALIZED:
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
			case SymphonyExampleLidarPackage.LIDAR_DATA__FOV:
				setFov((RectangularFrustrumFieldOfView)null);
				return;
			case SymphonyExampleLidarPackage.LIDAR_DATA__INITIALIZED:
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
			case SymphonyExampleLidarPackage.LIDAR_DATA__FOV:
				return fov != null;
			case SymphonyExampleLidarPackage.LIDAR_DATA__INITIALIZED:
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
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(')');
		return result.toString();
	}

} //LidarDataImpl
