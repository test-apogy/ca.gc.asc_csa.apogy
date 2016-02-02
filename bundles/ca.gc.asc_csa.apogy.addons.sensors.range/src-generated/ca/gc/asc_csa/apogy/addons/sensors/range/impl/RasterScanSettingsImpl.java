package ca.gc.asc_csa.apogy.addons.sensors.range.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.fov.impl.RectangularFrustrumFieldOfViewImpl;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raster Scan Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.RasterScanSettingsImpl#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.RasterScanSettingsImpl#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.RasterScanSettingsImpl#getNumberOfPoints <em>Number Of Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RasterScanSettingsImpl extends RectangularFrustrumFieldOfViewImpl implements RasterScanSettings
{
	/**
	 * The default value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final int VERTICAL_RESOLUTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVerticalResolution() <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalResolution()
	 * @generated
	 * @ordered
	 */
	protected int verticalResolution = VERTICAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected static final int HORIZONTAL_RESOLUTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHorizontalResolution() <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalResolution()
	 * @generated
	 * @ordered
	 */
	protected int horizontalResolution = HORIZONTAL_RESOLUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfPoints() <em>Number Of Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_POINTS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanSettingsImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsSensorsRangePackage.Literals.RASTER_SCAN_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVerticalResolution()
	{
		return verticalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalResolution(int newVerticalResolution)
	{
		int oldVerticalResolution = verticalResolution;
		verticalResolution = newVerticalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION, oldVerticalResolution, verticalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHorizontalResolution()
	{
		return horizontalResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalResolution(int newHorizontalResolution)
	{
		int oldHorizontalResolution = horizontalResolution;
		horizontalResolution = newHorizontalResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION, oldHorizontalResolution, horizontalResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public int getNumberOfPoints()
	{
		return getHorizontalResolution() * getVerticalResolution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION:
				return getVerticalResolution();
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION:
				return getHorizontalResolution();
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS:
				return getNumberOfPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION:
				setVerticalResolution((Integer)newValue);
				return;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION:
				setHorizontalResolution((Integer)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION:
				setVerticalResolution(VERTICAL_RESOLUTION_EDEFAULT);
				return;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION:
				setHorizontalResolution(HORIZONTAL_RESOLUTION_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION:
				return verticalResolution != VERTICAL_RESOLUTION_EDEFAULT;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION:
				return horizontalResolution != HORIZONTAL_RESOLUTION_EDEFAULT;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS:
				return getNumberOfPoints() != NUMBER_OF_POINTS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (verticalResolution: ");
		result.append(verticalResolution);
		result.append(", horizontalResolution: ");
		result.append(horizontalResolution);
		result.append(')');
		return result.toString();
	}

} //RasterScanSettingsImpl
