/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Planners Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of {@link AbstractConstellationPlanner}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationPlanners <em>Constellation Planners</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationPlannersContainer()
 * @model
 * @generated
 */
public interface ConstellationPlannersContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlannersContainer <em>Constellation Planners Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the {@link ConstellationState} that contains this container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' container reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationPlannersContainer_ConstellationState()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationPlannersContainer
	 * @model opposite="constellationPlannersContainer" transient="false"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer#getConstellationState <em>Constellation State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' container reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);

	/**
	 * Returns the value of the '<em><b>Constellation Planners</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationPlannersContainer <em>Constellation Planners Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constellation Planners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Planners</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationPlannersContainer_ConstellationPlanners()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner#getConstellationPlannersContainer
	 * @model opposite="constellationPlannersContainer" containment="true"
	 * @generated
	 */
	EList<AbstractConstellationPlanner> getConstellationPlanners();

} // ConstellationPlannersContainer
