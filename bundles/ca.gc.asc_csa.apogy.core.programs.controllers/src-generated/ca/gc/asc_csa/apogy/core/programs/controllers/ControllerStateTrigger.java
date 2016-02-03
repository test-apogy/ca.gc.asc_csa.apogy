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
 * A representation of the model object '<em><b>Controller State Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger#isEnablingValue <em>Enabling Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger#getRepeatPeriod <em>Repeat Period</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerStateTrigger()
 * @model
 * @generated
 */
public interface ControllerStateTrigger extends ControllerTrigger
{
  /**
	 * Returns the value of the '<em><b>Enabling Value</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabling Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of controller input that will enable the binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enabling Value</em>' attribute.
	 * @see #setEnablingValue(boolean)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerStateTrigger_EnablingValue()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isEnablingValue();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger#isEnablingValue <em>Enabling Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabling Value</em>' attribute.
	 * @see #isEnablingValue()
	 * @generated
	 */
  void setEnablingValue(boolean value);

  /**
	 * Returns the value of the '<em><b>Repeat Period</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The repeat period, in millisecond, at which the operation should be called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Repeat Period</em>' attribute.
	 * @see #setRepeatPeriod(long)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getControllerStateTrigger_RepeatPeriod()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' apogy_units='ms'"
	 * @generated
	 */
  long getRepeatPeriod();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger#getRepeatPeriod <em>Repeat Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Period</em>' attribute.
	 * @see #getRepeatPeriod()
	 * @generated
	 */
  void setRepeatPeriod(long value);

} // ControllerStateTrigger
