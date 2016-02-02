package ca.gc.asc_csa.apogy.core.environment.ui;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage
 * @generated
 */
public interface ApogyCoreEnvironmentUIFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreEnvironmentUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.ui.impl.ApogyCoreEnvironmentUIFactoryImpl.init();

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
	 * Returns a new object of class '<em>Environment UI Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment UI Utilities</em>'.
	 * @generated
	 */
	EnvironmentUIUtilities createEnvironmentUIUtilities();

		/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreEnvironmentUIFacade createApogyCoreEnvironmentUIFacade();

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
	ApogyCoreEnvironmentUIPackage getApogyCoreEnvironmentUIPackage();

} //ApogyCoreEnvironmentUIFactory
