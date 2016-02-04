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
import org.eclipse.emf.ecore.EParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter EComponent Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.EParameterEComponentPair#getEParameter <em>EParameter</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.EParameterEComponentPair#getValueSource <em>Value Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getEParameterEComponentPair()
 * @model
 * @generated
 */
public interface EParameterEComponentPair extends EObject
{
  /**
   * Returns the value of the '<em><b>EParameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EParameter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EParameter</em>' reference.
   * @see #setEParameter(EParameter)
   * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getEParameterEComponentPair_EParameter()
   * @model required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
   * @generated
   */
  EParameter getEParameter();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.EParameterEComponentPair#getEParameter <em>EParameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EParameter</em>' reference.
   * @see #getEParameter()
   * @generated
   */
  void setEParameter(EParameter value);

  /**
   * Returns the value of the '<em><b>Value Source</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getPair <em>Pair</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Source</em>' containment reference.
   * @see #setValueSource(ValueSource)
   * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getEParameterEComponentPair_ValueSource()
   * @see ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource#getPair
   * @model opposite="pair" containment="true" required="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
   * @generated
   */
  ValueSource getValueSource();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.EParameterEComponentPair#getValueSource <em>Value Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Source</em>' containment reference.
   * @see #getValueSource()
   * @generated
   */
  void setValueSource(ValueSource value);

} // EParameterEComponentPair
