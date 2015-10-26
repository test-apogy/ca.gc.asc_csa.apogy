/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.imaging.camera.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.imaging.camera.ContrastAndBrightnessFilter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContrastAndBrightnessFilterItemProvider
  extends ImageFilterItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ContrastAndBrightnessFilterItemProvider(AdapterFactory adapterFactory)
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

			addContrastPropertyDescriptor(object);
			addBrightnessPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Contrast feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addContrastPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContrastAndBrightnessFilter_contrast_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContrastAndBrightnessFilter_contrast_feature", "_UI_ContrastAndBrightnessFilter_type"),
				 Symphony__AddonsSensorsImagingCameraPackage.Literals.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FILTER_SETTINGPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Brightness feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addBrightnessPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ContrastAndBrightnessFilter_brightness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ContrastAndBrightnessFilter_brightness_feature", "_UI_ContrastAndBrightnessFilter_type"),
				 Symphony__AddonsSensorsImagingCameraPackage.Literals.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FILTER_SETTINGPropertyCategory"),
				 null));
	}

  /**
	 * This returns ContrastAndBrightnessFilter.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ContrastAndBrightnessFilter"));
	}

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @Override
  public String getText(Object object)
  {
	  return getImageFilterText(object, "_UI_ContrastAndBrightnessFilter_type");
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

		switch (notification.getFeatureID(ContrastAndBrightnessFilter.class)) {
			case Symphony__AddonsSensorsImagingCameraPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST:
			case Symphony__AddonsSensorsImagingCameraPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
