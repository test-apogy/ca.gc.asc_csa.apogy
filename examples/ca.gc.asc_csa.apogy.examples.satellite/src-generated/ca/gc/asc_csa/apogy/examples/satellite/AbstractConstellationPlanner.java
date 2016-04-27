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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import java.util.Comparator;
import java.util.Date;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;

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
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationPlannersContainer <em>Constellation Planners Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationCommandPlan <em>Constellation Command Plan</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getMaxNumberThreads <em>Max Number Threads</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#isCommandDuplicatesPreserved <em>Command Duplicates Preserved</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellationPlanner extends Named, Described {

	/**
	 * Returns the value of the '<em><b>Constellation Planners Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationPlanners <em>Constellation Planners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the {@link ConstellationState} that contains the planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Planners Container</em>' container reference.
	 * @see #setConstellationPlannersContainer(ConstellationPlannersContainer)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_ConstellationPlannersContainer()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationPlanners
	 * @model opposite="constellationPlanners" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ConstellationPlannersContainer getConstellationPlannersContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationPlannersContainer <em>Constellation Planners Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Planners Container</em>' container reference.
	 * @see #getConstellationPlannersContainer()
	 * @generated
	 */
	void setConstellationPlannersContainer(ConstellationPlannersContainer value);

	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the {@link ConstellationState} that contains the current planner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' reference.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_ConstellationState()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer%> _constellationPlannersContainer = this.getConstellationPlannersContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_constellationPlannersContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer%> _constellationPlannersContainer_1 = this.getConstellationPlannersContainer();\n\treturn _constellationPlannersContainer_1.getConstellationState();\n}'"
	 * @generated
	 */
	ConstellationState getConstellationState();

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
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANNER_SETTINGS'"
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
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANNER_SETTINGS'"
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
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANNER_SETTINGS'"
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
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANNER_SETTINGS'"
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
	 * Returns the value of the '<em><b>Max Number Threads</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the maximum number of threads used by the planner.  0 (default) means the maximum available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Threads</em>' attribute.
	 * @see #setMaxNumberThreads(int)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_MaxNumberThreads()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='PLANNER_SETTINGS'"
	 * @generated
	 */
	int getMaxNumberThreads();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getMaxNumberThreads <em>Max Number Threads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Threads</em>' attribute.
	 * @see #getMaxNumberThreads()
	 * @generated
	 */
	void setMaxNumberThreads(int value);

	/**
	 * Returns the value of the '<em><b>Command Duplicates Preserved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates if the duplicates are preserved.  False (default value) indicates only the first command that addresses a
	 * {@link ObservationConstellationRequest} will be preserved.  The commands that occur after in time will be deleted.  True means
	 * all the commands will be preserved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Duplicates Preserved</em>' attribute.
	 * @see #setCommandDuplicatesPreserved(boolean)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationPlanner_CommandDuplicatesPreserved()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISIBILITY_PASS_VALIDITY'"
	 * @generated
	 */
	boolean isCommandDuplicatesPreserved();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#isCommandDuplicatesPreserved <em>Command Duplicates Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Duplicates Preserved</em>' attribute.
	 * @see #isCommandDuplicatesPreserved()
	 * @generated
	 */
	void setCommandDuplicatesPreserved(boolean value);

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
	 * @model containment="true" required="true"
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
	 * Checks if the pass is valid.
	 * <!-- end-model-doc -->
	 * @model unique="false" visibilityPassUnique="false"
	 * @generated
	 */
	boolean isValid(VisibilityPass visibilityPass);

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
	Satellite getSatellite(EarthOrbitModel orbitModel);

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
	 * Returns the comparator of {@link AbstractRequestBasedSatelliteCommand} used to sort them.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.examples.satellite.Comparator<ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand>" unique="false"
	 * @generated
	 */
	Comparator<AbstractRequestBasedSatelliteCommand> getRequestBasedSatelliteCommandsComparator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instantiates and returns a command instance to address the specified {@link ObservationConstellationRequest}.
	 * @param request Refers to the request.
	 * @param visibilityPass Visibility pass context.
	 * <!-- end-model-doc -->
	 * @model unique="false" requestUnique="false" visibilityPassUnique="false"
	 * @generated
	 */
	VisibilityPassBasedSatelliteCommand createVisibilityPassBasedSatelliteCommand(ObservationConstellationRequest request, VisibilityPass visibilityPass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Populates the content of the command to address the specified {@link ObservationConstellationRequest}.
	 * @param command Command to populate.
	 * @param request Refers to the request.
	 * @param visibilityPass Visibility pass context.
	 * <!-- end-model-doc -->
	 * @model commandUnique="false" requestUnique="false" visibilityPassUnique="false"
	 * @generated
	 */
	void populateVisibilityPassBasedSatelliteCommand(VisibilityPassBasedSatelliteCommand command, ObservationConstellationRequest request, VisibilityPass visibilityPass);
} // AbstractConstellationPlanner
