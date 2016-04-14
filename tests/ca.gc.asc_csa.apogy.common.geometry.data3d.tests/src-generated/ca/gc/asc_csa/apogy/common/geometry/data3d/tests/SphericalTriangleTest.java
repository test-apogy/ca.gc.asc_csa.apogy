package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;
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

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spherical Triangle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SphericalTriangleTest extends SphericalPolygonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SphericalTriangleTest.class);
	}

	/**
	 * Constructs a new Spherical Triangle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalTriangleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Spherical Triangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SphericalTriangle getFixture() {
		return (SphericalTriangle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createSphericalTriangle());
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
	 * Tests nothing.
	 */
	public void testNothing()
	{
		assertTrue(true);
	}
} //SphericalTriangleTest
