/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanSettings.java,v 1.2.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;

import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getVerticalResolution <em>Vertical Resolution</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getHorizontalResolution <em>Horizontal Resolution</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getNumberOfPoints <em>Number Of Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRasterScanSettings()
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
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRasterScanSettings_VerticalResolution()
	 * @model
	 * @generated
	 */
	int getVerticalResolution();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getVerticalResolution <em>Vertical Resolution</em>}' attribute.
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
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRasterScanSettings_HorizontalResolution()
	 * @model
	 * @generated
	 */
	int getHorizontalResolution();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RasterScanSettings#getHorizontalResolution <em>Horizontal Resolution</em>}' attribute.
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
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRasterScanSettings_NumberOfPoints()
	 * @model default="0" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumberOfPoints();

} // RasterScanSettings
