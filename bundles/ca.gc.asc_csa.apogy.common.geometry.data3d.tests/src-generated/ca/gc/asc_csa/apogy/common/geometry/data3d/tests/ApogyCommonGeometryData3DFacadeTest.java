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

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap;
import ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(double, double, double) <em>Create Cartesian Position Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short) <em>Create Colored Cartesian Position Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(double, double, double) <em>Create Cartesian Orientation Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createSphericalCoordinates(double, double, double) <em>Create Spherical Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(double, double, double, double, double, double) <em>Create Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose) <em>Create Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Pose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createDigitalElevationMap(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet) <em>Create Digital Elevation Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPolygon(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Polygon</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Position Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Cartesian Orientation Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh) <em>Create Cartesian Coordinates Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Triangle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon) <em>Create Cartesian Triangle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(java.util.List) <em>Create Cartesian Coordinates Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Coordinates Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(java.util.List) <em>Create Cartesian Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Triangular Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d) <em>Apply Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d) <em>Apply Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createTransformedMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Create Transformed Mesh</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Apply Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d) <em>Apply Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#updateCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, double[][]) <em>Update Cartesian Coordinates Set</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#concatenateTriangularMeshes(java.util.List) <em>Concatenate Triangular Meshes</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ApogyCommonGeometryData3DFacadeTest extends TestCase {

	/**
	 * The fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonGeometryData3DFacade fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApogyCommonGeometryData3DFacadeTest.class);
	}

	/**
	 * Constructs a new Facade test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonGeometryData3DFacadeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApogyCommonGeometryData3DFacade fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonGeometryData3DFacade getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createApogyCommonGeometryData3DFacade());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(double, double, double) <em>Create Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(double, double, double)
	 * @generated_NOT
	 */
	public void testCreateCartesianPositionCoordinates__double_double_double() 
	{
		CartesianPositionCoordinates coord = getFixture().createCartesianPositionCoordinates(10, 20, 30);
		
		assertNotNull(coord);
		assertEquals(10, coord.getX(), 1E-9);
		assertEquals(20, coord.getY(), 1E-9);
		assertEquals(30, coord.getZ(), 1E-9);		
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short) <em>Create Colored Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createColoredCartesianPositionCoordinates(double, double, double, short, short, short)
	 * @generated
	 */
	public void testCreateColoredCartesianPositionCoordinates__double_double_double_short_short_short() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(double, double, double) <em>Create Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(double, double, double)
	 * @generated_NOT
	 */
	public void testCreateCartesianOrientationCoordinates__double_double_double() 
	{
		CartesianOrientationCoordinates coord = getFixture().createCartesianOrientationCoordinates(Math.toRadians(10),Math.toRadians(20),Math.toRadians(30));
		
		assertNotNull(coord);
		assertEquals(Math.toRadians(10), coord.getXRotation(), 1E-9);
		assertEquals(Math.toRadians(20), coord.getYRotation(), 1E-9);
		assertEquals(Math.toRadians(30), coord.getZRotation(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createSphericalCoordinates(double, double, double) <em>Create Spherical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createSphericalCoordinates(double, double, double)
	 * @generated_NOT
	 */
	public void testCreateSphericalCoordinates__double_double_double() 
	{
		SphericalCoordinates coord = getFixture().createSphericalCoordinates(Math.toRadians(10), Math.toRadians(20), 30.0);
		
		assertNotNull(coord);
		assertEquals(Math.toRadians(10), coord.getPhi(), 1E-9);
		assertEquals(Math.toRadians(20), coord.getTheta(), 1E-9);
		assertEquals(30.0, coord.getR(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(double, double, double, double, double, double) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(double, double, double, double, double, double)
	 * @generated_NOT
	 */
	public void testCreatePose__double_double_double_double_double_double() 
	{		
		Pose pose = getFixture().createPose(10, 20, 30, Math.toRadians(40), Math.toRadians(50), Math.toRadians(60));
	
		assertNotNull(pose);
		assertEquals(10, pose.getX(), 1E-9);
		assertEquals(20, pose.getY(), 1E-9);
		assertEquals(30, pose.getZ(), 1E-9);
		
		assertEquals(Math.toRadians(40), pose.getXRotation(), 1E-9);
		assertEquals(Math.toRadians(50), pose.getYRotation(), 1E-9);
		assertEquals(Math.toRadians(60), pose.getZRotation(), 1E-9);		
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.Pose)
	 * @generated_NOT
	 */
	public void testCreatePose__Pose() 
	{
		Pose pose = getFixture().createPose(10, 20, 30, Math.toRadians(40), Math.toRadians(50), Math.toRadians(60));
		
		Pose poseCopy = getFixture().createPose(pose);
		
		assertNotNull(poseCopy);
		assertEquals(10, poseCopy.getX(), 1E-9);
		assertEquals(20, poseCopy.getY(), 1E-9);
		assertEquals(30, poseCopy.getZ(), 1E-9);
		
		assertEquals(Math.toRadians(40), poseCopy.getXRotation(), 1E-9);
		assertEquals(Math.toRadians(50), poseCopy.getYRotation(), 1E-9);
		assertEquals(Math.toRadians(60), poseCopy.getZRotation(), 1E-9);	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Pose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createPose(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated_NOT
	 */
	public void testCreatePose__CartesianPositionCoordinates_CartesianOrientationCoordinates() 
	{
		CartesianPositionCoordinates position = getFixture().createCartesianPositionCoordinates(10, 20, 30);
		CartesianOrientationCoordinates orientation = getFixture().createCartesianOrientationCoordinates(Math.toRadians(40), Math.toRadians(50), Math.toRadians(60));
				
		Pose pose = getFixture().createPose(position, orientation);
		
		assertNotNull(pose);
		assertEquals(10, pose.getX(), 1E-9);
		assertEquals(20, pose.getY(), 1E-9);
		assertEquals(30, pose.getZ(), 1E-9);
		
		assertEquals(Math.toRadians(40), pose.getXRotation(), 1E-9);
		assertEquals(Math.toRadians(50), pose.getYRotation(), 1E-9);
		assertEquals(Math.toRadians(60), pose.getZRotation(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createDigitalElevationMap(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet) <em>Create Digital Elevation Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createDigitalElevationMap(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated_NOT
	 */
	public void testCreateDigitalElevationMap__CartesianCoordinatesSet() 
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = createGrid();
		
		DigitalElevationMap dem = getFixture().createDigitalElevationMap(cartesianCoordinatesSet);
		
		assertNotNull(dem);
		assertTrue(dem.getPoints().size() > 0);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPolygon(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Polygon</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPolygon(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated_NOT
	 */
	public void testCreateCartesianPolygon__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates() 
	{
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0.5);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 1.0);
		
		CartesianPolygon polygon = getFixture().createCartesianPolygon(p0,p1,p2);
		assertNotNull(polygon);
		assertEquals(3, polygon.getVertices().size());
		assertTrue(polygon.getSurface() > 0);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Position Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianPositionCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated_NOT
	 */
	public void testCreateCartesianPositionCoordinates__CartesianPositionCoordinates() 
	{
		CartesianPositionCoordinates original = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates();
		original.setX(10);
		original.setY(20);
		original.setZ(30);
		
		CartesianPositionCoordinates copy = getFixture().createCartesianPositionCoordinates(original);
		
		assertNotNull(copy);		
		assertEquals(10, copy.getX(), 1E-9);
		assertEquals(20, copy.getY(), 1E-9);
		assertEquals(30, copy.getZ(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates) <em>Create Cartesian Orientation Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianOrientationCoordinates(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates)
	 * @generated_NOT
	 */
	public void testCreateCartesianOrientationCoordinates__CartesianOrientationCoordinates() 
	{
		CartesianOrientationCoordinates original = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianOrientationCoordinates();
		original.setXRotation(Math.toRadians(10.0));
		original.setYRotation(Math.toRadians(20.0));
		original.setZRotation(Math.toRadians(30.0));
		
		CartesianOrientationCoordinates copy = getFixture().createCartesianOrientationCoordinates(original);
		
		assertNotNull(copy);		
		assertEquals(Math.toRadians(10.0), copy.getXRotation(), 1E-9);
		assertEquals(Math.toRadians(20.0), copy.getYRotation(), 1E-9);
		assertEquals(Math.toRadians(30.0), copy.getZRotation(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesMesh)
	 * @generated_NOT
	 */
	public void testCreateCartesianCoordinatesMesh__CartesianCoordinatesMesh() 
	{
		CartesianTriangularMesh mesh = createCartesianTriangularMesh();						
		CartesianCoordinatesMesh copy = getFixture().createCartesianCoordinatesMesh(mesh);
		
		assertNotNull(copy);
		assertEquals(mesh.getPoints().size(), copy.getPoints().size());
		assertEquals(mesh.getPolygons().size(), copy.getPolygons().size());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates) <em>Create Cartesian Triangle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates, ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates)
	 * @generated_NOT
	 */
	public void testCreateCartesianTriangle__CartesianPositionCoordinates_CartesianPositionCoordinates_CartesianPositionCoordinates() 
	{
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0.5);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 1.0);
		
		CartesianTriangle triangle = getFixture().createCartesianTriangle(p0,p1,p2);
		assertNotNull(triangle);
		assertEquals(3, triangle.getVertices().size());
		assertTrue(triangle.getSurface() > 0);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon) <em>Create Cartesian Triangle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangle(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon)
	 * @generated_NOT
	 */
	public void testCreateCartesianTriangle__CartesianPolygon() 
	{
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0.5);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 1.0);
		
		CartesianPolygon polygon = getFixture().createCartesianPolygon(p0,p1,p2);
		
		CartesianTriangle triangle = getFixture().createCartesianTriangle(polygon);
		assertNotNull(triangle);
		assertEquals(3, triangle.getVertices().size());
		assertTrue(triangle.getSurface() > 0);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(java.util.List) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(java.util.List)
	 * @generated_NOT
	 */
	public void testCreateCartesianCoordinatesMesh__List() 
	{
		CartesianTriangularMesh tmp = createCartesianTriangularMesh();		
		
		List<CartesianPolygon> polygons = new ArrayList<CartesianPolygon>();
		for(CartesianTriangle triangle : tmp.getPolygons())
		{
			polygons.add((CartesianPolygon) triangle); 
		}		
		
		CartesianCoordinatesMesh copy = getFixture().createCartesianCoordinatesMesh(polygons);
		
		assertNotNull(copy);
		assertEquals(tmp.getPoints().size(), copy.getPoints().size());
		assertEquals(tmp.getPolygons().size(), copy.getPolygons().size());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Coordinates Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianCoordinatesMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated_NOT
	 */
	public void testCreateCartesianCoordinatesMesh__CartesianTriangularMesh() 
	{
		CartesianTriangularMesh mesh = createCartesianTriangularMesh();						
		CartesianCoordinatesMesh copy = getFixture().createCartesianCoordinatesMesh(mesh);
		
		assertNotNull(copy);
		assertEquals(mesh.getPoints().size(), copy.getPoints().size());
		assertEquals(mesh.getPolygons().size(), copy.getPolygons().size());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(java.util.List) <em>Create Cartesian Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(java.util.List)
	 * @generated_NOT
	 */
	public void testCreateCartesianTriangularMesh__List() 
	{
		CartesianTriangularMesh tmp = createCartesianTriangularMesh();		
		
		List<CartesianTriangle> polygons = new ArrayList<CartesianTriangle>();
		for(CartesianTriangle triangle : tmp.getPolygons())
		{
			polygons.add(triangle); 
		}		
		
		CartesianTriangularMesh copy = getFixture().createCartesianTriangularMesh(polygons);
		
		assertNotNull(copy);
		assertEquals(tmp.getPoints().size(), copy.getPoints().size());
		assertEquals(tmp.getPolygons().size(), copy.getPolygons().size());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Create Cartesian Triangular Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createCartesianTriangularMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated_NOT
	 */
	public void testCreateCartesianTriangularMesh__CartesianTriangularMesh() 
	{
		CartesianTriangularMesh tmp = createCartesianTriangularMesh();	
		CartesianTriangularMesh copy = getFixture().createCartesianTriangularMesh(tmp);
		
		assertNotNull(copy);
		assertEquals(tmp.getPoints().size(), copy.getPoints().size());
		assertEquals(tmp.getPolygons().size(), copy.getPolygons().size());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, javax.vecmath.Matrix4d)
	 * @generated_NOT
	 */
	public void testApplyTransform__CartesianCoordinatesSet_Matrix4d() 
	{
		Matrix4d matrix = new Matrix4d();
		matrix.setIdentity();
		matrix.rotX(Math.toRadians(90));
		
		CartesianCoordinatesSet points = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 0);
		
		points.getPoints().add(p0);
		points.getPoints().add(p1);
		points.getPoints().add(p2);
				
		CartesianCoordinatesSet rotatedPoints = getFixture().applyTransform(points, matrix);
		assertNotNull(rotatedPoints);
		assertEquals(rotatedPoints.getPoints().size(), points.getPoints().size());
		
		CartesianPositionCoordinates p0Rotated = rotatedPoints.getPoints().get(0);
		CartesianPositionCoordinates p1Rotated = rotatedPoints.getPoints().get(1);
		CartesianPositionCoordinates p2Rotated = rotatedPoints.getPoints().get(2);
 		
		assertEquals(0, p0Rotated.getX(), 1E-9);
		assertEquals(0, p0Rotated.getY(), 1E-9);
		assertEquals(0, p0Rotated.getZ(), 1E-9);
		
		assertEquals(1, p1Rotated.getX(), 1E-9);
		assertEquals(0, p1Rotated.getY(), 1E-9);
		assertEquals(0, p1Rotated.getZ(), 1E-9);
		
		assertEquals(1, p2Rotated.getX(), 1E-9);
		assertEquals(0, p2Rotated.getY(), 1E-9);
		assertEquals(1, p2Rotated.getZ(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(java.util.List, javax.vecmath.Matrix4d)
	 * @generated_NOT
	 */
	public void testApplyTransform__List_Matrix4d() 
	{
		Matrix4d matrix = new Matrix4d();
		matrix.setIdentity();
		matrix.rotX(Math.toRadians(90));
		
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 0);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
				
		List<CartesianPositionCoordinates> rotatedPoints = getFixture().applyTransform(points, matrix);
		assertNotNull(rotatedPoints);
		assertEquals(rotatedPoints.size(), points.size());
		
		CartesianPositionCoordinates p0Rotated = rotatedPoints.get(0);
		CartesianPositionCoordinates p1Rotated = rotatedPoints.get(1);
		CartesianPositionCoordinates p2Rotated = rotatedPoints.get(2);
 		
		assertEquals(0, p0Rotated.getX(), 1E-9);
		assertEquals(0, p0Rotated.getY(), 1E-9);
		assertEquals(0, p0Rotated.getZ(), 1E-9);
		
		assertEquals(1, p1Rotated.getX(), 1E-9);
		assertEquals(0, p1Rotated.getY(), 1E-9);
		assertEquals(0, p1Rotated.getZ(), 1E-9);
		
		assertEquals(1, p2Rotated.getX(), 1E-9);
		assertEquals(0, p2Rotated.getY(), 1E-9);
		assertEquals(1, p2Rotated.getZ(), 1E-9);		
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createTransformedMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Create Transformed Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#createTransformedMesh(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated_NOT
	 */
	public void testCreateTransformedMesh__CartesianTriangularMesh_Matrix4d() 
	{
		CartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 0);
		
		mesh.getPoints().add(p0);
		mesh.getPoints().add(p1);
		mesh.getPoints().add(p2);
		
				
		CartesianTriangle t0 = getFixture().createCartesianTriangle(p0, p1, p2);
		mesh.getPolygons().add(t0);
		
		Matrix4d matrix = new Matrix4d();
		matrix.setIdentity();
		matrix.rotX(Math.toRadians(90));
		
		CartesianTriangularMesh transformedMesh = getFixture().createTransformedMesh(mesh, matrix);
		
		assertNotNull(transformedMesh);
		assertEquals(3, transformedMesh.getPoints().size());
		assertEquals(1, transformedMesh.getPolygons().size());
		
		CartesianPositionCoordinates p0Rotated = transformedMesh.getPoints().get(0);
		CartesianPositionCoordinates p1Rotated = transformedMesh.getPoints().get(1);
		CartesianPositionCoordinates p2Rotated = transformedMesh.getPoints().get(2);
 		
		assertEquals(0, p0Rotated.getX(), 1E-9);
		assertEquals(0, p0Rotated.getY(), 1E-9);
		assertEquals(0, p0Rotated.getZ(), 1E-9);
		
		assertEquals(1, p1Rotated.getX(), 1E-9);
		assertEquals(0, p1Rotated.getY(), 1E-9);
		assertEquals(0, p1Rotated.getZ(), 1E-9);
		
		assertEquals(1, p2Rotated.getX(), 1E-9);
		assertEquals(0, p2Rotated.getY(), 1E-9);
		assertEquals(1, p2Rotated.getZ(), 1E-9);	
		
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh, javax.vecmath.Matrix4d)
	 * @generated_NOT
	 */
	public void testApplyTransform__CartesianTriangularMesh_Matrix4d() 
	{
		CartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
				
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 0);
		
		mesh.getPoints().add(p0);
		mesh.getPoints().add(p1);
		mesh.getPoints().add(p2);
		
		CartesianTriangle t0 = getFixture().createCartesianTriangle(p0, p1, p2);
		mesh.getPolygons().add(t0);
		
		
		Matrix4d matrix = new Matrix4d();
		matrix.setIdentity();
		matrix.rotX(Math.toRadians(90));
		
		getFixture().applyTransform(mesh, matrix);
		
		assertNotNull(mesh);
		assertEquals(3, mesh.getPoints().size());
		assertEquals(1, mesh.getPolygons().size());
		
		CartesianPositionCoordinates p0Rotated = mesh.getPoints().get(0);
		CartesianPositionCoordinates p1Rotated = mesh.getPoints().get(1);
		CartesianPositionCoordinates p2Rotated = mesh.getPoints().get(2);
 		
		assertEquals(0, p0Rotated.getX(), 1E-9);
		assertEquals(0, p0Rotated.getY(), 1E-9);
		assertEquals(0, p0Rotated.getZ(), 1E-9);
		
		assertEquals(1, p1Rotated.getX(), 1E-9);
		assertEquals(0, p1Rotated.getY(), 1E-9);
		assertEquals(0, p1Rotated.getZ(), 1E-9);
		
		assertEquals(1, p2Rotated.getX(), 1E-9);
		assertEquals(0, p2Rotated.getY(), 1E-9);
		assertEquals(1, p2Rotated.getZ(), 1E-9);		
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d) <em>Apply Transform</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#applyTransform(ca.gc.asc_csa.apogy.common.geometry.data3d.NormalPointCloud, javax.vecmath.Matrix4d)
	 * @generated_NOT
	 */
	public void testApplyTransform__NormalPointCloud_Matrix4d() 
	{
		NormalPointCloud normalPointCloud = ApogyCommonGeometryData3DFactory.eINSTANCE.createNormalPointCloud();
		
		CartesianPositionCoordinates p0 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = getFixture().createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p2 = getFixture().createCartesianPositionCoordinates(1, 1, 0);
			
		List<Point3d> points = new ArrayList<Point3d>();
		
		points.add(p0.asPoint3d());
		points.add(p1.asPoint3d());
		points.add(p2.asPoint3d());		
		normalPointCloud.setPoints(points);
		
		List<Vector3d> normals = new ArrayList<Vector3d>();
		Vector3d n0 = new Vector3d(0, 0, 1);
		Vector3d n1 = new Vector3d(0, 1, 0);
		Vector3d n2 = new Vector3d(1, 0, 0);
		
		normals.add(n0);
		normals.add(n1);
		normals.add(n2);
		normalPointCloud.setNormals(normals);
		
		Matrix4d matrix = new Matrix4d();
		matrix.setIdentity();
		matrix.rotX(Math.toRadians(90));
		
		NormalPointCloud transformPointCloud = getFixture().applyTransform(normalPointCloud, matrix);
		
		Point3d p0Rotated = transformPointCloud.getPoints().get(0);
		Point3d p1Rotated = transformPointCloud.getPoints().get(1);
		Point3d p2Rotated = transformPointCloud.getPoints().get(2);
 		
		assertEquals(0, p0Rotated.getX(), 1E-9);
		assertEquals(0, p0Rotated.getY(), 1E-9);
		assertEquals(0, p0Rotated.getZ(), 1E-9);
		
		assertEquals(1, p1Rotated.getX(), 1E-9);
		assertEquals(0, p1Rotated.getY(), 1E-9);
		assertEquals(0, p1Rotated.getZ(), 1E-9);
		
		assertEquals(1, p2Rotated.getX(), 1E-9);
		assertEquals(0, p2Rotated.getY(), 1E-9);
		assertEquals(1, p2Rotated.getZ(), 1E-9);
		
		
		Vector3d n0Rotated = transformPointCloud.getNormals().get(0);
		Vector3d n1Rotated = transformPointCloud.getNormals().get(1);
		Vector3d n2Rotated = transformPointCloud.getNormals().get(2);
		
		assertEquals(0, n0Rotated.getX(), 1E-9);
		assertEquals(-1, n0Rotated.getY(), 1E-9);
		assertEquals(0, n0Rotated.getZ(), 1E-9);
		
		assertEquals(0, n1Rotated.getX(), 1E-9);
		assertEquals(0, n1Rotated.getY(), 1E-9);
		assertEquals(1, n1Rotated.getZ(), 1E-9);
		
		assertEquals(1, n2Rotated.getX(), 1E-9);
		assertEquals(0, n2Rotated.getY(), 1E-9);
		assertEquals(0, n2Rotated.getZ(), 1E-9);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#updateCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, double[][]) <em>Update Cartesian Coordinates Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#updateCartesianCoordinatesSet(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet, double[][])
	 * @generated_NOT
	 */
	public void testUpdateCartesianCoordinatesSet__CartesianCoordinatesSet_double() 
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
				
		// Start with a case where the CartesianCoordinatesSet contains more points than the xyzData.
		cartesianCoordinatesSet.getPoints().add(getFixture().createCartesianPositionCoordinates(0, 0, 0));
		cartesianCoordinatesSet.getPoints().add(getFixture().createCartesianPositionCoordinates(1, 1, 1));
		cartesianCoordinatesSet.getPoints().add(getFixture().createCartesianPositionCoordinates(-1, -1, -1));
		
		double[][] xyzData = new double[2][3];
		for(int i = 0; i < 2; i++)
		{
			double x = 10 + i;
			double y = 20 + i;
			double z = 30 + i;
			
			xyzData[i][0] = x;
			xyzData[i][1] = y;
			xyzData[i][2] = z;			
		}
		
		getFixture().updateCartesianCoordinatesSet(cartesianCoordinatesSet, xyzData);
		assertEquals(2,cartesianCoordinatesSet.getPoints().size());
		
		for(int i = 0; i < 2; i++)
		{
			double x = 10 + i;
			double y = 20 + i;
			double z = 30 + i;
			
			CartesianPositionCoordinates p = cartesianCoordinatesSet.getPoints().get(i); 
			
			assertEquals(x, p.getX() , 1E-9);
			assertEquals(y, p.getY() , 1E-9);
			assertEquals(z, p.getZ() , 1E-9);
		}
				
		// Case where the CartesianCoordinatesSet contains less points than the xyzData.
		xyzData = new double[4][3];
		for(int i = 0; i < 4; i++)
		{
			double x = 10 + i;
			double y = 20 + i;
			double z = 30 + i;
			
			xyzData[i][0] = x;
			xyzData[i][1] = y;
			xyzData[i][2] = z;			
		}
		
		getFixture().updateCartesianCoordinatesSet(cartesianCoordinatesSet, xyzData);
		assertEquals(4,cartesianCoordinatesSet.getPoints().size());
		
		for(int i = 0; i < 4; i++)
		{
			double x = 10 + i;
			double y = 20 + i;
			double z = 30 + i;
			
			CartesianPositionCoordinates p = cartesianCoordinatesSet.getPoints().get(i); 
			
			assertEquals(x, p.getX() , 1E-9);
			assertEquals(y, p.getY() , 1E-9);
			assertEquals(z, p.getZ() , 1E-9);
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#concatenateTriangularMeshes(org.eclipse.emf.common.util.EList) <em>Concatenate Triangular Meshes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade#concatenateTriangularMeshes(org.eclipse.emf.common.util.EList)
	 * @generated_NOT
	 */
	public void testConcatenateTriangularMeshes__List() 
	{
		CartesianTriangularMesh mesh1 = createCartesianTriangularMesh();
		
		Matrix4d trMatrix = new Matrix4d();
		trMatrix.setIdentity();
		trMatrix.set(new Vector3d(10, 20, 30));
		
		CartesianTriangularMesh mesh2 = getFixture().createTransformedMesh(mesh1, trMatrix);
		
		List<CartesianTriangularMesh> meshes = new ArrayList<CartesianTriangularMesh>();
		meshes.add(mesh1);
		meshes.add(mesh2);
		
		CartesianTriangularMesh concatenatedMesh = getFixture().concatenateTriangularMeshes(meshes);
		
		assertNotNull(concatenatedMesh);
		assertEquals(mesh1.getPoints().size() + mesh2.getPoints().size(), concatenatedMesh.getPoints().size());
		assertEquals(mesh1.getPolygons().size() + mesh2.getPolygons().size(), concatenatedMesh.getPolygons().size());
	}
	
	private CartesianTriangularMesh createCartesianTriangularMesh()
	{
		CartesianTriangularMesh mesh = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
	
		CartesianPositionCoordinates p00 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p10 = getFixture().createCartesianPositionCoordinates(1, 0, 0.5);
		CartesianPositionCoordinates p20 = getFixture().createCartesianPositionCoordinates(2, 0, -0.25);
		
		mesh.getPoints().add(p00);
		mesh.getPoints().add(p10);
		mesh.getPoints().add(p20);
		
		
		CartesianPositionCoordinates p01 = getFixture().createCartesianPositionCoordinates(0, 1, -0.5);
		CartesianPositionCoordinates p11 = getFixture().createCartesianPositionCoordinates(1, 1, 0.75);
		CartesianPositionCoordinates p21 = getFixture().createCartesianPositionCoordinates(2, 1, -0.75);
		
		mesh.getPoints().add(p01);
		mesh.getPoints().add(p11);
		mesh.getPoints().add(p21);

			
		CartesianPositionCoordinates p02 = getFixture().createCartesianPositionCoordinates(0, 2, 0.5);
		CartesianPositionCoordinates p12 = getFixture().createCartesianPositionCoordinates(1, 2, -0.75);
		CartesianPositionCoordinates p22 = getFixture().createCartesianPositionCoordinates(2, 2, 0.75);
		
		mesh.getPoints().add(p02);
		mesh.getPoints().add(p12);
		mesh.getPoints().add(p22);
	
		
		CartesianTriangle t0 = getFixture().createCartesianTriangle(p00, p10, p11);
		CartesianTriangle t1 = getFixture().createCartesianTriangle(p00, p11, p01);
		
		mesh.getPolygons().add(t0);
		mesh.getPolygons().add(t1);
		
		
		CartesianTriangle t2 = getFixture().createCartesianTriangle(p10, p20, p21);
		CartesianTriangle t3 = getFixture().createCartesianTriangle(p10, p21, p11);

		mesh.getPolygons().add(t2);
		mesh.getPolygons().add(t3);

		
		CartesianTriangle t4 = getFixture().createCartesianTriangle(p01, p11, p12);
		CartesianTriangle t5 = getFixture().createCartesianTriangle(p01, p12, p02);
		
		mesh.getPolygons().add(t4);
		mesh.getPolygons().add(t5);

		
		CartesianTriangle t6 = getFixture().createCartesianTriangle(p11, p21, p22);
		CartesianTriangle t7 = getFixture().createCartesianTriangle(p11, p22, p12);

		
		mesh.getPolygons().add(t6);
		mesh.getPolygons().add(t7);
		
		return mesh;
	}	
	
	private CartesianCoordinatesSet createGrid()
	{
		CartesianCoordinatesSet cartesianCoordinatesSet = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p00 = getFixture().createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p10 = getFixture().createCartesianPositionCoordinates(1, 0, 0.5);
		CartesianPositionCoordinates p20 = getFixture().createCartesianPositionCoordinates(2, 0, -0.25);
		
		cartesianCoordinatesSet.getPoints().add(p00);
		cartesianCoordinatesSet.getPoints().add(p10);
		cartesianCoordinatesSet.getPoints().add(p20);
		
		
		CartesianPositionCoordinates p01 = getFixture().createCartesianPositionCoordinates(0, 1, -0.5);
		CartesianPositionCoordinates p11 = getFixture().createCartesianPositionCoordinates(1, 1, 0.75);
		CartesianPositionCoordinates p21 = getFixture().createCartesianPositionCoordinates(2, 1, -0.75);
		
		cartesianCoordinatesSet.getPoints().add(p01);
		cartesianCoordinatesSet.getPoints().add(p11);
		cartesianCoordinatesSet.getPoints().add(p21);

			
		CartesianPositionCoordinates p02 = getFixture().createCartesianPositionCoordinates(0, 2, 0.5);
		CartesianPositionCoordinates p12 = getFixture().createCartesianPositionCoordinates(1, 2, -0.75);
		CartesianPositionCoordinates p22 = getFixture().createCartesianPositionCoordinates(2, 2, 0.75);
		
		cartesianCoordinatesSet.getPoints().add(p02);
		cartesianCoordinatesSet.getPoints().add(p12);
		cartesianCoordinatesSet.getPoints().add(p22);
		
		return cartesianCoordinatesSet;
	}
} //ApogyCommonGeometryData3DFacadeTest
