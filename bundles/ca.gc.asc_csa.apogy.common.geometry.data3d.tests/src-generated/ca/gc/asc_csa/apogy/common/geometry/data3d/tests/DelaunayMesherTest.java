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
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Random;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Data3DIO;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DelaunayMesher;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delaunay Mesher</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelaunayMesherTest extends CartesianPositionCoordinatesMesherTest 
{	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelaunayMesherTest.class);
	}

	/**
	 * Constructs a new Delaunay Mesher test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelaunayMesherTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delaunay Mesher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DelaunayMesher getFixture() {
		return (DelaunayMesher)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createDelaunayMesher());
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

	public void _testMesh() 
	{
		try 
		{
			String originalMeshFile = Activator.getDefault().getDataPath()+ File.separator + "CSAMarsYardDEM100cm";			

			CartesianTriangularMesh originalMesh = Data3DIO.INSTANCE.loadTriangularMeshFromASCII(originalMeshFile);

			// We generate a CartesianCoordinatesSet
			CartesianCoordinatesSet points = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();

			for (int i = 0; i < originalMesh.getPoints().size(); i++)
			{
				Point3d p  = originalMesh.getPoints().get(i).asPoint3d();
				CartesianPositionCoordinates point = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(p.x,p.y,p.z);
				points.getPoints().add(point);
			}

			long t0 = System.currentTimeMillis();
			// We try to mesh it.
			CartesianTriangularMesh mesh = getFixture().process(points);

			String filePrefix = System.getProperty("java.io.tmpdir") + File.separator + "mesh";
			Data3DIO.INSTANCE.saveTriangularMeshAsASCII(mesh, filePrefix);				

			long t1 = System.currentTimeMillis();

			System.out.println("DelaunayMesherTest.testMesh() time: " + (t1 - t0) + "ms");

			System.out.println("DelaunayMesherTest.testMesh() number of points: "+ mesh.getPoints().size());

			System.out.println("DelaunayMesherTest.testMesh() number of triangles produced: "+ mesh.getPolygons().size());

			System.out.println("DelaunayMesherTest.testMesh() triangles in original mesh: "	+ originalMesh.getPolygons().size());

			GroupNode root = ApogyCommonTopologyFactory.eINSTANCE.createGroupNode();

			// We save it to a topology.
			ContentNode<CartesianTriangularMesh> producedNode = ApogyCommonTopologyFacade.INSTANCE.createContentNode(mesh);
			producedNode.setDescription("Output");
			root.getChildren().add(producedNode);

			ContentNode<CartesianTriangularMesh> originalNode = ApogyCommonTopologyFacade.INSTANCE.createContentNode(originalMesh);
			originalNode.setDescription("Original mesh");
			root.getChildren().add(originalNode);

			ResourceSet rs = new ResourceSetImpl();
			Resource res = rs.createResource(URI.createFileURI("/tmp/out.topo"));

			res.getContents().add(root);
			res.save(Collections.EMPTY_MAP);

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void _testRandom() {

		Random rand = new Random();

		double maxValue = 10.0;

		int n = 20000;

		CartesianCoordinatesSet pointCloud = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();

		int width = (int) Math.sqrt((double) n);
		int height = (int) Math.sqrt((double) n);

		System.out.print("Generating points ... ");
		System.out.flush();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				double z = rand.nextDouble() * maxValue;
				CartesianPositionCoordinates point = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates((double) x,
								(double) y, z);
				pointCloud.getPoints().add(point);
			}
		}
		System.out.println("done");

		try 
		{
			long t0 = System.currentTimeMillis();
			@SuppressWarnings("unused")
			CartesianTriangularMesh process = getFixture().process(pointCloud);
			long t1 = System.currentTimeMillis();

			System.out
					.println("DelaunayMesherTest.testRandom() time to process "
							+ pointCloud.getPoints().size() + " points: "
							+ (t1 - t0) + "ms");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

	public void testMeshingPlanes() {
		double[][] xyData = new double[][] { new double[] { 0.0, 0.0, 0.1 },
				new double[] { 0.0, 0.0, 0.85 },
				new double[] { 0.0, 1.0, 0.5 }, new double[] { 1.0, 0.0, 0.2 },
				new double[] { 1.0, 1.0, 0.9 }, new double[] { 0.5, 0.5, 0.3 } };

		double[][] xzData = new double[xyData.length][3];

		for (int i = 0; i < xyData.length; i++) {
			xzData[i][0] = xyData[i][0];
			xzData[i][1] = xyData[i][2];
			xzData[i][2] = xyData[i][1];
		}

		double[][] data = xyData;

		CartesianCoordinatesSet points = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();

		for (int i = 0; i < data.length; i++) {

			double[] pointData = data[i];

			CartesianPositionCoordinates point = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(pointData[0],
							pointData[1], pointData[2]);

			points.getPoints().add(point);
		}

		try 
		{			
			CartesianTriangularMesh mesh = getFixture().process(points);
			
			String filePrefix = System.getProperty("java.io.tmpdir") + File.separator + "xy";
			Data3DIO.INSTANCE.saveTriangularMeshAsASCII(mesh, filePrefix);			
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

} //DelaunayMesherTest
