/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology.ui;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Presentation Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The registry of all NodePresentation. This class is intended to be a singleton.
 * It associates at most one NodePresentation to each Node. It registers to
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getTopologyPresentationSetList <em>Topology Presentation Set List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationRegistry#getNodePresentationList <em>Node Presentation List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationRegistry()
 * @model
 * @generated
 */
public interface TopologyPresentationRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology Presentation Set List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry <em>Topology Presentation Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of TopologyPresentationSet managed by the TopologyPresentationRegistry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Presentation Set List</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationRegistry_TopologyPresentationSetList()
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getTopologyPresentationRegistry
	 * @model opposite="topologyPresentationRegistry" containment="true"
	 * @generated
	 */
	EList<TopologyPresentationSet> getTopologyPresentationSetList();

	/**
	 * Returns the value of the '<em><b>Node Presentation List</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of NodePresentation managed by this PresentationTopology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Presentation List</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getTopologyPresentationRegistry_NodePresentationList()
	 * @model containment="true"
	 * @generated
	 */
	EList<NodePresentation> getNodePresentationList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a TopologyPresentationSet from a specified topologyRoot.
	 * @param topologyRoot The node at the root of the topology.
	 * <!-- end-model-doc -->
	 * @model unique="false" topologyRootUnique="false"
	 * @generated
	 */
	TopologyPresentationSet createTopologyPresentationSet(Node topologyRoot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Release a TopologyPresentationSet no longer needed.
	 * @param topologyPresentationSet The TopologyPresentationSet to release.
	 * <!-- end-model-doc -->
	 * @model topologyPresentationSetUnique="false"
	 * @generated
	 */
	void release(TopologyPresentationSet topologyPresentationSet);

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

} // TopologyPresentationRegistry