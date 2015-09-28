/**
 * <copyright>
 * </copyright>
 *
 * $Id: CADNode.java,v 1.2.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CAD Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.CADNode#getNodeName <em>Node Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getCADNode()
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
	 * @see ca.gc.space.topology.TopologyPackage#getCADNode_NodeName()
	 * @model
	 * @generated
	 */
	String getNodeName();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.CADNode#getNodeName <em>Node Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Name</em>' attribute.
	 * @see #getNodeName()
	 * @generated
	 */
	void setNodeName(String value);

} // CADNode
