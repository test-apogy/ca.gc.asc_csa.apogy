/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.topology;

import ca.gc.asc_csa.symphony.core.PositionedResult;
import ca.gc.space.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Products Marker Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.topology.DataProductsMarkerNode#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.topology.DataProductsMarkerNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#getDataProductsMarkerNode()
 * @model
 * @generated
 */
public interface DataProductsMarkerNode extends Node
{
  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(boolean)
   * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#getDataProductsMarkerNode_Visible()
   * @model unique="false"
   * @generated
   */
  boolean isVisible();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.symphony.topology.DataProductsMarkerNode#isVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #isVisible()
   * @generated
   */
  void setVisible(boolean value);

  /**
   * Returns the value of the '<em><b>Result</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' reference.
   * @see #setResult(PositionedResult)
   * @see ca.gc.asc_csa.symphony.topology.SymphonyTopologyPackage#getDataProductsMarkerNode_Result()
   * @model
   * @generated
   */
  PositionedResult getResult();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.symphony.topology.DataProductsMarkerNode#getResult <em>Result</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' reference.
   * @see #getResult()
   * @generated
   */
  void setResult(PositionedResult value);

} // DataProductsMarkerNode
