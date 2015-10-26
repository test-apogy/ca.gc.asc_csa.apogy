/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.core.FeatureOfInterestList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Features Of Interest Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Map Layer that contains Feature Of Interest.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getFeaturesOfInterestMapLayer()
 * @model
 * @generated
 */
public interface FeaturesOfInterestMapLayer extends AbstractMapLayer, RectangularRegionProvider {

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference.
	 * @see #setFeatures(FeatureOfInterestList)
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getFeaturesOfInterestMapLayer_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureOfInterestList getFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer#getFeatures <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' containment reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(FeatureOfInterestList value);

} // FeaturesOfInterestMapLayer
