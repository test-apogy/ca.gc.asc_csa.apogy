/**
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
package ca.gc.asc_csa.apogy.common.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Filter Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * NodeFilter based on a chain of filter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.NodeFilterChain#getFilterChainType <em>Filter Chain Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.NodeFilterChain#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getNodeFilterChain()
 * @model
 * @generated
 */
public interface NodeFilterChain extends NodeFilter {
	/**
	 * Returns the value of the '<em><b>Filter Chain Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.FilterChainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Chain Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Chain Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.FilterChainType
	 * @see #setFilterChainType(FilterChainType)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getNodeFilterChain_FilterChainType()
	 * @model default="AND" unique="false"
	 * @generated
	 */
	FilterChainType getFilterChainType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.NodeFilterChain#getFilterChainType <em>Filter Chain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Chain Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.FilterChainType
	 * @see #getFilterChainType()
	 * @generated
	 */
	void setFilterChainType(FilterChainType value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.NodeFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getNodeFilterChain_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodeFilter> getFilters();

} // NodeFilterChain
