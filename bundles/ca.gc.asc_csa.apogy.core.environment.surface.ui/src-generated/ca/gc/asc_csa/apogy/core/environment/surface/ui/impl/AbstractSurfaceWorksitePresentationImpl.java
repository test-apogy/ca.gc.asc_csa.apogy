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

import ca.gc.asc_csa.apogy.common.topology.ui.impl.NodePresentationImpl;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.AbstractSurfaceWorksitePresentation;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Surface Worksite Presentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#isAxisVisible <em>Axis Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#getAxisLength <em>Axis Length</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#isAzimuthVisible <em>Azimuth Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#isElevationLinesVisible <em>Elevation Lines Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#isAzimuthLinesVisible <em>Azimuth Lines Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#isPlaneVisible <em>Plane Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#getPlaneGridSize <em>Plane Grid Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.ui.impl.AbstractSurfaceWorksitePresentationImpl#getPlaneSize <em>Plane Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractSurfaceWorksitePresentationImpl extends NodePresentationImpl implements AbstractSurfaceWorksitePresentation {
	/**
	 * The default value of the '{@link #isAxisVisible() <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAxisVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AXIS_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAxisVisible() <em>Axis Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAxisVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean axisVisible = AXIS_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxisLength() <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLength()
	 * @generated
	 * @ordered
	 */
	protected static final double AXIS_LENGTH_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getAxisLength() <em>Axis Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxisLength()
	 * @generated
	 * @ordered
	 */
	protected double axisLength = AXIS_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzimuthVisible() <em>Azimuth Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzimuthVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZIMUTH_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAzimuthVisible() <em>Azimuth Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzimuthVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean azimuthVisible = AZIMUTH_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isElevationLinesVisible() <em>Elevation Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElevationLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEVATION_LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isElevationLinesVisible() <em>Elevation Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElevationLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean elevationLinesVisible = ELEVATION_LINES_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzimuthLinesVisible() <em>Azimuth Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzimuthLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZIMUTH_LINES_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAzimuthLinesVisible() <em>Azimuth Lines Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzimuthLinesVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean azimuthLinesVisible = AZIMUTH_LINES_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPlaneVisible() <em>Plane Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaneVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLANE_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isPlaneVisible() <em>Plane Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaneVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean planeVisible = PLANE_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaneGridSize() <em>Plane Grid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaneGridSize()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANE_GRID_SIZE_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getPlaneGridSize() <em>Plane Grid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaneGridSize()
	 * @generated
	 * @ordered
	 */
	protected double planeGridSize = PLANE_GRID_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlaneSize() <em>Plane Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaneSize()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANE_SIZE_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getPlaneSize() <em>Plane Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaneSize()
	 * @generated
	 * @ordered
	 */
	protected double planeSize = PLANE_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSurfaceWorksitePresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentUIPackage.Literals.ABSTRACT_SURFACE_WORKSITE_PRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAxisVisible() {
		return axisVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisVisible(boolean newAxisVisible) {
		boolean oldAxisVisible = axisVisible;
		axisVisible = newAxisVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE, oldAxisVisible, axisVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAxisLength() {
		return axisLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxisLength(double newAxisLength) {
		double oldAxisLength = axisLength;
		axisLength = newAxisLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH, oldAxisLength, axisLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzimuthVisible() {
		return azimuthVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuthVisible(boolean newAzimuthVisible) {
		boolean oldAzimuthVisible = azimuthVisible;
		azimuthVisible = newAzimuthVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE, oldAzimuthVisible, azimuthVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isElevationLinesVisible() {
		return elevationLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationLinesVisible(boolean newElevationLinesVisible) {
		boolean oldElevationLinesVisible = elevationLinesVisible;
		elevationLinesVisible = newElevationLinesVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE, oldElevationLinesVisible, elevationLinesVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzimuthLinesVisible() {
		return azimuthLinesVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzimuthLinesVisible(boolean newAzimuthLinesVisible) {
		boolean oldAzimuthLinesVisible = azimuthLinesVisible;
		azimuthLinesVisible = newAzimuthLinesVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE, oldAzimuthLinesVisible, azimuthLinesVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPlaneVisible() {
		return planeVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaneVisible(boolean newPlaneVisible) {
		boolean oldPlaneVisible = planeVisible;
		planeVisible = newPlaneVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE, oldPlaneVisible, planeVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlaneGridSize() {
		return planeGridSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaneGridSize(double newPlaneGridSize) {
		double oldPlaneGridSize = planeGridSize;
		planeGridSize = newPlaneGridSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE, oldPlaneGridSize, planeGridSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlaneSize() {
		return planeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaneSize(double newPlaneSize) {
		double oldPlaneSize = planeSize;
		planeSize = newPlaneSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE, oldPlaneSize, planeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
				return isAxisVisible();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH:
				return getAxisLength();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE:
				return isAzimuthVisible();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE:
				return isElevationLinesVisible();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE:
				return isAzimuthLinesVisible();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE:
				return isPlaneVisible();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE:
				return getPlaneGridSize();
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE:
				return getPlaneSize();
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH:
				setAxisLength((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE:
				setAzimuthVisible((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE:
				setElevationLinesVisible((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE:
				setAzimuthLinesVisible((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE:
				setPlaneVisible((Boolean)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE:
				setPlaneGridSize((Double)newValue);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE:
				setPlaneSize((Double)newValue);
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
				setAxisVisible(AXIS_VISIBLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH:
				setAxisLength(AXIS_LENGTH_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE:
				setAzimuthVisible(AZIMUTH_VISIBLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE:
				setElevationLinesVisible(ELEVATION_LINES_VISIBLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE:
				setAzimuthLinesVisible(AZIMUTH_LINES_VISIBLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE:
				setPlaneVisible(PLANE_VISIBLE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE:
				setPlaneGridSize(PLANE_GRID_SIZE_EDEFAULT);
				return;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE:
				setPlaneSize(PLANE_SIZE_EDEFAULT);
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
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_VISIBLE:
				return axisVisible != AXIS_VISIBLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AXIS_LENGTH:
				return axisLength != AXIS_LENGTH_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_VISIBLE:
				return azimuthVisible != AZIMUTH_VISIBLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__ELEVATION_LINES_VISIBLE:
				return elevationLinesVisible != ELEVATION_LINES_VISIBLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__AZIMUTH_LINES_VISIBLE:
				return azimuthLinesVisible != AZIMUTH_LINES_VISIBLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_VISIBLE:
				return planeVisible != PLANE_VISIBLE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_GRID_SIZE:
				return planeGridSize != PLANE_GRID_SIZE_EDEFAULT;
			case ApogySurfaceEnvironmentUIPackage.ABSTRACT_SURFACE_WORKSITE_PRESENTATION__PLANE_SIZE:
				return planeSize != PLANE_SIZE_EDEFAULT;
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
		result.append(" (axisVisible: ");
		result.append(axisVisible);
		result.append(", axisLength: ");
		result.append(axisLength);
		result.append(", azimuthVisible: ");
		result.append(azimuthVisible);
		result.append(", elevationLinesVisible: ");
		result.append(elevationLinesVisible);
		result.append(", azimuthLinesVisible: ");
		result.append(azimuthLinesVisible);
		result.append(", planeVisible: ");
		result.append(planeVisible);
		result.append(", planeGridSize: ");
		result.append(planeGridSize);
		result.append(", planeSize: ");
		result.append(planeSize);
		result.append(')');
		return result.toString();
	}

} //AbstractSurfaceWorksitePresentationImpl
