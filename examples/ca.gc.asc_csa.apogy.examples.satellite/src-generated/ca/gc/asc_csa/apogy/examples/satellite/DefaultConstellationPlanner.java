/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Constellation Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Default Implementation of {@link AbstractConstellationPlanner}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isUmbraPassesValid <em>Umbra Passes Valid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isSatelliteRollCommandValid <em>Satellite Roll Command Valid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#getSunHorizonAngleUmbraThreshold <em>Sun Horizon Angle Umbra Threshold</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getDefaultConstellationPlanner()
 * @model
 * @generated
 */
public interface DefaultConstellationPlanner extends AbstractConstellationPlanner {

	/**
	 * Returns the value of the '<em><b>Umbra Passes Valid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if a pass that occurs in umbra must be considered by the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umbra Passes Valid</em>' attribute.
	 * @see #setUmbraPassesValid(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getDefaultConstellationPlanner_UmbraPassesValid()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISIBILITY_PASS_VALIDITY'"
	 * @generated
	 */
	boolean isUmbraPassesValid();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isUmbraPassesValid <em>Umbra Passes Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umbra Passes Valid</em>' attribute.
	 * @see #isUmbraPassesValid()
	 * @generated
	 */
	void setUmbraPassesValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Satellite Roll Command Valid</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if a pass that requires roll command to ensure coverage must be considered by the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite Roll Command Valid</em>' attribute.
	 * @see #setSatelliteRollCommandValid(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getDefaultConstellationPlanner_SatelliteRollCommandValid()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISIBILITY_PASS_VALIDITY'"
	 * @generated
	 */
	boolean isSatelliteRollCommandValid();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#isSatelliteRollCommandValid <em>Satellite Roll Command Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite Roll Command Valid</em>' attribute.
	 * @see #isSatelliteRollCommandValid()
	 * @generated
	 */
	void setSatelliteRollCommandValid(boolean value);

	/**
	 * Returns the value of the '<em><b>Sun Horizon Angle Umbra Threshold</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the angle threshold value the planner uses to determine the umbra.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sun Horizon Angle Umbra Threshold</em>' attribute.
	 * @see #setSunHorizonAngleUmbraThreshold(double)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getDefaultConstellationPlanner_SunHorizonAngleUmbraThreshold()
	 * @model default="5.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISIBILITY_PASS_VALIDITY' apogy_units='deg'"
	 * @generated
	 */
	double getSunHorizonAngleUmbraThreshold();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner#getSunHorizonAngleUmbraThreshold <em>Sun Horizon Angle Umbra Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Horizon Angle Umbra Threshold</em>' attribute.
	 * @see #getSunHorizonAngleUmbraThreshold()
	 * @generated
	 */
	void setSunHorizonAngleUmbraThreshold(double value);
} // DefaultConstellationPlanner
