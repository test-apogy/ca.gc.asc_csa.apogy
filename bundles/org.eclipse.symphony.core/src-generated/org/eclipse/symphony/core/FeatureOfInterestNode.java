/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.core;

import org.eclipse.symphony.common.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.SymphonyCorePackage#getFeatureOfInterestNode()
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
	 * @see org.eclipse.symphony.core.SymphonyCorePackage#getFeatureOfInterestNode_FeatureOfInterest()
	 * @model transient="true"
	 * @generated
	 */
	FeatureOfInterest getFeatureOfInterest();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.FeatureOfInterestNode#getFeatureOfInterest <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest</em>' reference.
	 * @see #getFeatureOfInterest()
	 * @generated
	 */
	void setFeatureOfInterest(FeatureOfInterest value);

} // FeatureOfInterestNode
