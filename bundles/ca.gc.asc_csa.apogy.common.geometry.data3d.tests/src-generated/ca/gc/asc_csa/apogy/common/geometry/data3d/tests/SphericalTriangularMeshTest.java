/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.symphony.common.geometry.data3d.SphericalTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Spherical Triangular Mesh</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SphericalTriangularMeshTest extends TestCase {

	/**
	 * The fixture for this Spherical Triangular Mesh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalTriangularMesh fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SphericalTriangularMeshTest.class);
	}

	/**
	 * Constructs a new Spherical Triangular Mesh test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SphericalTriangularMeshTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Spherical Triangular Mesh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SphericalTriangularMesh fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Spherical Triangular Mesh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SphericalTriangularMesh getFixture() {
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
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createSphericalTriangularMesh());
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

} //SphericalTriangularMeshTest
