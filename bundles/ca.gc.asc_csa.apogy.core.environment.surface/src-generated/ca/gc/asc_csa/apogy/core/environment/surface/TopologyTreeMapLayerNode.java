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
package ca.gc.asc_csa.apogy.core.environment.surface;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Tree Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specialized GroupNode which parent node is overloarded to make it transient.
 * This is necessary to avoid dangling exceptions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTransientParent <em>Transient Parent</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getTopologyTreeMapLayerNode()
 * @model
 * @generated
 */
public interface TopologyTreeMapLayerNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Topology Tree Map Layer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer#getTopologyTreeRoot <em>Topology Tree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Tree Map Layer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Tree Map Layer</em>' container reference.
	 * @see #setTopologyTreeMapLayer(TopologyTreeMapLayer)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getTopologyTreeMapLayerNode_TopologyTreeMapLayer()
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayer#getTopologyTreeRoot
	 * @model opposite="topologyTreeRoot" transient="false"
	 * @generated
	 */
	TopologyTreeMapLayer getTopologyTreeMapLayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Tree Map Layer</em>' container reference.
	 * @see #getTopologyTreeMapLayer()
	 * @generated
	 */
	void setTopologyTreeMapLayer(TopologyTreeMapLayer value);

	/**
	 * Returns the value of the '<em><b>Transient Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Parent</em>' reference.
	 * @see #setTransientParent(Node)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getTopologyTreeMapLayerNode_TransientParent()
	 * @model transient="true"
	 * @generated
	 */
	Node getTransientParent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.TopologyTreeMapLayerNode#getTransientParent <em>Transient Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Parent</em>' reference.
	 * @see #getTransientParent()
	 * @generated
	 */
	void setTransientParent(Node value);

} // TopologyTreeMapLayerNode
