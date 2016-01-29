/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.images;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.images.ImageSize#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.images.ImageSize#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getImageSize()
 * @model
 * @generated
 */
public interface ImageSize extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getImageSize_Width()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.images.ImageSize#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesPackage#getImageSize_Height()
	 * @model default="-1" unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.images.ImageSize#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

} // ImageSize