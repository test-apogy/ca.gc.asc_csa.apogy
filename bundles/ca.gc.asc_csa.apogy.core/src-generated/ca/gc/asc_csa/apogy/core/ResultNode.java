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

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Result Node</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Specialized Nodes.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ResultNode#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultNode()
 * @model
 * @generated
 */
public interface ResultNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
	 * PositionedResult represented by this node. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(PositionedResult)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getResultNode_Result()
	 * @model transient="true"
	 * @generated
	 */
	PositionedResult getResult();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ResultNode#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(PositionedResult value);

} // ResultNode
