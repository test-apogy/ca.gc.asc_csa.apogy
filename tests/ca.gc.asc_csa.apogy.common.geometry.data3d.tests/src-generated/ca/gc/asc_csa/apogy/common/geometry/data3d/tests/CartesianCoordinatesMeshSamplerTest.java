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

import ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode;
import ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMeshSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Coordinates Mesh Sampler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianCoordinatesMeshSamplerTest extends TestCase {

	private static ApogyCommonGeometryData3DFacade data3dFacade = ApogyCommonGeometryData3DFacade.INSTANCE;
	
	/**
	 * The fixture for this Cartesian Coordinates Mesh Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesMeshSampler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianCoordinatesMeshSamplerTest.class);
	}

	/**
	 * Constructs a new Cartesian Coordinates Mesh Sampler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesMeshSamplerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Coordinates Mesh Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianCoordinatesMeshSampler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Coordinates Mesh Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesMeshSampler getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesMeshSampler());
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void testProcess() 
	{
		CartesianCoordinatesMesh mesh = MeshSampleProvider.getCube(1.0);
		System.out.println("mesh.getPoints().size()   : " + mesh.getPoints().size());
		System.out.println("mesh.getPolygons().size() : " + mesh.getPolygons().size());
		
		try
		{
			// Test with no sampling shape.
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			assertEquals(0, sampled.getPoints().size());
			assertEquals(0, sampled.getPolygons().size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
				
		SphereSamplingShape sphere1 = ApogyCommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape();
		sphere1.setCenter(data3dFacade.createCartesianPositionCoordinates(0,0,0));
		sphere1.setRadius(0.5);
		
		try
		{
			// Test with one sampling sphere that yields no data.
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			assertEquals(0, sampled.getPoints().size());
			assertEquals(0, sampled.getPolygons().size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		try
		{
			// Test with one sampling sphere that yields all the data.
			sphere1.setRadius(2.0);
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			assertEquals(mesh.getPoints().size(), sampled.getPoints().size());
			assertEquals(mesh.getPolygons().size(), sampled.getPolygons().size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}

		try
		{
			// Test with one sampling sphere that yields half the points and only 2 polygons
			getFixture().getCoordinatesSamplingShapes().clear();
			sphere1.setCenter(data3dFacade.createCartesianPositionCoordinates(100,0,0));
			sphere1.setRadius(100);					
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			
			getFixture().setPolygonSamplingMode(PolygonSamplingMode.ALL_VERTEX);
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			
			assertEquals(4, sampled.getPoints().size());
			assertEquals(2, sampled.getPolygons().size());			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		try
		{
			System.out.println("HERE !!!!");
			
			// Test with one sampling sphere that yields all the points and 10 out of 12 polygons
			getFixture().getCoordinatesSamplingShapes().clear();
			sphere1.setCenter(data3dFacade.createCartesianPositionCoordinates(100,0,0));
			sphere1.setRadius(100);					
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			
			getFixture().setPolygonSamplingMode(PolygonSamplingMode.AT_LEAST_ONE_VERTEX);
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			
			System.out.println("sampled.getPoints().size()   : " + sampled.getPoints().size());
			System.out.println("sampled.getPolygons().size() : " + sampled.getPolygons().size());
			
			assertEquals(8, sampled.getPoints().size());
			assertEquals(10, sampled.getPolygons().size());			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		try
		{						
			// Test with two sampling spheres that, together, yield all the points.
			getFixture().getCoordinatesSamplingShapes().clear();
			sphere1.setCenter(data3dFacade.createCartesianPositionCoordinates(100,0,0));
			sphere1.setRadius(100);
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			
			SphereSamplingShape sphere2 = ApogyCommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape();
			sphere2.setCenter(data3dFacade.createCartesianPositionCoordinates(-100,0,0));
			sphere2.setRadius(100);									
			getFixture().getCoordinatesSamplingShapes().add(sphere2);
			
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			assertEquals(mesh.getPoints().size(), sampled.getPoints().size());
			assertEquals(mesh.getPolygons().size(), sampled.getPolygons().size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}	
		
		try
		{
			// Test with two non intersection sampling spheres that yield no points.
			getFixture().getCoordinatesSamplingShapes().clear();
			getFixture().setShapeSamplingMode(ShapeSamplingMode.INTERSECTION);
			
			sphere1.setCenter(data3dFacade.createCartesianPositionCoordinates(100,0,0));
			sphere1.setRadius(100);
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			
			SphereSamplingShape sphere2 = ApogyCommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape();
			sphere2.setCenter(data3dFacade.createCartesianPositionCoordinates(-100,0,0));
			sphere2.setRadius(100);									
			getFixture().getCoordinatesSamplingShapes().add(sphere2);
			
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			assertEquals(0, sampled.getPoints().size());
			assertEquals(0, sampled.getPolygons().size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}	
		
		try
		{
			// Test with two intersection sampling spheres that yield half points.
			getFixture().getCoordinatesSamplingShapes().clear();
			getFixture().setShapeSamplingMode(ShapeSamplingMode.INTERSECTION);
			
			sphere1.setCenter(data3dFacade.createCartesianPositionCoordinates(100,0,0));
			sphere1.setRadius(100);
			getFixture().getCoordinatesSamplingShapes().add(sphere1);
			
			SphereSamplingShape sphere2 = ApogyCommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape();
			sphere2.setCenter(data3dFacade.createCartesianPositionCoordinates(0,0,0));
			sphere2.setRadius(100);		
			
			getFixture().setPolygonSamplingMode(PolygonSamplingMode.ALL_VERTEX);
			getFixture().getCoordinatesSamplingShapes().add(sphere2);
			
			CartesianCoordinatesMesh sampled = (CartesianCoordinatesMesh) getFixture().process(mesh);
			assertNotNull(sampled);
			assertEquals(4, sampled.getPoints().size());
			assertEquals(2, sampled.getPolygons().size());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}	
	}
} //CartesianCoordinatesMeshSamplerTest
