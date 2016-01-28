/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfigurationList;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.impl.CameraViewConfigurationListImpl#getCameraViewConfigurations <em>Camera View Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraViewConfigurationListImpl extends AbstractToolsListContainerImpl implements CameraViewConfigurationList
{
  /**
	 * The cached value of the '{@link #getCameraViewConfigurations() <em>Camera View Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCameraViewConfigurations()
	 * @generated
	 * @ordered
	 */
  protected EList<CameraViewConfiguration> cameraViewConfigurations;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CameraViewConfigurationListImpl()
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
		return ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<CameraViewConfiguration> getCameraViewConfigurations()
  {
		if (cameraViewConfigurations == null) {
			cameraViewConfigurations = new EObjectContainmentWithInverseEList<CameraViewConfiguration>(CameraViewConfiguration.class, this, ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS, ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__CAMERA_VIEW_CONFIGURATION_LIST);
		}
		return cameraViewConfigurations;
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCameraViewConfigurations()).basicAdd(otherEnd, msgs);
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS:
				return ((InternalEList<?>)getCameraViewConfigurations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS:
				return getCameraViewConfigurations();
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS:
				getCameraViewConfigurations().clear();
				getCameraViewConfigurations().addAll((Collection<? extends CameraViewConfiguration>)newValue);
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS:
				getCameraViewConfigurations().clear();
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
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION_LIST__CAMERA_VIEW_CONFIGURATIONS:
				return cameraViewConfigurations != null && !cameraViewConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CameraViewConfigurationListImpl
