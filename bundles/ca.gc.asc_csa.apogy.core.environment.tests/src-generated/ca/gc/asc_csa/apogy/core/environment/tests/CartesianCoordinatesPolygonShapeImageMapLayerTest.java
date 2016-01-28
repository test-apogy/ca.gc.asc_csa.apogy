/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianCoordinatesPolygonShapeImageMapLayerTest extends PolygonShapeImageMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianCoordinatesPolygonShapeImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Cartesian Coordinates Polygon Shape Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesPolygonShapeImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cartesian Coordinates Polygon Shape Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CartesianCoordinatesPolygonShapeImageMapLayer getFixture() {
		return (CartesianCoordinatesPolygonShapeImageMapLayer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated_NOT
	 */
	@Override
	protected void setUp() throws Exception 
	{
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createCartesianCoordinatesPolygonShapeImageMapLayer());
		
		getFixture().setRequiredResolution(0.5);
		
		Tuple3d p0 = ApogyCommonMathFacade.INSTANCE.createTuple3d(0, 0, 0);		
		getFixture().getVertices().add(p0);
		
		Tuple3d p1 = ApogyCommonMathFacade.INSTANCE.createTuple3d(10, 0, 0);		
		getFixture().getVertices().add(p1);
		
		Tuple3d p2 = ApogyCommonMathFacade.INSTANCE.createTuple3d(10, 20, 0);		
		getFixture().getVertices().add(p2);		
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
	
	@Override
	public void testGetVertices() 
	{
		assertNotNull(getFixture().getVertices());
		assertTrue(!getFixture().getVertices().isEmpty());
	}
	
	@Override
	public void testUpdateImage__IProgressMonitor() 
	{
		try
		{
			getFixture().updateImage(new NullProgressMonitor());
			
			assertNotNull(getFixture().getImage());								
			
			saveImage(getFixture().getImage(), "CartesianCoordinatesPolygonShapeImageMapLayerTest");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}
	
	@Override
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(0, rectangularRegion.getXMin(), 1E-9);
		assertEquals(10.0, rectangularRegion.getXMax(), 1E-9);
		
		assertEquals(0.0, rectangularRegion.getYMin(), 1E-9);
		assertEquals(20, rectangularRegion.getYMax(), 1E-9);		
	}
	
} //CartesianCoordinatesPolygonShapeImageMapLayerTest
