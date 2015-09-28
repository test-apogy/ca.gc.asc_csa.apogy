/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

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
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraToolList#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.CameraToolList#getTools <em>Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraToolList()
 * @model
 * @generated
 */
public interface CameraToolList extends EObject {
	/**
	 * Returns the value of the '<em><b>Camera View Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getToolList <em>Tool List</em>}'.
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
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraToolList_CameraViewConfiguration()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration#getToolList
	 * @model opposite="toolList" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	CameraViewConfiguration getCameraViewConfiguration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.CameraToolList#getCameraViewConfiguration <em>Camera View Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera View Configuration</em>' container reference.
	 * @see #getCameraViewConfiguration()
	 * @generated
	 */
	void setCameraViewConfiguration(CameraViewConfiguration value);

	/**
	 * Returns the value of the '<em><b>Tools</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.tools.camera.CameraTool}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.symphony.tools.camera.CameraTool#getCameraToolList <em>Camera Tool List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The list of overlay shown onto the camera image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tools</em>' containment reference list.
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getCameraToolList_Tools()
	 * @see ca.gc.asc_csa.symphony.tools.camera.CameraTool#getCameraToolList
	 * @model opposite="cameraToolList" containment="true"
	 * @generated
	 */
	EList<CameraTool> getTools();

} // CameraToolList
