/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Count Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An overlay used to display the number of images.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageCountOverlay#isIndicatorVisible <em>Indicator Visible</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageCountOverlay()
 * @model
 * @generated
 */
public interface ImageCountOverlay extends AbstractTextOverlay {

	/**
	 * Returns the value of the '<em><b>Indicator Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicator Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicator Visible</em>' attribute.
	 * @see #setIndicatorVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageCountOverlay_IndicatorVisible()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isIndicatorVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageCountOverlay#isIndicatorVisible <em>Indicator Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicator Visible</em>' attribute.
	 * @see #isIndicatorVisible()
	 * @generated
	 */
	void setIndicatorVisible(boolean value);
} // ImageCountOverlay
