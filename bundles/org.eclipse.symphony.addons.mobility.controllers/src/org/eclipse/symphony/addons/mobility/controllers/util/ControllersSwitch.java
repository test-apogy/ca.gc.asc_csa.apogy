/**
 * <copyright>
 * </copyright>
 *
 * $Id: ControllersSwitch.java,v 1.5.4.3 2015/09/22 19:39:39 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.MobilePlateform;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform;
import org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.PathFollower;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorder;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.WaypointPathRecorder;

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
 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage
 * @generated
 */
public class ControllersSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControllersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersSwitch()
	{
		if (modelPackage == null) {
			modelPackage = ControllersPackage.eINSTANCE;
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
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID) {
			case ControllersPackage.PATH_FOLLOWER: {
				PathFollower<?, ?> pathFollower = (PathFollower<?, ?>)theEObject;
				T result = casePathFollower(pathFollower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER: {
				SkidSteeredPlatformPathFollower<?, ?> skidSteeredPlatformPathFollower = (SkidSteeredPlatformPathFollower<?, ?>)theEObject;
				T result = caseSkidSteeredPlatformPathFollower(skidSteeredPlatformPathFollower);
				if (result == null) result = casePathFollower(skidSteeredPlatformPathFollower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllersPackage.PATH_RECORDER: {
				PathRecorder<?> pathRecorder = (PathRecorder<?>)theEObject;
				T result = casePathRecorder(pathRecorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllersPackage.WAYPOINT_PATH_RECORDER: {
				WaypointPathRecorder waypointPathRecorder = (WaypointPathRecorder)theEObject;
				T result = caseWaypointPathRecorder(waypointPathRecorder);
				if (result == null) result = casePathRecorder(waypointPathRecorder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllersPackage.SKID_STEERED_WAY_POINT_PATH_FOLLOWER: {
				SkidSteeredWayPointPathFollower skidSteeredWayPointPathFollower = (SkidSteeredWayPointPathFollower)theEObject;
				T result = caseSkidSteeredWayPointPathFollower(skidSteeredWayPointPathFollower);
				if (result == null) result = caseSkidSteeredPlatformPathFollower(skidSteeredWayPointPathFollower);
				if (result == null) result = casePathFollower(skidSteeredWayPointPathFollower);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER: {
				AstolfiGuidanceController astolfiGuidanceController = (AstolfiGuidanceController)theEObject;
				T result = caseAstolfiGuidanceController(astolfiGuidanceController);
				if (result == null) result = caseSkidSteeredPlatformPathFollower(astolfiGuidanceController);
				if (result == null) result = casePathFollower(astolfiGuidanceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Follower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PlatformType extends MobilePlateform, PathType extends Path> T casePathFollower(PathFollower<PlatformType, PathType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skid Steered Platform Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skid Steered Platform Path Follower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PlateformType extends SkidSteeredMobilePlateform, PathType extends Path> T caseSkidSteeredPlatformPathFollower(SkidSteeredPlatformPathFollower<PlateformType, PathType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Recorder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <PathType extends Path> T casePathRecorder(PathRecorder<PathType> object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waypoint Path Recorder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waypoint Path Recorder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaypointPathRecorder(WaypointPathRecorder object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skid Steered Way Point Path Follower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skid Steered Way Point Path Follower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkidSteeredWayPointPathFollower(SkidSteeredWayPointPathFollower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Astolfi Guidance Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Astolfi Guidance Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAstolfiGuidanceController(AstolfiGuidanceController object) {
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

} //ControllersSwitch
