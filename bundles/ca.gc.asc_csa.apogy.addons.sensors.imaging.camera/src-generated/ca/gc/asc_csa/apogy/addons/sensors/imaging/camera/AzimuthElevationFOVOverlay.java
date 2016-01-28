/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera;


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
