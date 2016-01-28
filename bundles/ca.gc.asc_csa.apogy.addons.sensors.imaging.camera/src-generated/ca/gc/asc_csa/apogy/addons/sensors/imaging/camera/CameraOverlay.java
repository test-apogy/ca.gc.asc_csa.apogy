/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  An overlay displayed on top of a camera image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getCameraOverlayList <em>Camera Overlay List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getOverlayAlignment <em>Overlay Alignment</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#getCameraOverlay()
 * @model abstract="true"
 * @generated
 */
public interface CameraOverlay extends CameraImageAnnotation
{

  /**
	 * Returns the value of the '<em><b>Camera Overlay List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getOverlays <em>Overlays</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera Overlay List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The  CameraOverlayList containing this CameraOverlay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera Overlay List</em>' container reference.
	 * @see #setCameraOverlayList(CameraOverlayList)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#getCameraOverlay_CameraOverlayList()
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getOverlays
	 * @model opposite="overlays" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraOverlayList getCameraOverlayList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getCameraOverlayList <em>Camera Overlay List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Overlay List</em>' container reference.
	 * @see #getCameraOverlayList()
	 * @generated
	 */
	void setCameraOverlayList(CameraOverlayList value);

		/**
	 * Returns the value of the '<em><b>Overlay Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Where the overlay should be shown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overlay Alignment</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment
	 * @see #setOverlayAlignment(OverlayAlignment)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#getCameraOverlay_OverlayAlignment()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='OVERLAY_POSITION_PROPERTIES'"
	 * @generated
	 */
  OverlayAlignment getOverlayAlignment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getOverlayAlignment <em>Overlay Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay Alignment</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment
	 * @see #getOverlayAlignment()
	 * @generated
	 */
  void setOverlayAlignment(OverlayAlignment value);

} // CameraOverlay
