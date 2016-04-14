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

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Visibility Pass Spacecraft Position</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisibilityPassSpacecraftPositionTest extends TestCase {

	/**
	 * The fixture for this Visibility Pass Spacecraft Position test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityPassSpacecraftPosition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VisibilityPassSpacecraftPositionTest.class);
	}

	/**
	 * Constructs a new Visibility Pass Spacecraft Position test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPassSpacecraftPositionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Visibility Pass Spacecraft Position test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VisibilityPassSpacecraftPosition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Visibility Pass Spacecraft Position test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityPassSpacecraftPosition getFixture() {
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
		setFixture(ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createVisibilityPassSpacecraftPosition());
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

} //VisibilityPassSpacecraftPositionTest
