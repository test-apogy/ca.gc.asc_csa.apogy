package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
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
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitEarthFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitEarthFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.ApogyCoreEnvironmentOrbitEarthFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ore Kit Backed Spacecraft State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ore Kit Backed Spacecraft State</em>'.
	 * @generated
	 */
	OreKitBackedSpacecraftState createOreKitBackedSpacecraftState();

	/**
	 * Returns a new object of class '<em>Ore Kit Backed Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ore Kit Backed Frame</em>'.
	 * @generated
	 */
	OreKitBackedFrame createOreKitBackedFrame();

	/**
	 * Returns a new object of class '<em>Nadir Pointing Attitude Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nadir Pointing Attitude Provider</em>'.
	 * @generated
	 */
	NadirPointingAttitudeProvider createNadirPointingAttitudeProvider();

	/**
	 * Returns a new object of class '<em>Earth Orbit Worksite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Orbit Worksite</em>'.
	 * @generated
	 */
	EarthOrbitWorksite createEarthOrbitWorksite();

	/**
	 * Returns a new object of class '<em>Earth Orbit Sky</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Orbit Sky</em>'.
	 * @generated
	 */
	EarthOrbitSky createEarthOrbitSky();

	/**
	 * Returns a new object of class '<em>Initial Orbit Based Earth Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Orbit Based Earth Orbit Model</em>'.
	 * @generated
	 */
	InitialOrbitBasedEarthOrbitModel createInitialOrbitBasedEarthOrbitModel();

	/**
	 * Returns a new object of class '<em>Keplerian Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keplerian Earth Orbit</em>'.
	 * @generated
	 */
	KeplerianEarthOrbit createKeplerianEarthOrbit();

	/**
	 * Returns a new object of class '<em>Cartesian Earth Orbit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Earth Orbit</em>'.
	 * @generated
	 */
	CartesianEarthOrbit createCartesianEarthOrbit();

	/**
	 * Returns a new object of class '<em>Constant Elevation Mask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Elevation Mask</em>'.
	 * @generated
	 */
	ConstantElevationMask createConstantElevationMask();

	/**
	 * Returns a new object of class '<em>Keplerian Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keplerian Earth Orbit Propagator</em>'.
	 * @generated
	 */
	KeplerianEarthOrbitPropagator createKeplerianEarthOrbitPropagator();

	/**
	 * Returns a new object of class '<em>TLE Earth Orbit Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLE Earth Orbit Model</em>'.
	 * @generated
	 */
	TLEEarthOrbitModel createTLEEarthOrbitModel();

	/**
	 * Returns a new object of class '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Based TLE Earth Orbit Propagator</em>'.
	 * @generated
	 */
	URLBasedTLEEarthOrbitPropagator createURLBasedTLEEarthOrbitPropagator();

	/**
	 * Returns a new object of class '<em>TLE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLE</em>'.
	 * @generated
	 */
	TLE createTLE();

	/**
	 * Returns a new object of class '<em>Ground Station References List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station References List</em>'.
	 * @generated
	 */
	GroundStationReferencesList createGroundStationReferencesList();

	/**
	 * Returns a new object of class '<em>Ground Station</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station</em>'.
	 * @generated
	 */
	GroundStation createGroundStation();

	/**
	 * Returns a new object of class '<em>Ground Station List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ground Station List</em>'.
	 * @generated
	 */
	GroundStationList createGroundStationList();

	/**
	 * Returns a new object of class '<em>Visibility Pass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass</em>'.
	 * @generated
	 */
	VisibilityPass createVisibilityPass();

	/**
	 * Returns a new object of class '<em>Visibility Pass Spacecraft Position History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass Spacecraft Position History</em>'.
	 * @generated
	 */
	VisibilityPassSpacecraftPositionHistory createVisibilityPassSpacecraftPositionHistory();

	/**
	 * Returns a new object of class '<em>Visibility Pass Spacecraft Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visibility Pass Spacecraft Position</em>'.
	 * @generated
	 */
	VisibilityPassSpacecraftPosition createVisibilityPassSpacecraftPosition();

	/**
	 * Returns a new object of class '<em>Spacecrafts Visibility Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecrafts Visibility Set</em>'.
	 * @generated
	 */
	SpacecraftsVisibilitySet createSpacecraftsVisibilitySet();

	/**
	 * Returns a new object of class '<em>Corridor Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corridor Point</em>'.
	 * @generated
	 */
	CorridorPoint createCorridorPoint();

	/**
	 * Returns a new object of class '<em>Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corridor</em>'.
	 * @generated
	 */
	Corridor createCorridor();

	/**
	 * Returns a new object of class '<em>Spacecraft Swath Corridor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spacecraft Swath Corridor</em>'.
	 * @generated
	 */
	SpacecraftSwathCorridor createSpacecraftSwathCorridor();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitEarthFacade createApogyCoreEnvironmentOrbitEarthFacade();

	/**
	 * Returns a new object of class '<em>Eclipse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse</em>'.
	 * @generated
	 */
	Eclipse createEclipse();

	/**
	 * Returns a new object of class '<em>Eclipse Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eclipse Event</em>'.
	 * @generated
	 */
	EclipseEvent createEclipseEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreEnvironmentOrbitEarthPackage getApogyCoreEnvironmentOrbitEarthPackage();

} //ApogyCoreEnvironmentOrbitEarthFactory
