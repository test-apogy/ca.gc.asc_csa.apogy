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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>earth</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentOrbitEarthTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ApogyCoreEnvironmentOrbitEarthTests("earth Tests");
		suite.addTestSuite(OreKitBackedFrameTest.class);
		suite.addTestSuite(NadirPointingAttitudeProviderTest.class);
		suite.addTestSuite(EarthOrbitWorksiteTest.class);
		suite.addTestSuite(EarthOrbitSkyTest.class);
		suite.addTestSuite(InitialOrbitBasedEarthOrbitModelTest.class);
		suite.addTestSuite(KeplerianEarthOrbitTest.class);
		suite.addTestSuite(CartesianEarthOrbitTest.class);
		suite.addTestSuite(ConstantElevationMaskTest.class);
		suite.addTestSuite(KeplerianEarthOrbitPropagatorTest.class);
		suite.addTestSuite(TLEEarthOrbitModelTest.class);
		suite.addTestSuite(URLBasedTLEEarthOrbitPropagatorTest.class);
		suite.addTestSuite(TLETest.class);
		suite.addTestSuite(VisibilityPassSpacecraftPositionHistoryTest.class);
		suite.addTestSuite(SpacecraftsVisibilitySetTest.class);
		suite.addTestSuite(SpacecraftSwathCorridorTest.class);
		suite.addTestSuite(ApogyCoreEnvironmentOrbitEarthFacadeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentOrbitEarthTests(String name) {
		super(name);
	}

} //ApogyCoreEnvironmentOrbitEarthTests
