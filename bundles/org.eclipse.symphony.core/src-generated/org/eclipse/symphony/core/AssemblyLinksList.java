/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assembly Links List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.AssemblyLinksList#getAssemblyLinks <em>Assembly Links</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.Symphony__CorePackage#getAssemblyLinksList()
 * @model
 * @generated
 */
public interface AssemblyLinksList extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.AssemblyLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Links</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Links</em>' containment reference list.
	 * @see org.eclipse.symphony.core.Symphony__CorePackage#getAssemblyLinksList_AssemblyLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyLink> getAssemblyLinks();

} // AssemblyLinksList
