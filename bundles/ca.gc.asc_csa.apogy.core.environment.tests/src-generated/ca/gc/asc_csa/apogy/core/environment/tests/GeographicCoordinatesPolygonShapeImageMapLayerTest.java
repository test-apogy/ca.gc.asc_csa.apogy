/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Geographic Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeographicCoordinatesPolygonShapeImageMapLayerTest extends PolygonShapeImageMapLayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeographicCoordinatesPolygonShapeImageMapLayerTest.class);
	}

	/**
	 * Constructs a new Geographic Coordinates Polygon Shape Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinatesPolygonShapeImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Geographic Coordinates Polygon Shape Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeographicCoordinatesPolygonShapeImageMapLayer getFixture() {
		return (GeographicCoordinatesPolygonShapeImageMapLayer)fixture;
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinatesPolygonShapeImageMapLayer());
				
		getFixture().setRequiredResolution(0.5);		
				
		GeographicCoordinates g0 = ApogyCoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();				
		getFixture().getPolygonVerticesGeographicCoordinates().add(g0);
		
		GeographicCoordinates g1 = ApogyCoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();			
		g1.setLatitude(g1.getLatitude() + 0.00000001);		
		getFixture().getPolygonVerticesGeographicCoordinates().add(g1);
		
		GeographicCoordinates g2 = ApogyCoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();		
		g2.setLatitude(g2.getLatitude()   + 0.00000001);
		g2.setLongitude(g2.getLongitude() + 0.00000001);
		getFixture().getPolygonVerticesGeographicCoordinates().add(g2);
					
//		Map map = ApogyCoreEnvironmentFactory.eINSTANCE.createMap();				
//		map.getLayers().add(getFixture());
				
		EarthSurfaceWorksite  earthSurfaceWorksite = ApogyCoreEnvironmentFacade.INSTANCE.createAndInitializeDefaultCSAWorksite();
		earthSurfaceWorksite.getMapsList().getMaps().get(0).getLayers().add(getFixture());
		
		earthSurfaceWorksite.getMapsList().getMaps().get(0).setName("test");
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
									
			saveImage(getFixture().getImage(), "GeographicCoordinatesPolygonShapeImageMapLayerTest");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}
	
	@Override
	public void testGetRegion() 
	{
		RectangularRegion rectangularRegion = getFixture().getImageMapLayerRegion();
		
		assertNotNull(rectangularRegion);
		assertEquals(60.0, rectangularRegion.getXDimension());
		assertEquals(120.0, rectangularRegion.getYDimension());
	}
} //GeographicCoordinatesPolygonShapeImageMapLayerTest
