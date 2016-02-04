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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Result Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value stored in an AbstractResult.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResultValue()
 * @model abstract="true"
 * @generated
 */
public interface AbstractResultValue extends EObject
{
  /**
	 * Returns the value of the '<em><b>Result</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' container reference.
	 * @see #setResult(AbstractResult)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResultValue_Result()
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultValue
	 * @model opposite="resultValue" transient="false"
	 * @generated
	 */
  AbstractResult getResult();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue#getResult <em>Result</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' container reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(AbstractResult value);

} // AbstractResultValue
