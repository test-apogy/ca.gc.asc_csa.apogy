/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.impl;

import ca.gc.asc_csa.apogy.common.math.Tuple3d;

import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl#getGeographicalCoordinates <em>Geographical Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl#getXAxisAzimuth <em>XAxis Azimuth</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.EarthSurfaceWorksiteImpl#getEarthSky <em>Earth Sky</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthSurfaceWorksiteImpl extends SurfaceWorksiteImpl implements EarthSurfaceWorksite {
	/**
	 * The cached value of the '{@link #getGeographicalCoordinates() <em>Geographical Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeographicalCoordinates()
	 * @generated
	 * @ordered
	 */
	protected GeographicCoordinates geographicalCoordinates;

	/**
	 * The default value of the '{@link #getXAxisAzimuth() <em>XAxis Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisAzimuth()
	 * @generated
	 * @ordered
	 */
	protected static final double XAXIS_AZIMUTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXAxisAzimuth() <em>XAxis Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAxisAzimuth()
	 * @generated
	 * @ordered
	 */
	protected double xAxisAzimuth = XAXIS_AZIMUTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthSurfaceWorksiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyEarthSurfaceEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates getGeographicalCoordinates() {
		return geographicalCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeographicalCoordinates(GeographicCoordinates newGeographicalCoordinates, NotificationChain msgs) {
		GeographicCoordinates oldGeographicalCoordinates = geographicalCoordinates;
		geographicalCoordinates = newGeographicalCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, oldGeographicalCoordinates, newGeographicalCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeographicalCoordinates(GeographicCoordinates newGeographicalCoordinates) {
		if (newGeographicalCoordinates != geographicalCoordinates) {
			NotificationChain msgs = null;
			if (geographicalCoordinates != null)
				msgs = ((InternalEObject)geographicalCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, null, msgs);
			if (newGeographicalCoordinates != null)
				msgs = ((InternalEObject)newGeographicalCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, null, msgs);
			msgs = basicSetGeographicalCoordinates(newGeographicalCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, newGeographicalCoordinates, newGeographicalCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXAxisAzimuth() {
		return xAxisAzimuth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAxisAzimuth(double newXAxisAzimuth) {
		double oldXAxisAzimuth = xAxisAzimuth;
		xAxisAzimuth = newXAxisAzimuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH, oldXAxisAzimuth, xAxisAzimuth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSky getEarthSky() {
		EarthSky earthSky = basicGetEarthSky();
		return earthSky != null && earthSky.eIsProxy() ? (EarthSky)eResolveProxy((InternalEObject)earthSky) : earthSky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSky basicGetEarthSky() {
		// TODO: implement this method to return the 'Earth Sky' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarthSky(EarthSky newEarthSky) {
		// TODO: implement this method to set the 'Earth Sky' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates convertToGeographicCoordinates(Tuple3d position) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuple3d convertToXYZPosition(GeographicCoordinates geographicalCoordinates) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				return basicSetGeographicalCoordinates(null, msgs);
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
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				return getGeographicalCoordinates();
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				return getXAxisAzimuth();
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				if (resolve) return getEarthSky();
				return basicGetEarthSky();
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
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				setGeographicalCoordinates((GeographicCoordinates)newValue);
				return;
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				setXAxisAzimuth((Double)newValue);
				return;
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				setEarthSky((EarthSky)newValue);
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
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				setGeographicalCoordinates((GeographicCoordinates)null);
				return;
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				setXAxisAzimuth(XAXIS_AZIMUTH_EDEFAULT);
				return;
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				setEarthSky((EarthSky)null);
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
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				return geographicalCoordinates != null;
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				return xAxisAzimuth != XAXIS_AZIMUTH_EDEFAULT;
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				return basicGetEarthSky() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D:
				return convertToGeographicCoordinates((Tuple3d)arguments.get(0));
			case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES:
				return convertToXYZPosition((GeographicCoordinates)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (xAxisAzimuth: ");
		result.append(xAxisAzimuth);
		result.append(')');
		return result.toString();
	}

} //EarthSurfaceWorksiteImpl
