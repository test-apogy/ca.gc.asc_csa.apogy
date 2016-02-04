package ca.gc.asc_csa.apogy.core;
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

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.core.invocator.ResultsList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Results List Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A specialized Topology node representing a ResultsList.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ResultsListNode#getResultsList <em>Results List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultsListNode()
 * @model
 * @generated
 */
public interface ResultsListNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Results List</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Results List</em>' reference.
	 * @see #setResultsList(ResultsList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultsListNode_ResultsList()
	 * @model transient="true"
	 * @generated
	 */
	ResultsList getResultsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ResultsListNode#getResultsList <em>Results List</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Results List</em>' reference.
	 * @see #getResultsList()
	 * @generated
	 */
	void setResultsList(ResultsList value);

} // ResultsListNode
