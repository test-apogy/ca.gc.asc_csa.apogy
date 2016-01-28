/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.ui;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Presentation Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getNodePresentationList <em>Node Presentation List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getTopologyPresentationSet()
 * @model
 * @generated
 */
public interface TopologyPresentationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology Presentation Registry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList <em>Topology Presentation Set List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TopologyPresentationRegistry containing this TopologyPresentationSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Presentation Registry</em>' container reference.
	 * @see #setTopologyPresentationRegistry(TopologyPresentationRegistry)
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getTopologyPresentationSet_TopologyPresentationRegistry()
	 * @see org.eclipse.symphony.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList
	 * @model opposite="topologyPresentationSetList" transient="false"
	 * @generated
	 */
	TopologyPresentationRegistry getTopologyPresentationRegistry();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Presentation Registry</em>' container reference.
	 * @see #getTopologyPresentationRegistry()
	 * @generated
	 */
	void setTopologyPresentationRegistry(TopologyPresentationRegistry value);

	/**
	 * Returns the value of the '<em><b>Graphics Context</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.topology.ui.GraphicsContext#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GraphicsContext containing this PresentationTopology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Graphics Context</em>' reference.
	 * @see #setGraphicsContext(GraphicsContext)
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getTopologyPresentationSet_GraphicsContext()
	 * @see org.eclipse.symphony.common.topology.ui.GraphicsContext#getTopologyPresentationSet
	 * @model opposite="topologyPresentationSet"
	 * @generated
	 */
	GraphicsContext getGraphicsContext();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Graphics Context</em>' reference.
	 * @see #getGraphicsContext()
	 * @generated
	 */
	void setGraphicsContext(GraphicsContext value);

	/**
	 * Returns the value of the '<em><b>Node Presentation List</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.ui.NodePresentation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.topology.ui.NodePresentation#getTopologyPresentationSet <em>Topology Presentation Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of NodePresentation managed by this PresentationTopology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Presentation List</em>' reference list.
	 * @see org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage#getTopologyPresentationSet_NodePresentationList()
	 * @see org.eclipse.symphony.common.topology.ui.NodePresentation#getTopologyPresentationSet
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
	 * @model kind="operation" dataType="org.eclipse.symphony.common.topology.ui.List<org.eclipse.symphony.common.topology.Node>" unique="false" many="false"
	 * @generated
	 */
	List<Node> getNodes();

} // TopologyPresentationSet
