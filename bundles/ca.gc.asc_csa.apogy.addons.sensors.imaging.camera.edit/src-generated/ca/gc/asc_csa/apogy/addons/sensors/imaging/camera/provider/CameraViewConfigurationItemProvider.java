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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraFactory;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.provider.VariableFeatureReferenceItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.CameraViewConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CameraViewConfigurationItemProvider
  extends VariableFeatureReferenceItemProvider
{
  /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CameraViewConfigurationItemProvider(AdapterFactory adapterFactory)
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

			addDescriptionPropertyDescriptor(object);
			addCameraPropertyDescriptor(object);
			addImageWidthPropertyDescriptor(object);
			addImageHeightPropertyDescriptor(object);
			addImageCountPropertyDescriptor(object);
			addDisplayRectifiedImagePropertyDescriptor(object);
			addImageAutoSaveEnablePropertyDescriptor(object);
			addSaveImageWithOverlaysPropertyDescriptor(object);
			addImageAutoSaveFolderPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

  /**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDescriptionPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Camera feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addCameraPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_camera_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_camera_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__CAMERA,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

  /**
	 * This adds a property descriptor for the Image Width feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addImageWidthPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_imageWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_imageWidth_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_DISPLAY_SETTINGSPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Image Height feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addImageHeightPropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_imageHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_imageHeight_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_DISPLAY_SETTINGSPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Image Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_imageCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_imageCount_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

		/**
	 * This adds a property descriptor for the Display Rectified Image feature.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void addDisplayRectifiedImagePropertyDescriptor(Object object)
  {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_displayRectifiedImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_displayRectifiedImage_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_IMAGE_DISPLAY_SETTINGSPropertyCategory"),
				 null));
	}

  /**
	 * This adds a property descriptor for the Image Auto Save Enable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageAutoSaveEnablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_imageAutoSaveEnable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_imageAutoSaveEnable_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_IMAGE_AUTOSAVE_SETTINGSPropertyCategory"),
				 null));
	}

		/**
	 * This adds a property descriptor for the Save Image With Overlays feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaveImageWithOverlaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_saveImageWithOverlays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_saveImageWithOverlays_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_IMAGE_AUTOSAVE_SETTINGSPropertyCategory"),
				 null));
	}

		/**
	 * This adds a property descriptor for the Image Auto Save Folder Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImageAutoSaveFolderPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CameraViewConfiguration_imageAutoSaveFolderPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CameraViewConfiguration_imageAutoSaveFolderPath_feature", "_UI_CameraViewConfiguration_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_IMAGE_AUTOSAVE_SETTINGSPropertyCategory"),
				 null));
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
			childrenFeatures.add(ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST);
			childrenFeatures.add(ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__TOOL_LIST);
			childrenFeatures.add(ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__FILTER_LIST);
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
	 * This returns CameraViewConfiguration.gif.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object getImage(Object object)
  {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CameraViewConfiguration"));
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
		String label = ((CameraViewConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CameraViewConfiguration_type") :
			getString("_UI_CameraViewConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(CameraViewConfiguration.class)) {
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__DESCRIPTION:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_WIDTH:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_HEIGHT:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_COUNT:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__DISPLAY_RECTIFIED_IMAGE:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_ENABLE:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__SAVE_IMAGE_WITH_OVERLAYS:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__IMAGE_AUTO_SAVE_FOLDER_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__TOOL_LIST:
			case ApogyAddonsSensorsImagingCameraPackage.CAMERA_VIEW_CONFIGURATION__FILTER_LIST:
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
				(ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__OVERLAY_LIST,
				 ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createCameraOverlayList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__TOOL_LIST,
				 ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createCameraToolList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyAddonsSensorsImagingCameraPackage.Literals.CAMERA_VIEW_CONFIGURATION__FILTER_LIST,
				 ApogyAddonsSensorsImagingCameraFactory.eINSTANCE.createFilterList()));
	}

}
