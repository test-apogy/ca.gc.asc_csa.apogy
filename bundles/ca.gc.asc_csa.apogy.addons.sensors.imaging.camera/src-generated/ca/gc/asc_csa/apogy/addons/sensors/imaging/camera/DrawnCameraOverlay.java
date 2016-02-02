package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;
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

import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

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
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getDrawnCameraOverlay()
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
