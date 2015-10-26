/**
 * <copyright>
 * </copyright>
 *
 * $Id: ControllersAdapterFactory.java,v 1.5.4.3 2015/09/22 19:39:40 rlarcheveque Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.geometry.paths.Path;
import org.eclipse.symphony.addons.mobility.MobilePlatform;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;
import org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.PathFollower;
import org.eclipse.symphony.addons.mobility.controllers.PathRecorder;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower;
import org.eclipse.symphony.addons.mobility.controllers.WaypointPathRecorder;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.controllers.ControllersPackage
 * @generated
 */
public class ControllersAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControllersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = ControllersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllersSwitch<Adapter> modelSwitch =
		new ControllersSwitch<Adapter>() {
			@Override
			public <PlatformType extends MobilePlatform, PathType extends Path> Adapter casePathFollower(PathFollower<PlatformType, PathType> object) {
				return createPathFollowerAdapter();
			}
			@Override
			public <PlateformType extends SkidSteeredMobilePlatform, PathType extends Path> Adapter caseSkidSteeredPlatformPathFollower(SkidSteeredPlatformPathFollower<PlateformType, PathType> object) {
				return createSkidSteeredPlatformPathFollowerAdapter();
			}
			@Override
			public <PathType extends Path> Adapter casePathRecorder(PathRecorder<PathType> object) {
				return createPathRecorderAdapter();
			}
			@Override
			public Adapter caseWaypointPathRecorder(WaypointPathRecorder object) {
				return createWaypointPathRecorderAdapter();
			}
			@Override
			public Adapter caseSkidSteeredWayPointPathFollower(SkidSteeredWayPointPathFollower object) {
				return createSkidSteeredWayPointPathFollowerAdapter();
			}
			@Override
			public Adapter caseAstolfiGuidanceController(AstolfiGuidanceController object) {
				return createAstolfiGuidanceControllerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.mobility.controllers.PathFollower <em>Path Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.mobility.controllers.PathFollower
	 * @generated
	 */
	public Adapter createPathFollowerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower <em>Skid Steered Platform Path Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower
	 * @generated
	 */
	public Adapter createSkidSteeredPlatformPathFollowerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.mobility.controllers.PathRecorder <em>Path Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.mobility.controllers.PathRecorder
	 * @generated
	 */
	public Adapter createPathRecorderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.mobility.controllers.WaypointPathRecorder <em>Waypoint Path Recorder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.mobility.controllers.WaypointPathRecorder
	 * @generated
	 */
	public Adapter createWaypointPathRecorderAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower <em>Skid Steered Way Point Path Follower</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower
	 * @generated
	 */
	public Adapter createSkidSteeredWayPointPathFollowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController <em>Astolfi Guidance Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.symphony.addons.mobility.controllers.AstolfiGuidanceController
	 * @generated
	 */
	public Adapter createAstolfiGuidanceControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //ControllersAdapterFactory
