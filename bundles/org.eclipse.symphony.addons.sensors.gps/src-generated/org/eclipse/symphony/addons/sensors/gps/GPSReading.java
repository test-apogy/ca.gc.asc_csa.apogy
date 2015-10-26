/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Reading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getElevation <em>Elevation</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getQuality <em>Quality</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading()
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_Latitude()
	 * @model unique="false"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getLatitude <em>Latitude</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_Longitude()
	 * @model unique="false"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getLongitude <em>Longitude</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_Elevation()
	 * @model unique="false"
	 * @generated
	 */
	double getElevation();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(double value);

	/**
	 * Returns the value of the '<em><b>Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.sensors.gps.GPSQuality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quality</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSQuality
	 * @see #setQuality(GPSQuality)
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_Quality()
	 * @model unique="false"
	 * @generated
	 */
	GPSQuality getQuality();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getQuality <em>Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quality</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.gps.GPSQuality
	 * @see #getQuality()
	 * @generated
	 */
	void setQuality(GPSQuality value);

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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_TimeStamp()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.sensors.gps.Date"
	 * @generated
	 */
	Date getTimeStamp();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getTimeStamp <em>Time Stamp</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_NumberOfSatellites()
	 * @model unique="false"
	 * @generated
	 */
	int getNumberOfSatellites();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getNumberOfSatellites <em>Number Of Satellites</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_HorizontalDilutionPos()
	 * @model unique="false"
	 * @generated
	 */
	double getHorizontalDilutionPos();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getHorizontalDilutionPos <em>Horizontal Dilution Pos</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_MeanSeaLevel()
	 * @model unique="false"
	 * @generated
	 */
	double getMeanSeaLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getMeanSeaLevel <em>Mean Sea Level</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage#getGPSReading_CheckSum()
	 * @model unique="false"
	 * @generated
	 */
	int getCheckSum();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.gps.GPSReading#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(int value);

} // GPSReading
