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
 * A representation of the model object '<em><b>Referenced Content Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ReferencedContentNode#getReferencedContent <em>Referenced Content</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getReferencedContentNode()
 * @model
 * @generated
 */
public interface ReferencedContentNode<T> extends ContentNode<T> {
	/**
	 * Returns the value of the '<em><b>Referenced Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Content</em>' reference.
	 * @see #setReferencedContent(Object)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getReferencedContentNode_ReferencedContent()
	 * @model kind="reference"
	 * @generated
	 */
	T getReferencedContent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ReferencedContentNode#getReferencedContent <em>Referenced Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Content</em>' reference.
	 * @see #getReferencedContent()
	 * @generated
	 */
	void setReferencedContent(T value);

} // ReferencedContentNode
