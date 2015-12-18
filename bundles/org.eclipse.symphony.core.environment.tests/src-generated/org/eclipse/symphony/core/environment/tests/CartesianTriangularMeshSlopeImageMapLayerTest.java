/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Slope Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshSlopeImageMapLayerTest extends CartesianTriangularMeshDerivedImageMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshSlopeImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Slope Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshSlopeImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Slope Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshSlopeImageMapLayer getFixture() {
		return (CartesianTriangularMeshSlopeImageMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshSlopeImageMapLayer());
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
	 * Test nothing.
	 */
	public void testNothing()
	{
		assertTrue(true);
	}
} //CartesianTriangularMeshSlopeImageMapLayerTest
