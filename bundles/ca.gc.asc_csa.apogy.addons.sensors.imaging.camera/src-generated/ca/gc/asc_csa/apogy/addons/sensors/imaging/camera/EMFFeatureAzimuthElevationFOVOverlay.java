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
 * A representation of the model object '<em><b>EMF Feature Azimuth Elevation FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getAzimuthFeatureReference <em>Azimuth Feature Reference</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getElevationFeatureReference <em>Elevation Feature Reference</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getEMFFeatureAzimuthElevationFOVOverlay()
 * @model
 * @generated
 */
public interface EMFFeatureAzimuthElevationFOVOverlay extends AzimuthElevationFOVOverlay {
	/**
	 * Returns the value of the '<em><b>Azimuth Feature Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azimuth Feature Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth Feature Reference</em>' containment reference.
	 * @see #setAzimuthFeatureReference(AzimuthFeatureReference)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getEMFFeatureAzimuthElevationFOVOverlay_AzimuthFeatureReference()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' propertyCategory='FEATURE_CATEGORY'"
	 * @generated
	 */
	AzimuthFeatureReference getAzimuthFeatureReference();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getAzimuthFeatureReference <em>Azimuth Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth Feature Reference</em>' containment reference.
	 * @see #getAzimuthFeatureReference()
	 * @generated
	 */
	void setAzimuthFeatureReference(AzimuthFeatureReference value);

	/**
	 * Returns the value of the '<em><b>Elevation Feature Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Feature Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Feature Reference</em>' containment reference.
	 * @see #setElevationFeatureReference(ElevationFeatureReference)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getEMFFeatureAzimuthElevationFOVOverlay_ElevationFeatureReference()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' propertyCategory='FEATURE_CATEGORY'"
	 * @generated
	 */
	ElevationFeatureReference getElevationFeatureReference();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getElevationFeatureReference <em>Elevation Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Feature Reference</em>' containment reference.
	 * @see #getElevationFeatureReference()
	 * @generated
	 */
	void setElevationFeatureReference(ElevationFeatureReference value);

} // EMFFeatureAzimuthElevationFOVOverlay
