/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.topology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregate Content Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.AggregateContentNode#getAggregateContent <em>Aggregate Content</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getAggregateContentNode()
 * @model
 * @generated
 */
public interface AggregateContentNode<T> extends ContentNode<T> {
	/**
	 * Returns the value of the '<em><b>Aggregate Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate Content</em>' containment reference.
	 * @see #setAggregateContent(Object)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getAggregateContentNode_AggregateContent()
	 * @model kind="reference" containment="true"
	 * @generated
	 */
	T getAggregateContent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.AggregateContentNode#getAggregateContent <em>Aggregate Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregate Content</em>' containment reference.
	 * @see #getAggregateContent()
	 * @generated
	 */
	void setAggregateContent(T value);

} // AggregateContentNode
