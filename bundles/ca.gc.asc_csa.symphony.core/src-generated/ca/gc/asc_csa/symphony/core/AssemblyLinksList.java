/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Assembly Links List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.AssemblyLinksList#getAssemblyLinks <em>Assembly Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getAssemblyLinksList()
 * @model
 * @generated
 */
public interface AssemblyLinksList extends EObject {
	/**
	 * Returns the value of the '<em><b>Assembly Links</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.core.AssemblyLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Links</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Links</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getAssemblyLinksList_AssemblyLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AssemblyLink> getAssemblyLinks();

} // AssemblyLinksList
