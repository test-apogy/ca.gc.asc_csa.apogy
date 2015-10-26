/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Pass Spacecraft Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getRangeRate <em>Range Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getSpacecraftCrossTrackAngle <em>Spacecraft Cross Track Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VisibilityPassSpacecraftPositionImpl extends MinimalEObjectImpl.Container implements VisibilityPassSpacecraftPosition {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzimuth() <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuth()
	 * @generated
	 * @ordered
	 */
	protected static final double AZIMUTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAzimuth() <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuth()
	 * @generated
	 * @ordered
	 */
	protected double azimuth = AZIMUTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected double elevation = ELEVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected double range = RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRangeRate() <em>Range Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeRate()
	 * @generated
	 * @ordered
	 */
	protected static final double RANGE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRangeRate() <em>Range Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangeRate()
	 * @generated
	 * @ordered
	 */
	protected double rangeRate = RANGE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacecraftCrossTrackAngle() <em>Spacecraft Cross Track Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecraftCrossTrackAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double SPACECRAFT_CROSS_TRACK_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpacecraftCrossTrackAngle() <em>Spacecraft Cross Track Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecraftCrossTrackAngle()
	 * @generated
	 * @ordered
	 */
	protected double spacecraftCrossTrackAngle = SPACECRAFT_CROSS_TRACK_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityPassSpacecraftPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAzimuth() {
		return azimuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuth(double newAzimuth) {
		double oldAzimuth = azimuth;
		azimuth = newAzimuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH, oldAzimuth, azimuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(double newElevation) {
		double oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION, oldElevation, elevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRange(double newRange) {
		double oldRange = range;
		range = newRange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE, oldRange, range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRangeRate() {
		return rangeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeRate(double newRangeRate) {
		double oldRangeRate = rangeRate;
		rangeRate = newRangeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE, oldRangeRate, rangeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpacecraftCrossTrackAngle() {
		return spacecraftCrossTrackAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacecraftCrossTrackAngle(double newSpacecraftCrossTrackAngle) {
		double oldSpacecraftCrossTrackAngle = spacecraftCrossTrackAngle;
		spacecraftCrossTrackAngle = newSpacecraftCrossTrackAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE, oldSpacecraftCrossTrackAngle, spacecraftCrossTrackAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				return getTime();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				return getAzimuth();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				return getElevation();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				return getRange();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				return getRangeRate();
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				return getSpacecraftCrossTrackAngle();
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
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				setTime((Date)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				setAzimuth((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				setElevation((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				setRange((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				setRangeRate((Double)newValue);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				setSpacecraftCrossTrackAngle((Double)newValue);
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
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				setAzimuth(AZIMUTH_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				setRangeRate(RANGE_RATE_EDEFAULT);
				return;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				setSpacecraftCrossTrackAngle(SPACECRAFT_CROSS_TRACK_ANGLE_EDEFAULT);
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
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				return azimuth != AZIMUTH_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				return range != RANGE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				return rangeRate != RANGE_RATE_EDEFAULT;
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				return spacecraftCrossTrackAngle != SPACECRAFT_CROSS_TRACK_ANGLE_EDEFAULT;
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
		result.append(" (time: ");
		result.append(time);
		result.append(", azimuth: ");
		result.append(azimuth);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(", range: ");
		result.append(range);
		result.append(", rangeRate: ");
		result.append(rangeRate);
		result.append(", spacecraftCrossTrackAngle: ");
		result.append(spacecraftCrossTrackAngle);
		result.append(')');
		return result.toString();
	}

} //VisibilityPassSpacecraftPositionImpl
