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

import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an Orbit around the Earth.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit#getInitialOrbitBasedEarthOrbitModel <em>Initial Orbit Based Earth Orbit Model</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbit()
 * @model abstract="true"
 * @generated
 */
public interface EarthOrbit extends Orbit {

	/**
	 * Returns the value of the '<em><b>Initial Orbit Based Earth Orbit Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel#getInitalOrbit <em>Inital Orbit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Orbit Based Earth Orbit Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Orbit Based Earth Orbit Model</em>' container reference.
	 * @see #setInitialOrbitBasedEarthOrbitModel(InitialOrbitBasedEarthOrbitModel)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbit_InitialOrbitBasedEarthOrbitModel()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel#getInitalOrbit
	 * @model opposite="initalOrbit" transient="false"
	 * @generated
	 */
	InitialOrbitBasedEarthOrbitModel getInitialOrbitBasedEarthOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit#getInitialOrbitBasedEarthOrbitModel <em>Initial Orbit Based Earth Orbit Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Orbit Based Earth Orbit Model</em>' container reference.
	 * @see #getInitialOrbitBasedEarthOrbitModel()
	 * @generated
	 */
	void setInitialOrbitBasedEarthOrbitModel(InitialOrbitBasedEarthOrbitModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the underlying OreKit Orbit.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitOrbit" unique="false"
	 * @generated
	 */
	org.orekit.orbits.Orbit getOreKitOrbit();
} // EarthOrbit
