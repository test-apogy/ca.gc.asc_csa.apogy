package ca.gc.asc_csa.apogy.addons.mobility.controllers.impl;
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

import java.util.Iterator;
import java.util.List;
import javax.media.j3d.Transform3D;
import javax.vecmath.Point3d;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFacade;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.SplineEndControlPointGenerationMode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.Activator;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.AstolfiGuidanceController;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseUtils;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Astolfi Guidance Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getCurrentWayPoint <em>Current Way Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getPreviousWayPoint <em>Previous Way Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getCurrentPoseInGuidanceReferenceFrame <em>Current Pose In Guidance Reference Frame</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getRho <em>Rho</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getPhi <em>Phi</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getYaw <em>Yaw</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getNu <em>Nu</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getOmega <em>Omega</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getKrho <em>Krho</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getKphi <em>Kphi</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getKalpha <em>Kalpha</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getDestinationDistanceThreshold <em>Destination Distance Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getWayPointDistanceThreshold <em>Way Point Distance Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getKHill <em>KHill</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getHillThreshold <em>Hill Threshold</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getPhiThresholdForReducedVelocity <em>Phi Threshold For Reduced Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#getAlphaThresholdForReducedVelocity <em>Alpha Threshold For Reduced Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.AstolfiGuidanceControllerImpl#isSmoothPathEnabled <em>Smooth Path Enabled</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AstolfiGuidanceControllerImpl extends SkidSteeredPlatformPathFollowerImpl<SkidSteeredMobilePlatform, WayPointPath> implements AstolfiGuidanceController 
{
	/**
	 * The cached value of the '{@link #getCurrentWayPoint() <em>Current Way Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWayPoint()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates currentWayPoint;

	/**
	 * The cached value of the '{@link #getPreviousWayPoint() <em>Previous Way Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousWayPoint()
	 * @generated
	 * @ordered
	 */
	protected CartesianPositionCoordinates previousWayPoint;

	/**
	 * The cached value of the '{@link #getCurrentPoseInGuidanceReferenceFrame() <em>Current Pose In Guidance Reference Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentPoseInGuidanceReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected Pose currentPoseInGuidanceReferenceFrame;

	/**
	 * The default value of the '{@link #getRho() <em>Rho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRho()
	 * @generated
	 * @ordered
	 */
	protected static final double RHO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRho() <em>Rho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRho()
	 * @generated
	 * @ordered
	 */
	protected double rho = RHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhi() <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhi()
	 * @generated
	 * @ordered
	 */
	protected static final double PHI_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final double ALPHA_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getYaw() <em>Yaw</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYaw()
	 * @generated
	 * @ordered
	 */
	protected static final double YAW_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getNu() <em>Nu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNu()
	 * @generated
	 * @ordered
	 */
	protected static final double NU_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getOmega() <em>Omega</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOmega()
	 * @generated
	 * @ordered
	 */
	protected static final double OMEGA_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getKrho() <em>Krho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrho()
	 * @generated
	 * @ordered
	 */
	protected static final double KRHO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKrho() <em>Krho</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrho()
	 * @generated
	 * @ordered
	 */
	protected double krho = KRHO_EDEFAULT;

	/**
	 * The default value of the '{@link #getKphi() <em>Kphi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKphi()
	 * @generated
	 * @ordered
	 */
	protected static final double KPHI_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKphi() <em>Kphi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKphi()
	 * @generated
	 * @ordered
	 */
	protected double kphi = KPHI_EDEFAULT;

	/**
	 * The default value of the '{@link #getKalpha() <em>Kalpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKalpha()
	 * @generated
	 * @ordered
	 */
	protected static final double KALPHA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKalpha() <em>Kalpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKalpha()
	 * @generated
	 * @ordered
	 */
	protected double kalpha = KALPHA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestinationDistanceThreshold() <em>Destination Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDistanceThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double DESTINATION_DISTANCE_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDestinationDistanceThreshold() <em>Destination Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationDistanceThreshold()
	 * @generated
	 * @ordered
	 */
	protected double destinationDistanceThreshold = DESTINATION_DISTANCE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getWayPointDistanceThreshold() <em>Way Point Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPointDistanceThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double WAY_POINT_DISTANCE_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWayPointDistanceThreshold() <em>Way Point Distance Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWayPointDistanceThreshold()
	 * @generated
	 * @ordered
	 */
	protected double wayPointDistanceThreshold = WAY_POINT_DISTANCE_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getKHill() <em>KHill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKHill()
	 * @generated
	 * @ordered
	 */
	protected static final double KHILL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getKHill() <em>KHill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKHill()
	 * @generated
	 * @ordered
	 */
	protected double kHill = KHILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHillThreshold() <em>Hill Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHillThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double HILL_THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHillThreshold() <em>Hill Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHillThreshold()
	 * @generated
	 * @ordered
	 */
	protected double hillThreshold = HILL_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhiThresholdForReducedVelocity() <em>Phi Threshold For Reduced Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiThresholdForReducedVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double PHI_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhiThresholdForReducedVelocity() <em>Phi Threshold For Reduced Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhiThresholdForReducedVelocity()
	 * @generated
	 * @ordered
	 */
	protected double phiThresholdForReducedVelocity = PHI_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlphaThresholdForReducedVelocity() <em>Alpha Threshold For Reduced Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaThresholdForReducedVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlphaThresholdForReducedVelocity() <em>Alpha Threshold For Reduced Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphaThresholdForReducedVelocity()
	 * @generated
	 * @ordered
	 */
	protected double alphaThresholdForReducedVelocity = ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSmoothPathEnabled() <em>Smooth Path Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmoothPathEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SMOOTH_PATH_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSmoothPathEnabled() <em>Smooth Path Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSmoothPathEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean smoothPathEnabled = SMOOTH_PATH_ENABLED_EDEFAULT;

	/**
	 * The transform that maps the pose of the Pose sensor at the time of
	 * start() to the origin of the guidance system.
	 */
	private Transform3D poseTransformation = new Transform3D();

	/**
	 * Iterator used to navigate the path.
	 */
	protected Iterator<CartesianPositionCoordinates> wayPointIterator = null;

	/**
	 * The smoothed path.
	 */
	protected WayPointPath smoothedPath;
	
	private Adapter poseSensorAdapter = null;
	
	int i = 0;
	int j= 0;
	int k = 0;

	double oldOmega = 0.0;
	double omegaBeforeBoost = 0.0;
	double omegaAfterBoost = 0.0;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AstolfiGuidanceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityControllersPackage.Literals.ASTOLFI_GUIDANCE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getCurrentWayPoint() {
		if (currentWayPoint != null && currentWayPoint.eIsProxy()) {
			InternalEObject oldCurrentWayPoint = (InternalEObject)currentWayPoint;
			currentWayPoint = (CartesianPositionCoordinates)eResolveProxy(oldCurrentWayPoint);
			if (currentWayPoint != oldCurrentWayPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT, oldCurrentWayPoint, currentWayPoint));
			}
		}
		return currentWayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetCurrentWayPoint() {
		return currentWayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentWayPoint(CartesianPositionCoordinates newCurrentWayPoint) {
		CartesianPositionCoordinates oldCurrentWayPoint = currentWayPoint;
		currentWayPoint = newCurrentWayPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT, oldCurrentWayPoint, currentWayPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates getPreviousWayPoint() {
		if (previousWayPoint != null && previousWayPoint.eIsProxy()) {
			InternalEObject oldPreviousWayPoint = (InternalEObject)previousWayPoint;
			previousWayPoint = (CartesianPositionCoordinates)eResolveProxy(oldPreviousWayPoint);
			if (previousWayPoint != oldPreviousWayPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT, oldPreviousWayPoint, previousWayPoint));
			}
		}
		return previousWayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPositionCoordinates basicGetPreviousWayPoint() {
		return previousWayPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousWayPoint(CartesianPositionCoordinates newPreviousWayPoint) {
		CartesianPositionCoordinates oldPreviousWayPoint = previousWayPoint;
		previousWayPoint = newPreviousWayPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT, oldPreviousWayPoint, previousWayPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose getCurrentPoseInGuidanceReferenceFrame() {
		if (currentPoseInGuidanceReferenceFrame != null && currentPoseInGuidanceReferenceFrame.eIsProxy()) {
			InternalEObject oldCurrentPoseInGuidanceReferenceFrame = (InternalEObject)currentPoseInGuidanceReferenceFrame;
			currentPoseInGuidanceReferenceFrame = (Pose)eResolveProxy(oldCurrentPoseInGuidanceReferenceFrame);
			if (currentPoseInGuidanceReferenceFrame != oldCurrentPoseInGuidanceReferenceFrame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME, oldCurrentPoseInGuidanceReferenceFrame, currentPoseInGuidanceReferenceFrame));
			}
		}
		return currentPoseInGuidanceReferenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pose basicGetCurrentPoseInGuidanceReferenceFrame() {
		return currentPoseInGuidanceReferenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPoseInGuidanceReferenceFrame(Pose newCurrentPoseInGuidanceReferenceFrame) {
		Pose oldCurrentPoseInGuidanceReferenceFrame = currentPoseInGuidanceReferenceFrame;
		currentPoseInGuidanceReferenceFrame = newCurrentPoseInGuidanceReferenceFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME, oldCurrentPoseInGuidanceReferenceFrame, currentPoseInGuidanceReferenceFrame));
	}

	@Override
	public void setPath(WayPointPath newPath) {
	
		super.setPath(newPath);
		
		if ((newPath != null) && (newPath.getPoints().size() == 0)) {
			Logger.INSTANCE.log(Activator.ID, this, "AstolfiGuidanceControllerImpl : Path set to an empty path !", EventSeverity.ERROR);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getRho() 
	{
		// Gets current robot position.
		Point3d currentPose = getCurrentPoseInGuidanceReferenceFrame()
				.asPoint3d();

		// Gets the current waypoint.
		Point3d currentWayPoint = getCurrentWayPoint().asPoint3d();

		// Flatten both points on the XY plane.
		currentPose.setZ(0.0);
		currentWayPoint.setZ(0.0);

		// Compute the distance between the points.
		return currentPose.distance(currentWayPoint);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	private double getRhoDestination() {
		// Gets the current waypoint.
		CartesianPositionCoordinates currentWayPoint = getCurrentWayPoint();
		int indexCurrent = getSmoothedPath().getPoints().indexOf(currentWayPoint);
		
		// Gets the destination waypoint.
		int indexLast = getSmoothedPath().getPoints().size()-1;
		
		List<CartesianPositionCoordinates> remainingPathPoints = getSmoothedPath().getPoints().subList(indexCurrent, indexLast);
		WayPointPath remainingPathToDestination = ApogyAddonsGeometryPathsFacade.INSTANCE.createWayPointPath(remainingPathPoints);
		
		double remainingPathToDestinationLength=remainingPathToDestination.getLength() + getRho();
		
		//System.out.println("remainingPathToDestinationLength = " +remainingPathToDestinationLength);
		
		return remainingPathToDestinationLength;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getPhi() 
	{
		// Phi = Destination orientation - yaw
		double deltaX = getCurrentWayPoint().getX()
				- getPreviousWayPoint().getX();
		double deltaY = getCurrentWayPoint().getY()
				- getPreviousWayPoint().getY();
		double wayPointYaw = Math.atan2(deltaY, deltaX);
		return GeometricUtils.normalizeAngle(wayPointYaw - getYaw());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getAlpha() 
	{
		double deltaX = getCurrentWayPoint().getX()
				- getCurrentPoseInGuidanceReferenceFrame().getX();
		double deltaY = getCurrentWayPoint().getY()
				- getCurrentPoseInGuidanceReferenceFrame().getY();
		double relativeYaw = Math.atan2(deltaY, deltaX);
		double result = GeometricUtils.normalizeAngle(relativeYaw - getYaw());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getYaw() {
		return getCurrentPoseInGuidanceReferenceFrame().getZRotation();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getNu() {
		double nu = getKrho() * getRhoDestination(), command=0;
		double k=1;
		setMaximumLinearVelocity(0.37); // Initial working value =0.7
		setMaximumAngularVelocity(0.14); // Initial working value = 0.5
		nu = applyNuHillBoost(nu);  

		// Compensation used to lower linear velocity when angular error is
		// large.
		if ((Math.abs(getAlpha()) > getAlphaThresholdForReducedVelocity())
				|| (Math.abs(getPhi()) > getPhiThresholdForReducedVelocity())) {
//			nu = nu / 5.0;
			nu=0;
			k=0;
			System.out.println("-----> Slowing down to du large angular error." + Math.abs(getAlpha()) + " " + getAlphaThresholdForReducedVelocity() + " " + Math.abs(getPhi()) + " " + getPhiThresholdForReducedVelocity());
		}
		else if (getRhoDestination()<1.3){
			k=0.1;
		}
		else{k=0.35;}

		// Set nu to zero if Alpha is too large. This is to allow the robot
		// to turn on itself if the destination point is "behind it".
		double alpha = getAlpha();
		if (Math.abs(alpha) >= (Math.PI / 2.0)) {
			nu = 0.0;
			k=0;
		}
		command=applyNuSaturation(nu)-k*(0.522502479/getMaximumLinearVelocity())*Math.abs(getAlpha())-k*Math.abs(getPhi());
		if(command<-0.1)
		{
			command=-0.1;
		}
		return command;
	}

	/**
	 * Applies the boosting faction used to help the robot climb uphill.
	 * 
	 * @param nu
	 *            The linear velocity (nu) computed based on waypoint distance.
	 * @return The boosted linear velocity.
	 */
	public double applyNuHillBoost(double nu) {
		double result = nu;
		double pitch = getCurrentPoseInGuidanceReferenceFrame().getYRotation();

		// Up slope is negative here.
		if (pitch < getHillThreshold()) {
			result = getKHill() * nu;
			System.out.println("We are applying hill boost!");
		}

		return result;
	}

	/**
	 * Applies the maximum linear velocity saturation to a specified linear
	 * velocity.
	 * 
	 * @param nu
	 *            The specified linear velocity, in m/s.
	 * @return The linear velocity, clamped between -maximumLinearVelocity and
	 *         +maximumLinearVelocity.
	 */
	public double applyNuSaturation(double nu) {
		double result = nu;
		if (Math.abs(nu) > getMaximumLinearVelocity()) {
			result = Math.signum(nu) * getMaximumLinearVelocity();
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public double getOmega() 
	{
		double omega = Math.toDegrees(getKphi() * getPhi() + getKalpha() * getAlpha());
		//System.out.println("Phi is equal to : " + getPhi() + " and alpha is equal to : " + getAlpha());
		if (((oldOmega>=omega-0.1 & oldOmega<=omega+0.1) | (omegaBeforeBoost>=omega-0.1 & omegaBeforeBoost<=omega+0.1)) & omega<Math.toDegrees(getMaximumAngularVelocity()) & k<2) 
		{
			omegaBeforeBoost=omega;
			i++;
			//System.out.println("We are in the first if, before the second if");
			if (i>6) {
				omega=omega*1.4*(1+j/10); 
				omegaAfterBoost=omega;
				System.out.println("Amplification d'Omega");
				j++;k=1;
			}
		}
		else{
			if (k>=1 & k<8) {
				omega=omegaAfterBoost;
				k++;
			}
			else {
				k=0;
			}
			i=0;j=0;
		}
		oldOmega=omega;
		return applyOmegaSaturation(Math.toRadians(omega));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKrho() {
		return krho;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKrho(double newKrho) {
		double oldKrho = krho;
		krho = newKrho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KRHO, oldKrho, krho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKphi() {
		return kphi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKphi(double newKphi) {
		double oldKphi = kphi;
		kphi = newKphi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KPHI, oldKphi, kphi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKalpha() {
		return kalpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKalpha(double newKalpha) {
		double oldKalpha = kalpha;
		kalpha = newKalpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA, oldKalpha, kalpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDestinationDistanceThreshold() {
		return destinationDistanceThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationDistanceThreshold(double newDestinationDistanceThreshold) {
		double oldDestinationDistanceThreshold = destinationDistanceThreshold;
		destinationDistanceThreshold = newDestinationDistanceThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD, oldDestinationDistanceThreshold, destinationDistanceThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWayPointDistanceThreshold() {
		return wayPointDistanceThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWayPointDistanceThreshold(double newWayPointDistanceThreshold) {
		double oldWayPointDistanceThreshold = wayPointDistanceThreshold;
		wayPointDistanceThreshold = newWayPointDistanceThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD, oldWayPointDistanceThreshold, wayPointDistanceThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getKHill() {
		return kHill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKHill(double newKHill) {
		double oldKHill = kHill;
		kHill = newKHill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KHILL, oldKHill, kHill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHillThreshold() {
		return hillThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHillThreshold(double newHillThreshold) {
		double oldHillThreshold = hillThreshold;
		hillThreshold = newHillThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD, oldHillThreshold, hillThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhiThresholdForReducedVelocity() {
		return phiThresholdForReducedVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhiThresholdForReducedVelocity(double newPhiThresholdForReducedVelocity) {
		double oldPhiThresholdForReducedVelocity = phiThresholdForReducedVelocity;
		phiThresholdForReducedVelocity = newPhiThresholdForReducedVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY, oldPhiThresholdForReducedVelocity, phiThresholdForReducedVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlphaThresholdForReducedVelocity() {
		return alphaThresholdForReducedVelocity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlphaThresholdForReducedVelocity(double newAlphaThresholdForReducedVelocity) {
		double oldAlphaThresholdForReducedVelocity = alphaThresholdForReducedVelocity;
		alphaThresholdForReducedVelocity = newAlphaThresholdForReducedVelocity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY, oldAlphaThresholdForReducedVelocity, alphaThresholdForReducedVelocity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSmoothPathEnabled() {
		return smoothPathEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSmoothPathEnabled(boolean newSmoothPathEnabled) {
		boolean oldSmoothPathEnabled = smoothPathEnabled;
		smoothPathEnabled = newSmoothPathEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED, oldSmoothPathEnabled, smoothPathEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT:
				if (resolve) return getCurrentWayPoint();
				return basicGetCurrentWayPoint();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT:
				if (resolve) return getPreviousWayPoint();
				return basicGetPreviousWayPoint();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME:
				if (resolve) return getCurrentPoseInGuidanceReferenceFrame();
				return basicGetCurrentPoseInGuidanceReferenceFrame();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__RHO:
				return getRho();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI:
				return getPhi();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA:
				return getAlpha();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__YAW:
				return getYaw();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__NU:
				return getNu();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__OMEGA:
				return getOmega();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KRHO:
				return getKrho();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KPHI:
				return getKphi();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA:
				return getKalpha();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD:
				return getDestinationDistanceThreshold();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD:
				return getWayPointDistanceThreshold();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KHILL:
				return getKHill();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD:
				return getHillThreshold();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY:
				return getPhiThresholdForReducedVelocity();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY:
				return getAlphaThresholdForReducedVelocity();
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED:
				return isSmoothPathEnabled();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT:
				setCurrentWayPoint((CartesianPositionCoordinates)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT:
				setPreviousWayPoint((CartesianPositionCoordinates)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME:
				setCurrentPoseInGuidanceReferenceFrame((Pose)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KRHO:
				setKrho((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KPHI:
				setKphi((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA:
				setKalpha((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD:
				setDestinationDistanceThreshold((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD:
				setWayPointDistanceThreshold((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KHILL:
				setKHill((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD:
				setHillThreshold((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY:
				setPhiThresholdForReducedVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY:
				setAlphaThresholdForReducedVelocity((Double)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED:
				setSmoothPathEnabled((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT:
				setCurrentWayPoint((CartesianPositionCoordinates)null);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT:
				setPreviousWayPoint((CartesianPositionCoordinates)null);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME:
				setCurrentPoseInGuidanceReferenceFrame((Pose)null);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KRHO:
				setKrho(KRHO_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KPHI:
				setKphi(KPHI_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA:
				setKalpha(KALPHA_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD:
				setDestinationDistanceThreshold(DESTINATION_DISTANCE_THRESHOLD_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD:
				setWayPointDistanceThreshold(WAY_POINT_DISTANCE_THRESHOLD_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KHILL:
				setKHill(KHILL_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD:
				setHillThreshold(HILL_THRESHOLD_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY:
				setPhiThresholdForReducedVelocity(PHI_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY:
				setAlphaThresholdForReducedVelocity(ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED:
				setSmoothPathEnabled(SMOOTH_PATH_ENABLED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_WAY_POINT:
				return currentWayPoint != null;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PREVIOUS_WAY_POINT:
				return previousWayPoint != null;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__CURRENT_POSE_IN_GUIDANCE_REFERENCE_FRAME:
				return currentPoseInGuidanceReferenceFrame != null;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__RHO:
				return rho != RHO_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI:
				return getPhi() != PHI_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA:
				return getAlpha() != ALPHA_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__YAW:
				return getYaw() != YAW_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__NU:
				return getNu() != NU_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__OMEGA:
				return getOmega() != OMEGA_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KRHO:
				return krho != KRHO_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KPHI:
				return kphi != KPHI_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KALPHA:
				return kalpha != KALPHA_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__DESTINATION_DISTANCE_THRESHOLD:
				return destinationDistanceThreshold != DESTINATION_DISTANCE_THRESHOLD_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__WAY_POINT_DISTANCE_THRESHOLD:
				return wayPointDistanceThreshold != WAY_POINT_DISTANCE_THRESHOLD_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__KHILL:
				return kHill != KHILL_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__HILL_THRESHOLD:
				return hillThreshold != HILL_THRESHOLD_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__PHI_THRESHOLD_FOR_REDUCED_VELOCITY:
				return phiThresholdForReducedVelocity != PHI_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY:
				return alphaThresholdForReducedVelocity != ALPHA_THRESHOLD_FOR_REDUCED_VELOCITY_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.ASTOLFI_GUIDANCE_CONTROLLER__SMOOTH_PATH_ENABLED:
				return smoothPathEnabled != SMOOTH_PATH_ENABLED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (rho: ");
		result.append(rho);
		result.append(", krho: ");
		result.append(krho);
		result.append(", kphi: ");
		result.append(kphi);
		result.append(", kalpha: ");
		result.append(kalpha);
		result.append(", destinationDistanceThreshold: ");
		result.append(destinationDistanceThreshold);
		result.append(", wayPointDistanceThreshold: ");
		result.append(wayPointDistanceThreshold);
		result.append(", kHill: ");
		result.append(kHill);
		result.append(", hillThreshold: ");
		result.append(hillThreshold);
		result.append(", phiThresholdForReducedVelocity: ");
		result.append(phiThresholdForReducedVelocity);
		result.append(", alphaThresholdForReducedVelocity: ");
		result.append(alphaThresholdForReducedVelocity);
		result.append(", smoothPathEnabled: ");
		result.append(smoothPathEnabled);
		result.append(')');
		return result.toString();
	}

	/**
	 * Applies the maximum angular velocity saturation to a specified angular
	 * velocity.
	 * 
	 * @param omega
	 *            The specified angular velocity, in rad/s.
	 * @return The angular velocity, clamped between -maximumAngularVelocity and
	 *         +maximumAngularVelocity.
	 */
	public double applyOmegaSaturation(double omega) {
		double result = omega;
		if (Math.abs(omega) > getMaximumAngularVelocity()) {
			result = Math.signum(omega) * getMaximumAngularVelocity();
		}
		return result;
	}
	
	@Override
	public void setPoseSensor(PoseSensor newPoseSensor) 
	{
		// Remove adapter from previous plateform.
		if (getPoseSensor()!= null)
			getPoseSensor().eAdapters().remove(getPoseSensorAdapter());

		// Adds adapter to the new platform.
		if (newPoseSensor != null)
			newPoseSensor.eAdapters().add(getPoseSensorAdapter());
				
		super.setPoseSensor(newPoseSensor);
	}
	
	@Override
	public boolean start() 
	{
		// Verify it is allowed to transition to RUNNING.
		if (isTransitionValid(PathFollowerState.RUNNING)) 
		{
			// Creates the smoothed path to be used by the controller.
			try {
				if (isSmoothPathEnabled()) {
					// Smooths the path
					createSmoothedPath();
				} else {
					// Copies the path as is.
					smoothedPath = ApogyAddonsGeometryPathsFacade.INSTANCE
							.createWayPointPath(getPath());
				}

			} 
			catch (Exception e) 
			{
				Logger.INSTANCE.log(Activator.ID, this, "Could not create the smoothed path for the trajectory !", EventSeverity.ERROR, e);				
				return false;
			}

			// Initialise the path iterator and current waypoint path.
			if ((getSmoothedPath() != null)
					&& (getSmoothedPath().getPoints().size() > 0)) {
				// Initialise the path iterator.
				wayPointIterator = getSmoothedPath().getPoints().listIterator();

				setPreviousWayPoint(ApogyCommonGeometryData3DFactory.eINSTANCE
						.createCartesianPositionCoordinates()); // First point
				// is always
				// origin
				// initially.
				setCurrentWayPoint(wayPointIterator.next()); // Second point
			}

			// Initialise the pose transformation so as to map the current
			// position to the origin.
			poseTransformation = PoseUtils
					.getTransformFromSensorFrameToNewPose(getPoseSensor()
							.getPose(), ApogyCommonGeometryData3DFactory.eINSTANCE.createPose());

			// Calls the start from super to effect the mode change.
			return super.start();
		} else {
			return false;
		}
	}

	@Override
	public boolean pause() {
		// Verify it is allowed to transition to PAUSED.
		if (isTransitionValid(PathFollowerState.PAUSED)) {
			/* Tries to command the robot to stop its motion. */
			int tries = 0;
			while ((platform.getActualTranslationVelocity() != 0)
					&& (tries < 10)) {
				tries++;
			}
			if (tries >= 10) {
				return false;
			}

			tries = 0;
			while ((platform.getActualAngularVelocity() != 0) && (tries < 10)) {
				tries++;
			}
			if (tries >= 10) {
				return false;
			}

			return super.pause();
		} else {
			return false;
		}
	}

	@Override
	public boolean resume() {
		// Verify it is allowed to transition to RUNNING.
		if (isTransitionValid(PathFollowerState.RUNNING)) 
		{		
			return super.resume();
		} 
		else 
		{
			return false;
		}
	}

	@Override
	public boolean stop() {
		if (isTransitionValid(PathFollowerState.IDLE)) 
		{
			return super.stop();
		} 
		else 
		{
			return false;
		}
	}

	/**
	 * Creates a smoothed path that follows the one specified. This path is
	 * smooth and ensures the controller is stable.
	 * 
	 * @throws Exception
	 */
	private void createSmoothedPath() throws Exception {
		// Interpolate the path using Catmull - Rom is there are more than 2
		// points.
		if (getPath().getPoints().size() > 2) {
			CatmullRomWayPointPathInterpolator interpolator = ApogyAddonsGeometryPathsFactory.eINSTANCE
					.createCatmullRomWayPointPathInterpolator();
			interpolator.setMaximumWayPointsDistance(0.1);
			interpolator.setTension(0.25);
			interpolator
					.setEndControlPointGenerationMode(SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_DUPLICATE_ENDNODES);
			smoothedPath = interpolator.process(getPath());
		} else {
			smoothedPath = ApogyAddonsGeometryPathsFacade.INSTANCE.createWayPointPath(getPath());
		}
	}

	protected void updatePoseInGuidanceReferenceFrame() {
		// Gets the current pose from the pose sensor.
		Pose currentPose = getPoseSensor().getPose();

		// Applies the transform to map it to the Guidance Reference Frame.
		Pose poseInGuidanceReferenceFrame = PoseUtils.applyTransform(
				poseTransformation, currentPose);

		// Updates the current pose.
		setCurrentPoseInGuidanceReferenceFrame(poseInGuidanceReferenceFrame);
	}

	/**
	 * Updates the CurrentWayPoint based on the previous way point and the robot
	 * current position.
	 */
	protected void updateCurrentWayPoint() {
		CartesianPositionCoordinates newCurrentWayPoint = getCurrentWayPoint();
		CartesianPositionCoordinates newPreviousWayPoint = getPreviousWayPoint();

		// Checks to see if the trajectory is empty
		if (getSmoothedPath().getPoints().size() == 0) {
			// Empty path, so destination is already reached.
			setDestinationReached(true);
		} else // Path is not empty.
		{
			// Compute the distance to the current waypoint.
			double rho = getRho();

			// Check to see if the current waypoint is the final destination.
			if (!wayPointIterator.hasNext()) {
				if (rho < getDestinationDistanceThreshold()) {
					// Destination reached.
					setDestinationReached(true);
				} else {
					// Nothing to do, use previous waypoint as the current
					// waypoint.
				}
			} else {
				// If the we are close enough to the current waypoint, switch to
				// the next one.
				if (rho < getWayPointDistanceThreshold()) {
					double distance = Double.MAX_VALUE;

					// Go along the path until a waypoint that is further than
					// WayPointDistanceThreshold away from the current robot
					// position,
					// or the end of the trajectory has been reached.
					do {
						newPreviousWayPoint = getCurrentWayPoint();
						newCurrentWayPoint = wayPointIterator.next();

						// Gets the distance in XY plane.
						Point3d nextPoint = newCurrentWayPoint.asPoint3d();
						nextPoint.setZ(0);
						Point3d currentPose = getCurrentPoseInGuidanceReferenceFrame()
								.asPoint3d();
						currentPose.setZ(0);

						// Compute the distance between the current pose and the
						// selected next waypoint.
						distance = nextPoint.distance(currentPose);
					} while (distance < getWayPointDistanceThreshold()
							&& wayPointIterator.hasNext());
				} else {
					// Nothing to do, use previous waypoint as the current
					// waypoint.
				}
			}
		}

		// Update the new goal and previous point.
		setCurrentWayPoint(newCurrentWayPoint);
		setPreviousWayPoint(newPreviousWayPoint);
	}

	protected boolean validateForUpdate() {
		boolean valid = true;
		valid &= ((getPathFollowerState() == PathFollowerState.RUNNING) && (!isDestinationReached()));
		return valid;
	}

	/**
	 * Implements the control algorithm to have the robot follow the path.
	 */
	protected void update() 
	{
		//System.out.println("AstolfiGuidanceControllerImpl.update()");
		
		// Validate the setups.
		if (validateForUpdate()) 
		{
			// Updates the current robot pose.
			updatePoseInGuidanceReferenceFrame();

			// Updates current goal;
			updateCurrentWayPoint();

			if (!isDestinationReached()) 
			{
				// Computes the required velocities.
				double nu = getNu();
				double omega = getOmega();
				
				//System.out.println("Time : " + now.getTime() + " nu " + nu + " omega " + omega);
				
				// getPlatform().setWheelsVelocities(leftWheelVel, rightWheelVel);
				getPlatform().setCommandedTranslationVelocity(nu);
				getPlatform().setCommandedAngularVelocity(omega);
			} 
			else 
			{
				// Destination has been reached, stop motion.
				stop();
			}
		}
	}

	int noRefresh;

	private Adapter getPoseSensorAdapter() 
	{
		if (poseSensorAdapter == null) 
		{
			noRefresh = 0;
			poseSensorAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) 
				{
					//System.out.println("Notified");
					
					if (notification.getFeatureID(PoseSensor.class) == ApogyAddonsSensorsPosePackage.POSE_SENSOR__POSITION)		
					{				
						if (noRefresh == 0) 
						{
							update();
							noRefresh++;
						} 
						else 
						{
							noRefresh = 0;
						}

					}
				}
			};
		}

		return poseSensorAdapter;
	}

	public WayPointPath getSmoothedPath() {
		return smoothedPath;
	}
} //AstolfiGuidanceControllerImpl
