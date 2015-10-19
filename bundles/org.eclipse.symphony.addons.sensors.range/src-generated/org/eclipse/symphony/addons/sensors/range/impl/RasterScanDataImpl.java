/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanDataImpl.java,v 1.4.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.sensors.range.RangePackage;
import org.eclipse.symphony.addons.sensors.range.RasterScanData;
import org.eclipse.symphony.addons.sensors.range.RasterScanSettings;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Raster Scan Data</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl#getRasterScanSettings <em>Raster Scan Settings</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.impl.RasterScanDataImpl#getScanData <em>Scan Data</em>}</li>
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
		return RangePackage.Literals.RASTER_SCAN_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RASTER_SCAN_DATA__TIME, oldTime, time));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, oldRasterScanSettings, newRasterScanSettings);
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
				msgs = ((InternalEObject)rasterScanSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, null, msgs);
			if (newRasterScanSettings != null)
				msgs = ((InternalEObject)newRasterScanSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, null, msgs);
			msgs = basicSetRasterScanSettings(newRasterScanSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS, newRasterScanSettings, newRasterScanSettings));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RangePackage.RASTER_SCAN_DATA__SCAN_DATA, oldScanData, newScanData);
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
				msgs = ((InternalEObject)scanData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RangePackage.RASTER_SCAN_DATA__SCAN_DATA, null, msgs);
			if (newScanData != null)
				msgs = ((InternalEObject)newScanData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RangePackage.RASTER_SCAN_DATA__SCAN_DATA, null, msgs);
			msgs = basicSetScanData(newScanData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RangePackage.RASTER_SCAN_DATA__SCAN_DATA, newScanData, newScanData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				return basicSetRasterScanSettings(null, msgs);
			case RangePackage.RASTER_SCAN_DATA__SCAN_DATA:
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
			case RangePackage.RASTER_SCAN_DATA__TIME:
				return getTime();
			case RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				return getRasterScanSettings();
			case RangePackage.RASTER_SCAN_DATA__SCAN_DATA:
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
			case RangePackage.RASTER_SCAN_DATA__TIME:
				setTime((Date)newValue);
				return;
			case RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				setRasterScanSettings((RasterScanSettings)newValue);
				return;
			case RangePackage.RASTER_SCAN_DATA__SCAN_DATA:
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
			case RangePackage.RASTER_SCAN_DATA__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				setRasterScanSettings((RasterScanSettings)null);
				return;
			case RangePackage.RASTER_SCAN_DATA__SCAN_DATA:
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
			case RangePackage.RASTER_SCAN_DATA__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case RangePackage.RASTER_SCAN_DATA__RASTER_SCAN_SETTINGS:
				return rasterScanSettings != null;
			case RangePackage.RASTER_SCAN_DATA__SCAN_DATA:
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
				case RangePackage.RASTER_SCAN_DATA__TIME: return EMFEcorePackage.TIMED__TIME;
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
				case EMFEcorePackage.TIMED__TIME: return RangePackage.RASTER_SCAN_DATA__TIME;
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
