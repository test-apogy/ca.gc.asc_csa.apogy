/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSet;
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFacade;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianCoordinatesSetTest extends AbstractCartesianCoordinatesSetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianCoordinatesSetTest.class);
	}

	/**
	 * Constructs a new Cartesian Coordinates Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Coordinates Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianCoordinatesSet getFixture() {
		return (CartesianCoordinatesSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet());
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
	 * Test the adding of coordinates to the list of coordinates.
	 */
	public void testAddCoordinates() 
	{
		System.out.println("CartesianCoordinatesSetTest.testAddCoordinates()");
		CartesianPositionCoordinates p1 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 2, 3);
		CartesianPositionCoordinates p2 = Symphony__CommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(4, 5, 6);

		System.out.println("Number of points before: " + getFixture().getPoints().size());

		// Test a duplicate.
		getFixture().getPoints().add(p1);
		getFixture().getPoints().add(p2);
		getFixture().getPoints().add(p2);
		for (CartesianPositionCoordinates point : getFixture().getPoints()) 
		{
			System.out.println("CartesianCoordinatesSetTest.testAddCoordinates(): "	+ point);
		}
		assertEquals(2, getFixture().getPoints().size());
	}

	public void testLargData() 
	{
		Random rand = new Random(0);

		int nPts = 100000;
		long t0 = System.currentTimeMillis();
		CartesianCoordinatesSet pointCloud = Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();

		for (int i = 0; i < nPts; i++) {
			CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE
					.createCartesianPositionCoordinates(rand.nextDouble(), rand
							.nextDouble(), rand.nextDouble());
			pointCloud.getPoints().add(point);
		}

		long t1 = System.currentTimeMillis();

		System.out
				.println("CartesianCoordinatesSetTest.testLargData() time to add "
						+ nPts + " points in an EList: " + (t1 - t0) + "ms");

		t0 = System.currentTimeMillis();
		List<CartesianPositionCoordinates> points = new LinkedList<CartesianPositionCoordinates>();

		for (int i = 0; i < nPts; i++) {
			CartesianPositionCoordinates point = Symphony__CommonGeometryData3DFacade.INSTANCE
					.createCartesianPositionCoordinates(rand.nextDouble(), rand
							.nextDouble(), rand.nextDouble());
			points.add(point);
		}

		t1 = System.currentTimeMillis();

		System.out
				.println("CartesianCoordinatesSetTest.testLargData() time to add "
						+ nPts + " points in LinkedList: " + (t1 - t0) + "ms");

	}
} //CartesianCoordinatesSetTest
