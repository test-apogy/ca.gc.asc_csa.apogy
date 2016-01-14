/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony;

import org.eclipse.symphony.core.SymphonyInitializationData;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStationReferencesList;
import org.eclipse.symphony.examples.satellite.SatellitesList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the specialized data structure which is used to essentially
 * save and later restore the state of the component; this functionality is
 * implemented by the apply() (load) and collect() (save) methods of the constellation's
 * API adapter,
 * which is {@link org.eclipse.symphony.examples.satellite.symphony.ConstellationSymphonySystemApiAdapter}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getSatellitesList <em>Satellites List</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getGroundStationsReferencesList <em>Ground Stations References List</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage#getConstellationData()
 * @model
 * @generated
 */
public interface ConstellationData extends SymphonyInitializationData {

	/**
	 * Returns the value of the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the constellation {@link Satellite}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellites List</em>' containment reference.
	 * @see #setSatellitesList(SatellitesList)
	 * @see org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage#getConstellationData_SatellitesList()
	 * @model containment="true"
	 * @generated
	 */
	SatellitesList getSatellitesList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getSatellitesList <em>Satellites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellites List</em>' containment reference.
	 * @see #getSatellitesList()
	 * @generated
	 */
	void setSatellitesList(SatellitesList value);

	/**
	 * Returns the value of the '<em><b>Ground Stations References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the {@link GroundStation}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ground Stations References List</em>' containment reference.
	 * @see #setGroundStationsReferencesList(GroundStationReferencesList)
	 * @see org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage#getConstellationData_GroundStationsReferencesList()
	 * @model containment="true"
	 * @generated
	 */
	GroundStationReferencesList getGroundStationsReferencesList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData#getGroundStationsReferencesList <em>Ground Stations References List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Stations References List</em>' containment reference.
	 * @see #getGroundStationsReferencesList()
	 * @generated
	 */
	void setGroundStationsReferencesList(GroundStationReferencesList value);
} // ConstellationData
