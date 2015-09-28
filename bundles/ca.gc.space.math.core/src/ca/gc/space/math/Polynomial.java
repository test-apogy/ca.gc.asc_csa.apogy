/**
 * <copyright>
 * </copyright>
 *
 */
package ca.gc.space.math;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polynomial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.math.Polynomial#getDegree <em>Degree</em>}</li>
 *   <li>{@link ca.gc.space.math.Polynomial#getCoeffs <em>Coeffs</em>}</li>
 *   <li>{@link ca.gc.space.math.Polynomial#getRealRoots <em>Real Roots</em>}</li>
 *   <li>{@link ca.gc.space.math.Polynomial#getImaginaryRoots <em>Imaginary Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.math.MathPackage#getPolynomial()
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
	 * @see ca.gc.space.math.MathPackage#getPolynomial_Degree()
	 * @model default="0" transient="true" changeable="false" volatile="true"
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
	 * @see ca.gc.space.math.MathPackage#getPolynomial_Coeffs()
	 * @model dataType="ca.gc.space.math.EDoubleArray"
	 * @generated
	 */
	double[] getCoeffs();

	/**
	 * Sets the value of the '{@link ca.gc.space.math.Polynomial#getCoeffs <em>Coeffs</em>}' attribute.
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
	 * @see ca.gc.space.math.MathPackage#getPolynomial_RealRoots()
	 * @model dataType="ca.gc.space.math.EDoubleArray" transient="true" changeable="false" derived="true"
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
	 * @see ca.gc.space.math.MathPackage#getPolynomial_ImaginaryRoots()
	 * @model dataType="ca.gc.space.math.EDoubleArray" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	double[] getImaginaryRoots();

} // Polynomial
