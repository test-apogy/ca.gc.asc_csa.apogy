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

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Raster Scan Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.RasterScanDataImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.RasterScanDataImpl#getRasterScanSettings <em>Raster Scan Settings</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.impl.RasterScanDataImpl#getScanData <em>Scan Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RasterScanDataImpl extends AggregateGroupNodeImpl implements
		RasterScanData {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRasterScanSettings()
	 * <em>Raster Scan Settings</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRasterScanSettings()
	 * @generated
	 * @ordered
	 */
	protected RasterScanSettings rasterScanSettings;

	/**
	 * The cached value of the '{@link #getScanData() <em>Scan Data</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getScanData()
	 * @generated
	 * @ordered
	 */
	protected VolumetricCoordinatesSet25D scanData;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterScanDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsRangePackage.Literals.RASTER_SCAN_DATA;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public RasterScanSettings getRasterScanSettings() {
		return rasterScanSettings;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRasterScanSettings(
			RasterScanSettings newRasterScanSettings, NotificationChain msgs) {
		RasterScanSettings oldRasterScanSettings = rasterScanSettings;
		rasterScanSettings = newRasterScanSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, oldRasterScanSettings, newRasterScanSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRasterScanSettings(RasterScanSettings newRasterScanSettings) {
		if (newRasterScanSettings != rasterScanSettings) {
			NotificationChain msgs = null;
			if (rasterScanSettings != null)
				msgs = ((InternalEObject)rasterScanSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, null, msgs);
			if (newRasterScanSettings != null)
				msgs = ((InternalEObject)newRasterScanSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, null, msgs);
			msgs = basicSetRasterScanSettings(newRasterScanSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, newRasterScanSettings, newRasterScanSettings));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public VolumetricCoordinatesSet25D getScanData() {
		return scanData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScanData(
			VolumetricCoordinatesSet25D newScanData, NotificationChain msgs) {
		VolumetricCoordinatesSet25D oldScanData = scanData;
		scanData = newScanData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA, oldScanData, newScanData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setScanData(VolumetricCoordinatesSet25D newScanData) {
		if (newScanData != scanData) {
			NotificationChain msgs = null;
			if (scanData != null)
				msgs = ((InternalEObject)scanData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA, null, msgs);
			if (newScanData != null)
				msgs = ((InternalEObject)newScanData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA, null, msgs);
			msgs = basicSetScanData(newScanData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA, newScanData, newScanData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				return basicSetRasterScanSettings(null, msgs);
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA:
				return basicSetScanData(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME:
				return getTime();
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				return getRasterScanSettings();
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA:
				return getScanData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME:
				setTime((Date)newValue);
				return;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				setRasterScanSettings((RasterScanSettings)newValue);
				return;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA:
				setScanData((VolumetricCoordinatesSet25D)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				setRasterScanSettings((RasterScanSettings)null);
				return;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA:
				setScanData((VolumetricCoordinatesSet25D)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				return rasterScanSettings != null;
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__SCAN_DATA:
				return scanData != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME: return ApogyCommonEMFPackage.TIMED__TIME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.TIMED__TIME: return ApogyAddonsSensorsRangePackage.RASTER_SCAN_DATA__TIME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} // RasterScanDataImpl
