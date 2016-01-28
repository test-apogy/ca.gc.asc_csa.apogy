/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Triangular Mesh Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh() <em>Get Current Mesh</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage() <em>Force Update Texture Image</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CartesianTriangularMeshMapLayerTest extends AbstractMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianTriangularMeshMapLayerTest.class);
	}

	/**
	 * Constructs a new Cartesian Triangular Mesh Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Triangular Mesh Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianTriangularMeshMapLayer getFixture() {
		return (CartesianTriangularMeshMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshMapLayer());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh() <em>Get Current Mesh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer#getCurrentMesh()
	 * @generated_NOT
	 */
	public void testGetCurrentMesh() {
		// Nothing to test.
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage() <em>Force Update Texture Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer#forceUpdateTextureImage()
	 * @generated_NOT
	 */
	public void testForceUpdateTextureImage() {
		// Nothing to test.
	}

} //CartesianTriangularMeshMapLayerTest
