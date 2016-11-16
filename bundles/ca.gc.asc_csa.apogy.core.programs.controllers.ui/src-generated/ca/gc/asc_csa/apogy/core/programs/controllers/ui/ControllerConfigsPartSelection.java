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
package ca.gc.asc_csa.apogy.core.programs.controllers.ui;

import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Configs Part Selection</b></em>'.
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
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection#getControllersConfiguration <em>Controllers Configuration</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage#getControllerConfigsPartSelection()
 * @model
 * @generated
 */
public interface ControllerConfigsPartSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Controllers Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controllers Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers Configuration</em>' reference.
	 * @see #setControllersConfiguration(ControllersConfiguration)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage#getControllerConfigsPartSelection_ControllersConfiguration()
	 * @model
	 * @generated
	 */
	ControllersConfiguration getControllersConfiguration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection#getControllersConfiguration <em>Controllers Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controllers Configuration</em>' reference.
	 * @see #getControllersConfiguration()
	 * @generated
	 */
	void setControllersConfiguration(ControllersConfiguration value);

} // ControllerConfigsPartSelection
