/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Basic Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicCartesianTriangularMeshMapLayerTest extends CartesianTriangularMeshMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BasicCartesianTriangularMeshMapLayerTest.class);
	}

	/**
	 * Constructs a new Basic Cartesian Triangular Mesh Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCartesianTriangularMeshMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Basic Cartesian Triangular Mesh Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BasicCartesianTriangularMeshMapLayer getFixture() {
		return (BasicCartesianTriangularMeshMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createBasicCartesianTriangularMeshMapLayer());
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
} //BasicCartesianTriangularMeshMapLayerTest
