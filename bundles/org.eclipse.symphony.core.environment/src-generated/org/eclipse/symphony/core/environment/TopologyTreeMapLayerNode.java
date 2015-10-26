/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.topology.AggregateGroupNode;
import org.eclipse.symphony.common.topology.Node;

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
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode#getTransientParent <em>Transient Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getTopologyTreeMapLayerNode()
 * @model
 * @generated
 */
public interface TopologyTreeMapLayerNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Topology Tree Map Layer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.TopologyTreeMapLayer#getTopologyTreeRoot <em>Topology Tree Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Tree Map Layer</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Tree Map Layer</em>' container reference.
	 * @see #setTopologyTreeMapLayer(TopologyTreeMapLayer)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getTopologyTreeMapLayerNode_TopologyTreeMapLayer()
	 * @see org.eclipse.symphony.core.environment.TopologyTreeMapLayer#getTopologyTreeRoot
	 * @model opposite="topologyTreeRoot" transient="false"
	 * @generated
	 */
	TopologyTreeMapLayer getTopologyTreeMapLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}' container reference.
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
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getTopologyTreeMapLayerNode_TransientParent()
	 * @model transient="true"
	 * @generated
	 */
	Node getTransientParent();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode#getTransientParent <em>Transient Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Parent</em>' reference.
	 * @see #getTransientParent()
	 * @generated
	 */
	void setTransientParent(Node value);

} // TopologyTreeMapLayerNode
