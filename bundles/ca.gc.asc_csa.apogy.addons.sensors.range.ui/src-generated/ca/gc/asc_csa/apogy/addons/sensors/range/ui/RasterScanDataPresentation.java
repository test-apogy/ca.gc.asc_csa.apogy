/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range.ui;

import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raster Scan Data Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#getFovPresentationMode <em>Fov Presentation Mode</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isFovVisible <em>Fov Visible</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isDataVisible <em>Data Visible</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#getRasterScanDataPresentation()
 * @model
 * @generated
 */
public interface RasterScanDataPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Fov Presentation Mode</b></em>' attribute.
	 * The default value is <code>"WIREFRAME"</code>.
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fov Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fov Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
	 * @see #setFovPresentationMode(MeshPresentationMode)
	 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#getRasterScanDataPresentation_FovPresentationMode()
	 * @model default="WIREFRAME" unique="false"
	 * @generated
	 */
	MeshPresentationMode getFovPresentationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#getFovPresentationMode <em>Fov Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov Presentation Mode</em>' attribute.
	 * @see org.eclipse.symphony.common.topology.ui.MeshPresentationMode
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
	 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#getRasterScanDataPresentation_FovVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isFovVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isFovVisible <em>Fov Visible</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.range.ui.Symphony__AddonsSensorsRangeUIPackage#getRasterScanDataPresentation_DataVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isDataVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.ui.RasterScanDataPresentation#isDataVisible <em>Data Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Visible</em>' attribute.
	 * @see #isDataVisible()
	 * @generated
	 */
	void setDataVisible(boolean value);

} // RasterScanDataPresentation
