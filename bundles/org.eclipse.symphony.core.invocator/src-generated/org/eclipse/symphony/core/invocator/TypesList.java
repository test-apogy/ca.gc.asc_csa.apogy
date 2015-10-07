/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Types.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypesList#getLocalTypes <em>Local Types</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypesList#getRegisteredTypes <em>Registered Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getTypesList()
 * @model
 * @generated
 */
public interface TypesList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Local Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Types</em>' containment reference.
	 * @see #setLocalTypes(LocalTypesList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getTypesList_LocalTypes()
	 * @model containment="true"
	 * @generated
	 */
  LocalTypesList getLocalTypes();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.TypesList#getLocalTypes <em>Local Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Types</em>' containment reference.
	 * @see #getLocalTypes()
	 * @generated
	 */
  void setLocalTypes(LocalTypesList value);

  /**
	 * Returns the value of the '<em><b>Registered Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Registered Types</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Types</em>' containment reference.
	 * @see #setRegisteredTypes(RegisteredTypesList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getTypesList_RegisteredTypes()
	 * @model containment="true"
	 * @generated
	 */
  RegisteredTypesList getRegisteredTypes();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.TypesList#getRegisteredTypes <em>Registered Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Types</em>' containment reference.
	 * @see #getRegisteredTypes()
	 * @generated
	 */
  void setRegisteredTypes(RegisteredTypesList value);

} // TypesList
