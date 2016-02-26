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

import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import java.util.Date;
import java.util.SortedSet;

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
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlanner <em>Constellation Planner</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState()
 * @model
 * @generated
 */
public interface ConstellationState extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Command Plans List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link ConstellationCommandPlan}s.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Command Plans List</em>' containment reference.
	 * @see #setConstellationCommandPlansList(ConstellationCommandPlansList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_ConstellationCommandPlansList()
	 * @model containment="true"
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
	 * Returns the value of the '<em><b>Constellation Requests List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests List</em>' containment reference.
	 * @see #setConstellationRequestsList(ConstellationRequestsList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_ConstellationRequestsList()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationRequestsList getConstellationRequestsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsList <em>Constellation Requests List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Requests List</em>' containment reference.
	 * @see #getConstellationRequestsList()
	 * @generated
	 */
	void setConstellationRequestsList(ConstellationRequestsList value);

	/**
	 * Returns the value of the '<em><b>Constellation Planner</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState <em>Constellation State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constellation Planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Planner</em>' containment reference.
	 * @see #setConstellationPlanner(AbstractConstellationPlanner)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationState_ConstellationPlanner()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState
	 * @model opposite="constellationState" containment="true"
	 * @generated
	 */
	AbstractConstellationPlanner getConstellationPlanner();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlanner <em>Constellation Planner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Planner</em>' containment reference.
	 * @see #getConstellationPlanner()
	 * @generated
	 */
	void setConstellationPlanner(AbstractConstellationPlanner value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the visibility passes for a given {@link AbstractConstellationRequest}.
	 * @param request The {@link AbstractConstellationRequest} that needs commanding.
	 * @param startDate The start date of the period to be queried.
	 * @param endDate The end date of the period to be queried.
	 * @param elevationMask The ElevationMask to be used to determine the visibility of satellites by the surface location.
	 * @return The list of Visibility passes, ordered by start time.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.examples.satellite.SortedSet<ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass>" unique="false" exceptions="ca.gc.asc_csa.apogy.core.Exception" requestUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
	 * @generated
	 */
	SortedSet<VisibilityPass> getTargetPasses(AbstractConstellationRequest request, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the satellite associated with the specified {@link OrbitModel}.
	 * @param orbitModel The specified {@link OrbitModel}.
	 * @return The Satellite associated with the specified {@link OrbitModel}, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" orbitModelUnique="false"
	 * @generated
	 */
	Satellite getSatellite(OrbitModel orbitModel);

} // ConstellationState
