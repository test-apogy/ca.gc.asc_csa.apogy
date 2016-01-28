/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypesList#getLocalTypes <em>Local Types</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypesList#getRegisteredTypes <em>Registered Types</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesList()
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesList_LocalTypes()
	 * @model containment="true"
	 * @generated
	 */
  LocalTypesList getLocalTypes();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypesList#getLocalTypes <em>Local Types</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypesList_RegisteredTypes()
	 * @model containment="true"
	 * @generated
	 */
  RegisteredTypesList getRegisteredTypes();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypesList#getRegisteredTypes <em>Registered Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Types</em>' containment reference.
	 * @see #getRegisteredTypes()
	 * @generated
	 */
  void setRegisteredTypes(RegisteredTypesList value);

} // TypesList
