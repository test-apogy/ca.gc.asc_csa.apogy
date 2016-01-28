/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Requests List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List that contains {@link AbstractConstellationRequest}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ConstellationRequestsList#getConstellationRequests <em>Constellation Requests</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationRequestsList()
 * @model
 * @generated
 */
public interface ConstellationRequestsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Requests</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.AbstractConstellationRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@link AbstractConstellationRequest} container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getConstellationRequestsList_ConstellationRequests()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstellationRequest> getConstellationRequests();

} // ConstellationRequestsList
