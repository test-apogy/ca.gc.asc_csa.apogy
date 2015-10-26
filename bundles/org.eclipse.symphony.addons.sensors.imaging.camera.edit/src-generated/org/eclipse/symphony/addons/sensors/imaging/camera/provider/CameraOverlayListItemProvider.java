/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraFactory;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.imaging.camera.CameraOverlayList} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CameraOverlayListItemProvider
  extends ItemProviderAdapter
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraOverlayListItemProvider(AdapterFactory adapterFactory)
  {
		super(adapterFactory);
	}

  /**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

  /**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS);
		}
		return childrenFeatures;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

  /**
	 * This returns CameraOverlayList.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CameraOverlayList"));
	}

  /**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String getText(Object object)
  {
		return getString("_UI_CameraOverlayList_type");
	}

  /**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void notifyChanged(Notification notification)
  {
		updateChildren(notification);

		switch (notification.getFeatureID(CameraOverlayList.class)) {
			case Symphony__AddonsSensorsImagingCameraPackage.CAMERA_OVERLAY_LIST__OVERLAYS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

  /**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createEMFFeatureOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createCameraNameOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createImageCountOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createImageFrozenOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createURLImageOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createSymphonyLogoOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createFOVOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createAzimuthElevationFOVOverlay()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__AddonsSensorsImagingCameraPackage.Literals.CAMERA_OVERLAY_LIST__OVERLAYS,
				 Symphony__AddonsSensorsImagingCameraFactory.eINSTANCE.createEMFFeatureAzimuthElevationFOVOverlay()));
	}

  /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
