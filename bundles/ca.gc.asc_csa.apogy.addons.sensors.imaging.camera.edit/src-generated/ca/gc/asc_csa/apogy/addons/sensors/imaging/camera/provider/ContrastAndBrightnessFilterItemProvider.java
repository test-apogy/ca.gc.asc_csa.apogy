package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.provider;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ContrastAndBrightnessFilter;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ContrastAndBrightnessFilter} object.
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
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST,
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
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS,
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
			case ApogyAddonsSensorsImagingCameraPackage.CONTRAST_AND_BRIGHTNESS_FILTER__CONTRAST:
			case ApogyAddonsSensorsImagingCameraPackage.CONTRAST_AND_BRIGHTNESS_FILTER__BRIGHTNESS:
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
