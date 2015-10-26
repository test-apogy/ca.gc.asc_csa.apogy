/**
 */
package org.eclipse.symphony.common.emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Named Element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.Named#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getNamed()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Named extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getNamed_Name()
	 * @model unique="false"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.Named#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Named
