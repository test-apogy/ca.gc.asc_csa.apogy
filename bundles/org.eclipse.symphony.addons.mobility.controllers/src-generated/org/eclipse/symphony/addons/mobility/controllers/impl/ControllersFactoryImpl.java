/**
 * <copyright>
 * </copyright>
 *
 * $Id: ControllersFactoryImpl.java,v 1.5.4.3 2015/09/22 19:39:39 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.MobilePlatform;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;
import org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController;
import org.eclipse.symphony.addons.mobility.controllers.ControllersFactory;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.PathFollower;
import org.eclipse.symphony.addons.mobility.controllers.PathFollowerState;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorder;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorderSamplingMode;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.WaypointPathRecorder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllersFactoryImpl extends EFactoryImpl implements ControllersFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ControllersFactory init()
	{
		try {
			ControllersFactory theControllersFactory = (ControllersFactory)EPackage.Registry.INSTANCE.getEFactory(ControllersPackage.eNS_URI);
			if (theControllersFactory != null) {
				return theControllersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ControllersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID()) {
			case ControllersPackage.PATH_FOLLOWER: return createPathFollower();
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER: return createSkidSteeredPlatformPathFollower();
			case ControllersPackage.PATH_RECORDER: return createPathRecorder();
			case ControllersPackage.WAYPOINT_PATH_RECORDER: return createWaypointPathRecorder();
			case ControllersPackage.SKID_STEERED_WAY_POINT_PATH_FOLLOWER: return createSkidSteeredWayPointPathFollower();
			case ControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER: return createAstolfiGuidanceController();
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
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case ControllersPackage.PATH_FOLLOWER_STATE:
				return createPathFollowerStateFromString(eDataType, initialValue);
			case ControllersPackage.PATH_RECORDER_SAMPLING_MODE:
				return createPathRecorderSamplingModeFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case ControllersPackage.PATH_FOLLOWER_STATE:
				return convertPathFollowerStateToString(eDataType, instanceValue);
			case ControllersPackage.PATH_RECORDER_SAMPLING_MODE:
				return convertPathRecorderSamplingModeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PlatformType extends MobilePlatform, PathType extends Path> PathFollower<PlatformType, PathType> createPathFollower()
	{
		PathFollowerImpl<PlatformType, PathType> pathFollower = new PathFollowerImpl<PlatformType, PathType>();
		return pathFollower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PlateformType extends SkidSteeredMobilePlatform, PathType extends Path> SkidSteeredPlatformPathFollower<PlateformType, PathType> createSkidSteeredPlatformPathFollower()
	{
		SkidSteeredPlatformPathFollowerImpl<PlateformType, PathType> skidSteeredPlatformPathFollower = new SkidSteeredPlatformPathFollowerImpl<PlateformType, PathType>();
		return skidSteeredPlatformPathFollower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <PathType extends Path> PathRecorder<PathType> createPathRecorder()
	{
		PathRecorderImpl<PathType> pathRecorder = new PathRecorderImpl<PathType>();
		return pathRecorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaypointPathRecorder createWaypointPathRecorder()
	{
		WaypointPathRecorderImpl waypointPathRecorder = new WaypointPathRecorderImpl();
		return waypointPathRecorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkidSteeredWayPointPathFollower createSkidSteeredWayPointPathFollower() {
		SkidSteeredWayPointPathFollowerImpl skidSteeredWayPointPathFollower = new SkidSteeredWayPointPathFollowerImpl();
		return skidSteeredWayPointPathFollower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstolfiGuidanceController createAstolfiGuidanceController() {
		AstolfiGuidanceControllerImpl astolfiGuidanceController = new AstolfiGuidanceControllerImpl();
		return astolfiGuidanceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFollowerState createPathFollowerStateFromString(EDataType eDataType, String initialValue)
	{
		PathFollowerState result = PathFollowerState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathFollowerStateToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathRecorderSamplingMode createPathRecorderSamplingModeFromString(EDataType eDataType, String initialValue)
	{
		PathRecorderSamplingMode result = PathRecorderSamplingMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathRecorderSamplingModeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersPackage getControllersPackage()
	{
		return (ControllersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ControllersPackage getPackage()
	{
		return ControllersPackage.eINSTANCE;
	}

} //ControllersFactoryImpl
