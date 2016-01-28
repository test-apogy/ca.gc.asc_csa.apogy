/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.range;

import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getRasterScanRangeSensor()
 * @model
 * @generated
 */
public interface RasterScanRangeSensor extends RangeScanner<RasterScanSettings>, Processor<RasterScanSettings, VolumetricCoordinatesSet25D> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	RasterScanSettings getScanSettings();

} // RasterScanRangeSensor
