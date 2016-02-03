package ca.gc.asc_csa.apogy.examples.camera;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.Zoomable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.Camera#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.Camera#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.Camera#isStreamingEnabled <em>Streaming Enabled</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage#getCamera()
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage#getCamera_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Field Of View'"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFov();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.Camera#getFov <em>Fov</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage#getCamera_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.Camera#isInitialized <em>Initialized</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage#getCamera_StreamingEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isStreamingEnabled();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.Camera#isStreamingEnabled <em>Streaming Enabled</em>}' attribute.
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
