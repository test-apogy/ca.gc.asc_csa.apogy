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

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Height Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshHeightImageMapLayerTest extends CartesianTriangularMeshDerivedImageMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshHeightImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Height Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshHeightImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Height Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshHeightImageMapLayer getFixture() {
		return (CartesianTriangularMeshHeightImageMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated_NOT
	 */
	@Override
	protected void setUp() throws Exception 
	{
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshHeightImageMapLayer());
		
		getFixture().setCartesianTriangularMeshMapLayer(super.createCartesianTriangularMeshMapLayer());
		getFixture().setRequiredResolution(2.0);
		
		getFixture().setAutoScale(true);
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

	@Override
	public void testUpdateImage__IProgressMonitor() 
	{
		try
		{
			getFixture().updateImage(new NullProgressMonitor());
			
			assertNotNull(getFixture().getImage());			
			
			// Width is 60 m, resolution is 2.0 m/pixel
			assertEquals(30, getFixture().getImage().getWidth());
			
			// Height is 120 m, resolution is 2.0 m/pixel
			assertEquals(60, getFixture().getImage().getHeight());
			
			saveImage(getFixture().getImage(), "CartesianTriangularMeshHeightImageMapLayerTest");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}
	
	@Override
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getImageMapLayerRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(60.0, rectangularRegion.getXDimension());
		assertEquals(120.0, rectangularRegion.getYDimension());
	}
} //CartesianTriangularMeshHeightImageMapLayerTest
