package ca.gc.asc_csa.apogy.core.programs.controllers;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Edge Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerEdgeTrigger()
 * @model
 * @generated
 */
public interface ControllerEdgeTrigger extends ControllerTrigger
{
  /**
	 * Returns the value of the '<em><b>Edge Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edge Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType
	 * @see #setEdgeType(EdgeType)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerEdgeTrigger_EdgeType()
	 * @model unique="false"
	 * @generated
	 */
  EdgeType getEdgeType();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger#getEdgeType <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType
	 * @see #getEdgeType()
	 * @generated
	 */
  void setEdgeType(EdgeType value);

} // ControllerEdgeTrigger
