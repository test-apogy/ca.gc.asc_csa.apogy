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
 * A representation of the model object '<em><b>Constellation Requests Lists Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container of {@link ConstellationRequestsList}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationRequestsLists <em>Constellation Requests Lists</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsListsContainer()
 * @model
 * @generated
 */
public interface ConstellationRequestsListsContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the container {@link ConstellationState}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' container reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsListsContainer_ConstellationState()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationState#getConstellationRequestsListsContainer
	 * @model opposite="constellationRequestsListsContainer" transient="false"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationState <em>Constellation State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' container reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);

	/**
	 * Returns the value of the '<em><b>Constellation Requests Lists</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@link ConstellationRequestsList} container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests Lists</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsListsContainer_ConstellationRequestsLists()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequestsListsContainer
	 * @model opposite="constellationRequestsListsContainer" containment="true"
	 * @generated
	 */
	EList<ConstellationRequestsList> getConstellationRequestsLists();

} // ConstellationRequestsListsContainer
