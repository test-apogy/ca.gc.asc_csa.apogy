/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging;

import org.eclipse.symphony.addons.sensors.Sensor;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;

import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.AbstractCamera#getLatestImageSnapshot <em>Latest Image Snapshot</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage#getAbstractCamera()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCamera extends Sensor, Named
{

  /**
	 * Returns the value of the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latest Image Snapshot</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The last ImageSnapshot acquired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Image Snapshot</em>' reference.
	 * @see #setLatestImageSnapshot(ImageSnapshot)
	 * @see org.eclipse.symphony.addons.sensors.imaging.MRTSensorsImagingPackage#getAbstractCamera_LatestImageSnapshot()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' propertyCategory='CAMERA_PROPERTIES'"
	 * @generated
	 */
  ImageSnapshot getLatestImageSnapshot();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.AbstractCamera#getLatestImageSnapshot <em>Latest Image Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Image Snapshot</em>' reference.
	 * @see #getLatestImageSnapshot()
	 * @generated
	 */
  void setLatestImageSnapshot(ImageSnapshot value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Command the camera to take a snapshot.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  ImageSnapshot takeSnapshot();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Gets the current field of view of the camera.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFieldOfView();
} // AbstractCamera
