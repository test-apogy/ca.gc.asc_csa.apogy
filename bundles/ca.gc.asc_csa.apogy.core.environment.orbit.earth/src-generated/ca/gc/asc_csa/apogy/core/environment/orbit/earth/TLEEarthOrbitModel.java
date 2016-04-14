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

import ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLE Earth Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel#getTle <em>Tle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel#getTleValidityPeriod <em>Tle Validity Period</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitModel()
 * @model
 * @generated
 */
public interface TLEEarthOrbitModel extends EarthOrbitModel, ValidityRangeProvider {
	/**
	 * Returns the value of the '<em><b>Tle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Two-Line Elements used by this propagator.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tle</em>' containment reference.
	 * @see #setTle(TLE)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitModel_Tle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TLE getTle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel#getTle <em>Tle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tle</em>' containment reference.
	 * @see #getTle()
	 * @generated
	 */
	void setTle(TLE value);

	/**
	 * Returns the value of the '<em><b>Tle Validity Period</b></em>' attribute.
	 * The default value is <code>"86400000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TLE Validity Period in ms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tle Validity Period</em>' attribute.
	 * @see #setTleValidityPeriod(long)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLEEarthOrbitModel_TleValidityPeriod()
	 * @model default="86400000" unique="false"
	 * @generated
	 */
	long getTleValidityPeriod();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel#getTleValidityPeriod <em>Tle Validity Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tle Validity Period</em>' attribute.
	 * @see #getTleValidityPeriod()
	 * @generated
	 */
	void setTleValidityPeriod(long value);

} // TLEEarthOrbitModel
