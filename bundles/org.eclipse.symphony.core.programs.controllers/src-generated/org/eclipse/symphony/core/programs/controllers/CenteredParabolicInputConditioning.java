/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centered Parabolic Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning#getDeadBand <em>Dead Band</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getCenteredParabolicInputConditioning()
 * @model
 * @generated
 */
public interface CenteredParabolicInputConditioning extends ParabolicInputConditioning {
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
	 * @see org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage#getCenteredParabolicInputConditioning_DeadBand()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	float getDeadBand();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning#getDeadBand <em>Dead Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Band</em>' attribute.
	 * @see #getDeadBand()
	 * @generated
	 */
	void setDeadBand(float value);

} // CenteredParabolicInputScalling
