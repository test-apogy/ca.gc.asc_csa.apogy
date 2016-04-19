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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinatesMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Position Coordinates Mesher</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianPositionCoordinatesMesherTest extends TestCase {

	/**
	 * The fixture for this Cartesian Position Coordinates Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPositionCoordinatesMesher fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianPositionCoordinatesMesherTest.class);
	}

	/**
	 * Constructs a new Cartesian Position Coordinates Mesher test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinatesMesherTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Position Coordinates Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianPositionCoordinatesMesher fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Position Coordinates Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPositionCoordinatesMesher getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinatesMesher());
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
	 * Test nothing.
	 */
	public void testNothing()
	{	
		assertTrue(true);
	}

} //CartesianPositionCoordinatesMesherTest