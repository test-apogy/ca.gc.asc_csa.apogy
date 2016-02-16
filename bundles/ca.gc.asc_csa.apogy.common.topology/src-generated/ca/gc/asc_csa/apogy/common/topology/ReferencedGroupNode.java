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
 * A representation of the model object '<em><b>Referenced Group Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode#getReferencedChildren <em>Referenced Children</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getReferencedGroupNode()
 * @model
 * @generated
 */
public interface ReferencedGroupNode extends GroupNode {
	/**
	 * Returns the value of the '<em><b>Referenced Children</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Children</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getReferencedGroupNode_ReferencedChildren()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel children='true' createChild='false'"
	 * @generated
	 */
	EList<Node> getReferencedChildren();

} // ReferencedGroupNode
