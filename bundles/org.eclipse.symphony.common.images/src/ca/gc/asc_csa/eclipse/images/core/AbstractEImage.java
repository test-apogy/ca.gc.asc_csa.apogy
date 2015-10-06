/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core;

import java.awt.image.BufferedImage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract EImage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.AbstractEImage#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.AbstractEImage#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getAbstractEImage()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractEImage extends EObject {
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
	 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getAbstractEImage_Width()
	 * @model default="-1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_INFORMATION'"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.images.core.AbstractEImage#getWidth <em>Width</em>}' attribute.
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
	 * @see ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage#getAbstractEImage_Height()
	 * @model default="-1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='IMAGE_INFORMATION'"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.images.core.AbstractEImage#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.images.core.BufferedImage" unique="false"
	 * @generated
	 */
	BufferedImage asBufferedImage();

} // AbstractEImage
