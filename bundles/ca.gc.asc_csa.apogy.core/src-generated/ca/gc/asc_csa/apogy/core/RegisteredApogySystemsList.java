/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Registered Apogy Systems List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.RegisteredApogySystemsList#getApogySystems <em>Apogy Systems</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getRegisteredApogySystemsList()
 * @model
 * @generated
 */
public interface RegisteredApogySystemsList extends EObject {
	/**
   * Returns the value of the '<em><b>Apogy Systems</b></em>' reference list.
   * The list contents are of type {@link ca.gc.asc_csa.apogy.core.ApogySystem}.
   * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Apogy Systems</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Apogy Systems</em>' reference list.
   * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getRegisteredApogySystemsList_ApogySystems()
   * @model transient="true" changeable="false" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='false' property='None'"
   * @generated
   */
	EList<ApogySystem> getApogySystems();

} // RegisteredApogySystemsList
