package ca.gc.asc_csa.apogy.addons.geometry.paths.impl;
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

import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsFactory;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;
import ca.gc.asc_csa.apogy.addons.geometry.paths.SplineEndControlPointGenerationMode;
import ca.gc.asc_csa.apogy.addons.geometry.paths.SplinesUtilities;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catmull Rom Way Point Path Interpolator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl#getTension <em>Tension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl#getMaximumWayPointsDistance <em>Maximum Way Points Distance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.geometry.paths.impl.CatmullRomWayPointPathInterpolatorImpl#getEndControlPointGenerationMode <em>End Control Point Generation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatmullRomWayPointPathInterpolatorImpl extends WayPointPathInterpolatorImpl implements CatmullRomWayPointPathInterpolator {
	/**
	 * The default value of the '{@link #getTension() <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTension()
	 * @generated
	 * @ordered
	 */
	protected static final double TENSION_EDEFAULT = 0.5;

	/**
	 * The cached value of the '{@link #getTension() <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTension()
	 * @generated
	 * @ordered
	 */
	protected double tension = TENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumWayPointsDistance() <em>Maximum Way Points Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWayPointsDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_WAY_POINTS_DISTANCE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getMaximumWayPointsDistance() <em>Maximum Way Points Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWayPointsDistance()
	 * @generated
	 * @ordered
	 */
	protected double maximumWayPointsDistance = MAXIMUM_WAY_POINTS_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndControlPointGenerationMode() <em>End Control Point Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndControlPointGenerationMode()
	 * @generated
	 * @ordered
	 */
	protected static final SplineEndControlPointGenerationMode END_CONTROL_POINT_GENERATION_MODE_EDEFAULT = SplineEndControlPointGenerationMode.AUTO_CTRL_POINTS_DUPLICATE_ENDNODES;

	/**
	 * The cached value of the '{@link #getEndControlPointGenerationMode() <em>End Control Point Generation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndControlPointGenerationMode()
	 * @generated
	 * @ordered
	 */
	protected SplineEndControlPointGenerationMode endControlPointGenerationMode = END_CONTROL_POINT_GENERATION_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatmullRomWayPointPathInterpolatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsGeometryPathsPackage.Literals.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTension() {
		return tension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTension(double newTension) {
		double oldTension = tension;
		tension = newTension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION, oldTension, tension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumWayPointsDistance() {
		return maximumWayPointsDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumWayPointsDistance(double newMaximumWayPointsDistance) {
		double oldMaximumWayPointsDistance = maximumWayPointsDistance;
		maximumWayPointsDistance = newMaximumWayPointsDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE, oldMaximumWayPointsDistance, maximumWayPointsDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SplineEndControlPointGenerationMode getEndControlPointGenerationMode() {
		return endControlPointGenerationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndControlPointGenerationMode(SplineEndControlPointGenerationMode newEndControlPointGenerationMode) {
		SplineEndControlPointGenerationMode oldEndControlPointGenerationMode = endControlPointGenerationMode;
		endControlPointGenerationMode = newEndControlPointGenerationMode == null ? END_CONTROL_POINT_GENERATION_MODE_EDEFAULT : newEndControlPointGenerationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE, oldEndControlPointGenerationMode, endControlPointGenerationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION:
				return getTension();
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE:
				return getMaximumWayPointsDistance();
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE:
				return getEndControlPointGenerationMode();
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
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION:
				setTension((Double)newValue);
				return;
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE:
				setMaximumWayPointsDistance((Double)newValue);
				return;
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE:
				setEndControlPointGenerationMode((SplineEndControlPointGenerationMode)newValue);
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
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION:
				setTension(TENSION_EDEFAULT);
				return;
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE:
				setMaximumWayPointsDistance(MAXIMUM_WAY_POINTS_DISTANCE_EDEFAULT);
				return;
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE:
				setEndControlPointGenerationMode(END_CONTROL_POINT_GENERATION_MODE_EDEFAULT);
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
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION:
				return tension != TENSION_EDEFAULT;
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE:
				return maximumWayPointsDistance != MAXIMUM_WAY_POINTS_DISTANCE_EDEFAULT;
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE:
				return endControlPointGenerationMode != END_CONTROL_POINT_GENERATION_MODE_EDEFAULT;
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
		result.append(" (tension: ");
		result.append(tension);
		result.append(", maximumWayPointsDistance: ");
		result.append(maximumWayPointsDistance);
		result.append(", endControlPointGenerationMode: ");
		result.append(endControlPointGenerationMode);
		result.append(')');
		return result.toString();
	}

	@Override
	public WayPointPath process(WayPointPath input) throws Exception {
		
		WayPointPath output = ApogyAddonsGeometryPathsFactory.eINSTANCE.createWayPointPath();
		
		List<Point3d> controlPoints = Geometry3DUtilities.getPoint3dList(input.getPoints());
		
		List<Point3d> resultPoints = SplinesUtilities.generateCatMullSplineArcLengthParam(controlPoints, 
				getMaximumWayPointsDistance(), 
				getEndControlPointGenerationMode(), 
				getTension(), 
				getProgressMonitor());
		
		
		output.getPoints().addAll(Geometry3DUtilities.getCartesianPositionCoordinates(resultPoints));
		
		return output;
	}			
} //CatmullRomWayPointPathInterpolatorImpl
