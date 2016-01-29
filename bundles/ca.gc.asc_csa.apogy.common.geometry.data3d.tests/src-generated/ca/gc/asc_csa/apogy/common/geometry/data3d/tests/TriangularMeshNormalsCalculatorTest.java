/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.TriangularMeshNormalsCalculator;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Triangular Mesh Normals Calculator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriangularMeshNormalsCalculatorTest extends TestCase {

	/**
	 * The fixture for this Triangular Mesh Normals Calculator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangularMeshNormalsCalculator fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TriangularMeshNormalsCalculatorTest.class);
	}

	/**
	 * Constructs a new Triangular Mesh Normals Calculator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangularMeshNormalsCalculatorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Triangular Mesh Normals Calculator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TriangularMeshNormalsCalculator fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Triangular Mesh Normals Calculator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangularMeshNormalsCalculator getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createTriangularMeshNormalsCalculator());
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

} //TriangularMeshNormalsCalculatorTest
