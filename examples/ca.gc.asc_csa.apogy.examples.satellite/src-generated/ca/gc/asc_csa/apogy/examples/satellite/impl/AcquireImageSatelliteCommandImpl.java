package ca.gc.asc_csa.apogy.examples.satellite.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acquire Image Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AcquireImageSatelliteCommandImpl#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcquireImageSatelliteCommandImpl extends AbstractRequestBasedSatelliteCommandImpl implements AcquireImageSatelliteCommand {
	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

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
	 * The default value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ROLL_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRollAngle() <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRollAngle()
	 * @generated
	 * @ordered
	 */
	protected double rollAngle = ROLL_ANGLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcquireImageSatelliteCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ACQUIRE_IMAGE_SATELLITE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE, oldLatitude, latitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION, oldElevation, elevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRollAngle() {
		return rollAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRollAngle(double newRollAngle) {
		double oldRollAngle = rollAngle;
		rollAngle = newRollAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE, oldRollAngle, rollAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE:
				return getLongitude();
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE:
				return getLatitude();
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION:
				return getElevation();
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				return getRollAngle();
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
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION:
				setElevation((Double)newValue);
				return;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				setRollAngle((Double)newValue);
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
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				setRollAngle(ROLL_ANGLE_EDEFAULT);
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
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
			case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ROLL_ANGLE:
				return rollAngle != ROLL_ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == GeographicCoordinates.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE: return ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE;
				case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE: return ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE;
				case ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION: return ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == GeographicCoordinates.class) {
			switch (baseFeatureID) {
				case ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE: return ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LONGITUDE;
				case ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE: return ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__LATITUDE;
				case ApogyEarthEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION: return ApogyExamplesSatellitePackage.ACQUIRE_IMAGE_SATELLITE_COMMAND__ELEVATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(", rollAngle: ");
		result.append(rollAngle);
		result.append(')');
		return result.toString();
	}

} //AcquireImageSatelliteCommandImpl
