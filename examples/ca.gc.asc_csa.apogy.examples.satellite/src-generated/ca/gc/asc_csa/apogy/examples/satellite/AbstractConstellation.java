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

import java.rmi.server.UID;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationState <em>Constellation State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellation extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constellation State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' containment reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation_ConstellationState()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationState <em>Constellation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' containment reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates an new instance of {@link UID}.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	AbstractUID newUID();

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
	 * Exports the specified plan into the resource specified by the url.
	 * @param plan Refers the plan to export.
	 * @param url Specifies the location where the plan must be exported.
	 * <!-- end-model-doc -->
	 * @model planUnique="false" urlUnique="false"
	 * @generated
	 */
	void export(ConstellationCommandPlan plan, String url);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Packages and commits the specified plan.
	 * @param plan Reference to the {@link ConstellationCommandPlan}.
	 * <!-- end-model-doc -->
	 * @model planUnique="false"
	 * @generated
	 */
	void commit(ConstellationCommandPlan plan);

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
	 * Imports the {@link ConstellationDownlink} into the current {@link Constellation}.
	 * @param url String that refers the resource that embeds a {@link ConstellationDownlink}.
	 * <!-- end-model-doc -->
	 * @model urlUnique="false"
	 * @generated
	 */
	void importConstellationDownlink(String url);

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

} // AbstractConstellation
