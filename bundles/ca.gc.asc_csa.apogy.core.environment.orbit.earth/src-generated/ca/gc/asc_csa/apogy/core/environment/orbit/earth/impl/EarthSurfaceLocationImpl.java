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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthSurfaceLocationImpl#getElevation <em>Elevation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthSurfaceLocationImpl extends MinimalEObjectImpl.Container implements EarthSurfaceLocation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSurfaceLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.EARTH_SURFACE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE, oldLongitude, longitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE, oldLatitude, latitude));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION, oldElevation, elevation));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				return getName();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				return getDescription();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE:
				return getLongitude();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE:
				return getLatitude();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION:
				return getElevation();
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION:
				setElevation((Double)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
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
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == GeographicCoordinates.class) {
			switch (derivedFeatureID) {
				case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE: return ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE;
				case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE: return ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE;
				case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION: return ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__DESCRIPTION;
				default: return -1;
			}
		}
		if (baseClass == GeographicCoordinates.class) {
			switch (baseFeatureID) {
				case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE: return ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LONGITUDE;
				case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE: return ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__LATITUDE;
				case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION: return ApogyCoreEnvironmentOrbitEarthPackage.EARTH_SURFACE_LOCATION__ELEVATION;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", latitude: ");
		result.append(latitude);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(')');
		return result.toString();
	}

} //EarthSurfaceLocationImpl
