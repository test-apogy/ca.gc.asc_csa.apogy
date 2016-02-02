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

import ca.gc.asc_csa.apogy.core.invocator.Argument;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binded EData Type Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Value Source
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument#getValueSource <em>Value Source</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getBindedEDataTypeArgument()
 * @model
 * @generated
 */
public interface BindedEDataTypeArgument extends Argument
{
  /**
	 * Returns the value of the '<em><b>Value Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Source</em>' containment reference.
	 * @see #setValueSource(ValueSource)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getBindedEDataTypeArgument_ValueSource()
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getBindedEDataTypeArgument
	 * @model opposite="bindedEDataTypeArgument" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None'"
	 * @generated
	 */
  ValueSource getValueSource();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument#getValueSource <em>Value Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Source</em>' containment reference.
	 * @see #getValueSource()
	 * @generated
	 */
  void setValueSource(ValueSource value);

} // BindedEDataTypeArgument
