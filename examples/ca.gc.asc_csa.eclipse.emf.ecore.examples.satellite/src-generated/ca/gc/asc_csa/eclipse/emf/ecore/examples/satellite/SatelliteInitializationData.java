/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractInitializationData;

import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Initialization Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Initialization Data representing the state of a Satellite.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteInitializationData#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteInitializationData#getOrbitModel <em>Orbit Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteInitializationData()
 * @model
 * @generated
 */
public interface SatelliteInitializationData extends AbstractInitializationData {
	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellite</em>' containment reference.
	 * @see #setSatellite(Satellite)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteInitializationData_Satellite()
	 * @model containment="true"
	 * @generated
	 */
	Satellite getSatellite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteInitializationData#getSatellite <em>Satellite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' containment reference.
	 * @see #getSatellite()
	 * @generated
	 */
	void setSatellite(Satellite value);

	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Model</em>' containment reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteInitializationData_OrbitModel()
	 * @model containment="true"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteInitializationData#getOrbitModel <em>Orbit Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' containment reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

} // SatelliteInitializationData
