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
package ca.gc.asc_csa.apogy.core.environment.surface;

import javax.vecmath.Color3f;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slope Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class defining a slope range and its associated color.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeLowerBound <em>Slope Lower Bound</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeUpperBound <em>Slope Upper Bound</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSlopeRange()
 * @model
 * @generated
 */
public interface SlopeRange extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Slope Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lower bound of the slope range. Always positive
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Lower Bound</em>' attribute.
	 * @see #setSlopeLowerBound(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSlopeRange_SlopeLowerBound()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' apogy_units='deg'"
	 * @generated
	 */
	double getSlopeLowerBound();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeLowerBound <em>Slope Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Lower Bound</em>' attribute.
	 * @see #getSlopeLowerBound()
	 * @generated
	 */
	void setSlopeLowerBound(double value);

	/**
	 * Returns the value of the '<em><b>Slope Upper Bound</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Upper bound of the slope range. Always positive, and should be larger than slopeLower.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slope Upper Bound</em>' attribute.
	 * @see #setSlopeUpperBound(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSlopeRange_SlopeUpperBound()
	 * @model default="10" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' apogy_units='deg'"
	 * @generated
	 */
	double getSlopeUpperBound();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getSlopeUpperBound <em>Slope Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slope Upper Bound</em>' attribute.
	 * @see #getSlopeUpperBound()
	 * @generated
	 */
	void setSlopeUpperBound(double value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"1.0,1.0,1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The color to use for this slope range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color3f)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSlopeRange_Color()
	 * @model default="1.0,1.0,1.0" unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.surface.Color3f"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable'"
	 * @generated
	 */
	Color3f getColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SlopeRange#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color3f value);

} // SlopeRange
