/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanRangeSensor.java,v 1.3.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;

import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Range Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRasterScanRangeSensor()
 * @model
 * @generated
 */
public interface RasterScanRangeSensor extends RangeScanner<RasterScanSettings>, Processor<RasterScanSettings, VolumetricCoordinatesSet25D>
{
	/**
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Settings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	RasterScanSettings getScanSettings();

} // RasterScanRangeSensor
