/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMeshColorizerBySlope;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Colorizer By Slope</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshColorizerBySlopeTest extends CartesianTriangularMeshColorizerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshColorizerBySlopeTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Colorizer By Slope test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshColorizerBySlopeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Colorizer By Slope test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshColorizerBySlope getFixture() {
		return (CartesianTriangularMeshColorizerBySlope)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianTriangularMeshColorizerBySlope());
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

} //CartesianTriangularMeshColorizerBySlopeTest
