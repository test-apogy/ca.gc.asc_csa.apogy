/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Command Acquire Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommandAcquireImage#getImageOrder <em>Image Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteCommandAcquireImage()
 * @model
 * @generated
 */
public interface SatelliteCommandAcquireImage extends SatelliteCommand {
	/**
	 * Returns the value of the '<em><b>Image Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Order</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Order</em>' containment reference.
	 * @see #setImageOrder(ImageOrder)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteCommandAcquireImage_ImageOrder()
	 * @model containment="true"
	 * @generated
	 */
	ImageOrder getImageOrder();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteCommandAcquireImage#getImageOrder <em>Image Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Order</em>' containment reference.
	 * @see #getImageOrder()
	 * @generated
	 */
	void setImageOrder(ImageOrder value);

} // SatelliteCommandAcquireImage
