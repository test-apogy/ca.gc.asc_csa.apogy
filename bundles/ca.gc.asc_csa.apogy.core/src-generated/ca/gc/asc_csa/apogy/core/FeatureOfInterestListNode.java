/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode#getFeatureOfInterestList <em>Feature Of Interest List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestListNode()
 * @model
 * @generated
 */
public interface FeatureOfInterestListNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Feature Of Interest List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Of Interest List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Of Interest List</em>' reference.
	 * @see #setFeatureOfInterestList(FeatureOfInterestList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestListNode_FeatureOfInterestList()
	 * @model transient="true"
	 * @generated
	 */
	FeatureOfInterestList getFeatureOfInterestList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestListNode#getFeatureOfInterestList <em>Feature Of Interest List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest List</em>' reference.
	 * @see #getFeatureOfInterestList()
	 * @generated
	 */
	void setFeatureOfInterestList(FeatureOfInterestList value);

} // FeatureOfInterestListNode
