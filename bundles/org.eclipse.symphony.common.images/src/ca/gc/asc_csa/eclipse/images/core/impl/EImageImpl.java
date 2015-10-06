/**
 * Canadian Space Agency 2011
 */
package ca.gc.asc_csa.eclipse.images.core.impl;

import ca.gc.asc_csa.eclipse.images.core.EImage;
import ca.gc.asc_csa.eclipse.images.core.ImagesCorePackage;

import java.awt.image.BufferedImage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EImage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.impl.EImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.impl.EImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.images.core.impl.EImageImpl#getImageContent <em>Image Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EImageImpl extends MinimalEObjectImpl.Container implements EImage {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageContent() <em>Image Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageContent()
	 * @generated
	 * @ordered
	 */
	protected static final BufferedImage IMAGE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageContent() <em>Image Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageContent()
	 * @generated
	 * @ordered
	 */
	protected BufferedImage imageContent = IMAGE_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImagesCorePackage.Literals.EIMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagesCorePackage.EIMAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagesCorePackage.EIMAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedImage getImageContent() {
		return imageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageContent(BufferedImage newImageContent) {
		BufferedImage oldImageContent = imageContent;
		imageContent = newImageContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImagesCorePackage.EIMAGE__IMAGE_CONTENT, oldImageContent, imageContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferedImage asBufferedImage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImagesCorePackage.EIMAGE__WIDTH:
				return getWidth();
			case ImagesCorePackage.EIMAGE__HEIGHT:
				return getHeight();
			case ImagesCorePackage.EIMAGE__IMAGE_CONTENT:
				return getImageContent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImagesCorePackage.EIMAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ImagesCorePackage.EIMAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ImagesCorePackage.EIMAGE__IMAGE_CONTENT:
				setImageContent((BufferedImage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImagesCorePackage.EIMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ImagesCorePackage.EIMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ImagesCorePackage.EIMAGE__IMAGE_CONTENT:
				setImageContent(IMAGE_CONTENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImagesCorePackage.EIMAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ImagesCorePackage.EIMAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ImagesCorePackage.EIMAGE__IMAGE_CONTENT:
				return IMAGE_CONTENT_EDEFAULT == null ? imageContent != null : !IMAGE_CONTENT_EDEFAULT.equals(imageContent);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ImagesCorePackage.EIMAGE___AS_BUFFERED_IMAGE:
				return asBufferedImage();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", imageContent: ");
		result.append(imageContent);
		result.append(')');
		return result.toString();
	}

} //EImageImpl
