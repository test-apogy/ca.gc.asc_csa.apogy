/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

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
 *   <li>{@link org.eclipse.symphony.common.topology.TopologyProvider#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.TopologyPackage#getTopologyProvider()
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
	 * @see org.eclipse.symphony.common.topology.TopologyPackage#getTopologyProvider_TopologyRoot()
	 * @model changeable="false"
	 * @generated
	 */
	GroupNode getTopologyRoot();

} // TopologyProvider
