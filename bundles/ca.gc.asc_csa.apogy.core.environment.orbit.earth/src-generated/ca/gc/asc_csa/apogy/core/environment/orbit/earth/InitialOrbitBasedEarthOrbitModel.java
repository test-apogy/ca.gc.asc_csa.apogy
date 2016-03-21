/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial Orbit Based Earth Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel#getInitalOrbit <em>Inital Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel#getPropagator <em>Propagator</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getInitialOrbitBasedEarthOrbitModel()
 * @model
 * @generated
 */
public interface InitialOrbitBasedEarthOrbitModel extends EarthOrbitModel {
	/**
	 * Returns the value of the '<em><b>Inital Orbit</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit#getInitialOrbitBasedEarthOrbitModel <em>Initial Orbit Based Earth Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inital Orbit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inital Orbit</em>' containment reference.
	 * @see #setInitalOrbit(EarthOrbit)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getInitialOrbitBasedEarthOrbitModel_InitalOrbit()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbit#getInitialOrbitBasedEarthOrbitModel
	 * @model opposite="initialOrbitBasedEarthOrbitModel" containment="true"
	 * @generated
	 */
	EarthOrbit getInitalOrbit();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel#getInitalOrbit <em>Inital Orbit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inital Orbit</em>' containment reference.
	 * @see #getInitalOrbit()
	 * @generated
	 */
	void setInitalOrbit(EarthOrbit value);

	/**
	 * Returns the value of the '<em><b>Propagator</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getInitialOrbitBasedEarthOrbitModel <em>Initial Orbit Based Earth Orbit Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagator</em>' containment reference.
	 * @see #setPropagator(EarthOrbitPropagator)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getInitialOrbitBasedEarthOrbitModel_Propagator()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getInitialOrbitBasedEarthOrbitModel
	 * @model opposite="initialOrbitBasedEarthOrbitModel" containment="true"
	 * @generated
	 */
	EarthOrbitPropagator getPropagator();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel#getPropagator <em>Propagator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagator</em>' containment reference.
	 * @see #getPropagator()
	 * @generated
	 */
	void setPropagator(EarthOrbitPropagator value);

} // InitialOrbitBasedEarthOrbitModel
