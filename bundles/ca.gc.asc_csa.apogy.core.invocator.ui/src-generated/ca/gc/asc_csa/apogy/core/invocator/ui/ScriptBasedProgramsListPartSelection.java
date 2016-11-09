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

import ca.gc.asc_csa.apogy.core.invocator.Program;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Based Programs List Part Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Selections for part dependency injection
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.ScriptBasedProgramsListPartSelection#getProgram <em>Program</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getScriptBasedProgramsListPartSelection()
 * @model
 * @generated
 */
public interface ScriptBasedProgramsListPartSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' reference.
	 * @see #setProgram(Program)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getScriptBasedProgramsListPartSelection_Program()
	 * @model
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.ScriptBasedProgramsListPartSelection#getProgram <em>Program</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

} // ScriptBasedProgramsListPartSelection
