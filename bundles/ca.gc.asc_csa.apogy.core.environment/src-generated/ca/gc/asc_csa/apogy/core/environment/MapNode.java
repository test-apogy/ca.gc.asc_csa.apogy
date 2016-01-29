/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;

import ca.gc.asc_csa.apogy.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.MapNode#getMap <em>Map</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getMapNode()
 * @model
 * @generated
 */
public interface MapNode extends TransformNode
{
  /**
	 * Returns the value of the '<em><b>Map</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' reference.
	 * @see #setMap(Map)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getMapNode_Map()
	 * @model transient="true"
	 * @generated
	 */
  Map getMap();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.MapNode#getMap <em>Map</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' reference.
	 * @see #getMap()
	 * @generated
	 */
  void setMap(Map value);

} // MapNode