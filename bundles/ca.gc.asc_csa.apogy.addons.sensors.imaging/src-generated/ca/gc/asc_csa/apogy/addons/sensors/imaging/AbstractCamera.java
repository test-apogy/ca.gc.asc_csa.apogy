package ca.gc.asc_csa.apogy.addons.sensors.imaging;
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

import ca.gc.asc_csa.apogy.addons.sensors.Sensor;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#getLatestImageSnapshot <em>Latest Image Snapshot</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage#getAbstractCamera()
 * @model abstract="true"
 * @generated
 */
public interface AbstractCamera extends Sensor, Named
{

  /**
	 * Returns the value of the '<em><b>Latest Image Snapshot</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Latest Image Snapshot</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * The last ImageSnapshot acquired.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Latest Image Snapshot</em>' reference.
	 * @see #setLatestImageSnapshot(ImageSnapshot)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.ApogyAddonsSensorsImagingPackage#getAbstractCamera_LatestImageSnapshot()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' propertyCategory='CAMERA_PROPERTIES'"
	 * @generated
	 */
  ImageSnapshot getLatestImageSnapshot();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.AbstractCamera#getLatestImageSnapshot <em>Latest Image Snapshot</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Image Snapshot</em>' reference.
	 * @see #getLatestImageSnapshot()
	 * @generated
	 */
  void setLatestImageSnapshot(ImageSnapshot value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Command the camera to take a snapshot.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  ImageSnapshot takeSnapshot();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Gets the current field of view of the camera.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  RectangularFrustrumFieldOfView getFieldOfView();
} // AbstractCamera
