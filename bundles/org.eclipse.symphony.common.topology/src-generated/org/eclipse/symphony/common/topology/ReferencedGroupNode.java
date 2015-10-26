/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Group Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.ReferencedGroupNode#getReferencedChildren <em>Referenced Children</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getReferencedGroupNode()
 * @model
 * @generated
 */
public interface ReferencedGroupNode extends GroupNode {
	/**
	 * Returns the value of the '<em><b>Referenced Children</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.topology.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Children</em>' reference list.
	 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getReferencedGroupNode_ReferencedChildren()
	 * @model
	 * @generated
	 */
	EList<Node> getReferencedChildren();

} // ReferencedGroupNode
