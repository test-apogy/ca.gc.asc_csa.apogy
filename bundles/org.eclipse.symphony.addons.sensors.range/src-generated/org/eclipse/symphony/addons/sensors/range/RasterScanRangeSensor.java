/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;

import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanRangeSensor()
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
