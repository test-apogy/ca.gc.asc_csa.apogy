/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.topology;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.core.PositionedResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Products Marker Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.topology.DataProductsMarkerNode#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.topology.DataProductsMarkerNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage#getDataProductsMarkerNode()
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
   * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage#getDataProductsMarkerNode_Visible()
   * @model unique="false"
   * @generated
   */
  boolean isVisible();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.topology.DataProductsMarkerNode#isVisible <em>Visible</em>}' attribute.
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
   * @see org.eclipse.symphony.core.topology.Symphony__CoreTopologyPackage#getDataProductsMarkerNode_Result()
   * @model
   * @generated
   */
  PositionedResult getResult();

  /**
   * Sets the value of the '{@link org.eclipse.symphony.core.topology.DataProductsMarkerNode#getResult <em>Result</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' reference.
   * @see #getResult()
   * @generated
   */
  void setResult(PositionedResult value);

} // DataProductsMarkerNode
