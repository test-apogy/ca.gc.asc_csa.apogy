/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import javax.vecmath.Point3d;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Position Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d() <em>As Point3d</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CartesianPositionCoordinatesTest extends TestCase {

	/**
	 * The fixture for this Cartesian Position Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPositionCoordinates fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianPositionCoordinatesTest.class);
	}

	/**
	 * Constructs a new Cartesian Position Coordinates test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinatesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Position Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianPositionCoordinates fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Position Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPositionCoordinates getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPositionCoordinates());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d() <em>As Point3d</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates#asPoint3d()
	 * @generated_NOT
	 */
	public void testAsPoint3d() 
	{
		getFixture().setX(1.0);
		getFixture().setY(-91.0);
		getFixture().setZ(0.001);
		
		Point3d point = getFixture().asPoint3d();
		
		assertNotNull(point);
		assertEquals(1.0, point.x, 0);
		assertEquals(-91.0, point.y, 0);
		assertEquals(0.001, point.z, 0);
	}

	public void testEqual()
	{
		getFixture().setX(1.0);
		getFixture().setY(-91.0);
		getFixture().setZ(0.001);
		
		// Should not be equal to null.
		assertFalse(getFixture().equals(null));
		
		// Should be equal to itself.
		assertTrue(getFixture().equals(getFixture()));
		
		// Should be equal to another point with the same coordinates.		
		CartesianPositionCoordinates p = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(getFixture());
		assertTrue(getFixture().equals(p));			
		
		// Should not be equal to this one.
		p.setX(p.getX() + 10.0);
		assertFalse(getFixture().equals(p));
	}
} //CartesianPositionCoordinatesTest
