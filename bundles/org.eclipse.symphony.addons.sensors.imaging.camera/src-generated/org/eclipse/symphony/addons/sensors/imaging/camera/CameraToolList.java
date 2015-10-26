/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Tool List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getTools <em>Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraToolList()
 * @model
 * @generated
 */
public interface CameraToolList extends EObject {
	/**
	 * Returns the value of the '<em><b>Camera View Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getToolList <em>Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera View Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The CameraViewConfiguration containing this CameraToolList.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #setCameraViewConfiguration(CameraViewConfiguration)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraToolList_CameraViewConfiguration()
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration#getToolList
	 * @model opposite="toolList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraViewConfiguration getCameraViewConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getCameraViewConfiguration <em>Camera View Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	void setCameraViewConfiguration(CameraViewConfiguration value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#getCameraToolList <em>Camera Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of overlay shown onto the camera image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraToolList_Tools()
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#getCameraToolList
	 * @model opposite="cameraToolList" containment="true"
	 * @generated
	 */
	EList<CameraTool> getTools();

} // CameraToolList
