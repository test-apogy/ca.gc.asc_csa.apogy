/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maps List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.MapsList#getMaps <em>Maps</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.MapsList#getMapsListNode <em>Maps List Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMapsList()
 * @model
 * @generated
 */
public interface MapsList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Maps</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.Map}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' containment reference list.
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMapsList_Maps()
	 * @model containment="true"
	 * @generated
	 */
  EList<Map> getMaps();

  /**
	 * Returns the value of the '<em><b>Maps List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps List Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps List Node</em>' reference.
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getMapsList_MapsListNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  MapsListNode getMapsListNode();

} // MapsList