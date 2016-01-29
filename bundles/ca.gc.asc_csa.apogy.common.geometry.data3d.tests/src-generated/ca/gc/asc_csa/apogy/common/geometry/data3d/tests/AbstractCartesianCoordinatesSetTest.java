/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Cartesian Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent() <em>Get Extent</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AbstractCartesianCoordinatesSetTest extends TestCase {

	/**
	 * The fixture for this Abstract Cartesian Coordinates Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCartesianCoordinatesSet<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractCartesianCoordinatesSetTest.class);
	}

	/**
	 * Constructs a new Abstract Cartesian Coordinates Set test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCartesianCoordinatesSetTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Cartesian Coordinates Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractCartesianCoordinatesSet<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Cartesian Coordinates Set test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCartesianCoordinatesSet<?> getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createAbstractCartesianCoordinatesSet());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent() <em>Get Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.AbstractCartesianCoordinatesSet#getExtent()
	 * @generated_NOT
	 */
	public void testGetExtent() {
		// Should be tested by sub classes implementations.
	}

} //AbstractCartesianCoordinatesSetTest
