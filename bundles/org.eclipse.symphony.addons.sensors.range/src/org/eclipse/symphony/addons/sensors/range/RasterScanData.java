/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanData.java,v 1.4.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.symphony.common.geometry.data25d.VolumetricCoordinatesSet25D;
import org.eclipse.symphony.common.obsolete.mrt.TimeTaggedElement;
import org.eclipse.symphony.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RasterScanData#getRasterScanSettings <em>Raster Scan Settings</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RasterScanData#getScanData <em>Scan Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanData()
 * @model
 * @generated
 */
public interface RasterScanData extends AggregateGroupNode, TimeTaggedElement
{
	/**
	 * Returns the value of the '<em><b>Raster Scan Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Scan Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Scan Settings</em>' containment reference.
	 * @see #setRasterScanSettings(RasterScanSettings)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanData_RasterScanSettings()
	 * @model containment="true"
	 * @generated
	 */
	RasterScanSettings getRasterScanSettings();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RasterScanData#getRasterScanSettings <em>Raster Scan Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Scan Settings</em>' containment reference.
	 * @see #getRasterScanSettings()
	 * @generated
	 */
	void setRasterScanSettings(RasterScanSettings value);

	/**
	 * Returns the value of the '<em><b>Scan Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scan Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scan Data</em>' containment reference.
	 * @see #setScanData(VolumetricCoordinatesSet25D)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanData_ScanData()
	 * @model containment="true"
	 * @generated
	 */
	VolumetricCoordinatesSet25D getScanData();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RasterScanData#getScanData <em>Scan Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Data</em>' containment reference.
	 * @see #getScanData()
	 * @generated
	 */
	void setScanData(VolumetricCoordinatesSet25D value);

} // RasterScanData
