package ca.gc.asc_csa.apogy.core.environment.tests;
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

import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh() <em>Get Current Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage() <em>Force Update Texture Image</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CartesianTriangularMeshMapLayerTest extends AbstractMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshMapLayerTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshMapLayer getFixture() {
		return (CartesianTriangularMeshMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayer());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh() <em>Get Current Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh()
	 * @generated_NOT
	 */
	public void testGetCurrentMesh() {
		// Nothing to test.
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage() <em>Force Update Texture Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage()
	 * @generated_NOT
	 */
	public void testForceUpdateTextureImage() {
		// Nothing to test.
	}

} //CartesianTriangularMeshMapLayerTest
