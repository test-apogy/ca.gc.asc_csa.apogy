/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.symphony.common.images.AbstractEImage;

import ca.gc.space.mrt.sensors.imaging.AbstractCamera;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drawn Camera Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An overlay that has to be drawn onto a camera image.
 * Such overlays are responsible for drawing their representation onto the provided image.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getDrawnCameraOverlay()
 * @model abstract="true"
 * @generated
 */
public interface DrawnCameraOverlay extends CameraOverlay
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Draws the overlay onto the image provided by the camera.
	 * @param camera The camera that provided the image.
	 * @param cameraImage The image onto which the overlay must be drawn.
	 * @param overlayAlignment The alignment of the overlay
	 * @param overlayWidth The width of the overlay.
	 * @param overlayHeight The height of the overlay.
	 * @return The camera image with the overlay drawn on top of it.
	 * <!-- end-model-doc -->
	 * @model unique="false" cameraUnique="false" cameraImageUnique="false" overlayAlignmentUnique="false" overlayWidthUnique="false" overlayHeightUnique="false"
	 * @generated
	 */
  AbstractEImage applyOverlay(AbstractCamera camera, AbstractEImage cameraImage, OverlayAlignment overlayAlignment, int overlayWidth, int overlayHeight);

} // DrawnCameraOverlay
