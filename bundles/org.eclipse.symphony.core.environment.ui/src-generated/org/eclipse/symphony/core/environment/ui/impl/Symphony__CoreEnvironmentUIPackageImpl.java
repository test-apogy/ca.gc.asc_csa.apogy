/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui.impl;

import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;
import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.images.Symphony__CommonImagesPackage;
import org.eclipse.symphony.common.math.Symphony__CommonMathPackage;
import org.eclipse.symphony.common.topology.ui.Symphony__CommonTopologyUIPackage;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.environment.ui.AbstractTrajectoryTool;
import org.eclipse.symphony.core.environment.ui.AbstractVariableAnnotation;
import org.eclipse.symphony.core.environment.ui.DefaultVariableTrajectoryProvider;
import org.eclipse.symphony.core.environment.ui.EarthSkyPresentation;
import org.eclipse.symphony.core.environment.ui.EarthSurfaceWorksitePresentation;
import org.eclipse.symphony.core.environment.ui.EnvironmentUiFacade;
import org.eclipse.symphony.core.environment.ui.EnvironmentUiUtilities;
import org.eclipse.symphony.core.environment.ui.FeatureOfInterestNodePresentation;
import org.eclipse.symphony.core.environment.ui.FeaturesOfInterestMapLayerPresentation;
import org.eclipse.symphony.core.environment.ui.MapAnnotation;
import org.eclipse.symphony.core.environment.ui.MapRuler;
import org.eclipse.symphony.core.environment.ui.MapTool;
import org.eclipse.symphony.core.environment.ui.MapViewConfiguration;
import org.eclipse.symphony.core.environment.ui.MapViewConfigurationList;
import org.eclipse.symphony.core.environment.ui.MapViewItemPresentation;
import org.eclipse.symphony.core.environment.ui.MoonPresentation;
import org.eclipse.symphony.core.environment.ui.PoseVariableAnnotation;
import org.eclipse.symphony.core.environment.ui.StarFieldPresentation;
import org.eclipse.symphony.core.environment.ui.SunPresentation;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIFactory;
import org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage;
import org.eclipse.symphony.core.environment.ui.TrajectoryPickingTool;
import org.eclipse.symphony.core.environment.ui.TrajectoryProvider;
import org.eclipse.symphony.core.environment.ui.VariableTrajectoryAnnotation;
import org.eclipse.symphony.core.environment.ui.VariableTrajectoryProvider;
import org.eclipse.symphony.core.environment.ui.VehicleVariableAnnotation;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.experimental.chart.swt.ChartComposite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CoreEnvironmentUIPackageImpl extends EPackageImpl implements Symphony__CoreEnvironmentUIPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass starFieldPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass sunPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSurfaceWorksitePresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass earthSkyPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass moonPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureOfInterestNodePresentationEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentUiUtilitiesEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass environmentUiFacadeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapViewConfigurationListEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapViewConfigurationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapViewItemPresentationEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresOfInterestMapLayerPresentationEClass = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapToolEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mapRulerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableTrajectoryProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass defaultVariableTrajectoryProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractVariableAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass poseVariableAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass variableTrajectoryAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass vehicleVariableAnnotationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass trajectoryProviderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass abstractTrajectoryToolEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass trajectoryPickingToolEClass = null;

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
  private EDataType point2dEDataType = null;

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
  private EDataType point3fEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType xySeriesEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType xyPlotEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType xyDataItemEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType abstractXYAnnotationEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType chartCompositeEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType jFreeChartEDataType = null;

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
	 * @see org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private Symphony__CoreEnvironmentUIPackageImpl()
  {
		super(eNS_URI, Symphony__CoreEnvironmentUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CoreEnvironmentUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static Symphony__CoreEnvironmentUIPackage init()
  {
		if (isInited) return (Symphony__CoreEnvironmentUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentUIPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CoreEnvironmentUIPackageImpl theSymphony__CoreEnvironmentUIPackage = (Symphony__CoreEnvironmentUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CoreEnvironmentUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CoreEnvironmentUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Symphony__CommonTopologyUIPackage.eINSTANCE.eClass();
		Symphony__CoreEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CoreEnvironmentUIPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CoreEnvironmentUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CoreEnvironmentUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CoreEnvironmentUIPackage.eNS_URI, theSymphony__CoreEnvironmentUIPackage);
		return theSymphony__CoreEnvironmentUIPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getStarFieldPresentation()
  {
		return starFieldPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getStarFieldPresentation_CutOffMagnitude()
  {
		return (EAttribute)starFieldPresentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSunPresentation()
  {
		return sunPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSurfaceWorksitePresentation()
  {
		return earthSurfaceWorksitePresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_AxisVisible()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_AxisLength()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_AzimuthVisible()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_ElevationLinesVisible()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_AzimuthLinesVisible()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_PlaneVisible()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_PlaneGridSize()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEarthSurfaceWorksitePresentation_PlaneSize()
  {
		return (EAttribute)earthSurfaceWorksitePresentationEClass.getEStructuralFeatures().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEarthSkyPresentation()
  {
		return earthSkyPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMoonPresentation()
  {
		return moonPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureOfInterestNodePresentation() {
		return featureOfInterestNodePresentationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureOfInterestNodePresentation_PoleHeight() {
		return (EAttribute)featureOfInterestNodePresentationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeatureOfInterestNodePresentation_FlagVisible() {
		return (EAttribute)featureOfInterestNodePresentationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironmentUiUtilities()
  {
		return environmentUiUtilitiesEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiUtilities__ToPoint3f__Star()
  {
		return environmentUiUtilitiesEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiUtilities__GetPointSizeForMagnitude__float_float_float_float_float()
  {
		return environmentUiUtilitiesEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiUtilities__GetSunLightColor__double()
  {
		return environmentUiUtilitiesEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiUtilities__GetSkyTransparency__double()
  {
		return environmentUiUtilitiesEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiUtilities__GetSkyColor__double()
  {
		return environmentUiUtilitiesEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEnvironmentUiFacade()
  {
		return environmentUiFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUiFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration() {
		return environmentUiFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int()
  {
		return environmentUiFacadeEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEnvironmentUiFacade__GetTrajectoryLength__XYSeries()
  {
		return environmentUiFacadeEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUiFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration() {
		return environmentUiFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUiFacade__GetActiveMapViewConfiguration__String() {
		return environmentUiFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUiFacade__GetActiveMapViewConfigurationList() {
		return environmentUiFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUiFacade__GetFeatureOfInterestLists__InvocatorSession() {
		return environmentUiFacadeEClass.getEOperations().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapViewConfigurationList()
  {
		return mapViewConfigurationListEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapViewConfigurationList_MapViewConfigurations()
  {
		return (EReference)mapViewConfigurationListEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapViewConfiguration()
  {
		return mapViewConfigurationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapViewConfiguration_MapLayers()
  {
		return (EReference)mapViewConfigurationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMapViewConfiguration_BackgroundColor()
  {
		return (EAttribute)mapViewConfigurationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapViewConfiguration_MapAnnotations()
  {
		return (EReference)mapViewConfigurationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapViewConfiguration_DefaultRectangularRegion() {
		return (EReference)mapViewConfigurationEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getMapViewConfiguration_MapImage()
  {
		return (EReference)mapViewConfigurationEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapViewConfiguration_MapImageRectangularRegion() {
		return (EReference)mapViewConfigurationEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMapViewConfiguration_Extent() {
		return (EReference)mapViewConfigurationEClass.getEStructuralFeatures().get(6);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMapViewConfiguration__ForceUpdate() {
		return mapViewConfigurationEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapViewItemPresentation()
  {
		return mapViewItemPresentationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMapViewItemPresentation_Visible()
  {
		return (EAttribute)mapViewItemPresentationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeaturesOfInterestMapLayerPresentation() {
		return featuresOfInterestMapLayerPresentationEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer() {
		return (EReference)featuresOfInterestMapLayerPresentationEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius() {
		return (EAttribute)featuresOfInterestMapLayerPresentationEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor() {
		return (EAttribute)featuresOfInterestMapLayerPresentationEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapAnnotation()
  {
		return mapAnnotationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMapAnnotation__GetXYShapeAnnotation()
  {
		return mapAnnotationEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapTool()
  {
		return mapToolEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMapTool_Active()
  {
		return (EAttribute)mapToolEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMapTool__Initialize__ChartComposite_JFreeChart()
  {
		return mapToolEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMapTool__Dispose()
  {
		return mapToolEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getMapTool__PositionSelected__int_double_double()
  {
		return mapToolEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMapRuler()
  {
		return mapRulerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getMapRuler_RulerColor()
  {
		return (EAttribute)mapRulerEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariableTrajectoryProvider()
  {
		return variableTrajectoryProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableTrajectoryProvider_VariableAnnotation()
  {
		return (EReference)variableTrajectoryProviderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableTrajectoryProvider_PoseProvider()
  {
		return (EReference)variableTrajectoryProviderEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDefaultVariableTrajectoryProvider()
  {
		return defaultVariableTrajectoryProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDefaultVariableTrajectoryProvider_DistanceThreshold()
  {
		return (EAttribute)defaultVariableTrajectoryProviderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDefaultVariableTrajectoryProvider_AzimuthThreshold()
  {
		return (EAttribute)defaultVariableTrajectoryProviderEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractVariableAnnotation()
  {
		return abstractVariableAnnotationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractVariableAnnotation_Variable()
  {
		return (EReference)abstractVariableAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractVariableAnnotation_VariableInstance()
  {
		return (EReference)abstractVariableAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getAbstractVariableAnnotation_SymphonySystemApiAdapter()
  {
		return (EReference)abstractVariableAnnotationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAbstractVariableAnnotation__UpdatePose__Matrix4x4() {
		return abstractVariableAnnotationEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPoseVariableAnnotation()
  {
		return poseVariableAnnotationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPoseVariableAnnotation_Vectorlength()
  {
		return (EAttribute)poseVariableAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPoseVariableAnnotation_VectorColor()
  {
		return (EAttribute)poseVariableAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPoseVariableAnnotation_ShowPose()
  {
		return (EAttribute)poseVariableAnnotationEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPoseVariableAnnotation__UpdatePose__double_double_double() {
		return poseVariableAnnotationEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVariableTrajectoryAnnotation()
  {
		return variableTrajectoryAnnotationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getVariableTrajectoryAnnotation_TrajectoryProvider()
  {
		return (EReference)variableTrajectoryAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getVehicleVariableAnnotation()
  {
		return vehicleVariableAnnotationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVehicleVariableAnnotation_VehicleLength()
  {
		return (EAttribute)vehicleVariableAnnotationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getVehicleVariableAnnotation_VehicleWidth()
  {
		return (EAttribute)vehicleVariableAnnotationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTrajectoryProvider()
  {
		return trajectoryProviderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTrajectoryProvider_LatestPosition()
  {
		return (EAttribute)trajectoryProviderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTrajectoryProvider_AzimuthAngle()
  {
		return (EAttribute)trajectoryProviderEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTrajectoryProvider_TrajectoryLength()
  {
		return (EAttribute)trajectoryProviderEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getTrajectoryProvider_TrajectoryColor()
  {
		return (EAttribute)trajectoryProviderEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTrajectoryProvider__Initialize()
  {
		return trajectoryProviderEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTrajectoryProvider__Clear()
  {
		return trajectoryProviderEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTrajectoryProvider__AsListOfPoint2d()
  {
		return trajectoryProviderEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getTrajectoryProvider__GetXYSeries()
  {
		return trajectoryProviderEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getAbstractTrajectoryTool()
  {
		return abstractTrajectoryToolEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTrajectoryPickingTool()
  {
		return trajectoryPickingToolEClass;
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
  public EDataType getPoint2d()
  {
		return point2dEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getColor3f()
  {
		return color3fEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getPoint3f()
  {
		return point3fEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getXYSeries()
  {
		return xySeriesEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getXYPlot()
  {
		return xyPlotEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getXYDataItem()
  {
		return xyDataItemEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getAbstractXYAnnotation()
  {
		return abstractXYAnnotationEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getChartComposite()
  {
		return chartCompositeEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getJFreeChart()
  {
		return jFreeChartEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CoreEnvironmentUIFactory getSymphony__CoreEnvironmentUIFactory() {
		return (Symphony__CoreEnvironmentUIFactory)getEFactoryInstance();
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
		starFieldPresentationEClass = createEClass(STAR_FIELD_PRESENTATION);
		createEAttribute(starFieldPresentationEClass, STAR_FIELD_PRESENTATION__CUT_OFF_MAGNITUDE);

		sunPresentationEClass = createEClass(SUN_PRESENTATION);

		earthSurfaceWorksitePresentationEClass = createEClass(EARTH_SURFACE_WORKSITE_PRESENTATION);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE);
		createEAttribute(earthSurfaceWorksitePresentationEClass, EARTH_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE);

		earthSkyPresentationEClass = createEClass(EARTH_SKY_PRESENTATION);

		moonPresentationEClass = createEClass(MOON_PRESENTATION);

		featureOfInterestNodePresentationEClass = createEClass(FEATURE_OF_INTEREST_NODE_PRESENTATION);
		createEAttribute(featureOfInterestNodePresentationEClass, FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT);
		createEAttribute(featureOfInterestNodePresentationEClass, FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE);

		environmentUiUtilitiesEClass = createEClass(ENVIRONMENT_UI_UTILITIES);
		createEOperation(environmentUiUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR);
		createEOperation(environmentUiUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT);
		createEOperation(environmentUiUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE);
		createEOperation(environmentUiUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE);
		createEOperation(environmentUiUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE);

		environmentUiFacadeEClass = createEClass(ENVIRONMENT_UI_FACADE);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST);
		createEOperation(environmentUiFacadeEClass, ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION);

		mapViewConfigurationListEClass = createEClass(MAP_VIEW_CONFIGURATION_LIST);
		createEReference(mapViewConfigurationListEClass, MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS);

		mapViewConfigurationEClass = createEClass(MAP_VIEW_CONFIGURATION);
		createEReference(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__MAP_LAYERS);
		createEAttribute(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR);
		createEReference(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS);
		createEReference(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION);
		createEReference(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__MAP_IMAGE);
		createEReference(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION);
		createEReference(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION__EXTENT);
		createEOperation(mapViewConfigurationEClass, MAP_VIEW_CONFIGURATION___FORCE_UPDATE);

		mapViewItemPresentationEClass = createEClass(MAP_VIEW_ITEM_PRESENTATION);
		createEAttribute(mapViewItemPresentationEClass, MAP_VIEW_ITEM_PRESENTATION__VISIBLE);

		mapAnnotationEClass = createEClass(MAP_ANNOTATION);
		createEOperation(mapAnnotationEClass, MAP_ANNOTATION___GET_XY_SHAPE_ANNOTATION);

		mapToolEClass = createEClass(MAP_TOOL);
		createEAttribute(mapToolEClass, MAP_TOOL__ACTIVE);
		createEOperation(mapToolEClass, MAP_TOOL___INITIALIZE__CHARTCOMPOSITE_JFREECHART);
		createEOperation(mapToolEClass, MAP_TOOL___DISPOSE);
		createEOperation(mapToolEClass, MAP_TOOL___POSITION_SELECTED__INT_DOUBLE_DOUBLE);

		mapRulerEClass = createEClass(MAP_RULER);
		createEAttribute(mapRulerEClass, MAP_RULER__RULER_COLOR);

		featuresOfInterestMapLayerPresentationEClass = createEClass(FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION);
		createEReference(featuresOfInterestMapLayerPresentationEClass, FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER);
		createEAttribute(featuresOfInterestMapLayerPresentationEClass, FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS);
		createEAttribute(featuresOfInterestMapLayerPresentationEClass, FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR);

		trajectoryProviderEClass = createEClass(TRAJECTORY_PROVIDER);
		createEAttribute(trajectoryProviderEClass, TRAJECTORY_PROVIDER__LATEST_POSITION);
		createEAttribute(trajectoryProviderEClass, TRAJECTORY_PROVIDER__AZIMUTH_ANGLE);
		createEAttribute(trajectoryProviderEClass, TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH);
		createEAttribute(trajectoryProviderEClass, TRAJECTORY_PROVIDER__TRAJECTORY_COLOR);
		createEOperation(trajectoryProviderEClass, TRAJECTORY_PROVIDER___INITIALIZE);
		createEOperation(trajectoryProviderEClass, TRAJECTORY_PROVIDER___CLEAR);
		createEOperation(trajectoryProviderEClass, TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D);
		createEOperation(trajectoryProviderEClass, TRAJECTORY_PROVIDER___GET_XY_SERIES);

		abstractTrajectoryToolEClass = createEClass(ABSTRACT_TRAJECTORY_TOOL);

		trajectoryPickingToolEClass = createEClass(TRAJECTORY_PICKING_TOOL);

		variableTrajectoryProviderEClass = createEClass(VARIABLE_TRAJECTORY_PROVIDER);
		createEReference(variableTrajectoryProviderEClass, VARIABLE_TRAJECTORY_PROVIDER__VARIABLE_ANNOTATION);
		createEReference(variableTrajectoryProviderEClass, VARIABLE_TRAJECTORY_PROVIDER__POSE_PROVIDER);

		defaultVariableTrajectoryProviderEClass = createEClass(DEFAULT_VARIABLE_TRAJECTORY_PROVIDER);
		createEAttribute(defaultVariableTrajectoryProviderEClass, DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__DISTANCE_THRESHOLD);
		createEAttribute(defaultVariableTrajectoryProviderEClass, DEFAULT_VARIABLE_TRAJECTORY_PROVIDER__AZIMUTH_THRESHOLD);

		abstractVariableAnnotationEClass = createEClass(ABSTRACT_VARIABLE_ANNOTATION);
		createEReference(abstractVariableAnnotationEClass, ABSTRACT_VARIABLE_ANNOTATION__VARIABLE);
		createEReference(abstractVariableAnnotationEClass, ABSTRACT_VARIABLE_ANNOTATION__VARIABLE_INSTANCE);
		createEReference(abstractVariableAnnotationEClass, ABSTRACT_VARIABLE_ANNOTATION__SYMPHONY_SYSTEM_API_ADAPTER);
		createEOperation(abstractVariableAnnotationEClass, ABSTRACT_VARIABLE_ANNOTATION___UPDATE_POSE__MATRIX4X4);

		poseVariableAnnotationEClass = createEClass(POSE_VARIABLE_ANNOTATION);
		createEAttribute(poseVariableAnnotationEClass, POSE_VARIABLE_ANNOTATION__VECTORLENGTH);
		createEAttribute(poseVariableAnnotationEClass, POSE_VARIABLE_ANNOTATION__VECTOR_COLOR);
		createEAttribute(poseVariableAnnotationEClass, POSE_VARIABLE_ANNOTATION__SHOW_POSE);
		createEOperation(poseVariableAnnotationEClass, POSE_VARIABLE_ANNOTATION___UPDATE_POSE__DOUBLE_DOUBLE_DOUBLE);

		variableTrajectoryAnnotationEClass = createEClass(VARIABLE_TRAJECTORY_ANNOTATION);
		createEReference(variableTrajectoryAnnotationEClass, VARIABLE_TRAJECTORY_ANNOTATION__TRAJECTORY_PROVIDER);

		vehicleVariableAnnotationEClass = createEClass(VEHICLE_VARIABLE_ANNOTATION);
		createEAttribute(vehicleVariableAnnotationEClass, VEHICLE_VARIABLE_ANNOTATION__VEHICLE_LENGTH);
		createEAttribute(vehicleVariableAnnotationEClass, VEHICLE_VARIABLE_ANNOTATION__VEHICLE_WIDTH);

		// Create data types
		listEDataType = createEDataType(LIST);
		point2dEDataType = createEDataType(POINT2D);
		color3fEDataType = createEDataType(COLOR3F);
		point3fEDataType = createEDataType(POINT3F);
		xySeriesEDataType = createEDataType(XY_SERIES);
		xyPlotEDataType = createEDataType(XY_PLOT);
		xyDataItemEDataType = createEDataType(XY_DATA_ITEM);
		abstractXYAnnotationEDataType = createEDataType(ABSTRACT_XY_ANNOTATION);
		chartCompositeEDataType = createEDataType(CHART_COMPOSITE);
		jFreeChartEDataType = createEDataType(JFREE_CHART);
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
		Symphony__CommonTopologyUIPackage theSymphony__CommonTopologyUIPackage = (Symphony__CommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		Symphony__CoreEnvironmentPackage theSymphony__CoreEnvironmentPackage = (Symphony__CoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreEnvironmentPackage.eNS_URI);
		Symphony__CommonImagesPackage theSymphony__CommonImagesPackage = (Symphony__CommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonImagesPackage.eNS_URI);
		Symphony__CorePackage theSymphony__CorePackage = (Symphony__CorePackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CorePackage.eNS_URI);
		Symphony__CoreInvocatorPackage theSymphony__CoreInvocatorPackage = (Symphony__CoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CoreInvocatorPackage.eNS_URI);
		Symphony__CommonEMFPackage theSymphony__CommonEMFPackage = (Symphony__CommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonEMFPackage.eNS_URI);
		Symphony__CommonMathPackage theSymphony__CommonMathPackage = (Symphony__CommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonMathPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		starFieldPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		sunPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		earthSurfaceWorksitePresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		earthSkyPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		moonPresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		featureOfInterestNodePresentationEClass.getESuperTypes().add(theSymphony__CommonTopologyUIPackage.getNodePresentation());
		mapViewConfigurationListEClass.getESuperTypes().add(theSymphony__CoreInvocatorPackage.getAbstractToolsListContainer());
		mapViewConfigurationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getNamed());
		mapViewConfigurationEClass.getESuperTypes().add(theSymphony__CommonEMFPackage.getDescribed());
		mapAnnotationEClass.getESuperTypes().add(this.getMapViewItemPresentation());
		mapToolEClass.getESuperTypes().add(this.getMapAnnotation());
		mapRulerEClass.getESuperTypes().add(this.getMapTool());
		featuresOfInterestMapLayerPresentationEClass.getESuperTypes().add(this.getMapAnnotation());
		featuresOfInterestMapLayerPresentationEClass.getESuperTypes().add(theSymphony__CoreEnvironmentPackage.getRectangularRegionProvider());
		abstractTrajectoryToolEClass.getESuperTypes().add(this.getTrajectoryProvider());
		abstractTrajectoryToolEClass.getESuperTypes().add(this.getMapTool());
		trajectoryPickingToolEClass.getESuperTypes().add(this.getAbstractTrajectoryTool());
		variableTrajectoryProviderEClass.getESuperTypes().add(this.getTrajectoryProvider());
		defaultVariableTrajectoryProviderEClass.getESuperTypes().add(this.getVariableTrajectoryProvider());
		abstractVariableAnnotationEClass.getESuperTypes().add(this.getMapAnnotation());
		poseVariableAnnotationEClass.getESuperTypes().add(this.getAbstractVariableAnnotation());
		variableTrajectoryAnnotationEClass.getESuperTypes().add(this.getAbstractVariableAnnotation());
		variableTrajectoryAnnotationEClass.getESuperTypes().add(this.getTrajectoryProvider());
		vehicleVariableAnnotationEClass.getESuperTypes().add(this.getPoseVariableAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(starFieldPresentationEClass, StarFieldPresentation.class, "StarFieldPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStarFieldPresentation_CutOffMagnitude(), theEcorePackage.getEFloat(), "cutOffMagnitude", "6.0", 0, 1, StarFieldPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sunPresentationEClass, SunPresentation.class, "SunPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(earthSurfaceWorksitePresentationEClass, EarthSurfaceWorksitePresentation.class, "EarthSurfaceWorksitePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEarthSurfaceWorksitePresentation_AxisVisible(), theEcorePackage.getEBoolean(), "axisVisible", "true", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_AxisLength(), theEcorePackage.getEDouble(), "axisLength", "10.0", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_AzimuthVisible(), theEcorePackage.getEBoolean(), "azimuthVisible", "true", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_ElevationLinesVisible(), theEcorePackage.getEBoolean(), "elevationLinesVisible", "true", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_AzimuthLinesVisible(), theEcorePackage.getEBoolean(), "azimuthLinesVisible", "true", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_PlaneVisible(), theEcorePackage.getEBoolean(), "planeVisible", "true", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_PlaneGridSize(), theEcorePackage.getEDouble(), "planeGridSize", "1.0", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEarthSurfaceWorksitePresentation_PlaneSize(), theEcorePackage.getEDouble(), "planeSize", "10.0", 0, 1, EarthSurfaceWorksitePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(earthSkyPresentationEClass, EarthSkyPresentation.class, "EarthSkyPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moonPresentationEClass, MoonPresentation.class, "MoonPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureOfInterestNodePresentationEClass, FeatureOfInterestNodePresentation.class, "FeatureOfInterestNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureOfInterestNodePresentation_PoleHeight(), theEcorePackage.getEDouble(), "poleHeight", null, 0, 1, FeatureOfInterestNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureOfInterestNodePresentation_FlagVisible(), theEcorePackage.getEBoolean(), "flagVisible", "false", 0, 1, FeatureOfInterestNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentUiUtilitiesEClass, EnvironmentUiUtilities.class, "EnvironmentUiUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEnvironmentUiUtilities__ToPoint3f__Star(), this.getPoint3f(), "toPoint3f", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreEnvironmentPackage.getStar(), "star", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiUtilities__GetPointSizeForMagnitude__float_float_float_float_float(), theEcorePackage.getEFloat(), "getPointSizeForMagnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitudeRangeMinimum", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitudeRangeMaximum", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "minimumPointSize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "maximumPointSize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiUtilities__GetSunLightColor__double(), this.getColor3f(), "getSunLightColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiUtilities__GetSkyTransparency__double(), theEcorePackage.getEDouble(), "getSkyTransparency", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiUtilities__GetSkyColor__double(), this.getColor3f(), "getSkyColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(environmentUiFacadeEClass, EnvironmentUiFacade.class, "EnvironmentUiFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEnvironmentUiFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration(), null, "getVisibleRectangularRegionProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMapViewConfiguration(), "mapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theSymphony__CoreEnvironmentPackage.getRectangularRegionProvider());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEnvironmentUiFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int(), theSymphony__CommonImagesPackage.getAbstractEImage(), "getImageMapLayerPresentationImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMapViewConfiguration(), "mapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreEnvironmentPackage.getRectangularRegion(), "mapViewExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "maximumImageSizePixels", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiFacade__GetTrajectoryLength__XYSeries(), theEcorePackage.getEDouble(), "getTrajectoryLength", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXYSeries(), "xySeries", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration(), theEcorePackage.getEString(), "getMapViewConfigurationIdentifier", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMapViewConfiguration(), "mapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiFacade__GetActiveMapViewConfiguration__String(), this.getMapViewConfiguration(), "getActiveMapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "identifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnvironmentUiFacade__GetActiveMapViewConfigurationList(), this.getMapViewConfigurationList(), "getActiveMapViewConfigurationList", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUiFacade__GetFeatureOfInterestLists__InvocatorSession(), null, "getFeatureOfInterestLists", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CoreInvocatorPackage.getInvocatorSession(), "session", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theSymphony__CorePackage.getFeatureOfInterestList());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(mapViewConfigurationListEClass, MapViewConfigurationList.class, "MapViewConfigurationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapViewConfigurationList_MapViewConfigurations(), this.getMapViewConfiguration(), null, "mapViewConfigurations", null, 0, -1, MapViewConfigurationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapViewConfigurationEClass, MapViewConfiguration.class, "MapViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapViewConfiguration_MapLayers(), theSymphony__CoreEnvironmentPackage.getImageMapLayerPresentation(), null, "mapLayers", null, 0, -1, MapViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewConfiguration_BackgroundColor(), this.getColor3f(), "backgroundColor", "1.0,1.0,1.0", 0, 1, MapViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_MapAnnotations(), this.getMapAnnotation(), null, "mapAnnotations", null, 0, -1, MapViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_DefaultRectangularRegion(), theSymphony__CoreEnvironmentPackage.getRectangularRegion(), null, "defaultRectangularRegion", null, 1, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_MapImage(), theSymphony__CommonImagesPackage.getAbstractEImage(), null, "mapImage", null, 0, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_MapImageRectangularRegion(), theSymphony__CoreEnvironmentPackage.getRectangularRegion(), null, "mapImageRectangularRegion", null, 1, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_Extent(), theSymphony__CoreEnvironmentPackage.getRectangularRegion(), null, "extent", null, 1, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getMapViewConfiguration__ForceUpdate(), null, "forceUpdate", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(mapViewItemPresentationEClass, MapViewItemPresentation.class, "MapViewItemPresentation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapViewItemPresentation_Visible(), theEcorePackage.getEBoolean(), "visible", "true", 0, 1, MapViewItemPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapAnnotationEClass, MapAnnotation.class, "MapAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMapAnnotation__GetXYShapeAnnotation(), null, "getXYShapeAnnotation", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getAbstractXYAnnotation());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(mapToolEClass, MapTool.class, "MapTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapTool_Active(), theEcorePackage.getEBoolean(), "active", "true", 0, 1, MapTool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMapTool__Initialize__ChartComposite_JFreeChart(), null, "initialize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChartComposite(), "composite", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getJFreeChart(), "chart", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getMapTool__Dispose(), null, "dispose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMapTool__PositionSelected__int_double_double(), null, "positionSelected", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "mouseButton", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(mapRulerEClass, MapRuler.class, "MapRuler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMapRuler_RulerColor(), this.getColor3f(), "rulerColor", "0.0,1.0,0.0", 0, 1, MapRuler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresOfInterestMapLayerPresentationEClass, FeaturesOfInterestMapLayerPresentation.class, "FeaturesOfInterestMapLayerPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer(), theSymphony__CoreEnvironmentPackage.getFeaturesOfInterestMapLayer(), null, "featuresOfInterestMapLayer", null, 0, 1, FeaturesOfInterestMapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius(), theEcorePackage.getEDouble(), "featureOfInterestRadius", "0.25", 0, 1, FeaturesOfInterestMapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor(), this.getColor3f(), "featureOfInterestColor", "0.0,0.0,1.0", 0, 1, FeaturesOfInterestMapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trajectoryProviderEClass, TrajectoryProvider.class, "TrajectoryProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrajectoryProvider_LatestPosition(), this.getXYDataItem(), "latestPosition", null, 0, 1, TrajectoryProvider.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectoryProvider_AzimuthAngle(), theEcorePackage.getEDouble(), "azimuthAngle", "0.0", 0, 1, TrajectoryProvider.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectoryProvider_TrajectoryLength(), theEcorePackage.getEDouble(), "trajectoryLength", "0.0", 0, 1, TrajectoryProvider.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrajectoryProvider_TrajectoryColor(), this.getColor3f(), "trajectoryColor", "0.0,1.0,0.0", 0, 1, TrajectoryProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTrajectoryProvider__Initialize(), null, "initialize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrajectoryProvider__Clear(), null, "clear", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTrajectoryProvider__AsListOfPoint2d(), null, "asListOfPoint2d", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getPoint2d());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getTrajectoryProvider__GetXYSeries(), this.getXYSeries(), "getXYSeries", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(abstractTrajectoryToolEClass, AbstractTrajectoryTool.class, "AbstractTrajectoryTool", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trajectoryPickingToolEClass, TrajectoryPickingTool.class, "TrajectoryPickingTool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableTrajectoryProviderEClass, VariableTrajectoryProvider.class, "VariableTrajectoryProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableTrajectoryProvider_VariableAnnotation(), this.getVariableTrajectoryAnnotation(), this.getVariableTrajectoryAnnotation_TrajectoryProvider(), "variableAnnotation", null, 0, 1, VariableTrajectoryProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableTrajectoryProvider_PoseProvider(), theSymphony__CorePackage.getPoseProvider(), null, "poseProvider", null, 1, 1, VariableTrajectoryProvider.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultVariableTrajectoryProviderEClass, DefaultVariableTrajectoryProvider.class, "DefaultVariableTrajectoryProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultVariableTrajectoryProvider_DistanceThreshold(), theEcorePackage.getEDouble(), "distanceThreshold", "0.5", 0, 1, DefaultVariableTrajectoryProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultVariableTrajectoryProvider_AzimuthThreshold(), theEcorePackage.getEDouble(), "azimuthThreshold", "0.017", 0, 1, DefaultVariableTrajectoryProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractVariableAnnotationEClass, AbstractVariableAnnotation.class, "AbstractVariableAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractVariableAnnotation_Variable(), theSymphony__CoreInvocatorPackage.getVariable(), null, "variable", null, 1, 1, AbstractVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVariableAnnotation_VariableInstance(), theEcorePackage.getEObject(), null, "variableInstance", null, 0, 1, AbstractVariableAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVariableAnnotation_SymphonySystemApiAdapter(), theSymphony__CorePackage.getSymphonySystemApiAdapter(), null, "symphonySystemApiAdapter", null, 0, 1, AbstractVariableAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractVariableAnnotation__UpdatePose__Matrix4x4(), null, "updatePose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theSymphony__CommonMathPackage.getMatrix4x4(), "newPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(poseVariableAnnotationEClass, PoseVariableAnnotation.class, "PoseVariableAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoseVariableAnnotation_Vectorlength(), theEcorePackage.getEDouble(), "vectorlength", "10.0", 0, 1, PoseVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoseVariableAnnotation_VectorColor(), this.getColor3f(), "vectorColor", "0.0,0.0,1.0", 0, 1, PoseVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoseVariableAnnotation_ShowPose(), theEcorePackage.getEBoolean(), "showPose", "true", 0, 1, PoseVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPoseVariableAnnotation__UpdatePose__double_double_double(), null, "updatePose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "x", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "y", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "zRotation", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(variableTrajectoryAnnotationEClass, VariableTrajectoryAnnotation.class, "VariableTrajectoryAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableTrajectoryAnnotation_TrajectoryProvider(), this.getVariableTrajectoryProvider(), this.getVariableTrajectoryProvider_VariableAnnotation(), "trajectoryProvider", null, 1, 1, VariableTrajectoryAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleVariableAnnotationEClass, VehicleVariableAnnotation.class, "VehicleVariableAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleVariableAnnotation_VehicleLength(), theEcorePackage.getEDouble(), "vehicleLength", "1.0", 0, 1, VehicleVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleVariableAnnotation_VehicleWidth(), theEcorePackage.getEDouble(), "vehicleWidth", "0.5", 0, 1, VehicleVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point2dEDataType, Point2d.class, "Point2d", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(color3fEDataType, Color3f.class, "Color3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(point3fEDataType, Point3f.class, "Point3f", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xySeriesEDataType, XYSeries.class, "XYSeries", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xyPlotEDataType, XYPlot.class, "XYPlot", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xyDataItemEDataType, XYDataItem.class, "XYDataItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(abstractXYAnnotationEDataType, AbstractXYAnnotation.class, "AbstractXYAnnotation", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chartCompositeEDataType, ChartComposite.class, "ChartComposite", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jFreeChartEDataType, JFreeChart.class, "JFreeChart", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			 "prefix", "Symphony__CoreEnvironmentUI",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)",
			 "modelName", "Symphony__CoreEnvironmentUI",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "modelDirectory", "/org.eclipse.symphony.core.environment.ui/src-generated",
			 "editDirectory", "/org.eclipse.symphony.core.environment.ui.edit/src-generated",
			 "basePackage", "org.eclipse.symphony.core.environment"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_AxisVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "AXIS"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_AxisLength(), 
		   source, 
		   new String[] {
			 "propertyCategory", "AXIS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_AzimuthVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "SKY"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_ElevationLinesVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "SKY"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_AzimuthLinesVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "SKY"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_PlaneVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "PLANE"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_PlaneGridSize(), 
		   source, 
		   new String[] {
			 "propertyCategory", "PLANE",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_PlaneSize(), 
		   source, 
		   new String[] {
			 "propertyCategory", "PLANE",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getEnvironmentUiUtilities__GetSunLightColor__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the sun color for a given altitude above the horizon.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEnvironmentUiUtilities__GetSunLightColor__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUiUtilities__GetSkyTransparency__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the transparency value (between no transparency 0 and full transparency 1.0)\nto be used for the blus sky as a function of the sun altitude angle.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEnvironmentUiUtilities__GetSkyTransparency__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUiUtilities__GetSkyColor__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the sky color for a given altitude above the horizon.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEnvironmentUiUtilities__GetSkyColor__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUiFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration(), 
		   source, 
		   new String[] {
			 "documentation", "Returns an image representing the assembly of the specified list of ImageMapLayerPresentation.\n@param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.\n@return The image representing the specified list of ImageMapLayerPresentation."
		   });	
		addAnnotation
		  (getEnvironmentUiFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int(), 
		   source, 
		   new String[] {
			 "documentation", "Returns an image representing the specified MapViewExtent using a specified MapViewConfiguration.\nIf the MapViewExtent is larger than the area covered by the MapViewConfiguration, transparent pixels will be added.\n@param mapViewConfiguration The specified MapViewConfiguration.\n@param mapViewExtent The specified ground area to be covered.\n@param maximumImageSizePixels The maximum size, in pixel, of the generated image.\n@return The image representing the specified MapViewExtent."
		   });	
		addAnnotation
		  (getEnvironmentUiFacade__GetTrajectoryLength__XYSeries(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the length of a 2D trajectory.\n@param The XYSeries.\n@return The length of the trajectory represented in the XYSerie."
		   });	
		addAnnotation
		  (getEnvironmentUiFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration(), 
		   source, 
		   new String[] {
			 "documentation", "Return the identifier associated with a given MapViewConfiguration.\n@param mapViewConfiguration The given MapViewConfiguration.\n@return The identifier, null if none is found."
		   });	
		addAnnotation
		  (getEnvironmentUiFacade__GetActiveMapViewConfiguration__String(), 
		   source, 
		   new String[] {
			 "documentation", "Return the MapViewConfiguration (in the Active Session) with the specified identifier.\n@param identifier The MapViewConfiguration identifier.\n@return The MapViewConfiguration with the specified identifier, null if non is found."
		   });	
		addAnnotation
		  (getEnvironmentUiFacade__GetActiveMapViewConfigurationList(), 
		   source, 
		   new String[] {
			 "documentation", "Return the MapViewConfigurationList in the Active Session.\n@return The MapViewConfigurationList in the Active Session, null if none is found."
		   });	
		addAnnotation
		  (mapViewConfigurationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Configuration used for the Map View."
		   });	
		addAnnotation
		  (getMapViewConfiguration__ForceUpdate(), 
		   source, 
		   new String[] {
			 "documentation", "Forces the updates of all derived values."
		   });	
		addAnnotation
		  (getMapViewConfiguration_MapLayers(), 
		   source, 
		   new String[] {
			 "documentation", "List of Maps being displayed.",
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getMapViewConfiguration_BackgroundColor(), 
		   source, 
		   new String[] {
			 "documentation", "Color of the map background."
		   });	
		addAnnotation
		  (getMapViewConfiguration_MapAnnotations(), 
		   source, 
		   new String[] {
			 "documentation", "List of Symphony System instances being tracked.",
			 "children", "true",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getMapViewConfiguration_DefaultRectangularRegion(), 
		   source, 
		   new String[] {
			 "documentation", "Default region to use when none is covered by the map Layers"
		   });	
		addAnnotation
		  (getMapViewConfiguration_MapImage(), 
		   source, 
		   new String[] {
			 "documentation", "The image representing the active ImageMapLayers.",
			 "children", "false",
			 "notify", "true",
			 "property", "None"
		   });	
		addAnnotation
		  (getMapViewConfiguration_MapImageRectangularRegion(), 
		   source, 
		   new String[] {
			 "documentation", "The rectangular region covered by the image layers defined in the map.",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (getMapViewConfiguration_Extent(), 
		   source, 
		   new String[] {
			 "documentation", "The rectangular region covered by the map (typically larger than\nmapImageRectangularRegion and contains mapImageRectangularRegion).",
			 "children", "false",
			 "notify", "true",
			 "property", "Readonly"
		   });	
		addAnnotation
		  (mapViewItemPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Presentation properties for an item displayed\non the MapView."
		   });	
		addAnnotation
		  (getMapViewItemPresentation_Visible(), 
		   source, 
		   new String[] {
			 "documentation", "Visibility"
		   });	
		addAnnotation
		  (mapAnnotationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Presentation properties for an ImageMapLayer displayed on the MapView."
		   });	
		addAnnotation
		  (getMapAnnotation__GetXYShapeAnnotation(), 
		   source, 
		   new String[] {
			 "documentation", " TheXYPlot being used by MapView."
		   });	
		addAnnotation
		  (mapToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class of all map tools."
		   });	
		addAnnotation
		  (getMapTool__Initialize__ChartComposite_JFreeChart(), 
		   source, 
		   new String[] {
			 "documentation", "Method that is called to give access to the underlying ChartComposite and JFreeChart used to display the map.\n@param composite The ChartComposite used to display the map.\n@param chart The JFreeChart used to display the map."
		   });	
		addAnnotation
		  (getMapTool__Dispose(), 
		   source, 
		   new String[] {
			 "documentation", "Method that is called to dispose of the tool."
		   });	
		addAnnotation
		  (getMapTool__PositionSelected__int_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Method called when the user clicks on the map with the mouse.\n@param mouseButton The mouse button clicked\n@param x The absolute position x coordinates of the point selected.\n@param y The absolute position y coordinates of the point selected."
		   });	
		addAnnotation
		  (getMapTool_Active(), 
		   source, 
		   new String[] {
			 "documentation", "Whether or not the tool is active."
		   });	
		addAnnotation
		  (mapRulerEClass, 
		   source, 
		   new String[] {
			 "documentation", "Tool that shows the distance between two point on the map. The use needs to\nselects two positions on the map by clicking using the left button on the mouse."
		   });	
		addAnnotation
		  (getMapRuler_RulerColor(), 
		   source, 
		   new String[] {
			 "documentation", "The color of the ruler."
		   });	
		addAnnotation
		  (featuresOfInterestMapLayerPresentationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Presentation properties for a FeaturesOfInterestMapLayer."
		   });	
		addAnnotation
		  (getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "FOI_PROPERTIES"
		   });	
		addAnnotation
		  (getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestRadius(), 
		   source, 
		   new String[] {
			 "notify", "true",
			 "propertyCategory", "FOI_PROPERTIES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getFeaturesOfInterestMapLayerPresentation_FeatureOfInterestColor(), 
		   source, 
		   new String[] {
			 "documentation", "* The color of the vector.",
			 "propertyCategory", "FOI_PROPERTIES"
		   });	
		addAnnotation
		  (trajectoryProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for classes providing a trajectory."
		   });	
		addAnnotation
		  (getTrajectoryProvider__Initialize(), 
		   source, 
		   new String[] {
			 "documentation", "Re-initialize the TrajectoryProvider."
		   });	
		addAnnotation
		  (getTrajectoryProvider__Clear(), 
		   source, 
		   new String[] {
			 "documentation", "Clears the list of points and associated trajectory."
		   });	
		addAnnotation
		  (getTrajectoryProvider__AsListOfPoint2d(), 
		   source, 
		   new String[] {
			 "documentation", "Returns the current trajectory as a list of Point2d."
		   });	
		addAnnotation
		  (getTrajectoryProvider__GetXYSeries(), 
		   source, 
		   new String[] {
			 "documentation", "The XYSeries containing the trajectory data to be displayed.",
			 "property", "None"
		   });	
		addAnnotation
		  (getTrajectoryProvider_LatestPosition(), 
		   source, 
		   new String[] {
			 "documentation", "Latest x coordinates."
		   });	
		addAnnotation
		  (getTrajectoryProvider_AzimuthAngle(), 
		   source, 
		   new String[] {
			 "documentation", "The azimuth of the latest position, in radians, as measured relative to the x axis, positive clockwise.",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getTrajectoryProvider_TrajectoryLength(), 
		   source, 
		   new String[] {
			 "documentation", "The current length of the trajectory.",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getTrajectoryProvider_TrajectoryColor(), 
		   source, 
		   new String[] {
			 "documentation", "The color of the ruler."
		   });	
		addAnnotation
		  (abstractTrajectoryToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for user map tools that display trajectory on a map."
		   });	
		addAnnotation
		  (trajectoryPickingToolEClass, 
		   source, 
		   new String[] {
			 "documentation", "Tool that allows a user to define a trajectory by clicking on a map.\nClicking on the left mouse button add a point to the trajectory, cliking on\nthe right mouse button removes the last point of the trajectory."
		   });	
		addAnnotation
		  (variableTrajectoryProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class for TrajectoryProvider that are providing trajectory based on a VariableTrajectoryAnnotation."
		   });	
		addAnnotation
		  (getVariableTrajectoryProvider_VariableAnnotation(), 
		   source, 
		   new String[] {
			 "property", "None"
		   });	
		addAnnotation
		  (getVariableTrajectoryProvider_PoseProvider(), 
		   source, 
		   new String[] {
			 "documentation", " The Symphony System being displayed. This is automatically updated."
		   });	
		addAnnotation
		  (defaultVariableTrajectoryProviderEClass, 
		   source, 
		   new String[] {
			 "documentation", "Default implementation of VariableTrajectoryProvider. This implementation makes use of thresholds\nto limits the number of position update of the trajectory to improve performance."
		   });	
		addAnnotation
		  (getDefaultVariableTrajectoryProvider_DistanceThreshold(), 
		   source, 
		   new String[] {
			 "documentation", " Minimum distance to keep between points added to the XYSeries.",
			 "propertyCategory", "THRESHOLDS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getDefaultVariableTrajectoryProvider_AzimuthThreshold(), 
		   source, 
		   new String[] {
			 "documentation", " Minimum azimuth change that will trigger an azimuthAngle change.",
			 "propertyCategory", "THRESHOLDS",
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (abstractVariableAnnotationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Base class used for MapAnnotation representing a variable on a Map."
		   });	
		addAnnotation
		  (getAbstractVariableAnnotation__UpdatePose__Matrix4x4(), 
		   source, 
		   new String[] {
			 "documentation", "Method called when the pose of the variable changes.\n@param newPose The new pose matrix."
		   });	
		addAnnotation
		  (getAbstractVariableAnnotation_Variable(), 
		   source, 
		   new String[] {
			 "documentation", "The Symphony System being displayed."
		   });	
		addAnnotation
		  (getAbstractVariableAnnotation_VariableInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The instance of the object adapted by the Symphony System."
		   });	
		addAnnotation
		  (getAbstractVariableAnnotation_SymphonySystemApiAdapter(), 
		   source, 
		   new String[] {
			 "documentation", "The current instance of  SymphonySystemApiAdapter handling the variable."
		   });	
		addAnnotation
		  (poseVariableAnnotationEClass, 
		   source, 
		   new String[] {
			 "documentation", "AbstractVariableAnnotation that shows the position and orientation of a variable on a Map."
		   });	
		addAnnotation
		  (getPoseVariableAnnotation__UpdatePose__double_double_double(), 
		   source, 
		   new String[] {
			 "documentation", "Method called when the position or orientation of the variable changes.\n@param x The x coordinates, in meters.\n@param y The y coordinates, in meters.\n@param zRotation The azimuth, in radians."
		   });	
		addAnnotation
		  ((getPoseVariableAnnotation__UpdatePose__double_double_double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "csa_units", "m"
		   });	
		addAnnotation
		  ((getPoseVariableAnnotation__UpdatePose__double_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "csa_units", "m"
		   });	
		addAnnotation
		  ((getPoseVariableAnnotation__UpdatePose__double_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "csa_units", "rad"
		   });	
		addAnnotation
		  (getPoseVariableAnnotation_Vectorlength(), 
		   source, 
		   new String[] {
			 "documentation", "The length of the vector.",
			 "propertyCategory", "VECTOR_PROPERTIES",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getPoseVariableAnnotation_VectorColor(), 
		   source, 
		   new String[] {
			 "documentation", "The color of the vector.",
			 "propertyCategory", "VECTOR_PROPERTIES"
		   });	
		addAnnotation
		  (getPoseVariableAnnotation_ShowPose(), 
		   source, 
		   new String[] {
			 "documentation", "Whether to show the pose as text."
		   });	
		addAnnotation
		  (variableTrajectoryAnnotationEClass, 
		   source, 
		   new String[] {
			 "documentation", "AbstractVariableAnnotation that draws the trajectory of a variable on a map."
		   });	
		addAnnotation
		  (getVariableTrajectoryAnnotation_TrajectoryProvider(), 
		   source, 
		   new String[] {
			 "documentation", "The trajectory provider."
		   });	
		addAnnotation
		  (vehicleVariableAnnotationEClass, 
		   source, 
		   new String[] {
			 "documentation", "Specialization of PoseVariableAnnotation that also draws the shape of the vehicle on the map."
		   });	
		addAnnotation
		  (getVehicleVariableAnnotation_VehicleLength(), 
		   source, 
		   new String[] {
			 "documentation", "The length of the vehicle.",
			 "propertyCategory", "VEHICLE_DIMENSIONS",
			 "csa_units", "m"
		   });	
		addAnnotation
		  (getVehicleVariableAnnotation_VehicleWidth(), 
		   source, 
		   new String[] {
			 "documentation", "The width of the vehicle.",
			 "propertyCategory", "VEHICLE_DIMENSIONS",
			 "csa_units", "m"
		   });
	}

} //Symphony__CoreEnvironmentUIPackageImpl
