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
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getEarthOrbitSky <em>Earth Orbit Sky</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite()
 * @model
 * @generated
 */
public interface EarthOrbitWorksite extends OrbitWorksite {

	/**
	 * Returns the value of the '<em><b>Earth Orbit Sky</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The EarthOrbitSky associated with the worksite,
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth Orbit Sky</em>' reference.
	 * @see #setEarthOrbitSky(EarthOrbitSky)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite_EarthOrbitSky()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EarthOrbitSky getEarthOrbitSky();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getEarthOrbitSky <em>Earth Orbit Sky</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Orbit Sky</em>' reference.
	 * @see #getEarthOrbitSky()
	 * @generated
	 */
	void setEarthOrbitSky(EarthOrbitSky value);
} // EarthOrbitWorksite
