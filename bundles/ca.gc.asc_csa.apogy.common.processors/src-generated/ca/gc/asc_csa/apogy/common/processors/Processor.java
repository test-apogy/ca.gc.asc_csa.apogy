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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an object that can process an input to get an output.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.Processor#getInput <em>Input</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.Processor#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessor()
 * @model abstract="true"
 * @generated
 */
public interface Processor<I, O> extends Monitorable {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(Object)
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessor_Input()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	I getInput();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.processors.Processor#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(I value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(Object)
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getProcessor_Output()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	O getOutput();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.processors.Processor#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(O value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.processors.Exception" inputUnique="false"
	 * @generated
	 */
	O process(I input) throws Exception;

} // Processor
