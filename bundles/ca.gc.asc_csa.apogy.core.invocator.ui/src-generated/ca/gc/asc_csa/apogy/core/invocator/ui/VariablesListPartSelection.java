/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.ui;

import ca.gc.asc_csa.apogy.core.invocator.Variable;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables List Part Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getVariablesListPartSelection()
 * @model
 * @generated
 */
public interface VariablesListPartSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute.
	 * @see #setVariables(List)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getVariablesListPartSelection_Variables()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.invocator.ui.VariablesList"
	 * @generated
	 */
	List<Variable> getVariables();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.VariablesListPartSelection#getVariables <em>Variables</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables</em>' attribute.
	 * @see #getVariables()
	 * @generated
	 */
	void setVariables(List<Variable> value);

} // VariablesListPartSelection
