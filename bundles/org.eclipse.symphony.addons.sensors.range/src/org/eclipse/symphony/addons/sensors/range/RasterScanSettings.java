/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanSettings.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range;

import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getNumberOfPoints <em>Number Of Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanSettings()
 * @model
 * @generated
 */
public interface RasterScanSettings extends RectangularFrustrumFieldOfView
{
	/**
	 * Returns the value of the '<em><b>Vertical Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #setVerticalResolution(int)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanSettings_VerticalResolution()
	 * @model
	 * @generated
	 */
	int getVerticalResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getVerticalResolution <em>Vertical Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Resolution</em>' attribute.
	 * @see #getVerticalResolution()
	 * @generated
	 */
	void setVerticalResolution(int value);

	/**
	 * Returns the value of the '<em><b>Horizontal Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #setHorizontalResolution(int)
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanSettings_HorizontalResolution()
	 * @model
	 * @generated
	 */
	int getHorizontalResolution();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RasterScanSettings#getHorizontalResolution <em>Horizontal Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Resolution</em>' attribute.
	 * @see #getHorizontalResolution()
	 * @generated
	 */
	void setHorizontalResolution(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Points</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Points</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRasterScanSettings_NumberOfPoints()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfPoints();

} // RasterScanSettings
