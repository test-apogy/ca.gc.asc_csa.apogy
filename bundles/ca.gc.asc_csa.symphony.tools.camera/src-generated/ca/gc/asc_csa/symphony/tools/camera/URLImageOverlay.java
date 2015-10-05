/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera;

import org.eclipse.symphony.common.images.AbstractEImage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Image Overlay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay#getUrl <em>Url</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay#getImageSizePolicy <em>Image Size Policy</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getURLImageOverlay()
 * @model
 * @generated
 */
public interface URLImageOverlay extends ImageCameraOverlay {

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the file containing the image to overlay.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getURLImageOverlay_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Image Size Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.symphony.tools.camera.ImageSizePolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Size Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The image resize policy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Image Size Policy</em>' attribute.
	 * @see ca.gc.asc_csa.symphony.tools.camera.ImageSizePolicy
	 * @see #setImageSizePolicy(ImageSizePolicy)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getURLImageOverlay_ImageSizePolicy()
	 * @model unique="false"
	 * @generated
	 */
	ImageSizePolicy getImageSizePolicy();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay#getImageSizePolicy <em>Image Size Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Size Policy</em>' attribute.
	 * @see ca.gc.asc_csa.symphony.tools.camera.ImageSizePolicy
	 * @see #getImageSizePolicy()
	 * @generated
	 */
	void setImageSizePolicy(ImageSizePolicy value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(AbstractEImage)
	 * @see ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage#getURLImageOverlay_Image()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel child='true' property='Readonly'"
	 * @generated
	 */
	AbstractEImage getImage();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.camera.URLImageOverlay#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(AbstractEImage value);
} // URLImageOverlay
