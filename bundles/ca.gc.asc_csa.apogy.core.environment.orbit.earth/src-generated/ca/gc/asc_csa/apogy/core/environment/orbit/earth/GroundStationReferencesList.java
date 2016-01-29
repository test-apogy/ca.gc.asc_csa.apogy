/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station References List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List that refers {@link GroundStation}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList#getGroundStations <em>Ground Stations</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getGroundStationReferencesList()
 * @model
 * @generated
 */
public interface GroundStationReferencesList extends EObject {
	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@link GroundStation} container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ground Stations</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getGroundStationReferencesList_GroundStations()
	 * @model
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

} // GroundStationReferencesList