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
package ca.gc.asc_csa.apogy.core.environment.surface.ui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage
 * @generated
 */
public interface ApogySurfaceEnvironmentUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogySurfaceEnvironmentUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.ApogySurfaceEnvironmentUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Surface Worksite Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Surface Worksite Presentation</em>'.
	 * @generated
	 */
	AbstractSurfaceWorksitePresentation createAbstractSurfaceWorksitePresentation();

	/**
	 * Returns a new object of class '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Surface Worksite Sky Presentation</em>'.
	 * @generated
	 */
	AbstractSurfaceWorksiteSkyPresentation createAbstractSurfaceWorksiteSkyPresentation();

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
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogySurfaceEnvironmentUIFacade createApogySurfaceEnvironmentUIFacade();

	/**
	 * Returns a new object of class '<em>Environment Surface UI Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Surface UI Utilities</em>'.
	 * @generated
	 */
	EnvironmentSurfaceUIUtilities createEnvironmentSurfaceUIUtilities();

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
	 * Returns a new object of class '<em>Map Ruler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Ruler</em>'.
	 * @generated
	 */
	MapRuler createMapRuler();

	/**
	 * Returns a new object of class '<em>Features Of Interest Map Layer Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Features Of Interest Map Layer Presentation</em>'.
	 * @generated
	 */
	FeaturesOfInterestMapLayerPresentation createFeaturesOfInterestMapLayerPresentation();

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
	ApogySurfaceEnvironmentUIPackage getApogySurfaceEnvironmentUIPackage();

} //ApogySurfaceEnvironmentUIFactory
