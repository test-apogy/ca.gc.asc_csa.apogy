package ca.gc.asc_csa.apogy.common.math;
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
 * A representation of the model object '<em><b>Polynomial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getDegree <em>Degree</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getCoeffs <em>Coeffs</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getRealRoots <em>Real Roots</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getImaginaryRoots <em>Imaginary Roots</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getPolynomial()
 * @model
 * @generated
 */
public interface Polynomial extends EObject {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getPolynomial_Degree()
	 * @model default="0" unique="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	int getDegree();

	/**
	 * Returns the value of the '<em><b>Coeffs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coefficients of the polynomial, sorted in increasing order.
	 * coeffs[n-1]*x^n-1 + coeffs[n-2]*x^n-2 + ... + coeffs[0].
	 * 
	 * For instance: polynomial 3*x^2 + 5*x + 2, the coefficients would be:
	 * coeffs = { 2, 5, 3 }.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coeffs</em>' attribute.
	 * @see #setCoeffs(double[])
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getPolynomial_Coeffs()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.math.EDoubleArray"
	 * @generated
	 */
	double[] getCoeffs();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.math.Polynomial#getCoeffs <em>Coeffs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coeffs</em>' attribute.
	 * @see #getCoeffs()
	 * @generated
	 */
	void setCoeffs(double[] value);

	/**
	 * Returns the value of the '<em><b>Real Roots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real Roots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Roots</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getPolynomial_RealRoots()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.math.EDoubleArray" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double[] getRealRoots();

	/**
	 * Returns the value of the '<em><b>Imaginary Roots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imaginary Roots</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imaginary Roots</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage#getPolynomial_ImaginaryRoots()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.math.EDoubleArray" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double[] getImaginaryRoots();

} // Polynomial
