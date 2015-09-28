/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging;

import ca.gc.asc_csa.eclipse.images.core.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectified Image Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage#getRectifiedImageSnapshot()
 * @model
 * @generated
 */
public interface RectifiedImageSnapshot extends ImageSnapshot
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Gets the rectified image.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  AbstractEImage getRectifiedImage();

} // RectifiedImageSnapshot
