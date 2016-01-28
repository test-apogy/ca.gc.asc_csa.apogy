/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Overlay List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Overlays.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getOverlays <em>Overlays</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#getCameraOverlayList()
 * @model
 * @generated
 */
public interface CameraOverlayList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Camera View Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getOverlayList <em>Overlay List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera View Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The  CameraViewConfiguration containing this CameraOverlayList.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #setCameraViewConfiguration(CameraViewConfiguration)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#getCameraOverlayList_CameraViewConfiguration()
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getOverlayList
	 * @model opposite="overlayList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraViewConfiguration getCameraViewConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList#getCameraViewConfiguration <em>Camera View Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	void setCameraViewConfiguration(CameraViewConfiguration value);

		/**
	 * Returns the value of the '<em><b>Overlays</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getCameraOverlayList <em>Camera Overlay List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of overlay shown onto the camera image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overlays</em>' containment reference list.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage#getCameraOverlayList_Overlays()
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay#getCameraOverlayList
	 * @model opposite="cameraOverlayList" containment="true"
	 * @generated
	 */
  EList<CameraOverlay> getOverlays();

} // CameraOverlayList
