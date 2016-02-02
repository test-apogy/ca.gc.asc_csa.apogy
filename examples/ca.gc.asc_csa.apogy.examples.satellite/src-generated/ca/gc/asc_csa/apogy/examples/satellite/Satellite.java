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

import ca.gc.asc_csa.apogy.common.emf.Named;

import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that defines the properties of a specific satellite.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRollRate <em>Maximum Roll Rate</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRoll <em>Maximum Roll</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getSatellite()
 * @model
 * @generated
 */
public interface Satellite extends Named {
	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the {@link OrbitModel}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Model</em>' reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getSatellite_OrbitModel()
	 * @model
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getOrbitModel <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

	/**
	 * Returns the value of the '<em><b>Maximum Roll Rate</b></em>' attribute.
	 * The default value is <code>"0.017452778"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The satellite maximum roll rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Roll Rate</em>' attribute.
	 * @see #setMaximumRollRate(double)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getSatellite_MaximumRollRate()
	 * @model default="0.017452778" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad/s'"
	 * @generated
	 */
	double getMaximumRollRate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRollRate <em>Maximum Roll Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Roll Rate</em>' attribute.
	 * @see #getMaximumRollRate()
	 * @generated
	 */
	void setMaximumRollRate(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Roll</b></em>' attribute.
	 * The default value is <code>"0.087"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The satellite maximum roll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Roll</em>' attribute.
	 * @see #setMaximumRoll(double)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getSatellite_MaximumRoll()
	 * @model default="0.087" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getMaximumRoll();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.Satellite#getMaximumRoll <em>Maximum Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Roll</em>' attribute.
	 * @see #getMaximumRoll()
	 * @generated
	 */
	void setMaximumRoll(double value);

} // Satellite
