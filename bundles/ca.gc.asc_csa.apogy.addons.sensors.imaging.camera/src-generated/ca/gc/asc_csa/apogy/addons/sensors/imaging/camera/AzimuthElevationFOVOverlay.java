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
 * A representation of the model object '<em><b>Azimuth Elevation FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage#getAzimuthElevationFOVOverlay()
 * @model
 * @generated
 */
public interface AzimuthElevationFOVOverlay extends FOVOverlay {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Change the azimuth of the center of the image.
	 * @param azimuth The azimuth of the center of the image, in radians.
	 * <!-- end-model-doc -->
	 * @model azimuthUnique="false"
	 * @generated
	 */
	void changeAzimuth(double azimuth);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Change the elevation of the center of the image.
	 * @param elevation The elevation of the center of the image, in radians.
	 * <!-- end-model-doc -->
	 * @model elevationUnique="false"
	 * @generated
	 */
	void changeElevation(double elevation);

} // AzimuthElevationFOVOverlay
