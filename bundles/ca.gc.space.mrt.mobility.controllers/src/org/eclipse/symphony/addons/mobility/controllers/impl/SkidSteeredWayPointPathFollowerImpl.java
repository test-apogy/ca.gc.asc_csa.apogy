/**
 * Canadian Space Agency 2008.
 */
package org.eclipse.symphony.addons.mobility.controllers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.geometry.paths.WayPointPath;
import org.eclipse.symphony.addons.mobility.SkidSteeredMobilePlateform;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
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
public class SkidSteeredWayPointPathFollowerImpl extends PathFollowerImpl<SkidSteeredMobilePlateform, WayPointPath> implements SkidSteeredWayPointPathFollower {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

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
		return ControllersPackage.Literals.SKID_STEERED_WAY_POINT_PATH_FOLLOWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setPath(WayPointPath newPath) {
		super.setPath(newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setPlatform(SkidSteeredMobilePlateform newPlatform) {
		super.setPlatform(newPlatform);
	}

} //SkidSteeredWayPointPathFollowerImpl
