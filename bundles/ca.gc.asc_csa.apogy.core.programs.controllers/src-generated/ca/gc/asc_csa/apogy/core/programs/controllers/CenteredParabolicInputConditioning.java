/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Centered Parabolic Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.CenteredParabolicInputConditioning#getDeadBand <em>Dead Band</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCenteredParabolicInputConditioning()
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
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getCenteredParabolicInputConditioning_DeadBand()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	float getDeadBand();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CenteredParabolicInputConditioning#getDeadBand <em>Dead Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dead Band</em>' attribute.
	 * @see #getDeadBand()
	 * @generated
	 */
	void setDeadBand(float value);

} // CenteredParabolicInputScalling
