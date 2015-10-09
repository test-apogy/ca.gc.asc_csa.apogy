/**
 * <copyright>
 * </copyright>
 *
 * $Id: SkidSteeredPlatformPathFollowerItemProvider.java,v 1.3.4.2 2015/05/21 15:50:54 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.controllers.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.mobility.controllers.ControllersPackage;
import org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.mobility.controllers.SkidSteeredPlatformPathFollower} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SkidSteeredPlatformPathFollowerItemProvider
	extends PathFollowerItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkidSteeredPlatformPathFollowerItemProvider(AdapterFactory adapterFactory)
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

			addMaximumAngularVelocityPropertyDescriptor(object);
			addMaximumLinearVelocityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Maximum Angular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredPlatformPathFollower_maximumAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredPlatformPathFollower_maximumAngularVelocity_feature", "_UI_SkidSteeredPlatformPathFollower_type"),
				 ControllersPackage.Literals.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VELOCITIES_BOUNDSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Linear Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumLinearVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredPlatformPathFollower_maximumLinearVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredPlatformPathFollower_maximumLinearVelocity_feature", "_UI_SkidSteeredPlatformPathFollower_type"),
				 ControllersPackage.Literals.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VELOCITIES_BOUNDSPropertyCategory"),
				 null));
	}

	/**
	 * This returns SkidSteeredPlatformPathFollower.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SkidSteeredPlatformPathFollower"));
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
		SkidSteeredPlatformPathFollower<?, ?> skidSteeredPlatformPathFollower = (SkidSteeredPlatformPathFollower<?, ?>)object;
		return getString("_UI_SkidSteeredPlatformPathFollower_type") + " " + skidSteeredPlatformPathFollower.isDestinationReached();
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

		switch (notification.getFeatureID(SkidSteeredPlatformPathFollower.class)) {
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_ANGULAR_VELOCITY:
			case ControllersPackage.SKID_STEERED_PLATFORM_PATH_FOLLOWER__MAXIMUM_LINEAR_VELOCITY:
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
