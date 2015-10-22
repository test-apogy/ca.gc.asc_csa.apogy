/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSReadingImpl.java,v 1.2.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.gps.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.addons.sensors.gps.GPSReading;
import org.eclipse.symphony.addons.sensors.gps.GPSQuality;
import org.eclipse.symphony.addons.sensors.gps.GpsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPS Reading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getMeanSeaLevel <em>Mean Sea Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.impl.GPSReadingImpl#getCheckSum <em>Check Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GPSReadingImpl extends MinimalEObjectImpl.Container implements GPSReading {
	/**
	 * The default value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected double latitude = LATITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected double longitude = LONGITUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected double elevation = ELEVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected static final GPSQuality QUALITY_EDEFAULT = GPSQuality.INVALID;

	/**
	 * The cached value of the '{@link #getQuality() <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuality()
	 * @generated
	 * @ordered
	 */
	protected GPSQuality quality = QUALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_STAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected Date timeStamp = TIME_STAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfSatellites() <em>Number Of Satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSatellites()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_SATELLITES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfSatellites() <em>Number Of Satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSatellites()
	 * @generated
	 * @ordered
	 */
	protected int numberOfSatellites = NUMBER_OF_SATELLITES_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalDilutionPos() <em>Horizontal Dilution Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDilutionPos()
	 * @generated
	 * @ordered
	 */
	protected static final double HORIZONTAL_DILUTION_POS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHorizontalDilutionPos() <em>Horizontal Dilution Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalDilutionPos()
	 * @generated
	 * @ordered
	 */
	protected double horizontalDilutionPos = HORIZONTAL_DILUTION_POS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeanSeaLevel() <em>Mean Sea Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanSeaLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double MEAN_SEA_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMeanSeaLevel() <em>Mean Sea Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeanSeaLevel()
	 * @generated
	 * @ordered
	 */
	protected double meanSeaLevel = MEAN_SEA_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final int CHECK_SUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected int checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GPSReadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GpsPackage.Literals.GPS_READING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(double newLatitude) {
		double oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__LATITUDE, oldLatitude, latitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(double newLongitude) {
		double oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__LONGITUDE, oldLongitude, longitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(double newElevation) {
		double oldElevation = elevation;
		elevation = newElevation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__ELEVATION, oldElevation, elevation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPSQuality getQuality() {
		return quality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(GPSQuality newQuality) {
		GPSQuality oldQuality = quality;
		quality = newQuality == null ? QUALITY_EDEFAULT : newQuality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__QUALITY, oldQuality, quality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStamp(Date newTimeStamp) {
		Date oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__TIME_STAMP, oldTimeStamp, timeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSatellites() {
		return numberOfSatellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSatellites(int newNumberOfSatellites) {
		int oldNumberOfSatellites = numberOfSatellites;
		numberOfSatellites = newNumberOfSatellites;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__NUMBER_OF_SATELLITES, oldNumberOfSatellites, numberOfSatellites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHorizontalDilutionPos() {
		return horizontalDilutionPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalDilutionPos(double newHorizontalDilutionPos) {
		double oldHorizontalDilutionPos = horizontalDilutionPos;
		horizontalDilutionPos = newHorizontalDilutionPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__HORIZONTAL_DILUTION_POS, oldHorizontalDilutionPos, horizontalDilutionPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMeanSeaLevel() {
		return meanSeaLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeanSeaLevel(double newMeanSeaLevel) {
		double oldMeanSeaLevel = meanSeaLevel;
		meanSeaLevel = newMeanSeaLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__MEAN_SEA_LEVEL, oldMeanSeaLevel, meanSeaLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSum(int newCheckSum) {
		int oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GpsPackage.GPS_READING__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GpsPackage.GPS_READING__LATITUDE:
				return getLatitude();
			case GpsPackage.GPS_READING__LONGITUDE:
				return getLongitude();
			case GpsPackage.GPS_READING__ELEVATION:
				return getElevation();
			case GpsPackage.GPS_READING__QUALITY:
				return getQuality();
			case GpsPackage.GPS_READING__TIME_STAMP:
				return getTimeStamp();
			case GpsPackage.GPS_READING__NUMBER_OF_SATELLITES:
				return getNumberOfSatellites();
			case GpsPackage.GPS_READING__HORIZONTAL_DILUTION_POS:
				return getHorizontalDilutionPos();
			case GpsPackage.GPS_READING__MEAN_SEA_LEVEL:
				return getMeanSeaLevel();
			case GpsPackage.GPS_READING__CHECK_SUM:
				return getCheckSum();
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
			case GpsPackage.GPS_READING__LATITUDE:
				setLatitude((Double)newValue);
				return;
			case GpsPackage.GPS_READING__LONGITUDE:
				setLongitude((Double)newValue);
				return;
			case GpsPackage.GPS_READING__ELEVATION:
				setElevation((Double)newValue);
				return;
			case GpsPackage.GPS_READING__QUALITY:
				setQuality((GPSQuality)newValue);
				return;
			case GpsPackage.GPS_READING__TIME_STAMP:
				setTimeStamp((Date)newValue);
				return;
			case GpsPackage.GPS_READING__NUMBER_OF_SATELLITES:
				setNumberOfSatellites((Integer)newValue);
				return;
			case GpsPackage.GPS_READING__HORIZONTAL_DILUTION_POS:
				setHorizontalDilutionPos((Double)newValue);
				return;
			case GpsPackage.GPS_READING__MEAN_SEA_LEVEL:
				setMeanSeaLevel((Double)newValue);
				return;
			case GpsPackage.GPS_READING__CHECK_SUM:
				setCheckSum((Integer)newValue);
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
			case GpsPackage.GPS_READING__LATITUDE:
				setLatitude(LATITUDE_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__LONGITUDE:
				setLongitude(LONGITUDE_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__ELEVATION:
				setElevation(ELEVATION_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__QUALITY:
				setQuality(QUALITY_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__TIME_STAMP:
				setTimeStamp(TIME_STAMP_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__NUMBER_OF_SATELLITES:
				setNumberOfSatellites(NUMBER_OF_SATELLITES_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__HORIZONTAL_DILUTION_POS:
				setHorizontalDilutionPos(HORIZONTAL_DILUTION_POS_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__MEAN_SEA_LEVEL:
				setMeanSeaLevel(MEAN_SEA_LEVEL_EDEFAULT);
				return;
			case GpsPackage.GPS_READING__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
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
			case GpsPackage.GPS_READING__LATITUDE:
				return latitude != LATITUDE_EDEFAULT;
			case GpsPackage.GPS_READING__LONGITUDE:
				return longitude != LONGITUDE_EDEFAULT;
			case GpsPackage.GPS_READING__ELEVATION:
				return elevation != ELEVATION_EDEFAULT;
			case GpsPackage.GPS_READING__QUALITY:
				return quality != QUALITY_EDEFAULT;
			case GpsPackage.GPS_READING__TIME_STAMP:
				return TIME_STAMP_EDEFAULT == null ? timeStamp != null : !TIME_STAMP_EDEFAULT.equals(timeStamp);
			case GpsPackage.GPS_READING__NUMBER_OF_SATELLITES:
				return numberOfSatellites != NUMBER_OF_SATELLITES_EDEFAULT;
			case GpsPackage.GPS_READING__HORIZONTAL_DILUTION_POS:
				return horizontalDilutionPos != HORIZONTAL_DILUTION_POS_EDEFAULT;
			case GpsPackage.GPS_READING__MEAN_SEA_LEVEL:
				return meanSeaLevel != MEAN_SEA_LEVEL_EDEFAULT;
			case GpsPackage.GPS_READING__CHECK_SUM:
				return checkSum != CHECK_SUM_EDEFAULT;
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
		result.append(" (latitude: ");
		result.append(latitude);
		result.append(", longitude: ");
		result.append(longitude);
		result.append(", elevation: ");
		result.append(elevation);
		result.append(", quality: ");
		result.append(quality);
		result.append(", timeStamp: ");
		result.append(timeStamp);
		result.append(", numberOfSatellites: ");
		result.append(numberOfSatellites);
		result.append(", horizontalDilutionPos: ");
		result.append(horizontalDilutionPos);
		result.append(", meanSeaLevel: ");
		result.append(meanSeaLevel);
		result.append(", checkSum: ");
		result.append(checkSum);
		result.append(')');
		return result.toString();
	}

} //GPSReadingImpl
