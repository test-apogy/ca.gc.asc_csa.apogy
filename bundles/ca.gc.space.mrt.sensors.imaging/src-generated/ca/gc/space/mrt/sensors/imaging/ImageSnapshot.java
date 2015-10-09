/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package ca.gc.space.mrt.sensors.imaging;

import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.topology.GroupNode;

import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.imaging.ImageSnapshot#getFieldOfView <em>Field Of View</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.imaging.ImageSnapshot#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage#getImageSnapshot()
 * @model
 * @generated
 */
public interface ImageSnapshot extends GroupNode, Timed
{
  /**
	 * Returns the value of the '<em><b>Field Of View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The field Of View associated with the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Field Of View</em>' containment reference.
	 * @see #setFieldOfView(RectangularFrustrumFieldOfView)
	 * @see ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage#getImageSnapshot_FieldOfView()
	 * @model containment="true"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFieldOfView();

  /**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.imaging.ImageSnapshot#getFieldOfView <em>Field Of View</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Of View</em>' containment reference.
	 * @see #getFieldOfView()
	 * @generated
	 */
  void setFieldOfView(RectangularFrustrumFieldOfView value);

  /**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The image
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(AbstractEImage)
	 * @see ca.gc.space.mrt.sensors.imaging.MRTSensorsImagingPackage#getImageSnapshot_Image()
	 * @model containment="true"
	 * @generated
	 */
  AbstractEImage getImage();

  /**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.imaging.ImageSnapshot#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
  void setImage(AbstractEImage value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the horizontal angular position associated with a specified horizontal pixel position in the image.
	 * This method should be overridden by sub-classes to take into account camera specific mapping.
	 * @param horizontalPixelPosition The horizontal pixel position (positive toward the right).
	 * @return The horizontal angle, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" horizontalPixelPositionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	double convertToHorizontalAngle(int horizontalPixelPosition);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the vertical angular position associated with a specified vertical pixel position in the image.
	 * This method should be overridden by sub-classes to take into account camera specific mapping.
	 * @param verticalPixelPosition The vertical pixel position (positive toward the bottom of the image).
	 * @return The horizontal angle, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" verticalPixelPositionUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	double convertToVerticalAngle(int verticalPixelPosition);

} // ImageSnapshot
