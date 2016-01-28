/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createGeographicCoordinatesPolygonShapeImageMapLayer());
				
		getFixture().setRequiredResolution(0.5);		
				
		GeographicCoordinates g0 = Symphony__CoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();				
		getFixture().getPolygonVerticesGeographicCoordinates().add(g0);
		
		GeographicCoordinates g1 = Symphony__CoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();			
		g1.setLatitude(g1.getLatitude() + 0.00000001);		
		getFixture().getPolygonVerticesGeographicCoordinates().add(g1);
		
		GeographicCoordinates g2 = Symphony__CoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();		
		g2.setLatitude(g2.getLatitude()   + 0.00000001);
		g2.setLongitude(g2.getLongitude() + 0.00000001);
		getFixture().getPolygonVerticesGeographicCoordinates().add(g2);
					
//		Map map = Symphony__CoreEnvironmentFactory.eINSTANCE.createMap();				
//		map.getLayers().add(getFixture());
				
		EarthSurfaceWorksite  earthSurfaceWorksite = Symphony__CoreEnvironmentFacade.INSTANCE.createAndInitializeDefaultCSAWorksite();
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
