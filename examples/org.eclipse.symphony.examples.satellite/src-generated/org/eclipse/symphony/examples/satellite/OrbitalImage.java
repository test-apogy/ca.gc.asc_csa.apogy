/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbital Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A specialization of AbstractEImage that includes the geographical coordinates of the center of the image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getImageCenter <em>Image Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getDownloadSize <em>Download Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getOrbitalImage()
 * @model
 * @generated
 */
public interface OrbitalImage extends AbstractEImage {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(int)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getOrbitalImage_OrderId()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getOrderId();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(int value);

	/**
	 * Returns the value of the '<em><b>Image Center</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Center</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The GeographicCoordinates of the center of the image.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Center</em>' containment reference.
	 * @see #setImageCenter(GeographicCoordinates)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getOrbitalImage_ImageCenter()
	 * @model containment="true"
	 * @generated
	 */
	GeographicCoordinates getImageCenter();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getImageCenter <em>Image Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Center</em>' containment reference.
	 * @see #getImageCenter()
	 * @generated
	 */
	void setImageCenter(GeographicCoordinates value);

	/**
	 * Returns the value of the '<em><b>Download Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The image download size, in bytes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Download Size</em>' attribute.
	 * @see #setDownloadSize(int)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getOrbitalImage_DownloadSize()
	 * @model default="0" unique="false"
	 * @generated
	 */
	int getDownloadSize();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getDownloadSize <em>Download Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Size</em>' attribute.
	 * @see #getDownloadSize()
	 * @generated
	 */
	void setDownloadSize(int value);

} // OrbitalImage
