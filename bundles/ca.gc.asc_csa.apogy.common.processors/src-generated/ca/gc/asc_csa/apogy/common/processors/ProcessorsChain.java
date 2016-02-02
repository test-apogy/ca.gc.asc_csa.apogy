package ca.gc.asc_csa.apogy.common.processors;
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processors Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.ProcessorsChain#getRunningProcessor <em>Running Processor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.ProcessorsChain#getProcessors <em>Processors</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessorsChain()
 * @model
 * @generated
 */
public interface ProcessorsChain<I, O> extends Processor<I, O> {
	/**
	 * Returns the value of the '<em><b>Intermediate Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediate Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Result</em>' attribute.
	 * @see #setIntermediateResult(Object)
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessorsChain_IntermediateResult()
	 * @model unique="false"
	 * @generated
	 */
	Object getIntermediateResult();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.processors.ProcessorsChain#getIntermediateResult <em>Intermediate Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Result</em>' attribute.
	 * @see #getIntermediateResult()
	 * @generated
	 */
	void setIntermediateResult(Object value);

	/**
	 * Returns the value of the '<em><b>Running Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Processor</em>' reference.
	 * @see #setRunningProcessor(Processor)
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessorsChain_RunningProcessor()
	 * @model required="true"
	 * @generated
	 */
	Processor<?, ?> getRunningProcessor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.processors.ProcessorsChain#getRunningProcessor <em>Running Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Processor</em>' reference.
	 * @see #getRunningProcessor()
	 * @generated
	 */
	void setRunningProcessor(Processor<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Processors</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.processors.Processor}&lt;?, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processors</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessorsChain_Processors()
	 * @model
	 * @generated
	 */
	EList<Processor<?, ?>> getProcessors();

} // ProcessorsChain
