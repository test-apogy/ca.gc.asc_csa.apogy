/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Camera Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An overlay that produces a transparent image that will be superimposed
 * on the camera image by the CameraView.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageCameraOverlay()
 * @model abstract="true"
 * @generated
 */
public interface ImageCameraOverlay extends CameraOverlay
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the overlay image to superimpose on the camera image.
	 * @param overlayWidth The width of the overlay.
	 * @param overlayHeight The height of the overlay.
	 * @return The image (with transparent background) to be superimposed on the camera image.
	 * <!-- end-model-doc -->
	 * @model unique="false" cameraUnique="false" overlayAlignmentUnique="false" overlayWidthUnique="false" overlayHeightUnique="false"
	 * @generated
	 */
  AbstractEImage getOverlay(AbstractCamera camera, OverlayAlignment overlayAlignment, int overlayWidth, int overlayHeight);

} // ImageCameraOverlay
