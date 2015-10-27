/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Types List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.LocalTypesList#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getLocalTypesList()
 * @model
 * @generated
 */
public interface LocalTypesList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.Type}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getLocalTypesList_Types()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='true' property='None'"
	 * @generated
	 */
  EList<Type> getTypes();

} // LocalTypesList
