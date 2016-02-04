package ca.gc.asc_csa.apogy.core.invocator;
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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Implementations List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Variables & Type Implementations.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList#getVariableImplementations <em>Variable Implementations</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableImplementationsList()
 * @model
 * @generated
 */
public interface VariableImplementationsList extends EObject
{

  /**
	 * Returns the value of the '<em><b>Variable Implementations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariableImplementationsList <em>Variable Implementations List</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Implementations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Implementations</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableImplementationsList_VariableImplementations()
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableImplementation#getVariableImplementationsList
	 * @model opposite="variableImplementationsList" containment="true"
	 * @generated
	 */
  EList<VariableImplementation> getVariableImplementations();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" variableUnique="false"
	 * @generated
	 */
  VariableImplementation getVariableImplementation(Variable variable);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Searches a {@link VariableImplementation} based on the variable name.
	 * @param name Search criteria.
	 * @return Reference to the {@link VariableImplementation} or null if not found.
	 * <!-- end-model-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
  VariableImplementation getVariableImplementation(String name);
} // VariableImplementationsList
