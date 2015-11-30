/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import gov.nasa.worldwind.layers.RenderableLayer;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;
import org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthSurfaceLocationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfiguration;
import org.eclipse.symphony.core.environment.orbit.earth.ui.EarthViewConfigurationList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.GroundStationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList;
import org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIFactory;
import org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreEnvironmentOrbitEarthUIPackageImpl extends EPackageImpl implements Symphony__CoreEnvironmentOrbitEarthUIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthViewConfigurationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthViewConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractWorldWindLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftLocationWorldWindLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orbitModelWorldWindLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftSwathWorldWindLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthSurfaceLocationWorldWindLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groundStationWorldWindLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftVisibilityPassViewConfigurationListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spacecraftVisibilityPassViewConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType renderableLayerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.Symphony__CoreEnvironmentOrbitEarthUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CoreEnvironmentOrbitEarthUIPackageImpl() {
		super(eNS_URI, Symphony__CoreEnvironmentOrbitEarthUIFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__CoreEnvironmentOrbitEarthUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CoreEnvironmentOrbitEarthUIPackage init() {
		if (isInited) return (Symphony__CoreEnvironmentOrbitEarthUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentOrbitEarthUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreEnvironmentOrbitEarthUIPackageImpl theSymphony__CoreEnvironmentOrbitEarthUIPackage = (Symphony__CoreEnvironmentOrbitEarthUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreEnvironmentOrbitEarthUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreEnvironmentOrbitEarthUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CoreEnvironmentOrbitEarthPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreEnvironmentOrbitEarthUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreEnvironmentOrbitEarthUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreEnvironmentOrbitEarthUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreEnvironmentOrbitEarthUIPackage.eNS_URI, theSymphony__CoreEnvironmentOrbitEarthUIPackage);
		return theSymphony__CoreEnvironmentOrbitEarthUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthViewConfigurationList() {
		return earthViewConfigurationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthViewConfigurationList_EarthViewConfigurations() {
		return (EReference)earthViewConfigurationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthViewConfiguration() {
		return earthViewConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthViewConfiguration_Layers() {
		return (EReference)earthViewConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractWorldWindLayer() {
		return abstractWorldWindLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractWorldWindLayer_Visible() {
		return (EAttribute)abstractWorldWindLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractWorldWindLayer_RenderableLayer() {
		return (EAttribute)abstractWorldWindLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractWorldWindLayer__Dispose() {
		return abstractWorldWindLayerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftLocationWorldWindLayer() {
		return spacecraftLocationWorldWindLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftLocationWorldWindLayer_OrbitModel() {
		return (EReference)spacecraftLocationWorldWindLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftLocationWorldWindLayer_TimeSource() {
		return (EReference)spacecraftLocationWorldWindLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftLocationWorldWindLayer_ShowGroundProjection() {
		return (EAttribute)spacecraftLocationWorldWindLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftLocationWorldWindLayer_ShowLatLon() {
		return (EAttribute)spacecraftLocationWorldWindLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrbitModelWorldWindLayer() {
		return orbitModelWorldWindLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitModelWorldWindLayer_OrbitModel() {
		return (EReference)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrbitModelWorldWindLayer_TimeSource() {
		return (EReference)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitModelWorldWindLayer_TimeInterval() {
		return (EAttribute)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitModelWorldWindLayer_ForwardPropagationDuration() {
		return (EAttribute)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitModelWorldWindLayer_BackwardPropagationDuration() {
		return (EAttribute)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitModelWorldWindLayer_ShowGroundTrace() {
		return (EAttribute)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrbitModelWorldWindLayer_ShowOrbit() {
		return (EAttribute)orbitModelWorldWindLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftSwathWorldWindLayer() {
		return spacecraftSwathWorldWindLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftSwathWorldWindLayer_OrbitModel() {
		return (EReference)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftSwathWorldWindLayer_TimeSource() {
		return (EReference)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathWorldWindLayer_ForwardPropagationDuration() {
		return (EAttribute)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathWorldWindLayer_BackwardPropagationDuration() {
		return (EAttribute)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathWorldWindLayer_TimeInterval() {
		return (EAttribute)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathWorldWindLayer_LeftSwathAngle() {
		return (EAttribute)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathWorldWindLayer_RightSwathAngle() {
		return (EAttribute)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpacecraftSwathWorldWindLayer_ShowGroundTrace() {
		return (EAttribute)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftSwathWorldWindLayer_ForwardSpacecraftSwathCorridor() {
		return (EReference)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftSwathWorldWindLayer_BackwardSpacecraftSwathCorridor() {
		return (EReference)spacecraftSwathWorldWindLayerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarthSurfaceLocationWorldWindLayer() {
		return earthSurfaceLocationWorldWindLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEarthSurfaceLocationWorldWindLayer_EarthSurfaceLocation() {
		return (EReference)earthSurfaceLocationWorldWindLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEarthSurfaceLocationWorldWindLayer_TargetRadius() {
		return (EAttribute)earthSurfaceLocationWorldWindLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroundStationWorldWindLayer() {
		return groundStationWorldWindLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroundStationWorldWindLayer_GroundStation() {
		return (EReference)groundStationWorldWindLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroundStationWorldWindLayer_ReferenceAltitude() {
		return (EAttribute)groundStationWorldWindLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftVisibilityPassViewConfigurationList() {
		return spacecraftVisibilityPassViewConfigurationListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftVisibilityPassViewConfigurationList_Configurations() {
		return (EReference)spacecraftVisibilityPassViewConfigurationListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpacecraftVisibilityPassViewConfiguration() {
		return spacecraftVisibilityPassViewConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList() {
		return (EReference)spacecraftVisibilityPassViewConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpacecraftVisibilityPassViewConfiguration_VisibilitySet() {
		return (EReference)spacecraftVisibilityPassViewConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRenderableLayer() {
		return renderableLayerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentOrbitEarthUIFactory getSymphony__CoreEnvironmentOrbitEarthUIFactory() {
		return (Symphony__CoreEnvironmentOrbitEarthUIFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		earthViewConfigurationListEClass = createEClass(EARTH_VIEW_CONFIGURATION_LIST);
		createEReference(earthViewConfigurationListEClass, EARTH_VIEW_CONFIGURATION_LIST__EARTH_VIEW_CONFIGURATIONS);

		earthViewConfigurationEClass = createEClass(EARTH_VIEW_CONFIGURATION);
		createEReference(earthViewConfigurationEClass, EARTH_VIEW_CONFIGURATION__LAYERS);

		abstractWorldWindLayerEClass = createEClass(ABSTRACT_WORLD_WIND_LAYER);
		createEAttribute(abstractWorldWindLayerEClass, ABSTRACT_WORLD_WIND_LAYER__VISIBLE);
		createEAttribute(abstractWorldWindLayerEClass, ABSTRACT_WORLD_WIND_LAYER__RENDERABLE_LAYER);
		createEOperation(abstractWorldWindLayerEClass, ABSTRACT_WORLD_WIND_LAYER___DISPOSE);

		spacecraftLocationWorldWindLayerEClass = createEClass(SPACECRAFT_LOCATION_WORLD_WIND_LAYER);
		createEReference(spacecraftLocationWorldWindLayerEClass, SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL);
		createEReference(spacecraftLocationWorldWindLayerEClass, SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE);
		createEAttribute(spacecraftLocationWorldWindLayerEClass, SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION);
		createEAttribute(spacecraftLocationWorldWindLayerEClass, SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON);

		orbitModelWorldWindLayerEClass = createEClass(ORBIT_MODEL_WORLD_WIND_LAYER);
		createEReference(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__ORBIT_MODEL);
		createEReference(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__TIME_SOURCE);
		createEAttribute(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__TIME_INTERVAL);
		createEAttribute(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION);
		createEAttribute(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION);
		createEAttribute(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_GROUND_TRACE);
		createEAttribute(orbitModelWorldWindLayerEClass, ORBIT_MODEL_WORLD_WIND_LAYER__SHOW_ORBIT);

		spacecraftSwathWorldWindLayerEClass = createEClass(SPACECRAFT_SWATH_WORLD_WIND_LAYER);
		createEReference(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__ORBIT_MODEL);
		createEReference(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_SOURCE);
		createEAttribute(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_PROPAGATION_DURATION);
		createEAttribute(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_PROPAGATION_DURATION);
		createEAttribute(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__TIME_INTERVAL);
		createEAttribute(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__LEFT_SWATH_ANGLE);
		createEAttribute(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__RIGHT_SWATH_ANGLE);
		createEAttribute(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__SHOW_GROUND_TRACE);
		createEReference(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__FORWARD_SPACECRAFT_SWATH_CORRIDOR);
		createEReference(spacecraftSwathWorldWindLayerEClass, SPACECRAFT_SWATH_WORLD_WIND_LAYER__BACKWARD_SPACECRAFT_SWATH_CORRIDOR);

		earthSurfaceLocationWorldWindLayerEClass = createEClass(EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER);
		createEReference(earthSurfaceLocationWorldWindLayerEClass, EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__EARTH_SURFACE_LOCATION);
		createEAttribute(earthSurfaceLocationWorldWindLayerEClass, EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER__TARGET_RADIUS);

		groundStationWorldWindLayerEClass = createEClass(GROUND_STATION_WORLD_WIND_LAYER);
		createEReference(groundStationWorldWindLayerEClass, GROUND_STATION_WORLD_WIND_LAYER__GROUND_STATION);
		createEAttribute(groundStationWorldWindLayerEClass, GROUND_STATION_WORLD_WIND_LAYER__REFERENCE_ALTITUDE);

		spacecraftVisibilityPassViewConfigurationListEClass = createEClass(SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST);
		createEReference(spacecraftVisibilityPassViewConfigurationListEClass, SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST__CONFIGURATIONS);

		spacecraftVisibilityPassViewConfigurationEClass = createEClass(SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION);
		createEReference(spacecraftVisibilityPassViewConfigurationEClass, SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__CONFIGURATIONS_LIST);
		createEReference(spacecraftVisibilityPassViewConfigurationEClass, SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION__VISIBILITY_SET);

		// Create data types
		renderableLayerEDataType = createEDataType(RENDERABLE_LAYER);
		mapEDataType = createEDataType(MAP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__CoreEnvironmentOrbitPackage theSymphony__CoreEnvironmentOrbitPackage = (Symphony__CoreEnvironmentOrbitPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentOrbitPackage.eNS_URI);
		Symphony__CoreEnvironmentOrbitEarthPackage theSymphony__CoreEnvironmentOrbitEarthPackage = (Symphony__CoreEnvironmentOrbitEarthPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentOrbitEarthPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes
		earthViewConfigurationListEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getAbstractToolsListContainer());
		earthViewConfigurationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		earthViewConfigurationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		abstractWorldWindLayerEClass.getESuperTypes().add(theSymphony__CorePackage.getUpdatable());
		spacecraftLocationWorldWindLayerEClass.getESuperTypes().add(this.getAbstractWorldWindLayer());
		spacecraftLocationWorldWindLayerEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		orbitModelWorldWindLayerEClass.getESuperTypes().add(this.getAbstractWorldWindLayer());
		spacecraftSwathWorldWindLayerEClass.getESuperTypes().add(this.getAbstractWorldWindLayer());
		earthSurfaceLocationWorldWindLayerEClass.getESuperTypes().add(this.getAbstractWorldWindLayer());
		groundStationWorldWindLayerEClass.getESuperTypes().add(this.getEarthSurfaceLocationWorldWindLayer());
		spacecraftVisibilityPassViewConfigurationListEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getAbstractToolsListContainer());
		spacecraftVisibilityPassViewConfigurationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		spacecraftVisibilityPassViewConfigurationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());

		// Initialize classes, features, and operations; add parameters
		initEClass(earthViewConfigurationListEClass, EarthViewConfigurationList.class, "EarthViewConfigurationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthViewConfigurationList_EarthViewConfigurations(), this.getEarthViewConfiguration(), null, "earthViewConfigurations", null, 0, -1, EarthViewConfigurationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthViewConfigurationEClass, EarthViewConfiguration.class, "EarthViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthViewConfiguration_Layers(), this.getAbstractWorldWindLayer(), null, "layers", null, 0, -1, EarthViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractWorldWindLayerEClass, AbstractWorldWindLayer.class, "AbstractWorldWindLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractWorldWindLayer_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, AbstractWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractWorldWindLayer_RenderableLayer(), this.getRenderableLayer(), "renderableLayer", null, 0, 1, AbstractWorldWindLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractWorldWindLayer__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(spacecraftLocationWorldWindLayerEClass, SpacecraftLocationWorldWindLayer.class, "SpacecraftLocationWorldWindLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraftLocationWorldWindLayer_OrbitModel(), theSymphony__CoreEnvironmentOrbitPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, SpacecraftLocationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftLocationWorldWindLayer_TimeSource(), theSymphony__CommonEMFPackage.getTimed(), null, "timeSource", null, 0, 1, SpacecraftLocationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftLocationWorldWindLayer_ShowGroundProjection(), theEcorePackage.getEBoolean(), "showGroundProjection", "true", 0, 1, SpacecraftLocationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftLocationWorldWindLayer_ShowLatLon(), theEcorePackage.getEBoolean(), "showLatLon", "true", 0, 1, SpacecraftLocationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orbitModelWorldWindLayerEClass, OrbitModelWorldWindLayer.class, "OrbitModelWorldWindLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrbitModelWorldWindLayer_OrbitModel(), theSymphony__CoreEnvironmentOrbitPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrbitModelWorldWindLayer_TimeSource(), theSymphony__CommonEMFPackage.getTimed(), null, "timeSource", null, 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitModelWorldWindLayer_TimeInterval(), theEcorePackage.getEDouble(), "timeInterval", "600.0", 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitModelWorldWindLayer_ForwardPropagationDuration(), theEcorePackage.getEDouble(), "forwardPropagationDuration", "43200.0", 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitModelWorldWindLayer_BackwardPropagationDuration(), theEcorePackage.getEDouble(), "backwardPropagationDuration", "43200.0", 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitModelWorldWindLayer_ShowGroundTrace(), theEcorePackage.getEBoolean(), "showGroundTrace", "true", 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrbitModelWorldWindLayer_ShowOrbit(), theEcorePackage.getEBoolean(), "showOrbit", "true", 0, 1, OrbitModelWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftSwathWorldWindLayerEClass, SpacecraftSwathWorldWindLayer.class, "SpacecraftSwathWorldWindLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraftSwathWorldWindLayer_OrbitModel(), theSymphony__CoreEnvironmentOrbitPackage.getOrbitModel(), null, "orbitModel", null, 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathWorldWindLayer_TimeSource(), theSymphony__CommonEMFPackage.getTimed(), null, "timeSource", null, 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathWorldWindLayer_ForwardPropagationDuration(), theEcorePackage.getEDouble(), "forwardPropagationDuration", "43200.0", 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathWorldWindLayer_BackwardPropagationDuration(), theEcorePackage.getEDouble(), "backwardPropagationDuration", "43200.0", 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathWorldWindLayer_TimeInterval(), theEcorePackage.getEDouble(), "timeInterval", "600.0", 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathWorldWindLayer_LeftSwathAngle(), theEcorePackage.getEDouble(), "leftSwathAngle", "0", 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathWorldWindLayer_RightSwathAngle(), theEcorePackage.getEDouble(), "rightSwathAngle", "0", 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpacecraftSwathWorldWindLayer_ShowGroundTrace(), theEcorePackage.getEBoolean(), "showGroundTrace", "true", 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathWorldWindLayer_ForwardSpacecraftSwathCorridor(), theSymphony__CoreEnvironmentOrbitEarthPackage.getSpacecraftSwathCorridor(), null, "forwardSpacecraftSwathCorridor", null, 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftSwathWorldWindLayer_BackwardSpacecraftSwathCorridor(), theSymphony__CoreEnvironmentOrbitEarthPackage.getSpacecraftSwathCorridor(), null, "backwardSpacecraftSwathCorridor", null, 0, 1, SpacecraftSwathWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSurfaceLocationWorldWindLayerEClass, EarthSurfaceLocationWorldWindLayer.class, "EarthSurfaceLocationWorldWindLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceLocationWorldWindLayer_EarthSurfaceLocation(), theSymphony__CoreEnvironmentOrbitEarthPackage.getEarthSurfaceLocation(), null, "earthSurfaceLocation", null, 0, 1, EarthSurfaceLocationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceLocationWorldWindLayer_TargetRadius(), theEcorePackage.getEDouble(), "targetRadius", "50", 0, 1, EarthSurfaceLocationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groundStationWorldWindLayerEClass, GroundStationWorldWindLayer.class, "GroundStationWorldWindLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroundStationWorldWindLayer_GroundStation(), theSymphony__CoreEnvironmentOrbitEarthPackage.getGroundStation(), null, "groundStation", null, 0, 1, GroundStationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroundStationWorldWindLayer_ReferenceAltitude(), theEcorePackage.getEDouble(), "referenceAltitude", "500", 0, 1, GroundStationWorldWindLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftVisibilityPassViewConfigurationListEClass, SpacecraftVisibilityPassViewConfigurationList.class, "SpacecraftVisibilityPassViewConfigurationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraftVisibilityPassViewConfigurationList_Configurations(), this.getSpacecraftVisibilityPassViewConfiguration(), this.getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList(), "configurations", null, 0, -1, SpacecraftVisibilityPassViewConfigurationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spacecraftVisibilityPassViewConfigurationEClass, SpacecraftVisibilityPassViewConfiguration.class, "SpacecraftVisibilityPassViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList(), this.getSpacecraftVisibilityPassViewConfigurationList(), this.getSpacecraftVisibilityPassViewConfigurationList_Configurations(), "configurationsList", null, 0, 1, SpacecraftVisibilityPassViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpacecraftVisibilityPassViewConfiguration_VisibilitySet(), theSymphony__CoreEnvironmentOrbitEarthPackage.getSpacecraftsVisibilitySet(), null, "visibilitySet", null, 0, 1, SpacecraftVisibilityPassViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(renderableLayerEDataType, RenderableLayer.class, "RenderableLayer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "Symphony__CoreEnvironmentOrbitEarthUI",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "Symphony__CoreEnvironmentOrbitEarthUI",
			 "complianceLevel", "8.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.core.environment.orbit.earth.ui/src-generated",
			 "editDirectory", "/org.eclipse.symphony.core.environment.orbit.earth.ui.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.core.environment.orbit.earth"
		   });	
		addAnnotation
		  (getEarthViewConfiguration_Layers(), 
		   source, 
		   new String[] {
			 "documentation", "* List of Maps being displayed.",
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (abstractWorldWindLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a Layer that can be shown on the WordWindModel"
		   });	
		addAnnotation
		  (getAbstractWorldWindLayer__Dispose(), 
		   source, 
		   new String[] {
			 "documentation", "*\nMethod called when the layer is not longer\nneeded (i.e. when it gets deleted.)"
		   });	
		addAnnotation
		  (getAbstractWorldWindLayer_Visible(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to display the layer.",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getAbstractWorldWindLayer_RenderableLayer(), 
		   source, 
		   new String[] {
			 "documentation", "The RenderableLayer associated with this Layer",
			 "children", "false",
			 "notify", "false",
			 "property", "None"
		   });	
		addAnnotation
		  (getSpacecraftLocationWorldWindLayer_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The orbit model.",
			 "propertyCategory", "ORBIT_MODEL"
		   });	
		addAnnotation
		  (getSpacecraftLocationWorldWindLayer_TimeSource(), 
		   source, 
		   new String[] {
			 "documentation", "The time source to used to get the time\nused to compute the S/C position.",
			 "propertyCategory", "TIME"
		   });	
		addAnnotation
		  (getSpacecraftLocationWorldWindLayer_ShowGroundProjection(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to display the position\nprojected on the ground.",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getSpacecraftLocationWorldWindLayer_ShowLatLon(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to the longitude and\nlatitude of the spacecraft.",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The orbit model.",
			 "propertyCategory", "ORBIT_MODEL"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_TimeSource(), 
		   source, 
		   new String[] {
			 "documentation", "The time source to used to get the time\nused to define the reference time.",
			 "propertyCategory", "TIME"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_TimeInterval(), 
		   source, 
		   new String[] {
			 "documentation", "The time interval at which to show\nthe position.",
			 "propertyCategory", "TIME_PERIOD",
			 "csa_units", "s"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_ForwardPropagationDuration(), 
		   source, 
		   new String[] {
			 "documentation", "The forward propagation duration\nfrom the current time.",
			 "propertyCategory", "TIME_PERIOD",
			 "csa_units", "s"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_BackwardPropagationDuration(), 
		   source, 
		   new String[] {
			 "documentation", "The backward propagation duration\nfrom the current time.",
			 "propertyCategory", "TIME_PERIOD",
			 "csa_units", "s"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_ShowGroundTrace(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to display the orbit\nprojected on the ground.",
			 "propertyCategory", "VISUALS",
			 "notify", "true",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getOrbitModelWorldWindLayer_ShowOrbit(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to display the orbit.",
			 "notify", "true",
			 "propertyCategory", "VISUALS",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_OrbitModel(), 
		   source, 
		   new String[] {
			 "documentation", "The orbit model.",
			 "propertyCategory", "ORBIT_MODEL"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_TimeSource(), 
		   source, 
		   new String[] {
			 "documentation", "The time source to used to get the time\nused to define the reference time.",
			 "propertyCategory", "TIME"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_ForwardPropagationDuration(), 
		   source, 
		   new String[] {
			 "documentation", "The forward propagation duration from\nthe current time.",
			 "propertyCategory", "TIME_PERIOD",
			 "csa_units", "s"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_BackwardPropagationDuration(), 
		   source, 
		   new String[] {
			 "documentation", "The backward propagation duration from\nthe current time.",
			 "propertyCategory", "TIME_PERIOD",
			 "csa_units", "s"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_TimeInterval(), 
		   source, 
		   new String[] {
			 "documentation", "The time interval at which to show\nthe position.",
			 "notify", "true",
			 "propertyCategory", "TIME_PERIOD",
			 "property", "Editable",
			 "csa_units", "s"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_LeftSwathAngle(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "SWATH",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_RightSwathAngle(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "property", "Editable",
			 "propertyCategory", "SWATH",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSpacecraftSwathWorldWindLayer_ShowGroundTrace(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not to display the orbit\nprojected on the ground.",
			 "notify", "true",
			 "propertyCategory", "VISUALS",
			 "property", "Editable"
		   });	
		addAnnotation
		  (getEarthSurfaceLocationWorldWindLayer_TargetRadius(), 
		   source, 
		   new String[] {
			 "documentation", "The radius of the target.",
			 "propertyCategory", "VISUALS",
			 "csa_units", "km"
		   });	
		addAnnotation
		  (getGroundStationWorldWindLayer_ReferenceAltitude(), 
		   source, 
		   new String[] {
			 "documentation", "The altitude to which to project\nthe ElevationMask.",
			 "propertyCategory", "VISUALS",
			 "csa_units", "km"
		   });	
		addAnnotation
		  (spacecraftVisibilityPassViewConfigurationListEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a list of configuration for the view that\nshows the visibility of spacecraft from ground stations."
		   });	
		addAnnotation
		  (spacecraftVisibilityPassViewConfigurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Defines the configuration for the view that shows the\nvisibility of spacecraft from ground stations."
		   });	
		addAnnotation
		  (getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getSpacecraftVisibilityPassViewConfiguration_VisibilitySet(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "chilrend", "true",
			 "property", "None"
		   });
	}

} //Symphony__CoreEnvironmentOrbitEarthUIPackageImpl
