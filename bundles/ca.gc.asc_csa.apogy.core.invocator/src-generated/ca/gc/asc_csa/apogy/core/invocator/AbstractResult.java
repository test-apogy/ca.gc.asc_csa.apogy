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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Timed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A result that contains a values and its about the time and context
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultsList <em>Results List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getContext <em>Context</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultValue <em>Result Value</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResult()
 * @model abstract="true"
 * @generated
 */
public interface AbstractResult extends Timed, Described
{
  /**
	 * Returns the value of the '<em><b>Results List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ResultsList#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results List</em>' container reference.
	 * @see #setResultsList(ResultsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResult_ResultsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ResultsList#getResults
	 * @model opposite="results" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ResultsList getResultsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultsList <em>Results List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results List</em>' container reference.
	 * @see #getResultsList()
	 * @generated
	 */
	void setResultsList(ResultsList value);

		/**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invocator Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResult_InvocatorSession()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.core.invocator.ResultsList%> _resultsList = this.getResultsList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_resultsList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.core.invocator.ResultsList%> _resultsList_1 = this.getResultsList();\n\treturn _resultsList_1.getInvocatorSession();\n}'"
	 * @generated
	 */
	InvocatorSession getInvocatorSession();

		/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context in which the result was produced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Context)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResult_Context()
	 * @model required="true"
	 * @generated
	 */
  Context getContext();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
  void setContext(Context value);

  /**
	 * Returns the value of the '<em><b>Result Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Value</em>' containment reference.
	 * @see #setResultValue(AbstractResultValue)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractResult_ResultValue()
	 * @see ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue#getResult
	 * @model opposite="result" containment="true"
	 * @generated
	 */
  AbstractResultValue getResultValue();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractResult#getResultValue <em>Result Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' containment reference.
	 * @see #getResultValue()
	 * @generated
	 */
  void setResultValue(AbstractResultValue value);

} // AbstractResult
