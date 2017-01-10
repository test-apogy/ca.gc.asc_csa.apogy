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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.RectangularRegionProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksiteSkyPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractTrajectoryTool;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractVariableAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFacade;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.DefaultVariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.EnvironmentSurfaceUIUtilities;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.FeatureOfInterestNodePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.FeaturesOfInterestMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapRuler;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapTool;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewItemPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MoonPresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.PoseVariableAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryPickingTool;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryAnnotation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.VariableTrajectoryProvider;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.VehicleVariableAnnotation;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage
 * @generated
 */
public class ApogySurfaceEnvironmentUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogySurfaceEnvironmentUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogySurfaceEnvironmentUISwitch() {
		if (modelPackage == null) {
			modelPackage = ApogySurfaceEnvironmentUIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION: {
				AbstractSurfaceWorksitePresentation abstractSurfaceWorksitePresentation = (AbstractSurfaceWorksitePresentation)theEObject;
				T result = caseAbstractSurfaceWorksitePresentation(abstractSurfaceWorksitePresentation);
				if (result == null) result = caseNodePresentation(abstractSurfaceWorksitePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_SKY_PRESENTATION: {
				AbstractSurfaceWorksiteSkyPresentation abstractSurfaceWorksiteSkyPresentation = (AbstractSurfaceWorksiteSkyPresentation)theEObject;
				T result = caseAbstractSurfaceWorksiteSkyPresentation(abstractSurfaceWorksiteSkyPresentation);
				if (result == null) result = caseNodePresentation(abstractSurfaceWorksiteSkyPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MOON_PRESENTATION: {
				MoonPresentation moonPresentation = (MoonPresentation)theEObject;
				T result = caseMoonPresentation(moonPresentation);
				if (result == null) result = caseNodePresentation(moonPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION: {
				FeatureOfInterestNodePresentation featureOfInterestNodePresentation = (FeatureOfInterestNodePresentation)theEObject;
				T result = caseFeatureOfInterestNodePresentation(featureOfInterestNodePresentation);
				if (result == null) result = caseNodePresentation(featureOfInterestNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.APOGY_SURFACE_ENVIRONMENT_UI_FACADE: {
				ApogySurfaceEnvironmentUIFacade apogySurfaceEnvironmentUIFacade = (ApogySurfaceEnvironmentUIFacade)theEObject;
				T result = caseApogySurfaceEnvironmentUIFacade(apogySurfaceEnvironmentUIFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.ENVIRONMENT_SURFACE_UI_UTILITIES: {
				EnvironmentSurfaceUIUtilities environmentSurfaceUIUtilities = (EnvironmentSurfaceUIUtilities)theEObject;
				T result = caseEnvironmentSurfaceUIUtilities(environmentSurfaceUIUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST: {
				MapViewConfigurationList mapViewConfigurationList = (MapViewConfigurationList)theEObject;
				T result = caseMapViewConfigurationList(mapViewConfigurationList);
				if (result == null) result = caseAbstractToolsListContainer(mapViewConfigurationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION: {
				MapViewConfiguration mapViewConfiguration = (MapViewConfiguration)theEObject;
				T result = caseMapViewConfiguration(mapViewConfiguration);
				if (result == null) result = caseNamed(mapViewConfiguration);
				if (result == null) result = caseDescribed(mapViewConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_ITEM_PRESENTATION: {
				MapViewItemPresentation mapViewItemPresentation = (MapViewItemPresentation)theEObject;
				T result = caseMapViewItemPresentation(mapViewItemPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MAP_ANNOTATION: {
				MapAnnotation mapAnnotation = (MapAnnotation)theEObject;
				T result = caseMapAnnotation(mapAnnotation);
				if (result == null) result = caseMapViewItemPresentation(mapAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MAP_TOOL: {
				MapTool mapTool = (MapTool)theEObject;
				T result = caseMapTool(mapTool);
				if (result == null) result = caseMapAnnotation(mapTool);
				if (result == null) result = caseMapViewItemPresentation(mapTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.MAP_RULER: {
				MapRuler mapRuler = (MapRuler)theEObject;
				T result = caseMapRuler(mapRuler);
				if (result == null) result = caseMapTool(mapRuler);
				if (result == null) result = caseMapAnnotation(mapRuler);
				if (result == null) result = caseMapViewItemPresentation(mapRuler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION: {
				FeaturesOfInterestMapLayerPresentation featuresOfInterestMapLayerPresentation = (FeaturesOfInterestMapLayerPresentation)theEObject;
				T result = caseFeaturesOfInterestMapLayerPresentation(featuresOfInterestMapLayerPresentation);
				if (result == null) result = caseMapAnnotation(featuresOfInterestMapLayerPresentation);
				if (result == null) result = caseRectangularRegionProvider(featuresOfInterestMapLayerPresentation);
				if (result == null) result = caseMapViewItemPresentation(featuresOfInterestMapLayerPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER: {
				TrajectoryProvider trajectoryProvider = (TrajectoryProvider)theEObject;
				T result = caseTrajectoryProvider(trajectoryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL: {
				AbstractTrajectoryTool abstractTrajectoryTool = (AbstractTrajectoryTool)theEObject;
				T result = caseAbstractTrajectoryTool(abstractTrajectoryTool);
				if (result == null) result = caseTrajectoryProvider(abstractTrajectoryTool);
				if (result == null) result = caseMapTool(abstractTrajectoryTool);
				if (result == null) result = caseMapAnnotation(abstractTrajectoryTool);
				if (result == null) result = caseMapViewItemPresentation(abstractTrajectoryTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PICKING_TOOL: {
				TrajectoryPickingTool trajectoryPickingTool = (TrajectoryPickingTool)theEObject;
				T result = caseTrajectoryPickingTool(trajectoryPickingTool);
				if (result == null) result = caseAbstractTrajectoryTool(trajectoryPickingTool);
				if (result == null) result = caseTrajectoryProvider(trajectoryPickingTool);
				if (result == null) result = caseMapTool(trajectoryPickingTool);
				if (result == null) result = caseMapAnnotation(trajectoryPickingTool);
				if (result == null) result = caseMapViewItemPresentation(trajectoryPickingTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER: {
				VariableTrajectoryProvider variableTrajectoryProvider = (VariableTrajectoryProvider)theEObject;
				T result = caseVariableTrajectoryProvider(variableTrajectoryProvider);
				if (result == null) result = caseTrajectoryProvider(variableTrajectoryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER: {
				DefaultVariableTrajectoryProvider defaultVariableTrajectoryProvider = (DefaultVariableTrajectoryProvider)theEObject;
				T result = caseDefaultVariableTrajectoryProvider(defaultVariableTrajectoryProvider);
				if (result == null) result = caseVariableTrajectoryProvider(defaultVariableTrajectoryProvider);
				if (result == null) result = caseTrajectoryProvider(defaultVariableTrajectoryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION: {
				AbstractVariableAnnotation abstractVariableAnnotation = (AbstractVariableAnnotation)theEObject;
				T result = caseAbstractVariableAnnotation(abstractVariableAnnotation);
				if (result == null) result = caseMapAnnotation(abstractVariableAnnotation);
				if (result == null) result = caseMapViewItemPresentation(abstractVariableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION: {
				PoseVariableAnnotation poseVariableAnnotation = (PoseVariableAnnotation)theEObject;
				T result = casePoseVariableAnnotation(poseVariableAnnotation);
				if (result == null) result = caseAbstractVariableAnnotation(poseVariableAnnotation);
				if (result == null) result = caseMapAnnotation(poseVariableAnnotation);
				if (result == null) result = caseMapViewItemPresentation(poseVariableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION: {
				VariableTrajectoryAnnotation variableTrajectoryAnnotation = (VariableTrajectoryAnnotation)theEObject;
				T result = caseVariableTrajectoryAnnotation(variableTrajectoryAnnotation);
				if (result == null) result = caseAbstractVariableAnnotation(variableTrajectoryAnnotation);
				if (result == null) result = caseTrajectoryProvider(variableTrajectoryAnnotation);
				if (result == null) result = caseMapAnnotation(variableTrajectoryAnnotation);
				if (result == null) result = caseMapViewItemPresentation(variableTrajectoryAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogySurfaceEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION: {
				VehicleVariableAnnotation vehicleVariableAnnotation = (VehicleVariableAnnotation)theEObject;
				T result = caseVehicleVariableAnnotation(vehicleVariableAnnotation);
				if (result == null) result = casePoseVariableAnnotation(vehicleVariableAnnotation);
				if (result == null) result = caseAbstractVariableAnnotation(vehicleVariableAnnotation);
				if (result == null) result = caseMapAnnotation(vehicleVariableAnnotation);
				if (result == null) result = caseMapViewItemPresentation(vehicleVariableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceWorksitePresentation(AbstractSurfaceWorksitePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceWorksiteSkyPresentation(AbstractSurfaceWorksiteSkyPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moon Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moon Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoonPresentation(MoonPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Of Interest Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Of Interest Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureOfInterestNodePresentation(FeatureOfInterestNodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogySurfaceEnvironmentUIFacade(ApogySurfaceEnvironmentUIFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Surface UI Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Surface UI Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentSurfaceUIUtilities(EnvironmentSurfaceUIUtilities object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map View Configuration List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map View Configuration List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapViewConfigurationList(MapViewConfigurationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map View Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map View Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapViewConfiguration(MapViewConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map View Item Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map View Item Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapViewItemPresentation(MapViewItemPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapAnnotation(MapAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapTool(MapTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Ruler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Ruler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapRuler(MapRuler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Features Of Interest Map Layer Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Features Of Interest Map Layer Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturesOfInterestMapLayerPresentation(FeaturesOfInterestMapLayerPresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryProvider(TrajectoryProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Trajectory Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Trajectory Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTrajectoryTool(AbstractTrajectoryTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trajectory Picking Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trajectory Picking Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrajectoryPickingTool(TrajectoryPickingTool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Trajectory Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Trajectory Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableTrajectoryProvider(VariableTrajectoryProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Variable Trajectory Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Variable Trajectory Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultVariableTrajectoryProvider(DefaultVariableTrajectoryProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Variable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Variable Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractVariableAnnotation(AbstractVariableAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pose Variable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pose Variable Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoseVariableAnnotation(PoseVariableAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Trajectory Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Trajectory Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableTrajectoryAnnotation(VariableTrajectoryAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Variable Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Variable Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleVariableAnnotation(VehicleVariableAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePresentation(NodePresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Tools List Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractToolsListContainer(AbstractToolsListContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangular Region Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangular Region Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangularRegionProvider(RectangularRegionProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogySurfaceEnvironmentUISwitch
