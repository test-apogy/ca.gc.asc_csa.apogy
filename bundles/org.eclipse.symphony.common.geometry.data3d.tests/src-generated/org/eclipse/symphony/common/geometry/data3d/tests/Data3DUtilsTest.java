/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Data3DUtils;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;
import org.eclipse.symphony.common.topology.ContentNode;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFacade;
import org.eclipse.symphony.common.topology.TransformNode;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data3 DUtils</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeNormals(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Compute Normals</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(java.util.List) <em>Compute Centroid</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Centroid</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Min Max Values</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.PointLocator, int, double) <em>Compute Curvature Change</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#extrude(java.util.List, org.eclipse.symphony.common.geometry.data3d.CartesianAxis, double, boolean) <em>Extrude</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class Data3DUtilsTest extends TestCase {

	/**
	 * The fixture for this Data3 DUtils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3DUtils fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Data3DUtilsTest.class);
	}

	/**
	 * Constructs a new Data3 DUtils test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data3DUtilsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data3 DUtils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Data3DUtils fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data3 DUtils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Data3DUtils getFixture() {
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
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createData3DUtils());
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
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeNormals(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Compute Normals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeNormals(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	public void testComputeNormals__CartesianTriangularMesh() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(java.util.List) <em>Compute Centroid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(java.util.List)
	 * @generated_NOT
	 */
	public void testComputeCentroid__List() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
	
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p3 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 1, 0);
		CartesianPositionCoordinates p4 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1, 0, 0);
		CartesianPositionCoordinates p5 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, -1, 0);
		CartesianPositionCoordinates p6 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 10);
		CartesianPositionCoordinates p7 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, -10);
		
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		points.add(p6);
		points.add(p7);
		
		CartesianPositionCoordinates centroid = getFixture().computeCentroid(points);
		assertNotNull(centroid);
		assertEquals(0, centroid.getX(), 1E-9);
		assertEquals(0, centroid.getY(), 1E-9);
		assertEquals(0, centroid.getZ(), 1E-9);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Centroid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCentroid(org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated_NOT
	 */
	public void testComputeCentroid__CartesianCoordinatesSet() 
	{
		CartesianCoordinatesSet points = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p3 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 1, 0);
		CartesianPositionCoordinates p4 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1, 0, 0);
		CartesianPositionCoordinates p5 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, -1, 0);
		CartesianPositionCoordinates p6 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 10);
		CartesianPositionCoordinates p7 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, -10);
		
		points.getPoints().add(p1);
		points.getPoints().add(p2);
		points.getPoints().add(p3);
		points.getPoints().add(p4);
		points.getPoints().add(p5);
		points.getPoints().add(p6);
		points.getPoints().add(p7);
		
		CartesianPositionCoordinates centroid = getFixture().computeCentroid(points);
		assertNotNull(centroid);
		assertEquals(0, centroid.getX(), 1E-9);
		assertEquals(0, centroid.getY(), 1E-9);
		assertEquals(0, centroid.getZ(), 1E-9);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet) <em>Compute Min Max Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeMinMaxValues(javax.vecmath.Point3d, javax.vecmath.Point3d, org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet)
	 * @generated_NOT
	 */
	public void testComputeMinMaxValues__Point3d_Point3d_CartesianCoordinatesSet() 
	{
		CartesianCoordinatesSet points = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();
		
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p3 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 2, 0);
		CartesianPositionCoordinates p4 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1, 0, 0);
		CartesianPositionCoordinates p5 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, -5, 0);
		
		points.getPoints().add(p1);
		points.getPoints().add(p2);
		points.getPoints().add(p3);
		points.getPoints().add(p4);
		points.getPoints().add(p5);
		
		Point3d min = new Point3d();
		Point3d max = new Point3d();
		
		getFixture().computeMinMaxValues(min, max, points);
		assertNotNull(min);
		assertNotNull(max);
		
		assertEquals(-1, min.getX(), 1E-9);
		assertEquals(-5, min.getY(), 1E-9);
		assertEquals(0, min.getZ(), 1E-9);
		
		assertEquals(1, max.getX(), 1E-9);
		assertEquals(2, max.getY(), 1E-9);
		assertEquals(0, max.getZ(), 1E-9);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.PointLocator, int, double) <em>Compute Curvature Change</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#computeCurvatureChange(org.eclipse.symphony.common.geometry.data3d.PointLocator, int, double)
	 * @generated
	 */
	public void testComputeCurvatureChange__PointLocator_int_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.Data3DUtils#extrude(java.util.List, org.eclipse.symphony.common.geometry.data3d.CartesianAxis, double, boolean) <em>Extrude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.Data3DUtils#extrude(java.util.List, org.eclipse.symphony.common.geometry.data3d.CartesianAxis, double, boolean)
	 * @generated_NOT
	 */
	public void testExtrude__List_CartesianAxis_double_boolean() 
	{
		List<CartesianPositionCoordinates> profilePoints = new ArrayList<CartesianPositionCoordinates>();
		profilePoints.add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-10, 99, 10));
		profilePoints.add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 99, 0));
		profilePoints.add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(10, 99, 10));
		profilePoints.add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(20, 99, 15));
		profilePoints.add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(30, 99, 0));
		
		CartesianTriangularMesh mesh = getFixture().extrude(profilePoints, CartesianAxis.Y, 10.0, true);
		
		TransformNode root = Symphony__CommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);			
		ContentNode<CartesianTriangularMesh> meshNode = Symphony__CommonTopologyFacade.INSTANCE.createContentNode(mesh);
		root.getChildren().add(meshNode);
		
		Resource resource = null;
		try
		{
			ResourceSet resourceSet = new ResourceSetImpl();
			resource = resourceSet.createResource(URI.createFileURI(Activator.getDefault().getResultsPath() + File.separator + "ExtrudeTest.topo"));			
			resource.getContents().add(root);
			resource.save(Collections.EMPTY_MAP);						
		} 
		catch (Exception e)
		{
			e.printStackTrace();			
		}	
	}

} //Data3DUtilsTest
