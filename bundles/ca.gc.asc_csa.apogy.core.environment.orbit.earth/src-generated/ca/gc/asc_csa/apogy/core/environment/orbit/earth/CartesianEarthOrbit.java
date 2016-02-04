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

import ca.gc.asc_csa.apogy.core.environment.orbit.TimedStampedPVACoordinates;
import org.orekit.orbits.CartesianOrbit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getPvaCoordinates <em>Pva Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getCartesianEarthOrbit()
 * @model
 * @generated
 */
public interface CartesianEarthOrbit extends EarthOrbit {
	/**
	 * Returns the value of the '<em><b>Pva Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pva Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pva Coordinates</em>' containment reference.
	 * @see #setPvaCoordinates(TimedStampedPVACoordinates)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getCartesianEarthOrbit_PvaCoordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimedStampedPVACoordinates getPvaCoordinates();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CartesianEarthOrbit#getPvaCoordinates <em>Pva Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pva Coordinates</em>' containment reference.
	 * @see #getPvaCoordinates()
	 * @generated
	 */
	void setPvaCoordinates(TimedStampedPVACoordinates value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitCartesianOrbit" unique="false"
	 * @generated
	 */
	CartesianOrbit getOreKitCartesianOrbit();

} // CartesianEarthOrbit
