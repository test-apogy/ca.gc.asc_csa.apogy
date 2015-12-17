/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangle;
import org.eclipse.symphony.common.geometry.data3d.SphereSamplingShape;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sphere Sampling Shape</b></em>'.
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
public class SphereSamplingShapeTest extends TestCase {

	/**
	 * The fixture for this Sphere Sampling Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SphereSamplingShape<CartesianTriangle> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SphereSamplingShapeTest.class);
	}

	/**
	 * Constructs a new Sphere Sampling Shape test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphereSamplingShapeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sphere Sampling Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void setFixture(SphereSamplingShape<CartesianTriangle> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sphere Sampling Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected SphereSamplingShape<CartesianTriangle> getFixture() {
		return fixture;
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
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape());		
		getFixture().setCenter(Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 1));
		getFixture().setRadius(10);
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
		CartesianPositionCoordinates v1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates v2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates v3 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 0);
		
		CartesianTriangle t1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianTriangle(v1, v2, v3);
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
		CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 1);
		assertTrue(getFixture().isInside(point));
		
		point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 11);
		assertTrue(getFixture().isInside(point));
		
		point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 12);
		assertFalse(getFixture().isInside(point));
	}

	public void testIsInside__CartesianPositionCoordinates() 
	{
		CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 1);
		assertTrue(getFixture().isInside(point));
		
		point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 11);
		assertTrue(getFixture().isInside(point));
		
		point = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 12);
		assertFalse(getFixture().isInside(point));
	}
} //SphereSamplingShapeTest
