/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangleTest extends CartesianPolygonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangleTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangle getFixture() {
		return (CartesianTriangle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianTriangle());
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
	public void testGetNormal() 
	{
		CartesianPositionCoordinates p0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 0.0, 0.0);
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 1.0, 0.0);

		getFixture().getVertices().add(p0);
		getFixture().getVertices().add(p1);
		getFixture().getVertices().add(p2);
		
		assertEquals(0, getFixture().getNormal().x, 1e-6);
		assertEquals(0, getFixture().getNormal().y, 1e-6);
		assertEquals(1, getFixture().getNormal().z, 1e-6);
	}
	
	@Override
	public void testGetSurface() 
	{
		CartesianPositionCoordinates p0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 0.0, 0.0);
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 1.0, 0.0);

		getFixture().getVertices().add(p0);
		getFixture().getVertices().add(p1);
		getFixture().getVertices().add(p2);
		
		assertEquals(0.5, getFixture().getSurface(), 1e-6);
	}
	
	@Override
	public void testGetCentroid() 
	{
		CartesianPositionCoordinates p0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 0.0, 0.0);
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 1.0, 0.0);

		getFixture().getVertices().add(p0);
		getFixture().getVertices().add(p1);
		getFixture().getVertices().add(p2);
		
		assertEquals(2.0/3.0, getFixture().getCentroid().getX(), 1e-6);
		assertEquals(1.0/3.0, getFixture().getCentroid().getY(), 1e-6);
		assertEquals(0, getFixture().getCentroid().getZ(), 1e-6);
	}
	
	public void testAddVertices() {

		CartesianPositionCoordinates p0 = Symphony__CommonGeometryData3DFacade.INSTANCE
				.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE
				.createCartesianPositionCoordinates(0.0, 1.0, 0.0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE
				.createCartesianPositionCoordinates(0.0, 0.0, 1.0);
		CartesianPositionCoordinates p3 = Symphony__CommonGeometryData3DFacade.INSTANCE
				.createCartesianPositionCoordinates(1.0, 0.0, 1.0);

		getFixture().getVertices().add(p0);
		getFixture().getVertices().add(p1);
		getFixture().getVertices().add(p2);

		// We should get an exception here, IllegalArgumentException.
		try {
			getFixture().getVertices().add(p3);
		} catch (IllegalArgumentException e) {
		}

		// The number of vertices should be 3.
		assertEquals(getFixture().getVertices().size(), 3);
	}

	public void testAddVerticeMany() 
	{
		CartesianPositionCoordinates p0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 1.0, 0.0);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 0.0, 1.0);
		CartesianPositionCoordinates p3 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 1.0);

		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();

		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);

		// We should get an exception here, IllegalArgumentException.
		try 
		{
			getFixture().getVertices().addAll(points);
			fail();
		} 
		catch (IllegalArgumentException e) {
		}

		// The number of vertices should be 3.
		assertEquals(getFixture().getVertices().size(), 3);
	}

	
	
} //CartesianTriangleTest
