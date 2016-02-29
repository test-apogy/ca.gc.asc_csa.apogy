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
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constellation Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract class that defines the concept of Constellation Planner.  A planner is used to process
 * a list of {@link AbstractConstellationRequest} and to generate a {@link ConstellationCommandPlan}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationCommandPlan <em>Constellation Command Plan</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellationPlanner extends EObject {

	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlanner <em>Constellation Planner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the {@link ConstellationState} that contains the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' container reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_ConstellationState()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlanner
	 * @model opposite="constellationPlanner" transient="false"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState <em>Constellation State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' container reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the start date used by the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the end date used by the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Constellation Requests List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation Requests List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the list of {@AbstractConstellationRequest} to be processed by the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests List</em>' reference.
	 * @see #setConstellationRequestsList(ConstellationRequestsList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_ConstellationRequestsList()
	 * @model
	 * @generated
	 */
	ConstellationRequestsList getConstellationRequestsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationRequestsList <em>Constellation Requests List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Requests List</em>' reference.
	 * @see #getConstellationRequestsList()
	 * @generated
	 */
	void setConstellationRequestsList(ConstellationRequestsList value);

	/**
	 * Returns the value of the '<em><b>Constellation Command Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation Command Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies in which plan the planner will store its results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Command Plan</em>' reference.
	 * @see #setConstellationCommandPlan(AbstractConstellationCommandPlan)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_ConstellationCommandPlan()
	 * @model
	 * @generated
	 */
	AbstractConstellationCommandPlan getConstellationCommandPlan();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationCommandPlan <em>Constellation Command Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Command Plan</em>' reference.
	 * @see #getConstellationCommandPlan()
	 * @generated
	 */
	void setConstellationCommandPlan(AbstractConstellationCommandPlan value);

	/**
	 * Returns the value of the '<em><b>Elevation Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the elevation mask used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elevation Mask</em>' containment reference.
	 * @see #setElevationMask(ConstantElevationMask)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_ElevationMask()
	 * @model containment="true"
	 * @generated
	 */
	ConstantElevationMask getElevationMask();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getElevationMask <em>Elevation Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Mask</em>' containment reference.
	 * @see #getElevationMask()
	 * @generated
	 */
	void setElevationMask(ConstantElevationMask value);

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
	 * Checks if the pass is valid.
	 * <!-- end-model-doc -->
	 * @model unique="false" visibilityPassUnique="false"
	 * @generated
	 */
	boolean valid(VisibilityPass visibilityPass);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the list of {@link AbstractSatelliteCommand} required to process a specific list of {@link AbstractConstellationRequest}
	 * based on the available constellation satellites.  The plan is added to the list of plans.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.core.Exception"
	 * @generated
	 */
	void plan() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Validates the planner properties.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.core.Exception"
	 * @generated
	 */
	void validate() throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sorts the following requests.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.examples.satellite.SortedSet<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" unique="false" requestsDataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" requestsUnique="false" requestsMany="false"
	 * @generated
	 */
	SortedSet<AbstractConstellationRequest> sortRequests(List<AbstractConstellationRequest> requests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the comparator of {@link AbstractConstellationRequest} used to sort them.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.examples.satellite.Comparator<ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest>" unique="false"
	 * @generated
	 */
	Comparator<AbstractConstellationRequest> getConstellationRequestComparator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates a list of commands to address the specified {@link AbstractConstellationRequest}.
	 * @param request
	 * @param time Time at which the main command must be performed.
	 * @param satellite Refers to the satellite that will perform the command.
	 * @param rollAngle Roll angle associated to the observation request.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.examples.satellite.List<ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand>" unique="false" many="false" requestUnique="false" timeUnique="false" satelliteUnique="false" rollAngleUnique="false"
	 * @generated
	 */
	List<AbstractSatelliteCommand> createObservationSatelliteCommands(AbstractConstellationRequest request, Date time, Satellite satellite, double rollAngle);
} // AbstractConstellationPlanner
