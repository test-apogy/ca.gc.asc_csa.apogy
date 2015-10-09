/**
 * <copyright>
 * </copyright>
 *
 * $Id: ControllersFactory.java,v 1.4.4.2 2015/05/21 15:50:44 pallard Exp $
 */
package ca.gc.space.mrt.mobility.controllers;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.symphony.addons.geometry.paths.Path;

import ca.gc.space.mrt.mobility.MobilePlateform;
import ca.gc.space.mrt.mobility.SkidSteeredMobilePlateform;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.space.mrt.mobility.controllers.ControllersPackage
 * @generated
 */
public interface ControllersFactory extends EFactory
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControllersFactory eINSTANCE = ca.gc.space.mrt.mobility.controllers.impl.ControllersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path Follower</em>'.
	 * @generated
	 */
	<PlatformType extends MobilePlateform, PathType extends Path> PathFollower<PlatformType, PathType> createPathFollower();

	/**
	 * Returns a new object of class '<em>Skid Steered Platform Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skid Steered Platform Path Follower</em>'.
	 * @generated
	 */
	<PlateformType extends SkidSteeredMobilePlateform, PathType extends Path> SkidSteeredPlatformPathFollower<PlateformType, PathType> createSkidSteeredPlatformPathFollower();

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
