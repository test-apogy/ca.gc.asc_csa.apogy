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

import ca.gc.asc_csa.apogy.core.environment.Earth;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.Sky;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Sky</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the Sky as seen from an EarthOrbitWorksite.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getMoon <em>Moon</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarth <em>Earth</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitSky()
 * @model
 * @generated
 */
public interface EarthOrbitSky extends Sky {
	/**
	 * Returns the value of the '<em><b>Earth Orbit Worksite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worksite to which the sky is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth Orbit Worksite</em>' container reference.
	 * @see #setEarthOrbitWorksite(EarthOrbitWorksite)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitSky_EarthOrbitWorksite()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitWorksite#getSky
	 * @model opposite="sky" transient="false"
	 * @generated
	 */
	EarthOrbitWorksite getEarthOrbitWorksite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Orbit Worksite</em>' container reference.
	 * @see #getEarthOrbitWorksite()
	 * @generated
	 */
	void setEarthOrbitWorksite(EarthOrbitWorksite value);

	/**
	 * Returns the value of the '<em><b>Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Moon in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moon</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitSky_Moon()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON'"
	 * @generated
	 */
	Moon getMoon();

	/**
	 * Returns the value of the '<em><b>Earth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Earth in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEarthOrbitSky_Earth()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EARTH'"
	 * @generated
	 */
	Earth getEarth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Moon angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON' apogy_units='rad'"
	 * @generated
	 */
	double getMoonAngularDiameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Earth angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EARTH' apogy_units='rad'"
	 * @generated
	 */
	double getEarthAngularDiameter();

} // EarthOrbitSky
