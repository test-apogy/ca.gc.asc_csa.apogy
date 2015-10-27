/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.environment.ui.Symphony__CoreEnvironmentUIPackage
 * @generated
 */
public interface Symphony__CoreEnvironmentUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  Symphony__CoreEnvironmentUIFactory eINSTANCE = org.eclipse.symphony.core.environment.ui.impl.Symphony__CoreEnvironmentUIFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Star Field Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Star Field Presentation</em>'.
	 * @generated
	 */
  StarFieldPresentation createStarFieldPresentation();

  /**
	 * Returns a new object of class '<em>Sun Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sun Presentation</em>'.
	 * @generated
	 */
  SunPresentation createSunPresentation();

  /**
	 * Returns a new object of class '<em>Earth Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Surface Worksite Presentation</em>'.
	 * @generated
	 */
  EarthSurfaceWorksitePresentation createEarthSurfaceWorksitePresentation();

  /**
	 * Returns a new object of class '<em>Earth Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Earth Sky Presentation</em>'.
	 * @generated
	 */
  EarthSkyPresentation createEarthSkyPresentation();

  /**
	 * Returns a new object of class '<em>Moon Presentation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Moon Presentation</em>'.
	 * @generated
	 */
  MoonPresentation createMoonPresentation();

  /**
	 * Returns a new object of class '<em>Feature Of Interest Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Of Interest Node Presentation</em>'.
	 * @generated
	 */
	FeatureOfInterestNodePresentation createFeatureOfInterestNodePresentation();

		/**
	 * Returns a new object of class '<em>Environment Ui Utilities</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Ui Utilities</em>'.
	 * @generated
	 */
  EnvironmentUiUtilities createEnvironmentUiUtilities();

  /**
	 * Returns a new object of class '<em>Environment Ui Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Ui Facade</em>'.
	 * @generated
	 */
  EnvironmentUiFacade createEnvironmentUiFacade();

  /**
	 * Returns a new object of class '<em>Map View Configuration List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map View Configuration List</em>'.
	 * @generated
	 */
  MapViewConfigurationList createMapViewConfigurationList();

  /**
	 * Returns a new object of class '<em>Map View Configuration</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map View Configuration</em>'.
	 * @generated
	 */
  MapViewConfiguration createMapViewConfiguration();

  /**
	 * Returns a new object of class '<em>Features Of Interest Map Layer Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Features Of Interest Map Layer Presentation</em>'.
	 * @generated
	 */
	FeaturesOfInterestMapLayerPresentation createFeaturesOfInterestMapLayerPresentation();

		/**
	 * Returns a new object of class '<em>Map Ruler</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Ruler</em>'.
	 * @generated
	 */
  MapRuler createMapRuler();

  /**
	 * Returns a new object of class '<em>Trajectory Picking Tool</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trajectory Picking Tool</em>'.
	 * @generated
	 */
  TrajectoryPickingTool createTrajectoryPickingTool();

  /**
	 * Returns a new object of class '<em>Default Variable Trajectory Provider</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Variable Trajectory Provider</em>'.
	 * @generated
	 */
  DefaultVariableTrajectoryProvider createDefaultVariableTrajectoryProvider();

  /**
	 * Returns a new object of class '<em>Pose Variable Annotation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pose Variable Annotation</em>'.
	 * @generated
	 */
  PoseVariableAnnotation createPoseVariableAnnotation();

  /**
	 * Returns a new object of class '<em>Variable Trajectory Annotation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Trajectory Annotation</em>'.
	 * @generated
	 */
  VariableTrajectoryAnnotation createVariableTrajectoryAnnotation();

  /**
	 * Returns a new object of class '<em>Vehicle Variable Annotation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Variable Annotation</em>'.
	 * @generated
	 */
  VehicleVariableAnnotation createVehicleVariableAnnotation();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__CoreEnvironmentUIPackage getSymphony__CoreEnvironmentUIPackage();

} //Symphony__CoreEnvironmentUIFactory
