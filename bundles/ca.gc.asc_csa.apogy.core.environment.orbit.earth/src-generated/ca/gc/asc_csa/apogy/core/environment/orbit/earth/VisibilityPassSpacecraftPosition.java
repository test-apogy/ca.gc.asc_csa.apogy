package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
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

import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Pass Spacecraft Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRange <em>Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRangeRate <em>Range Rate</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftCrossTrackAngle <em>Spacecraft Cross Track Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftAlongTrackAngle <em>Spacecraft Along Track Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftCoordinates <em>Spacecraft Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition()
 * @model
 * @generated
 */
public interface VisibilityPassSpacecraftPosition extends Timed {
	/**
	 * Returns the value of the '<em><b>Azimuth</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The azimuth of the spacecraft relative to the North.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Azimuth</em>' attribute.
	 * @see #setAzimuth(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_Azimuth()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' apogy_units='rad'"
	 * @generated
	 */
	double getAzimuth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getAzimuth <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth</em>' attribute.
	 * @see #getAzimuth()
	 * @generated
	 */
	void setAzimuth(double value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elevation of the spacecraft relative to the local horizontal plane.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_Elevation()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' apogy_units='rad'"
	 * @generated
	 */
	double getElevation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(double value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The range to the spacecraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_Range()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' apogy_units='m'"
	 * @generated
	 */
	double getRange();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(double value);

	/**
	 * Returns the value of the '<em><b>Range Rate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The relative speed of the spacecraft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range Rate</em>' attribute.
	 * @see #setRangeRate(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_RangeRate()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' apogy_units='m/s'"
	 * @generated
	 */
	double getRangeRate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getRangeRate <em>Range Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Rate</em>' attribute.
	 * @see #getRangeRate()
	 * @generated
	 */
	void setRangeRate(double value);

	/**
	 * Returns the value of the '<em><b>Spacecraft Cross Track Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cross track angle of the surface location relative to the spacecraft nadir.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacecraft Cross Track Angle</em>' attribute.
	 * @see #setSpacecraftCrossTrackAngle(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_SpacecraftCrossTrackAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' apogy_units='rad'"
	 * @generated
	 */
	double getSpacecraftCrossTrackAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftCrossTrackAngle <em>Spacecraft Cross Track Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacecraft Cross Track Angle</em>' attribute.
	 * @see #getSpacecraftCrossTrackAngle()
	 * @generated
	 */
	void setSpacecraftCrossTrackAngle(double value);

	/**
	 * Returns the value of the '<em><b>Spacecraft Along Track Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The along track angle of the surface location relative to the spacecraft nadir.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacecraft Along Track Angle</em>' attribute.
	 * @see #setSpacecraftAlongTrackAngle(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_SpacecraftAlongTrackAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' apogy_units='rad'"
	 * @generated
	 */
	double getSpacecraftAlongTrackAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftAlongTrackAngle <em>Spacecraft Along Track Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacecraft Along Track Angle</em>' attribute.
	 * @see #getSpacecraftAlongTrackAngle()
	 * @generated
	 */
	void setSpacecraftAlongTrackAngle(double value);

	/**
	 * Returns the value of the '<em><b>Spacecraft Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spacecraft Geographical Coordinates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacecraft Coordinates</em>' containment reference.
	 * @see #setSpacecraftCoordinates(GeographicCoordinates)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getVisibilityPassSpacecraftPosition_SpacecraftCoordinates()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None'"
	 * @generated
	 */
	GeographicCoordinates getSpacecraftCoordinates();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition#getSpacecraftCoordinates <em>Spacecraft Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacecraft Coordinates</em>' containment reference.
	 * @see #getSpacecraftCoordinates()
	 * @generated
	 */
	void setSpacecraftCoordinates(GeographicCoordinates value);

} // VisibilityPassSpacecraftPosition
