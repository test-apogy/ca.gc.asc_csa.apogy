package ca.gc.asc_csa.apogy.examples.satellite;
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

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Requests List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * List that contains {@link AbstractConstellationRequest}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequests <em>Constellation Requests</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsList()
 * @model
 * @generated
 */
public interface ConstellationRequestsList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Constellation Requests Lists Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationRequestsLists <em>Constellation Requests Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the container of this {@link ConstellationRequestsList}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests Lists Container</em>' container reference.
	 * @see #setConstellationRequestsListsContainer(ConstellationRequestsListsContainer)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsList_ConstellationRequestsListsContainer()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer#getConstellationRequestsLists
	 * @model opposite="constellationRequestsLists" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ConstellationRequestsListsContainer getConstellationRequestsListsContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList#getConstellationRequestsListsContainer <em>Constellation Requests Lists Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Requests Lists Container</em>' container reference.
	 * @see #getConstellationRequestsListsContainer()
	 * @generated
	 */
	void setConstellationRequestsListsContainer(ConstellationRequestsListsContainer value);

	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the {@link ConstellationState} that contains the current list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' reference.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsList_ConstellationState()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer%> _constellationRequestsListsContainer = this.getConstellationRequestsListsContainer();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_constellationRequestsListsContainer, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsListsContainer%> _constellationRequestsListsContainer_1 = this.getConstellationRequestsListsContainer();\n\treturn _constellationRequestsListsContainer_1.getConstellationState();\n}'"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Returns the value of the '<em><b>Constellation Requests</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation Requests</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * {@link AbstractConstellationRequest} container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Requests</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getConstellationRequestsList_ConstellationRequests()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractConstellationRequest> getConstellationRequests();

} // ConstellationRequestsList
