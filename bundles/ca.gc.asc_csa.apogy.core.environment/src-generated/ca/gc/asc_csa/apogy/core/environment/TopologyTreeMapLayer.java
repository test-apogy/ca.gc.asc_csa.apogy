/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Tree Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A map Layer that contains an arbitray topology tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer#getTopologyTreeRoot <em>Topology Tree Root</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getTopologyTreeMapLayer()
 * @model
 * @generated
 */
public interface TopologyTreeMapLayer extends AbstractMapLayer {
	/**
	 * Returns the value of the '<em><b>Topology Tree Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode#getTopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the topology contained in this layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Tree Root</em>' containment reference.
	 * @see #setTopologyTreeRoot(TopologyTreeMapLayerNode)
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getTopologyTreeMapLayer_TopologyTreeRoot()
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode#getTopologyTreeMapLayer
	 * @model opposite="topologyTreeMapLayer" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' property='None'"
	 * @generated
	 */
	TopologyTreeMapLayerNode getTopologyTreeRoot();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer#getTopologyTreeRoot <em>Topology Tree Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Tree Root</em>' containment reference.
	 * @see #getTopologyTreeRoot()
	 * @generated
	 */
	void setTopologyTreeRoot(TopologyTreeMapLayerNode value);

} // TopologyTreeMapLayer
