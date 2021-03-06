package ca.gc.asc_csa.apogy.common.topology.ui;
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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Presentation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getNodePresentationList <em>Node Presentation List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationSet()
 * @model
 * @generated
 */
public interface TopologyPresentationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology Presentation Registry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList <em>Topology Presentation Set List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TopologyPresentationRegistry containing this TopologyPresentationSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Presentation Registry</em>' container reference.
	 * @see #setTopologyPresentationRegistry(TopologyPresentationRegistry)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationSet_TopologyPresentationRegistry()
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList
	 * @model opposite="topologyPresentationSetList" transient="false"
	 * @generated
	 */
	TopologyPresentationRegistry getTopologyPresentationRegistry();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Presentation Registry</em>' container reference.
	 * @see #getTopologyPresentationRegistry()
	 * @generated
	 */
	void setTopologyPresentationRegistry(TopologyPresentationRegistry value);

	/**
	 * Returns the value of the '<em><b>Graphics Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GraphicsContext containing this PresentationTopology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphics Context</em>' reference.
	 * @see #setGraphicsContext(GraphicsContext)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationSet_GraphicsContext()
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopologyPresentationSet
	 * @model opposite="topologyPresentationSet"
	 * @generated
	 */
	GraphicsContext getGraphicsContext();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics Context</em>' reference.
	 * @see #getGraphicsContext()
	 * @generated
	 */
	void setGraphicsContext(GraphicsContext value);

	/**
	 * Returns the value of the '<em><b>Node Presentation List</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of NodePresentation managed by this PresentationTopology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Presentation List</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationSet_NodePresentationList()
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation#getTopologyPresentationSet
	 * @model opposite="topologyPresentationSet"
	 * @generated
	 */
	EList<NodePresentation> getNodePresentationList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the NodePresentation associated with a specified Node.
	 * @param node The specified Node.
	 * @return The NodePresentation associated with specified Node, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" nodeUnique="false"
	 * @generated
	 */
	NodePresentation getPresentationNode(Node node);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of Nodes managed by this PresentationTopology.
	 * @return The list of Nodes. Never null.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.common.topology.ui.List<ca.gc.asc_csa.apogy.common.topology.Node>" unique="false" many="false"
	 * @generated
	 */
	List<Node> getNodes();

} // TopologyPresentationSet
