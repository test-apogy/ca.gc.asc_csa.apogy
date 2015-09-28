/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencedGroupNode.java,v 1.4.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Group Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.ReferencedGroupNode#getReferencedChildren <em>Referenced Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getReferencedGroupNode()
 * @model
 * @generated
 */
public interface ReferencedGroupNode extends GroupNode {

	/**
	 * Returns the value of the '<em><b>Referenced Children</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.space.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Children</em>' reference list.
	 * @see ca.gc.space.topology.TopologyPackage#getReferencedGroupNode_ReferencedChildren()
	 * @model
	 * @generated
	 */
	EList<Node> getReferencedChildren();

} // ReferencedGroupNode
