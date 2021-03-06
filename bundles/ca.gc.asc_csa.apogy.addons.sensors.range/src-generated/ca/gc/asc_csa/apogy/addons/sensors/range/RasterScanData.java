package ca.gc.asc_csa.apogy.addons.sensors.range;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.emf.Timed;
import ca.gc.asc_csa.apogy.common.geometry.data25d.VolumetricCoordinatesSet25D;
import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData#getRasterScanSettings <em>Raster Scan Settings</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData#getScanData <em>Scan Data</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getRasterScanData()
 * @model
 * @generated
 */
public interface RasterScanData extends AggregateGroupNode, Timed {
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getRasterScanData_RasterScanSettings()
	 * @model containment="true"
	 * @generated
	 */
	RasterScanSettings getRasterScanSettings();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData#getRasterScanSettings <em>Raster Scan Settings</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage#getRasterScanData_ScanData()
	 * @model containment="true"
	 * @generated
	 */
	VolumetricCoordinatesSet25D getScanData();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanData#getScanData <em>Scan Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scan Data</em>' containment reference.
	 * @see #getScanData()
	 * @generated
	 */
	void setScanData(VolumetricCoordinatesSet25D value);

} // RasterScanData
