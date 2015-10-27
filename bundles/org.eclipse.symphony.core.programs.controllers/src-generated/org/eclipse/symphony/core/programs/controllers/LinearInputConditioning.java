/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linear Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMaximum <em>Maximum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getLinearInputConditioning()
 * @model
 * @generated
 */
public interface LinearInputConditioning extends AbstractInputConditioning {
	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"-1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(float)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getLinearInputConditioning_Minimum()
	 * @model default="-1.0" unique="false"
	 * @generated
	 */
	float getMinimum();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(float value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(float)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getLinearInputConditioning_Maximum()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	float getMaximum();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.LinearInputConditioning#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(float value);

} // LinearInputScalling
