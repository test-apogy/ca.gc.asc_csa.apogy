/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.common.geometry.data3d.SphericalTriangle;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spherical Triangle</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SphericalTriangleTest extends SphericalPolygonTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SphericalTriangleTest.class);
	}

	/**
	 * Constructs a new Spherical Triangle test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalTriangleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Spherical Triangle test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SphericalTriangle getFixture() {
		return (SphericalTriangle)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createSphericalTriangle());
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
	 * Tests nothing.
	 */
	public void testNothing()
	{
		assertTrue(true);
	}
} //SphericalTriangleTest
