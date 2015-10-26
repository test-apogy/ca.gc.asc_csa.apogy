/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Group Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.AggregateGroupNode#getAggregatedChildren <em>Aggregated Children</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getAggregateGroupNode()
 * @model
 * @generated
 */
public interface AggregateGroupNode extends GroupNode {
	/**
	 * Returns the value of the '<em><b>Aggregated Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregated Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregated Children</em>' containment reference list.
	 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getAggregateGroupNode_AggregatedChildren()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getAggregatedChildren();

} // AggregateGroupNode
