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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data3 DIO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream) <em>Load Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream) <em>Save Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String) <em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String) <em>Load Triangular Mesh From ASCII</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh As ASCII</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String) <em>Load XYZ</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String) <em>Load Triangular Mesh From Tri XYZ</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To XYZ</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To XYZ</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To CSV</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To CSV</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class Data3DIOTest extends TestCase 
{
	
	/**
	 * The fixture for this Data3 DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3DIO fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Data3DIOTest.class);
	}

	/**
	 * Constructs a new Data3 DIO test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3DIOTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data3 DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Data3DIO fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data3 DIO test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3DIO getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createData3DIO());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.lang.String)
	 * @generated_NOT
	 */
	public void testLoadTriangularMesh__String() 
	{
		try 
		{
			String xyzFile = Activator.getDefault().getDataPath() + File.separator + "good.xyz";
			String triFile = Activator.getDefault().getDataPath() + File.separator + "good.tri";
			
			// We then load ASCII files, which is the original file converted into the xml.
			CartesianTriangularMesh originalMesh = getFixture().loadTriangularMeshFromTriXYZ(triFile, xyzFile);
		
			// Then attempts to load the xmi version of the same mesh.			
			URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path("data/good.xml"), null);
			IPath xmlDataFileLocation = new Path(FileLocator.resolve(url).getPath());

			Data3DIO io = ApogyCommonGeometryData3DFactory.eINSTANCE.createData3DIO();
			CartesianTriangularMesh xmiMesh = null;
			try 
			{
				xmiMesh = io.loadTriangularMesh(xmlDataFileLocation.toOSString());
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				fail(e.getMessage());
			}
			
			assertNotNull(xmiMesh);
			assertEquals(originalMesh.getPoints().size(), xmiMesh.getPoints().size());
			assertEquals(originalMesh.getPolygons().size(), xmiMesh.getPolygons().size());

			// We compare each vertex.			
			for(int i = 0; i < xmiMesh.getPoints().size(); i++)
			{
				CartesianPositionCoordinates pOriginal = originalMesh.getPoints().get(i);
				CartesianPositionCoordinates pReloaded = xmiMesh.getPoints().get(i);
				assertEquals(pOriginal.getX(), pReloaded.getX(), 1E-9);
				assertEquals(pOriginal.getY(), pReloaded.getY(), 1E-9);
				assertEquals(pOriginal.getZ(), pReloaded.getZ(), 1E-9);
			}
		} 
		catch (IOException e) 
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream) <em>Load Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMesh(java.io.InputStream)
	 * @generated_NOT
	 */
	public void testLoadTriangularMesh__InputStream() 
	{		
		try 
		{
			String xyzFile = Activator.getDefault().getDataPath() + File.separator + "good.xyz";
			String triFile = Activator.getDefault().getDataPath() + File.separator + "good.tri";
			
			// We then load ASCII files, which is the original file converted into the xml.
			CartesianTriangularMesh originalMesh = getFixture().loadTriangularMeshFromTriXYZ(triFile, xyzFile);
		
			// Then attempts to load the xmi version of the same mesh.			
			URL url = FileLocator.find(Activator.getDefault().getBundle(), new Path("data/good.xml"), null);
			IPath xmlDataFileLocation = new Path(FileLocator.resolve(url).getPath());

			Data3DIO io = ApogyCommonGeometryData3DFactory.eINSTANCE.createData3DIO();
			CartesianTriangularMesh xmiMesh = null;
			try 
			{
				xmiMesh = io.loadTriangularMesh(new FileInputStream(xmlDataFileLocation.toOSString()));
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				fail(e.getMessage());
			}
			
			assertNotNull(xmiMesh);
			assertEquals(originalMesh.getPoints().size(), xmiMesh.getPoints().size());
			assertEquals(originalMesh.getPolygons().size(), xmiMesh.getPolygons().size());

			// We compare each vertex.			
			for(int i = 0; i < xmiMesh.getPoints().size(); i++)
			{
				CartesianPositionCoordinates pOriginal = originalMesh.getPoints().get(i);
				CartesianPositionCoordinates pReloaded = xmiMesh.getPoints().get(i);
				assertEquals(pOriginal.getX(), pReloaded.getX(), 1E-9);
				assertEquals(pOriginal.getY(), pReloaded.getY(), 1E-9);
				assertEquals(pOriginal.getZ(), pReloaded.getZ(), 1E-9);
			}
		} 
		catch (IOException e) 
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String)
	 * @generated_NOT
	 */
	public void testSaveTriangularMesh__CartesianTriangularMesh_String() 
	{
		// First, loads a CartesianTriangularMesh from a .tri and .xyz file.
		String xyzFile = Activator.getDefault().getDataPath() + File.separator+ "good.xyz";
		String triFile = Activator.getDefault().getDataPath() + File.separator+ "good.tri";
		
		try 
		{
			CartesianTriangularMesh originalMesh = getFixture().loadTriangularMeshFromTriXYZ(triFile, xyzFile);
			
			// Saves the mesh as XMI ressource.
			String xmiFile = Activator.getDefault().getDataPath() + File.separator+ "testSaveTriangularMesh.xmi";
			getFixture().saveTriangularMesh(originalMesh, xmiFile);
			
			// Relads the file to ensure it saved properly.
			
			CartesianTriangularMesh reloadedMesh = getFixture().loadTriangularMesh(xmiFile);
			assertNotNull(reloadedMesh);
			assertEquals(25904, reloadedMesh.getPoints().size());
			assertEquals(49721, reloadedMesh.getPolygons().size());
			
			// Checks that the point are the same.
			for(int i = 0; i < reloadedMesh.getPoints().size(); i++)
			{
				CartesianPositionCoordinates pOriginal = originalMesh.getPoints().get(i);
				CartesianPositionCoordinates pReloaded = reloadedMesh.getPoints().get(i);
				assertEquals(pOriginal.getX(), pReloaded.getX(), 1E-9);
				assertEquals(pOriginal.getY(), pReloaded.getY(), 1E-9);
				assertEquals(pOriginal.getZ(), pReloaded.getZ(), 1E-9);
			}
			
			// TODO : Check the triangles are the same.
			
		} 
		catch (IOException e) 
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream) <em>Save Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.io.OutputStream)
	 * @generated_NOT
	 */
	public void testSaveTriangularMesh__CartesianTriangularMesh_OutputStream() 
	{
		// First, loads a CartesianTriangularMesh from a .tri and .xyz file.
		String xyzFile = Activator.getDefault().getDataPath() + File.separator+ "good.xyz";
		String triFile = Activator.getDefault().getDataPath() + File.separator+ "good.tri";
		
		try 
		{
			CartesianTriangularMesh originalMesh = getFixture().loadTriangularMeshFromTriXYZ(triFile, xyzFile);
			
			// Saves the mesh as XMI ressource.
			String xmiFile = Activator.getDefault().getDataPath() + File.separator+ "testSaveTriangularMesh.xmi";
			getFixture().saveTriangularMesh(originalMesh, new FileOutputStream(xmiFile));
			
			// Relads the file to ensure it saved properly.
			
			CartesianTriangularMesh reloadedMesh = getFixture().loadTriangularMesh(xmiFile);
			assertNotNull(reloadedMesh);
			assertEquals(25904, reloadedMesh.getPoints().size());
			assertEquals(49721, reloadedMesh.getPolygons().size());
			
			// Checks that the point are the same.
			for(int i = 0; i < reloadedMesh.getPoints().size(); i++)
			{
				CartesianPositionCoordinates pOriginal = originalMesh.getPoints().get(i);
				CartesianPositionCoordinates pReloaded = reloadedMesh.getPoints().get(i);
				assertEquals(pOriginal.getX(), pReloaded.getX(), 1E-9);
				assertEquals(pOriginal.getY(), pReloaded.getY(), 1E-9);
				assertEquals(pOriginal.getZ(), pReloaded.getZ(), 1E-9);
			}
			
			// TODO : Check the triangles are the same.
			
		} 
		catch (IOException e) 
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String) <em>Load Triangular Mesh From ASCII As Normal Point Cloud</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCIIAsNormalPointCloud(java.lang.String)
	 * @generated_NOT
	 */
	public void testLoadTriangularMeshFromASCIIAsNormalPointCloud__String() 
	{
		// TODO : Implement this test.
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String) <em>Load Triangular Mesh From ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromASCII(java.lang.String)
	 * @generated_NOT
	 */
	public void testLoadTriangularMeshFromASCII__String() 
	{
		String goodPrefix = Activator.getDefault().getDataPath() + File.separator + "good";
		String badIndexPrefix = Activator.getDefault().getDataPath() + File.separator + "bad-index";
		String badCoordPrefix = Activator.getDefault().getDataPath() + File.separator + "bad-coord";
		String badFileName = Activator.getDefault().getDataPath() + File.separator + "dummy";

		try 
		{
			getFixture().loadTriangularMeshFromASCII(goodPrefix);

			try 
			{
				getFixture().loadTriangularMeshFromASCII(badIndexPrefix);
				fail();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				assertTrue(true);
			}

			try {
				getFixture().loadTriangularMeshFromASCII(badCoordPrefix);
				fail();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				assertTrue(true);
			}

			try {
				getFixture().loadTriangularMeshFromASCII(badFileName);
				fail();
			} catch (FileNotFoundException e) {
				// e.printStackTrace();
			}

		} catch (IOException e) {
			e.printStackTrace();
			fail();
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String) <em>Save Triangular Mesh As ASCII</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveTriangularMeshAsASCII(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, java.lang.String)
	 * @generated_NOT
	 */
	public void testSaveTriangularMeshAsASCII__CartesianTriangularMesh_String() 
	{
		try 
		{
			// First, loads a mesh from a .xyz and .tri files.
			String goodPrefix = Activator.getDefault().getDataPath()+ File.separator + "good";
			CartesianTriangularMesh loadedMesh = getFixture().loadTriangularMeshFromASCII(goodPrefix);

			// Saves the mesh to file.
			String exportPrefix = Activator.getDefault().getTempDir() + File.separator + "exported";
			getFixture().saveTriangularMeshAsASCII(loadedMesh, exportPrefix);

			// Reloads the result and compares it to the original.
			CartesianTriangularMesh reLoadedMesh = getFixture().loadTriangularMeshFromASCII(exportPrefix);

			assertEquals(loadedMesh.getPoints().size(), reLoadedMesh.getPoints().size());
			assertEquals(loadedMesh.getPolygons().size(), reLoadedMesh.getPolygons().size());

			// Verifies that the points are the same.
			int numberOfPoints = loadedMesh.getPoints().size();
			for (int i = 0; i < numberOfPoints; i++) 
			{
				CartesianPositionCoordinates pOriginal = loadedMesh.getPoints()	.get(i);
				CartesianPositionCoordinates pReloaded = reLoadedMesh.getPoints().get(i);
				double distance = pOriginal.asPoint3d().distance(pReloaded.asPoint3d());
				assertEquals(0, distance, 1E-10);
			}

			// Verifies that the polygons are the same.
			int numberOfPolygons = loadedMesh.getPolygons().size();
			for (int i = 0; i < numberOfPolygons; i++) 
			{
				CartesianTriangle tOriginal = loadedMesh.getPolygons().get(i);
				CartesianTriangle tReloaded = reLoadedMesh.getPolygons().get(i);
				for (int index = 0; index < 3; index++) 
				{
					CartesianPositionCoordinates pOriginal = tOriginal.getVertices().get(index);
					CartesianPositionCoordinates pReloaded = tReloaded.getVertices().get(index);
					double distance = pOriginal.asPoint3d().distance(pReloaded.asPoint3d());
					assertEquals(0, distance, 1E-10);
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			fail(e.getMessage());
		}	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String) <em>Load XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadXYZ(java.lang.String)
	 * @generated_NOT
	 */
	@SuppressWarnings("unused")
	public void testLoadXYZ__String() 
	{
		// Valid file.
		String okFile = Activator.getDefault().getDataPath() + File.separator+ "test1.xyz";

		// File with a synthax error in it: wrong column count
		String synthaxError1File = Activator.getDefault().getDataPath() + File.separator + "error1.xyz";

		// File with a synthax eror in it: non numerical value.
		String synthaxError2File = Activator.getDefault().getDataPath()	+ File.separator + "error2.xyz";

		// Non existing file.
		String nonExistingFile = Activator.getDefault().getDataPath() + File.separator + "invalid.xyz";

		// We load the ok file.
		try 
		{
			CartesianCoordinatesSet points = getFixture().loadXYZ(okFile);

			// The should be 2 points.
			assertEquals(2, points.getPoints().size());

			// Point values should be 1.0 2.0 3.0, 4.0 5.0 6.0
			double coordValue = 1.0;

			for (CartesianPositionCoordinates point : points.getPoints()) 
			{
				assertEquals(coordValue, point.getX());
				coordValue += 1.0;

				assertEquals(coordValue, point.getY());
				coordValue += 1.0;

				assertEquals(coordValue, point.getZ());
				coordValue += 1.0;

			}

		} 
		catch (IOException e) 
		{
			fail();
		}

		// We load the synthax error file 1.
		try 
		{
			CartesianCoordinatesSet points = getFixture().loadXYZ(synthaxError1File);

			// If we reach this point, we failed.
			fail("The file <" + synthaxError1File + "> should not be loadable!");
		} 
		catch (IOException e) 
		{
			fail();
			e.printStackTrace();
		} 
		catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
			assertTrue(true);
		}

		// We load the synthax error file 2.
		try 
		{
			CartesianCoordinatesSet points = getFixture().loadXYZ(synthaxError2File);

			// If we reach this point, we failed.
			fail();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			fail();
		} 
		catch (IllegalArgumentException e) 
		{
			e.printStackTrace();
			assertTrue(true);
		}

		// We load the synthax error file 2.
		try 
		{
			CartesianCoordinatesSet points = getFixture().loadXYZ(nonExistingFile);

			// If we reach this point, we failed.
			fail();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			assertTrue(true);
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String) <em>Load Triangular Mesh From Tri XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#loadTriangularMeshFromTriXYZ(java.lang.String, java.lang.String)
	 * @generated_NOT
	 */
	public void testLoadTriangularMeshFromTriXYZ__String_String() 
	{
		String xyzFile = Activator.getDefault().getDataPath() + File.separator+ "good.xyz";
		String triFile = Activator.getDefault().getDataPath() + File.separator+ "good.tri";
		
		try 
		{
			CartesianTriangularMesh mesh = getFixture().loadTriangularMeshFromTriXYZ(triFile, xyzFile);
			
			assertNotNull(mesh);
			assertEquals(25904, mesh.getPoints().size());
			assertEquals(49721, mesh.getPolygons().size());
		} 
		catch (IOException e) 
		{		
			fail(e.getMessage());
		}

	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String)
	 * @generated_NOT
	 */
	public void testSaveCoordinatesSetToXYZ__CartesianCoordinatesSet_String() 
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(10, 0, 0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 20, 0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 30);
		
		cartesianCoordinatesSet.getPoints().add(p0);
		cartesianCoordinatesSet.getPoints().add(p1);
		cartesianCoordinatesSet.getPoints().add(p2);
		
		try
		{
			String xyzFile = Activator.getDefault().getTempDir() + File.separator + "testSaveCoordinatesSetToXYZPath.xyz";			
			getFixture().saveCoordinatesSetToXYZ(cartesianCoordinatesSet, xyzFile);
			
			// Reloads the file created.
			CartesianCoordinatesSet reloadedSet = getFixture().loadXYZ(xyzFile);
			
			assertNotNull(reloadedSet);
			assertEquals(cartesianCoordinatesSet.getPoints().size(), cartesianCoordinatesSet.getPoints().size());
			
			for(int i = 0; i < cartesianCoordinatesSet.getPoints().size(); i++)
			{
				CartesianPositionCoordinates original = cartesianCoordinatesSet.getPoints().get(i);
				CartesianPositionCoordinates loaded = reloadedSet.getPoints().get(i);
				
				assertEquals(original.getX(), loaded.getX(), 1E-9);
				assertEquals(original.getY(), loaded.getY(), 1E-9);
				assertEquals(original.getZ(), loaded.getZ(), 1E-9);
			}
		}
		catch (Exception e) 
		{		
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To XYZ</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToXYZ(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream)
	 * @generated_NOT
	 */
	public void testSaveCoordinatesSetToXYZ__CartesianCoordinatesSet_OutputStream() 	
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(10, 0, 0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 20, 0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 30);
		
		cartesianCoordinatesSet.getPoints().add(p0);
		cartesianCoordinatesSet.getPoints().add(p1);
		cartesianCoordinatesSet.getPoints().add(p2);
		
		try
		{
			String xyzFile = Activator.getDefault().getTempDir() + File.separator + "testSaveCoordinatesSetToXYZOutputStream.xyz";			
			getFixture().saveCoordinatesSetToXYZ(cartesianCoordinatesSet, new FileOutputStream(xyzFile));
			
			// Reloads the file created.
			CartesianCoordinatesSet reloadedSet = getFixture().loadXYZ(xyzFile);
			
			assertNotNull(reloadedSet);
			assertEquals(cartesianCoordinatesSet.getPoints().size(), cartesianCoordinatesSet.getPoints().size());
			
			for(int i = 0; i < cartesianCoordinatesSet.getPoints().size(); i++)
			{
				CartesianPositionCoordinates original = cartesianCoordinatesSet.getPoints().get(i);
				CartesianPositionCoordinates loaded = reloadedSet.getPoints().get(i);
				
				assertEquals(original.getX(), loaded.getX(), 1E-9);
				assertEquals(original.getY(), loaded.getY(), 1E-9);
				assertEquals(original.getZ(), loaded.getZ(), 1E-9);
			}
		}
		catch (Exception e) 
		{		
			fail(e.getMessage());
		}
	}
	
	
	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String) <em>Save Coordinates Set To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.lang.String)
	 * @generated_NOT
	 */
	public void testSaveCoordinatesSetToCSV__CartesianCoordinatesSet_String() 
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(10, 0, 0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 20, 0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 30);
		
		cartesianCoordinatesSet.getPoints().add(p0);
		cartesianCoordinatesSet.getPoints().add(p1);
		cartesianCoordinatesSet.getPoints().add(p2);

		try
		{
			String csvFile = Activator.getDefault().getTempDir() + File.separator + "testSaveCoordinatesSetToCSVPath.csv";			
			getFixture().saveCoordinatesSetToCSV(cartesianCoordinatesSet, csvFile);
			
			// Reloads the file.
			List<String> lines = Files.readAllLines(Paths.get(csvFile));
			assertEquals(3, lines.size());
			
			// Goes through each line to ensure is contains the point coordinates.
			int i = 0;
			for(String line : lines)
			{
				String[] data = line.split(",");
				if(data.length == 3)
				{
					double x = Double.parseDouble(data[0]);
					double y = Double.parseDouble(data[1]);
					double z = Double.parseDouble(data[2]);
					
					assertEquals(cartesianCoordinatesSet.getPoints().get(i).getX(), x, 1E-9);
					assertEquals(cartesianCoordinatesSet.getPoints().get(i).getY(), y, 1E-9);
					assertEquals(cartesianCoordinatesSet.getPoints().get(i).getZ(), z, 1E-9);
					
					i++;
				}
				else
				{
					fail();
				}
			}			
		}
		catch (Exception e) 
		{		
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream) <em>Save Coordinates Set To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO#saveCoordinatesSetToCSV(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, java.io.OutputStream)
	 * @generated_NOT
	 */
	public void testSaveCoordinatesSetToCSV__CartesianCoordinatesSet_OutputStream() 
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(10, 0, 0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 20, 0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 30);
		
		cartesianCoordinatesSet.getPoints().add(p0);
		cartesianCoordinatesSet.getPoints().add(p1);
		cartesianCoordinatesSet.getPoints().add(p2);

		try
		{
			String csvFile = Activator.getDefault().getTempDir() + File.separator + "testSaveCoordinatesSetToCSVOutputStream.csv";			
			getFixture().saveCoordinatesSetToCSV(cartesianCoordinatesSet, new FileOutputStream(csvFile));
			
			// Reloads the file.
			List<String> lines = Files.readAllLines(Paths.get(csvFile));
			assertEquals(3, lines.size());
			
			// Goes through each line to ensure is contains the point coordinates.
			int i = 0;
			for(String line : lines)
			{
				String[] data = line.split(",");
				if(data.length == 3)
				{
					double x = Double.parseDouble(data[0]);
					double y = Double.parseDouble(data[1]);
					double z = Double.parseDouble(data[2]);
					
					assertEquals(cartesianCoordinatesSet.getPoints().get(i).getX(), x, 1E-9);
					assertEquals(cartesianCoordinatesSet.getPoints().get(i).getY(), y, 1E-9);
					assertEquals(cartesianCoordinatesSet.getPoints().get(i).getZ(), z, 1E-9);
					
					i++;
				}
				else
				{
					fail();
				}
			}			
		}
		catch (Exception e) 
		{		
			fail(e.getMessage());
		}
	}

} //Data3DIOTest
