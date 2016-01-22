/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbital Image Constellation Downlink Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a {@link AbstractDownlinkItem} that contains an {@link OrbitalImage}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.OrbitalImageConstellationDownlinkItem#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getOrbitalImageConstellationDownlinkItem()
 * @model
 * @generated
 */
public interface OrbitalImageConstellationDownlinkItem extends AbstractConstellationDownlinkItem {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' containment reference.
	 * @see #setImage(OrbitalImage)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getOrbitalImageConstellationDownlinkItem_Image()
	 * @model containment="true"
	 * @generated
	 */
	OrbitalImage getImage();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.OrbitalImageConstellationDownlinkItem#getImage <em>Image</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' containment reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(OrbitalImage value);

} // OrbitalImageConstellationDownlinkItem
