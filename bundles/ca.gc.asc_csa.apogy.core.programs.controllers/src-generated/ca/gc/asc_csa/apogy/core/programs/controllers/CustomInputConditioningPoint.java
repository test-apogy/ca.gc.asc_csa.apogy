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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Input Conditioning Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCustomInputConditioningPoint()
 * @model
 * @generated
 */
public interface CustomInputConditioningPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Value</em>' attribute.
	 * @see #setInputValue(double)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCustomInputConditioningPoint_InputValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getInputValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint#getInputValue <em>Input Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Value</em>' attribute.
	 * @see #getInputValue()
	 * @generated
	 */
	void setInputValue(double value);

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Value</em>' attribute.
	 * @see #setOutputValue(double)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCustomInputConditioningPoint_OutputValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getOutputValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint#getOutputValue <em>Output Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Value</em>' attribute.
	 * @see #getOutputValue()
	 * @generated
	 */
	void setOutputValue(double value);

} // CustomInputConditioningPoint
