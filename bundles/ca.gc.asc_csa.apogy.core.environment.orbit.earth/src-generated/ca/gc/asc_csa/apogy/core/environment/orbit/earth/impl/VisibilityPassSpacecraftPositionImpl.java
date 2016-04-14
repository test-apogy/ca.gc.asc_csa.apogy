package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Pass Spacecraft Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getRangeRate <em>Range Rate</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getSpacecraftCrossTrackAngle <em>Spacecraft Cross Track Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getSpacecraftAlongTrackAngle <em>Spacecraft Along Track Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.VisibilityPassSpacecraftPositionImpl#getSpacecraftCoordinates <em>Spacecraft Coordinates</em>}</li>
 * </ul>
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
	 * The default value of the '{@link #getSpacecraftAlongTrackAngle() <em>Spacecraft Along Track Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecraftAlongTrackAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double SPACECRAFT_ALONG_TRACK_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpacecraftAlongTrackAngle() <em>Spacecraft Along Track Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecraftAlongTrackAngle()
	 * @generated
	 * @ordered
	 */
	protected double spacecraftAlongTrackAngle = SPACECRAFT_ALONG_TRACK_ANGLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpacecraftCoordinates() <em>Spacecraft Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacecraftCoordinates()
	 * @generated
	 * @ordered
	 */
	protected GeographicCoordinates spacecraftCoordinates;

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
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH, oldAzimuth, azimuth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION, oldElevation, elevation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE, oldRange, range));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE, oldRangeRate, rangeRate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE, oldSpacecraftCrossTrackAngle, spacecraftCrossTrackAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpacecraftAlongTrackAngle() {
		return spacecraftAlongTrackAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacecraftAlongTrackAngle(double newSpacecraftAlongTrackAngle) {
		double oldSpacecraftAlongTrackAngle = spacecraftAlongTrackAngle;
		spacecraftAlongTrackAngle = newSpacecraftAlongTrackAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_ALONG_TRACK_ANGLE, oldSpacecraftAlongTrackAngle, spacecraftAlongTrackAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates getSpacecraftCoordinates() {
		return spacecraftCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpacecraftCoordinates(GeographicCoordinates newSpacecraftCoordinates, NotificationChain msgs) {
		GeographicCoordinates oldSpacecraftCoordinates = spacecraftCoordinates;
		spacecraftCoordinates = newSpacecraftCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES, oldSpacecraftCoordinates, newSpacecraftCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacecraftCoordinates(GeographicCoordinates newSpacecraftCoordinates) {
		if (newSpacecraftCoordinates != spacecraftCoordinates) {
			NotificationChain msgs = null;
			if (spacecraftCoordinates != null)
				msgs = ((InternalEObject)spacecraftCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES, null, msgs);
			if (newSpacecraftCoordinates != null)
				msgs = ((InternalEObject)newSpacecraftCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES, null, msgs);
			msgs = basicSetSpacecraftCoordinates(newSpacecraftCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES, newSpacecraftCoordinates, newSpacecraftCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES:
				return basicSetSpacecraftCoordinates(null, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				return getTime();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				return getAzimuth();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				return getElevation();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				return getRange();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				return getRangeRate();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				return getSpacecraftCrossTrackAngle();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_ALONG_TRACK_ANGLE:
				return getSpacecraftAlongTrackAngle();
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES:
				return getSpacecraftCoordinates();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				setTime((Date)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				setAzimuth((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				setElevation((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				setRange((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				setRangeRate((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				setSpacecraftCrossTrackAngle((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_ALONG_TRACK_ANGLE:
				setSpacecraftAlongTrackAngle((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES:
				setSpacecraftCoordinates((GeographicCoordinates)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				setAzimuth(AZIMUTH_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				setRange(RANGE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				setRangeRate(RANGE_RATE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				setSpacecraftCrossTrackAngle(SPACECRAFT_CROSS_TRACK_ANGLE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_ALONG_TRACK_ANGLE:
				setSpacecraftAlongTrackAngle(SPACECRAFT_ALONG_TRACK_ANGLE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES:
				setSpacecraftCoordinates((GeographicCoordinates)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
				return azimuth != AZIMUTH_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
				return range != RANGE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
				return rangeRate != RANGE_RATE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
				return spacecraftCrossTrackAngle != SPACECRAFT_CROSS_TRACK_ANGLE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_ALONG_TRACK_ANGLE:
				return spacecraftAlongTrackAngle != SPACECRAFT_ALONG_TRACK_ANGLE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_COORDINATES:
				return spacecraftCoordinates != null;
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
		result.append(", spacecraftAlongTrackAngle: ");
		result.append(spacecraftAlongTrackAngle);
		result.append(')');
		return result.toString();
	}

} //VisibilityPassSpacecraftPositionImpl
