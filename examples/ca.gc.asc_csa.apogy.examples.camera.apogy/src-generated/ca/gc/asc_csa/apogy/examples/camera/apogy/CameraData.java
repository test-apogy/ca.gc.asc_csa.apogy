package ca.gc.asc_csa.apogy.examples.camera.apogy;
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
import ca.gc.asc_csa.apogy.core.ApogyInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the data required in order to initialize (or
 * reinitialize) the basic camera implementations.  This will
 * be used by the relevant API adapter, which in this case
 * is {@link CameraApogySystemApiAdapter}.
 * @see #CameraApogySystemApiAdapter
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData#getFov <em>Fov</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData#getZoom <em>Zoom</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData#isInitialized <em>Initialized</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getCameraData()
 * @model
 * @generated
 */
public interface CameraData extends ApogyInitializationData
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getCameraData_Fov()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertCategory='Camera'"
	 * @generated
	 */
	RectangularFrustrumFieldOfView getFov();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData#getFov <em>Fov</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getCameraData_Zoom()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Camera'"
	 * @generated
	 */
  double getZoom();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData#getZoom <em>Zoom</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.camera.apogy.ApogyExamplesCameraApogyPackage#getCameraData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.camera.apogy.CameraData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);
} // CameraData
