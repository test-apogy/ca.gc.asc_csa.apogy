/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.PositionNode;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.AbstractWorksite;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.Atmosphere;
import ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Earth;
import ca.gc.asc_csa.apogy.core.environment.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.EarthSkyNode;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates;
import ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.Environment;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Map;
import ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.MapNode;
import ca.gc.asc_csa.apogy.core.environment.MapsList;
import ca.gc.asc_csa.apogy.core.environment.MapsListNode;
import ca.gc.asc_csa.apogy.core.environment.Moon;
import ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegion;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage;
import ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion;
import ca.gc.asc_csa.apogy.core.environment.Region;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.SlopeRange;
import ca.gc.asc_csa.apogy.core.environment.Star;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer;
import ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer;
import ca.gc.asc_csa.apogy.core.environment.URLMapLayer;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage
 * @generated
 */
public class ApogyCoreEnvironmentAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCoreEnvironmentPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreEnvironmentAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCoreEnvironmentPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCoreEnvironmentSwitch<Adapter> modelSwitch =
    new ApogyCoreEnvironmentSwitch<Adapter>() {
			@Override
			public Adapter caseWorksite(Worksite object) {
				return createWorksiteAdapter();
			}
			@Override
			public Adapter caseSurfaceWorksite(SurfaceWorksite object) {
				return createSurfaceWorksiteAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceWorksite(EarthSurfaceWorksite object) {
				return createEarthSurfaceWorksiteAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseSurfaceEnvironment(SurfaceEnvironment object) {
				return createSurfaceEnvironmentAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceEnvironment(EarthSurfaceEnvironment object) {
				return createEarthSurfaceEnvironmentAdapter();
			}
			@Override
			public Adapter caseAtmosphere(Atmosphere object) {
				return createAtmosphereAdapter();
			}
			@Override
			public Adapter caseAtmosphereUtils(AtmosphereUtils object) {
				return createAtmosphereUtilsAdapter();
			}
			@Override
			public Adapter caseEquatorialCoordinates(EquatorialCoordinates object) {
				return createEquatorialCoordinatesAdapter();
			}
			@Override
			public Adapter caseGeographicCoordinates(GeographicCoordinates object) {
				return createGeographicCoordinatesAdapter();
			}
			@Override
			public Adapter caseHorizontalCoordinates(HorizontalCoordinates object) {
				return createHorizontalCoordinatesAdapter();
			}
			@Override
			public Adapter caseEclipticCoordinates(EclipticCoordinates object) {
				return createEclipticCoordinatesAdapter();
			}
			@Override
			public Adapter caseSky(Sky object) {
				return createSkyAdapter();
			}
			@Override
			public Adapter caseEarthSky(EarthSky object) {
				return createEarthSkyAdapter();
			}
			@Override
			public Adapter caseSun(Sun object) {
				return createSunAdapter();
			}
			@Override
			public Adapter caseEarth(Earth object) {
				return createEarthAdapter();
			}
			@Override
			public Adapter caseMoon(Moon object) {
				return createMoonAdapter();
			}
			@Override
			public Adapter caseEnvironmentUtilities(EnvironmentUtilities object) {
				return createEnvironmentUtilitiesAdapter();
			}
			@Override
			public Adapter caseApogyCoreEnvironmentFacade(ApogyCoreEnvironmentFacade object) {
				return createApogyCoreEnvironmentFacadeAdapter();
			}
			@Override
			public Adapter caseStar(Star object) {
				return createStarAdapter();
			}
			@Override
			public Adapter caseStarField(StarField object) {
				return createStarFieldAdapter();
			}
			@Override
			public Adapter caseAstronomyUtils(AstronomyUtils object) {
				return createAstronomyUtilsAdapter();
			}
			@Override
			public Adapter caseMap(Map object) {
				return createMapAdapter();
			}
			@Override
			public Adapter caseMapsList(MapsList object) {
				return createMapsListAdapter();
			}
			@Override
			public Adapter caseAbstractMapLayer(AbstractMapLayer object) {
				return createAbstractMapLayerAdapter();
			}
			@Override
			public Adapter caseMapLayerPresentation(MapLayerPresentation object) {
				return createMapLayerPresentationAdapter();
			}
			@Override
			public Adapter caseURLMapLayer(URLMapLayer object) {
				return createURLMapLayerAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseRectangularRegion(RectangularRegion object) {
				return createRectangularRegionAdapter();
			}
			@Override
			public Adapter caseRectangularVolumeRegion(RectangularVolumeRegion object) {
				return createRectangularVolumeRegionAdapter();
			}
			@Override
			public Adapter caseRectangularRegionProvider(RectangularRegionProvider object) {
				return createRectangularRegionProviderAdapter();
			}
			@Override
			public Adapter caseRectangularRegionImage(RectangularRegionImage object) {
				return createRectangularRegionImageAdapter();
			}
			@Override
			public Adapter caseImageMapLayer(ImageMapLayer object) {
				return createImageMapLayerAdapter();
			}
			@Override
			public Adapter caseImageMapLayerPresentation(ImageMapLayerPresentation object) {
				return createImageMapLayerPresentationAdapter();
			}
			@Override
			public Adapter caseURLImageMapLayer(URLImageMapLayer object) {
				return createURLImageMapLayerAdapter();
			}
			@Override
			public Adapter caseTopologyTreeMapLayer(TopologyTreeMapLayer object) {
				return createTopologyTreeMapLayerAdapter();
			}
			@Override
			public Adapter caseTopologyTreeMapLayerNode(TopologyTreeMapLayerNode object) {
				return createTopologyTreeMapLayerNodeAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshMapLayer(CartesianTriangularMeshMapLayer object) {
				return createCartesianTriangularMeshMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshDerivedImageMapLayer(CartesianTriangularMeshDerivedImageMapLayer object) {
				return createCartesianTriangularMeshDerivedImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshSlopeImageMapLayer(CartesianTriangularMeshSlopeImageMapLayer object) {
				return createCartesianTriangularMeshSlopeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshDiscreteSlopeImageMapLayer(CartesianTriangularMeshDiscreteSlopeImageMapLayer object) {
				return createCartesianTriangularMeshDiscreteSlopeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshHeightImageMapLayer(CartesianTriangularMeshHeightImageMapLayer object) {
				return createCartesianTriangularMeshHeightImageMapLayerAdapter();
			}
			@Override
			public Adapter caseSlopeRange(SlopeRange object) {
				return createSlopeRangeAdapter();
			}
			@Override
			public Adapter caseLineOfSightImageMapLayer(LineOfSightImageMapLayer object) {
				return createLineOfSightImageMapLayerAdapter();
			}
			@Override
			public Adapter caseAbstractShapeImageLayer(AbstractShapeImageLayer object) {
				return createAbstractShapeImageLayerAdapter();
			}
			@Override
			public Adapter caseEllipseShapeImageLayer(EllipseShapeImageLayer object) {
				return createEllipseShapeImageLayerAdapter();
			}
			@Override
			public Adapter caseRectangleShapeImageLayer(RectangleShapeImageLayer object) {
				return createRectangleShapeImageLayerAdapter();
			}
			@Override
			public Adapter casePolygonShapeImageMapLayer(PolygonShapeImageMapLayer object) {
				return createPolygonShapeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianCoordinatesPolygonShapeImageMapLayer(CartesianCoordinatesPolygonShapeImageMapLayer object) {
				return createCartesianCoordinatesPolygonShapeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseGeographicCoordinatesPolygonShapeImageMapLayer(GeographicCoordinatesPolygonShapeImageMapLayer object) {
				return createGeographicCoordinatesPolygonShapeImageMapLayerAdapter();
			}
			@Override
			public Adapter caseBasicCartesianTriangularMeshMapLayer(BasicCartesianTriangularMeshMapLayer object) {
				return createBasicCartesianTriangularMeshMapLayerAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshURLMapLayer(CartesianTriangularMeshURLMapLayer object) {
				return createCartesianTriangularMeshURLMapLayerAdapter();
			}
			@Override
			public Adapter caseFeaturesOfInterestMapLayer(FeaturesOfInterestMapLayer object) {
				return createFeaturesOfInterestMapLayerAdapter();
			}
			@Override
			public Adapter caseWorksiteNode(WorksiteNode object) {
				return createWorksiteNodeAdapter();
			}
			@Override
			public Adapter caseSurfaceWorksiteNode(SurfaceWorksiteNode object) {
				return createSurfaceWorksiteNodeAdapter();
			}
			@Override
			public Adapter caseEarthSurfaceWorksiteNode(EarthSurfaceWorksiteNode object) {
				return createEarthSurfaceWorksiteNodeAdapter();
			}
			@Override
			public Adapter caseMapsListNode(MapsListNode object) {
				return createMapsListNodeAdapter();
			}
			@Override
			public Adapter caseMapNode(MapNode object) {
				return createMapNodeAdapter();
			}
			@Override
			public Adapter caseAbstractMapLayerNode(AbstractMapLayerNode object) {
				return createAbstractMapLayerNodeAdapter();
			}
			@Override
			public Adapter caseSkyNode(SkyNode object) {
				return createSkyNodeAdapter();
			}
			@Override
			public Adapter caseEarthSkyNode(EarthSkyNode object) {
				return createEarthSkyNodeAdapter();
			}
			@Override
			public Adapter caseCartesianTriangularMeshMapLayerNode(CartesianTriangularMeshMapLayerNode object) {
				return createCartesianTriangularMeshMapLayerNodeAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseTimed(Timed object) {
				return createTimedAdapter();
			}
			@Override
			public Adapter caseAbstractWorksite(AbstractWorksite object) {
				return createAbstractWorksiteAdapter();
			}
			@Override
			public Adapter caseNode(Node object) {
				return createNodeAdapter();
			}
			@Override
			public Adapter caseGroupNode(GroupNode object) {
				return createGroupNodeAdapter();
			}
			@Override
			public Adapter caseAggregateGroupNode(AggregateGroupNode object) {
				return createAggregateGroupNodeAdapter();
			}
			@Override
			public Adapter casePositionNode(PositionNode object) {
				return createPositionNodeAdapter();
			}
			@Override
			public Adapter caseRotationNode(RotationNode object) {
				return createRotationNodeAdapter();
			}
			@Override
			public Adapter caseTransformNode(TransformNode object) {
				return createTransformNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Worksite <em>Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Worksite
	 * @generated
	 */
  public Adapter createWorksiteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite <em>Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite
	 * @generated
	 */
  public Adapter createSurfaceWorksiteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite <em>Earth Surface Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite
	 * @generated
	 */
  public Adapter createEarthSurfaceWorksiteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Environment
	 * @generated
	 */
  public Adapter createEnvironmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment <em>Surface Environment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceEnvironment
	 * @generated
	 */
  public Adapter createSurfaceEnvironmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment <em>Earth Surface Environment</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceEnvironment
	 * @generated
	 */
  public Adapter createEarthSurfaceEnvironmentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Atmosphere <em>Atmosphere</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Atmosphere
	 * @generated
	 */
  public Adapter createAtmosphereAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils <em>Atmosphere Utils</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils
	 * @generated
	 */
  public Adapter createAtmosphereUtilsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates <em>Equatorial Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates
	 * @generated
	 */
  public Adapter createEquatorialCoordinatesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates <em>Geographic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates
	 * @generated
	 */
  public Adapter createGeographicCoordinatesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates <em>Horizontal Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates
	 * @generated
	 */
  public Adapter createHorizontalCoordinatesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates <em>Ecliptic Coordinates</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates
	 * @generated
	 */
  public Adapter createEclipticCoordinatesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Sky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky
	 * @generated
	 */
  public Adapter createSkyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSky <em>Earth Sky</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSky
	 * @generated
	 */
  public Adapter createEarthSkyAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Sun <em>Sun</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Sun
	 * @generated
	 */
  public Adapter createSunAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Earth <em>Earth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Earth
	 * @generated
	 */
	public Adapter createEarthAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Moon <em>Moon</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Moon
	 * @generated
	 */
  public Adapter createMoonAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities <em>Environment Utilities</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities
	 * @generated
	 */
  public Adapter createEnvironmentUtilitiesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade
	 * @generated
	 */
	public Adapter createApogyCoreEnvironmentFacadeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Star <em>Star</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Star
	 * @generated
	 */
  public Adapter createStarAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.StarField <em>Star Field</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.StarField
	 * @generated
	 */
  public Adapter createStarFieldAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils <em>Astronomy Utils</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils
	 * @generated
	 */
  public Adapter createAstronomyUtilsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Map
	 * @generated
	 */
  public Adapter createMapAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.MapsList <em>Maps List</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsList
	 * @generated
	 */
  public Adapter createMapsListAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer <em>Abstract Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayer
	 * @generated
	 */
  public Adapter createAbstractMapLayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation <em>Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapLayerPresentation
	 * @generated
	 */
	public Adapter createMapLayerPresentationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.URLMapLayer <em>URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.URLMapLayer
	 * @generated
	 */
  public Adapter createURLMapLayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.Region
	 * @generated
	 */
  public Adapter createRegionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegion <em>Rectangular Region</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegion
	 * @generated
	 */
  public Adapter createRectangularRegionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion <em>Rectangular Volume Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularVolumeRegion
	 * @generated
	 */
	public Adapter createRectangularVolumeRegionAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider <em>Rectangular Region Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionProvider
	 * @generated
	 */
	public Adapter createRectangularRegionProviderAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage <em>Rectangular Region Image</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangularRegionImage
	 * @generated
	 */
  public Adapter createRectangularRegionImageAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer <em>Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayer
	 * @generated
	 */
  public Adapter createImageMapLayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation <em>Image Map Layer Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation
	 * @generated
	 */
	public Adapter createImageMapLayerPresentationAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer <em>URL Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.URLImageMapLayer
	 * @generated
	 */
  public Adapter createURLImageMapLayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer <em>Topology Tree Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayer
	 * @generated
	 */
	public Adapter createTopologyTreeMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode <em>Topology Tree Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.TopologyTreeMapLayerNode
	 * @generated
	 */
	public Adapter createTopologyTreeMapLayerNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer <em>Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer <em>Cartesian Triangular Mesh Derived Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDerivedImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshDerivedImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer <em>Cartesian Triangular Mesh Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshSlopeImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshSlopeImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer <em>Cartesian Triangular Mesh Discrete Slope Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshDiscreteSlopeImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer <em>Cartesian Triangular Mesh Height Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshHeightImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshHeightImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer <em>Line Of Sight Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.LineOfSightImageMapLayer
	 * @generated
	 */
	public Adapter createLineOfSightImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer <em>Abstract Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractShapeImageLayer
	 * @generated
	 */
	public Adapter createAbstractShapeImageLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer <em>Ellipse Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EllipseShapeImageLayer
	 * @generated
	 */
	public Adapter createEllipseShapeImageLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer <em>Rectangle Shape Image Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer
	 * @generated
	 */
	public Adapter createRectangleShapeImageLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer <em>Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer
	 * @generated
	 */
	public Adapter createPolygonShapeImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer <em>Cartesian Coordinates Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer
	 * @generated
	 */
	public Adapter createCartesianCoordinatesPolygonShapeImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer <em>Geographic Coordinates Polygon Shape Image Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer
	 * @generated
	 */
	public Adapter createGeographicCoordinatesPolygonShapeImageMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.SlopeRange <em>Slope Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.SlopeRange
	 * @generated
	 */
	public Adapter createSlopeRangeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer <em>Basic Cartesian Triangular Mesh Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.BasicCartesianTriangularMeshMapLayer
	 * @generated
	 */
	public Adapter createBasicCartesianTriangularMeshMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer <em>Cartesian Triangular Mesh URL Map Layer</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshURLMapLayer
	 * @generated
	 */
  public Adapter createCartesianTriangularMeshURLMapLayerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer <em>Features Of Interest Map Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.FeaturesOfInterestMapLayer
	 * @generated
	 */
	public Adapter createFeaturesOfInterestMapLayerAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.WorksiteNode <em>Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.WorksiteNode
	 * @generated
	 */
  public Adapter createWorksiteNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode <em>Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode
	 * @generated
	 */
  public Adapter createSurfaceWorksiteNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode <em>Earth Surface Worksite Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode
	 * @generated
	 */
  public Adapter createEarthSurfaceWorksiteNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.MapsListNode <em>Maps List Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsListNode
	 * @generated
	 */
  public Adapter createMapsListNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.MapNode <em>Map Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.MapNode
	 * @generated
	 */
  public Adapter createMapNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode <em>Abstract Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.AbstractMapLayerNode
	 * @generated
	 */
  public Adapter createAbstractMapLayerNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.SkyNode <em>Sky Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.SkyNode
	 * @generated
	 */
  public Adapter createSkyNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.EarthSkyNode <em>Earth Sky Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSkyNode
	 * @generated
	 */
  public Adapter createEarthSkyNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode <em>Cartesian Triangular Mesh Map Layer Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.environment.CartesianTriangularMeshMapLayerNode
	 * @generated
	 */
	public Adapter createCartesianTriangularMeshMapLayerNodeAdapter() {
		return null;
	}

		/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @generated
	 */
  public Adapter createNamedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @generated
	 */
  public Adapter createDescribedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.AbstractWorksite <em>Abstract Worksite</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.AbstractWorksite
	 * @generated
	 */
  public Adapter createAbstractWorksiteAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.Node
	 * @generated
	 */
  public Adapter createNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.GroupNode <em>Group Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.GroupNode
	 * @generated
	 */
  public Adapter createGroupNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode <em>Aggregate Group Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode
	 * @generated
	 */
  public Adapter createAggregateGroupNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.PositionNode <em>Position Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.PositionNode
	 * @generated
	 */
  public Adapter createPositionNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.RotationNode <em>Rotation Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.RotationNode
	 * @generated
	 */
  public Adapter createRotationNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.topology.TransformNode <em>Transform Node</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.topology.TransformNode
	 * @generated
	 */
  public Adapter createTransformNodeAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Timed <em>Timed</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Timed
	 * @generated
	 */
  public Adapter createTimedAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //ApogyCoreEnvironmentAdapterFactory
