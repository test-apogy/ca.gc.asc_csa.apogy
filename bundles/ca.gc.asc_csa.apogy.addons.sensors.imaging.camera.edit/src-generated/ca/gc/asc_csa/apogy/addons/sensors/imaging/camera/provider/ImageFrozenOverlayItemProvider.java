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
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ApogyAddonsSensorsImagingCameraPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageFrozenOverlay} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageFrozenOverlayItemProvider extends AbstractTextOverlayItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageFrozenOverlayItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addFrozenPropertyDescriptor(object);
			addExpectedImageUpdatePeriodPropertyDescriptor(object);
			addFrozenMessagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Frozen feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrozenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageFrozenOverlay_frozen_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageFrozenOverlay_frozen_feature", "_UI_ImageFrozenOverlay_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY__FROZEN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_FROZEN_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Expected Image Update Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addExpectedImageUpdatePeriodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageFrozenOverlay_expectedImageUpdatePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageFrozenOverlay_expectedImageUpdatePeriod_feature", "_UI_ImageFrozenOverlay_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FROZEN_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Frozen Message feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFrozenMessagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageFrozenOverlay_frozenMessage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageFrozenOverlay_frozenMessage_feature", "_UI_ImageFrozenOverlay_type"),
				 ApogyAddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FROZEN_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This returns ImageFrozenOverlay.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageFrozenOverlay"));
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
		ImageFrozenOverlay imageFrozenOverlay = (ImageFrozenOverlay) object;		
		String label = getAbstractTextOverlayText(imageFrozenOverlay, "_UI_ImageFrozenOverlay_type");	 
		
		if(imageFrozenOverlay.isFrozen())
		{
			label += " - FROZEN";
		}
		
		return label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ImageFrozenOverlay.class)) {
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN:
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD:
			case ApogyAddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
