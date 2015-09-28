/**
 * <copyright>
 * </copyright>
 *
 * $Id: GroupNode.java,v 1.3.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.GroupNode#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getGroupNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GroupNode extends Node {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.space.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ca.gc.space.topology.TopologyPackage#getGroupNode_Children()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getChildren();

} // GroupNode
