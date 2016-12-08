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
package ca.gc.asc_csa.apogy.core.environment.earth;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ecliptic Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ecliptic coordinate system is a celestial coordinate system that uses the ecliptic
 * for its fundamental plane. The ecliptic is the path that the sun appears to follow across
 * the sky over the course of a year. It is also the projection of the Earth's orbital plane
 * onto the celestial sphere. The latitudinal angle is called the ecliptic latitude or celestial
 * latitude (denoted β), measured positive towards the north. The longitudinal angle is called
 * the ecliptic longitude or celestial longitude (denoted λ), measured eastwards from 0° to 360°.
 * Like right ascension in the equatorial coordinate system, 0° ecliptic longitude is pointing
 * towards the Sun from the Earth at the Northern hemisphere vernal equinox. This choice makes
 * the coordinates of the fixed stars subject to shifts due to the precession, so that always a
 * reference epoch should be specified. Usually epoch J2000.0 is taken, but the instantaneous
 * equinox of the day (called the epoch of date) is possible too. This coordinate system can be
 * particularly useful for charting solar system objects. Most planets (except Mercury), and many
 * small solar system bodies have orbits with small inclinations to the ecliptic plane, and therefore
 * their ecliptic latitude β is always small. Because of the planets' small deviation from the plane
 * of the ecliptic, ecliptic coordinates were used historically to compute their positions. (Aaboe 2001, 17-19)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getEclipticCoordinates()
 * @model
 * @generated
 */
public interface EclipticCoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getEclipticCoordinates_Longitude()
	 * @model unique="false"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getEclipticCoordinates_Latitude()
	 * @model unique="false"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getEclipticCoordinates_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.EclipticCoordinates#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // EclipticCoordinates
