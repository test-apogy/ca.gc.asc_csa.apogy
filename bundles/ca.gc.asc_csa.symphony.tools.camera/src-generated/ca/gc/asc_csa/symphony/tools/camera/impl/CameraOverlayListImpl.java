/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.camera.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.symphony.tools.camera.CameraOverlay;
import ca.gc.asc_csa.symphony.tools.camera.CameraOverlayList;
import ca.gc.asc_csa.symphony.tools.camera.CameraViewConfiguration;
import ca.gc.asc_csa.symphony.tools.camera.SymphonyCameraToolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Overlay List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraOverlayListImpl#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.camera.impl.CameraOverlayListImpl#getOverlays <em>Overlays</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CameraOverlayListImpl extends MinimalEObjectImpl.Container implements CameraOverlayList
{
  /**
	 * The cached value of the '{@link #getOverlays() <em>Overlays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOverlays()
	 * @generated
	 * @ordered
	 */
  protected EList<CameraOverlay> overlays;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraOverlayListImpl()
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
		return SymphonyCameraToolsPackage.Literals.CAMERA_OVERLAY_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewConfiguration getCameraViewConfiguration() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION) return null;
		return (CameraViewConfiguration)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewConfiguration basicGetCameraViewConfiguration() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION) return null;
		return (CameraViewConfiguration)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraViewConfiguration(CameraViewConfiguration newCameraViewConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCameraViewConfiguration, SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraViewConfiguration(CameraViewConfiguration newCameraViewConfiguration) {
		if (newCameraViewConfiguration != eInternalContainer() || (eContainerFeatureID() != SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION && newCameraViewConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newCameraViewConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCameraViewConfiguration != null)
				msgs = ((InternalEObject)newCameraViewConfiguration).eInverseAdd(this, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST, CameraViewConfiguration.class, msgs);
			msgs = basicSetCameraViewConfiguration(newCameraViewConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION, newCameraViewConfiguration, newCameraViewConfiguration));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<CameraOverlay> getOverlays()
  {
		if (overlays == null) {
			overlays = new EObjectContainmentWithInverseEList<CameraOverlay>(CameraOverlay.class, this, SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS, SymphonyCameraToolsPackage.CAMERA_OVERLAY__CAMERA_OVERLAY_LIST);
		}
		return overlays;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCameraViewConfiguration((CameraViewConfiguration)otherEnd, msgs);
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOverlays()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				return basicSetCameraViewConfiguration(null, msgs);
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				return ((InternalEList<?>)getOverlays()).basicRemove(otherEnd, msgs);
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
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				return eInternalContainer().eInverseRemove(this, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST, CameraViewConfiguration.class, msgs);
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
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				if (resolve) return getCameraViewConfiguration();
				return basicGetCameraViewConfiguration();
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				return getOverlays();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				setCameraViewConfiguration((CameraViewConfiguration)newValue);
				return;
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				getOverlays().clear();
				getOverlays().addAll((Collection<? extends CameraOverlay>)newValue);
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
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				setCameraViewConfiguration((CameraViewConfiguration)null);
				return;
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				getOverlays().clear();
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
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__CAMERA_VIEW_CONFIGURATION:
				return basicGetCameraViewConfiguration() != null;
			case SymphonyCameraToolsPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				return overlays != null && !overlays.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CameraOverlayListImpl
