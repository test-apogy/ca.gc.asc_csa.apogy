/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;

import org.eclipse.symphony.addons.sensors.imaging.AbstractCamera;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.common.images.AbstractEImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#getCameraToolList <em>Camera Tool List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraTool()
 * @model abstract="true"
 * @generated
 */
public interface CameraTool extends CameraImageAnnotation {
	/**
	 * Returns the value of the '<em><b>Camera Tool List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getTools <em>Tools</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera Tool List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Tool List</em>' container reference.
	 * @see #setCameraToolList(CameraToolList)
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getCameraTool_CameraToolList()
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.CameraToolList#getTools
	 * @model opposite="tools" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraToolList getCameraToolList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraTool#getCameraToolList <em>Camera Tool List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Tool List</em>' container reference.
	 * @see #getCameraToolList()
	 * @generated
	 */
	void setCameraToolList(CameraToolList value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the camera is resolved by the CameraViewConfiguration.
	 * @param camera The AbstractCamera resolved, can be null.
	 * <!-- end-model-doc -->
	 * @model cameraUnique="false"
	 * @generated
	 */
	void initializeCamera(AbstractCamera camera);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when a new ImageSnaphot is received.
	 * @param imageSnapshot The new image snapshot, can be null.
	 * <!-- end-model-doc -->
	 * @model imageSnapshotUnique="false"
	 * @generated
	 */
	void updateImageSnapshot(ImageSnapshot imageSnapshot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the tool is no longer needed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the mouse is moved inside the camera image.
	 * @param cameraImage The current image being displayed.
	 * @param x The absolute position x coordinates of the mouse.
	 * @param y The absolute position y coordinates of the mouse.
	 * <!-- end-model-doc -->
	 * @model cameraImageUnique="false" mouseButtonUnique="false" xUnique="false" yUnique="false"
	 * @generated
	 */
	void mouseMoved(AbstractEImage cameraImage, int mouseButton, int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Method called when the user clicks on the image with the mouse.
	 * @param cameraImage The current image being displayed.
	 * @param mouseButton The mouse button clicked.
	 * @param x The absolute position x coordinates of the pixel selected.
	 * @param y The absolute position y coordinates of the pixel selected.
	 * <!-- end-model-doc -->
	 * @model cameraImageUnique="false" mouseButtonUnique="false" xUnique="false" yUnique="false"
	 * @generated
	 */
	void positionSelected(AbstractEImage cameraImage, int mouseButton, int x, int y);

} // CameraTool
