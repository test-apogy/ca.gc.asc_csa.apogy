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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;
import javax.vecmath.Point3f;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.AbstractXYAnnotation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.experimental.chart.swt.ChartComposite;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapRuler;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogySurfaceEnvironmentUIFactoryImpl extends EFactoryImpl implements ApogySurfaceEnvironmentUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogySurfaceEnvironmentUIFactory init() {
		try {
			ApogySurfaceEnvironmentUIFactory theApogySurfaceEnvironmentUIFactory = (ApogySurfaceEnvironmentUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogySurfaceEnvironmentUIPackage.eNS_URI);
			if (theApogySurfaceEnvironmentUIFactory != null) {
				return theApogySurfaceEnvironmentUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogySurfaceEnvironmentUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentUIFactoryImpl() {
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION: return createAbstractSurfaceWorksitePresentation();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION: return createAbstractSurfaceWorksiteSkyPresentation();
			case ApogySurfaceEnvironmentUIPackage.MOON_PRESENTATION: return createMoonPresentation();
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION: return createFeatureOfInterestNodePresentation();
			case ApogySurfaceEnvironmentUIPackage.APOGY_SURFACE_ENVIRONMENT_UI_FACADE: return createApogySurfaceEnvironmentUIFacade();
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_SURFACE_UI_UTILITIES: return createEnvironmentSurfaceUIUtilities();
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST: return createMapViewConfigurationList();
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION: return createMapViewConfiguration();
			case ApogySurfaceEnvironmentUIPackage.MAP_RULER: return createMapRuler();
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION: return createFeaturesOfInterestMapLayerPresentation();
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PICKING_TOOL: return createTrajectoryPickingTool();
			case ApogySurfaceEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER: return createDefaultVariableTrajectoryProvider();
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION: return createPoseVariableAnnotation();
			case ApogySurfaceEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION: return createVariableTrajectoryAnnotation();
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION: return createVehicleVariableAnnotation();
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
			case ApogySurfaceEnvironmentUIPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.POINT2D:
				return createPoint2dFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.COLOR3F:
				return createColor3fFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.POINT3F:
				return createPoint3fFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.XY_SERIES:
				return createXYSeriesFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.XY_PLOT:
				return createXYPlotFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.XY_DATA_ITEM:
				return createXYDataItemFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_XY_ANNOTATION:
				return createAbstractXYAnnotationFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.CHART_COMPOSITE:
				return createChartCompositeFromString(eDataType, initialValue);
			case ApogySurfaceEnvironmentUIPackage.JFREE_CHART:
				return createJFreeChartFromString(eDataType, initialValue);
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
			case ApogySurfaceEnvironmentUIPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.POINT2D:
				return convertPoint2dToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.COLOR3F:
				return convertColor3fToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.POINT3F:
				return convertPoint3fToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.XY_SERIES:
				return convertXYSeriesToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.XY_PLOT:
				return convertXYPlotToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.XY_DATA_ITEM:
				return convertXYDataItemToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_XY_ANNOTATION:
				return convertAbstractXYAnnotationToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.CHART_COMPOSITE:
				return convertChartCompositeToString(eDataType, instanceValue);
			case ApogySurfaceEnvironmentUIPackage.JFREE_CHART:
				return convertJFreeChartToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSurfaceWorksitePresentation createAbstractSurfaceWorksitePresentation() {
		AbstractSurfaceWorksitePresentationImpl abstractSurfaceWorksitePresentation = new AbstractSurfaceWorksitePresentationImpl();
		return abstractSurfaceWorksitePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSurfaceWorksiteSkyPresentation createAbstractSurfaceWorksiteSkyPresentation() {
		AbstractSurfaceWorksiteSkyPresentationImpl abstractSurfaceWorksiteSkyPresentation = new AbstractSurfaceWorksiteSkyPresentationImpl();
		return abstractSurfaceWorksiteSkyPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoonPresentation createMoonPresentation() {
		MoonPresentationImpl moonPresentation = new MoonPresentationImpl();
		return moonPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestNodePresentation createFeatureOfInterestNodePresentation() {
		FeatureOfInterestNodePresentationImpl featureOfInterestNodePresentation = new FeatureOfInterestNodePresentationImpl();
		return featureOfInterestNodePresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentUIFacade createApogySurfaceEnvironmentUIFacade() {
		ApogySurfaceEnvironmentUIFacadeImpl apogySurfaceEnvironmentUIFacade = new ApogySurfaceEnvironmentUIFacadeImpl();
		return apogySurfaceEnvironmentUIFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentSurfaceUIUtilities createEnvironmentSurfaceUIUtilities() {
		EnvironmentSurfaceUIUtilitiesImpl environmentSurfaceUIUtilities = new EnvironmentSurfaceUIUtilitiesImpl();
		return environmentSurfaceUIUtilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewConfigurationList createMapViewConfigurationList() {
		MapViewConfigurationListImpl mapViewConfigurationList = new MapViewConfigurationListImpl();
		return mapViewConfigurationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewConfiguration createMapViewConfiguration() {
		MapViewConfigurationImpl mapViewConfiguration = new MapViewConfigurationImpl();
		return mapViewConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapRuler createMapRuler() {
		MapRulerImpl mapRuler = new MapRulerImpl();
		return mapRuler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayerPresentation createFeaturesOfInterestMapLayerPresentation() {
		FeaturesOfInterestMapLayerPresentationImpl featuresOfInterestMapLayerPresentation = new FeaturesOfInterestMapLayerPresentationImpl();
		return featuresOfInterestMapLayerPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrajectoryPickingTool createTrajectoryPickingTool() {
		TrajectoryPickingToolImpl trajectoryPickingTool = new TrajectoryPickingToolImpl();
		return trajectoryPickingTool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultVariableTrajectoryProvider createDefaultVariableTrajectoryProvider() {
		DefaultVariableTrajectoryProviderImpl defaultVariableTrajectoryProvider = new DefaultVariableTrajectoryProviderImpl();
		return defaultVariableTrajectoryProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseVariableAnnotation createPoseVariableAnnotation() {
		PoseVariableAnnotationImpl poseVariableAnnotation = new PoseVariableAnnotationImpl();
		return poseVariableAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableTrajectoryAnnotation createVariableTrajectoryAnnotation() {
		VariableTrajectoryAnnotationImpl variableTrajectoryAnnotation = new VariableTrajectoryAnnotationImpl();
		return variableTrajectoryAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleVariableAnnotation createVehicleVariableAnnotation() {
		VehicleVariableAnnotationImpl vehicleVariableAnnotation = new VehicleVariableAnnotationImpl();
		return vehicleVariableAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<?> createListFromString(EDataType eDataType, String initialValue) {
		return (List<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point2d createPoint2dFromString(EDataType eDataType, String initialValue) {
		return (Point2d)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint2dToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f createColor3fFromString(EDataType eDataType, String initialValue) {
		return (Color3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColor3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point3f createPoint3fFromString(EDataType eDataType, String initialValue) {
		return (Point3f)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoint3fToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYSeries createXYSeriesFromString(EDataType eDataType, String initialValue) {
		return (XYSeries)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXYSeriesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYPlot createXYPlotFromString(EDataType eDataType, String initialValue) {
		return (XYPlot)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXYPlotToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYDataItem createXYDataItemFromString(EDataType eDataType, String initialValue) {
		return (XYDataItem)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXYDataItemToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractXYAnnotation createAbstractXYAnnotationFromString(EDataType eDataType, String initialValue) {
		return (AbstractXYAnnotation)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbstractXYAnnotationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChartComposite createChartCompositeFromString(EDataType eDataType, String initialValue) {
		return (ChartComposite)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChartCompositeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JFreeChart createJFreeChartFromString(EDataType eDataType, String initialValue) {
		return (JFreeChart)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJFreeChartToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentUIPackage getApogySurfaceEnvironmentUIPackage() {
		return (ApogySurfaceEnvironmentUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogySurfaceEnvironmentUIPackage getPackage() {
		return ApogySurfaceEnvironmentUIPackage.eINSTANCE;
	}

} //ApogySurfaceEnvironmentUIFactoryImpl
