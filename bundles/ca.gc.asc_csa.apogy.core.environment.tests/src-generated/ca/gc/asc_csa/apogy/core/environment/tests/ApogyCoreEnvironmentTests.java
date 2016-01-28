/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>environment</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ApogyCoreEnvironmentTests("environment Tests");
		suite.addTestSuite(EarthSurfaceWorksiteTest.class);
		suite.addTestSuite(AtmosphereUtilsTest.class);
		suite.addTestSuite(SkyTest.class);
		suite.addTestSuite(EarthSkyTest.class);
		suite.addTestSuite(SunTest.class);
		suite.addTestSuite(EarthTest.class);
		suite.addTestSuite(MoonTest.class);
		suite.addTestSuite(EnvironmentUtilitiesTest.class);
		suite.addTestSuite(ApogyCoreEnvironmentFacadeTest.class);
		suite.addTestSuite(StarFieldTest.class);
		suite.addTestSuite(AstronomyUtilsTest.class);
		suite.addTestSuite(MapTest.class);
		suite.addTestSuite(MapsListTest.class);
		suite.addTestSuite(RectangularRegionTest.class);
		suite.addTestSuite(RectangularVolumeRegionTest.class);
		suite.addTestSuite(ImageMapLayerTest.class);
		suite.addTestSuite(ImageMapLayerPresentationTest.class);
		suite.addTestSuite(URLImageMapLayerTest.class);
		suite.addTestSuite(TopologyTreeMapLayerTest.class);
		suite.addTestSuite(TopologyTreeMapLayerNodeTest.class);
		suite.addTestSuite(CartesianTriangularMeshMapLayerTest.class);
		suite.addTestSuite(CartesianTriangularMeshSlopeImageMapLayerTest.class);
		suite.addTestSuite(CartesianTriangularMeshDiscreteSlopeImageMapLayerTest.class);
		suite.addTestSuite(CartesianTriangularMeshHeightImageMapLayerTest.class);
		suite.addTestSuite(LineOfSightImageMapLayerTest.class);
		suite.addTestSuite(EllipseShapeImageLayerTest.class);
		suite.addTestSuite(RectangleShapeImageLayerTest.class);
		suite.addTestSuite(CartesianCoordinatesPolygonShapeImageMapLayerTest.class);
		suite.addTestSuite(GeographicCoordinatesPolygonShapeImageMapLayerTest.class);
		suite.addTestSuite(BasicCartesianTriangularMeshMapLayerTest.class);
		suite.addTestSuite(CartesianTriangularMeshURLMapLayerTest.class);
		suite.addTestSuite(FeaturesOfInterestMapLayerTest.class);
		suite.addTestSuite(WorksiteNodeTest.class);
		suite.addTestSuite(SurfaceWorksiteNodeTest.class);
		suite.addTestSuite(EarthSurfaceWorksiteNodeTest.class);
		suite.addTestSuite(MapsListNodeTest.class);
		suite.addTestSuite(MapNodeTest.class);
		suite.addTestSuite(AbstractMapLayerNodeTest.class);
		suite.addTestSuite(SkyNodeTest.class);
		suite.addTestSuite(EarthSkyNodeTest.class);
		suite.addTestSuite(CartesianTriangularMeshMapLayerNodeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentTests(String name) {
		super(name);
	}

} //ApogyCoreEnvironmentTests
