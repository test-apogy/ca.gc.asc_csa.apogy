/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianOrientationCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Orientation Coordinates</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianOrientationCoordinatesTest extends TestCase {

	/**
	 * The fixture for this Cartesian Orientation Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianOrientationCoordinates fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianOrientationCoordinatesTest.class);
	}

	/**
	 * Constructs a new Cartesian Orientation Coordinates test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianOrientationCoordinatesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Orientation Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianOrientationCoordinates fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Orientation Coordinates test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianOrientationCoordinates getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianOrientationCoordinates());
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
	
	public void testEqual()
	{
		getFixture().setXRotation(Math.toRadians(45));
		getFixture().setXRotation(Math.toRadians(-5.777));
		getFixture().setXRotation(Math.toRadians(91.9));
		
		// Should not be equal to null.
		assertFalse(getFixture().equals(null));
		
		// Should be equal to itself.
		assertTrue(getFixture().equals(getFixture()));
		
		// Should be equal to another point with the same coordinates.		
		CartesianOrientationCoordinates p = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianOrientationCoordinates(getFixture());
		assertTrue(getFixture().equals(p));			
		
		// Should not be equal to this one.
		p.setXRotation(p.getXRotation() + 1.0);
		assertFalse(getFixture().equals(p));
	}

} //CartesianOrientationCoordinatesTest
