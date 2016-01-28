/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import java.util.ArrayList;
import java.util.List;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.KDTreeBasedPointLocator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>KD Tree Based Point Locator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class KDTreeBasedPointLocatorTest extends PointLocatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(KDTreeBasedPointLocatorTest.class);
	}

	/**
	 * Constructs a new KD Tree Based Point Locator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KDTreeBasedPointLocatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this KD Tree Based Point Locator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected KDTreeBasedPointLocator getFixture() {
		return (KDTreeBasedPointLocator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createKDTreeBasedPointLocator());
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
	public void testAddPoint__CartesianPositionCoordinates() 
	{
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		getFixture().addPoint(p0);
		assertEquals(1, getFixture().getPoints().size());
	}
	
	@Override
	public void testAddPoints__List() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);
		assertEquals(5, getFixture().getPoints().size());
	}
	
	@Override
	public void testRemovePoint__CartesianPositionCoordinates() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);	
		
		getFixture().removePoint(p3);
		assertEquals(4, getFixture().getPoints().size());
	}
	
	@Override
	public void testRemovePoints__List() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);	
				
		List<CartesianPositionCoordinates> pointsToRemove = new ArrayList<CartesianPositionCoordinates>();
		pointsToRemove.add(p2);
		pointsToRemove.add(p4);
		
		getFixture().removePoints(pointsToRemove);		
		assertEquals(3, getFixture().getPoints().size());
	}
	
	@Override
	public void testClearPoints() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);	
		
		assertEquals(5, getFixture().getPoints().size());
		
		getFixture().clearPoints();
		
		assertEquals(0, getFixture().getPoints().size());
	}
	
	@Override
	public void testFindClosestPoint__CartesianPositionCoordinates() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);
				
		CartesianPositionCoordinates closestPoint = getFixture().findClosestPoint(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0.9,  0.9,  0.9));		
		assertEquals(p3, closestPoint);		
	}
	
	@Override
	public void testFindClosestPoints__CartesianPositionCoordinates_int() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);
		
		List<CartesianPositionCoordinates> closest = getFixture().findClosestPoints(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0), 3);
		
		assertEquals(3, closest.size());
		assertEquals(p0, closest.get(0));
		assertEquals(p1, closest.get(1));
		assertEquals(p2, closest.get(2));	
	}
	
	@Override
	public void testFindPointsWithinRadius__CartesianPositionCoordinates_double() 
	{
		List<CartesianPositionCoordinates> points = new ArrayList<CartesianPositionCoordinates>();
		
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,0,0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,0);
		CartesianPositionCoordinates p3 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1,1,1);
		CartesianPositionCoordinates p4 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(-1,-1,-2);
		
		points.add(p0);
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		
		getFixture().addPoints(points);
		
		double radius = Math.sqrt(2.0) + 0.1;
		List<CartesianPositionCoordinates> closest = getFixture().findPointsWithinRadius(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0,0,0), radius);
		
		assertEquals(3, closest.size());
		assertEquals(p0, closest.get(0));
		assertEquals(p1, closest.get(1));
		assertEquals(p2, closest.get(2));
	}

} //KDTreeBasedPointLocatorTest
