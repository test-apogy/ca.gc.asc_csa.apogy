/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Input Conditioning Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getCustomInputConditioningPoint()
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
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getCustomInputConditioningPoint_InputValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getInputValue();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getInputValue <em>Input Value</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getCustomInputConditioningPoint_OutputValue()
	 * @model default="0" unique="false"
	 * @generated
	 */
	double getOutputValue();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint#getOutputValue <em>Output Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Value</em>' attribute.
	 * @see #getOutputValue()
	 * @generated
	 */
	void setOutputValue(double value);

} // CustomInputConditioningPoint
