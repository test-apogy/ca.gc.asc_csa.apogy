/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.tests;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getMu() <em>Get Mu</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createAbsoluteDate(java.util.Date) <em>Create Absolute Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createDate(org.orekit.time.AbsoluteDate) <em>Create Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double) <em>Create Earth Surface Location</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedFrame(org.orekit.frames.Frame) <em>Create Ore Kit Backed Frame</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftEarthSubPoint(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState) <em>Get Spacecraft Earth Sub Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftElevationAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Spacecraft Elevation Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftAzimuthAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Spacecraft Azimuth Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getRange(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Range</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState) <em>Create Spacecraft State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState) <em>Create Ore Kit Backed Spacecraft State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedPVACoordinates(org.orekit.utils.TimeStampedPVCoordinates) <em>Create Timed Stamped PVA Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedAngularCoordinates(org.orekit.utils.TimeStampedAngularCoordinates) <em>Create Timed Stamped Angular Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createMatrix3x3(org.apache.commons.math3.geometry.euclidean.threed.Rotation) <em>Create Matrix3x3</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createRotation(ca.gc.asc_csa.apogy.common.math.Matrix3x3) <em>Create Rotation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator) <em>Create Keplerian Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator) <em>Create Cartesian Earth Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(org.orekit.orbits.KeplerianOrbit) <em>Create Keplerian Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(org.orekit.orbits.CartesianOrbit) <em>Create Cartesian Earth Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState) <em>Convert To Geographic Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftStates(org.orekit.propagation.Propagator, java.util.Date, java.util.Date, double) <em>Get Spacecraft States</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask) <em>Get Target Passes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date) <em>Get Ground Station Passes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getEclipses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, java.util.Date, java.util.Date) <em>Get Eclipses</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByStartDate(java.util.List) <em>Get Visibility Pass Sorted By Start Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByDuration(java.util.List) <em>Get Visibility Pass Sorted By Duration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedByElevation(java.util.List) <em>Get Visibility Pass Spacecraft Position Sorted By Elevation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(java.util.List) <em>Get Visibility Pass Spacecraft Position Sorted By Spacecraft Cross Track Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#loadTLE(java.lang.String) <em>Load TLE</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#exportTLE(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE, java.lang.String) <em>Export TLE</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTLEEarthOrbitModel(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE) <em>Create TLE Earth Orbit Model</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#exportAsCSV(ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory, boolean) <em>Export As CSV</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ApogyCoreEnvironmentOrbitEarthFacadeTest extends TestCase {

	/**
	 * The fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentOrbitEarthFacade fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApogyCoreEnvironmentOrbitEarthFacadeTest.class);
	}

	/**
	 * Constructs a new Facade test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitEarthFacadeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApogyCoreEnvironmentOrbitEarthFacade fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentOrbitEarthFacade getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createApogyCoreEnvironmentOrbitEarthFacade());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getMu() <em>Get Mu</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getMu()
	 * @generated
	 */
	public void testGetMu() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createAbsoluteDate(java.util.Date) <em>Create Absolute Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createAbsoluteDate(java.util.Date)
	 * @generated
	 */
	public void testCreateAbsoluteDate__Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createDate(org.orekit.time.AbsoluteDate) <em>Create Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createDate(org.orekit.time.AbsoluteDate)
	 * @generated
	 */
	public void testCreateDate__AbsoluteDate() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double) <em>Create Earth Surface Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createEarthSurfaceLocation(java.lang.String, java.lang.String, double, double, double)
	 * @generated
	 */
	public void testCreateEarthSurfaceLocation__String_String_double_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedFrame(org.orekit.frames.Frame) <em>Create Ore Kit Backed Frame</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedFrame(org.orekit.frames.Frame)
	 * @generated
	 */
	public void testCreateOreKitBackedFrame__Frame() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftEarthSubPoint(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState) <em>Get Spacecraft Earth Sub Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftEarthSubPoint(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState)
	 * @generated
	 */
	public void testGetSpacecraftEarthSubPoint__OreKitBackedSpacecraftState() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftElevationAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Spacecraft Elevation Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftElevationAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation)
	 * @generated
	 */
	public void testGetSpacecraftElevationAngle__SpacecraftState_EarthSurfaceLocation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftAzimuthAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Spacecraft Azimuth Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftAzimuthAngle(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation)
	 * @generated
	 */
	public void testGetSpacecraftAzimuthAngle__SpacecraftState_EarthSurfaceLocation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getRange(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation) <em>Get Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getRange(ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation)
	 * @generated
	 */
	public void testGetRange__SpacecraftState_EarthSurfaceLocation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState) <em>Create Spacecraft State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState)
	 * @generated
	 */
	public void testCreateSpacecraftState__Orbit_SpacecraftState() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState) <em>Create Ore Kit Backed Spacecraft State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createOreKitBackedSpacecraftState(ca.gc.asc_csa.apogy.core.environment.orbit.Orbit, org.orekit.propagation.SpacecraftState)
	 * @generated
	 */
	public void testCreateOreKitBackedSpacecraftState__Orbit_SpacecraftState() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedPVACoordinates(org.orekit.utils.TimeStampedPVCoordinates) <em>Create Timed Stamped PVA Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedPVACoordinates(org.orekit.utils.TimeStampedPVCoordinates)
	 * @generated
	 */
	public void testCreateTimedStampedPVACoordinates__TimeStampedPVCoordinates() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedAngularCoordinates(org.orekit.utils.TimeStampedAngularCoordinates) <em>Create Timed Stamped Angular Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTimedStampedAngularCoordinates(org.orekit.utils.TimeStampedAngularCoordinates)
	 * @generated
	 */
	public void testCreateTimedStampedAngularCoordinates__TimeStampedAngularCoordinates() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createMatrix3x3(org.apache.commons.math3.geometry.euclidean.threed.Rotation) <em>Create Matrix3x3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createMatrix3x3(org.apache.commons.math3.geometry.euclidean.threed.Rotation)
	 * @generated
	 */
	public void testCreateMatrix3x3__Rotation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createRotation(ca.gc.asc_csa.apogy.common.math.Matrix3x3) <em>Create Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createRotation(ca.gc.asc_csa.apogy.common.math.Matrix3x3)
	 * @generated
	 */
	public void testCreateRotation__Matrix3x3() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator) <em>Create Keplerian Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator)
	 * @generated
	 */
	public void testCreateKeplerianOrbit__EarthOrbitPropagator() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator) <em>Create Cartesian Earth Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator)
	 * @generated
	 */
	public void testCreateCartesianEarthOrbit__EarthOrbitPropagator() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(org.orekit.orbits.KeplerianOrbit) <em>Create Keplerian Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createKeplerianOrbit(org.orekit.orbits.KeplerianOrbit)
	 * @generated
	 */
	public void testCreateKeplerianOrbit__KeplerianOrbit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(org.orekit.orbits.CartesianOrbit) <em>Create Cartesian Earth Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createCartesianEarthOrbit(org.orekit.orbits.CartesianOrbit)
	 * @generated
	 */
	public void testCreateCartesianEarthOrbit__CartesianOrbit() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState) <em>Convert To Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState)
	 * @generated
	 */
	public void testConvertToGeographicCoordinates__OreKitBackedSpacecraftState() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftStates(org.orekit.propagation.Propagator, java.util.Date, java.util.Date, double) <em>Get Spacecraft States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getSpacecraftStates(org.orekit.propagation.Propagator, java.util.Date, java.util.Date, double)
	 * @generated
	 */
	public void testGetSpacecraftStates__Propagator_Date_Date_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask) <em>Get Target Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask)
	 * @generated
	 */
	public void testGetTargetPasses__EarthOrbitModel_EarthSurfaceLocation_Date_Date_ElevationMask() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date) <em>Get Ground Station Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetGroundStationPasses__EarthOrbitModel_GroundStation_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getEclipses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, java.util.Date, java.util.Date) <em>Get Eclipses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getEclipses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetEclipses__EarthOrbitModel_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByStartDate(java.util.List) <em>Get Visibility Pass Sorted By Start Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByStartDate(java.util.List)
	 * @generated
	 */
	public void testGetVisibilityPassSortedByStartDate__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByDuration(java.util.List) <em>Get Visibility Pass Sorted By Duration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSortedByDuration(java.util.List)
	 * @generated
	 */
	public void testGetVisibilityPassSortedByDuration__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedByElevation(java.util.List) <em>Get Visibility Pass Spacecraft Position Sorted By Elevation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedByElevation(java.util.List)
	 * @generated
	 */
	public void testGetVisibilityPassSpacecraftPositionSortedByElevation__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(java.util.List) <em>Get Visibility Pass Spacecraft Position Sorted By Spacecraft Cross Track Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(java.util.List)
	 * @generated
	 */
	public void testGetVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#loadTLE(java.lang.String) <em>Load TLE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#loadTLE(java.lang.String)
	 * @generated
	 */
	public void testLoadTLE__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#exportTLE(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE, java.lang.String) <em>Export TLE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#exportTLE(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE, java.lang.String)
	 * @generated
	 */
	public void testExportTLE__TLE_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTLEEarthOrbitModel(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE) <em>Create TLE Earth Orbit Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#createTLEEarthOrbitModel(ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE)
	 * @generated
	 */
	public void testCreateTLEEarthOrbitModel__TLE() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#exportAsCSV(ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory, boolean) <em>Export As CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade#exportAsCSV(ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory, boolean)
	 * @generated
	 */
	public void testExportAsCSV__VisibilityPassSpacecraftPositionHistory_boolean() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ApogyCoreEnvironmentOrbitEarthFacadeTest
