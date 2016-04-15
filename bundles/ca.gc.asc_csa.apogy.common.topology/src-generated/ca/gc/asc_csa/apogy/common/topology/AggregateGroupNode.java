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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Group Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode#getAggregatedChildren <em>Aggregated Children</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getAggregateGroupNode()
 * @model
 * @generated
 */
public interface AggregateGroupNode extends GroupNode {
	/**
	 * Returns the value of the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Children</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getAggregateGroupNode_AggregatedChildren()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='true'"
	 * @generated
	 */
	EList<Node> getAggregatedChildren();

} // AggregateGroupNode
