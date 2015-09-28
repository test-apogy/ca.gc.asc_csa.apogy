/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Of Interest List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  List of Feature Of Interest
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.FeatureOfInterestList#getFeaturesOfInterest <em>Features Of Interest</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getFeatureOfInterestList()
 * @model
 * @generated
 */
public interface FeatureOfInterestList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Features Of Interest</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.core.FeatureOfInterest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features Of Interest</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features Of Interest</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.core.SymphonyCorePackage#getFeatureOfInterestList_FeaturesOfInterest()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureOfInterest> getFeaturesOfInterest();

} // FeatureOfInterestList
