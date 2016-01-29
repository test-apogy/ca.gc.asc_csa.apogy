/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import java.util.Date;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constellation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a constellation of Satellites. It provides basic queries used to schedule
 * image acquisition and upload requests and downloads data from the satellites.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getSatellitesList <em>Satellites List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getGroundStationsReferencesList <em>Ground Stations References List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getDownlinksLists <em>Downlinks Lists</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellation extends EObject {
	/**
	 * Returns the value of the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the constellation {@link Satellite}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellites List</em>' containment reference.
	 * @see #setSatellitesList(SatellitesList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation_SatellitesList()
	 * @model containment="true"
	 * @generated
	 */
	SatellitesList getSatellitesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getSatellitesList <em>Satellites List</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation_GroundStationsReferencesList()
	 * @model containment="true"
	 * @generated
	 */
	GroundStationReferencesList getGroundStationsReferencesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getGroundStationsReferencesList <em>Ground Stations References List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground Stations References List</em>' containment reference.
	 * @see #getGroundStationsReferencesList()
	 * @generated
	 */
	void setGroundStationsReferencesList(GroundStationReferencesList value);

	/**
	 * Returns the value of the '<em><b>Downlinks Lists</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link ConstellationDownlinkList} used to store {@link ConstellationDownlink}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Downlinks Lists</em>' containment reference.
	 * @see #setDownlinksLists(ConstellationDownlinksList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation_DownlinksLists()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationDownlinksList getDownlinksLists();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getDownlinksLists <em>Downlinks Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downlinks Lists</em>' containment reference.
	 * @see #getDownlinksLists()
	 * @generated
	 */
	void setDownlinksLists(ConstellationDownlinksList value);

	/**
	 * Returns the value of the '<em><b>Constellation Requests List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests List</em>' containment reference.
	 * @see #setConstellationRequestsList(ConstellationRequestsList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation_ConstellationRequestsList()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationRequestsList getConstellationRequestsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationRequestsList <em>Constellation Requests List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Requests List</em>' containment reference.
	 * @see #getConstellationRequestsList()
	 * @generated
	 */
	void setConstellationRequestsList(ConstellationRequestsList value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of {@link AbstractSatelliteCommand} required to process the constellation {@link AbstractConstellationRequest}
	 * based on the available constellation satellites.
	 * @param startDate The start date of the period to be queried.
	 * @param endDate The end date of the period to be queried.
	 * @return Reference to the {@link SatelliteCommandPlan}.
	 * <!-- end-model-doc -->
	 * @model unique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	ConstellationCommandPlan plan(Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of {@link AbstractSatelliteCommand} required to process a specific list of {@link AbstractConstellationRequest}
	 * based on the available constellation satellites.
	 * @param requests Refers to the list of {@link AbstractConstellationRequest} to process.
	 * @param startDate The start date of the period to be queried.
	 * @param endDate The end date of the period to be queried.
	 * @return Reference to the {@link SatelliteCommandPlan}.
	 * <!-- end-model-doc -->
	 * @model unique="false" requestsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	ConstellationCommandPlan plan(List<AbstractConstellationRequest> requests, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Packages and commits the list of {@link AbstractSatelliteCommand}.
	 * @param satelliteCommands Reference to the list of {@link AbstractSatelliteCommand}.
	 * <!-- end-model-doc -->
	 * @model satelliteCommandsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand>" satelliteCommandsUnique="false" satelliteCommandsMany="false"
	 * @generated
	 */
	void commit(List<AbstractSatelliteCommand> satelliteCommands);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Updates the {@link AbstractConstellationRequest} state based on the {@link ConstallationDownlink}.
	 * @param downlink Reference to the {@link ConstellationDownlink}.
	 * <!-- end-model-doc -->
	 * @model downlinkUnique="false"
	 * @generated
	 */
	void apply(ConstellationDownlink downlink);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds the specified {@link AbstractConstellationRequest} to the constellation.
	 * @param request Specifies the request to add to the {@link AbstractConstellation}.
	 * <!-- end-model-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void add(AbstractConstellationRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds all the {@link AbstractConstellationRequest} specified in the list to the constellation.
	 * @param requests Specifies the requests to add to the {@link AbstractConstellation}.
	 * <!-- end-model-doc -->
	 * @model requestsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false"
	 * @generated
	 */
	void addAll(List<AbstractConstellationRequest> requests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes the specified {@link AbstractConstellationRequest} from the constellation.
	 * @param request Specifies the request to remove from the {@link AbstractConstellation}.
	 * <!-- end-model-doc -->
	 * @model requestUnique="false"
	 * @generated
	 */
	void remove(AbstractConstellationRequest request);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Removes all the {@link AbstractConstellationRequest} specified in the list from the constellation.
	 * @param request Specifies the requests to remove from the {@link AbstractConstellation}.
	 * <!-- end-model-doc -->
	 * @model requestsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false"
	 * @generated
	 */
	void removeAll(List<AbstractConstellationRequest> requests);

} // AbstractConstellation
