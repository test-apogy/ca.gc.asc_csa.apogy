/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core;

import java.awt.image.BufferedImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EImage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.EImage#getImageContent <em>Image Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getEImage()
 * @model
 * @generated
 */
public interface EImage extends AbstractEImage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2011";

	/**
	 * Returns the value of the '<em><b>Image Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Content</em>' attribute.
	 * @see #setImageContent(BufferedImage)
	 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getEImage_ImageContent()
	 * @model dataType="ca.gc.asc_csa.eclipse.images.core.BufferedImage"
	 * @generated
	 */
	BufferedImage getImageContent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.images.core.EImage#getImageContent <em>Image Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Content</em>' attribute.
	 * @see #getImageContent()
	 * @generated
	 */
	void setImageContent(BufferedImage value);

} // EImage
