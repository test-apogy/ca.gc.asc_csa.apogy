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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Based TLE Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator#getTleURL <em>Tle URL</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getURLBasedTLEEarthOrbitPropagator()
 * @model
 * @generated
 */
public interface URLBasedTLEEarthOrbitPropagator extends TLEEarthOrbitPropagator {
	/**
	 * Returns the value of the '<em><b>Tle URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URl pointing to the source of the TLE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tle URL</em>' attribute.
	 * @see #setTleURL(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getURLBasedTLEEarthOrbitPropagator_TleURL()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='TLE_RAW_DATA' notify='true'"
	 * @generated
	 */
	String getTleURL();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator#getTleURL <em>Tle URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tle URL</em>' attribute.
	 * @see #getTleURL()
	 * @generated
	 */
	void setTleURL(String value);

} // URLBasedTLEEarthOrbitPropagator
