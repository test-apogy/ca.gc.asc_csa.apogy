/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeStars() <em>Create And Initialize Stars</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite() <em>Create And Initialize Default CSA Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#initializeSkyNode(org.eclipse.symphony.core.environment.Sky, org.eclipse.symphony.core.environment.SkyNode) <em>Initialize Sky Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#initializeEarthSkyNode(org.eclipse.symphony.core.environment.EarthSky, org.eclipse.symphony.core.environment.EarthSkyNode) <em>Initialize Earth Sky Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMarsYardGeographicalCoordinates() <em>Get Mars Yard Geographical Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createStar(float, double, double) <em>Create Star</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMarsYardTransformNode() <em>Get Mars Yard Transform Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment() <em>Create And Initialize Earth Surface Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeEarthAtmosphere() <em>Create And Initialize Earth Atmosphere</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getSunVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Sun Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getSunVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.invocator.Environment) <em>Get Sun Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMoonVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Moon Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMoonVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.invocator.Environment) <em>Get Moon Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.core.ConnectionPoint, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.core.ConnectionPoint, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, java.lang.String, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createEImage(java.util.List) <em>Create EImage</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(org.eclipse.symphony.core.environment.RectangularRegion) <em>Get Absolute Rectangular Region Corners</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List) <em>Get Best Resolution Rectangular Region Image</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionExtent(org.eclipse.symphony.core.environment.RectangularRegionProvider, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionImageExtent(org.eclipse.symphony.core.environment.RectangularRegionImage, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#fitsInside(org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.core.environment.RectangularRegion) <em>Fits Inside</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#intersects(org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.common.math.Matrix4x4) <em>Intersects</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationExtent(org.eclipse.symphony.core.environment.ImageMapLayerPresentation, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List) <em>Get Image Map Layer Presentation Image</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List) <em>Get Best Resolution Map Layer</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List) <em>Get Visible Image Map Layer Presentation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularVolumeRegion(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Get Rectangular Volume Region</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class Symphony__CoreEnvironmentFacadeTest extends TestCase {

	/**
	 * The fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CoreEnvironmentFacade fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Symphony__CoreEnvironmentFacadeTest.class);
	}

	/**
	 * Constructs a new Facade test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentFacadeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Symphony__CoreEnvironmentFacade fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Symphony__CoreEnvironmentFacade getFixture() {
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createSymphony__CoreEnvironmentFacade());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeStars() <em>Create And Initialize Stars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeStars()
	 * @generated
	 */
	public void testCreateAndInitializeStars() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite() <em>Create And Initialize Default CSA Worksite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite()
	 * @generated
	 */
	public void testCreateAndInitializeDefaultCSAWorksite() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#initializeSkyNode(org.eclipse.symphony.core.environment.Sky, org.eclipse.symphony.core.environment.SkyNode) <em>Initialize Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#initializeSkyNode(org.eclipse.symphony.core.environment.Sky, org.eclipse.symphony.core.environment.SkyNode)
	 * @generated
	 */
	public void testInitializeSkyNode__Sky_SkyNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#initializeEarthSkyNode(org.eclipse.symphony.core.environment.EarthSky, org.eclipse.symphony.core.environment.EarthSkyNode) <em>Initialize Earth Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#initializeEarthSkyNode(org.eclipse.symphony.core.environment.EarthSky, org.eclipse.symphony.core.environment.EarthSkyNode)
	 * @generated
	 */
	public void testInitializeEarthSkyNode__EarthSky_EarthSkyNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMarsYardGeographicalCoordinates() <em>Get Mars Yard Geographical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMarsYardGeographicalCoordinates()
	 * @generated
	 */
	public void testGetMarsYardGeographicalCoordinates() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createStar(float, double, double) <em>Create Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createStar(float, double, double)
	 * @generated
	 */
	public void testCreateStar__float_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMarsYardTransformNode() <em>Get Mars Yard Transform Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMarsYardTransformNode()
	 * @generated
	 */
	public void testGetMarsYardTransformNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment() <em>Create And Initialize Earth Surface Environment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment()
	 * @generated
	 */
	public void testCreateAndInitializeEarthSurfaceEnvironment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeEarthAtmosphere() <em>Create And Initialize Earth Atmosphere</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createAndInitializeEarthAtmosphere()
	 * @generated
	 */
	public void testCreateAndInitializeEarthAtmosphere() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getSunVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Sun Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getSunVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetSunVector__SymphonySystem_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getSunVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.invocator.Environment) <em>Get Sun Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getSunVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetSunVector__Node_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMoonVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMoonVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetMoonVector__SymphonySystem_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMoonVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getMoonVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetMoonVector__Node_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.core.ConnectionPoint, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.common.topology.Node, org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.core.ConnectionPoint, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__Node_SymphonySystem_ConnectionPoint_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.core.ConnectionPoint, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.SymphonySystem, org.eclipse.symphony.core.ConnectionPoint, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__SymphonySystem_String_SymphonySystem_ConnectionPoint_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.SymphonySystem, java.lang.String, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__SymphonySystem_String_SymphonySystem_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, java.lang.String, java.lang.String, org.eclipse.symphony.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVector(org.eclipse.symphony.core.SymphonySystem, java.lang.String, java.lang.String, java.lang.String, org.eclipse.symphony.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__SymphonySystem_String_String_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createEImage(java.util.List) <em>Create EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#createEImage(java.util.List)
	 * @generated
	 */
	public void testCreateEImage__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(org.eclipse.symphony.core.environment.RectangularRegion) <em>Get Absolute Rectangular Region Corners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(org.eclipse.symphony.core.environment.RectangularRegion)
	 * @generated
	 */
	public void testGetAbsoluteRectangularRegionCorners__RectangularRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List) <em>Get Best Resolution Rectangular Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List)
	 * @generated
	 */
	public void testGetBestResolutionRectangularRegionImage__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionExtent(org.eclipse.symphony.core.environment.RectangularRegionProvider, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionExtent(org.eclipse.symphony.core.environment.RectangularRegionProvider, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionImageExtent(org.eclipse.symphony.core.environment.RectangularRegionImage, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionImageExtent(org.eclipse.symphony.core.environment.RectangularRegionImage, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionExtent__List_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionImageExtent__List_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#fitsInside(org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.core.environment.RectangularRegion) <em>Fits Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#fitsInside(org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.core.environment.RectangularRegion)
	 * @generated
	 */
	public void testFitsInside__RectangularRegion_RectangularRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#intersects(org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.common.math.Matrix4x4) <em>Intersects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#intersects(org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.core.environment.RectangularRegion, org.eclipse.symphony.common.math.Matrix4x4)
	 * @generated
	 */
	public void testIntersects__RectangularRegion_RectangularRegion_Matrix4x4() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationExtent(org.eclipse.symphony.core.environment.ImageMapLayerPresentation, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationExtent(org.eclipse.symphony.core.environment.ImageMapLayerPresentation, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, org.eclipse.symphony.common.math.Tuple3d, org.eclipse.symphony.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List) <em>Get Image Map Layer Presentation Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List)
	 * @generated
	 */
	public void testGetImageMapLayerPresentationImage__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List) <em>Get Best Resolution Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List)
	 * @generated
	 */
	public void testGetBestResolutionMapLayer__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List) <em>Get Visible Image Map Layer Presentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List)
	 * @generated
	 */
	public void testGetVisibleImageMapLayerPresentation__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularVolumeRegion(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh) <em>Get Rectangular Volume Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade#getRectangularVolumeRegion(org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	public void testGetRectangularVolumeRegion__CartesianTriangularMesh() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //Symphony__CoreEnvironmentFacadeTest
