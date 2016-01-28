/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList;
import org.eclipse.symphony.addons.sensors.imaging.camera.OverlayAlignment;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Overlay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayImpl#getCameraOverlayList <em>Camera Overlay List</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.CameraOverlayImpl#getOverlayAlignment <em>Overlay Alignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CameraOverlayImpl extends CameraImageAnnotationImpl implements CameraOverlay
{
  /**
	 * The default value of the '{@link #getOverlayAlignment() <em>Overlay Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOverlayAlignment()
	 * @generated
	 * @ordered
	 */
  protected static final OverlayAlignment OVERLAY_ALIGNMENT_EDEFAULT = OverlayAlignment.CENTER;

  /**
	 * The cached value of the '{@link #getOverlayAlignment() <em>Overlay Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOverlayAlignment()
	 * @generated
	 * @ordered
	 */
  protected OverlayAlignment overlayAlignment = OVERLAY_ALIGNMENT_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraOverlayImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraOverlayList getCameraOverlayList() {
		if (eContainerFeatureID() != Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST) return null;
		return (CameraOverlayList)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraOverlayList basicGetCameraOverlayList() {
		if (eContainerFeatureID() != Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST) return null;
		return (CameraOverlayList)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraOverlayList(CameraOverlayList newCameraOverlayList, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCameraOverlayList, Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraOverlayList(CameraOverlayList newCameraOverlayList) {
		if (newCameraOverlayList != eInternalContainer() || (eContainerFeatureID() != Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST && newCameraOverlayList != null)) {
			if (EcoreUtil.isAncestor(this, newCameraOverlayList))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCameraOverlayList != null)
				msgs = ((InternalEObject)newCameraOverlayList).eInverseAdd(this, Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY_LIST__OVERLAYS, CameraOverlayList.class, msgs);
			msgs = basicSetCameraOverlayList(newCameraOverlayList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST, newCameraOverlayList, newCameraOverlayList));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OverlayAlignment getOverlayAlignment()
  {
		return overlayAlignment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOverlayAlignment(OverlayAlignment newOverlayAlignment)
  {
		OverlayAlignment oldOverlayAlignment = overlayAlignment;
		overlayAlignment = newOverlayAlignment == null ? OVERLAY_ALIGNMENT_EDEFAULT : newOverlayAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__OVERLAY_ALIGNMENT, oldOverlayAlignment, overlayAlignment));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCameraOverlayList((CameraOverlayList)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				return basicSetCameraOverlayList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				return eInternalContainer().eInverseRemove(this, Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY_LIST__OVERLAYS, CameraOverlayList.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				if (resolve) return getCameraOverlayList();
				return basicGetCameraOverlayList();
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__OVERLAY_ALIGNMENT:
				return getOverlayAlignment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				setCameraOverlayList((CameraOverlayList)newValue);
				return;
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__OVERLAY_ALIGNMENT:
				setOverlayAlignment((OverlayAlignment)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				setCameraOverlayList((CameraOverlayList)null);
				return;
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__OVERLAY_ALIGNMENT:
				setOverlayAlignment(OVERLAY_ALIGNMENT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST:
				return basicGetCameraOverlayList() != null;
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY__OVERLAY_ALIGNMENT:
				return overlayAlignment != OVERLAY_ALIGNMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (overlayAlignment: ");
		result.append(overlayAlignment);
		result.append(')');
		return result.toString();
	}

} //CameraOverlayImpl
