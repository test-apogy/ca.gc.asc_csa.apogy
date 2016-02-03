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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getValueSource()
 * @model abstract="true"
 * @generated
 */
public interface ValueSource extends EObject
{
  /**
	 * Returns the value of the '<em><b>Binded EData Type Argument</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument#getValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binded EData Type Argument</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Binded EData Type Argument</em>' container reference.
	 * @see #setBindedEDataTypeArgument(BindedEDataTypeArgument)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getValueSource_BindedEDataTypeArgument()
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument#getValueSource
	 * @model opposite="valueSource" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  BindedEDataTypeArgument getBindedEDataTypeArgument();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getBindedEDataTypeArgument <em>Binded EData Type Argument</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binded EData Type Argument</em>' container reference.
	 * @see #getBindedEDataTypeArgument()
	 * @generated
	 */
  void setBindedEDataTypeArgument(BindedEDataTypeArgument value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  Object getSourceValue();

} // ValueSource
