/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import org.eclipse.symphony.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Region Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a rectangular region covered by an image.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage#getRectangularRegionImage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RectangularRegionImage extends RectangularRegionProvider
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the image associated with this region.
	 * @return The image, can be null.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  AbstractEImage getRegionImage();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the image resolution.
	 * @return The resolution, in meters / pixel, or -1 if not defined.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m/pixel'"
	 * @generated
	 */
  double getResolution();

} // RectangularRegionImage
