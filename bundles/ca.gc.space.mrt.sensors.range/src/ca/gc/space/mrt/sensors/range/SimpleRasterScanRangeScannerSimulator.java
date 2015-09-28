/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleRasterScanRangeScannerSimulator.java,v 1.3.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Raster Scan Range Scanner Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator()
 * @model
 * @generated
 */
public interface SimpleRasterScanRangeScannerSimulator extends RangeScannerSimulator<RasterScanSettings>, SimpleRasterScanRangeScanner {
	/**
	 * Returns the value of the '<em><b>Range Noise Amplitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Noise Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Noise Amplitude</em>' attribute.
	 * @see #setRangeNoiseAmplitude(double)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude()
	 * @model default="0"
	 * @generated
	 */
	double getRangeNoiseAmplitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Noise Amplitude</em>' attribute.
	 * @see #getRangeNoiseAmplitude()
	 * @generated
	 */
	void setRangeNoiseAmplitude(double value);

	/**
	 * Returns the value of the '<em><b>Azimuth Noise Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azimuth Noise Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth Noise Amplitude</em>' attribute.
	 * @see #setAzimuthNoiseAmplitude(double)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude()
	 * @model
	 * @generated
	 */
	double getAzimuthNoiseAmplitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Noise Amplitude</em>' attribute.
	 * @see #getAzimuthNoiseAmplitude()
	 * @generated
	 */
	void setAzimuthNoiseAmplitude(double value);

	/**
	 * Returns the value of the '<em><b>Elevation Noise Amplitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Noise Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Noise Amplitude</em>' attribute.
	 * @see #setElevationNoiseAmplitude(double)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude()
	 * @model
	 * @generated
	 */
	double getElevationNoiseAmplitude();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Noise Amplitude</em>' attribute.
	 * @see #getElevationNoiseAmplitude()
	 * @generated
	 */
	void setElevationNoiseAmplitude(double value);

	/**
	 * Returns the value of the '<em><b>Horizon Detection Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enables the detection of the horizon to speed up processing. Horizon detection stop the elevation scanning motion when one missing return is detected. Note that enabling this feature could lead to incomplete results when the terrain includes overhangs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizon Detection Enabled</em>' attribute.
	 * @see #setHorizonDetectionEnabled(boolean)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled()
	 * @model
	 * @generated
	 */
	boolean isHorizonDetectionEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon Detection Enabled</em>' attribute.
	 * @see #isHorizonDetectionEnabled()
	 * @generated
	 */
	void setHorizonDetectionEnabled(boolean value);

} // SimpleRasterScanRangeScannerSimulator
