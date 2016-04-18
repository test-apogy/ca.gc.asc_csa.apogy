/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class used to store the constellation state.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationCommandPlansList <em>Constellation Command Plans List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getSatellitesList <em>Satellites List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getGroundStationsReferencesList <em>Ground Stations References List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getDownlinksLists <em>Downlinks Lists</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlannersContainer <em>Constellation Planners Container</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState()
 * @model
 * @generated
 */
public interface ConstellationState extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Command Plans List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link ConstellationCommandPlan}s.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Command Plans List</em>' containment reference.
	 * @see #setConstellationCommandPlansList(ConstellationCommandPlansList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_ConstellationCommandPlansList()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getConstellationState
	 * @model opposite="constellationState" containment="true"
	 * @generated
	 */
	ConstellationCommandPlansList getConstellationCommandPlansList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationCommandPlansList <em>Constellation Command Plans List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Command Plans List</em>' containment reference.
	 * @see #getConstellationCommandPlansList()
	 * @generated
	 */
	void setConstellationCommandPlansList(ConstellationCommandPlansList value);

	/**
	 * Returns the value of the '<em><b>Satellites List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the constellation {@link Satellite}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellites List</em>' containment reference.
	 * @see #setSatellitesList(SatellitesList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_SatellitesList()
	 * @model containment="true"
	 * @generated
	 */
	SatellitesList getSatellitesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getSatellitesList <em>Satellites List</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_GroundStationsReferencesList()
	 * @model containment="true"
	 * @generated
	 */
	GroundStationReferencesList getGroundStationsReferencesList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getGroundStationsReferencesList <em>Ground Stations References List</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_DownlinksLists()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationDownlinksList getDownlinksLists();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getDownlinksLists <em>Downlinks Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downlinks Lists</em>' containment reference.
	 * @see #getDownlinksLists()
	 * @generated
	 */
	void setDownlinksLists(ConstellationDownlinksList value);

	/**
	 * Returns the value of the '<em><b>Constellation Requests Lists Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link ConstellationRequestsLists}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests Lists Container</em>' containment reference.
	 * @see #setConstellationRequestsListsContainer(ConstellationRequestsListsContainer)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_ConstellationRequestsListsContainer()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationState
	 * @model opposite="constellationState" containment="true"
	 * @generated
	 */
	ConstellationRequestsListsContainer getConstellationRequestsListsContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Requests Lists Container</em>' containment reference.
	 * @see #getConstellationRequestsListsContainer()
	 * @generated
	 */
	void setConstellationRequestsListsContainer(ConstellationRequestsListsContainer value);

	/**
	 * Returns the value of the '<em><b>Constellation Planners Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constellation Planners Container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Planners Container</em>' containment reference.
	 * @see #setConstellationPlannersContainer(ConstellationPlannersContainer)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_ConstellationPlannersContainer()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationState
	 * @model opposite="constellationState" containment="true"
	 * @generated
	 */
	ConstellationPlannersContainer getConstellationPlannersContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlannersContainer <em>Constellation Planners Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Planners Container</em>' containment reference.
	 * @see #getConstellationPlannersContainer()
	 * @generated
	 */
	void setConstellationPlannersContainer(ConstellationPlannersContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Imports the {@link AbstractConstellationRequest} contained in the resource specified by the {@link url}.
	 * @param url URL that specifies the resource.
	 * @return List of imported {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" unique="false" many="false" urlUnique="false"
	 * @generated
	 */
	List<AbstractConstellationRequest> importConstellationRequests(String url);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exports the specified plan into the resource specified by the url.
	 * @param plan Refers the plan to export.
	 * @param url Specifies the location where the plan must be exported.
	 * <!-- end-model-doc -->
	 * @model planUnique="false" urlUnique="false"
	 * @generated
	 */
	void export(AbstractConstellationCommandPlan plan, String url);

} // ConstellationState
