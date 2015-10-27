/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Registered Symphony Systems List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.RegisteredSymphonySystemsList#getSymphonySystems <em>Symphony Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.Symphony__CorePackage#getRegisteredSymphonySystemsList()
 * @model
 * @generated
 */
public interface RegisteredSymphonySystemsList extends EObject {
	/**
   * Returns the value of the '<em><b>Symphony Systems</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.symphony.core.SymphonySystem}.
   * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Symphony Systems</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Symphony Systems</em>' reference list.
   * @see org.eclipse.symphony.core.Symphony__CorePackage#getRegisteredSymphonySystemsList_SymphonySystems()
   * @model transient="true" changeable="false" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='false' property='None'"
   * @generated
   */
	EList<SymphonySystem> getSymphonySystems();

} // RegisteredSymphonySystemsList
