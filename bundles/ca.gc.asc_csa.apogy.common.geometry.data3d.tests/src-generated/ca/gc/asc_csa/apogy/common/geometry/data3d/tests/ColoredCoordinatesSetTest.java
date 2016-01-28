/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Colored Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColoredCoordinatesSetTest extends AbstractCartesianCoordinatesSetTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColoredCoordinatesSetTest.class);
	}

	/**
	 * Constructs a new Colored Coordinates Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredCoordinatesSetTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Colored Coordinates Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ColoredCoordinatesSet getFixture() {
		return (ColoredCoordinatesSet)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createColoredCoordinatesSet());
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
	 * Test Nothing.
	 */
	public void testNothing()
	{	
		assertTrue(true);
	}
		
} //ColoredCoordinatesSetTest
