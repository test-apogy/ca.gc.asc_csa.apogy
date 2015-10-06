/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URLE Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.URLEImage#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getURLEImage()
 * @model
 * @generated
 */
public interface URLEImage extends AbstractEImage {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getURLEImage_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.images.core.URLEImage#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // URLEImage
