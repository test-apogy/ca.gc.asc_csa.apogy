/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import java.util.List;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent() <em>Get Extent</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CartesianTriangularMeshTest extends TestCase 
{

	private CartesianPositionCoordinates p0;

	private CartesianPositionCoordinates p1;

	private CartesianPositionCoordinates p2;

	private CartesianPositionCoordinates p3;

	private CartesianTriangle t0;

	private CartesianTriangle t1;

	private CartesianPositionCoordinates p4;

	private CartesianTriangle t2;
	
	/**
	 * The fixture for this Cartesian Triangular Mesh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMesh fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Triangular Mesh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianTriangularMesh fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianTriangularMesh getFixture() {
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
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh());
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
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent() <em>Get Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent()
	 * @generated_NOT
	 */
	public void testGetExtent() 
	{
		getFixture().getPolygons().clear();
		getFixture().getPoints().clear();
		
		getFixture().getPoints().add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 2.0, 3.0));
		getFixture().getPoints().add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1.0, 2.0, 3.0));
		getFixture().getPoints().add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, -2.0, 3.0));
		getFixture().getPoints().add(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 2.0, -3.0));
		
		CartesianCoordinatesSetExtent extent = getFixture().getExtent();
		assertNotNull(extent);
		
		assertEquals(-1.0, extent.getXMin(), 1E-6);
		assertEquals(1.0, extent.getXMax(), 1E-6);
		
		assertEquals(-2.0, extent.getYMin(), 1E-6);
		assertEquals(2.0, extent.getYMax(), 1E-6);
		
		assertEquals(-3.0, extent.getZMin(), 1E-6);
		assertEquals(3.0, extent.getZMax(), 1E-6);
	}

	public void testGetPointNeighbours__CartesianPositionCoordinates() {

		setUp(getFixture());

		List<CartesianPositionCoordinates> points = getFixture().getPointNeighbours(p0);

		System.out.println("Number of neighbours: " + points.size());

		// P0 neighbours should be: p1, p2 and p4.
		assertEquals(3, points.size());

		CartesianPositionCoordinates n0 = points.get(0);
		CartesianPositionCoordinates n1 = points.get(1);
		CartesianPositionCoordinates n2 = points.get(2);

		assertEquals(n0, p1);
		assertEquals(n1, p2);
		assertEquals(n2, p4);
	}
	
	public void testGetTriangleNeighbours__CartesianTriangle() {

		setUp(getFixture());

		// The neighbours of t0 should be: t1 and t2
		List<CartesianTriangle> tri = getFixture().getPolygonNeighbours(t0);

		assertEquals(tri.size(), 2);
		assertEquals(tri.get(0), t2);
		assertEquals(tri.get(1), t1);

		tri = getFixture().getPolygonNeighbours(t2);
		// The only neighbour of t2 should be t0 and t1.
		assertEquals(tri.size(), 2);
		assertEquals(tri.get(0), t0);
		assertEquals(tri.get(1), t1);
	}

	public void testEquals() {

		setUp(getFixture());

		CartesianTriangularMesh mesh = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMesh();
		setUp(mesh);

		assertTrue(mesh.equals(getFixture()));

		// We change the value of point 0.
		double previousX = mesh.getPoints().get(0).getX();
		mesh.getPoints().get(0).setX(-1.0);

		assertFalse(mesh.equals(getFixture()));

		mesh.getPoints().get(0).setX(previousX);

		assertTrue(mesh.equals(getFixture()));

		// The new triangle is p0, p1, p3 instead of p0,p1,p2.
		CartesianPositionCoordinates p0 = mesh.getPoints().get(0);
		CartesianPositionCoordinates p1 = mesh.getPoints().get(1);
		CartesianPositionCoordinates p2 = mesh.getPoints().get(2);
		CartesianPositionCoordinates p3 = mesh.getPoints().get(3);
		CartesianTriangle newT0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p0, p1, p3);

		mesh.getPolygons().set(0, newT0);

		assertFalse(mesh.equals(getFixture()));

		newT0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p0, p1, p2);

		mesh.getPolygons().set(0, newT0);

		assertTrue(mesh.equals(getFixture()));
	}
	
	private void setUp(CartesianTriangularMesh mesh) 
	{		
		p0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 0.0, 0.0);
		p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 1.0, 0.0);
		p3 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 1.0, 0.0);
		p4 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1.0, 1.0, 0.0);

		t0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p0, p1, p2);
		t1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p1, p2, p3);
		t2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p0, p2, p4);

		mesh.getPoints().add(p0);
		mesh.getPoints().add(p1);
		mesh.getPoints().add(p2);
		mesh.getPoints().add(p3);

		mesh.getPolygons().add(t0);
		mesh.getPolygons().add(t1);
		mesh.getPolygons().add(t2);
	}
} //CartesianTriangularMeshTest
