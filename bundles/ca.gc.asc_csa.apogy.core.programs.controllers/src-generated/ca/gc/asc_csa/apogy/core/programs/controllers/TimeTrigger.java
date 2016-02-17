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
 * A representation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getTimeTrigger()
 * @model
 * @generated
 */
public interface TimeTrigger extends Trigger
{
  /**
	 * Returns the value of the '<em><b>Refresh Period</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refresh Period</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The refresh period, in millisecond, at which the operation should be called.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refresh Period</em>' attribute.
	 * @see #setRefreshPeriod(long)
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage#getTimeTrigger_RefreshPeriod()
	 * @model default="100" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' symphony_units='ms'"
	 * @generated
	 */
  long getRefreshPeriod();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger#getRefreshPeriod <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Period</em>' attribute.
	 * @see #getRefreshPeriod()
	 * @generated
	 */
  void setRefreshPeriod(long value);

} // TimeTrigger
