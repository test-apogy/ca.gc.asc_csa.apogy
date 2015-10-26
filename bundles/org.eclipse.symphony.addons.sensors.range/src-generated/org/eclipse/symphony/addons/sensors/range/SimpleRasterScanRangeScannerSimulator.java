/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Raster Scan Range Scanner Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator()
 * @model
 * @generated
 */
public interface SimpleRasterScanRangeScannerSimulator extends RangeScannerSimulator<RasterScanSettings>, SimpleRasterScanRangeScanner {
	/**
	 * Returns the value of the '<em><b>Range Noise Amplitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range Noise Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Noise Amplitude</em>' attribute.
	 * @see #setRangeNoiseAmplitude(double)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_RangeNoiseAmplitude()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getRangeNoiseAmplitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getRangeNoiseAmplitude <em>Range Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Noise Amplitude</em>' attribute.
	 * @see #getRangeNoiseAmplitude()
	 * @generated
	 */
	void setRangeNoiseAmplitude(double value);

	/**
	 * Returns the value of the '<em><b>Azimuth Noise Amplitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azimuth Noise Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth Noise Amplitude</em>' attribute.
	 * @see #setAzimuthNoiseAmplitude(double)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_AzimuthNoiseAmplitude()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getAzimuthNoiseAmplitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getAzimuthNoiseAmplitude <em>Azimuth Noise Amplitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Noise Amplitude</em>' attribute.
	 * @see #getAzimuthNoiseAmplitude()
	 * @generated
	 */
	void setAzimuthNoiseAmplitude(double value);

	/**
	 * Returns the value of the '<em><b>Elevation Noise Amplitude</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Noise Amplitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Noise Amplitude</em>' attribute.
	 * @see #setElevationNoiseAmplitude(double)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_ElevationNoiseAmplitude()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getElevationNoiseAmplitude();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#getElevationNoiseAmplitude <em>Elevation Noise Amplitude</em>}' attribute.
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
	 * Enables the detection of the horizon to speed up processing.
	 * Horizon detection stop the elevation scanning motion when one
	 * missing return is detected. Note that enabling this feature
	 * could lead to incomplete results when the terrain includes overhangs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Horizon Detection Enabled</em>' attribute.
	 * @see #setHorizonDetectionEnabled(boolean)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getSimpleRasterScanRangeScannerSimulator_HorizonDetectionEnabled()
	 * @model unique="false"
	 * @generated
	 */
	boolean isHorizonDetectionEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator#isHorizonDetectionEnabled <em>Horizon Detection Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizon Detection Enabled</em>' attribute.
	 * @see #isHorizonDetectionEnabled()
	 * @generated
	 */
	void setHorizonDetectionEnabled(boolean value);

} // SimpleRasterScanRangeScannerSimulator
