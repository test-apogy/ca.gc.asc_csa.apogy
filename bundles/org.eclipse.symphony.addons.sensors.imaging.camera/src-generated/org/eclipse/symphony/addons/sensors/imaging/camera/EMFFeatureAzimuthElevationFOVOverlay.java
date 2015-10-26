/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Feature Azimuth Elevation FOV Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getAzimuthFeatureReference <em>Azimuth Feature Reference</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getElevationFeatureReference <em>Elevation Feature Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureAzimuthElevationFOVOverlay()
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
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureAzimuthElevationFOVOverlay_AzimuthFeatureReference()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' propertyCategory='FEATURE_CATEGORY'"
	 * @generated
	 */
	AzimuthFeatureReference getAzimuthFeatureReference();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getAzimuthFeatureReference <em>Azimuth Feature Reference</em>}' containment reference.
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
	 * @see org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage#getEMFFeatureAzimuthElevationFOVOverlay_ElevationFeatureReference()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' propertyCategory='FEATURE_CATEGORY'"
	 * @generated
	 */
	ElevationFeatureReference getElevationFeatureReference();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.imaging.camera.EMFFeatureAzimuthElevationFOVOverlay#getElevationFeatureReference <em>Elevation Feature Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Feature Reference</em>' containment reference.
	 * @see #getElevationFeatureReference()
	 * @generated
	 */
	void setElevationFeatureReference(ElevationFeatureReference value);

} // EMFFeatureAzimuthElevationFOVOverlay
