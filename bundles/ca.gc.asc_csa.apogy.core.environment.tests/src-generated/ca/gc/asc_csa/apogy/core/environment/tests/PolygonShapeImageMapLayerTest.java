/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices() <em>Get Vertices</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PolygonShapeImageMapLayerTest extends AbstractShapeImageLayerTest {

	/**
	 * Constructs a new Polygon Shape Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonShapeImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Polygon Shape Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PolygonShapeImageMapLayer getFixture() {
		return (PolygonShapeImageMapLayer)fixture;
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices() <em>Get Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices()
	 * @generated_NOT
	 */
	public void testGetVertices() {
		// This test should be implemented by sib-classes.
	}
	
	@Override
	public void testGetResolution() 
	{
		// Updates the image.
		getFixture().updateImage(new NullProgressMonitor());
		
		// Should be equal to the required resolution
		assertEquals(getFixture().getRequiredResolution(), getFixture().getResolution(), 1E-6);
	}

} //PolygonShapeImageMapLayerTest
