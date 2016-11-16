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

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Bindings Part Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage#getControllerBindingsPartSelection()
 * @model
 * @generated
 */
public interface ControllerBindingsPartSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Call Controller Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Call Controller Binding</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call Controller Binding</em>' reference.
	 * @see #setOperationCallControllerBinding(OperationCallControllerBinding)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIPackage#getControllerBindingsPartSelection_OperationCallControllerBinding()
	 * @model
	 * @generated
	 */
	OperationCallControllerBinding getOperationCallControllerBinding();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call Controller Binding</em>' reference.
	 * @see #getOperationCallControllerBinding()
	 * @generated
	 */
	void setOperationCallControllerBinding(OperationCallControllerBinding value);

} // ControllerBindingsPartSelection
