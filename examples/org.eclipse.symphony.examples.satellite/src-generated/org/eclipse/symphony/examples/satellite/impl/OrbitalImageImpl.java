/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.awt.image.BufferedImage;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.OrbitalImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbital Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getImageCenter <em>Image Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.OrbitalImageImpl#getDownloadSize <em>Download Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrbitalImageImpl extends MinimalEObjectImpl.Container implements OrbitalImage {
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
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_ID_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected int orderId = ORDER_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImageCenter() <em>Image Center</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageCenter()
	 * @generated
	 * @ordered
	 */
	protected GeographicCoordinates imageCenter;

	/**
	 * The default value of the '{@link #getDownloadSize() <em>Download Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadSize()
	 * @generated
	 * @ordered
	 */
	protected static final int DOWNLOAD_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDownloadSize() <em>Download Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadSize()
	 * @generated
	 * @ordered
	 */
	protected int downloadSize = DOWNLOAD_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrbitalImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.ORBITAL_IMAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderId(int newOrderId) {
		int oldOrderId = orderId;
		orderId = newOrderId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinates getImageCenter() {
		return imageCenter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageCenter(GeographicCoordinates newImageCenter, NotificationChain msgs) {
		GeographicCoordinates oldImageCenter = imageCenter;
		imageCenter = newImageCenter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER, oldImageCenter, newImageCenter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageCenter(GeographicCoordinates newImageCenter) {
		if (newImageCenter != imageCenter) {
			NotificationChain msgs = null;
			if (imageCenter != null)
				msgs = ((InternalEObject)imageCenter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER, null, msgs);
			if (newImageCenter != null)
				msgs = ((InternalEObject)newImageCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER, null, msgs);
			msgs = basicSetImageCenter(newImageCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER, newImageCenter, newImageCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDownloadSize() {
		return downloadSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadSize(int newDownloadSize) {
		int oldDownloadSize = downloadSize;
		downloadSize = newDownloadSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__DOWNLOAD_SIZE, oldDownloadSize, downloadSize));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER:
				return basicSetImageCenter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__WIDTH:
				return getWidth();
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				return getHeight();
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__ORDER_ID:
				return getOrderId();
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER:
				return getImageCenter();
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__DOWNLOAD_SIZE:
				return getDownloadSize();
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
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__ORDER_ID:
				setOrderId((Integer)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER:
				setImageCenter((GeographicCoordinates)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__DOWNLOAD_SIZE:
				setDownloadSize((Integer)newValue);
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
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER:
				setImageCenter((GeographicCoordinates)null);
				return;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__DOWNLOAD_SIZE:
				setDownloadSize(DOWNLOAD_SIZE_EDEFAULT);
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
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__ORDER_ID:
				return orderId != ORDER_ID_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__IMAGE_CENTER:
				return imageCenter != null;
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE__DOWNLOAD_SIZE:
				return downloadSize != DOWNLOAD_SIZE_EDEFAULT;
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
			case EMFEcoreExampleSatellitePackage.ORBITAL_IMAGE___AS_BUFFERED_IMAGE:
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
		result.append(", orderId: ");
		result.append(orderId);
		result.append(", downloadSize: ");
		result.append(downloadSize);
		result.append(')');
		return result.toString();
	}

} //OrbitalImageImpl
