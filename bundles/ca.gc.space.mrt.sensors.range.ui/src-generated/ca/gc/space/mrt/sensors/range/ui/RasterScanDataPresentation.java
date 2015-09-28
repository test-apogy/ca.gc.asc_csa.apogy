/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.range.ui;

import ca.gc.space.topology.ui.MeshPresentationMode;
import ca.gc.space.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Data Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation#getFovPresentationMode <em>Fov Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation#isFovVisible <em>Fov Visible</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation#isDataVisible <em>Data Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIPackage#getRasterScanDataPresentation()
 * @model
 * @generated
 */
public interface RasterScanDataPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Fov Presentation Mode</b></em>' attribute.
	 * The default value is <code>"WIREFRAME"</code>.
	 * The literals are from the enumeration {@link ca.gc.space.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fov Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fov Presentation Mode</em>' attribute.
	 * @see ca.gc.space.topology.ui.MeshPresentationMode
	 * @see #setFovPresentationMode(MeshPresentationMode)
	 * @see ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIPackage#getRasterScanDataPresentation_FovPresentationMode()
	 * @model default="WIREFRAME" unique="false"
	 * @generated
	 */
	MeshPresentationMode getFovPresentationMode();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation#getFovPresentationMode <em>Fov Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov Presentation Mode</em>' attribute.
	 * @see ca.gc.space.topology.ui.MeshPresentationMode
	 * @see #getFovPresentationMode()
	 * @generated
	 */
	void setFovPresentationMode(MeshPresentationMode value);

	/**
	 * Returns the value of the '<em><b>Fov Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fov Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fov Visible</em>' attribute.
	 * @see #setFovVisible(boolean)
	 * @see ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIPackage#getRasterScanDataPresentation_FovVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isFovVisible();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation#isFovVisible <em>Fov Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov Visible</em>' attribute.
	 * @see #isFovVisible()
	 * @generated
	 */
	void setFovVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Visible</em>' attribute.
	 * @see #setDataVisible(boolean)
	 * @see ca.gc.space.mrt.sensors.range.ui.RangeSensorsUIPackage#getRasterScanDataPresentation_DataVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isDataVisible();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.ui.RasterScanDataPresentation#isDataVisible <em>Data Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Visible</em>' attribute.
	 * @see #isDataVisible()
	 * @generated
	 */
	void setDataVisible(boolean value);

} // RasterScanDataPresentation
