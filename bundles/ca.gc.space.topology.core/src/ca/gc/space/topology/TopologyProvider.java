/**
 * <copyright>
 * </copyright>
 *
 * $Id: TopologyProvider.java,v 1.2.2.2 2015/02/03 20:01:29 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.TopologyProvider#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getTopologyProvider()
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
	 * @see ca.gc.space.topology.TopologyPackage#getTopologyProvider_TopologyRoot()
	 * @model changeable="false"
	 * @generated
	 */
	GroupNode getTopologyRoot();
} // TopologyProvider
