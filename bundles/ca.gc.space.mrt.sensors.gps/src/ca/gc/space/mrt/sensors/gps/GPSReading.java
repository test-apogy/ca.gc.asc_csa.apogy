/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSReading.java,v 1.2.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getQuality <em>Quality</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading()
 * @model
 * @generated
 */
public interface GPSReading extends EObject {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #setLatitude(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_Latitude()
	 * @model
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #setLongitude(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_Longitude()
	 * @model
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_Elevation()
	 * @model transient="true"
	 * @generated
	 */
	double getElevation();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(double value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.space.mrt.sensors.gps.GPS_QUALITY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.gps.GPS_QUALITY
	 * @see #setQuality(GPS_QUALITY)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_Quality()
	 * @model
	 * @generated
	 */
	GPS_QUALITY getQuality();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.gps.GPS_QUALITY
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(GPS_QUALITY value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(Date)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_TimeStamp()
	 * @model
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(Date value);

	/**
	 * Returns the value of the '<em><b>Number Of Satellites</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Satellites</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Satellites</em>' attribute.
	 * @see #setNumberOfSatellites(int)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_NumberOfSatellites()
	 * @model
	 * @generated
	 */
	int getNumberOfSatellites();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Satellites</em>' attribute.
	 * @see #getNumberOfSatellites()
	 * @generated
	 */
	void setNumberOfSatellites(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Dilution Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Dilution Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Dilution Pos</em>' attribute.
	 * @see #setHorizontalDilutionPos(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_HorizontalDilutionPos()
	 * @model
	 * @generated
	 */
	double getHorizontalDilutionPos();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Dilution Pos</em>' attribute.
	 * @see #getHorizontalDilutionPos()
	 * @generated
	 */
	void setHorizontalDilutionPos(double value);

	/**
	 * Returns the value of the '<em><b>Mean Sea Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mean Sea Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mean Sea Level</em>' attribute.
	 * @see #setMeanSeaLevel(double)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_MeanSeaLevel()
	 * @model
	 * @generated
	 */
	double getMeanSeaLevel();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Sea Level</em>' attribute.
	 * @see #getMeanSeaLevel()
	 * @generated
	 */
	void setMeanSeaLevel(double value);

	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(int)
	 * @see ca.gc.space.mrt.sensors.gps.GpsPackage#getGPSReading_CheckSum()
	 * @model
	 * @generated
	 */
	int getCheckSum();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(int value);

} // GPSReading
