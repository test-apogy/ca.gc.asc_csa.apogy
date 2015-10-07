/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.core.invocator.AbstractToolsListContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.symphony.environment.RectangularRegionProvider;
import ca.gc.asc_csa.symphony.environment.ui.AbstractTrajectoryTool;
import ca.gc.asc_csa.symphony.environment.ui.AbstractVariableAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.DefaultVariableTrajectoryProvider;
import ca.gc.asc_csa.symphony.environment.ui.EarthSkyPresentation;
import ca.gc.asc_csa.symphony.environment.ui.EarthSurfaceWorksitePresentation;
import ca.gc.asc_csa.symphony.environment.ui.EnvironmentUiFacade;
import ca.gc.asc_csa.symphony.environment.ui.EnvironmentUiUtilities;
import ca.gc.asc_csa.symphony.environment.ui.FeatureOfInterestNodePresentation;
import ca.gc.asc_csa.symphony.environment.ui.FeaturesOfInterestMapLayerPresentation;
import ca.gc.asc_csa.symphony.environment.ui.MapAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.MapRuler;
import ca.gc.asc_csa.symphony.environment.ui.MapTool;
import ca.gc.asc_csa.symphony.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.symphony.environment.ui.MapViewConfigurationList;
import ca.gc.asc_csa.symphony.environment.ui.MapViewItemPresentation;
import ca.gc.asc_csa.symphony.environment.ui.MoonPresentation;
import ca.gc.asc_csa.symphony.environment.ui.PoseVariableAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.StarFieldPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SunPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import ca.gc.asc_csa.symphony.environment.ui.TrajectoryPickingTool;
import ca.gc.asc_csa.symphony.environment.ui.TrajectoryProvider;
import ca.gc.asc_csa.symphony.environment.ui.VariableTrajectoryAnnotation;
import ca.gc.asc_csa.symphony.environment.ui.VariableTrajectoryProvider;
import ca.gc.asc_csa.symphony.environment.ui.VehicleVariableAnnotation;
import ca.gc.space.topology.ui.NodePresentation;

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
 * @see ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage
 * @generated
 */
public class SymphonyEnvironmentUISwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SymphonyEnvironmentUIPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SymphonyEnvironmentUISwitch()
  {
		if (modelPackage == null) {
			modelPackage = SymphonyEnvironmentUIPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case SymphonyEnvironmentUIPackage.STAR_FIELD_PRESENTATION: {
				StarFieldPresentation starFieldPresentation = (StarFieldPresentation)theEObject;
				T result = caseStarFieldPresentation(starFieldPresentation);
				if (result == null) result = caseNodePresentation(starFieldPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.SUN_PRESENTATION: {
				SunPresentation sunPresentation = (SunPresentation)theEObject;
				T result = caseSunPresentation(sunPresentation);
				if (result == null) result = caseNodePresentation(sunPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.EARTH_SURFACE_WORKSITE_PRESENTATION: {
				EarthSurfaceWorksitePresentation earthSurfaceWorksitePresentation = (EarthSurfaceWorksitePresentation)theEObject;
				T result = caseEarthSurfaceWorksitePresentation(earthSurfaceWorksitePresentation);
				if (result == null) result = caseNodePresentation(earthSurfaceWorksitePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.EARTH_SKY_PRESENTATION: {
				EarthSkyPresentation earthSkyPresentation = (EarthSkyPresentation)theEObject;
				T result = caseEarthSkyPresentation(earthSkyPresentation);
				if (result == null) result = caseNodePresentation(earthSkyPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MOON_PRESENTATION: {
				MoonPresentation moonPresentation = (MoonPresentation)theEObject;
				T result = caseMoonPresentation(moonPresentation);
				if (result == null) result = caseNodePresentation(moonPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.FEATURE_OF_INTEREST_NODE_PRESENTATION: {
				FeatureOfInterestNodePresentation featureOfInterestNodePresentation = (FeatureOfInterestNodePresentation)theEObject;
				T result = caseFeatureOfInterestNodePresentation(featureOfInterestNodePresentation);
				if (result == null) result = caseNodePresentation(featureOfInterestNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.ENVIRONMENT_UI_UTILITIES: {
				EnvironmentUiUtilities environmentUiUtilities = (EnvironmentUiUtilities)theEObject;
				T result = caseEnvironmentUiUtilities(environmentUiUtilities);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.ENVIRONMENT_UI_FACADE: {
				EnvironmentUiFacade environmentUiFacade = (EnvironmentUiFacade)theEObject;
				T result = caseEnvironmentUiFacade(environmentUiFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST: {
				MapViewConfigurationList mapViewConfigurationList = (MapViewConfigurationList)theEObject;
				T result = caseMapViewConfigurationList(mapViewConfigurationList);
				if (result == null) result = caseAbstractToolsListContainer(mapViewConfigurationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MAP_VIEW_CONFIGURATION: {
				MapViewConfiguration mapViewConfiguration = (MapViewConfiguration)theEObject;
				T result = caseMapViewConfiguration(mapViewConfiguration);
				if (result == null) result = caseNamed(mapViewConfiguration);
				if (result == null) result = caseDescribed(mapViewConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MAP_VIEW_ITEM_PRESENTATION: {
				MapViewItemPresentation mapViewItemPresentation = (MapViewItemPresentation)theEObject;
				T result = caseMapViewItemPresentation(mapViewItemPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MAP_ANNOTATION: {
				MapAnnotation mapAnnotation = (MapAnnotation)theEObject;
				T result = caseMapAnnotation(mapAnnotation);
				if (result == null) result = caseMapViewItemPresentation(mapAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MAP_TOOL: {
				MapTool mapTool = (MapTool)theEObject;
				T result = caseMapTool(mapTool);
				if (result == null) result = caseMapAnnotation(mapTool);
				if (result == null) result = caseMapViewItemPresentation(mapTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.MAP_RULER: {
				MapRuler mapRuler = (MapRuler)theEObject;
				T result = caseMapRuler(mapRuler);
				if (result == null) result = caseMapTool(mapRuler);
				if (result == null) result = caseMapAnnotation(mapRuler);
				if (result == null) result = caseMapViewItemPresentation(mapRuler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION: {
				FeaturesOfInterestMapLayerPresentation featuresOfInterestMapLayerPresentation = (FeaturesOfInterestMapLayerPresentation)theEObject;
				T result = caseFeaturesOfInterestMapLayerPresentation(featuresOfInterestMapLayerPresentation);
				if (result == null) result = caseMapAnnotation(featuresOfInterestMapLayerPresentation);
				if (result == null) result = caseRectangularRegionProvider(featuresOfInterestMapLayerPresentation);
				if (result == null) result = caseMapViewItemPresentation(featuresOfInterestMapLayerPresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.TRAJECTORY_PROVIDER: {
				TrajectoryProvider trajectoryProvider = (TrajectoryProvider)theEObject;
				T result = caseTrajectoryProvider(trajectoryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.ABSTRACT_TRAJECTORY_TOOL: {
				AbstractTrajectoryTool abstractTrajectoryTool = (AbstractTrajectoryTool)theEObject;
				T result = caseAbstractTrajectoryTool(abstractTrajectoryTool);
				if (result == null) result = caseTrajectoryProvider(abstractTrajectoryTool);
				if (result == null) result = caseMapTool(abstractTrajectoryTool);
				if (result == null) result = caseMapAnnotation(abstractTrajectoryTool);
				if (result == null) result = caseMapViewItemPresentation(abstractTrajectoryTool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.TRAJECTORY_PICKING_TOOL: {
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
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_PROVIDER: {
				VariableTrajectoryProvider variableTrajectoryProvider = (VariableTrajectoryProvider)theEObject;
				T result = caseVariableTrajectoryProvider(variableTrajectoryProvider);
				if (result == null) result = caseTrajectoryProvider(variableTrajectoryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.DEFAULT_VARIABLE_TRAJECTORY_PROVIDER: {
				DefaultVariableTrajectoryProvider defaultVariableTrajectoryProvider = (DefaultVariableTrajectoryProvider)theEObject;
				T result = caseDefaultVariableTrajectoryProvider(defaultVariableTrajectoryProvider);
				if (result == null) result = caseVariableTrajectoryProvider(defaultVariableTrajectoryProvider);
				if (result == null) result = caseTrajectoryProvider(defaultVariableTrajectoryProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.ABSTRACT_VARIABLE_ANNOTATION: {
				AbstractVariableAnnotation abstractVariableAnnotation = (AbstractVariableAnnotation)theEObject;
				T result = caseAbstractVariableAnnotation(abstractVariableAnnotation);
				if (result == null) result = caseMapAnnotation(abstractVariableAnnotation);
				if (result == null) result = caseMapViewItemPresentation(abstractVariableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.POSE_VARIABLE_ANNOTATION: {
				PoseVariableAnnotation poseVariableAnnotation = (PoseVariableAnnotation)theEObject;
				T result = casePoseVariableAnnotation(poseVariableAnnotation);
				if (result == null) result = caseAbstractVariableAnnotation(poseVariableAnnotation);
				if (result == null) result = caseMapAnnotation(poseVariableAnnotation);
				if (result == null) result = caseMapViewItemPresentation(poseVariableAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.VARIABLE_TRAJECTORY_ANNOTATION: {
				VariableTrajectoryAnnotation variableTrajectoryAnnotation = (VariableTrajectoryAnnotation)theEObject;
				T result = caseVariableTrajectoryAnnotation(variableTrajectoryAnnotation);
				if (result == null) result = caseAbstractVariableAnnotation(variableTrajectoryAnnotation);
				if (result == null) result = caseTrajectoryProvider(variableTrajectoryAnnotation);
				if (result == null) result = caseMapAnnotation(variableTrajectoryAnnotation);
				if (result == null) result = caseMapViewItemPresentation(variableTrajectoryAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SymphonyEnvironmentUIPackage.VEHICLE_VARIABLE_ANNOTATION: {
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
	 * Returns the result of interpreting the object as an instance of '<em>Star Field Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Star Field Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStarFieldPresentation(StarFieldPresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Sun Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sun Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSunPresentation(SunPresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Surface Worksite Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEarthSurfaceWorksitePresentation(EarthSurfaceWorksitePresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Earth Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Earth Sky Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEarthSkyPresentation(EarthSkyPresentation object)
  {
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
  public T caseMoonPresentation(MoonPresentation object)
  {
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
	 * Returns the result of interpreting the object as an instance of '<em>Environment Ui Utilities</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Ui Utilities</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEnvironmentUiUtilities(EnvironmentUiUtilities object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Ui Facade</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Ui Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEnvironmentUiFacade(EnvironmentUiFacade object)
  {
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
  public T caseMapViewConfigurationList(MapViewConfigurationList object)
  {
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
  public T caseMapViewConfiguration(MapViewConfiguration object)
  {
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
  public T caseMapViewItemPresentation(MapViewItemPresentation object)
  {
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
  public T caseMapAnnotation(MapAnnotation object)
  {
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
  public T caseMapTool(MapTool object)
  {
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
  public T caseMapRuler(MapRuler object)
  {
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
  public T caseVariableTrajectoryProvider(VariableTrajectoryProvider object)
  {
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
  public T caseDefaultVariableTrajectoryProvider(DefaultVariableTrajectoryProvider object)
  {
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
  public T caseAbstractVariableAnnotation(AbstractVariableAnnotation object)
  {
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
  public T casePoseVariableAnnotation(PoseVariableAnnotation object)
  {
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
  public T caseVariableTrajectoryAnnotation(VariableTrajectoryAnnotation object)
  {
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
  public T caseVehicleVariableAnnotation(VehicleVariableAnnotation object)
  {
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
  public T caseTrajectoryProvider(TrajectoryProvider object)
  {
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
  public T caseAbstractTrajectoryTool(AbstractTrajectoryTool object)
  {
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
  public T caseTrajectoryPickingTool(TrajectoryPickingTool object)
  {
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
  public T caseNodePresentation(NodePresentation object)
  {
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
  public T caseAbstractToolsListContainer(AbstractToolsListContainer object)
  {
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
  public T caseNamed(Named object)
  {
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
  public T caseDescribed(Described object)
  {
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
  public T defaultCase(EObject object)
  {
		return null;
	}

} //SymphonyEnvironmentUISwitch
