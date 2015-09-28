/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.camera;

import ca.gc.space.mrt.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.Zoomable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the abstract representation of a camera,
 * which implicitly has a rectangular frustrum as its
 * field of view.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera#isStreamingEnabled <em>Streaming Enabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage#getCamera()
 * @model abstract="true"
 * @generated
 */
public interface Camera extends AbstractCamera, Zoomable
{

  /**
	 * Returns the value of the '<em><b>Fov</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fov</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The field of view for this particular camera
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fov</em>' containment reference.
	 * @see #setFov(RectangularFrustrumFieldOfView)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage#getCamera_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Field Of View'"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFov();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera#getFov <em>Fov</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fov</em>' containment reference.
	 * @see #getFov()
	 * @generated
	 */
  void setFov(RectangularFrustrumFieldOfView value);

  /**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the camera has been
	 * successfully initialized; initially false
	 * @see #init()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage#getCamera_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

		/**
	 * Returns the value of the '<em><b>Streaming Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not image streaming is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Streaming Enabled</em>' attribute.
	 * @see #setStreamingEnabled(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.EMFEcoreExampleCameraPackage#getCamera_StreamingEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isStreamingEnabled();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.camera.Camera#isStreamingEnabled <em>Streaming Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streaming Enabled</em>' attribute.
	 * @see #isStreamingEnabled()
	 * @generated
	 */
	void setStreamingEnabled(boolean value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation performs any required initialization
	 * operations for the camera.  This is typically called
	 * before any other operation.
	 * @return True if the initialization was successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean init();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation enables or disables image streaming.
	 * When image streaming is enabled, images are updated at about 1 Hz.
	 * <!-- end-model-doc -->
	 * @model unique="false" streamingEnabledUnique="false"
	 * @generated
	 */
	boolean commandStreaming(boolean streamingEnabled);
} // Camera
