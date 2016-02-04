package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Frozen Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay#isFrozen <em>Frozen</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay#getExpectedImageUpdatePeriod <em>Expected Image Update Period</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay#getFrozenMessage <em>Frozen Message</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageFrozenOverlay()
 * @model
 * @generated
 */
public interface ImageFrozenOverlay extends AbstractTextOverlay {
	/**
	 * Returns the value of the '<em><b>Frozen</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Indicates whether or not the image is frozen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frozen</em>' attribute.
	 * @see #setFrozen(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageFrozenOverlay_Frozen()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FROZEN_PROPERTIES' property='Readonly'"
	 * @generated
	 */
	boolean isFrozen();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay#isFrozen <em>Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frozen</em>' attribute.
	 * @see #isFrozen()
	 * @generated
	 */
	void setFrozen(boolean value);

	/**
	 * Returns the value of the '<em><b>Expected Image Update Period</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The expected image update period, in seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Image Update Period</em>' attribute.
	 * @see #setExpectedImageUpdatePeriod(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageFrozenOverlay_ExpectedImageUpdatePeriod()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FROZEN_PROPERTIES' apogy_units='s'"
	 * @generated
	 */
	double getExpectedImageUpdatePeriod();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay#getExpectedImageUpdatePeriod <em>Expected Image Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Image Update Period</em>' attribute.
	 * @see #getExpectedImageUpdatePeriod()
	 * @generated
	 */
	void setExpectedImageUpdatePeriod(double value);

	/**
	 * Returns the value of the '<em><b>Frozen Message</b></em>' attribute.
	 * The default value is <code>"Frozen"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frozen Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The message to display when the image freezes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Frozen Message</em>' attribute.
	 * @see #setFrozenMessage(String)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getImageFrozenOverlay_FrozenMessage()
	 * @model default="Frozen" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='FROZEN_PROPERTIES'"
	 * @generated
	 */
	String getFrozenMessage();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay#getFrozenMessage <em>Frozen Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frozen Message</em>' attribute.
	 * @see #getFrozenMessage()
	 * @generated
	 */
	void setFrozenMessage(String value);

} // ImageFrozenOverlay
