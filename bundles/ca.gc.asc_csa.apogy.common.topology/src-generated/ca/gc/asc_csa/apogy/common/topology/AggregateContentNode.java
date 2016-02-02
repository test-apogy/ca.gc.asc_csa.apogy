package ca.gc.asc_csa.apogy.common.topology;
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
 * A representation of the model object '<em><b>Aggregate Content Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.AggregateContentNode#getAggregateContent <em>Aggregate Content</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getAggregateContentNode()
 * @model
 * @generated
 */
public interface AggregateContentNode<T> extends ContentNode<T> {
	/**
	 * Returns the value of the '<em><b>Aggregate Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Content</em>' containment reference.
	 * @see #setAggregateContent(Object)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getAggregateContentNode_AggregateContent()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getAggregateContent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.AggregateContentNode#getAggregateContent <em>Aggregate Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Content</em>' containment reference.
	 * @see #getAggregateContent()
	 * @generated
	 */
	void setAggregateContent(T value);

} // AggregateContentNode
