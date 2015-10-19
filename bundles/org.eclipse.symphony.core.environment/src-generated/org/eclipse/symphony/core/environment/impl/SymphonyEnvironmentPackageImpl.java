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
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;
import org.eclipse.symphony.common.images.ImagesCorePackage;
import org.eclipse.symphony.common.math.MathPackage;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.AbstractMapLayerNode;
import org.eclipse.symphony.core.environment.AbstractShapeImageLayer;
import org.eclipse.symphony.core.environment.AstronomyUtils;
import org.eclipse.symphony.core.environment.Atmosphere;
import org.eclipse.symphony.core.environment.AtmosphereUtils;
import org.eclipse.symphony.core.environment.BasicCartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.CartesianCoordinatesPolygonShapeImageMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshDerivedImageMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshDiscreteSlopeImageMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshHeightImageMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayerNode;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshURLMapLayer;
import org.eclipse.symphony.core.environment.Earth;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSkyNode;
import org.eclipse.symphony.core.environment.EarthSurfaceEnvironment;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksiteNode;
import org.eclipse.symphony.core.environment.EclipticCoordinates;
import org.eclipse.symphony.core.environment.EllipseShapeImageLayer;
import org.eclipse.symphony.core.environment.Environment;
import org.eclipse.symphony.core.environment.EnvironmentFacade;
import org.eclipse.symphony.core.environment.EnvironmentUtilities;
import org.eclipse.symphony.core.environment.EquatorialCoordinates;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer;
import org.eclipse.symphony.core.environment.HorizontalCoordinates;
import org.eclipse.symphony.core.environment.ImageMapLayer;
import org.eclipse.symphony.core.environment.ImageMapLayerPresentation;
import org.eclipse.symphony.core.environment.LineOfSightImageMapLayer;
import org.eclipse.symphony.core.environment.Map;
import org.eclipse.symphony.core.environment.MapLayerPresentation;
import org.eclipse.symphony.core.environment.MapNode;
import org.eclipse.symphony.core.environment.MapsList;
import org.eclipse.symphony.core.environment.MapsListNode;
import org.eclipse.symphony.core.environment.Moon;
import org.eclipse.symphony.core.environment.PolygonShapeImageMapLayer;
import org.eclipse.symphony.core.environment.RectangleShapeImageLayer;
import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.RectangularRegionImage;
import org.eclipse.symphony.core.environment.RectangularRegionProvider;
import org.eclipse.symphony.core.environment.RectangularVolumeRegion;
import org.eclipse.symphony.core.environment.Region;
import org.eclipse.symphony.core.environment.Sky;
import org.eclipse.symphony.core.environment.SkyNode;
import org.eclipse.symphony.core.environment.SlopeRange;
import org.eclipse.symphony.core.environment.Star;
import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.SurfaceEnvironment;
import org.eclipse.symphony.core.environment.SurfaceWorksite;
import org.eclipse.symphony.core.environment.SurfaceWorksiteNode;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;
import org.eclipse.symphony.core.environment.TopologyTreeMapLayer;
import org.eclipse.symphony.core.environment.TopologyTreeMapLayerNode;
import org.eclipse.symphony.core.environment.URLImageMapLayer;
import org.eclipse.symphony.core.environment.URLMapLayer;
import org.eclipse.symphony.core.environment.Worksite;
import org.eclipse.symphony.core.environment.WorksiteNode;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymphonyEnvironmentPackageImpl extends EPackageImpl implements SymphonyEnvironmentPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass worksiteEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass surfaceWorksiteEClass = null;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSurfaceWorksiteEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass surfaceEnvironmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSurfaceEnvironmentEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass atmosphereEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass atmosphereUtilsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass equatorialCoordinatesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass geographicCoordinatesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass horizontalCoordinatesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass eclipticCoordinatesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass skyEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSkyEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sunEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass earthEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass moonEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentUtilitiesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentFacadeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass starEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass starFieldEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass astronomyUtilsEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapsListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractMapLayerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapLayerPresentationEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass urlMapLayerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass regionEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rectangularRegionEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularVolumeRegionEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangularRegionProviderEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass rectangularRegionImageEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass imageMapLayerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageMapLayerPresentationEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass urlImageMapLayerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyTreeMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyTreeMapLayerNodeEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshDerivedImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshSlopeImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshHeightImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineOfSightImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractShapeImageLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseShapeImageLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleShapeImageLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonShapeImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianCoordinatesPolygonShapeImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geographicCoordinatesPolygonShapeImageMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeRangeEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicCartesianTriangularMeshMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass cartesianTriangularMeshURLMapLayerEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresOfInterestMapLayerEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass worksiteNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass surfaceWorksiteNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSurfaceWorksiteNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapsListNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractMapLayerNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass skyNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSkyNodeEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianTriangularMeshMapLayerNodeEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType listEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedSetEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType dateEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType point3dEDataType = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType color3fEDataType = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProgressMonitorEDataType = null;

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
	 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SymphonyEnvironmentPackageImpl()
  {
		super(eNS_URI, SymphonyEnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SymphonyEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SymphonyEnvironmentPackage init()
  {
		if (isInited) return (SymphonyEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		SymphonyEnvironmentPackageImpl theSymphonyEnvironmentPackage = (SymphonyEnvironmentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SymphonyEnvironmentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SymphonyEnvironmentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Data3dPackage.eINSTANCE.eClass();
		SymphonyCorePackage.eINSTANCE.eClass();
		ImagesCorePackage.eINSTANCE.eClass();
		
		// Create package meta-data objects
		theSymphonyEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theSymphonyEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphonyEnvironmentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SymphonyEnvironmentPackage.eNS_URI, theSymphonyEnvironmentPackage);
		return theSymphonyEnvironmentPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWorksite()
  {
		return worksiteEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWorksite_WorksiteNode()
  {
		return (EReference)worksiteEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorksite_OrbitsModels() {
		return (EReference)worksiteEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWorksite_Environment()
  {
		return (EReference)worksiteEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSurfaceWorksite()
  {
		return surfaceWorksiteEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSurfaceWorksite_Sky()
  {
		return (EReference)surfaceWorksiteEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSurfaceWorksite_MapsList()
  {
		return (EReference)surfaceWorksiteEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSurfaceWorksite()
  {
		return earthSurfaceWorksiteEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEarthSurfaceWorksite_GeographicalCoordinates()
  {
		return (EReference)earthSurfaceWorksiteEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksite_XAxisAzimuth()
  {
		return (EAttribute)earthSurfaceWorksiteEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEarthSurfaceWorksite_EarthSky()
  {
		return (EReference)earthSurfaceWorksiteEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d() {
		return earthSurfaceWorksiteEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates() {
		return earthSurfaceWorksiteEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironment()
  {
		return environmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSurfaceEnvironment()
  {
		return surfaceEnvironmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSurfaceEnvironment_Atmosphere()
  {
		return (EReference)surfaceEnvironmentEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSurfaceEnvironment_Gravity()
  {
		return (EReference)surfaceEnvironmentEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSurfaceEnvironment()
  {
		return earthSurfaceEnvironmentEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAtmosphere()
  {
		return atmosphereEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtmosphere_WindSpeed()
  {
		return (EAttribute)atmosphereEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtmosphere_WindDirection()
  {
		return (EAttribute)atmosphereEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtmosphere_Temperature()
  {
		return (EAttribute)atmosphereEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtmosphere_SurfacePressure()
  {
		return (EAttribute)atmosphereEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getAtmosphere_SurfaceDensity()
  {
		return (EAttribute)atmosphereEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAtmosphereUtils()
  {
		return atmosphereUtilsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAtmosphereUtils__GetAirMass__double()
  {
		return atmosphereUtilsEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAtmosphereUtils__GetDirectSunIntensity__double_double()
  {
		return atmosphereUtilsEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAtmosphereUtils__GetDiffuseSunIntensity__double_double()
  {
		return atmosphereUtilsEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAtmosphereUtils__GetAtmosphereRefractionCorrection__double()
  {
		return atmosphereUtilsEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEquatorialCoordinates()
  {
		return equatorialCoordinatesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEquatorialCoordinates_RightAscension()
  {
		return (EAttribute)equatorialCoordinatesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEquatorialCoordinates_Declination()
  {
		return (EAttribute)equatorialCoordinatesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEquatorialCoordinates_Radius()
  {
		return (EAttribute)equatorialCoordinatesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getGeographicCoordinates()
  {
		return geographicCoordinatesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGeographicCoordinates_Longitude()
  {
		return (EAttribute)geographicCoordinatesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGeographicCoordinates_Latitude()
  {
		return (EAttribute)geographicCoordinatesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getGeographicCoordinates_Elevation()
  {
		return (EAttribute)geographicCoordinatesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getHorizontalCoordinates()
  {
		return horizontalCoordinatesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHorizontalCoordinates_Altitude()
  {
		return (EAttribute)horizontalCoordinatesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHorizontalCoordinates_Azimuth()
  {
		return (EAttribute)horizontalCoordinatesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getHorizontalCoordinates_Radius()
  {
		return (EAttribute)horizontalCoordinatesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEclipticCoordinates()
  {
		return eclipticCoordinatesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEclipticCoordinates_Longitude()
  {
		return (EAttribute)eclipticCoordinatesEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEclipticCoordinates_Latitude()
  {
		return (EAttribute)eclipticCoordinatesEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEclipticCoordinates_Radius()
  {
		return (EAttribute)eclipticCoordinatesEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSky()
  {
		return skyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_SurfaceWorksite()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_SkyNode()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_Sun()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_SunHorizontalCoordinates()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSky_StarField()
  {
		return (EReference)skyEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSky__GetSunAngularDiameter()
  {
		return skyEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSky()
  {
		return earthSkyEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEarthSky_Moon()
  {
		return (EReference)earthSkyEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEarthSky_MoonHorizontalCoordinates()
  {
		return (EReference)earthSkyEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEarthSky__GetMoonAngularDiameter()
  {
		return earthSkyEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSun()
  {
		return sunEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSun_Radius()
  {
		return (EAttribute)sunEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getSun__GetIrradiance__double()
  {
		return sunEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEarth() {
		return earthEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEarth_Radius() {
		return (EAttribute)earthEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMoon()
  {
		return moonEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMoon_Radius()
  {
		return (EAttribute)moonEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironmentUtilities()
  {
		return environmentUtilitiesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__ConvertToJulianDate__Date()
  {
		return environmentUtilitiesEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__ParseRightAscension__String()
  {
		return environmentUtilitiesEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__ParseDegMinSec__String()
  {
		return environmentUtilitiesEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUtilities__SortByMagnitude__List()
  {
		return environmentUtilitiesEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironmentFacade()
  {
		return environmentFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__CreateAndInitializeStars()
  {
		return environmentFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite()
  {
		return environmentFacadeEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__InitializeSkyNode__Sky_SkyNode()
  {
		return environmentFacadeEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode()
  {
		return environmentFacadeEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetMarsYardGeographicalCoordinates()
  {
		return environmentFacadeEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__CreateStar__float_double_double()
  {
		return environmentFacadeEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetMarsYardTransformNode()
  {
		return environmentFacadeEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__CreateAndInitializeEarthSurfaceEnvironment()
  {
		return environmentFacadeEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__CreateAndInitializeEarthAtmosphere()
  {
		return environmentFacadeEClass.getEOperations().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetSunVector__SymphonySystem_String_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetSunVector__Node_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetMoonVector__SymphonySystem_String_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetMoonVector__Node_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetVector__Node_SymphonySystem_ConnectionPoint_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(13);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetVector__SymphonySystem_String_SymphonySystem_ConnectionPoint_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(14);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetVector__SymphonySystem_String_SymphonySystem_String_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(15);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetVector__SymphonySystem_String_String_String_Environment()
  {
		return environmentFacadeEClass.getEOperations().get(16);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__CreateEImage__List()
  {
		return environmentFacadeEClass.getEOperations().get(17);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion()
  {
		return environmentFacadeEClass.getEOperations().get(18);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetBestResolutionRectangularRegionImage__List()
  {
		return environmentFacadeEClass.getEOperations().get(19);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d() {
		return environmentFacadeEClass.getEOperations().get(20);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d()
  {
		return environmentFacadeEClass.getEOperations().get(21);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d() {
		return environmentFacadeEClass.getEOperations().get(22);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d()
  {
		return environmentFacadeEClass.getEOperations().get(23);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion()
  {
		return environmentFacadeEClass.getEOperations().get(24);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4() {
		return environmentFacadeEClass.getEOperations().get(25);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d() {
		return environmentFacadeEClass.getEOperations().get(26);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d() {
		return environmentFacadeEClass.getEOperations().get(27);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetImageMapLayerPresentationImage__List() {
		return environmentFacadeEClass.getEOperations().get(28);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetBestResolutionMapLayer__List() {
		return environmentFacadeEClass.getEOperations().get(29);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetVisibleImageMapLayerPresentation__List() {
		return environmentFacadeEClass.getEOperations().get(30);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh() {
		return environmentFacadeEClass.getEOperations().get(31);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStar()
  {
		return starEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStar_Magnitude()
  {
		return (EAttribute)starEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStar_EquatorialCoordinates()
  {
		return (EReference)starEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStarField()
  {
		return starFieldEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getStarField_Stars()
  {
		return (EReference)starFieldEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStarField_StarFieldFileName()
  {
		return (EAttribute)starFieldEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAstronomyUtils()
  {
		return astronomyUtilsEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetSunEquatorialPosition__double()
  {
		return astronomyUtilsEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetHorizontalSunPosition__Date_double_double()
  {
		return astronomyUtilsEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetMoonEquatorialPosition__double()
  {
		return astronomyUtilsEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double()
  {
		return astronomyUtilsEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double()
  {
		return astronomyUtilsEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetTimeSinceJ2000__double()
  {
		return astronomyUtilsEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetLocalSideralTime__Date_double()
  {
		return astronomyUtilsEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetUTCDecimalHours__Date()
  {
		return astronomyUtilsEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date()
  {
		return astronomyUtilsEClass.getEOperations().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertTimeToAngle__int_int_int()
  {
		return astronomyUtilsEClass.getEOperations().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ClampAngleToZero2PI__double()
  {
		return astronomyUtilsEClass.getEOperations().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates()
  {
		return astronomyUtilsEClass.getEOperations().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates()
  {
		return astronomyUtilsEClass.getEOperations().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d()
  {
		return astronomyUtilsEClass.getEOperations().get(13);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d()
  {
		return astronomyUtilsEClass.getEOperations().get(14);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d()
  {
		return astronomyUtilsEClass.getEOperations().get(15);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d()
  {
		return astronomyUtilsEClass.getEOperations().get(16);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates()
  {
		return astronomyUtilsEClass.getEOperations().get(17);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates()
  {
		return astronomyUtilsEClass.getEOperations().get(18);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertAUtoMeters__double()
  {
		return astronomyUtilsEClass.getEOperations().get(19);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__GetMaximumSunAltitude__double()
  {
		return astronomyUtilsEClass.getEOperations().get(20);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getAstronomyUtils__ConvertToHHmmssString__double()
  {
		return astronomyUtilsEClass.getEOperations().get(21);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunRiseTime__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(22);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunSetTime__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(23);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAstronomyUtils__GetSunHighestElevationTime__Date_double_double() {
		return astronomyUtilsEClass.getEOperations().get(24);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMap()
  {
		return mapEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMap_Transformation()
  {
		return (EReference)mapEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMap_Layers()
  {
		return (EReference)mapEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMap_MapNode()
  {
		return (EReference)mapEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapsList()
  {
		return mapsListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapsList_Maps()
  {
		return (EReference)mapsListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapsList_MapsListNode()
  {
		return (EReference)mapsListEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractMapLayer()
  {
		return abstractMapLayerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractMapLayer_Map()
  {
		return (EReference)abstractMapLayerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractMapLayer_AbstractMapLayerNode()
  {
		return (EReference)abstractMapLayerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapLayerPresentation() {
		return mapLayerPresentationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMapLayerPresentation_Visible() {
		return (EAttribute)mapLayerPresentationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapLayerPresentation_MapLayer() {
		return (EReference)mapLayerPresentationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getURLMapLayer()
  {
		return urlMapLayerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getURLMapLayer_Url()
  {
		return (EAttribute)urlMapLayerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRegion()
  {
		return regionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRegion_Transformation()
  {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRectangularRegion()
  {
		return rectangularRegionEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRectangularRegion_XMin()
  {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRectangularRegion_XMax()
  {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRectangularRegion_YMin()
  {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRectangularRegion_YMax()
  {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRectangularRegion_XDimension()
  {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRectangularRegion_YDimension()
  {
		return (EAttribute)rectangularRegionEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRectangularRegion_LowerLeftCorner()
  {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRectangularRegion_UpperLeftCorner()
  {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRectangularRegion_LowerRightCorner()
  {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRectangularRegion_UpperRightCorner()
  {
		return (EReference)rectangularRegionEClass.getEStructuralFeatures().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularVolumeRegion() {
		return rectangularVolumeRegionEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularVolumeRegion_ZMin() {
		return (EAttribute)rectangularVolumeRegionEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularVolumeRegion_ZMax() {
		return (EAttribute)rectangularVolumeRegionEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangularVolumeRegion_ZDimension() {
		return (EAttribute)rectangularVolumeRegionEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangularRegionProvider() {
		return rectangularRegionProviderEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRectangularRegionProvider__GetRegion() {
		return rectangularRegionProviderEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRectangularRegionImage()
  {
		return rectangularRegionImageEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRectangularRegionImage__GetRegionImage()
  {
		return rectangularRegionImageEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRectangularRegionImage__GetResolution()
  {
		return rectangularRegionImageEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getImageMapLayer()
  {
		return imageMapLayerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageMapLayer_Width()
  {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageMapLayer_Height()
  {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageMapLayer_Opaque()
  {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getImageMapLayer_Image()
  {
		return (EReference)imageMapLayerEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getImageMapLayer_Legend()
  {
		return (EReference)imageMapLayerEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getImageMapLayer_Resolution()
  {
		return (EAttribute)imageMapLayerEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageMapLayer__UpdateImage__IProgressMonitor() {
		return imageMapLayerEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageMapLayer__GetImageMapLayerRegion() {
		return imageMapLayerEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageMapLayerPresentation() {
		return imageMapLayerPresentationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImageMapLayerPresentation_Alpha() {
		return (EAttribute)imageMapLayerPresentationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageMapLayerPresentation__GetImageMapLayer() {
		return imageMapLayerPresentationEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getURLImageMapLayer()
  {
		return urlImageMapLayerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getURLImageMapLayer_LegendURL()
  {
		return (EAttribute)urlImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyTreeMapLayer() {
		return topologyTreeMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTreeMapLayer_TopologyTreeRoot() {
		return (EReference)topologyTreeMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyTreeMapLayerNode() {
		return topologyTreeMapLayerNodeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTreeMapLayerNode_TopologyTreeMapLayer() {
		return (EReference)topologyTreeMapLayerNodeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyTreeMapLayerNode_TransientParent() {
		return (EReference)topologyTreeMapLayerNodeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshMapLayer() {
		return cartesianTriangularMeshMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshMapLayer_MeshIsDirty() {
		return (EAttribute)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshMapLayer_MapLayerPresentations() {
		return (EReference)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshMapLayer_TextureImage() {
		return (EReference)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode() {
		return (EReference)cartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshMapLayer__GetCurrentMesh() {
		return cartesianTriangularMeshMapLayerEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage() {
		return cartesianTriangularMeshMapLayerEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshDerivedImageMapLayer() {
		return cartesianTriangularMeshDerivedImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution() {
		return (EAttribute)cartesianTriangularMeshDerivedImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer() {
		return (EReference)cartesianTriangularMeshDerivedImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshSlopeImageMapLayer() {
		return cartesianTriangularMeshSlopeImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshSlopeImageMapLayer_AutoScale() {
		return (EAttribute)cartesianTriangularMeshSlopeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope() {
		return (EAttribute)cartesianTriangularMeshSlopeImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope() {
		return (EAttribute)cartesianTriangularMeshSlopeImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshDiscreteSlopeImageMapLayer() {
		return cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges() {
		return (EReference)cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshHeightImageMapLayer() {
		return cartesianTriangularMeshHeightImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshHeightImageMapLayer_AutoScale() {
		return (EAttribute)cartesianTriangularMeshHeightImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight() {
		return (EAttribute)cartesianTriangularMeshHeightImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight() {
		return (EAttribute)cartesianTriangularMeshHeightImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineOfSightImageMapLayer() {
		return lineOfSightImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_LineOfSightAvailableColor() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_LineOfSightNotAvailableColor() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLineOfSightImageMapLayer_ObserverPose() {
		return (EReference)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_TargetHeightAboveGround() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineOfSightImageMapLayer_UseHeightPerpendicularToGround() {
		return (EAttribute)lineOfSightImageMapLayerEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractShapeImageLayer() {
		return abstractShapeImageLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShapeImageLayer_ShapedFilled() {
		return (EAttribute)abstractShapeImageLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShapeImageLayer_Color() {
		return (EAttribute)abstractShapeImageLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractShapeImageLayer_RequiredResolution() {
		return (EAttribute)abstractShapeImageLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipseShapeImageLayer() {
		return ellipseShapeImageLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseShapeImageLayer_EllipseWidth() {
		return (EAttribute)ellipseShapeImageLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseShapeImageLayer_EllipseHeight() {
		return (EAttribute)ellipseShapeImageLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipseShapeImageLayer_ShowCenterLines() {
		return (EAttribute)ellipseShapeImageLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectangleShapeImageLayer() {
		return rectangleShapeImageLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleShapeImageLayer_RectangleWidth() {
		return (EAttribute)rectangleShapeImageLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleShapeImageLayer_RectangleHeight() {
		return (EAttribute)rectangleShapeImageLayerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRectangleShapeImageLayer_ShowCenterLines() {
		return (EAttribute)rectangleShapeImageLayerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolygonShapeImageMapLayer() {
		return polygonShapeImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPolygonShapeImageMapLayer__GetVertices() {
		return polygonShapeImageMapLayerEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianCoordinatesPolygonShapeImageMapLayer() {
		return cartesianCoordinatesPolygonShapeImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices() {
		return (EReference)cartesianCoordinatesPolygonShapeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeographicCoordinatesPolygonShapeImageMapLayer() {
		return geographicCoordinatesPolygonShapeImageMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates() {
		return (EReference)geographicCoordinatesPolygonShapeImageMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlopeRange() {
		return slopeRangeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeRange_SlopeLowerBound() {
		return (EAttribute)slopeRangeEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeRange_SlopeUpperBound() {
		return (EAttribute)slopeRangeEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlopeRange_Color() {
		return (EAttribute)slopeRangeEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicCartesianTriangularMeshMapLayer() {
		return basicCartesianTriangularMeshMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicCartesianTriangularMeshMapLayer_Mesh() {
		return (EReference)basicCartesianTriangularMeshMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getCartesianTriangularMeshURLMapLayer()
  {
		return cartesianTriangularMeshURLMapLayerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getCartesianTriangularMeshURLMapLayer_Mesh()
  {
		return (EReference)cartesianTriangularMeshURLMapLayerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesOfInterestMapLayer() {
		return featuresOfInterestMapLayerEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturesOfInterestMapLayer_Features() {
		return (EReference)featuresOfInterestMapLayerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getWorksiteNode()
  {
		return worksiteNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getWorksiteNode_Worksite()
  {
		return (EReference)worksiteNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSurfaceWorksiteNode()
  {
		return surfaceWorksiteNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSurfaceWorksiteNode()
  {
		return earthSurfaceWorksiteNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getEarthSurfaceWorksiteNode_SkyTransformNode()
  {
		return (EReference)earthSurfaceWorksiteNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapsListNode()
  {
		return mapsListNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapsListNode_MapsList()
  {
		return (EReference)mapsListNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapNode()
  {
		return mapNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapNode_Map()
  {
		return (EReference)mapNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractMapLayerNode()
  {
		return abstractMapLayerNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractMapLayerNode_AbstractMapLayer()
  {
		return (EReference)abstractMapLayerNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSkyNode()
  {
		return skyNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSkyNode_Sky()
  {
		return (EReference)skyNodeEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSkyNode()
  {
		return earthSkyNodeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianTriangularMeshMapLayerNode() {
		return cartesianTriangularMeshMapLayerNodeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer() {
		return cartesianTriangularMeshMapLayerNodeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getDate()
  {
		return dateEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint3d()
  {
		return point3dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor3f() {
		return color3fEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProgressMonitor() {
		return iProgressMonitorEDataType;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironmentFactory getSymphonyEnvironmentFactory()
  {
		return (SymphonyEnvironmentFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		worksiteEClass = createEClass(WORKSITE);
		createEReference(worksiteEClass, WORKSITE__WORKSITE_NODE);
		createEReference(worksiteEClass, WORKSITE__ORBITS_MODELS);
		createEReference(worksiteEClass, WORKSITE__ENVIRONMENT);

		surfaceWorksiteEClass = createEClass(SURFACE_WORKSITE);
		createEReference(surfaceWorksiteEClass, SURFACE_WORKSITE__SKY);
		createEReference(surfaceWorksiteEClass, SURFACE_WORKSITE__MAPS_LIST);

		earthSurfaceWorksiteEClass = createEClass(EARTH_SURFACE_WORKSITE);
		createEReference(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES);
		createEAttribute(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH);
		createEReference(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE__EARTH_SKY);
		createEOperation(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D);
		createEOperation(earthSurfaceWorksiteEClass, EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES);

		environmentEClass = createEClass(ENVIRONMENT);

		surfaceEnvironmentEClass = createEClass(SURFACE_ENVIRONMENT);
		createEReference(surfaceEnvironmentEClass, SURFACE_ENVIRONMENT__ATMOSPHERE);
		createEReference(surfaceEnvironmentEClass, SURFACE_ENVIRONMENT__GRAVITY);

		earthSurfaceEnvironmentEClass = createEClass(EARTH_SURFACE_ENVIRONMENT);

		atmosphereEClass = createEClass(ATMOSPHERE);
		createEAttribute(atmosphereEClass, ATMOSPHERE__WIND_SPEED);
		createEAttribute(atmosphereEClass, ATMOSPHERE__WIND_DIRECTION);
		createEAttribute(atmosphereEClass, ATMOSPHERE__TEMPERATURE);
		createEAttribute(atmosphereEClass, ATMOSPHERE__SURFACE_PRESSURE);
		createEAttribute(atmosphereEClass, ATMOSPHERE__SURFACE_DENSITY);

		atmosphereUtilsEClass = createEClass(ATMOSPHERE_UTILS);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_AIR_MASS__DOUBLE);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_DIRECT_SUN_INTENSITY__DOUBLE_DOUBLE);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_DIFFUSE_SUN_INTENSITY__DOUBLE_DOUBLE);
		createEOperation(atmosphereUtilsEClass, ATMOSPHERE_UTILS___GET_ATMOSPHERE_REFRACTION_CORRECTION__DOUBLE);

		equatorialCoordinatesEClass = createEClass(EQUATORIAL_COORDINATES);
		createEAttribute(equatorialCoordinatesEClass, EQUATORIAL_COORDINATES__RIGHT_ASCENSION);
		createEAttribute(equatorialCoordinatesEClass, EQUATORIAL_COORDINATES__DECLINATION);
		createEAttribute(equatorialCoordinatesEClass, EQUATORIAL_COORDINATES__RADIUS);

		geographicCoordinatesEClass = createEClass(GEOGRAPHIC_COORDINATES);
		createEAttribute(geographicCoordinatesEClass, GEOGRAPHIC_COORDINATES__LONGITUDE);
		createEAttribute(geographicCoordinatesEClass, GEOGRAPHIC_COORDINATES__LATITUDE);
		createEAttribute(geographicCoordinatesEClass, GEOGRAPHIC_COORDINATES__ELEVATION);

		horizontalCoordinatesEClass = createEClass(HORIZONTAL_COORDINATES);
		createEAttribute(horizontalCoordinatesEClass, HORIZONTAL_COORDINATES__ALTITUDE);
		createEAttribute(horizontalCoordinatesEClass, HORIZONTAL_COORDINATES__AZIMUTH);
		createEAttribute(horizontalCoordinatesEClass, HORIZONTAL_COORDINATES__RADIUS);

		eclipticCoordinatesEClass = createEClass(ECLIPTIC_COORDINATES);
		createEAttribute(eclipticCoordinatesEClass, ECLIPTIC_COORDINATES__LONGITUDE);
		createEAttribute(eclipticCoordinatesEClass, ECLIPTIC_COORDINATES__LATITUDE);
		createEAttribute(eclipticCoordinatesEClass, ECLIPTIC_COORDINATES__RADIUS);

		skyEClass = createEClass(SKY);
		createEReference(skyEClass, SKY__SURFACE_WORKSITE);
		createEReference(skyEClass, SKY__SKY_NODE);
		createEReference(skyEClass, SKY__SUN);
		createEReference(skyEClass, SKY__SUN_HORIZONTAL_COORDINATES);
		createEReference(skyEClass, SKY__STAR_FIELD);
		createEOperation(skyEClass, SKY___GET_SUN_ANGULAR_DIAMETER);

		earthSkyEClass = createEClass(EARTH_SKY);
		createEReference(earthSkyEClass, EARTH_SKY__MOON);
		createEReference(earthSkyEClass, EARTH_SKY__MOON_HORIZONTAL_COORDINATES);
		createEOperation(earthSkyEClass, EARTH_SKY___GET_MOON_ANGULAR_DIAMETER);

		sunEClass = createEClass(SUN);
		createEAttribute(sunEClass, SUN__RADIUS);
		createEOperation(sunEClass, SUN___GET_IRRADIANCE__DOUBLE);

		earthEClass = createEClass(EARTH);
		createEAttribute(earthEClass, EARTH__RADIUS);

		moonEClass = createEClass(MOON);
		createEAttribute(moonEClass, MOON__RADIUS);

		environmentUtilitiesEClass = createEClass(ENVIRONMENT_UTILITIES);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___CONVERT_TO_JULIAN_DATE__DATE);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___PARSE_RIGHT_ASCENSION__STRING);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___PARSE_DEG_MIN_SEC__STRING);
		createEOperation(environmentUtilitiesEClass, ENVIRONMENT_UTILITIES___SORT_BY_MAGNITUDE__LIST);

		environmentFacadeEClass = createEClass(ENVIRONMENT_FACADE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_STARS);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_DEFAULT_CSA_WORKSITE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___INITIALIZE_SKY_NODE__SKY_SKYNODE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___INITIALIZE_EARTH_SKY_NODE__EARTHSKY_EARTHSKYNODE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_MARS_YARD_GEOGRAPHICAL_COORDINATES);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___CREATE_STAR__FLOAT_DOUBLE_DOUBLE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_MARS_YARD_TRANSFORM_NODE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_SURFACE_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___CREATE_AND_INITIALIZE_EARTH_ATMOSPHERE);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_SUN_VECTOR__SYMPHONYSYSTEM_STRING_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_SUN_VECTOR__NODE_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_MOON_VECTOR__SYMPHONYSYSTEM_STRING_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_MOON_VECTOR__NODE_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_VECTOR__NODE_SYMPHONYSYSTEM_CONNECTIONPOINT_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_SYMPHONYSYSTEM_CONNECTIONPOINT_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_SYMPHONYSYSTEM_STRING_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_VECTOR__SYMPHONYSYSTEM_STRING_STRING_STRING_ENVIRONMENT);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___CREATE_EIMAGE__LIST);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_ABSOLUTE_RECTANGULAR_REGION_CORNERS__RECTANGULARREGION);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_RECTANGULAR_REGION_IMAGE__LIST);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__RECTANGULARREGIONPROVIDER_TUPLE3D_TUPLE3D);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__RECTANGULARREGIONIMAGE_TUPLE3D_TUPLE3D);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_EXTENT__LIST_TUPLE3D_TUPLE3D);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_RECTANGULAR_REGION_IMAGE_EXTENT__LIST_TUPLE3D_TUPLE3D);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___FITS_INSIDE__RECTANGULARREGION_RECTANGULARREGION);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___INTERSECTS__RECTANGULARREGION_RECTANGULARREGION_MATRIX4X4);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__IMAGEMAPLAYERPRESENTATION_TUPLE3D_TUPLE3D);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_EXTENT__LIST_TUPLE3D_TUPLE3D);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__LIST);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_BEST_RESOLUTION_MAP_LAYER__LIST);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_VISIBLE_IMAGE_MAP_LAYER_PRESENTATION__LIST);
		createEOperation(environmentFacadeEClass, ENVIRONMENT_FACADE___GET_RECTANGULAR_VOLUME_REGION__CARTESIANTRIANGULARMESH);

		starEClass = createEClass(STAR);
		createEAttribute(starEClass, STAR__MAGNITUDE);
		createEReference(starEClass, STAR__EQUATORIAL_COORDINATES);

		starFieldEClass = createEClass(STAR_FIELD);
		createEReference(starFieldEClass, STAR_FIELD__STARS);
		createEAttribute(starFieldEClass, STAR_FIELD__STAR_FIELD_FILE_NAME);

		astronomyUtilsEClass = createEClass(ASTRONOMY_UTILS);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_EQUATORIAL_POSITION__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_HORIZONTAL_SUN_POSITION__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_MOON_EQUATORIAL_POSITION__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_MOON_TOPOCENTRIC_EQUATORIAL_POSITION__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_HORIZONTAL_MOON_POSITION__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_TIME_SINCE_J2000__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_LOCAL_SIDERAL_TIME__DATE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_UTC_DECIMAL_HOURS__DATE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_HORIZONTAL_COORDINATES__EQUATORIALCOORDINATES_DOUBLE_DOUBLE_DATE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TIME_TO_ANGLE__INT_INT_INT);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CLAMP_ANGLE_TO_ZERO2_PI__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_EQUATORIAL_COORDINATES__ECLIPTICCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_ECLIPTIC_COORDINATES__EQUATORIALCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_ECLIPTIC_RECTANGULAR__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_EQUATORIAL_RECTANGULAR__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_ECLIPTIC_COORDINATES__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_EQUATORIAL_COORDINATES__POINT3D);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_HORIZONTAL_COORDINATES_TO_HORIZONTAL_RECTANGULAR__HORIZONTALCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_COORDINATES_TO_EQUATORIAL_RECTANGULAR__EQUATORIALCOORDINATES);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_AUTO_METERS__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_MAXIMUM_SUN_ALTITUDE__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___CONVERT_TO_HHMMSS_STRING__DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_RISE_TIME__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_SET_TIME__DATE_DOUBLE_DOUBLE);
		createEOperation(astronomyUtilsEClass, ASTRONOMY_UTILS___GET_SUN_HIGHEST_ELEVATION_TIME__DATE_DOUBLE_DOUBLE);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__TRANSFORMATION);
		createEReference(mapEClass, MAP__LAYERS);
		createEReference(mapEClass, MAP__MAP_NODE);

		mapsListEClass = createEClass(MAPS_LIST);
		createEReference(mapsListEClass, MAPS_LIST__MAPS);
		createEReference(mapsListEClass, MAPS_LIST__MAPS_LIST_NODE);

		abstractMapLayerEClass = createEClass(ABSTRACT_MAP_LAYER);
		createEReference(abstractMapLayerEClass, ABSTRACT_MAP_LAYER__MAP);
		createEReference(abstractMapLayerEClass, ABSTRACT_MAP_LAYER__ABSTRACT_MAP_LAYER_NODE);

		mapLayerPresentationEClass = createEClass(MAP_LAYER_PRESENTATION);
		createEAttribute(mapLayerPresentationEClass, MAP_LAYER_PRESENTATION__VISIBLE);
		createEReference(mapLayerPresentationEClass, MAP_LAYER_PRESENTATION__MAP_LAYER);

		urlMapLayerEClass = createEClass(URL_MAP_LAYER);
		createEAttribute(urlMapLayerEClass, URL_MAP_LAYER__URL);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__TRANSFORMATION);

		rectangularRegionEClass = createEClass(RECTANGULAR_REGION);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__XMIN);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__XMAX);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__YMIN);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__YMAX);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__XDIMENSION);
		createEAttribute(rectangularRegionEClass, RECTANGULAR_REGION__YDIMENSION);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__LOWER_LEFT_CORNER);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__UPPER_LEFT_CORNER);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__LOWER_RIGHT_CORNER);
		createEReference(rectangularRegionEClass, RECTANGULAR_REGION__UPPER_RIGHT_CORNER);

		rectangularVolumeRegionEClass = createEClass(RECTANGULAR_VOLUME_REGION);
		createEAttribute(rectangularVolumeRegionEClass, RECTANGULAR_VOLUME_REGION__ZMIN);
		createEAttribute(rectangularVolumeRegionEClass, RECTANGULAR_VOLUME_REGION__ZMAX);
		createEAttribute(rectangularVolumeRegionEClass, RECTANGULAR_VOLUME_REGION__ZDIMENSION);

		rectangularRegionProviderEClass = createEClass(RECTANGULAR_REGION_PROVIDER);
		createEOperation(rectangularRegionProviderEClass, RECTANGULAR_REGION_PROVIDER___GET_REGION);

		rectangularRegionImageEClass = createEClass(RECTANGULAR_REGION_IMAGE);
		createEOperation(rectangularRegionImageEClass, RECTANGULAR_REGION_IMAGE___GET_REGION_IMAGE);
		createEOperation(rectangularRegionImageEClass, RECTANGULAR_REGION_IMAGE___GET_RESOLUTION);

		imageMapLayerEClass = createEClass(IMAGE_MAP_LAYER);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__WIDTH);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__HEIGHT);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__OPAQUE);
		createEReference(imageMapLayerEClass, IMAGE_MAP_LAYER__IMAGE);
		createEReference(imageMapLayerEClass, IMAGE_MAP_LAYER__LEGEND);
		createEAttribute(imageMapLayerEClass, IMAGE_MAP_LAYER__RESOLUTION);
		createEOperation(imageMapLayerEClass, IMAGE_MAP_LAYER___UPDATE_IMAGE__IPROGRESSMONITOR);
		createEOperation(imageMapLayerEClass, IMAGE_MAP_LAYER___GET_IMAGE_MAP_LAYER_REGION);

		imageMapLayerPresentationEClass = createEClass(IMAGE_MAP_LAYER_PRESENTATION);
		createEAttribute(imageMapLayerPresentationEClass, IMAGE_MAP_LAYER_PRESENTATION__ALPHA);
		createEOperation(imageMapLayerPresentationEClass, IMAGE_MAP_LAYER_PRESENTATION___GET_IMAGE_MAP_LAYER);

		urlImageMapLayerEClass = createEClass(URL_IMAGE_MAP_LAYER);
		createEAttribute(urlImageMapLayerEClass, URL_IMAGE_MAP_LAYER__LEGEND_URL);

		topologyTreeMapLayerEClass = createEClass(TOPOLOGY_TREE_MAP_LAYER);
		createEReference(topologyTreeMapLayerEClass, TOPOLOGY_TREE_MAP_LAYER__TOPOLOGY_TREE_ROOT);

		topologyTreeMapLayerNodeEClass = createEClass(TOPOLOGY_TREE_MAP_LAYER_NODE);
		createEReference(topologyTreeMapLayerNodeEClass, TOPOLOGY_TREE_MAP_LAYER_NODE__TOPOLOGY_TREE_MAP_LAYER);
		createEReference(topologyTreeMapLayerNodeEClass, TOPOLOGY_TREE_MAP_LAYER_NODE__TRANSIENT_PARENT);

		cartesianTriangularMeshMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY);
		createEReference(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MAP_LAYER_PRESENTATIONS);
		createEReference(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE);
		createEReference(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE);
		createEOperation(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___GET_CURRENT_MESH);
		createEOperation(cartesianTriangularMeshMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER___FORCE_UPDATE_TEXTURE_IMAGE);

		cartesianTriangularMeshDerivedImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshDerivedImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__REQUIRED_RESOLUTION);
		createEReference(cartesianTriangularMeshDerivedImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_DERIVED_IMAGE_MAP_LAYER__CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);

		cartesianTriangularMeshSlopeImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE);
		createEAttribute(cartesianTriangularMeshSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE);
		createEAttribute(cartesianTriangularMeshSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE);

		cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER);
		createEReference(cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_DISCRETE_SLOPE_IMAGE_MAP_LAYER__SLOPE_RANGES);

		cartesianTriangularMeshHeightImageMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER);
		createEAttribute(cartesianTriangularMeshHeightImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__AUTO_SCALE);
		createEAttribute(cartesianTriangularMeshHeightImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MINIMUM_HEIGHT);
		createEAttribute(cartesianTriangularMeshHeightImageMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_HEIGHT_IMAGE_MAP_LAYER__MAXIMUM_HEIGHT);

		slopeRangeEClass = createEClass(SLOPE_RANGE);
		createEAttribute(slopeRangeEClass, SLOPE_RANGE__SLOPE_LOWER_BOUND);
		createEAttribute(slopeRangeEClass, SLOPE_RANGE__SLOPE_UPPER_BOUND);
		createEAttribute(slopeRangeEClass, SLOPE_RANGE__COLOR);

		lineOfSightImageMapLayerEClass = createEClass(LINE_OF_SIGHT_IMAGE_MAP_LAYER);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR);
		createEReference(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND);
		createEAttribute(lineOfSightImageMapLayerEClass, LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND);

		abstractShapeImageLayerEClass = createEClass(ABSTRACT_SHAPE_IMAGE_LAYER);
		createEAttribute(abstractShapeImageLayerEClass, ABSTRACT_SHAPE_IMAGE_LAYER__SHAPED_FILLED);
		createEAttribute(abstractShapeImageLayerEClass, ABSTRACT_SHAPE_IMAGE_LAYER__COLOR);
		createEAttribute(abstractShapeImageLayerEClass, ABSTRACT_SHAPE_IMAGE_LAYER__REQUIRED_RESOLUTION);

		ellipseShapeImageLayerEClass = createEClass(ELLIPSE_SHAPE_IMAGE_LAYER);
		createEAttribute(ellipseShapeImageLayerEClass, ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_WIDTH);
		createEAttribute(ellipseShapeImageLayerEClass, ELLIPSE_SHAPE_IMAGE_LAYER__ELLIPSE_HEIGHT);
		createEAttribute(ellipseShapeImageLayerEClass, ELLIPSE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES);

		rectangleShapeImageLayerEClass = createEClass(RECTANGLE_SHAPE_IMAGE_LAYER);
		createEAttribute(rectangleShapeImageLayerEClass, RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH);
		createEAttribute(rectangleShapeImageLayerEClass, RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT);
		createEAttribute(rectangleShapeImageLayerEClass, RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES);

		polygonShapeImageMapLayerEClass = createEClass(POLYGON_SHAPE_IMAGE_MAP_LAYER);
		createEOperation(polygonShapeImageMapLayerEClass, POLYGON_SHAPE_IMAGE_MAP_LAYER___GET_VERTICES);

		cartesianCoordinatesPolygonShapeImageMapLayerEClass = createEClass(CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER);
		createEReference(cartesianCoordinatesPolygonShapeImageMapLayerEClass, CARTESIAN_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES);

		geographicCoordinatesPolygonShapeImageMapLayerEClass = createEClass(GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER);
		createEReference(geographicCoordinatesPolygonShapeImageMapLayerEClass, GEOGRAPHIC_COORDINATES_POLYGON_SHAPE_IMAGE_MAP_LAYER__POLYGON_VERTICES_GEOGRAPHIC_COORDINATES);

		basicCartesianTriangularMeshMapLayerEClass = createEClass(BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);
		createEReference(basicCartesianTriangularMeshMapLayerEClass, BASIC_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH);

		cartesianTriangularMeshURLMapLayerEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER);
		createEReference(cartesianTriangularMeshURLMapLayerEClass, CARTESIAN_TRIANGULAR_MESH_URL_MAP_LAYER__MESH);

		featuresOfInterestMapLayerEClass = createEClass(FEATURES_OF_INTEREST_MAP_LAYER);
		createEReference(featuresOfInterestMapLayerEClass, FEATURES_OF_INTEREST_MAP_LAYER__FEATURES);

		worksiteNodeEClass = createEClass(WORKSITE_NODE);
		createEReference(worksiteNodeEClass, WORKSITE_NODE__WORKSITE);

		surfaceWorksiteNodeEClass = createEClass(SURFACE_WORKSITE_NODE);

		earthSurfaceWorksiteNodeEClass = createEClass(EARTH_SURFACE_WORKSITE_NODE);
		createEReference(earthSurfaceWorksiteNodeEClass, EARTH_SURFACE_WORKSITE_NODE__SKY_TRANSFORM_NODE);

		mapsListNodeEClass = createEClass(MAPS_LIST_NODE);
		createEReference(mapsListNodeEClass, MAPS_LIST_NODE__MAPS_LIST);

		mapNodeEClass = createEClass(MAP_NODE);
		createEReference(mapNodeEClass, MAP_NODE__MAP);

		abstractMapLayerNodeEClass = createEClass(ABSTRACT_MAP_LAYER_NODE);
		createEReference(abstractMapLayerNodeEClass, ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER);

		skyNodeEClass = createEClass(SKY_NODE);
		createEReference(skyNodeEClass, SKY_NODE__SKY);

		earthSkyNodeEClass = createEClass(EARTH_SKY_NODE);

		cartesianTriangularMeshMapLayerNodeEClass = createEClass(CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE);
		createEOperation(cartesianTriangularMeshMapLayerNodeEClass, CARTESIAN_TRIANGULAR_MESH_MAP_LAYER_NODE___GET_CARTESIAN_TRIANGULAR_MESH_MAP_LAYER);

		// Create data types
		listEDataType = createEDataType(LIST);
		sortedSetEDataType = createEDataType(SORTED_SET);
		dateEDataType = createEDataType(DATE);
		point3dEDataType = createEDataType(POINT3D);
		color3fEDataType = createEDataType(COLOR3F);
		iProgressMonitorEDataType = createEDataType(IPROGRESS_MONITOR);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SymphonyCorePackage theSymphonyCorePackage = (SymphonyCorePackage)EPackage.Registry.INSTANCE.getEPackage(SymphonyCorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MathPackage theMathPackage = (MathPackage)EPackage.Registry.INSTANCE.getEPackage(MathPackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);
		TopologyPackage theTopologyPackage = (TopologyPackage)EPackage.Registry.INSTANCE.getEPackage(TopologyPackage.eNS_URI);
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		ImagesCorePackage theImagesCorePackage = (ImagesCorePackage)EPackage.Registry.INSTANCE.getEPackage(ImagesCorePackage.eNS_URI);
		Data3dPackage theData3dPackage = (Data3dPackage)EPackage.Registry.INSTANCE.getEPackage(Data3dPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		worksiteEClass.getESuperTypes().add(theSymphonyCorePackage.getAbstractWorksite());
		surfaceWorksiteEClass.getESuperTypes().add(this.getWorksite());
		earthSurfaceWorksiteEClass.getESuperTypes().add(this.getSurfaceWorksite());
		environmentEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		environmentEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		surfaceEnvironmentEClass.getESuperTypes().add(this.getEnvironment());
		earthSurfaceEnvironmentEClass.getESuperTypes().add(this.getSurfaceEnvironment());
		skyEClass.getESuperTypes().add(theEMFEcorePackage.getTimed());
		earthSkyEClass.getESuperTypes().add(this.getSky());
		sunEClass.getESuperTypes().add(theTopologyPackage.getGroupNode());
		earthEClass.getESuperTypes().add(theTopologyPackage.getGroupNode());
		moonEClass.getESuperTypes().add(theTopologyPackage.getGroupNode());
		starFieldEClass.getESuperTypes().add(theTopologyPackage.getNode());
		mapEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		mapEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		abstractMapLayerEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		abstractMapLayerEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		mapLayerPresentationEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		mapLayerPresentationEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		urlMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		rectangularRegionEClass.getESuperTypes().add(this.getRegion());
		rectangularVolumeRegionEClass.getESuperTypes().add(this.getRectangularRegion());
		rectangularRegionImageEClass.getESuperTypes().add(this.getRectangularRegionProvider());
		imageMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		imageMapLayerEClass.getESuperTypes().add(this.getRectangularRegionImage());
		imageMapLayerPresentationEClass.getESuperTypes().add(this.getMapLayerPresentation());
		imageMapLayerPresentationEClass.getESuperTypes().add(this.getRectangularRegionImage());
		urlImageMapLayerEClass.getESuperTypes().add(this.getImageMapLayer());
		urlImageMapLayerEClass.getESuperTypes().add(this.getURLMapLayer());
		topologyTreeMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		topologyTreeMapLayerNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		cartesianTriangularMeshMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		cartesianTriangularMeshDerivedImageMapLayerEClass.getESuperTypes().add(this.getImageMapLayer());
		cartesianTriangularMeshSlopeImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshDerivedImageMapLayer());
		cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshSlopeImageMapLayer());
		cartesianTriangularMeshHeightImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshDerivedImageMapLayer());
		slopeRangeEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		slopeRangeEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		lineOfSightImageMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshDerivedImageMapLayer());
		abstractShapeImageLayerEClass.getESuperTypes().add(this.getImageMapLayer());
		ellipseShapeImageLayerEClass.getESuperTypes().add(this.getAbstractShapeImageLayer());
		rectangleShapeImageLayerEClass.getESuperTypes().add(this.getAbstractShapeImageLayer());
		polygonShapeImageMapLayerEClass.getESuperTypes().add(this.getAbstractShapeImageLayer());
		cartesianCoordinatesPolygonShapeImageMapLayerEClass.getESuperTypes().add(this.getPolygonShapeImageMapLayer());
		geographicCoordinatesPolygonShapeImageMapLayerEClass.getESuperTypes().add(this.getPolygonShapeImageMapLayer());
		basicCartesianTriangularMeshMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshMapLayer());
		cartesianTriangularMeshURLMapLayerEClass.getESuperTypes().add(this.getCartesianTriangularMeshMapLayer());
		cartesianTriangularMeshURLMapLayerEClass.getESuperTypes().add(this.getURLMapLayer());
		featuresOfInterestMapLayerEClass.getESuperTypes().add(this.getAbstractMapLayer());
		featuresOfInterestMapLayerEClass.getESuperTypes().add(this.getRectangularRegionProvider());
		worksiteNodeEClass.getESuperTypes().add(theTopologyPackage.getGroupNode());
		surfaceWorksiteNodeEClass.getESuperTypes().add(this.getWorksiteNode());
		earthSurfaceWorksiteNodeEClass.getESuperTypes().add(this.getSurfaceWorksiteNode());
		mapsListNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		mapNodeEClass.getESuperTypes().add(theTopologyPackage.getTransformNode());
		abstractMapLayerNodeEClass.getESuperTypes().add(theTopologyPackage.getAggregateGroupNode());
		skyNodeEClass.getESuperTypes().add(theTopologyPackage.getGroupNode());
		earthSkyNodeEClass.getESuperTypes().add(this.getSkyNode());
		cartesianTriangularMeshMapLayerNodeEClass.getESuperTypes().add(this.getAbstractMapLayerNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(worksiteEClass, Worksite.class, "Worksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksite_WorksiteNode(), this.getWorksiteNode(), null, "worksiteNode", null, 1, 1, Worksite.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getWorksite_OrbitsModels(), theSymphonyCorePackage.getAbstractOrbitModel(), null, "orbitsModels", null, 0, -1, Worksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorksite_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Worksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceWorksiteEClass, SurfaceWorksite.class, "SurfaceWorksite", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurfaceWorksite_Sky(), this.getSky(), this.getSky_SurfaceWorksite(), "sky", null, 1, 1, SurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceWorksite_MapsList(), this.getMapsList(), null, "mapsList", null, 1, 1, SurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSurfaceWorksiteEClass, EarthSurfaceWorksite.class, "EarthSurfaceWorksite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceWorksite_GeographicalCoordinates(), this.getGeographicCoordinates(), null, "geographicalCoordinates", null, 1, 1, EarthSurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksite_XAxisAzimuth(), theEcorePackage.getEDouble(), "xAxisAzimuth", "0", 0, 1, EarthSurfaceWorksite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEarthSurfaceWorksite_EarthSky(), this.getEarthSky(), null, "earthSky", null, 1, 1, EarthSurfaceWorksite.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d(), this.getGeographicCoordinates(), "convertToGeographicCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "position", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates(), theMathPackage.getTuple3d(), "convertToXYZPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGeographicCoordinates(), "geographicalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(surfaceEnvironmentEClass, SurfaceEnvironment.class, "SurfaceEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSurfaceEnvironment_Atmosphere(), this.getAtmosphere(), null, "atmosphere", null, 0, 1, SurfaceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSurfaceEnvironment_Gravity(), theMathPackage.getTuple3d(), null, "gravity", null, 0, 1, SurfaceEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSurfaceEnvironmentEClass, EarthSurfaceEnvironment.class, "EarthSurfaceEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atmosphereEClass, Atmosphere.class, "Atmosphere", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAtmosphere_WindSpeed(), theEcorePackage.getEDouble(), "windSpeed", null, 0, 1, Atmosphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtmosphere_WindDirection(), theEcorePackage.getEDouble(), "windDirection", null, 0, 1, Atmosphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtmosphere_Temperature(), theEcorePackage.getEDouble(), "temperature", null, 0, 1, Atmosphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtmosphere_SurfacePressure(), theEcorePackage.getEDouble(), "surfacePressure", null, 0, 1, Atmosphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtmosphere_SurfaceDensity(), theEcorePackage.getEDouble(), "surfaceDensity", null, 0, 1, Atmosphere.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atmosphereUtilsEClass, AtmosphereUtils.class, "AtmosphereUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAtmosphereUtils__GetAirMass__double(), theEcorePackage.getEDouble(), "getAirMass", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitudeAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtmosphereUtils__GetDirectSunIntensity__double_double(), theEcorePackage.getEDouble(), "getDirectSunIntensity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitudeAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "heightAboveSeaLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtmosphereUtils__GetDiffuseSunIntensity__double_double(), theEcorePackage.getEDouble(), "getDiffuseSunIntensity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitudeAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "heightAboveSeaLevel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAtmosphereUtils__GetAtmosphereRefractionCorrection__double(), theEcorePackage.getEDouble(), "getAtmosphereRefractionCorrection", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "geometricAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(equatorialCoordinatesEClass, EquatorialCoordinates.class, "EquatorialCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquatorialCoordinates_RightAscension(), theEcorePackage.getEDouble(), "rightAscension", null, 0, 1, EquatorialCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquatorialCoordinates_Declination(), theEcorePackage.getEDouble(), "declination", null, 0, 1, EquatorialCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEquatorialCoordinates_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, EquatorialCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geographicCoordinatesEClass, GeographicCoordinates.class, "GeographicCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeographicCoordinates_Longitude(), theEcorePackage.getEDouble(), "longitude", null, 0, 1, GeographicCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeographicCoordinates_Latitude(), theEcorePackage.getEDouble(), "latitude", null, 0, 1, GeographicCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeographicCoordinates_Elevation(), theEcorePackage.getEDouble(), "elevation", null, 0, 1, GeographicCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalCoordinatesEClass, HorizontalCoordinates.class, "HorizontalCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHorizontalCoordinates_Altitude(), theEcorePackage.getEDouble(), "altitude", null, 0, 1, HorizontalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalCoordinates_Azimuth(), theEcorePackage.getEDouble(), "azimuth", null, 0, 1, HorizontalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHorizontalCoordinates_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, HorizontalCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eclipticCoordinatesEClass, EclipticCoordinates.class, "EclipticCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEclipticCoordinates_Longitude(), theEcorePackage.getEDouble(), "longitude", null, 0, 1, EclipticCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipticCoordinates_Latitude(), theEcorePackage.getEDouble(), "latitude", null, 0, 1, EclipticCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEclipticCoordinates_Radius(), theEcorePackage.getEDouble(), "radius", null, 0, 1, EclipticCoordinates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skyEClass, Sky.class, "Sky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSky_SurfaceWorksite(), this.getSurfaceWorksite(), this.getSurfaceWorksite_Sky(), "surfaceWorksite", null, 0, 1, Sky.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSky_SkyNode(), this.getSkyNode(), null, "skyNode", null, 1, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSky_Sun(), this.getSun(), null, "sun", null, 0, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSky_SunHorizontalCoordinates(), this.getHorizontalCoordinates(), null, "sunHorizontalCoordinates", null, 0, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSky_StarField(), this.getStarField(), null, "starField", null, 0, 1, Sky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getSky__GetSunAngularDiameter(), theEcorePackage.getEDouble(), "getSunAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthSkyEClass, EarthSky.class, "EarthSky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSky_Moon(), this.getMoon(), null, "moon", null, 0, 1, EarthSky.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getEarthSky_MoonHorizontalCoordinates(), this.getHorizontalCoordinates(), null, "moonHorizontalCoordinates", null, 0, 1, EarthSky.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getEarthSky__GetMoonAngularDiameter(), theEcorePackage.getEDouble(), "getMoonAngularDiameter", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(sunEClass, Sun.class, "Sun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSun_Radius(), theEcorePackage.getEDouble(), "radius", "6.955E8", 0, 1, Sun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getSun__GetIrradiance__double(), theEcorePackage.getEDouble(), "getIrradiance", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "radius", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(earthEClass, Earth.class, "Earth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEarth_Radius(), theEcorePackage.getEDouble(), "radius", "6371000", 0, 1, Earth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moonEClass, Moon.class, "Moon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoon_Radius(), theEcorePackage.getEDouble(), "radius", "1737100", 0, 1, Moon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentUtilitiesEClass, EnvironmentUtilities.class, "EnvironmentUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEnvironmentUtilities__ConvertToJulianDate__Date(), theEcorePackage.getEDouble(), "convertToJulianDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUtilities__ParseRightAscension__String(), theEcorePackage.getEFloat(), "parseRightAscension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "rightAscensionString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEException(op, theEMFEcorePackage.getException());

		op = initEOperation(getEnvironmentUtilities__ParseDegMinSec__String(), theEcorePackage.getEFloat(), "parseDegMinSec", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "degMinSecAngleString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUtilities__SortByMagnitude__List(), null, "sortByMagnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getStar());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "stars", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getStar());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(environmentFacadeEClass, EnvironmentFacade.class, "EnvironmentFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEnvironmentFacade__CreateAndInitializeStars(), this.getStarField(), "createAndInitializeStars", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite(), this.getEarthSurfaceWorksite(), "createAndInitializeDefaultCSAWorksite", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__InitializeSkyNode__Sky_SkyNode(), null, "initializeSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSky(), "sky", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSkyNode(), "skyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__InitializeEarthSkyNode__EarthSky_EarthSkyNode(), null, "initializeEarthSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSky(), "earthSky", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEarthSkyNode(), "earthSkyNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnvironmentFacade__GetMarsYardGeographicalCoordinates(), this.getGeographicCoordinates(), "getMarsYardGeographicalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__CreateStar__float_double_double(), this.getStar(), "createStar", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "rightAscension", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "declination", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnvironmentFacade__GetMarsYardTransformNode(), theTopologyPackage.getTransformNode(), "getMarsYardTransformNode", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnvironmentFacade__CreateAndInitializeEarthSurfaceEnvironment(), this.getEarthSurfaceEnvironment(), "createAndInitializeEarthSurfaceEnvironment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnvironmentFacade__CreateAndInitializeEarthAtmosphere(), this.getAtmosphere(), "createAndInitializeEarthAtmosphere", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetSunVector__SymphonySystem_String_Environment(), theMathPackage.getTuple3d(), "getSunVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "symphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetSunVector__Node_Environment(), theMathPackage.getTuple3d(), "getSunVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetMoonVector__SymphonySystem_String_Environment(), theMathPackage.getTuple3d(), "getMoonVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "symphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetMoonVector__Node_Environment(), theMathPackage.getTuple3d(), "getMoonVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetVector__Node_SymphonySystem_ConnectionPoint_Environment(), theMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTopologyPackage.getNode(), "node", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "targetSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getConnectionPoint(), "connectionPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetVector__SymphonySystem_String_SymphonySystem_ConnectionPoint_Environment(), theMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "sourceSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "targetSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getConnectionPoint(), "connectionPoint", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetVector__SymphonySystem_String_SymphonySystem_String_Environment(), theMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "sourceSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "targetSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "connectionPointName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetVector__SymphonySystem_String_String_String_Environment(), theMathPackage.getTuple3d(), "getVector", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphonyCorePackage.getSymphonySystem(), "sourceSymphonySystem", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "nodeID", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "targetSystemfullyQualifiedName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "connectionPointName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getEnvironment(), "environment", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__CreateEImage__List(), theImagesCorePackage.getAbstractEImage(), "createEImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getRectangularRegionImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionImages", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion(), null, "getAbsoluteRectangularRegionCorners", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theMathPackage.getTuple3d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnvironmentFacade__GetBestResolutionRectangularRegionImage__List(), this.getRectangularRegionImage(), "getBestResolutionRectangularRegionImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getRectangularRegionImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionImages", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d(), null, "getRectangularRegionExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegionProvider(), "rectangularRegionProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d(), null, "getRectangularRegionImageExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegionImage(), "rectangularRegionImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d(), null, "getRectangularRegionExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getRectangularRegionProvider());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionProviders", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d(), null, "getRectangularRegionImageExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(this.getRectangularRegionImage());
		g2.setEUpperBound(g3);
		addEParameter(op, g1, "rectangularRegionImages", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion(), theEcorePackage.getEBoolean(), "fitsInside", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionA", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionB", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4(), theEcorePackage.getEBoolean(), "intersects", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionA", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRectangularRegion(), "rectangularRegionB", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getMatrix4x4(), "transformAToB", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetImageMapLayerPresentationExtent__ImageMapLayerPresentation_Tuple3d_Tuple3d(), null, "getImageMapLayerPresentationExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getImageMapLayerPresentation(), "imageMapLayerPresentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetImageMapLayerPresentationExtent__List_Tuple3d_Tuple3d(), null, "getImageMapLayerPresentationExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "lowerLeftCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theMathPackage.getTuple3d(), "upperRightCorner", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetImageMapLayerPresentationImage__List(), theImagesCorePackage.getAbstractEImage(), "getImageMapLayerPresentationImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetBestResolutionMapLayer__List(), this.getImageMapLayerPresentation(), "getBestResolutionMapLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentFacade__GetVisibleImageMapLayerPresentation__List(), null, "getVisibleImageMapLayerPresentation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "imageMapLayerPresentations", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getImageMapLayerPresentation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh(), this.getRectangularVolumeRegion(), "getRectangularVolumeRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theData3dPackage.getCartesianTriangularMesh(), "mesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(starEClass, Star.class, "Star", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStar_Magnitude(), theEcorePackage.getEFloat(), "magnitude", null, 0, 1, Star.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStar_EquatorialCoordinates(), this.getEquatorialCoordinates(), null, "equatorialCoordinates", null, 0, 1, Star.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(starFieldEClass, StarField.class, "StarField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStarField_Stars(), this.getStar(), null, "stars", null, 0, -1, StarField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStarField_StarFieldFileName(), theEcorePackage.getEString(), "starFieldFileName", "bright_star_catalog_5.txt", 0, 1, StarField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(astronomyUtilsEClass, AstronomyUtils.class, "AstronomyUtils", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAstronomyUtils__GetSunEquatorialPosition__double(), this.getEquatorialCoordinates(), "getSunEquatorialPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "julianDay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetHorizontalSunPosition__Date_double_double(), this.getHorizontalCoordinates(), "getHorizontalSunPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetMoonEquatorialPosition__double(), this.getEquatorialCoordinates(), "getMoonEquatorialPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "julianDay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double(), this.getEquatorialCoordinates(), "getMoonTopocentricEquatorialPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double(), this.getHorizontalCoordinates(), "getHorizontalMoonPosition", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetTimeSinceJ2000__double(), theEcorePackage.getEDouble(), "getTimeSinceJ2000", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "julianDay", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetLocalSideralTime__Date_double(), theEcorePackage.getEDouble(), "getLocalSideralTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetUTCDecimalHours__Date(), theEcorePackage.getEDouble(), "getUTCDecimalHours", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date(), this.getHorizontalCoordinates(), "convertToHorizontalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquatorialCoordinates(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertTimeToAngle__int_int_int(), theEcorePackage.getEDouble(), "convertTimeToAngle", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "hours", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "minutes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "seconds", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ClampAngleToZero2PI__double(), theEcorePackage.getEDouble(), "clampAngleToZero2PI", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "angleInRadians", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates(), this.getEquatorialCoordinates(), "convertToEquatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEclipticCoordinates(), "eclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates(), this.getEclipticCoordinates(), "convertToEclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquatorialCoordinates(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d(), this.getPoint3d(), "convertFromEquatorialRectangularToEclipticRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "equatorialRectangularCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d(), this.getPoint3d(), "convertFromEclipticRectangularToEquatorialRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "eclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d(), this.getEclipticCoordinates(), "convertFromEclipticRectangularToEclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "eclipticCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d(), this.getEquatorialCoordinates(), "convertFromEquatorialRectangularToEquatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getPoint3d(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates(), this.getPoint3d(), "convertFromHorizontalCoordinatesToHorizontalRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getHorizontalCoordinates(), "horizontalCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates(), this.getPoint3d(), "convertFromEquatorialCoordinatesToEquatorialRectangular", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEquatorialCoordinates(), "equatorialCoordinates", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertAUtoMeters__double(), theEcorePackage.getEDouble(), "convertAUtoMeters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "astronomicalUnits", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetMaximumSunAltitude__double(), theEcorePackage.getEDouble(), "getMaximumSunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__ConvertToHHmmssString__double(), theEcorePackage.getEString(), "convertToHHmmssString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sideralTime", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetSunRiseTime__Date_double_double(), this.getDate(), "getSunRiseTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "day", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetSunSetTime__Date_double_double(), this.getDate(), "getSunSetTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "day", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAstronomyUtils__GetSunHighestElevationTime__Date_double_double(), this.getDate(), "getSunHighestElevationTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "day", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLongitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "observerLatitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMap_Transformation(), theMathPackage.getMatrix4x4(), null, "transformation", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_Layers(), this.getAbstractMapLayer(), this.getAbstractMapLayer_Map(), "layers", null, 0, -1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMap_MapNode(), this.getMapNode(), null, "mapNode", null, 1, 1, Map.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mapsListEClass, MapsList.class, "MapsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapsList_Maps(), this.getMap(), null, "maps", null, 0, -1, MapsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapsList_MapsListNode(), this.getMapsListNode(), null, "mapsListNode", null, 1, 1, MapsList.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractMapLayerEClass, AbstractMapLayer.class, "AbstractMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMapLayer_Map(), this.getMap(), this.getMap_Layers(), "map", null, 0, 1, AbstractMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMapLayer_AbstractMapLayerNode(), this.getAbstractMapLayerNode(), null, "abstractMapLayerNode", null, 0, 1, AbstractMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mapLayerPresentationEClass, MapLayerPresentation.class, "MapLayerPresentation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapLayerPresentation_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, MapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapLayerPresentation_MapLayer(), this.getAbstractMapLayer(), null, "mapLayer", null, 0, 1, MapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlMapLayerEClass, URLMapLayer.class, "URLMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLMapLayer_Url(), theEcorePackage.getEString(), "url", null, 0, 1, URLMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_Transformation(), theMathPackage.getMatrix4x4(), null, "transformation", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangularRegionEClass, RectangularRegion.class, "RectangularRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangularRegion_XMin(), theEcorePackage.getEDouble(), "xMin", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_XMax(), theEcorePackage.getEDouble(), "xMax", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_YMin(), theEcorePackage.getEDouble(), "yMin", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_YMax(), theEcorePackage.getEDouble(), "yMax", "0.0", 0, 1, RectangularRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_XDimension(), theEcorePackage.getEDouble(), "xDimension", null, 0, 1, RectangularRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularRegion_YDimension(), theEcorePackage.getEDouble(), "yDimension", null, 0, 1, RectangularRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_LowerLeftCorner(), theMathPackage.getTuple3d(), null, "lowerLeftCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_UpperLeftCorner(), theMathPackage.getTuple3d(), null, "upperLeftCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_LowerRightCorner(), theMathPackage.getTuple3d(), null, "lowerRightCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRectangularRegion_UpperRightCorner(), theMathPackage.getTuple3d(), null, "upperRightCorner", null, 1, 1, RectangularRegion.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rectangularVolumeRegionEClass, RectangularVolumeRegion.class, "RectangularVolumeRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangularVolumeRegion_ZMin(), theEcorePackage.getEDouble(), "zMin", "0.0", 0, 1, RectangularVolumeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularVolumeRegion_ZMax(), theEcorePackage.getEDouble(), "zMax", "0.0", 0, 1, RectangularVolumeRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangularVolumeRegion_ZDimension(), theEcorePackage.getEDouble(), "zDimension", null, 0, 1, RectangularVolumeRegion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rectangularRegionProviderEClass, RectangularRegionProvider.class, "RectangularRegionProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRectangularRegionProvider__GetRegion(), this.getRectangularRegion(), "getRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(rectangularRegionImageEClass, RectangularRegionImage.class, "RectangularRegionImage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRectangularRegionImage__GetRegionImage(), theImagesCorePackage.getAbstractEImage(), "getRegionImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRectangularRegionImage__GetResolution(), theEcorePackage.getEDouble(), "getResolution", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageMapLayerEClass, ImageMapLayer.class, "ImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMapLayer_Width(), theEcorePackage.getEDouble(), "width", "0.0", 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMapLayer_Height(), theEcorePackage.getEDouble(), "height", "0.0", 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMapLayer_Opaque(), theEcorePackage.getEBoolean(), "opaque", "true", 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageMapLayer_Image(), theImagesCorePackage.getAbstractEImage(), null, "image", null, 1, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getImageMapLayer_Legend(), theImagesCorePackage.getAbstractEImage(), null, "legend", null, 0, 1, ImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImageMapLayer_Resolution(), theEcorePackage.getEDouble(), "resolution", null, 0, 1, ImageMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		op = initEOperation(getImageMapLayer__UpdateImage__IProgressMonitor(), null, "updateImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIProgressMonitor(), "progressMonitor", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageMapLayer__GetImageMapLayerRegion(), this.getRectangularRegion(), "getImageMapLayerRegion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(imageMapLayerPresentationEClass, ImageMapLayerPresentation.class, "ImageMapLayerPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageMapLayerPresentation_Alpha(), theEcorePackage.getEFloat(), "alpha", "1.0", 0, 1, ImageMapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getImageMapLayerPresentation__GetImageMapLayer(), this.getImageMapLayer(), "getImageMapLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(urlImageMapLayerEClass, URLImageMapLayer.class, "URLImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getURLImageMapLayer_LegendURL(), theEcorePackage.getEString(), "legendURL", null, 0, 1, URLImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyTreeMapLayerEClass, TopologyTreeMapLayer.class, "TopologyTreeMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyTreeMapLayer_TopologyTreeRoot(), this.getTopologyTreeMapLayerNode(), this.getTopologyTreeMapLayerNode_TopologyTreeMapLayer(), "topologyTreeRoot", null, 0, 1, TopologyTreeMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyTreeMapLayerNodeEClass, TopologyTreeMapLayerNode.class, "TopologyTreeMapLayerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyTreeMapLayerNode_TopologyTreeMapLayer(), this.getTopologyTreeMapLayer(), this.getTopologyTreeMapLayer_TopologyTreeRoot(), "topologyTreeMapLayer", null, 0, 1, TopologyTreeMapLayerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyTreeMapLayerNode_TransientParent(), theTopologyPackage.getNode(), null, "transientParent", null, 0, 1, TopologyTreeMapLayerNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshMapLayerEClass, CartesianTriangularMeshMapLayer.class, "CartesianTriangularMeshMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshMapLayer_MeshIsDirty(), theEcorePackage.getEBoolean(), "meshIsDirty", "true", 0, 1, CartesianTriangularMeshMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshMapLayer_MapLayerPresentations(), this.getMapLayerPresentation(), null, "mapLayerPresentations", null, 0, -1, CartesianTriangularMeshMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshMapLayer_TextureImage(), theImagesCorePackage.getAbstractEImage(), null, "textureImage", null, 0, 1, CartesianTriangularMeshMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode(), this.getCartesianTriangularMeshMapLayerNode(), null, "cartesianTriangularMeshMapLayerNode", null, 0, 1, CartesianTriangularMeshMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCartesianTriangularMeshMapLayer__GetCurrentMesh(), theData3dPackage.getCartesianTriangularMesh(), "getCurrentMesh", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage(), null, "forceUpdateTextureImage", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cartesianTriangularMeshDerivedImageMapLayerEClass, CartesianTriangularMeshDerivedImageMapLayer.class, "CartesianTriangularMeshDerivedImageMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution(), theEcorePackage.getEDouble(), "requiredResolution", "1.0", 0, 1, CartesianTriangularMeshDerivedImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer(), this.getCartesianTriangularMeshMapLayer(), null, "cartesianTriangularMeshMapLayer", null, 0, 1, CartesianTriangularMeshDerivedImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshSlopeImageMapLayerEClass, CartesianTriangularMeshSlopeImageMapLayer.class, "CartesianTriangularMeshSlopeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshSlopeImageMapLayer_AutoScale(), theEcorePackage.getEBoolean(), "autoScale", "true", 0, 1, CartesianTriangularMeshSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope(), theEcorePackage.getEDouble(), "minimumSlope", "0.0", 0, 1, CartesianTriangularMeshSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope(), theEcorePackage.getEDouble(), "maximumSlope", "50.0", 0, 1, CartesianTriangularMeshSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass, CartesianTriangularMeshDiscreteSlopeImageMapLayer.class, "CartesianTriangularMeshDiscreteSlopeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges(), this.getSlopeRange(), null, "slopeRanges", null, 0, -1, CartesianTriangularMeshDiscreteSlopeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshHeightImageMapLayerEClass, CartesianTriangularMeshHeightImageMapLayer.class, "CartesianTriangularMeshHeightImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCartesianTriangularMeshHeightImageMapLayer_AutoScale(), theEcorePackage.getEBoolean(), "autoScale", "true", 0, 1, CartesianTriangularMeshHeightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight(), theEcorePackage.getEDouble(), "minimumHeight", "0.0", 0, 1, CartesianTriangularMeshHeightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight(), theEcorePackage.getEDouble(), "maximumHeight", "50.0", 0, 1, CartesianTriangularMeshHeightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slopeRangeEClass, SlopeRange.class, "SlopeRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlopeRange_SlopeLowerBound(), theEcorePackage.getEDouble(), "slopeLowerBound", "0", 0, 1, SlopeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlopeRange_SlopeUpperBound(), theEcorePackage.getEDouble(), "slopeUpperBound", "10", 0, 1, SlopeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlopeRange_Color(), this.getColor3f(), "color", "1.0,1.0,1.0", 0, 1, SlopeRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineOfSightImageMapLayerEClass, LineOfSightImageMapLayer.class, "LineOfSightImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineOfSightImageMapLayer_LineOfSightAvailableColor(), this.getColor3f(), "lineOfSightAvailableColor", "0.0,1.0,0.0", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineOfSightImageMapLayer_LineOfSightNotAvailableColor(), this.getColor3f(), "lineOfSightNotAvailableColor", "1.0,0.0,0.0", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLineOfSightImageMapLayer_ObserverPose(), theMathPackage.getMatrix4x4(), null, "observerPose", null, 1, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineOfSightImageMapLayer_TargetHeightAboveGround(), theEcorePackage.getEDouble(), "targetHeightAboveGround", "1.0", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineOfSightImageMapLayer_UseHeightPerpendicularToGround(), theEcorePackage.getEBoolean(), "useHeightPerpendicularToGround", "false", 0, 1, LineOfSightImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractShapeImageLayerEClass, AbstractShapeImageLayer.class, "AbstractShapeImageLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractShapeImageLayer_ShapedFilled(), theEcorePackage.getEBoolean(), "shapedFilled", "false", 0, 1, AbstractShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShapeImageLayer_Color(), this.getColor3f(), "color", "0.0,1.0,0.0", 0, 1, AbstractShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractShapeImageLayer_RequiredResolution(), theEcorePackage.getEDouble(), "requiredResolution", "1.0", 0, 1, AbstractShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseShapeImageLayerEClass, EllipseShapeImageLayer.class, "EllipseShapeImageLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEllipseShapeImageLayer_EllipseWidth(), theEcorePackage.getEDouble(), "ellipseWidth", "1.0", 0, 1, EllipseShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipseShapeImageLayer_EllipseHeight(), theEcorePackage.getEDouble(), "ellipseHeight", "1.0", 0, 1, EllipseShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipseShapeImageLayer_ShowCenterLines(), theEcorePackage.getEBoolean(), "showCenterLines", "true", 0, 1, EllipseShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleShapeImageLayerEClass, RectangleShapeImageLayer.class, "RectangleShapeImageLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRectangleShapeImageLayer_RectangleWidth(), theEcorePackage.getEDouble(), "rectangleWidth", "1.0", 0, 1, RectangleShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleShapeImageLayer_RectangleHeight(), theEcorePackage.getEDouble(), "rectangleHeight", "1.0", 0, 1, RectangleShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleShapeImageLayer_ShowCenterLines(), theEcorePackage.getEBoolean(), "showCenterLines", "true", 0, 1, RectangleShapeImageLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonShapeImageMapLayerEClass, PolygonShapeImageMapLayer.class, "PolygonShapeImageMapLayer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPolygonShapeImageMapLayer__GetVertices(), null, "getVertices", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theMathPackage.getTuple3d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(cartesianCoordinatesPolygonShapeImageMapLayerEClass, CartesianCoordinatesPolygonShapeImageMapLayer.class, "CartesianCoordinatesPolygonShapeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianCoordinatesPolygonShapeImageMapLayer_PolygonVertices(), theMathPackage.getTuple3d(), null, "polygonVertices", null, 0, -1, CartesianCoordinatesPolygonShapeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geographicCoordinatesPolygonShapeImageMapLayerEClass, GeographicCoordinatesPolygonShapeImageMapLayer.class, "GeographicCoordinatesPolygonShapeImageMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates(), this.getGeographicCoordinates(), null, "polygonVerticesGeographicCoordinates", null, 0, -1, GeographicCoordinatesPolygonShapeImageMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicCartesianTriangularMeshMapLayerEClass, BasicCartesianTriangularMeshMapLayer.class, "BasicCartesianTriangularMeshMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicCartesianTriangularMeshMapLayer_Mesh(), theData3dPackage.getCartesianTriangularMesh(), null, "mesh", null, 0, 1, BasicCartesianTriangularMeshMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cartesianTriangularMeshURLMapLayerEClass, CartesianTriangularMeshURLMapLayer.class, "CartesianTriangularMeshURLMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianTriangularMeshURLMapLayer_Mesh(), theData3dPackage.getCartesianTriangularMesh(), null, "mesh", null, 0, 1, CartesianTriangularMeshURLMapLayer.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresOfInterestMapLayerEClass, FeaturesOfInterestMapLayer.class, "FeaturesOfInterestMapLayer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturesOfInterestMapLayer_Features(), theSymphonyCorePackage.getFeatureOfInterestList(), null, "features", null, 1, 1, FeaturesOfInterestMapLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(worksiteNodeEClass, WorksiteNode.class, "WorksiteNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorksiteNode_Worksite(), this.getWorksite(), null, "worksite", null, 0, 1, WorksiteNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(surfaceWorksiteNodeEClass, SurfaceWorksiteNode.class, "SurfaceWorksiteNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthSurfaceWorksiteNodeEClass, EarthSurfaceWorksiteNode.class, "EarthSurfaceWorksiteNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEarthSurfaceWorksiteNode_SkyTransformNode(), theTopologyPackage.getTransformNode(), null, "skyTransformNode", null, 0, 1, EarthSurfaceWorksiteNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapsListNodeEClass, MapsListNode.class, "MapsListNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapsListNode_MapsList(), this.getMapsList(), null, "mapsList", null, 0, 1, MapsListNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapNodeEClass, MapNode.class, "MapNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapNode_Map(), this.getMap(), null, "map", null, 0, 1, MapNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMapLayerNodeEClass, AbstractMapLayerNode.class, "AbstractMapLayerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractMapLayerNode_AbstractMapLayer(), this.getAbstractMapLayer(), null, "abstractMapLayer", null, 0, 1, AbstractMapLayerNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skyNodeEClass, SkyNode.class, "SkyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkyNode_Sky(), this.getSky(), null, "sky", null, 0, 1, SkyNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSkyNodeEClass, EarthSkyNode.class, "EarthSkyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianTriangularMeshMapLayerNodeEClass, CartesianTriangularMeshMapLayerNode.class, "CartesianTriangularMeshMapLayerNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCartesianTriangularMeshMapLayerNode__GetCartesianTriangularMeshMapLayer(), this.getCartesianTriangularMeshMapLayer(), "getCartesianTriangularMeshMapLayer", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3dEDataType, Point3d.class, "Point3d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iProgressMonitorEDataType, IProgressMonitor.class, "IProgressMonitor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
  protected void createGenModelAnnotations()
  {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "prefix", "SymphonyEnvironment",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)",
			 "modelName", "SymphonyEnvironment",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.core.environment/src-generated",
			 "editDirectory", "/org.eclipse.symphony.core.environment.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.core"
		   });	
		addAnnotation
		  (getSurfaceWorksite_Sky(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (earthSurfaceWorksiteEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialization of Worksite defining a are or volume at the Earth surface."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite__ConvertToGeographicCoordinates__Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts a position expressed as XYZ in the EarthSurfaceWorksite frame to a WS84 GeographicCoordinates.\n@param position The position in the worksite coordinates system.\n@return The GeographicCoordinates of the position, in the WS84 datum."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite__ConvertToXYZPosition__GeographicCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts a WS84 GeographicCoordinates to a XYZ position in the EarthSurfaceWorksite frame.\n@param geographicalCoordinates The geographical coordinates expressed in the WS84 datum.\n@return The XYZ position in the worksite coordinates system."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite_GeographicalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The geographical coordinates of the origin of the worksite, in the WS84 datum."
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite_XAxisAzimuth(), 
		   source, 
		   new String[] {
			 "documentation", "Azimuth, relative to true North, of the X axis of the worksite coordinates system. Follows the right hand rule.\nNote that the Z axis is pointing up (toward zenith).",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksite_EarthSky(), 
		   source, 
		   new String[] {
			 "documentation", "The EarthSky associated with the worksite,"
		   });	
		addAnnotation
		  (getAtmosphere_WindSpeed(), 
		   source, 
		   new String[] {
			 "documentation", "The wind surface speed, in m/s.",
			 "csa_units", "m/s"
		   });	
		addAnnotation
		  (getAtmosphere_WindDirection(), 
		   source, 
		   new String[] {
			 "documentation", "The wind direction expressed relative to true north, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAtmosphere_Temperature(), 
		   source, 
		   new String[] {
			 "documentation", "The atmosphere temperature, in degrees Celcius.",
			 "csa_units", "\u2103"
		   });	
		addAnnotation
		  (getAtmosphere_SurfacePressure(), 
		   source, 
		   new String[] {
			 "documentation", "The atmosphere pressure at the reference altitude, in pascals.",
			 "csa_units", "Pa"
		   });	
		addAnnotation
		  (getAtmosphere_SurfaceDensity(), 
		   source, 
		   new String[] {
			 "documentation", "The atmosphere density at the reference altitude, in kg/m^3.",
			 "csa_units", "kg/m\u00b3"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetAirMass__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the air mass. The Air Mass is the path length which light takes through the atmosphere normalized to the shortest possible path length (that is, when the sun is directly overhead). The Air Mass quantifies the reduction in the power of light as it passes through the atmosphere and is absorbed by air and dust.@see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM."
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetAirMass__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The sun elevation angle above the horizon, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetDirectSunIntensity__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the intensity of the direct component of sunlight, in Watts / m2. @see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM",
			 "csa_units", "W/m\u00b2"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDirectSunIntensity__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The sun elevation angle above the horizon, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDirectSunIntensity__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Height above see level, in meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetDiffuseSunIntensity__double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the intensity of the diffuse component of sunlight, in Watts / m2.@see http://pvcdrom.pveducation.org/SUNLIGHT/AIRMASS.HTM",
			 "csa_units", "W/m\u00b2"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDiffuseSunIntensity__double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The sun elevation angle above the horizon, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetDiffuseSunIntensity__double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "Height above see level, in meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getAtmosphereUtils__GetAtmosphereRefractionCorrection__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the change in altitude that needs to be added to the altitude of HorizontalCoordinates to take into account the Earth\'s atmosphere refraction. The calculations in the NOAA Sunrise/Sunset and Solar Position Calculators are based on equations from Astronomical Algorithms, by Jean Meeus. The sunrise and sunset results have been verified to be accurate to within a minute for locations between +/- 72\u00b0 latitude, and within 10 minutes outside of those latitudes.@see ../doc/AtmosphereRefractionCalculations.html or http://www.srrb.noaa.gov/highlights/sunrise/calcdetails.html."
		   });	
		addAnnotation
		  ((getAtmosphereUtils__GetAtmosphereRefractionCorrection__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The true altitude (as defined in HorizontalCoordinates) of the object, in radians."
		   });	
		addAnnotation
		  (equatorialCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "The equatorial coordinate system is a widely-used method of mapping celestial objects. It functions by projecting the Earth\'s geographic poles and equator onto the celestial sphere. The projection of the Earth\'s equator onto the celestial sphere is called the celestial equator. Similarly, the projections of the Earth\'s north and south geographic poles become the north and south celestial poles, respectively."
		   });	
		addAnnotation
		  (geographicCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "A location on Earth."
		   });	
		addAnnotation
		  (getGeographicCoordinates_Longitude(), 
		   source, 
		   new String[] {
			 "documentation", "The longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getGeographicCoordinates_Latitude(), 
		   source, 
		   new String[] {
			 "documentation", "The latitude, in radians. Latitude North of the equator are positive, South of the equator are negative.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getGeographicCoordinates_Elevation(), 
		   source, 
		   new String[] {
			 "documentation", "Height above the Earth\'s sea level, in meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (horizontalCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "The horizontal coordinate system is a celestial coordinate system that uses the observer\'s local horizon as the fundamental plane. This conveniently divides the sky into the upper hemisphere that you can see, and the lower hemisphere that you cannot (because the Earth is in the way). The pole of the upper hemisphere is called the zenith. The pole of the lower hemisphere is called the nadir.\n\nThe horizontal coordinates are:\n\n    * altitude (Alt), sometimes referred to as elevation, that is the angle between the object and the observer\'s local horizon.\n    * azimuth (Az), that is the angle of the object around the horizon, usually measured from the north point towards the east. In former times, it was common to refer to azimuth from the south, as it was then zero at the same time the hour angle of a star was zero. This assumes, however, that the star (upper) culminates in the south, which is only true for most stars in the Northern Hemisphere.\n"
		   });	
		addAnnotation
		  (eclipticCoordinatesEClass, 
		   source, 
		   new String[] {
			 "documentation", "The ecliptic coordinate system is a celestial coordinate system that uses the ecliptic for its fundamental plane. The ecliptic is the path that the sun appears to follow across the sky over the course of a year. It is also the projection of the Earth\'s orbital plane onto the celestial sphere. The latitudinal angle is called the ecliptic latitude or celestial latitude (denoted \u03b2), measured positive towards the north. The longitudinal angle is called the ecliptic longitude or celestial longitude (denoted \u03bb), measured eastwards from 0\u00b0 to 360\u00b0. Like right ascension in the equatorial coordinate system, 0\u00b0 ecliptic longitude is pointing towards the Sun from the Earth at the Northern hemisphere vernal equinox. This choice makes the coordinates of the fixed stars subject to shifts due to the precession, so that always a reference epoch should be specified. Usually epoch J2000.0 is taken, but the instantaneous equinox of the day (called the epoch of date) is possible too. This coordinate system can be particularly useful for charting solar system objects. Most planets (except Mercury), and many small solar system bodies have orbits with small inclinations to the ecliptic plane, and therefore their ecliptic latitude \u03b2 is always small. Because of the planets\' small deviation from the plane of the ecliptic, ecliptic coordinates were used historically to compute their positions. (Aaboe 2001, 17-19)"
		   });	
		addAnnotation
		  (skyEClass, 
		   source, 
		   new String[] {
			 "documentation", "The base class defining a the Sky above a SurfaceWorksite. This basic sky includes the sun and stars. The Sky is TimeDependant, which in this context means that the position of both the Sun and the stars should be updated when the time is changed."
		   });	
		addAnnotation
		  (getSky__GetSunAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Sun angular diameter, in radians.",
			 "propertyCategory", "SUN",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getSky_SurfaceWorksite(), 
		   source, 
		   new String[] {
			 "documentation", "The worksite to which the sky is associated."
		   });	
		addAnnotation
		  (getSky_SkyNode(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getSky_Sun(), 
		   source, 
		   new String[] {
			 "documentation", "The Sun in the sky.",
			 "propertyCategory", "SUN"
		   });	
		addAnnotation
		  (getSky_SunHorizontalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The current HorizontalCordinates of the Sun.",
			 "propertyCategory", "SUN"
		   });	
		addAnnotation
		  (getSky_StarField(), 
		   source, 
		   new String[] {
			 "documentation", "The stars in the sky.",
			 "propertyCategory", "STARS"
		   });	
		addAnnotation
		  (earthSkyEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialisation of the Sky for Earth use that adds the Moon. The position of the Moon is updated, along with the Sun and stars, when the time is changed."
		   });	
		addAnnotation
		  (getEarthSky__GetMoonAngularDiameter(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the Moon angular diameter, in radians.",
			 "propertyCategory", "MOON",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEarthSky_Moon(), 
		   source, 
		   new String[] {
			 "documentation", "The Moon in the sky.",
			 "propertyCategory", "MOON"
		   });	
		addAnnotation
		  (getEarthSky_MoonHorizontalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "The current HorizontalCordinates of the Moon.",
			 "propertyCategory", "MOON"
		   });	
		addAnnotation
		  (getSun__GetIrradiance__double(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the sun intensity a the specified radius."
		   });	
		addAnnotation
		  ((getSun__GetIrradiance__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The distance from the sun center, in meters."
		   });	
		addAnnotation
		  (getSun_Radius(), 
		   source, 
		   new String[] {
			 "documentation", " Sun radius, in meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (earthEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nThe Earth."
		   });	
		addAnnotation
		  (getEarth_Radius(), 
		   source, 
		   new String[] {
			 "documentation", " Earth mean radius, in meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getMoon_Radius(), 
		   source, 
		   new String[] {
			 "documentation", " Moon radius, in meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (environmentUtilitiesEClass, 
		   source, 
		   new String[] {
			 "documentation", "Utilities class providing conversion methods."
		   });	
		addAnnotation
		  (getEnvironmentUtilities__ConvertToJulianDate__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Convert from Date (UTC) to Julian. Uses formula found at http://en.wikipedia.org/wiki/Julian_date#cite_note-12"
		   });	
		addAnnotation
		  (getEnvironmentUtilities__ParseRightAscension__String(), 
		   source, 
		   new String[] {
			 "documentation", "Methods that parses Right Ascension angle expressed in HH:mm:ss format and return an angle in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUtilities__ParseDegMinSec__String(), 
		   source, 
		   new String[] {
			 "documentation", "Methods that parses an angle expressed in deg:mm:ss format and return an angle in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUtilities__SortByMagnitude__List(), 
		   source, 
		   new String[] {
			 "documentation", "Method that sorts a list of stars by magnitude."
		   });	
		addAnnotation
		  (environmentFacadeEClass, 
		   source, 
		   new String[] {
			 "documentation", "A class providing utilities methods to create fully initialze object."
		   });	
		addAnnotation
		  (getEnvironmentFacade__CreateAndInitializeDefaultCSAWorksite(), 
		   source, 
		   new String[] {
			 "documentation", "Create an empty EarthSurfaceWorksite with the CSA Mars Yard coordinates."
		   });	
		addAnnotation
		  (getEnvironmentFacade__CreateAndInitializeEarthAtmosphere(), 
		   source, 
		   new String[] {
			 "documentation", "Creates a International Standard Atmosphere at see level. @see http://en.wikipedia.org/wiki/International_Standard_Atmosphere"
		   });	
		addAnnotation
		  (getEnvironmentFacade__CreateEImage__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nAssembles a list of ImageMapLayer into a single eImage reference to the Worksite frame.\nNote that only X,Y and Rz are used in transformation applied between ImageMapLayer and the worksite\norigin."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetAbsoluteRectangularRegionCorners__RectangularRegion(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn a list containing the position of the 4 corners of the specified ImageMapLayer\n@param imageMapLayer The specified ImageMapLayer.\n@return List containing the position (in the worksite frame) of the four corners of the ImageMapLayer.\nThe list contains : lowerLeftCorner, lowerRightCorner, upperRightCorner and upperLeftCorner."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetBestResolutionRectangularRegionImage__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ImageMapLayer with the highest resolution (minimum meters/pixel).\n@return The ImageMapLayer with the highest resolution (minimum meters/pixel)"
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetRectangularRegionExtent__RectangularRegionProvider_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the lower left and upper right corners of a specified RectangularRegionProvider.\n@param rectangularRegionProvider The specified RectangularRegionProvider.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetRectangularRegionImageExtent__RectangularRegionImage_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the lower left and upper right corners of a specified ImageMapLayer.\n@param imageMapLayer The specified ImageMapLayer.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates.\nTODO DEPRECATE - REMOVE"
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetRectangularRegionExtent__List_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn  the lower left and upper right corners of the region spanned by a list of RectangularRegionProviders.\n@param rectangularRegionProviders The list of RectangularRegionProviders.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetRectangularRegionImageExtent__List_Tuple3d_Tuple3d(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn  the lower left and upper right corners of the region spanned by a list of a ImageMapLayer.\n@param The list of ImageMapLayer.\n@param lowerLeftCorner The Tuple3d were to put the lower left coordinates.\n@param upperRightCorner The Tuple3d were to put the upper right coordinates.\nTODO DEPRECATE - REMOVE"
		   });	
		addAnnotation
		  (getEnvironmentFacade__FitsInside__RectangularRegion_RectangularRegion(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether rectangularRegionA fits entirely in rectangularRegionB.\nThe current implementation does not take into account the Transform.\n@param rectangularRegionA The first RectangularRegion.\n@param rectangularRegionB The second RectangularRegion.\n@return True if rectangularRegionA fits in rectangularRegionB, false otherwise."
		   });	
		addAnnotation
		  (getEnvironmentFacade__Intersects__RectangularRegion_RectangularRegion_Matrix4x4(), 
		   source, 
		   new String[] {
			 "documentation", "Returns whether two RectangularRegion intersects.\nreference frame.\n@param rectangularRegionA The first RectangularRegion.\n@param transformAToB The transformation (expressed as a 4x4 matrix that expresses region A into region B)\n@param rectangularRegionB The second RectangularRegion.\n@return True if rectangularRegionA intersects rectangularRegionB, false otherwise."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetImageMapLayerPresentationImage__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns an image representing the assembly of the specified list of ImageMapLayerPresentation.\n@param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.\n@return The image representing the specified list of ImageMapLayerPresentation."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetBestResolutionMapLayer__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the ImageMapLayerPresentation with the highest resolution (minimum meters/pixel).\n@return The ImageMapLayerPresentation with the highest resolution (minimum meters/pixel)"
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetVisibleImageMapLayerPresentation__List(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the list of visible ImageMapLayerPresentation from\"\" a specified imageMapLayerPresentations.\n@param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.\n@return The list of visible ImageMapLayerPresentation."
		   });	
		addAnnotation
		  (getEnvironmentFacade__GetRectangularVolumeRegion__CartesianTriangularMesh(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the RectangularVolumeRegion bounding a triangular mesh.\n@param mesh The triangular mesh.\n@return The RectangularVolumeRegion."
		   });	
		addAnnotation
		  (starEClass, 
		   source, 
		   new String[] {
			 "documentation", "A star."
		   });	
		addAnnotation
		  (starFieldEClass, 
		   source, 
		   new String[] {
			 "documentation", "Represents the brightest stars in the sky."
		   });	
		addAnnotation
		  (getStarField_Stars(), 
		   source, 
		   new String[] {
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (astronomyUtilsEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class that provides methods to find the position of the Moon and Sun in the sky."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunEquatorialPosition__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Sun\'s equatorial coordinates for a given Julian date.The calculation are based on page C24 of the 1996 Astronomical Almanac which provides a method for finding the position of the Sun in the sky to an accuracy of 0.01 degree between the years 1950 and 2050. The formulas are based on an elliptical orbit for the Earth, using mean orbital elements and a two term approximation for the \'equation of centre\'. There is also an approximate allowance made for the change in obliquity of the ecliptic with time, needed when converting to right ascension and declination. The positions are thus apparent positions, they are referred to the mean ecliptic and equinox of date. The positions found using this low precision formula with values referred to the mean ecliptic and equinox of date from a more accurate program. The results (for the whole 1950 to 2050 range) have been found to be accurate within 3 seconds of RA and 15 arc seconds in declination. @see http://www.stargazing.net/kepler/sun.html#twig02"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetHorizontalSunPosition__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Sun\'s horizontal coordinates for a date and location on the surface of the Earth."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalSunPosition__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalSunPosition__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetMoonEquatorialPosition__double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Moon\'s equatorial coordinates for a given Julian date for an observer a the center of the Earth. See doc/tutorial.html for more details."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Moon\'s equatorial coordinates for a date and location on the surface of the Earth. This position take into account the radius of the Earth."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetMoonTopocentricEquatorialPosition__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the Moon\'s horizontal coordinates."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetHorizontalMoonPosition__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetTimeSinceJ2000__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the number of days since epoch J2000."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetLocalSideralTime__Date_double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the local sideral time, in radians, clamped between 0 and 2\u03c0 (360 degrees). Sidereal time is a system of timekeeping based on the rotation of the Earth with respect to the fixed stars in the sky. More specifically, it is the measure of the hour angle of the vernal equinox. If the hour angle is measured with respect to the true equinox, apparent sidereal time is being measured. If the hour angle is measured with respect to the mean equinox, mean sidereal time is being measured. When the measurements are made with respect to the meridian at Greenwich, the times are referred to as Greenwich mean sidereal time (GMST) and Greenwich apparent sidereal time (GAST). Given below is a simple algorithm for computing apparent sidereal time to an accuracy of about 0.1 second, equivalent to about 1.5 arcseconds on the sky. The input time required by the algorithm is represented as a Julian date (Julian dates can be used to determine Universal Time.)Let JD be the Julian date of the time of interest. Let JD0 be the Julian date of the previous midnight (0h) UT (the value of JD0 will end in .5 exactly), and let H be the hours of UT elapsed since that time. Thus we have JD = JD0 + H/24.\n\nFor both of these Julian dates, compute the number of days and fraction (+ or -) from 2000 January 1, 12h UT, Julian date 2451545.0:\nD = JD - 2451545.0\nD0 = JD0 - 2451545.0\n\nThen the Greenwich mean sidereal time in hours is\nGMST = 6.697374558 + 0.06570982441908 D0 + 1.00273790935 H + 0.000026 T2\nwhere T = D/36525 is the number of centuries since the year 2000; thus the last term can be omitted in most applications. It will be necessary to reduce GMST to the range 0h to 24h. Setting H = 0 in the above formula yields the Greenwich mean sidereal time at 0h UT, which is tabulated in The Astronomical Almanac.\n\nThe following alternative formula can be used with a loss of precision of 0.1 second per century:\nGMST = 18.697374558 + 24.06570982441908 D\nwhere, as above, GMST must be reduced to the range 0h to 24h. The equations for GMST given above are adapted from those given in Appendix A of USNO Circular No. 163 (1981).\n\nThe Greenwich apparent sidereal time is obtained by adding a correction to the Greenwich mean sidereal time computed above. The correction term is called the nutation in right ascension or the equation of the equinoxes. Thus,\nGAST = GMST + eqeq.\nThe equation of the equinoxes is given as eqeq = \u0394\u03c8 cos \u03b5 where \u0394\u03c8, the nutation in longitude, is given in hours approximately by\n\u0394\u03c8 \u2248 -0.000319 sin \u03a9 - 0.000024 sin 2L\nwith \u03a9, the Longitude of the ascending node of the Moon, given as\n\u03a9 = 125.04 - 0.052954 D,\nand L, the Mean Longitude of the Sun, given as\nL = 280.47 + 0.98565 D.\n\u03b5 is the obliquity and is given as\n\u03b5 = 23.4393 - 0.0000004 D.\nThe above expressions for \u03a9, L, and \u03b5 are all expressed in degrees.\n\nThe mean or apparent sidereal time locally is found by obtaining the local longitude in degrees, converting it to hours by dividing by 15, and then adding it to or subtracting it from the Greenwich time depending on whether the local position is east (add) or west (subtract) of Greenwich."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetLocalSideralTime__Date_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetUTCDecimalHours__Date(), 
		   source, 
		   new String[] {
			 "documentation", "Return the decimal time of day in UTC for a given date."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Equatorial Coordinates to HorizontalCoordinates for a given geographic location and date."
		   });	
		addAnnotation
		  ((getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__ConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertTimeToAngle__int_int_int(), 
		   source, 
		   new String[] {
			 "documentation", "Convert a day\'s hour, minutes and seconds to an angle, in radians. 24 hours converts to 2\u03c0 (360 degrees).",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ClampAngleToZero2PI__double(), 
		   source, 
		   new String[] {
			 "documentation", "Clamps the specified angle between 0 and 2\u03c0 (360 degrees).",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__ClampAngleToZero2PI__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToEquatorialCoordinates__EclipticCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Ecliptic Coordinates to Equatorial Coordinates."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToEclipticCoordinates__EquatorialCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Equatorial Coordinates to Ecliptic Coordinates."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEquatorialRectangularToEclipticRectangular__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Equatorial Coordinates to Equatorial Coordinates (Right Ascension and Declination)."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEclipticRectangularToEquatorialRectangular__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Ecliptic Coordinates to Rectangular (x,y,z) Equatorial Coordinates."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEclipticRectangularToEclipticCoordinates__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Ecliptic Coordinates to Ecliptic Coordinates (longitude, latitude, radius)."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d(), 
		   source, 
		   new String[] {
			 "documentation", "Converts Rectangular (x,y,z) Equatorial Coordinates to Equatorial Coordinates (Right Ascension, Declination)."
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", "Converts HorizontalCoordinates () to Rectangular Horizontal  (x,y,z)  coordinates. Rectangular Horizontal  coordinates are defined as followed: X point to True North. Y points West Z point toward nadir (up);"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates(), 
		   source, 
		   new String[] {
			 "documentation", ""
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertAUtoMeters__double(), 
		   source, 
		   new String[] {
			 "documentation", "Convert Astronomical Units (A.U.) to meters.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetMaximumSunAltitude__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the maximum altitude angle that the sun could reach at the specified latitude, in radians.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetMaximumSunAltitude__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getAstronomyUtils__ConvertToHHmmssString__double(), 
		   source, 
		   new String[] {
			 "documentation", "Converts a sidreal time in HH:mm:ss string"
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunRiseTime__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the sun rise time for a given day and location."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunRiseTime__Date_double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The date of the day"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunRiseTime__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunRiseTime__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, South of the equator are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunSetTime__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the sun set time for a given day and location."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunSetTime__Date_double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The date of the day"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunSetTime__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunSetTime__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, South of the equator are negative."
		   });	
		addAnnotation
		  (getAstronomyUtils__GetSunHighestElevationTime__Date_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the time of maximum sun elevation for a given day and location."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunHighestElevationTime__Date_double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "documentation", "The date of the day"
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunHighestElevationTime__Date_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "documentation", "The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative."
		   });	
		addAnnotation
		  ((getAstronomyUtils__GetSunHighestElevationTime__Date_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "documentation", "The observer latitude, in radians. Latitude North of the equator are positive, South of the equator are negative."
		   });	
		addAnnotation
		  (getMapsList_MapsListNode(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (abstractMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A layer representing a terrain map."
		   });	
		addAnnotation
		  (getAbstractMapLayer_Map(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getAbstractMapLayer_AbstractMapLayerNode(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (mapLayerPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class representing presentation attributes that are associated to a AbstractMapLayer."
		   });	
		addAnnotation
		  (getMapLayerPresentation_Visible(), 
		   source, 
		   new String[] {
			 "documentation", " Visibility",
			 "notify", "true",
			 "propertyCategory", "PRESENTATION_SETTINGS"
		   });	
		addAnnotation
		  (urlMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A Map Layer containing a URL to some data."
		   });	
		addAnnotation
		  (getURLMapLayer_Url(), 
		   source, 
		   new String[] {
			 "propertyCategory", "URL"
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a Region."
		   });	
		addAnnotation
		  (getRegion_Transformation(), 
		   source, 
		   new String[] {
			 "documentation", "*\nTransform that expresses the origin of the region relative to the worksite."
		   });	
		addAnnotation
		  (rectangularRegionEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a 2D rectangular region in the XY Plane."
		   });	
		addAnnotation
		  (getRectangularRegion_XMin(), 
		   source, 
		   new String[] {
			 "documentation", "* Minimum X coordinate on the X axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_XMax(), 
		   source, 
		   new String[] {
			 "documentation", "* Maximum X coordinate on the X axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_YMin(), 
		   source, 
		   new String[] {
			 "documentation", "* Minimum X coordinate on the Y axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_YMax(), 
		   source, 
		   new String[] {
			 "documentation", "* Maximum X coordinate on the Y axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_XDimension(), 
		   source, 
		   new String[] {
			 "documentation", "* Dimension along the X axis.",
			 "propertyCategory", "EXTENT_SIZES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularRegion_YDimension(), 
		   source, 
		   new String[] {
			 "documentation", "* Dimension along the Y axis.",
			 "propertyCategory", "EXTENT_SIZES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularVolumeRegion_ZMin(), 
		   source, 
		   new String[] {
			 "documentation", "* Minimum Z coordinate on the Z axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularVolumeRegion_ZMax(), 
		   source, 
		   new String[] {
			 "documentation", "* Maximum Z coordinate on the Z axis.",
			 "property", "Readonly",
			 "propertyCategory", "EXTENT_COORDINATES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangularVolumeRegion_ZDimension(), 
		   source, 
		   new String[] {
			 "documentation", "* Dimension along the Z axis.",
			 "propertyCategory", "EXTENT_SIZES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (rectangularRegionProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Interface that provides a RectangularRegion."
		   });	
		addAnnotation
		  (getRectangularRegionProvider__GetRegion(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the RectangularRegion defined by the object.\n@return The RectangularRegion defined by the object, never null."
		   });	
		addAnnotation
		  (rectangularRegionImageEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nDefines a rectangular region covered by an image."
		   });	
		addAnnotation
		  (getRectangularRegionImage__GetRegionImage(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturn the image associated with this region.\n@return The image, can be null."
		   });	
		addAnnotation
		  (getRectangularRegionImage__GetResolution(), 
		   source, 
		   new String[] {
			 "documentation", "*\nReturns the image resolution.\n@return The resolution, in meters / pixel, or -1 if not defined.",
			 "csa_units", "m/pixel"
		   });	
		addAnnotation
		  (imageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nMap Layer containing a 2D image."
		   });	
		addAnnotation
		  (getImageMapLayer__UpdateImage__IProgressMonitor(), 
		   source, 
		   new String[] {
			 "documentation", "Update the image using the image parameters."
		   });	
		addAnnotation
		  (getImageMapLayer__GetImageMapLayerRegion(), 
		   source, 
		   new String[] {
			 "documentation", " Return the RectangularRegion represented by this ImageMapLayer."
		   });	
		addAnnotation
		  (getImageMapLayer_Width(), 
		   source, 
		   new String[] {
			 "documentation", " The width of the region covered by the map, in meters.",
			 "property", "Editable",
			 "propertyCategory", "SIZE_AND_RESOLUTION",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getImageMapLayer_Height(), 
		   source, 
		   new String[] {
			 "documentation", " The height of the region covered by the map, in meters.",
			 "property", "Editable",
			 "propertyCategory", "SIZE_AND_RESOLUTION",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getImageMapLayer_Opaque(), 
		   source, 
		   new String[] {
			 "documentation", " Wether or not the map is opaque (i.e. cannot be superimposed on other ImageMapLayer."
		   });	
		addAnnotation
		  (getImageMapLayer_Image(), 
		   source, 
		   new String[] {
			 "documentation", " The image.",
			 "propertyCategory", "IMAGES"
		   });	
		addAnnotation
		  (getImageMapLayer_Legend(), 
		   source, 
		   new String[] {
			 "documentation", " An image containing the legend associated with the image.",
			 "propertyCategory", "IMAGES"
		   });	
		addAnnotation
		  (getImageMapLayer_Resolution(), 
		   source, 
		   new String[] {
			 "documentation", " The resolution, in meters / pixels",
			 "property", "Readonly",
			 "propertyCategory", "SIZE_AND_RESOLUTION",
			 "csa_units", "m/pixel"
		   });	
		addAnnotation
		  (imageMapLayerPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Presentation properties associated to an Image Layer."
		   });	
		addAnnotation
		  (getImageMapLayerPresentation__GetImageMapLayer(), 
		   source, 
		   new String[] {
			 "documentation", " Operation that return the Image Map Layer to which this presentation is associated."
		   });	
		addAnnotation
		  (getImageMapLayerPresentation_Alpha(), 
		   source, 
		   new String[] {
			 "documentation", "*\nThe alpha to use to display this layer, from fully opaque (1.0f) to fully transparent (0.0f).",
			 "notify", "true",
			 "propertyCategory", "PRESENTATION_SETTINGS"
		   });	
		addAnnotation
		  (urlImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nImageMapLayer that refers to an image at a URL"
		   });	
		addAnnotation
		  (getURLImageMapLayer_LegendURL(), 
		   source, 
		   new String[] {
			 "documentation", " URL to the Image Map Layer legend.",
			 "propertyCategory", "URL"
		   });	
		addAnnotation
		  (topologyTreeMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nA map Layer that contains an arbitray topology tree."
		   });	
		addAnnotation
		  (getTopologyTreeMapLayer_TopologyTreeRoot(), 
		   source, 
		   new String[] {
			 "documentation", "The root of the topology contained in this layer.",
			 "children", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (topologyTreeMapLayerNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Specialized GroupNode which parent node is overloarded to make it transient.\nThis is necessary to avoid dangling exceptions."
		   });	
		addAnnotation
		  (cartesianTriangularMeshMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nAbstract base class of all Cartesian Triangular Mesh Map Layers"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer__GetCurrentMesh(), 
		   source, 
		   new String[] {
			 "documentation", " Operation that returns the CartesianTriangularMesh associated with this layer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer__ForceUpdateTextureImage(), 
		   source, 
		   new String[] {
			 "documentation", " Forces the texture image projected onto the mesh to be updated."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_MeshIsDirty(), 
		   source, 
		   new String[] {
			 "documentation", " Wheter of not the current mesh needs to be refreshed.",
			 "property", "None",
			 "propertyCategory", "TRIANGULAR_MESH"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_MapLayerPresentations(), 
		   source, 
		   new String[] {
			 "documentation", " A list of map layer presentation associated with this CartesianTriangularMeshMapLayer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_TextureImage(), 
		   source, 
		   new String[] {
			 "documentation", " The texture currently displayed on top of the mesh layer.",
			 "children", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshMapLayer_CartesianTriangularMeshMapLayerNode(), 
		   source, 
		   new String[] {
			 "documentation", " The node representing this layer in the topology.",
			 "property", "None"
		   });	
		addAnnotation
		  (cartesianTriangularMeshDerivedImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Asbtract class defining an ImageMapLayer for which the image is derived from a Mesh."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshDerivedImageMapLayer_RequiredResolution(), 
		   source, 
		   new String[] {
			 "documentation", " The required resolution, in meters / pixels",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "m/pixel"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshDerivedImageMapLayer_CartesianTriangularMeshMapLayer(), 
		   source, 
		   new String[] {
			 "documentation", "The map layer containing the mesh for which to generate the slope map.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (cartesianTriangularMeshSlopeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialized ImageMapLayer that generate a slope map image associated with a CartesianTriangularMeshMapLayer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshSlopeImageMapLayer_AutoScale(), 
		   source, 
		   new String[] {
			 "documentation", "Wether or not to use autoscalling to generate the color scale.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshSlopeImageMapLayer_MinimumSlope(), 
		   source, 
		   new String[] {
			 "documentation", "The minimum slope to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "deg"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshSlopeImageMapLayer_MaximumSlope(), 
		   source, 
		   new String[] {
			 "documentation", "The maximum slope to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "deg"
		   });	
		addAnnotation
		  (cartesianTriangularMeshDiscreteSlopeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialized CartesianTriangularMeshSlopeImageMapLayer that generate a slope with discrete slope intervals."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshDiscreteSlopeImageMapLayer_SlopeRanges(), 
		   source, 
		   new String[] {
			 "documentation", "The range of slope for which to generate colors."
		   });	
		addAnnotation
		  (cartesianTriangularMeshHeightImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", " A specialized ImageMapLayer that generate a height map image associated with a CartesianTriangularMeshMapLayer."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshHeightImageMapLayer_AutoScale(), 
		   source, 
		   new String[] {
			 "documentation", "Wether or not to use autoscalling to generate the color scale.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshHeightImageMapLayer_MinimumHeight(), 
		   source, 
		   new String[] {
			 "documentation", "The minimum height to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getCartesianTriangularMeshHeightImageMapLayer_MaximumHeight(), 
		   source, 
		   new String[] {
			 "documentation", "The maximum height to use to generate the color scale. This is applicable only if autoScale is true.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (slopeRangeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Class defining a slope range and its associated color."
		   });	
		addAnnotation
		  (getSlopeRange_SlopeLowerBound(), 
		   source, 
		   new String[] {
			 "documentation", "Lower bound of the slope range. Always positive",
			 "property", "Editable",
			 "csa_units", "deg"
		   });	
		addAnnotation
		  (getSlopeRange_SlopeUpperBound(), 
		   source, 
		   new String[] {
			 "documentation", "Upper bound of the slope range. Always positive, and should be larger than slopeLower.",
			 "property", "Editable",
			 "csa_units", "deg"
		   });	
		addAnnotation
		  (getSlopeRange_Color(), 
		   source, 
		   new String[] {
			 "documentation", "The color to use for this slope range.",
			 "property", "Editable"
		   });	
		addAnnotation
		  (lineOfSightImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "A specialized CartesianTriangularMeshDerivedImageMapLayer that generate a image showing wether or not line of sight is present\nbetween a point above the mesh and a specified fixed location."
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_LineOfSightAvailableColor(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to mark line of sigh is available.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_LineOfSightNotAvailableColor(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to mark line of sigh is NOT available.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_ObserverPose(), 
		   source, 
		   new String[] {
			 "documentation", "The pose of the observer with which we want line of sight.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_TargetHeightAboveGround(), 
		   source, 
		   new String[] {
			 "documentation", "The height of target above ground.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getLineOfSightImageMapLayer_UseHeightPerpendicularToGround(), 
		   source, 
		   new String[] {
			 "documentation", "Wheter or not find each target position using the local normal.\nUsing the local normal requires more processing time.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (abstractShapeImageLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nBase class of image map layer that represent a 2D shape."
		   });	
		addAnnotation
		  (getAbstractShapeImageLayer_ShapedFilled(), 
		   source, 
		   new String[] {
			 "documentation", "Wether or not the shape should be drawn as a filled polygon.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractShapeImageLayer_Color(), 
		   source, 
		   new String[] {
			 "documentation", "Color to use to draw the polygon and fill it is required.",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS"
		   });	
		addAnnotation
		  (getAbstractShapeImageLayer_RequiredResolution(), 
		   source, 
		   new String[] {
			 "documentation", " The required resolution, in meters / pixels",
			 "property", "Editable",
			 "propertyCategory", "IMAGE_GENERATION_SETTINGS",
			 "csa_units", "m/pixel"
		   });	
		addAnnotation
		  (ellipseShapeImageLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nAn image map layer representing an ellipse."
		   });	
		addAnnotation
		  (getEllipseShapeImageLayer_EllipseWidth(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ELLIPSE_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getEllipseShapeImageLayer_EllipseHeight(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ELLIPSE_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getEllipseShapeImageLayer_ShowCenterLines(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "ELLIPSE_SETTINGS"
		   });	
		addAnnotation
		  (rectangleShapeImageLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "*\nAn image map layer representing an ellipse."
		   });	
		addAnnotation
		  (getRectangleShapeImageLayer_RectangleWidth(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "RECTANGLE_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangleShapeImageLayer_RectangleHeight(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "RECTANGLE_SETTINGS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getRectangleShapeImageLayer_ShowCenterLines(), 
		   source, 
		   new String[] {
			 "property", "Editable",
			 "propertyCategory", "RECTANGLE_SETTINGS"
		   });	
		addAnnotation
		  (polygonShapeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Abstract base class of Image Map Layer that are defined by a series of vertices."
		   });	
		addAnnotation
		  (getPolygonShapeImageMapLayer__GetVertices(), 
		   source, 
		   new String[] {
			 "documentation", " Returns the list of vertices required to draw the polygon."
		   });	
		addAnnotation
		  (cartesianCoordinatesPolygonShapeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "PolygonShapeImageMapLayer defined by a list of cartesian coordinates."
		   });	
		addAnnotation
		  (geographicCoordinatesPolygonShapeImageMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "PolygonShapeImageMapLayer defined by a list of Geographic Coordinates."
		   });	
		addAnnotation
		  (basicCartesianTriangularMeshMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer that contains a Cartesian Triangular Mesh."
		   });	
		addAnnotation
		  (getBasicCartesianTriangularMeshMapLayer_Mesh(), 
		   source, 
		   new String[] {
			 "property", "Readonly",
			 "propertyCategory", "TRIANGULAR_MESH"
		   });	
		addAnnotation
		  (cartesianTriangularMeshURLMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer that contains a URL to a Cartesian Triangular Mesh."
		   });	
		addAnnotation
		  (getCartesianTriangularMeshURLMapLayer_Mesh(), 
		   source, 
		   new String[] {
			 "property", "Readonly",
			 "propertyCategory", "TRIANGULAR_MESH"
		   });	
		addAnnotation
		  (featuresOfInterestMapLayerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Map Layer that contains Feature Of Interest."
		   });	
		addAnnotation
		  (cartesianTriangularMeshMapLayerNodeEClass, 
		   source, 
		   new String[] {
			 "documentation", "Specialized Node used to represent a artesianTriangularMeshMapLayer in the topology."
		   });
	}

} //SymphonyEnvironmentPackageImpl
