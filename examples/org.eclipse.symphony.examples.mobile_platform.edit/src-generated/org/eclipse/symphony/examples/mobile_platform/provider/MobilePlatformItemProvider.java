/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.mobile_platform.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.examples.mobile_platform.Symphony__ExamplesMobilePlatformPackage;
import org.eclipse.symphony.examples.mobile_platform.MobilePlatform;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.mobile_platform.MobilePlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MobilePlatformItemProvider
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
	public MobilePlatformItemProvider(AdapterFactory adapterFactory)
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

			addInitializedPropertyDescriptor(object);
			addDisposedPropertyDescriptor(object);
			addPositionErrorPropertyDescriptor(object);
			addLinearVelocityPropertyDescriptor(object);
			addAngularVelocityPropertyDescriptor(object);
			addLeftWheelPositionPropertyDescriptor(object);
			addRightWheelPositionPropertyDescriptor(object);
			addPositionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Initialized feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitializedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_initialized_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__INITIALIZED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Disposed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisposedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_disposed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_disposed_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__DISPOSED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Position Error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addPositionErrorPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_MobilePlatform_positionError_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_positionError_feature", "_UI_MobilePlatform_type"),
				Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__POSITION_ERROR,
				false,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_PositionPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Linear Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinearVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_linearVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_linearVelocity_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__LINEAR_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Angular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAngularVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_angularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_angularVelocity_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__ANGULAR_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Left Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeftWheelPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_leftWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_leftWheelPosition_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__LEFT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Right Wheel Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRightWheelPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_rightWheelPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_rightWheelPosition_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PositionPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Position feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MobilePlatform_position_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MobilePlatform_position_feature", "_UI_MobilePlatform_type"),
				 Symphony__ExamplesMobilePlatformPackage.Literals.MOBILE_PLATFORM__POSITION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_PositionPropertyCategory"),
				 null));
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
		/**
		 * This is the degree symbol, as expressed in unicode
		 */
		final String DEGREE_SYM = "\u00b0";
		
		// Get the current mobile platform
		MobilePlatform mobilePlatform = (MobilePlatform)object;
		
		// Get the default label
		String label = getString("_UI_MobilePlatform_type");
		
		// If the mobile platform isn't null
		if (mobilePlatform != null)
		{
			// Add on appropriate values
			label += " (X=" + mobilePlatform.getPosition().getX() +
					 ", Y=" + mobilePlatform.getPosition().getY() +
					 ", LinVel=" + mobilePlatform.getLinearVelocity() +
					 ", AngVel=" + Math.toDegrees(mobilePlatform.getAngularVelocity()) +
					 "(" + DEGREE_SYM + "/s))";
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
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(MobilePlatform.class)) {
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__INITIALIZED:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__DISPOSED:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__POSITION_ERROR:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__LINEAR_VELOCITY:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__ANGULAR_VELOCITY:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__LEFT_WHEEL_POSITION:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__RIGHT_WHEEL_POSITION:
			case Symphony__ExamplesMobilePlatformPackage.MOBILE_PLATFORM__POSITION:
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
