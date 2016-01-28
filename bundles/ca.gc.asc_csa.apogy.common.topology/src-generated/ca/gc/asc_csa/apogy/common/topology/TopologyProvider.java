/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.TopologyProvider#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getTopologyProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TopologyProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Root</em>' reference.
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getTopologyProvider_TopologyRoot()
	 * @model changeable="false"
	 * @generated
	 */
	GroupNode getTopologyRoot();

} // TopologyProvider
