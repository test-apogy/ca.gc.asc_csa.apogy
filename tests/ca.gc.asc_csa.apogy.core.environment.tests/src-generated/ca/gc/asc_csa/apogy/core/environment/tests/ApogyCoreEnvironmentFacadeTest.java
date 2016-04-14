package ca.gc.asc_csa.apogy.core.environment.tests;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeStars() <em>Create And Initialize Stars</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite() <em>Create And Initialize Default CSA Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeSkyNode(ca.gc.asc_csa.apogy.core.environment.Sky, ca.gc.asc_csa.apogy.core.environment.SkyNode) <em>Initialize Sky Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.EarthSky, ca.gc.asc_csa.apogy.core.environment.EarthSkyNode) <em>Initialize Earth Sky Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardGeographicalCoordinates() <em>Get Mars Yard Geographical Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double) <em>Create Star</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardTransformNode() <em>Get Mars Yard Transform Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment() <em>Create And Initialize Earth Surface Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthAtmosphere() <em>Create And Initialize Earth Atmosphere</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Sun Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Sun Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, java.lang.String, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createEImage(java.util.List) <em>Create EImage</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.RectangularRegion) <em>Get Absolute Rectangular Region Corners</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List) <em>Get Best Resolution Rectangular Region Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion) <em>Fits Inside</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Intersects</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List) <em>Get Image Map Layer Presentation Image</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List) <em>Get Best Resolution Map Layer</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List) <em>Get Visible Image Map Layer Presentation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Get Rectangular Volume Region</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ApogyCoreEnvironmentFacadeTest extends TestCase {

	/**
	 * The fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentFacade fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ApogyCoreEnvironmentFacadeTest.class);
	}

	/**
	 * Constructs a new Facade test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentFacadeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ApogyCoreEnvironmentFacade fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Facade test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentFacade getFixture() {
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createApogyCoreEnvironmentFacade());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeStars() <em>Create And Initialize Stars</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeStars()
	 * @generated
	 */
	public void testCreateAndInitializeStars() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite() <em>Create And Initialize Default CSA Worksite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeDefaultCSAWorksite()
	 * @generated
	 */
	public void testCreateAndInitializeDefaultCSAWorksite() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeSkyNode(ca.gc.asc_csa.apogy.core.environment.Sky, ca.gc.asc_csa.apogy.core.environment.SkyNode) <em>Initialize Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeSkyNode(ca.gc.asc_csa.apogy.core.environment.Sky, ca.gc.asc_csa.apogy.core.environment.SkyNode)
	 * @generated
	 */
	public void testInitializeSkyNode__Sky_SkyNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.EarthSky, ca.gc.asc_csa.apogy.core.environment.EarthSkyNode) <em>Initialize Earth Sky Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#initializeEarthSkyNode(ca.gc.asc_csa.apogy.core.environment.EarthSky, ca.gc.asc_csa.apogy.core.environment.EarthSkyNode)
	 * @generated
	 */
	public void testInitializeEarthSkyNode__EarthSky_EarthSkyNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardGeographicalCoordinates() <em>Get Mars Yard Geographical Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardGeographicalCoordinates()
	 * @generated
	 */
	public void testGetMarsYardGeographicalCoordinates() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double) <em>Create Star</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createStar(float, double, double)
	 * @generated
	 */
	public void testCreateStar__float_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardTransformNode() <em>Get Mars Yard Transform Node</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMarsYardTransformNode()
	 * @generated
	 */
	public void testGetMarsYardTransformNode() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment() <em>Create And Initialize Earth Surface Environment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthSurfaceEnvironment()
	 * @generated
	 */
	public void testCreateAndInitializeEarthSurfaceEnvironment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthAtmosphere() <em>Create And Initialize Earth Atmosphere</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createAndInitializeEarthAtmosphere()
	 * @generated
	 */
	public void testCreateAndInitializeEarthAtmosphere() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Sun Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetSunVector__ApogySystem_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Sun Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getSunVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetSunVector__Node_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetMoonVector__ApogySystem_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Moon Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getMoonVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetMoonVector__Node_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__Node_ApogySystem_ConnectionPoint_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, ca.gc.asc_csa.apogy.core.ConnectionPoint, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__ApogySystem_String_ApogySystem_ConnectionPoint_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__ApogySystem_String_ApogySystem_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, java.lang.String, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment) <em>Get Vector</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVector(ca.gc.asc_csa.apogy.core.ApogySystem, java.lang.String, java.lang.String, java.lang.String, ca.gc.asc_csa.apogy.core.invocator.Environment)
	 * @generated
	 */
	public void testGetVector__ApogySystem_String_String_String_Environment() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createEImage(java.util.List) <em>Create EImage</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#createEImage(java.util.List)
	 * @generated
	 */
	public void testCreateEImage__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.RectangularRegion) <em>Get Absolute Rectangular Region Corners</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getAbsoluteRectangularRegionCorners(ca.gc.asc_csa.apogy.core.environment.RectangularRegion)
	 * @generated
	 */
	public void testGetAbsoluteRectangularRegionCorners__RectangularRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List) <em>Get Best Resolution Rectangular Region Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionRectangularRegionImage(java.util.List)
	 * @generated
	 */
	public void testGetBestResolutionRectangularRegionImage__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionExtent__List_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Rectangular Region Image Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularRegionImageExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetRectangularRegionImageExtent__List_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion) <em>Fits Inside</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#fitsInside(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion)
	 * @generated
	 */
	public void testFitsInside__RectangularRegion_RectangularRegion() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4) <em>Intersects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#intersects(ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.core.environment.RectangularRegion, ca.gc.asc_csa.apogy.common.math.Matrix4x4)
	 * @generated
	 */
	public void testIntersects__RectangularRegion_RectangularRegion_Matrix4x4() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Get Image Map Layer Presentation Extent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationExtent(java.util.List, ca.gc.asc_csa.apogy.common.math.Tuple3d, ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated
	 */
	public void testGetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List) <em>Get Image Map Layer Presentation Image</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getImageMapLayerPresentationImage(java.util.List)
	 * @generated
	 */
	public void testGetImageMapLayerPresentationImage__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List) <em>Get Best Resolution Map Layer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getBestResolutionMapLayer(java.util.List)
	 * @generated
	 */
	public void testGetBestResolutionMapLayer__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List) <em>Get Visible Image Map Layer Presentation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getVisibleImageMapLayerPresentation(java.util.List)
	 * @generated
	 */
	public void testGetVisibleImageMapLayerPresentation__List() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh) <em>Get Rectangular Volume Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade#getRectangularVolumeRegion(ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh)
	 * @generated
	 */
	public void testGetRectangularVolumeRegion__CartesianTriangularMesh() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ApogyCoreEnvironmentFacadeTest
