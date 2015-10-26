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
import org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay;
import org.eclipse.symphony.addons.sensors.imaging.camera.Symphony__AddonsSensorsImagingCameraPackage;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.imaging.camera.ImageFrozenOverlay} object.
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
				 Symphony__AddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY__FROZEN,
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
				 Symphony__AddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD,
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
				 Symphony__AddonsSensorsImagingCameraPackage.Literals.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE,
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
			case Symphony__AddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN:
			case Symphony__AddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__EXPECTED_IMAGE_UPDATE_PERIOD:
			case Symphony__AddonsSensorsImagingCameraPackage.IMAGE_FROZEN_OVERLAY__FROZEN_MESSAGE:
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
