/**
 */
package ca.gc.asc_csa.apogy.common.emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Reference to an {@link EObject}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.EObjectReference#getEObject <em>EObject</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getEObjectReference()
 * @model
 * @generated
 */
public interface EObjectReference extends EObject {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(EObject)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getEObjectReference_EObject()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.EObjectReference#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

} // EObjectReference
