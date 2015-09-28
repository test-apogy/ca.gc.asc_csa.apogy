/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.camera;

import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;
import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the data required in order to initialize (or
 * reinitialize) the basic camera implementations.  This will
 * be used by the relevant API adapter, which in this case
 * is {@link CameraSymphonySystemApiAdapter}.
 * @see #CameraSymphonySystemApiAdapter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.camera.CameraData#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.camera.CameraData#getZoom <em>Zoom</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.camera.CameraData#isInitialized <em>Initialized</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage#getCameraData()
 * @model
 * @generated
 */
public interface CameraData extends SymphonyInitializationData
{

  /**
	 * Returns the value of the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current field of view (FOV) of the camera.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fov</em>' containment reference.
	 * @see #setFov(RectangularFrustrumFieldOfView)
	 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage#getCameraData_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertCategory='Camera'"
	 * @generated
	 */
	RectangularFrustrumFieldOfView getFov();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.camera.CameraData#getFov <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' containment reference.
	 * @see #getFov()
	 * @generated
	 */
	void setFov(RectangularFrustrumFieldOfView value);

		/**
	 * Returns the value of the '<em><b>Zoom</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zoom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current zoom level of the camera.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zoom</em>' attribute.
	 * @see #setZoom(double)
	 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage#getCameraData_Zoom()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Camera'"
	 * @generated
	 */
  double getZoom();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.camera.CameraData#getZoom <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom</em>' attribute.
	 * @see #getZoom()
	 * @generated
	 */
  void setZoom(double value);

		/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the camera is initialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.symphony.examples.camera.SymphonyExampleCameraPackage#getCameraData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.camera.CameraData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);
} // CameraData
