/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.images;

import java.awt.image.BufferedImage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EImage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.images.EImage#getImageContent <em>Image Content</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.images.Symphony__CommonImagesPackage#getEImage()
 * @model
 * @generated
 */
public interface EImage extends AbstractEImage {
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
	 * @see org.eclipse.symphony.common.images.Symphony__CommonImagesPackage#getEImage_ImageContent()
	 * @model unique="false" dataType="org.eclipse.symphony.common.images.BufferedImage"
	 * @generated
	 */
	BufferedImage getImageContent();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.images.EImage#getImageContent <em>Image Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Content</em>' attribute.
	 * @see #getImageContent()
	 * @generated
	 */
	void setImageContent(BufferedImage value);

} // EImage
