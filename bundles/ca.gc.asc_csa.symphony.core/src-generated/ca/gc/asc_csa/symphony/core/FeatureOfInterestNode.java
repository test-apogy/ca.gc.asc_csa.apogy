/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import ca.gc.space.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getFeatureOfInterestNode()
 * @model
 * @generated
 */
public interface FeatureOfInterestNode extends TransformNode {
	/**
	 * Returns the value of the '<em><b>Feature Of Interest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Feature Of Interest represented by this node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Interest</em>' reference.
	 * @see #setFeatureOfInterest(FeatureOfInterest)
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getFeatureOfInterestNode_FeatureOfInterest()
	 * @model transient="true"
	 * @generated
	 */
	FeatureOfInterest getFeatureOfInterest();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest</em>' reference.
	 * @see #getFeatureOfInterest()
	 * @generated
	 */
	void setFeatureOfInterest(FeatureOfInterest value);

} // FeatureOfInterestNode
