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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.ApogyCoreFactory;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.environment.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.earth.ApogyEarthFacade;
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
import ca.gc.asc_csa.apogy.core.environment.surface.MapsList;
import ca.gc.asc_csa.apogy.core.environment.surface.URLImageMapLayer;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl#getActiveEarthSurfaceWorksite <em>Active Earth Surface Worksite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.earth.surface.impl.ApogyEarthSurfaceEnvironmentFacadeImpl#getActiveMoon <em>Active Moon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyEarthSurfaceEnvironmentFacadeImpl extends MinimalEObjectImpl.Container implements ApogyEarthSurfaceEnvironmentFacade 
{
	/**
	 * The cached value of the '{@link #getActiveEarthSurfaceWorksite() <em>Active Earth Surface Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveEarthSurfaceWorksite()
	 * @generated
	 * @ordered
	 */
	protected EarthSurfaceWorksite activeEarthSurfaceWorksite;
	/**
	 * The cached value of the '{@link #getActiveMoon() <em>Active Moon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveMoon()
	 * @generated
	 * @ordered
	 */
	protected Moon activeMoon;
	
	private Adapter activeWorksiteAdapter = null;
	private Adapter earthSurfaceWorksiteAdapter = null;

	
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
	 * @generated_NOT
	 */
	protected ApogyEarthSurfaceEnvironmentFacadeImpl() 
	{
		super();
		
		// Register to the ApogyCoreEnvironmentFacade for changes in the active worksite.
		ApogyCoreEnvironmentFacade.INSTANCE.eAdapters().add(getWorksiteAdapter());
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
	 * @generated
	 */
	public EarthSurfaceWorksite getActiveEarthSurfaceWorksite() {
		if (activeEarthSurfaceWorksite != null && activeEarthSurfaceWorksite.eIsProxy()) {
			InternalEObject oldActiveEarthSurfaceWorksite = (InternalEObject)activeEarthSurfaceWorksite;
			activeEarthSurfaceWorksite = (EarthSurfaceWorksite)eResolveProxy(oldActiveEarthSurfaceWorksite);
			if (activeEarthSurfaceWorksite != oldActiveEarthSurfaceWorksite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_EARTH_SURFACE_WORKSITE, oldActiveEarthSurfaceWorksite, activeEarthSurfaceWorksite));
			}
		}
		return activeEarthSurfaceWorksite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceWorksite basicGetActiveEarthSurfaceWorksite() {
		return activeEarthSurfaceWorksite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveEarthSurfaceWorksite(EarthSurfaceWorksite newActiveEarthSurfaceWorksite) {
		EarthSurfaceWorksite oldActiveEarthSurfaceWorksite = activeEarthSurfaceWorksite;
		activeEarthSurfaceWorksite = newActiveEarthSurfaceWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_EARTH_SURFACE_WORKSITE, oldActiveEarthSurfaceWorksite, activeEarthSurfaceWorksite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moon getActiveMoon() {
		if (activeMoon != null && activeMoon.eIsProxy()) {
			InternalEObject oldActiveMoon = (InternalEObject)activeMoon;
			activeMoon = (Moon)eResolveProxy(oldActiveMoon);
			if (activeMoon != oldActiveMoon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_MOON, oldActiveMoon, activeMoon));
			}
		}
		return activeMoon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Moon basicGetActiveMoon() {
		return activeMoon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveMoon(Moon newActiveMoon) {
		Moon oldActiveMoon = activeMoon;
		activeMoon = newActiveMoon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_MOON, oldActiveMoon, activeMoon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EarthSky createEarthSky(GeographicCoordinates siteGeographicCoordinates) 
	{
		EarthSky earthSky = ApogyEarthSurfaceEnvironmentFactory.eINSTANCE.createEarthSky();
		earthSky.setTime(new Date());							
		return earthSky;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EarthSkyNode createEarthSkyNode(GeographicCoordinates siteGeographicCoordinates) 
	{
		Date now = new Date();
		
		EarthSkyNode earthSkyNode = ApogyEarthSurfaceEnvironmentFactory.eINSTANCE.createEarthSkyNode();
		
		// Initialize the generic Sky.
		ApogyCoreEnvironmentFacade.INSTANCE.initializeSkyNode(earthSkyNode);
		
		// Initialize EarthSky specifics.
		// Creates the Moon.
		Moon moon = ApogyCoreEnvironmentFactory.eINSTANCE.createMoon();
		moon.setDescription("The Moon.");
		moon.setNodeId(Moon.NODE_ID);
				
		// Creates the Moon transform that attaches it to the sky.
		HorizontalCoordinates moonHorizontalCoordinates = ApogyEarthEnvironmentFactory.eINSTANCE.createHorizontalCoordinates();
		if(siteGeographicCoordinates != null)
		{			
			moonHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(now, siteGeographicCoordinates.getLongitude(), siteGeographicCoordinates.getLatitude());		
		}
		
		Point3d moonPosition = AstronomyUtils.INSTANCE.convertFromHorizontalCoordinatesToHorizontalRectangular(moonHorizontalCoordinates);
		TransformNode moonTransformNode = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(moonPosition.x, moonPosition.y, moonPosition.z, 0, 0, 0);
		moonTransformNode.setDescription("Transform attaching the Moon to the Sky.");	
		moonTransformNode.setNodeId("MOON_TRANSFORM");
		
		// Attaches the Moon to the sky.
		earthSkyNode.getChildren().add(moonTransformNode);						
		moonTransformNode.getChildren().add(moon);	
		
		earthSkyNode.setDescription("Earth's Sky.");
		earthSkyNode.setNodeId("SKY");
				
		return earthSkyNode;
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
				
		// Creates the Earth Sky.
		EarthSky earthSky = createEarthSky(worksite.getGeographicalCoordinates());						
		
		// Sets the worksite sky.
		worksite.setSky(earthSky);	
		earthSky.setWorksite(worksite);

		// Sets time stamp.		
		worksite.getEarthSky().setTime(now);	
		
		// Initialize the map lists.
		MapsList mapList = ApogySurfaceEnvironmentFactory.eINSTANCE.createMapsList();
		worksite.setMapsList(mapList);
		
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
	public GeographicCoordinates getMarsYardGeographicalCoordinates() 
	{
		GeographicCoordinates coordinates = ApogyEarthFacade.INSTANCE.createGeographicCoordinates(Math.toRadians(-73.393904468182), Math.toRadians(45.518206644445), 30.0);
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

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public InvocatorSession createApogySession() 
	{	
		InvocatorSession session = ApogyCoreEnvironmentFacade.INSTANCE.createApogySession(true, true, true, true);
		ApogyEnvironment environment = (ApogyEnvironment) session.getEnvironment();
		
		CurrentTimeSource currentTimeSource = ApogyCommonEMFFactory.eINSTANCE.createCurrentTimeSource();
		environment.getTimeSourcesList().getTimeSources().add(currentTimeSource);
		environment.setActiveTimeSource(currentTimeSource);
		
		EarthSurfaceWorksite worksite = createAndInitializeDefaultCSAWorksite();
		environment.getWorksitesList().getWorksites().add(worksite);
		environment.setActiveWorksite(worksite);
				
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_EARTH_SURFACE_WORKSITE:
				if (resolve) return getActiveEarthSurfaceWorksite();
				return basicGetActiveEarthSurfaceWorksite();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_MOON:
				if (resolve) return getActiveMoon();
				return basicGetActiveMoon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_EARTH_SURFACE_WORKSITE:
				setActiveEarthSurfaceWorksite((EarthSurfaceWorksite)newValue);
				return;
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_MOON:
				setActiveMoon((Moon)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_EARTH_SURFACE_WORKSITE:
				setActiveEarthSurfaceWorksite((EarthSurfaceWorksite)null);
				return;
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_MOON:
				setActiveMoon((Moon)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_EARTH_SURFACE_WORKSITE:
				return activeEarthSurfaceWorksite != null;
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE__ACTIVE_MOON:
				return activeMoon != null;
		}
		return super.eIsSet(featureID);
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
			// DEBUG
			FeatureOfInterest foi = ApogyCoreFactory.eINSTANCE.createFeatureOfInterest();
			foi.setPose(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4());
			foiLayer.getFeatures().getFeaturesOfInterest().add(foi);
			
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
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_EARTH_SKY__GEOGRAPHICCOORDINATES:
				return createEarthSky((GeographicCoordinates)arguments.get(0));
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_EARTH_SKY_NODE__GEOGRAPHICCOORDINATES:
				return createEarthSkyNode((GeographicCoordinates)arguments.get(0));
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE:
				return createAndInitializeDefaultCSAWorksite();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES:
				return getMarsYardGeographicalCoordinates();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE:
				return getMarsYardTransformNode();
			case ApogyEarthSurfaceEnvironmentPackage.APOGY_EARTH_SURFACE_ENVIRONMENT_FACADE___CREATE_APOGY_SESSION:
				return createApogySession();
		}
		return super.eInvoke(operationID, arguments);
	}

	private void updateEarthSurfaceWorksite(AbstractWorksite abstractWorksite)
	{
		// Unregister from previous active EarthSurfaceWorksite if applicable. 
		if(getActiveEarthSurfaceWorksite() != null)
		{
			getActiveEarthSurfaceWorksite().eAdapters().remove(getEarthSurfaceWorksiteAdapter());
		}		
		
		if(abstractWorksite instanceof EarthSurfaceWorksite)
		{
			EarthSurfaceWorksite earthSurfaceWorksite = (EarthSurfaceWorksite) abstractWorksite;
			
			// Register to the new active EarthSurfaceWorksite.
			earthSurfaceWorksite.eAdapters().add(getEarthSurfaceWorksiteAdapter());
			
			// Updates the active EarthSurfaceWorksite.
			setActiveEarthSurfaceWorksite(earthSurfaceWorksite);
			
			// Updates the active moon.
			if(earthSurfaceWorksite.getSky() instanceof EarthSky)
			{
				EarthSky earthSky = (EarthSky) earthSurfaceWorksite.getSky();
				setActiveMoon(earthSky.getMoon());
			}
		}
		else
		{			
			setActiveEarthSurfaceWorksite(null);
			setActiveMoon(null);
		}
	}
	
	/**
	 * Adapter that listens to the active AbstractWorksite and updates the active EarthSurfaceWorksite.
	 * @return The adapter.
	 */
	private Adapter getWorksiteAdapter()
	{
		if(activeWorksiteAdapter == null)
		{
			activeWorksiteAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof ApogyCoreEnvironmentFacade)
					{
						int featureID = msg.getFeatureID(ApogyCoreEnvironmentFacade.class);
						
						switch (featureID) 
						{
							case ApogyCoreEnvironmentPackage.APOGY_CORE_ENVIRONMENT_FACADE__ACTIVE_WORKSITE:
							{								
								updateEarthSurfaceWorksite((AbstractWorksite) msg.getNewValue());
							}
							break;
	
							default:
							break;
						}
					}
				}
			};
		}
		return activeWorksiteAdapter;
	}
	
	/**
	 * Adapter that listens to the active EarthSurfaceWorksite and updates the active Moon.
	 * @return The adapter.
	 */
	private Adapter getEarthSurfaceWorksiteAdapter()
	{
		if(earthSurfaceWorksiteAdapter == null)
		{
			earthSurfaceWorksiteAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof EarthSurfaceWorksite)
					{
						int featureID = msg.getFeatureID(EarthSurfaceWorksite.class);
						
						switch (featureID) 
						{
							case ApogyEarthSurfaceEnvironmentPackage.EARTH_SURFACE_WORKSITE__SKY:
							{								
								if(msg.getNewValue() instanceof EarthSky)
								{
									EarthSky earthSky = (EarthSky) msg.getNewValue();
									setActiveMoon(earthSky.getMoon());
								}
							}
							break;
	
							default:
							break;
						}
					}
				}
			};
		}
		return earthSurfaceWorksiteAdapter;
	}
	
} //ApogyEarthSurfaceEnvironmentFacadeImpl