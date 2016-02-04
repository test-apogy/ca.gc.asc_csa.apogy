package ca.gc.asc_csa.apogy.examples.satellite;
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

import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbital Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an orbital image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getOrbitalImage()
 * @model
 * @generated
 */
public interface OrbitalImage extends EImage {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(GeographicCoordinates)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getOrbitalImage_Coordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeographicCoordinates getCoordinates();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(GeographicCoordinates value);

	/**
	 * Returns the value of the '<em><b>Roll Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Angle</em>' attribute.
	 * @see #setRollAngle(double)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getOrbitalImage_RollAngle()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getRollAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.OrbitalImage#getRollAngle <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Angle</em>' attribute.
	 * @see #getRollAngle()
	 * @generated
	 */
	void setRollAngle(double value);

} // OrbitalImage
