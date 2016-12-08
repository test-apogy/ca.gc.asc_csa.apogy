/**
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
package ca.gc.asc_csa.apogy.core.environment.earth.surface.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.ApogyEarthSurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.earth.surface.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.Map;
import ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyEarthSurfaceEnvironmentFacadeImpl extends MinimalEObjectImpl.Container implements ApogyEarthSurfaceEnvironmentFacade 
{
	private static ApogyEarthSurfaceEnvironmentFacade instance = null;
	
	public static ApogyEarthSurfaceEnvironmentFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyEarthSurfaceEnvironmentFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyEarthSurfaceEnvironmentFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyEarthSurfaceEnvironmentPackage.Literals.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EarthSurfaceWorksite createAndInitializeDefaultCSAWorksite() 
	{
		Date now = new Date();
		
		// Initialise the worksite.
		EarthSurfaceWorksite worksite = ApogyEarthSurfaceEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();
		worksite.setName("CSA AT");
		worksite.setDescription("The CSA Default Worksite.");
		
		// Sets the coordinates.
		worksite.setGeographicalCoordinates(getMarsYardGeographicalCoordinates());
		worksite.setXAxisAzimuth(Math.toRadians(179.4));
		
		// Creates and initialise the Earth Sky.
		EarthSky earthSky = ApogyEarthSurfaceEnvironmentFactory.eINSTANCE.createEarthSky();
		worksite.setSky(earthSky);
		
		// Create and initialise the EarthSkyNode.
		EarthSkyNode earthSkyNode = ApogyEarthSurfaceEnvironmentFactory.eINSTANCE.createEarthSkyNode();		
		initializeEarthSkyNode(earthSky, earthSkyNode);
		
		// Attaches the sky to the worksite.
		// worksite.setEarthSky(earthSky);
				
		// Sets time stamp.		
		worksite.getEarthSky().setTime(now);	
		
		// Attaches a Map
		Map map = getDefaultMarsTerrainMap();
		worksite.getMapsList().getMaps().add(map);			
		
		return worksite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void initializeEarthSkyNode(EarthSky earthSky, EarthSkyNode earthSkyNode) 
	{
	  	// Initialize the Sun and Stars.
		ApogyCoreEnvironmentFacade.INSTANCE.initializeSkyNode(earthSky, earthSkyNode);						
		
	  	Date now = new Date();
		if(earthSky.getTime() != null)
		{
			now = earthSky.getTime();
		}
		
		// Gets the Geographic Coordinates of the Worksite
		EarthSurfaceWorksite worksite =  (EarthSurfaceWorksite) earthSky.getWorksite();
		GeographicCoordinates coord = worksite.getGeographicalCoordinates();
		
		// Creates the Moon.
		Moon moon = ApogyCoreEnvironmentFactory.eINSTANCE.createMoon();
		moon.setDescription("The Moon.");
		moon.setNodeId("MOON");
		
		// Creates the Moon transform that attaches it to the sky.		
		HorizontalCoordinates moonHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(now, coord.getLongitude(), coord.getLatitude());		
		
		Point3d moonPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(moonHorizontalCoordinates);
		TransformNode moonTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(moonPosition.x, moonPosition.y, moonPosition.z, 0, 0, 0);
		moonTransformNode.setDescription("Transform attaching the Moon to the Sky.");	
		moonTransformNode.setNodeId("MOON_TRANSFORM");
		
		// Attaches the Moon to the sky.
		earthSky.getSkyNode().getChildren().add(moonTransformNode);				
		moonTransformNode.setParent(earthSky.getSkyNode()); // Should not have to this this explicitly.
		
		moonTransformNode.getChildren().add(moon);	
		
		earthSky.getSkyNode().setDescription("Earth's Sky.");
		earthSky.getSkyNode().setNodeId("SKY");
		
		earthSky.setTime(now);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public GeographicCoordinates getMarsYardGeographicalCoordinates() 
	{
		GeographicCoordinates coordinates = ApogyEarthEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		
		coordinates.setElevation(30.0);
		coordinates.setLongitude(Math.toRadians(-73.393904468182));
		coordinates.setLatitude(Math.toRadians(45.518206644445));
		
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TransformNode getMarsYardTransformNode() 
	{
		// Creates the default Mars Yard transform.
		TransformNode marsYardTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
		marsYardTransformNode.setDescription("Mars Yard Transform that orients the terrain coordinate system to north.");
		
		return marsYardTransformNode;
	}

	
	private Map getDefaultMarsTerrainMap()
	{
		Map map = ApogySurfaceEnvironmentFactory.eINSTANCE.createMap();
		map.setName("MarsYard");
		map.setDescription("Simple Mars Yard Map.");
		
		// Creates a matrix
		Matrix4d matrix = getMarsYardTransformNode().asMatrix4d();		
		map.setTransformation(ApogyCommonMathFacade.INSTANCE.createMatrix4x4(matrix));		
		
		// Creates a MeshMapLayer.
		
		CartesianTriangularMeshURLMapLayer meshLayer = ApogySurfaceEnvironmentFactory.eINSTANCE.createCartesianTriangularMeshURLMapLayer();
		meshLayer.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.examples.worksites.surface/data/CSAAnalogTerrainDEM100cm.tri");
		meshLayer.setName("MarsYardDEM 1.0 meters resolution");
		meshLayer.setDescription("MarsYard DEM at 1.0 meters resolution");
		
		map.getLayers().add(meshLayer);		
	
		// Create Aerial Image map.
		URLImageMapLayer imageLayer = ApogySurfaceEnvironmentFactory.eINSTANCE.createURLImageMapLayer();
		imageLayer.setUrl("platform:/plugin/ca.gc.asc_csa.apogy.examples.worksites.surface/data/CSA-AT-NGC-MET-seen-from-sky.jpg");
		imageLayer.setName("Mars Yard Aerial Image.");
		imageLayer.setDescription("Mars Yard seen from above.");
		imageLayer.setWidth(60.0);
		imageLayer.setHeight(120.0);
		
		map.getLayers().add(imageLayer);	
		
		// Creates the default Feature Of Interest List.
		FeaturesOfInterestMapLayer foiLayer = ApogySurfaceEnvironmentFactory.eINSTANCE.createFeaturesOfInterestMapLayer();
		foiLayer.setFeatures(ApogyCoreFactory.eINSTANCE.createFeatureOfInterestList());
		foiLayer.setName("CSA AT Features");
		foiLayer.setDescription("CSA AT Features Of Interest.");
		String foiURL = "platform:/plugin/ca.gc.asc_csa.apogy.examples.worksites.surface/data/CSA-AT-FOI.csv";
		
		try
		{
			List<FeatureOfInterest> features = ApogyCoreFacade.INSTANCE.loadFeatureOfInterestFromFile(foiURL);
			foiLayer.getFeatures().getFeaturesOfInterest().addAll(features);
		}
		catch(Throwable t)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to load Feature Of Interest from <" + foiURL + ">!", EventSeverity.ERROR);
		}
		
		map.getLayers().add(foiLayer);	
		
		return map;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE:
				return createAndInitializeDefaultCSAWorksite();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE:
				initializeEarthSkyNode((EarthSky)arguments.get(0), (EarthSkyNode)arguments.get(1));
				return null;
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES:
				return getMarsYardGeographicalCoordinates();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE:
				return getMarsYardTransformNode();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyEarthSurfaceEnvironmentFacadeImpl
