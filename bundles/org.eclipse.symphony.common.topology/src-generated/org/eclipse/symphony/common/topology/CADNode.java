/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAD Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.CADNode#getNodeName <em>Node Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getCADNode()
 * @model
 * @generated
 */
public interface CADNode extends URLNode {
	/**
	 * Returns the value of the '<em><b>Node Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Name</em>' attribute.
	 * @see #setNodeName(String)
	 * @see org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage#getCADNode_NodeName()
	 * @model unique="false"
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.CADNode#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

} // CADNode
