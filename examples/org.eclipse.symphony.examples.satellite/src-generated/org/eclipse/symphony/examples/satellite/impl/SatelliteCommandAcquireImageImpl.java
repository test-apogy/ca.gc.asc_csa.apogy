/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;
import org.eclipse.symphony.examples.satellite.SatelliteCommandAcquireImage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Command Acquire Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandAcquireImageImpl#getImageOrder <em>Image Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SatelliteCommandAcquireImageImpl extends SatelliteCommandImpl implements SatelliteCommandAcquireImage {
	/**
	 * The cached value of the '{@link #getImageOrder() <em>Image Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageOrder()
	 * @generated
	 * @ordered
	 */
	protected ImageOrder imageOrder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteCommandAcquireImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_COMMAND_ACQUIRE_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageOrder getImageOrder() {
		return imageOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageOrder(ImageOrder newImageOrder, NotificationChain msgs) {
		ImageOrder oldImageOrder = imageOrder;
		imageOrder = newImageOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER, oldImageOrder, newImageOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageOrder(ImageOrder newImageOrder) {
		if (newImageOrder != imageOrder) {
			NotificationChain msgs = null;
			if (imageOrder != null)
				msgs = ((InternalEObject)imageOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER, null, msgs);
			if (newImageOrder != null)
				msgs = ((InternalEObject)newImageOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER, null, msgs);
			msgs = basicSetImageOrder(newImageOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER, newImageOrder, newImageOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER:
				return basicSetImageOrder(null, msgs);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER:
				return getImageOrder();
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER:
				setImageOrder((ImageOrder)newValue);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER:
				setImageOrder((ImageOrder)null);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND_ACQUIRE_IMAGE__IMAGE_ORDER:
				return imageOrder != null;
		}
		return super.eIsSet(featureID);
	}

} //SatelliteCommandAcquireImageImpl
