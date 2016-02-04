package ca.gc.asc_csa.apogy.core.programs.controllers;
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
 * A representation of the model object '<em><b>Centered Linear Input Conditioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.CenteredLinearInputConditioning#getDeadBand <em>Dead Band</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCenteredLinearInputConditioning()
 * @model
 * @generated
 */
public interface CenteredLinearInputConditioning extends LinearInputConditioning {
	/**
	 * Returns the value of the '<em><b>Dead Band</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dead Band</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dead Band</em>' attribute.
	 * @see #setDeadBand(float)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCenteredLinearInputConditioning_DeadBand()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	float getDeadBand();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CenteredLinearInputConditioning#getDeadBand <em>Dead Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Band</em>' attribute.
	 * @see #getDeadBand()
	 * @generated
	 */
	void setDeadBand(float value);

} // CenteredLinearInputConditioning
