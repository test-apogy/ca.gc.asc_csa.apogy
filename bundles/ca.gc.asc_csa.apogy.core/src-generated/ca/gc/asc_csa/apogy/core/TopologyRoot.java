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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Topology Root</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Topology.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.TopologyRoot#getOriginNode <em>Origin Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getTopologyRoot()
 * @model
 * @generated
 */
public interface TopologyRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Node</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Node</em>' containment reference.
	 * @see #setOriginNode(Node)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getTopologyRoot_OriginNode()
	 * @model containment="true"
	 * @generated
	 */
	Node getOriginNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.TopologyRoot#getOriginNode <em>Origin Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Node</em>' containment reference.
	 * @see #getOriginNode()
	 * @generated
	 */
	void setOriginNode(Node value);

} // TopologyRoot
