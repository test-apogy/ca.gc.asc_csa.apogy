/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraViewConfiguration;
import org.eclipse.symphony.addons.sensors.imaging.camera.FilterList;
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.SymphonyCameraToolsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.FilterListImpl#getCameraViewConfiguration <em>Camera View Configuration</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.imaging.camera.impl.FilterListImpl#getImageFilters <em>Image Filters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterListImpl extends MinimalEObjectImpl.Container implements FilterList
{
  /**
	 * The cached value of the '{@link #getImageFilters() <em>Image Filters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getImageFilters()
	 * @generated
	 * @ordered
	 */
  protected EList<ImageFilter> imageFilters;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected FilterListImpl()
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
		return SymphonyCameraToolsPackage.Literals.FILTER_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewConfiguration getCameraViewConfiguration() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION) return null;
		return (CameraViewConfiguration)eContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraViewConfiguration basicGetCameraViewConfiguration() {
		if (eContainerFeatureID() != SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION) return null;
		return (CameraViewConfiguration)eInternalContainer();
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCameraViewConfiguration(CameraViewConfiguration newCameraViewConfiguration, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCameraViewConfiguration, SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION, msgs);
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraViewConfiguration(CameraViewConfiguration newCameraViewConfiguration) {
		if (newCameraViewConfiguration != eInternalContainer() || (eContainerFeatureID() != SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION && newCameraViewConfiguration != null)) {
			if (EcoreUtil.isAncestor(this, newCameraViewConfiguration))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCameraViewConfiguration != null)
				msgs = ((InternalEObject)newCameraViewConfiguration).eInverseAdd(this, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST, CameraViewConfiguration.class, msgs);
			msgs = basicSetCameraViewConfiguration(newCameraViewConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION, newCameraViewConfiguration, newCameraViewConfiguration));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ImageFilter> getImageFilters()
  {
		if (imageFilters == null) {
			imageFilters = new EObjectContainmentEList<ImageFilter>(ImageFilter.class, this, SymphonyCameraToolsPackage.FILTER_LIST__IMAGE_FILTERS);
		}
		return imageFilters;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCameraViewConfiguration((CameraViewConfiguration)otherEnd, msgs);
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
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				return basicSetCameraViewConfiguration(null, msgs);
			case SymphonyCameraToolsPackage.FILTER_LIST__IMAGE_FILTERS:
				return ((InternalEList<?>)getImageFilters()).basicRemove(otherEnd, msgs);
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
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				return eInternalContainer().eInverseRemove(this, SymphonyCameraToolsPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST, CameraViewConfiguration.class, msgs);
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
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				if (resolve) return getCameraViewConfiguration();
				return basicGetCameraViewConfiguration();
			case SymphonyCameraToolsPackage.FILTER_LIST__IMAGE_FILTERS:
				return getImageFilters();
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
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				setCameraViewConfiguration((CameraViewConfiguration)newValue);
				return;
			case SymphonyCameraToolsPackage.FILTER_LIST__IMAGE_FILTERS:
				getImageFilters().clear();
				getImageFilters().addAll((Collection<? extends ImageFilter>)newValue);
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
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				setCameraViewConfiguration((CameraViewConfiguration)null);
				return;
			case SymphonyCameraToolsPackage.FILTER_LIST__IMAGE_FILTERS:
				getImageFilters().clear();
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
			case SymphonyCameraToolsPackage.FILTER_LIST__CAMERA_VIEW_CONFIGURATION:
				return basicGetCameraViewConfiguration() != null;
			case SymphonyCameraToolsPackage.FILTER_LIST__IMAGE_FILTERS:
				return imageFilters != null && !imageFilters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FilterListImpl
