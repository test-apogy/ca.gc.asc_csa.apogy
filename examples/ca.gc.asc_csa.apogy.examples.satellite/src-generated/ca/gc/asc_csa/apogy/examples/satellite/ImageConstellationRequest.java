/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.symphony.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Constellation Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that documents a request to take an orbital image at a specific location.
 * It also serves to store the status and the image obtained if any.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.ImageConstellationRequest#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getImageConstellationRequest()
 * @model
 * @generated
 */
public interface ImageConstellationRequest extends AbstractConstellationRequest, GeographicCoordinates {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the {@link OrbitalImage} if the {@link ImageConstellationRequest} was successfully processed and retrieved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(OrbitalImage)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getImageConstellationRequest_Image()
	 * @model containment="true"
	 * @generated
	 */
	OrbitalImage getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.ImageConstellationRequest#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(OrbitalImage value);

} // ImageConstellationRequest
