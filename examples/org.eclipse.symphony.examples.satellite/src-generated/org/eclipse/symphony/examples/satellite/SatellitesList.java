/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellites List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List that contains {@link Satellite}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatellitesList#getSatellites <em>Satellites</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellitesList()
 * @model
 * @generated
 */
public interface SatellitesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Satellites</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.Satellite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellites</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellitesList_Satellites()
	 * @model containment="true"
	 * @generated
	 */
	EList<Satellite> getSatellites();

} // SatellitesList