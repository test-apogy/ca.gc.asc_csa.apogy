/**
 * Canadian Space Agency 2008.
 *
 * $Id: PathRecorderImpl.java,v 1.3.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorder;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorderSamplingMode;
import org.eclipse.symphony.addons.sensors.pose.PoseSensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Recorder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.PathRecorderImpl#getPositionSensor <em>Position Sensor</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.PathRecorderImpl#getMinimumDistanceDelta <em>Minimum Distance Delta</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.PathRecorderImpl#getMinimumTimeDelta <em>Minimum Time Delta</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.PathRecorderImpl#getSamplingMode <em>Sampling Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.controllers.impl.PathRecorderImpl#getRecordedPath <em>Recorded Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathRecorderImpl<PathType extends Path> extends MinimalEObjectImpl.Container implements PathRecorder<PathType>
{
	/**
	 * The cached value of the '{@link #getPositionSensor() <em>Position Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionSensor()
	 * @generated
	 * @ordered
	 */
	protected PoseSensor positionSensor;

	/**
	 * The default value of the '{@link #getMinimumDistanceDelta() <em>Minimum Distance Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistanceDelta()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_DISTANCE_DELTA_EDEFAULT = 0.1;

	/**
	 * The cached value of the '{@link #getMinimumDistanceDelta() <em>Minimum Distance Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumDistanceDelta()
	 * @generated
	 * @ordered
	 */
	protected double minimumDistanceDelta = MINIMUM_DISTANCE_DELTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumTimeDelta() <em>Minimum Time Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTimeDelta()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_TIME_DELTA_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMinimumTimeDelta() <em>Minimum Time Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumTimeDelta()
	 * @generated
	 * @ordered
	 */
	protected double minimumTimeDelta = MINIMUM_TIME_DELTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSamplingMode() <em>Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected static final PathRecorderSamplingMode SAMPLING_MODE_EDEFAULT = PathRecorderSamplingMode.ON_DISTANCE_DELTA;

	/**
	 * The cached value of the '{@link #getSamplingMode() <em>Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingMode()
	 * @generated
	 * @ordered
	 */
	protected PathRecorderSamplingMode samplingMode = SAMPLING_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRecordedPath() <em>Recorded Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedPath()
	 * @generated
	 * @ordered
	 */
	protected PathType recordedPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathRecorderImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__AddonsMobilityControllersPackage.Literals.PATH_RECORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public PathType getRecordedPath()
	{
		if (recordedPath != null && recordedPath.eIsProxy()) {
			InternalEObject oldRecordedPath = (InternalEObject)recordedPath;
			recordedPath = (PathType)eResolveProxy(oldRecordedPath);
			if (recordedPath != oldRecordedPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__RECORDED_PATH, oldRecordedPath, recordedPath));
			}
		}
		return recordedPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType basicGetRecordedPath()
	{
		return recordedPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedPath(PathType newRecordedPath)
	{
		PathType oldRecordedPath = recordedPath;
		recordedPath = newRecordedPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__RECORDED_PATH, oldRecordedPath, recordedPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensor getPositionSensor()
	{
		if (positionSensor != null && positionSensor.eIsProxy()) {
			InternalEObject oldPositionSensor = (InternalEObject)positionSensor;
			positionSensor = (PoseSensor)eResolveProxy(oldPositionSensor);
			if (positionSensor != oldPositionSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR, oldPositionSensor, positionSensor));
			}
		}
		return positionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensor basicGetPositionSensor()
	{
		return positionSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionSensor(PoseSensor newPositionSensor)
	{
		PoseSensor oldPositionSensor = positionSensor;
		positionSensor = newPositionSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR, oldPositionSensor, positionSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumDistanceDelta() {
		return minimumDistanceDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumDistanceDelta(double newMinimumDistanceDelta) {
		double oldMinimumDistanceDelta = minimumDistanceDelta;
		minimumDistanceDelta = newMinimumDistanceDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_DISTANCE_DELTA, oldMinimumDistanceDelta, minimumDistanceDelta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumTimeDelta() {
		return minimumTimeDelta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumTimeDelta(double newMinimumTimeDelta) {
		double oldMinimumTimeDelta = minimumTimeDelta;
		minimumTimeDelta = newMinimumTimeDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_TIME_DELTA, oldMinimumTimeDelta, minimumTimeDelta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathRecorderSamplingMode getSamplingMode()
	{
		return samplingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingMode(PathRecorderSamplingMode newSamplingMode)
	{
		PathRecorderSamplingMode oldSamplingMode = samplingMode;
		samplingMode = newSamplingMode == null ? SAMPLING_MODE_EDEFAULT : newSamplingMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__SAMPLING_MODE, oldSamplingMode, samplingMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR:
				if (resolve) return getPositionSensor();
				return basicGetPositionSensor();
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_DISTANCE_DELTA:
				return getMinimumDistanceDelta();
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_TIME_DELTA:
				return getMinimumTimeDelta();
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__SAMPLING_MODE:
				return getSamplingMode();
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__RECORDED_PATH:
				if (resolve) return getRecordedPath();
				return basicGetRecordedPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR:
				setPositionSensor((PoseSensor)newValue);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_DISTANCE_DELTA:
				setMinimumDistanceDelta((Double)newValue);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_TIME_DELTA:
				setMinimumTimeDelta((Double)newValue);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__SAMPLING_MODE:
				setSamplingMode((PathRecorderSamplingMode)newValue);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__RECORDED_PATH:
				setRecordedPath((PathType)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR:
				setPositionSensor((PoseSensor)null);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_DISTANCE_DELTA:
				setMinimumDistanceDelta(MINIMUM_DISTANCE_DELTA_EDEFAULT);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_TIME_DELTA:
				setMinimumTimeDelta(MINIMUM_TIME_DELTA_EDEFAULT);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__SAMPLING_MODE:
				setSamplingMode(SAMPLING_MODE_EDEFAULT);
				return;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__RECORDED_PATH:
				setRecordedPath((PathType)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR:
				return positionSensor != null;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_DISTANCE_DELTA:
				return minimumDistanceDelta != MINIMUM_DISTANCE_DELTA_EDEFAULT;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__MINIMUM_TIME_DELTA:
				return minimumTimeDelta != MINIMUM_TIME_DELTA_EDEFAULT;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__SAMPLING_MODE:
				return samplingMode != SAMPLING_MODE_EDEFAULT;
			case Symphony__AddonsMobilityControllersPackage.PATH_RECORDER__RECORDED_PATH:
				return recordedPath != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minimumDistanceDelta: ");
		result.append(minimumDistanceDelta);
		result.append(", minimumTimeDelta: ");
		result.append(minimumTimeDelta);
		result.append(", samplingMode: ");
		result.append(samplingMode);
		result.append(')');
		return result.toString();
	}

} //PathRecorderImpl
