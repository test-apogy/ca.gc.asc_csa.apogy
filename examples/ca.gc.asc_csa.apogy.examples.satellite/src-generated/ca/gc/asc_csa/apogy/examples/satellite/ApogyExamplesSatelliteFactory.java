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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage
 * @generated
 */
public interface ApogyExamplesSatelliteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesSatelliteFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatelliteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>String UID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String UID</em>'.
	 * @generated
	 */
	StringUID createStringUID();

	/**
	 * Returns a new object of class '<em>Constellation Command Plans List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Command Plans List</em>'.
	 * @generated
	 */
	ConstellationCommandPlansList createConstellationCommandPlansList();

	/**
	 * Returns a new object of class '<em>Constellation State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation State</em>'.
	 * @generated
	 */
	ConstellationState createConstellationState();

	/**
	 * Returns a new object of class '<em>Default Constellation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Constellation</em>'.
	 * @generated
	 */
	DefaultConstellation createDefaultConstellation();

	/**
	 * Returns a new object of class '<em>Constellation Planners Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Planners Container</em>'.
	 * @generated
	 */
	ConstellationPlannersContainer createConstellationPlannersContainer();

	/**
	 * Returns a new object of class '<em>Default Constellation Planner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Constellation Planner</em>'.
	 * @generated
	 */
	DefaultConstellationPlanner createDefaultConstellationPlanner();

	/**
	 * Returns a new object of class '<em>Default Constellation Command Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Constellation Command Plan</em>'.
	 * @generated
	 */
	DefaultConstellationCommandPlan createDefaultConstellationCommandPlan();

	/**
	 * Returns a new object of class '<em>Constellation Requests Lists Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Requests Lists Container</em>'.
	 * @generated
	 */
	ConstellationRequestsListsContainer createConstellationRequestsListsContainer();

	/**
	 * Returns a new object of class '<em>Constellation Requests List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Requests List</em>'.
	 * @generated
	 */
	ConstellationRequestsList createConstellationRequestsList();

	/**
	 * Returns a new object of class '<em>Simple Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Request</em>'.
	 * @generated
	 */
	SimpleRequest createSimpleRequest();

	/**
	 * Returns a new object of class '<em>Observation Constellation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Observation Constellation Request</em>'.
	 * @generated
	 */
	ObservationConstellationRequest createObservationConstellationRequest();

	/**
	 * Returns a new object of class '<em>Image Constellation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Constellation Request</em>'.
	 * @generated
	 */
	ImageConstellationRequest createImageConstellationRequest();

	/**
	 * Returns a new object of class '<em>Satellites List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellites List</em>'.
	 * @generated
	 */
	SatellitesList createSatellitesList();

	/**
	 * Returns a new object of class '<em>Satellite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite</em>'.
	 * @generated
	 */
	Satellite createSatellite();

	/**
	 * Returns a new object of class '<em>Visibility Pass Based Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass Based Satellite Command</em>'.
	 * @generated
	 */
	VisibilityPassBasedSatelliteCommand createVisibilityPassBasedSatelliteCommand();

	/**
	 * Returns a new object of class '<em>Acquire Image Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acquire Image Satellite Command</em>'.
	 * @generated
	 */
	AcquireImageSatelliteCommand createAcquireImageSatelliteCommand();

	/**
	 * Returns a new object of class '<em>Orbital Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbital Image</em>'.
	 * @generated
	 */
	OrbitalImage createOrbitalImage();

	/**
	 * Returns a new object of class '<em>Constellation Downlinks List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Downlinks List</em>'.
	 * @generated
	 */
	ConstellationDownlinksList createConstellationDownlinksList();

	/**
	 * Returns a new object of class '<em>Constellation Downlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Downlink</em>'.
	 * @generated
	 */
	ConstellationDownlink createConstellationDownlink();

	/**
	 * Returns a new object of class '<em>Orbital Image Constellation Downlink Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbital Image Constellation Downlink Item</em>'.
	 * @generated
	 */
	OrbitalImageConstellationDownlinkItem createOrbitalImageConstellationDownlinkItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesSatellitePackage getApogyExamplesSatellitePackage();

} //ApogyExamplesSatelliteFactory
