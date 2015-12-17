/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.CubeSamplingShape;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cube Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.PolygonSamplingShape#isPolygonInside(org.eclipse.symphony.common.geometry.data.Polygon) <em>Is Polygon Inside</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape#isInside(org.eclipse.symphony.common.geometry.data.Coordinates) <em>Is Inside</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CubeSamplingShapeTest extends TestCase {

	/**
	 * The fixture for this Cube Sampling Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected CubeSamplingShape<CartesianTriangle> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CubeSamplingShapeTest.class);
	}

	/**
	 * Constructs a new Cube Sampling Shape test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeSamplingShapeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cube Sampling Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void setFixture(CubeSamplingShape<CartesianTriangle> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cube Sampling Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected CubeSamplingShape<CartesianTriangle> getFixture() {
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
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createCubeSamplingShape());
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
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data.PolygonSamplingShape#isPolygonInside(org.eclipse.symphony.common.geometry.data.Polygon) <em>Is Polygon Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data.PolygonSamplingShape#isPolygonInside(org.eclipse.symphony.common.geometry.data.Polygon)
	 * @generated_NOT
	 */
	public void testIsPolygonInside__Polygon() 
	{
		CartesianPositionCoordinates corner1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1.0, -1.0, -1.0);
		CartesianPositionCoordinates corner2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 1.0, 1.0);
		
		getFixture().setCorner1(corner1);
		getFixture().setCorner2(corner2);
		getFixture().setIncludeJustTouching(true);
		
		CartesianPositionCoordinates p0 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.50, 0.50, 0.00);								
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.75, 0.50, 0.25);						
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.75, 0.75, 0.50);				
		
		CartesianTriangle t1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(p0, p1, p2);
		assertTrue(getFixture().isPolygonInside(t1));
		
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape#isInside(org.eclipse.symphony.common.geometry.data.Coordinates) <em>Is Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data.CoordinatesSamplingShape#isInside(org.eclipse.symphony.common.geometry.data.Coordinates)
	 * @generated_NOT
	 */
	public void testIsInside__Coordinates() 
	{
		CartesianPositionCoordinates corner1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1.0, -1.0, -1.0);
		CartesianPositionCoordinates corner2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 1.0, 1.0);
		
		getFixture().setCorner1(corner1);
		getFixture().setCorner2(corner2);
		getFixture().setIncludeJustTouching(true);
		
		CartesianPositionCoordinates p = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.0, 0.0, 0.0);				
		assertTrue(getFixture().isInside(p));
		
		p = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(10.0, 0.0, 0.0);
		assertFalse(getFixture().isInside(p));
		
		p = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1.0, 0.0, 0.0);
		assertTrue(getFixture().isInside(p));
		
		// Exclude point on the edges.
		getFixture().setIncludeJustTouching(false);
		assertFalse(getFixture().isInside(p));		
	}

} //CubeSamplingShapeTest
