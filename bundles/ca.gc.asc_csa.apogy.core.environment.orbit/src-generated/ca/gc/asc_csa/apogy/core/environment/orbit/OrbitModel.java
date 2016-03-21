package ca.gc.asc_csa.apogy.core.environment.orbit;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.core.AbstractOrbitModel;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that defines an orbit model. An orbit model specifies both initial condition (through the initial Orbit), and
 * a propagation method (through the AbstractOrbitPropagator).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getReferenceFrame <em>Reference Frame</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getAttitudeProvider <em>Attitude Provider</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbitModel()
 * @model
 * @generated
 */
public interface OrbitModel extends AbstractOrbitModel, ValidityRangeProvider {

	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The frame in which the orbit is propagated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference.
	 * @see #setReferenceFrame(AbstractFrame)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbitModel_ReferenceFrame()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFrame getReferenceFrame();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel#getReferenceFrame <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' containment reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(AbstractFrame value);

	/**
	 * Returns the value of the '<em><b>Attitude Provider</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.AttitudeProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attitude provider. Can be used to specify an attitude control law.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attitude Provider</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbitModel_AttitudeProvider()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttitudeProvider> getAttitudeProvider();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Propagate the current orbit to a specified time to get a Spacecraft state.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.Exception" targetDateUnique="false"
	 * @generated
	 */
	SpacecraftState propagate(Date targetDate) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns a list of SpacecraftState from startDate to endDate at time interval of timeInterval.
	 * @param timeInterval The time interval to get spacecraft states, in seconds.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.environment.orbit.List<ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState>" unique="false" many="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.Exception" startDateUnique="false" endDateUnique="false" timeIntervalUnique="false"
	 *        timeIntervalAnnotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='s'"
	 * @generated
	 */
	List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval) throws Exception;

} // OrbitModel
