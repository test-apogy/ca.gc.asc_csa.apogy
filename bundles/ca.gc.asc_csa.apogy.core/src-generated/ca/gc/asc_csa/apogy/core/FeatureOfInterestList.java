/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core;

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List of Feature Of Interest
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.FeatureOfInterestList#getFeaturesOfInterest <em>Features Of Interest</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestList()
 * @model
 * @generated
 */
public interface FeatureOfInterestList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Features Of Interest</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.FeatureOfInterest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Of Interest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Of Interest</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getFeatureOfInterestList_FeaturesOfInterest()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureOfInterest> getFeaturesOfInterest();

} // FeatureOfInterestList
