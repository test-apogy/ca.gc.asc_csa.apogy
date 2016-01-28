/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.asc.tests;

import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.Coordinates2D;
import ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ApogyCommonGeometryData3DASCFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Coordinates2 D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Coordinates2DTest extends TestCase {

	/**
	 * The fixture for this Coordinates2 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordinates2D fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Coordinates2DTest.class);
	}

	/**
	 * Constructs a new Coordinates2 D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates2DTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Coordinates2 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Coordinates2D fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Coordinates2 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Coordinates2D getFixture() {
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
		setFixture(ApogyCommonGeometryData3DASCFactory.eINSTANCE.createCoordinates2D());
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
	 * Test nothing to prevent no test error.
	 */
	public void testNothing()
	{
		assertTrue(true);
	}
} //Coordinates2DTest
