/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.controllers;

import org.eclipse.emf.ecore.EFactory;

import org.eclipse.symphony.addons.geometry.paths.Path;

import org.eclipse.symphony.addons.mobility.MobilePlatform;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage
 * @generated
 */
public interface ControllersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControllersFactory eINSTANCE = org.eclipse.symphony.addons.mobility.controllers.impl.ControllersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Follower</em>'.
	 * @generated
	 */
	<PlatformType extends MobilePlatform, PathType extends Path> PathFollower<PlatformType, PathType> createPathFollower();

	/**
	 * Returns a new object of class '<em>Skid Steered Platform Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skid Steered Platform Path Follower</em>'.
	 * @generated
	 */
	<PlateformType extends SkidSteeredMobilePlatform, PathType extends Path> SkidSteeredPlatformPathFollower<PlateformType, PathType> createSkidSteeredPlatformPathFollower();

	/**
	 * Returns a new object of class '<em>Path Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Recorder</em>'.
	 * @generated
	 */
	<PathType extends Path> PathRecorder<PathType> createPathRecorder();

	/**
	 * Returns a new object of class '<em>Waypoint Path Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waypoint Path Recorder</em>'.
	 * @generated
	 */
	WaypointPathRecorder createWaypointPathRecorder();

	/**
	 * Returns a new object of class '<em>Skid Steered Way Point Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skid Steered Way Point Path Follower</em>'.
	 * @generated
	 */
	SkidSteeredWayPointPathFollower createSkidSteeredWayPointPathFollower();

	/**
	 * Returns a new object of class '<em>Astolfi Guidance Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Astolfi Guidance Controller</em>'.
	 * @generated
	 */
	AstolfiGuidanceController createAstolfiGuidanceController();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ControllersPackage getControllersPackage();

} //ControllersFactory
