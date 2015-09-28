/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

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
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList#getOverlays <em>Overlays</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraOverlayList()
 * @model
 * @generated
 */
public interface CameraOverlayList extends EObject
{
  /**
	 * Returns the value of the '<em><b>Camera View Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getOverlayList <em>Overlay List</em>}'.
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
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraOverlayList_CameraViewConfiguration()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getOverlayList
	 * @model opposite="overlayList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraViewConfiguration getCameraViewConfiguration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList#getCameraViewConfiguration <em>Camera View Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	void setCameraViewConfiguration(CameraViewConfiguration value);

		/**
	 * Returns the value of the '<em><b>Overlays</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlay}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraOverlay#getCameraOverlayList <em>Camera Overlay List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of overlay shown onto the camera image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overlays</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraOverlayList_Overlays()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraOverlay#getCameraOverlayList
	 * @model opposite="cameraOverlayList" containment="true"
	 * @generated
	 */
  EList<CameraOverlay> getOverlays();

} // CameraOverlayList
