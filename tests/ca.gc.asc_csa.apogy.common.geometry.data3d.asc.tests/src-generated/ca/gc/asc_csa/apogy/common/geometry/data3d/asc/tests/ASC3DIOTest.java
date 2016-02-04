package ca.gc.asc_csa.apogy.common.geometry.data3d.asc.tests;
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

import java.io.File;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ASC3DIO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Triangular Mesh</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ASC3DIOTest extends TestCase {

	/**
	 * The fixture for this ASC3DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASC3DIO fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ASC3DIOTest.class);
	}

	/**
	 * Constructs a new ASC3DIO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASC3DIOTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ASC3DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ASC3DIO fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ASC3DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASC3DIO getFixture() {
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
		setFixture(ApogyCommonGeometryData3DASCFactory.eINSTANCE.createASC3DIO());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode)
	 * @generated_NOT
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode() 	
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
			
		try
		{
			DigitalElevationMap dem = getFixture().loadDigitalElevationMap(fileName, AltitudeMode.ABSOLUTE);
			assertNotNull(dem);
			assertEquals(10, dem.getXDimension());
			assertEquals(16, dem.getYDimension());
			assertEquals(160, dem.getPoints().size());
		}
		catch(Exception e)
		{
				fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double)
	 * @generated_NOT
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode_double() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{
			// Loads map and re-samples it at 10m. The map is 10*5m along X  by 16 * 5m along Y.
			DigitalElevationMap dem = getFixture().loadDigitalElevationMap(fileName, AltitudeMode.ABSOLUTE, 10.0);
			assertNotNull(dem);
			
			assertEquals(5, dem.getXDimension());
			assertEquals(8, dem.getYDimension());			
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D)
	 * @generated_NOT
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{
			// First test with entire map.
			Coordinates2D fromCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			fromCorner.setX(0);
			fromCorner.setY(0);
			
			Coordinates2D toCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			toCorner.setX(10 * 5);
			toCorner.setY(16 * 5);
			
			DigitalElevationMap dem = getFixture().loadDigitalElevationMap(fileName, AltitudeMode.ABSOLUTE, fromCorner, toCorner);
			assertNotNull(dem);
			assertEquals(10, dem.getXDimension());
			assertEquals(16, dem.getYDimension());
			assertEquals(10 * 16, dem.getPoints().size());
			
			// Second test with half map.
			fromCorner.setX(0);
			fromCorner.setY(0);
						
			toCorner.setX(10 * 5 * 0.5);
			toCorner.setY(16 * 5 * 0.5);
			
			dem = getFixture().loadDigitalElevationMap(fileName, AltitudeMode.ABSOLUTE, fromCorner, toCorner);
			assertNotNull(dem);
			assertEquals(5, dem.getXDimension());
			assertEquals(8, dem.getYDimension());
			assertEquals(5 * 8, dem.getPoints().size());
			
			// Test with a null x dimension
			fromCorner.setX(10 * 5 * 0.5);
			try
			{
				dem = getFixture().loadDigitalElevationMap(fileName, AltitudeMode.ABSOLUTE, fromCorner, toCorner);
				fail("Should not work for a null area!");
			}
			catch(Exception e)
			{				
			}
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadDigitalElevationMap(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double)
	 * @generated_NOT
	 */
	public void testLoadDigitalElevationMap__String_AltitudeMode_Coordinates2D_Coordinates2D_double() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{
			// Test with entire map.
			Coordinates2D fromCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			fromCorner.setX(0);
			fromCorner.setY(0);
			
			Coordinates2D toCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			toCorner.setX(10 * 5);
			toCorner.setY(16 * 5);
			
			DigitalElevationMap dem = getFixture().loadDigitalElevationMap(fileName, AltitudeMode.ABSOLUTE, fromCorner, toCorner, 10.0);
			assertNotNull(dem);
			assertEquals(5, dem.getXDimension());
			assertEquals(8, dem.getYDimension());		
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode)
	 * @generated_NOT
	 */
	public void testLoadTriangularMesh__String_AltitudeMode() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{
			CartesianTriangularMesh mesh = getFixture().loadTriangularMesh(fileName, AltitudeMode.ABSOLUTE);
			assertNotNull(mesh);									
			assertEquals(160, mesh.getPoints().size());
			assertEquals(270, mesh.getPolygons().size());
			
			
			try
			{
				// Saves the result as tri.
				Data3DIO data3DIO = ApogyCommonGeometryData3DFactory.eINSTANCE.createData3DIO();
				data3DIO.saveTriangularMeshAsASCII(mesh, Activator.getDefault().getResultsPath() + File.separator + "testLoadTriangularMesh__String_AltitudeMode");
			}
			catch(Exception e)
			{			
			}
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, double)
	 * @generated_NOT
	 */
	public void testLoadTriangularMesh__String_AltitudeMode_double() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{	
			// Loads map and re-samples it at 10m. The map is 10*5m along X  by 16 * 5m along Y.
			CartesianTriangularMesh mesh = getFixture().loadTriangularMesh(fileName, AltitudeMode.ABSOLUTE, 10.0);
			assertNotNull(mesh);
			
			assertEquals(5*8, mesh.getPoints().size());
			assertEquals(56, mesh.getPolygons().size());
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D)
	 * @generated_NOT
	 */
	public void testLoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{
			Coordinates2D fromCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			fromCorner.setX(0);
			fromCorner.setY(0);
			
			Coordinates2D toCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			toCorner.setX(10 * 5 * 0.5);
			toCorner.setY(16 * 5 * 0.5);
			
			CartesianTriangularMesh mesh = getFixture().loadTriangularMesh(fileName, AltitudeMode.ABSOLUTE, fromCorner, toCorner);
			assertNotNull(mesh);									
			assertEquals(5*8, mesh.getPoints().size());
			assertEquals(56, mesh.getPolygons().size());
						
			try
			{
				// Saves the result as tri.
				Data3DIO data3DIO = ApogyCommonGeometryData3DFactory.eINSTANCE.createData3DIO();
				data3DIO.saveTriangularMeshAsASCII(mesh, Activator.getDefault().getResultsPath() + File.separator + "testLoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D");
			}
			catch(Exception e)
			{				
			}
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASC3DIO#loadTriangularMesh(java.lang.String, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.AltitudeMode, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D, double)
	 * @generated_NOT
	 */
	public void testLoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D_double() 
	{
		String fileName = Activator.getDefault().getDataPath() + File.separator + "test.asc";
		
		try
		{
			Coordinates2D fromCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			fromCorner.setX(0);
			fromCorner.setY(0);
			
			Coordinates2D toCorner = ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D();
			toCorner.setX(10 * 5 * 0.5);
			toCorner.setY(16 * 5 * 0.5);
			
			CartesianTriangularMesh mesh = getFixture().loadTriangularMesh(fileName, AltitudeMode.ABSOLUTE, fromCorner, toCorner, 10.0);
			assertNotNull(mesh);									
			assertEquals(2*4, mesh.getPoints().size());
			assertEquals(6, mesh.getPolygons().size());
						
			try
			{
				// Saves the result as tri.
				Data3DIO data3DIO = ApogyCommonGeometryData3DFactory.eINSTANCE.createData3DIO();
				data3DIO.saveTriangularMeshAsASCII(mesh, Activator.getDefault().getResultsPath() + File.separator + "testLoadTriangularMesh__String_AltitudeMode_Coordinates2D_Coordinates2D");
			}
			catch(Exception e)
			{				
			}
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

} //ASC3DIOTest
