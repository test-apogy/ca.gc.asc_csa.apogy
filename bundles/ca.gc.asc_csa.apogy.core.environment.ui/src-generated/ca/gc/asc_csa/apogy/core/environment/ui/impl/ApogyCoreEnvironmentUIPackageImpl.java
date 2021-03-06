package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.AbstractTrajectoryTool;
import ca.gc.asc_csa.apogy.core.environment.ui.AbstractVariableAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.DefaultVariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.ui.EnvironmentUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.ui.FeatureOfInterestNodePresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.FeaturesOfInterestMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.MapAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.MapRuler;
import ca.gc.asc_csa.apogy.core.environment.ui.MapTool;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewItemPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.PoseVariableAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.StarFieldPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.SunPresentation;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.VariableTrajectoryAnnotation;
import ca.gc.asc_csa.apogy.core.environment.ui.VariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.ui.VehicleVariableAnnotation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
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
public class ApogyCoreEnvironmentUIPackageImpl extends EPackageImpl implements ApogyCoreEnvironmentUIPackage
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
	private EClass environmentUIUtilitiesEClass = null;

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCoreEnvironmentUIFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private ApogyCoreEnvironmentUIPackageImpl()
  {
		super(eNS_URI, ApogyCoreEnvironmentUIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCoreEnvironmentUIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static ApogyCoreEnvironmentUIPackage init()
  {
		if (isInited) return (ApogyCoreEnvironmentUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentUIPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCoreEnvironmentUIPackageImpl theApogyCoreEnvironmentUIPackage = (ApogyCoreEnvironmentUIPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCoreEnvironmentUIPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCoreEnvironmentUIPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ApogyCommonTopologyUIPackage.eINSTANCE.eClass();
		ApogyCoreEnvironmentPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theApogyCoreEnvironmentUIPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCoreEnvironmentUIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCoreEnvironmentUIPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCoreEnvironmentUIPackage.eNS_URI, theApogyCoreEnvironmentUIPackage);
		return theApogyCoreEnvironmentUIPackage;
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
	public EAttribute getEarthSkyPresentation_HorizonVisible() {
		return (EAttribute)earthSkyPresentationEClass.getEStructuralFeatures().get(0);
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
	public EClass getEnvironmentUIUtilities() {
		return environmentUIUtilitiesEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUIUtilities__ToPoint3f__Star() {
		return environmentUIUtilitiesEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float() {
		return environmentUIUtilitiesEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUIUtilities__GetSunLightColor__double() {
		return environmentUIUtilitiesEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUIUtilities__GetSkyTransparency__double() {
		return environmentUIUtilitiesEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnvironmentUIUtilities__GetSkyColor__double() {
		return environmentUIUtilitiesEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCoreEnvironmentUIFacade() {
		return apogyCoreEnvironmentUIFacadeEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetTrajectoryLength__XYSeries() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetActiveMapViewConfiguration__String() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetActiveMapViewConfigurationList() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCoreEnvironmentUIFacade__GetFeatureOfInterestLists__InvocatorSession() {
		return apogyCoreEnvironmentUIFacadeEClass.getEOperations().get(6);
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
  public EReference getAbstractVariableAnnotation_ApogySystemApiAdapter()
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
	public ApogyCoreEnvironmentUIFactory getApogyCoreEnvironmentUIFactory() {
		return (ApogyCoreEnvironmentUIFactory)getEFactoryInstance();
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
		createEAttribute(earthSkyPresentationEClass, EARTH_SKY_PRESENTATION__HORIZON_VISIBLE);

		moonPresentationEClass = createEClass(MOON_PRESENTATION);

		featureOfInterestNodePresentationEClass = createEClass(FEATURE_OF_INTEREST_NODE_PRESENTATION);
		createEAttribute(featureOfInterestNodePresentationEClass, FEATURE_OF_INTEREST_NODE_PRESENTATION__POLE_HEIGHT);
		createEAttribute(featureOfInterestNodePresentationEClass, FEATURE_OF_INTEREST_NODE_PRESENTATION__FLAG_VISIBLE);

		environmentUIUtilitiesEClass = createEClass(ENVIRONMENT_UI_UTILITIES);
		createEOperation(environmentUIUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___TO_POINT3F__STAR);
		createEOperation(environmentUIUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_POINT_SIZE_FOR_MAGNITUDE__FLOAT_FLOAT_FLOAT_FLOAT_FLOAT);
		createEOperation(environmentUIUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_SUN_LIGHT_COLOR__DOUBLE);
		createEOperation(environmentUIUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_SKY_TRANSPARENCY__DOUBLE);
		createEOperation(environmentUIUtilitiesEClass, ENVIRONMENT_UI_UTILITIES___GET_SKY_COLOR__DOUBLE);

		apogyCoreEnvironmentUIFacadeEClass = createEClass(APOGY_CORE_ENVIRONMENT_UI_FACADE);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_VISIBLE_RECTANGULAR_REGION_PROVIDER__MAPVIEWCONFIGURATION);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_IMAGE_MAP_LAYER_PRESENTATION_IMAGE__MAPVIEWCONFIGURATION_RECTANGULARREGION_INT);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_TRAJECTORY_LENGTH__XYSERIES);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_MAP_VIEW_CONFIGURATION_IDENTIFIER__MAPVIEWCONFIGURATION);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION__STRING);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_ACTIVE_MAP_VIEW_CONFIGURATION_LIST);
		createEOperation(apogyCoreEnvironmentUIFacadeEClass, APOGY_CORE_ENVIRONMENT_UI_FACADE___GET_FEATURE_OF_INTEREST_LISTS__INVOCATORSESSION);

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
		createEReference(abstractVariableAnnotationEClass, ABSTRACT_VARIABLE_ANNOTATION__APOGY_SYSTEM_API_ADAPTER);
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
		ApogyCommonTopologyUIPackage theApogyCommonTopologyUIPackage = (ApogyCommonTopologyUIPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonTopologyUIPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCoreEnvironmentPackage theApogyCoreEnvironmentPackage = (ApogyCoreEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreEnvironmentPackage.eNS_URI);
		ApogyCommonImagesPackage theApogyCommonImagesPackage = (ApogyCommonImagesPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonImagesPackage.eNS_URI);
		ApogyCorePackage theApogyCorePackage = (ApogyCorePackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCorePackage.eNS_URI);
		ApogyCoreInvocatorPackage theApogyCoreInvocatorPackage = (ApogyCoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCoreInvocatorPackage.eNS_URI);
		ApogyCommonEMFPackage theApogyCommonEMFPackage = (ApogyCommonEMFPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonEMFPackage.eNS_URI);
		ApogyCommonMathPackage theApogyCommonMathPackage = (ApogyCommonMathPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonMathPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		starFieldPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		sunPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		earthSurfaceWorksitePresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		earthSkyPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		moonPresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		featureOfInterestNodePresentationEClass.getESuperTypes().add(theApogyCommonTopologyUIPackage.getNodePresentation());
		mapViewConfigurationListEClass.getESuperTypes().add(theApogyCoreInvocatorPackage.getAbstractToolsListContainer());
		mapViewConfigurationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getNamed());
		mapViewConfigurationEClass.getESuperTypes().add(theApogyCommonEMFPackage.getDescribed());
		mapAnnotationEClass.getESuperTypes().add(this.getMapViewItemPresentation());
		mapToolEClass.getESuperTypes().add(this.getMapAnnotation());
		mapRulerEClass.getESuperTypes().add(this.getMapTool());
		featuresOfInterestMapLayerPresentationEClass.getESuperTypes().add(this.getMapAnnotation());
		featuresOfInterestMapLayerPresentationEClass.getESuperTypes().add(theApogyCoreEnvironmentPackage.getRectangularRegionProvider());
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
		initEAttribute(getEarthSkyPresentation_HorizonVisible(), theEcorePackage.getEBoolean(), "horizonVisible", "true", 0, 1, EarthSkyPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moonPresentationEClass, MoonPresentation.class, "MoonPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureOfInterestNodePresentationEClass, FeatureOfInterestNodePresentation.class, "FeatureOfInterestNodePresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeatureOfInterestNodePresentation_PoleHeight(), theEcorePackage.getEDouble(), "poleHeight", null, 0, 1, FeatureOfInterestNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeatureOfInterestNodePresentation_FlagVisible(), theEcorePackage.getEBoolean(), "flagVisible", "false", 0, 1, FeatureOfInterestNodePresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentUIUtilitiesEClass, EnvironmentUIUtilities.class, "EnvironmentUIUtilities", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getEnvironmentUIUtilities__ToPoint3f__Star(), this.getPoint3f(), "toPoint3f", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentPackage.getStar(), "star", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUIUtilities__GetPointSizeForMagnitude__float_float_float_float_float(), theEcorePackage.getEFloat(), "getPointSizeForMagnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitude", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitudeRangeMinimum", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "magnitudeRangeMaximum", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "minimumPointSize", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEFloat(), "maximumPointSize", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUIUtilities__GetSunLightColor__double(), this.getColor3f(), "getSunLightColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUIUtilities__GetSkyTransparency__double(), theEcorePackage.getEDouble(), "getSkyTransparency", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEnvironmentUIUtilities__GetSkyColor__double(), this.getColor3f(), "getSkyColor", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEDouble(), "sunAltitude", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(apogyCoreEnvironmentUIFacadeEClass, ApogyCoreEnvironmentUIFacade.class, "ApogyCoreEnvironmentUIFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getApogyCoreEnvironmentUIFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration(), null, "getVisibleRectangularRegionProvider", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMapViewConfiguration(), "mapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(theApogyCoreEnvironmentPackage.getRectangularRegionProvider());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCoreEnvironmentUIFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int(), theApogyCommonImagesPackage.getAbstractEImage(), "getImageMapLayerPresentationImage", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMapViewConfiguration(), "mapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreEnvironmentPackage.getRectangularRegion(), "mapViewExtent", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "maximumImageSizePixels", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentUIFacade__GetTrajectoryLength__XYSeries(), theEcorePackage.getEDouble(), "getTrajectoryLength", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXYSeries(), "xySeries", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentUIFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration(), theEcorePackage.getEString(), "getMapViewConfigurationIdentifier", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMapViewConfiguration(), "mapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentUIFacade__GetActiveMapViewConfiguration__String(), this.getMapViewConfiguration(), "getActiveMapViewConfiguration", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "identifier", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getApogyCoreEnvironmentUIFacade__GetActiveMapViewConfigurationList(), this.getMapViewConfigurationList(), "getActiveMapViewConfigurationList", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCoreEnvironmentUIFacade__GetFeatureOfInterestLists__InvocatorSession(), null, "getFeatureOfInterestLists", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCoreInvocatorPackage.getInvocatorSession(), "session", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(theApogyCorePackage.getFeatureOfInterestList());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(mapViewConfigurationListEClass, MapViewConfigurationList.class, "MapViewConfigurationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapViewConfigurationList_MapViewConfigurations(), this.getMapViewConfiguration(), null, "mapViewConfigurations", null, 0, -1, MapViewConfigurationList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapViewConfigurationEClass, MapViewConfiguration.class, "MapViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapViewConfiguration_MapLayers(), theApogyCoreEnvironmentPackage.getImageMapLayerPresentation(), null, "mapLayers", null, 0, -1, MapViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapViewConfiguration_BackgroundColor(), this.getColor3f(), "backgroundColor", "1.0,1.0,1.0", 0, 1, MapViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_MapAnnotations(), this.getMapAnnotation(), null, "mapAnnotations", null, 0, -1, MapViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_DefaultRectangularRegion(), theApogyCoreEnvironmentPackage.getRectangularRegion(), null, "defaultRectangularRegion", null, 1, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_MapImage(), theApogyCommonImagesPackage.getAbstractEImage(), null, "mapImage", null, 0, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_MapImageRectangularRegion(), theApogyCoreEnvironmentPackage.getRectangularRegion(), null, "mapImageRectangularRegion", null, 1, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMapViewConfiguration_Extent(), theApogyCoreEnvironmentPackage.getRectangularRegion(), null, "extent", null, 1, 1, MapViewConfiguration.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

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
		initEReference(getFeaturesOfInterestMapLayerPresentation_FeaturesOfInterestMapLayer(), theApogyCoreEnvironmentPackage.getFeaturesOfInterestMapLayer(), null, "featuresOfInterestMapLayer", null, 0, 1, FeaturesOfInterestMapLayerPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEReference(getVariableTrajectoryProvider_PoseProvider(), theApogyCorePackage.getPoseProvider(), null, "poseProvider", null, 1, 1, VariableTrajectoryProvider.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultVariableTrajectoryProviderEClass, DefaultVariableTrajectoryProvider.class, "DefaultVariableTrajectoryProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultVariableTrajectoryProvider_DistanceThreshold(), theEcorePackage.getEDouble(), "distanceThreshold", "0.5", 0, 1, DefaultVariableTrajectoryProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultVariableTrajectoryProvider_AzimuthThreshold(), theEcorePackage.getEDouble(), "azimuthThreshold", "0.017", 0, 1, DefaultVariableTrajectoryProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractVariableAnnotationEClass, AbstractVariableAnnotation.class, "AbstractVariableAnnotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractVariableAnnotation_Variable(), theApogyCoreInvocatorPackage.getVariable(), null, "variable", null, 1, 1, AbstractVariableAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVariableAnnotation_VariableInstance(), theEcorePackage.getEObject(), null, "variableInstance", null, 0, 1, AbstractVariableAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractVariableAnnotation_ApogySystemApiAdapter(), theApogyCorePackage.getApogySystemApiAdapter(), null, "apogySystemApiAdapter", null, 0, 1, AbstractVariableAnnotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAbstractVariableAnnotation__UpdatePose__Matrix4x4(), null, "updatePose", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theApogyCommonMathPackage.getMatrix4x4(), "newPose", 0, 1, !IS_UNIQUE, IS_ORDERED);

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
			 "documentation", "Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca),\n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "prefix", "ApogyCoreEnvironmentUI",
			 "childCreationExtenders", "true",
			 "extensibleProviderFactory", "true",
			 "multipleEditorPages", "false",
			 "copyrightText", "Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation",
			 "modelName", "ApogyCoreEnvironmentUI",
			 "complianceLevel", "6.0",
			 "suppressGenModelAnnotations", "false",
			 "dynamicTemplates", "true",
			 "templateDirectory", "platform:/plugin/ca.gc.asc_csa.apogy.common.emf.templates",
			 "modelDirectory", "/ca.gc.asc_csa.apogy.core.environment.ui/src-generated",
			 "editDirectory", "/ca.gc.asc_csa.apogy.core.environment.ui.edit/src-generated",
			 "basePackage", "ca.gc.asc_csa.apogy.core.environment"
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
			 "apogy_units", "m"
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
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getEarthSurfaceWorksitePresentation_PlaneSize(), 
		   source, 
		   new String[] {
			 "propertyCategory", "PLANE",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getEarthSkyPresentation_HorizonVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "Horizon"
		   });	
		addAnnotation
		  (getFeatureOfInterestNodePresentation_PoleHeight(), 
		   source, 
		   new String[] {
			 "propertyCategory", "FLAG",
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getFeatureOfInterestNodePresentation_FlagVisible(), 
		   source, 
		   new String[] {
			 "propertyCategory", "FLAG"
		   });	
		addAnnotation
		  (getEnvironmentUIUtilities__GetSunLightColor__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the sun color for a given altitude above the horizon.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEnvironmentUIUtilities__GetSunLightColor__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUIUtilities__GetSkyTransparency__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the transparency value (between no transparency 0 and full transparency 1.0)\nto be used for the blus sky as a function of the sun altitude angle.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEnvironmentUIUtilities__GetSkyTransparency__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getEnvironmentUIUtilities__GetSkyColor__double(), 
		   source, 
		   new String[] {
			 "documentation", "Return the sky color for a given altitude above the horizon.\n@param sunAltitude The altitude above the horizon, in radians."
		   });	
		addAnnotation
		  ((getEnvironmentUIUtilities__GetSkyColor__double()).getEParameters().get(0), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentUIFacade__GetVisibleRectangularRegionProvider__MapViewConfiguration(), 
		   source, 
		   new String[] {
			 "documentation", "Returns an image representing the assembly of the specified list of ImageMapLayerPresentation.\n@param imageMapLayerPresentations The specified list of ImageMapLayerPresentation.\n@return The image representing the specified list of ImageMapLayerPresentation."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentUIFacade__GetImageMapLayerPresentationImage__MapViewConfiguration_RectangularRegion_int(), 
		   source, 
		   new String[] {
			 "documentation", "Returns an image representing the specified MapViewExtent using a specified MapViewConfiguration.\nIf the MapViewExtent is larger than the area covered by the MapViewConfiguration, transparent pixels will be added.\n@param mapViewConfiguration The specified MapViewConfiguration.\n@param mapViewExtent The specified ground area to be covered.\n@param maximumImageSizePixels The maximum size, in pixel, of the generated image.\n@return The image representing the specified MapViewExtent."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentUIFacade__GetTrajectoryLength__XYSeries(), 
		   source, 
		   new String[] {
			 "documentation", "Computes the length of a 2D trajectory.\n@param The XYSeries.\n@return The length of the trajectory represented in the XYSerie."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentUIFacade__GetMapViewConfigurationIdentifier__MapViewConfiguration(), 
		   source, 
		   new String[] {
			 "documentation", "Return the identifier associated with a given MapViewConfiguration.\n@param mapViewConfiguration The given MapViewConfiguration.\n@return The identifier, null if none is found."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentUIFacade__GetActiveMapViewConfiguration__String(), 
		   source, 
		   new String[] {
			 "documentation", "Return the MapViewConfiguration (in the Active Session) with the specified identifier.\n@param identifier The MapViewConfiguration identifier.\n@return The MapViewConfiguration with the specified identifier, null if non is found."
		   });	
		addAnnotation
		  (getApogyCoreEnvironmentUIFacade__GetActiveMapViewConfigurationList(), 
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
			 "documentation", "List of Apogy System instances being tracked.",
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
			 "apogy_units", "m"
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
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getTrajectoryProvider_TrajectoryLength(), 
		   source, 
		   new String[] {
			 "documentation", "The current length of the trajectory.",
			 "apogy_units", "m"
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
			 "documentation", " The Apogy System being displayed. This is automatically updated."
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
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getDefaultVariableTrajectoryProvider_AzimuthThreshold(), 
		   source, 
		   new String[] {
			 "documentation", " Minimum azimuth change that will trigger an azimuthAngle change.",
			 "propertyCategory", "THRESHOLDS",
			 "apogy_units", "rad"
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
			 "documentation", "The Apogy System being displayed."
		   });	
		addAnnotation
		  (getAbstractVariableAnnotation_VariableInstance(), 
		   source, 
		   new String[] {
			 "documentation", "The instance of the object adapted by the Apogy System."
		   });	
		addAnnotation
		  (getAbstractVariableAnnotation_ApogySystemApiAdapter(), 
		   source, 
		   new String[] {
			 "documentation", "The current instance of  ApogySystemApiAdapter handling the variable."
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
			 "apogy_units", "m"
		   });	
		addAnnotation
		  ((getPoseVariableAnnotation__UpdatePose__double_double_double()).getEParameters().get(1), 
		   source, 
		   new String[] {
			 "apogy_units", "m"
		   });	
		addAnnotation
		  ((getPoseVariableAnnotation__UpdatePose__double_double_double()).getEParameters().get(2), 
		   source, 
		   new String[] {
			 "apogy_units", "rad"
		   });	
		addAnnotation
		  (getPoseVariableAnnotation_Vectorlength(), 
		   source, 
		   new String[] {
			 "documentation", "The length of the vector.",
			 "propertyCategory", "VECTOR_PROPERTIES",
			 "apogy_units", "m"
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
			 "apogy_units", "m"
		   });	
		addAnnotation
		  (getVehicleVariableAnnotation_VehicleWidth(), 
		   source, 
		   new String[] {
			 "documentation", "The width of the vehicle.",
			 "propertyCategory", "VEHICLE_DIMENSIONS",
			 "apogy_units", "m"
		   });
	}

} //ApogyCoreEnvironmentUIPackageImpl
