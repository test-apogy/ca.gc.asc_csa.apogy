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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.TrajectoryProvider;

import java.lang.reflect.InvocationTargetException;

import java.util.List;

import javax.vecmath.Color3f;
import javax.vecmath.Point2d;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trajectory Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl#getLatestPosition <em>Latest Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl#getAzimuthAngle <em>Azimuth Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl#getTrajectoryLength <em>Trajectory Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.TrajectoryProviderImpl#getTrajectoryColor <em>Trajectory Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrajectoryProviderImpl extends MinimalEObjectImpl.Container implements TrajectoryProvider {
	/**
	 * The default value of the '{@link #getLatestPosition() <em>Latest Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestPosition()
	 * @generated
	 * @ordered
	 */
	protected static final XYDataItem LATEST_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatestPosition() <em>Latest Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestPosition()
	 * @generated
	 * @ordered
	 */
	protected XYDataItem latestPosition = LATEST_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzimuthAngle() <em>Azimuth Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double AZIMUTH_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAzimuthAngle() <em>Azimuth Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzimuthAngle()
	 * @generated
	 * @ordered
	 */
	protected double azimuthAngle = AZIMUTH_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrajectoryLength() <em>Trajectory Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoryLength()
	 * @generated
	 * @ordered
	 */
	protected static final double TRAJECTORY_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTrajectoryLength() <em>Trajectory Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoryLength()
	 * @generated
	 * @ordered
	 */
	protected double trajectoryLength = TRAJECTORY_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrajectoryColor() <em>Trajectory Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoryColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color3f TRAJECTORY_COLOR_EDEFAULT = (Color3f)ApogySurfaceEnvironmentUIFactory.eINSTANCE.createFromString(ApogySurfaceEnvironmentUIPackage.eINSTANCE.getColor3f(), "0.0,1.0,0.0");

	/**
	 * The cached value of the '{@link #getTrajectoryColor() <em>Trajectory Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrajectoryColor()
	 * @generated
	 * @ordered
	 */
	protected Color3f trajectoryColor = TRAJECTORY_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrajectoryProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.TRAJECTORY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYDataItem getLatestPosition() {
		return latestPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestPosition(XYDataItem newLatestPosition) {
		XYDataItem oldLatestPosition = latestPosition;
		latestPosition = newLatestPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION, oldLatestPosition, latestPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAzimuthAngle() {
		return azimuthAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuthAngle(double newAzimuthAngle) {
		double oldAzimuthAngle = azimuthAngle;
		azimuthAngle = newAzimuthAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE, oldAzimuthAngle, azimuthAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTrajectoryLength() {
		return trajectoryLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoryLength(double newTrajectoryLength) {
		double oldTrajectoryLength = trajectoryLength;
		trajectoryLength = newTrajectoryLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH, oldTrajectoryLength, trajectoryLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color3f getTrajectoryColor() {
		return trajectoryColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrajectoryColor(Color3f newTrajectoryColor) {
		Color3f oldTrajectoryColor = trajectoryColor;
		trajectoryColor = newTrajectoryColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR, oldTrajectoryColor, trajectoryColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void clear() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Point2d> asListOfPoint2d() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XYSeries getXYSeries() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION:
				return getLatestPosition();
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE:
				return getAzimuthAngle();
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH:
				return getTrajectoryLength();
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR:
				return getTrajectoryColor();
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
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION:
				setLatestPosition((XYDataItem)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE:
				setAzimuthAngle((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH:
				setTrajectoryLength((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR:
				setTrajectoryColor((Color3f)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION:
				setLatestPosition(LATEST_POSITION_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE:
				setAzimuthAngle(AZIMUTH_ANGLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH:
				setTrajectoryLength(TRAJECTORY_LENGTH_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR:
				setTrajectoryColor(TRAJECTORY_COLOR_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__LATEST_POSITION:
				return LATEST_POSITION_EDEFAULT == null ? latestPosition != null : !LATEST_POSITION_EDEFAULT.equals(latestPosition);
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__AZIMUTH_ANGLE:
				return azimuthAngle != AZIMUTH_ANGLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_LENGTH:
				return trajectoryLength != TRAJECTORY_LENGTH_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER__TRAJECTORY_COLOR:
				return TRAJECTORY_COLOR_EDEFAULT == null ? trajectoryColor != null : !TRAJECTORY_COLOR_EDEFAULT.equals(trajectoryColor);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER___INITIALIZE:
				initialize();
				return null;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER___CLEAR:
				clear();
				return null;
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER___AS_LIST_OF_POINT2D:
				return asListOfPoint2d();
			case ApogySurfaceEnvironmentUIPackage.TRAJECTORY_PROVIDER___GET_XY_SERIES:
				return getXYSeries();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (latestPosition: ");
		result.append(latestPosition);
		result.append(", azimuthAngle: ");
		result.append(azimuthAngle);
		result.append(", trajectoryLength: ");
		result.append(trajectoryLength);
		result.append(", trajectoryColor: ");
		result.append(trajectoryColor);
		result.append(')');
		return result.toString();
	}

} //TrajectoryProviderImpl
