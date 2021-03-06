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

import ca.gc.asc_csa.apogy.common.math.Matrix3x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a ground station and its associated Field Of View.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getFieldOfViewOrientation <em>Field Of View Orientation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getGroundStation()
 * @model
 * @generated
 */
public interface GroundStation extends EarthSurfaceLocation {
	/**
	 * Returns the value of the '<em><b>Field Of View Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Of View Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orientation of the field of view relative
	 * to the Ground Station frame.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Of View Orientation</em>' containment reference.
	 * @see #setFieldOfViewOrientation(Matrix3x3)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getGroundStation_FieldOfViewOrientation()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	Matrix3x3 getFieldOfViewOrientation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getFieldOfViewOrientation <em>Field Of View Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View Orientation</em>' containment reference.
	 * @see #getFieldOfViewOrientation()
	 * @generated
	 */
	void setFieldOfViewOrientation(Matrix3x3 value);

	/**
	 * Returns the value of the '<em><b>Elevation Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The elevation mask of the Ground Station.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation Mask</em>' containment reference.
	 * @see #setElevationMask(ElevationMask)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getGroundStation_ElevationMask()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	ElevationMask getElevationMask();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation#getElevationMask <em>Elevation Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Mask</em>' containment reference.
	 * @see #getElevationMask()
	 * @generated
	 */
	void setElevationMask(ElevationMask value);

} // GroundStation
