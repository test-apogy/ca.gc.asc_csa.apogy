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

import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a worksite in orbit. The reference frame used is inertial (J2000), with its origin at the current orbital position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getEarthLocations <em>Earth Locations</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite()
 * @model
 * @generated
 */
public interface EarthOrbitWorksite extends OrbitWorksite {

	/**
	 * Returns the value of the '<em><b>Sky</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sky</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky</em>' containment reference.
	 * @see #setSky(EarthOrbitSky)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite_Sky()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite
	 * @model opposite="earthOrbitWorksite" containment="true"
	 * @generated
	 */
	EarthOrbitSky getSky();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky</em>' containment reference.
	 * @see #getSky()
	 * @generated
	 */
	void setSky(EarthOrbitSky value);

	/**
	 * Returns the value of the '<em><b>Earth Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earth Locations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of surface location associated with the site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth Locations</em>' containment reference.
	 * @see #setEarthLocations(EarthSurfaceLocationList)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite_EarthLocations()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
	EarthSurfaceLocationList getEarthLocations();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getEarthLocations <em>Earth Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Locations</em>' containment reference.
	 * @see #getEarthLocations()
	 * @generated
	 */
	void setEarthLocations(EarthSurfaceLocationList value);
} // EarthOrbitWorksite
