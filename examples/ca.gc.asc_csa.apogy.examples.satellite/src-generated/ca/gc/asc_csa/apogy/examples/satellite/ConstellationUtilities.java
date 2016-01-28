/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Utilities class for the satellite example.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationUtilities()
 * @model
 * @generated
 */
public interface ConstellationUtilities extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sorts the list of {@link AbstractConstellationRequest} based on {@link AbstractConstellationRequest#priority}.
	 * @param requests Specifies the list of {@link AbstractConstellationRequest} to sort.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.examples.satellite.SortedSet<org.eclipse.symphony.examples.satellite.AbstractConstellationRequest>" unique="false" requestsDataType="org.eclipse.symphony.examples.satellite.List<org.eclipse.symphony.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false"
	 * @generated
	 */
	SortedSet<AbstractConstellationRequest> sortByPriority(List<AbstractConstellationRequest> requests);

} // ConstellationUtilities
