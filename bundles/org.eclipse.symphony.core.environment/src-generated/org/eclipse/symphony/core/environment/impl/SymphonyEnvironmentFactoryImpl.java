/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import javax.vecmath.Color3f;
import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.core.environment.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyEnvironmentFactoryImpl extends EFactoryImpl implements SymphonyEnvironmentFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static SymphonyEnvironmentFactory init()
  {
		try {
			SymphonyEnvironmentFactory theSymphonyEnvironmentFactory = (SymphonyEnvironmentFactory)EPackage.Registry.INSTANCE.getEFactory(SymphonyEnvironmentPackage.eNS_URI);
			if (theSymphonyEnvironmentFactory != null) {
				return theSymphonyEnvironmentFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymphonyEnvironmentFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironmentFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE: return createEarthSurfaceWorksite();
			case SymphonyEnvironmentPackage.ENVIRONMENT: return createEnvironment();
			case SymphonyEnvironmentPackage.SURFACE_ENVIRONMENT: return createSurfaceEnvironment();
			case SymphonyEnvironmentPackage.EARTH_SURFACE_ENVIRONMENT: return createEarthSurfaceEnvironment();
			case SymphonyEnvironmentPackage.ATMOSPHERE: return createAtmosphere();
			case SymphonyEnvironmentPackage.ATMOSPHERE_UTILS: return createAtmosphereUtils();
			case SymphonyEnvironmentPackage.EQUATORIAL_COORDINATES: return createEquatorialCoordinates();
			case SymphonyEnvironmentPackage.GEOGRAPHIC_COORDINATES: return createGeographicCoordinates();
			case SymphonyEnvironmentPackage.HORIZONTAL_COORDINATES: return createHorizontalCoordinates();
			case SymphonyEnvironmentPackage.ECLIPTIC_COORDINATES: return createEclipticCoordinates();
			case SymphonyEnvironmentPackage.SKY: return createSky();
			case SymphonyEnvironmentPackage.EARTH_SKY: return createEarthSky();
			case SymphonyEnvironmentPackage.SUN: return createSun();
			case SymphonyEnvironmentPackage.EARTH: return createEarth();
			case SymphonyEnvironmentPackage.MOON: return createMoon();
			case SymphonyEnvironmentPackage.ENVIRONMENT_UTILITIES: return createEnvironmentUtilities();
			case SymphonyEnvironmentPackage.ENVIRONMENT_FACADE: return createEnvironmentFacade();
			case SymphonyEnvironmentPackage.STAR: return createStar();
			case SymphonyEnvironmentPackage.STAR_FIELD: return createStarField();
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS: return createAstronomyUtils();
			case SymphonyEnvironmentPackage.MAP: return createMap();
			case SymphonyEnvironmentPackage.MAPS_LIST: return createMapsList();
			case SymphonyEnvironmentPackage.RECTANGULAR_REGION: return createRectangularRegion();
			case SymphonyEnvironmentPackage.RECTANGULAR_VOLUME_REGION: return createRectangularVolumeRegion();
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER: return createImageMapLayer();
			case SymphonyEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION: return createImageMapLayerPresentation();
			case SymphonyEnvironmentPackage.URL_IMAGE_MAP_LAYER: return createURLImageMapLayer();
			case SymphonyEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER: return createTopologyTreeMapLayer();
			case SymphonyEnvironmentPackage.TOPOLOGY_TREE_MAP_LAYER_NODE: return createTopologyTreeMapLayerNode();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER: return createCartesianTriangularMeshMapLayer();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER: return createCartesianTriangularMeshSlopeImageMapLayer();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER: return createCartesianTriangularMeshDiscreteSlopeImageMapLayer();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER: return createCartesianTriangularMeshHeightImageMapLayer();
			case SymphonyEnvironmentPackage.SLOPE_RANGE: return createSlopeRange();
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER: return createLineOfSightImageMapLayer();
			case SymphonyEnvironmentPackage.ELLIPSE_SHAPE_IMAGE_LAYER: return createEllipseShapeImageLayer();
			case SymphonyEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER: return createRectangleShapeImageLayer();
			case SymphonyEnvironmentPackage.CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER: return createCartesianCoordinatesPolygonShapeImageMapLayer();
			case SymphonyEnvironmentPackage.GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER: return createGeographicCoordinatesPolygonShapeImageMapLayer();
			case SymphonyEnvironmentPackage.BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER: return createBasicCartesianTriangularMeshMapLayer();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER: return createCartesianTriangularMeshURLMapLayer();
			case SymphonyEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER: return createFeaturesOfInterestMapLayer();
			case SymphonyEnvironmentPackage.WORKSITE_NODE: return createWorksiteNode();
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE_NODE: return createSurfaceWorksiteNode();
			case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE_NODE: return createEarthSurfaceWorksiteNode();
			case SymphonyEnvironmentPackage.MAPS_LIST_NODE: return createMapsListNode();
			case SymphonyEnvironmentPackage.MAP_NODE: return createMapNode();
			case SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE: return createAbstractMapLayerNode();
			case SymphonyEnvironmentPackage.SKY_NODE: return createSkyNode();
			case SymphonyEnvironmentPackage.EARTH_SKY_NODE: return createEarthSkyNode();
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE: return createCartesianTriangularMeshMapLayerNode();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case SymphonyEnvironmentPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case SymphonyEnvironmentPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case SymphonyEnvironmentPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case SymphonyEnvironmentPackage.POINT3D:
				return createPoint3dFromString(eDataType, initialValue);
			case SymphonyEnvironmentPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case SymphonyEnvironmentPackage.IPROGRESS_MONITOR:
				return createIProgressMonitorFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case SymphonyEnvironmentPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case SymphonyEnvironmentPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case SymphonyEnvironmentPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case SymphonyEnvironmentPackage.POINT3D:
				return convertPoint3dToString(eDataType, instanceValue);
			case SymphonyEnvironmentPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case SymphonyEnvironmentPackage.IPROGRESS_MONITOR:
				return convertIProgressMonitorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSurfaceWorksite createEarthSurfaceWorksite()
  {
		EarthSurfaceWorksiteImpl earthSurfaceWorksite = new EarthSurfaceWorksiteImpl();
		return earthSurfaceWorksite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment createEnvironment()
  {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SurfaceEnvironment createSurfaceEnvironment()
  {
		SurfaceEnvironmentImpl surfaceEnvironment = new SurfaceEnvironmentImpl();
		return surfaceEnvironment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  public EarthSurfaceEnvironment createEarthSurfaceEnvironment()
  {
		EarthSurfaceEnvironmentImpl earthSurfaceEnvironment = new EarthSurfaceEnvironmentImpl();
		return earthSurfaceEnvironment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Atmosphere createAtmosphere()
  {
		AtmosphereImpl atmosphere = new AtmosphereImpl();
		return atmosphere;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AtmosphereUtils createAtmosphereUtils()
  {
		AtmosphereUtilsImpl atmosphereUtils = new AtmosphereUtilsImpl();
		return atmosphereUtils;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EquatorialCoordinates createEquatorialCoordinates()
  {
		EquatorialCoordinatesImpl equatorialCoordinates = new EquatorialCoordinatesImpl();
		return equatorialCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GeographicCoordinates createGeographicCoordinates()
  {
		GeographicCoordinatesImpl geographicCoordinates = new GeographicCoordinatesImpl();
		return geographicCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HorizontalCoordinates createHorizontalCoordinates()
  {
		HorizontalCoordinatesImpl horizontalCoordinates = new HorizontalCoordinatesImpl();
		return horizontalCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EclipticCoordinates createEclipticCoordinates()
  {
		EclipticCoordinatesImpl eclipticCoordinates = new EclipticCoordinatesImpl();
		return eclipticCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky createSky()
  {
		SkyImpl sky = new SkyImpl();
		return sky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSky createEarthSky()
  {
		EarthSkyImpl earthSky = new EarthSkyImpl();
		return earthSky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sun createSun()
  {
		SunImpl sun = new SunImpl();
		return sun;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Earth createEarth() {
		EarthImpl earth = new EarthImpl();
		return earth;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Moon createMoon()
  {
		MoonImpl moon = new MoonImpl();
		return moon;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnvironmentUtilities createEnvironmentUtilities()
  {
		EnvironmentUtilitiesImpl environmentUtilities = new EnvironmentUtilitiesImpl();
		return environmentUtilities;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EnvironmentFacade createEnvironmentFacade()
  {
		EnvironmentFacadeImpl environmentFacade = new EnvironmentFacadeImpl();
		return environmentFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Star createStar()
  {
		StarImpl star = new StarImpl();
		return star;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StarField createStarField()
  {
		StarFieldImpl starField = new StarFieldImpl();
		return starField;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AstronomyUtils createAstronomyUtils()
  {
		AstronomyUtilsImpl astronomyUtils = new AstronomyUtilsImpl();
		return astronomyUtils;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map createMap()
  {
		MapImpl map = new MapImpl();
		return map;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapsList createMapsList()
  {
		MapsListImpl mapsList = new MapsListImpl();
		return mapsList;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularRegion createRectangularRegion()
  {
		RectangularRegionImpl rectangularRegion = new RectangularRegionImpl();
		return rectangularRegion;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularVolumeRegion createRectangularVolumeRegion() {
		RectangularVolumeRegionImpl rectangularVolumeRegion = new RectangularVolumeRegionImpl();
		return rectangularVolumeRegion;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ImageMapLayer createImageMapLayer()
  {
		ImageMapLayerImpl imageMapLayer = new ImageMapLayerImpl();
		return imageMapLayer;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayerPresentation createImageMapLayerPresentation() {
		ImageMapLayerPresentationImpl imageMapLayerPresentation = new ImageMapLayerPresentationImpl();
		return imageMapLayerPresentation;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public URLImageMapLayer createURLImageMapLayer()
  {
		URLImageMapLayerImpl urlImageMapLayer = new URLImageMapLayerImpl();
		return urlImageMapLayer;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayer createTopologyTreeMapLayer() {
		TopologyTreeMapLayerImpl topologyTreeMapLayer = new TopologyTreeMapLayerImpl();
		return topologyTreeMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyTreeMapLayerNode createTopologyTreeMapLayerNode() {
		TopologyTreeMapLayerNodeImpl topologyTreeMapLayerNode = new TopologyTreeMapLayerNodeImpl();
		return topologyTreeMapLayerNode;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayer createCartesianTriangularMeshMapLayer() {
		CartesianTriangularMeshMapLayerImpl cartesianTriangularMeshMapLayer = new CartesianTriangularMeshMapLayerImpl();
		return cartesianTriangularMeshMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshSlopeImageMapLayer createCartesianTriangularMeshSlopeImageMapLayer() {
		CartesianTriangularMeshSlopeImageMapLayerImpl cartesianTriangularMeshSlopeImageMapLayer = new CartesianTriangularMeshSlopeImageMapLayerImpl();
		return cartesianTriangularMeshSlopeImageMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshDiscreteSlopeImageMapLayer createCartesianTriangularMeshDiscreteSlopeImageMapLayer() {
		CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl cartesianTriangularMeshDiscreteSlopeImageMapLayer = new CartesianTriangularMeshDiscreteSlopeImageMapLayerImpl();
		return cartesianTriangularMeshDiscreteSlopeImageMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshHeightImageMapLayer createCartesianTriangularMeshHeightImageMapLayer() {
		CartesianTriangularMeshHeightImageMapLayerImpl cartesianTriangularMeshHeightImageMapLayer = new CartesianTriangularMeshHeightImageMapLayerImpl();
		return cartesianTriangularMeshHeightImageMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineOfSightImageMapLayer createLineOfSightImageMapLayer() {
		LineOfSightImageMapLayerImpl lineOfSightImageMapLayer = new LineOfSightImageMapLayerImpl();
		return lineOfSightImageMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EllipseShapeImageLayer createEllipseShapeImageLayer() {
		EllipseShapeImageLayerImpl ellipseShapeImageLayer = new EllipseShapeImageLayerImpl();
		return ellipseShapeImageLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleShapeImageLayer createRectangleShapeImageLayer() {
		RectangleShapeImageLayerImpl rectangleShapeImageLayer = new RectangleShapeImageLayerImpl();
		return rectangleShapeImageLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesPolygonShapeImageMapLayer createCartesianCoordinatesPolygonShapeImageMapLayer() {
		CartesianCoordinatesPolygonShapeImageMapLayerImpl cartesianCoordinatesPolygonShapeImageMapLayer = new CartesianCoordinatesPolygonShapeImageMapLayerImpl();
		return cartesianCoordinatesPolygonShapeImageMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinatesPolygonShapeImageMapLayer createGeographicCoordinatesPolygonShapeImageMapLayer() {
		GeographicCoordinatesPolygonShapeImageMapLayerImpl geographicCoordinatesPolygonShapeImageMapLayer = new GeographicCoordinatesPolygonShapeImageMapLayerImpl();
		return geographicCoordinatesPolygonShapeImageMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlopeRange createSlopeRange() {
		SlopeRangeImpl slopeRange = new SlopeRangeImpl();
		return slopeRange;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCartesianTriangularMeshMapLayer createBasicCartesianTriangularMeshMapLayer() {
		BasicCartesianTriangularMeshMapLayerImpl basicCartesianTriangularMeshMapLayer = new BasicCartesianTriangularMeshMapLayerImpl();
		return basicCartesianTriangularMeshMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CartesianTriangularMeshURLMapLayer createCartesianTriangularMeshURLMapLayer()
  {
		CartesianTriangularMeshURLMapLayerImpl cartesianTriangularMeshURLMapLayer = new CartesianTriangularMeshURLMapLayerImpl();
		return cartesianTriangularMeshURLMapLayer;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayer createFeaturesOfInterestMapLayer() {
		FeaturesOfInterestMapLayerImpl featuresOfInterestMapLayer = new FeaturesOfInterestMapLayerImpl();
		return featuresOfInterestMapLayer;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode createWorksiteNode()
  {
		WorksiteNodeImpl worksiteNode = new WorksiteNodeImpl();
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SurfaceWorksiteNode createSurfaceWorksiteNode()
  {
		SurfaceWorksiteNodeImpl surfaceWorksiteNode = new SurfaceWorksiteNodeImpl();
		return surfaceWorksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSurfaceWorksiteNode createEarthSurfaceWorksiteNode()
  {
		EarthSurfaceWorksiteNodeImpl earthSurfaceWorksiteNode = new EarthSurfaceWorksiteNodeImpl();
		return earthSurfaceWorksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapsListNode createMapsListNode()
  {
		MapsListNodeImpl mapsListNode = new MapsListNodeImpl();
		return mapsListNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MapNode createMapNode()
  {
		MapNodeImpl mapNode = new MapNodeImpl();
		return mapNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractMapLayerNode createAbstractMapLayerNode()
  {
		AbstractMapLayerNodeImpl abstractMapLayerNode = new AbstractMapLayerNodeImpl();
		return abstractMapLayerNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SkyNode createSkyNode()
  {
		SkyNodeImpl skyNode = new SkyNodeImpl();
		return skyNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSkyNode createEarthSkyNode()
  {
		EarthSkyNodeImpl earthSkyNode = new EarthSkyNodeImpl();
		return earthSkyNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshMapLayerNode createCartesianTriangularMeshMapLayerNode() {
		CartesianTriangularMeshMapLayerNodeImpl cartesianTriangularMeshMapLayerNode = new CartesianTriangularMeshMapLayerNodeImpl();
		return cartesianTriangularMeshMapLayerNode;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<?> createListFromString(EDataType eDataType, String initialValue)
  {
		return (List<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date createDateFromString(EDataType eDataType, String initialValue)
  {
		return (Date)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDateToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Point3d createPoint3dFromString(EDataType eDataType, String initialValue)
  {
		return (Point3d)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPoint3dToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Color3f createColor3fFromString(EDataType eDataType, String initialValue)
  {
	  Color3f color3f = new Color3f();
	  
	  String[] values = initialValue.split(",");
	  
	  color3f.x = Float.parseFloat(values[0]);
	  color3f.y = Float.parseFloat(values[1]);
	  color3f.z = Float.parseFloat(values[2]);

	  return color3f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertColor3fToString(EDataType eDataType, Object instanceValue)
  {
	  Color3f color3f = (Color3f) instanceValue;
	  
	  String string = color3f.x + "," + color3f.y + "," + color3f.z;
	  
	  return string;
  }


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProgressMonitor createIProgressMonitorFromString(EDataType eDataType, String initialValue) {
		return (IProgressMonitor)super.createFromString(eDataType, initialValue);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIProgressMonitorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironmentPackage getSymphonyEnvironmentPackage()
  {
		return (SymphonyEnvironmentPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static SymphonyEnvironmentPackage getPackage()
  {
		return SymphonyEnvironmentPackage.eINSTANCE;
	}

} //SymphonyEnvironmentFactoryImpl
