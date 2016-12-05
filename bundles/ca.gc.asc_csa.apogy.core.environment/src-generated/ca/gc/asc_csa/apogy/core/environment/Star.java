/**
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
package ca.gc.asc_csa.apogy.core.environment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A star.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Star#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getStar()
 * @model
 * @generated
 */
public interface Star extends EObject {
	/**
	 * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnitude</em>' attribute.
	 * @see #setMagnitude(float)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getStar_Magnitude()
	 * @model unique="false"
	 * @generated
	 */
	float getMagnitude();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Star#getMagnitude <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnitude</em>' attribute.
	 * @see #getMagnitude()
	 * @generated
	 */
	void setMagnitude(float value);

	/**
	 * Returns the value of the '<em><b>Equatorial Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Equatorial Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equatorial Coordinates</em>' reference.
	 * @see #setEquatorialCoordinates(EquatorialCoordinates)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getStar_EquatorialCoordinates()
	 * @model transient="true"
	 * @generated
	 */
	EquatorialCoordinates getEquatorialCoordinates();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.Star#getEquatorialCoordinates <em>Equatorial Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equatorial Coordinates</em>' reference.
	 * @see #getEquatorialCoordinates()
	 * @generated
	 */
	void setEquatorialCoordinates(EquatorialCoordinates value);

} // Star
