/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Types List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.LocalTypesList#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getLocalTypesList()
 * @model
 * @generated
 */
public interface LocalTypesList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.Type}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getLocalTypesList_Types()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='true' property='None'"
	 * @generated
	 */
  EList<Type> getTypes();

} // LocalTypesList
