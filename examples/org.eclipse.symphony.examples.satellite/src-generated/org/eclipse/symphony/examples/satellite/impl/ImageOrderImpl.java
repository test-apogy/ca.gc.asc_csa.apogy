/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.ImageOrder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl#getImageCenter <em>Image Center</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.ImageOrderImpl#getCommandedZoom <em>Commanded Zoom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageOrderImpl extends MinimalEObjectImpl.Container implements ImageOrder {
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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

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
	 * The default value of the '{@link #getCommandedZoom() <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedZoom()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMANDED_ZOOM_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getCommandedZoom() <em>Commanded Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandedZoom()
	 * @generated
	 * @ordered
	 */
	protected double commandedZoom = COMMANDED_ZOOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.IMAGE_ORDER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.IMAGE_ORDER__ORDER_ID, oldOrderId, orderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.IMAGE_ORDER__PRIORITY, oldPriority, priority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER, oldImageCenter, newImageCenter);
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
				msgs = ((InternalEObject)imageCenter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER, null, msgs);
			if (newImageCenter != null)
				msgs = ((InternalEObject)newImageCenter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER, null, msgs);
			msgs = basicSetImageCenter(newImageCenter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER, newImageCenter, newImageCenter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedZoom() {
		return commandedZoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedZoom(double newCommandedZoom) {
		double oldCommandedZoom = commandedZoom;
		commandedZoom = newCommandedZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.IMAGE_ORDER__COMMANDED_ZOOM, oldCommandedZoom, commandedZoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER:
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
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__ORDER_ID:
				return getOrderId();
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__PRIORITY:
				return getPriority();
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER:
				return getImageCenter();
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__COMMANDED_ZOOM:
				return getCommandedZoom();
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
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__ORDER_ID:
				setOrderId((Integer)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER:
				setImageCenter((GeographicCoordinates)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__COMMANDED_ZOOM:
				setCommandedZoom((Double)newValue);
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
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER:
				setImageCenter((GeographicCoordinates)null);
				return;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__COMMANDED_ZOOM:
				setCommandedZoom(COMMANDED_ZOOM_EDEFAULT);
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
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__ORDER_ID:
				return orderId != ORDER_ID_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__IMAGE_CENTER:
				return imageCenter != null;
			case EMFEcoreExampleSatellitePackage.IMAGE_ORDER__COMMANDED_ZOOM:
				return commandedZoom != COMMANDED_ZOOM_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (orderId: ");
		result.append(orderId);
		result.append(", priority: ");
		result.append(priority);
		result.append(", commandedZoom: ");
		result.append(commandedZoom);
		result.append(')');
		return result.toString();
	}

} //ImageOrderImpl
