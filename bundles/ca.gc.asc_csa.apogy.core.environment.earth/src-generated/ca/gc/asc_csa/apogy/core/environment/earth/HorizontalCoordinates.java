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
 * A representation of the model object '<em><b>Horizontal Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The horizontal coordinate system is a celestial coordinate system that uses the
 * observer's local horizon as the fundamental plane. This conveniently divides the
 * sky into the upper hemisphere that you can see, and the lower hemisphere that you
 * cannot (because the Earth is in the way). The pole of the upper hemisphere is called
 * the zenith. The pole of the lower hemisphere is called the nadir.
 * 
 * The horizontal coordinates are:
 * 
 * - altitude (Alt): sometimes referred to as elevation, that is the angle between the
 *                   object and the observer's local horizon
 * 
 * - azimuth (Az): the angle of the object around the horizon, usually measured from the
 *                 north point towards the east. In former times, it was common to refer
 *                 to azimuth from the south, as it was then zero at the same time the hour
 *                 angle of a star was zero. This assumes, however, that the star (upper)
 *                 culminates in the south, which is only true for most stars in the
 *                 Northern Hemisphere
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getHorizontalCoordinates()
 * @model
 * @generated
 */
public interface HorizontalCoordinates extends EObject {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #setAltitude(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getHorizontalCoordinates_Altitude()
	 * @model unique="false"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Returns the value of the '<em><b>Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azimuth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth</em>' attribute.
	 * @see #setAzimuth(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getHorizontalCoordinates_Azimuth()
	 * @model unique="false"
	 * @generated
	 */
	double getAzimuth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getAzimuth <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth</em>' attribute.
	 * @see #getAzimuth()
	 * @generated
	 */
	void setAzimuth(double value);

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
	 * @see ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentPackage#getHorizontalCoordinates_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

} // HorizontalCoordinates
