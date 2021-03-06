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

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getFromValidDate() <em>From Valid Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getToValidDate() <em>To Valid Date</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getOreKitPropagator() <em>Get Ore Kit Propagator</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#propagate(java.util.Date) <em>Propagate</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double) <em>Get Spacecraft States</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask) <em>Get Target Passes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date) <em>Get Ground Station Passes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getEclipses(java.util.Date, java.util.Date) <em>Get Eclipses</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getInitialOrbit() <em>Get Initial Orbit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#isDateInValidRange(java.util.Date) <em>Is Date In Valid Range</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class EarthOrbitPropagatorTest extends TestCase {

	/**
	 * The fixture for this Earth Orbit Propagator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitPropagator fixture = null;

	/**
	 * Constructs a new Earth Orbit Propagator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthOrbitPropagatorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Earth Orbit Propagator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EarthOrbitPropagator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Earth Orbit Propagator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitPropagator getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getOreKitPropagator() <em>Get Ore Kit Propagator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getOreKitPropagator()
	 * @generated_NOT
	 */
	public void testGetOreKitPropagator() 
	{
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#propagate(java.util.Date) <em>Propagate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#propagate(java.util.Date)
	 * @generated
	 */
	public void testPropagate__Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double) <em>Get Spacecraft States</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getSpacecraftStates(java.util.Date, java.util.Date, double)
	 * @generated
	 */
	public void testGetSpacecraftStates__Date_Date_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask) <em>Get Target Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getTargetPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation, java.util.Date, java.util.Date, ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask)
	 * @generated
	 */
	public void testGetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date) <em>Get Ground Station Passes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getGroundStationPasses(ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetGroundStationPasses__GroundStation_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getEclipses(java.util.Date, java.util.Date) <em>Get Eclipses</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getEclipses(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetEclipses__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getInitialOrbit() <em>Get Initial Orbit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator#getInitialOrbit()
	 * @generated_NOT
	 */
	public void testGetInitialOrbit() 
	{	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getFromValidDate() <em>From Valid Date</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getFromValidDate()
	 * @generated
	 */
	public void testGetFromValidDate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getToValidDate() <em>To Valid Date</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getToValidDate()
	 * @generated
	 */
	public void testGetToValidDate() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#isDateInValidRange(java.util.Date) <em>Is Date In Valid Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#isDateInValidRange(java.util.Date)
	 * @generated
	 */
	public void testIsDateInValidRange__Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //EarthOrbitPropagatorTest
