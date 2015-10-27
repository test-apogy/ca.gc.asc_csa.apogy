/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.impl;

import gov.nasa.worldwind.layers.RenderableLayer;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreEnvironmentOrbitEarthUIFactoryImpl extends EFactoryImpl implements Symphony__CoreEnvironmentOrbitEarthUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Symphony__CoreEnvironmentOrbitEarthUIFactory init() {
		try {
			Symphony__CoreEnvironmentOrbitEarthUIFactory theSymphony__CoreEnvironmentOrbitEarthUIFactory = (Symphony__CoreEnvironmentOrbitEarthUIFactory)EPackage.Registry.INSTANCE.getEFactory(Symphony__CoreEnvironmentOrbitEarthUIPackage.eNS_URI);
			if (theSymphony__CoreEnvironmentOrbitEarthUIFactory != null) {
				return theSymphony__CoreEnvironmentOrbitEarthUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Symphony__CoreEnvironmentOrbitEarthUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentOrbitEarthUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION_LIST: return createEarthViewConfigurationList();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_VIEW_CONFIGURATION: return createEarthViewConfiguration();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER: return createSpacecraftLocationWorldWindLayer();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.ORBIT_MODEL_WORLD_WIND_LAYER: return createOrbitModelWorldWindLayer();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_SWATH_WORLD_WIND_LAYER: return createSpacecraftSwathWorldWindLayer();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.EARTH_SURFACE_LOCATION_WORLD_WIND_LAYER: return createEarthSurfaceLocationWorldWindLayer();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.GROUND_STATION_WORLD_WIND_LAYER: return createGroundStationWorldWindLayer();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION_LIST: return createSpacecraftVisibilityPassViewConfigurationList();
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.SPACECRAFT_VISIBILITY_PASS_VIEW_CONFIGURATION: return createSpacecraftVisibilityPassViewConfiguration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.RENDERABLE_LAYER:
				return createRenderableLayerFromString(eDataType, initialValue);
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.RENDERABLE_LAYER:
				return convertRenderableLayerToString(eDataType, instanceValue);
			case Symphony__CoreEnvironmentOrbitEarthUIPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthViewConfigurationList createEarthViewConfigurationList() {
		EarthViewConfigurationListImpl earthViewConfigurationList = new EarthViewConfigurationListImpl();
		return earthViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthViewConfiguration createEarthViewConfiguration() {
		EarthViewConfigurationImpl earthViewConfiguration = new EarthViewConfigurationImpl();
		return earthViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftLocationWorldWindLayer createSpacecraftLocationWorldWindLayer() {
		SpacecraftLocationWorldWindLayerImpl spacecraftLocationWorldWindLayer = new SpacecraftLocationWorldWindLayerImpl();
		return spacecraftLocationWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModelWorldWindLayer createOrbitModelWorldWindLayer() {
		OrbitModelWorldWindLayerImpl orbitModelWorldWindLayer = new OrbitModelWorldWindLayerImpl();
		return orbitModelWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftSwathWorldWindLayer createSpacecraftSwathWorldWindLayer() {
		SpacecraftSwathWorldWindLayerImpl spacecraftSwathWorldWindLayer = new SpacecraftSwathWorldWindLayerImpl();
		return spacecraftSwathWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocationWorldWindLayer createEarthSurfaceLocationWorldWindLayer() {
		EarthSurfaceLocationWorldWindLayerImpl earthSurfaceLocationWorldWindLayer = new EarthSurfaceLocationWorldWindLayerImpl();
		return earthSurfaceLocationWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStationWorldWindLayer createGroundStationWorldWindLayer() {
		GroundStationWorldWindLayerImpl groundStationWorldWindLayer = new GroundStationWorldWindLayerImpl();
		return groundStationWorldWindLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftVisibilityPassViewConfigurationList createSpacecraftVisibilityPassViewConfigurationList() {
		SpacecraftVisibilityPassViewConfigurationListImpl spacecraftVisibilityPassViewConfigurationList = new SpacecraftVisibilityPassViewConfigurationListImpl();
		return spacecraftVisibilityPassViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftVisibilityPassViewConfiguration createSpacecraftVisibilityPassViewConfiguration() {
		SpacecraftVisibilityPassViewConfigurationImpl spacecraftVisibilityPassViewConfiguration = new SpacecraftVisibilityPassViewConfigurationImpl();
		return spacecraftVisibilityPassViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderableLayer createRenderableLayerFromString(EDataType eDataType, String initialValue) {
		return (RenderableLayer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderableLayerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue) {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMapToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentOrbitEarthUIPackage getSymphony__CoreEnvironmentOrbitEarthUIPackage() {
		return (Symphony__CoreEnvironmentOrbitEarthUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Symphony__CoreEnvironmentOrbitEarthUIPackage getPackage() {
		return Symphony__CoreEnvironmentOrbitEarthUIPackage.eINSTANCE;
	}

} //Symphony__CoreEnvironmentOrbitEarthUIFactoryImpl
