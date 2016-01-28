/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ContentNode#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getContentNode()
 * @model
 * @generated
 */
public interface ContentNode<T> extends Leaf {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Object)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getContentNode_Content()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getContent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ContentNode#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(T value);

} // ContentNode
