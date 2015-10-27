/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Maps List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.MapsListNode#getMapsList <em>Maps List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getMapsListNode()
 * @model
 * @generated
 */
public interface MapsListNode extends AggregateGroupNode
{
  /**
	 * Returns the value of the '<em><b>Maps List</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps List</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps List</em>' reference.
	 * @see #setMapsList(MapsList)
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getMapsListNode_MapsList()
	 * @model transient="true"
	 * @generated
	 */
  MapsList getMapsList();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.MapsListNode#getMapsList <em>Maps List</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps List</em>' reference.
	 * @see #getMapsList()
	 * @generated
	 */
  void setMapsList(MapsList value);

} // MapsListNode
