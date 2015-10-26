/**
 * Canadian Space Agency 2008.
 */
package org.eclipse.symphony.addons.mobility.controllers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlatform;
import org.eclipse.symphony.addons.mobility.controllers.Symphony__AddonsMobilityControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredWayPointPathFollower;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skid Steered Way Point Path Follower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SkidSteeredWayPointPathFollowerImpl extends SkidSteeredPlatformPathFollowerImpl<SkidSteeredMobilePlatform, WayPointPath> implements SkidSteeredWayPointPathFollower {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkidSteeredWayPointPathFollowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsMobilityControllersPackage.Literals.SKID_STEERED_WAY_POINT_PATH_FOLLOWER;
	}

} //SkidSteeredWayPointPathFollowerImpl
