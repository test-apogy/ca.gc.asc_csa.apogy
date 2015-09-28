/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parabolic Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getParabolicInputConditioning()
 * @model
 * @generated
 */
public interface ParabolicInputConditioning extends AbstractInputConditioning
{

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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getParabolicInputConditioning_Minimum()
	 * @model default="-1.0" unique="false"
	 * @generated
	 */
	float getMinimum();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning#getMinimum <em>Minimum</em>}' attribute.
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
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage#getParabolicInputConditioning_Maximum()
	 * @model default="1.0" unique="false"
	 * @generated
	 */
	float getMaximum();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.ParabolicInputConditioning#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(float value);
} // ParabolicInputScalling
