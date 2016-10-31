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

import ca.gc.asc_csa.apogy.core.invocator.OperationCall;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Controller Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding#isCreateResult <em>Create Result</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding#isActive <em>Active</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getOperationCallControllerBinding()
 * @model
 * @generated
 */
public interface OperationCallControllerBinding extends OperationCall
{
  /**
	 * Returns the value of the '<em><b>Create Result</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to generate a result when binding is called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Create Result</em>' attribute.
	 * @see #setCreateResult(boolean)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getOperationCallControllerBinding_CreateResult()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
	boolean isCreateResult();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding#isCreateResult <em>Create Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Result</em>' attribute.
	 * @see #isCreateResult()
	 * @generated
	 */
	void setCreateResult(boolean value);

		/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getOperationCallControllerBinding_Active()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  boolean isActive();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
  void setActive(boolean value);

  /**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.programs.controllers.Trigger#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(Trigger)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getOperationCallControllerBinding_Trigger()
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.Trigger#getOperationCallControllerBinding
	 * @model opposite="operationCallControllerBinding" containment="true" required="true"
	 * @generated
	 */
  Trigger getTrigger();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
  void setTrigger(Trigger value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void update();

} // OperationCallControllerBinding
