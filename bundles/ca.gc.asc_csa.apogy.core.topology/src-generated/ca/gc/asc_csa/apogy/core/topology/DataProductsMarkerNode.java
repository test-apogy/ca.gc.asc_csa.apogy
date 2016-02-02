package ca.gc.asc_csa.apogy.core.topology;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.core.PositionedResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Products Marker Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.DataProductsMarkerNode#isVisible <em>Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.DataProductsMarkerNode#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getDataProductsMarkerNode()
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
   * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getDataProductsMarkerNode_Visible()
   * @model unique="false"
   * @generated
   */
  boolean isVisible();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.DataProductsMarkerNode#isVisible <em>Visible</em>}' attribute.
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
   * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getDataProductsMarkerNode_Result()
   * @model
   * @generated
   */
  PositionedResult getResult();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.DataProductsMarkerNode#getResult <em>Result</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' reference.
   * @see #getResult()
   * @generated
   */
  void setResult(PositionedResult value);

} // DataProductsMarkerNode
