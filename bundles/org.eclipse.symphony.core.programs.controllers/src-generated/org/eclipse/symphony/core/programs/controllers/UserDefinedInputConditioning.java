/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Input Conditioning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getTransferFunction <em>Transfer Function</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getUserDefinedInputConditioning()
 * @model
 * @generated
 */
public interface UserDefinedInputConditioning extends AbstractInputConditioning {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getUserDefinedInputConditioning_Units()
	 * @model default="" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.UserDefinedInputConditioning#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Transfer Function</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Function</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Function</em>' containment reference list.
	 * @see org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage#getUserDefinedInputConditioning_TransferFunction()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	EList<CustomInputConditioningPoint> getTransferFunction();

} // UserDefinedInputConditioning
