/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContentNode.java,v 1.2.2.2 2015/02/03 20:01:30 rlarcheveque Exp $
 */
package ca.gc.space.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.topology.ContentNode#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.topology.TopologyPackage#getContentNode()
 * @model
 * @generated
 */
public interface ContentNode<T> extends Leaf {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Object)
	 * @see ca.gc.space.topology.TopologyPackage#getContentNode_Content()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getContent();

	/**
	 * Sets the value of the '{@link ca.gc.space.topology.ContentNode#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(T value);

} // ContentNode
