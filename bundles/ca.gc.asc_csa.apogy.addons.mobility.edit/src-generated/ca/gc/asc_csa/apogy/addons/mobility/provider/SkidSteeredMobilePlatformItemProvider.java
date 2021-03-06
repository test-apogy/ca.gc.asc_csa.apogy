package ca.gc.asc_csa.apogy.addons.mobility.provider;
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
import ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage;
import ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.mobility.SkidSteeredMobilePlatform} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SkidSteeredMobilePlatformItemProvider
	extends MobilePlatformItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkidSteeredMobilePlatformItemProvider(AdapterFactory adapterFactory)
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

			addCommandedRightWheelsVelocityPropertyDescriptor(object);
			addActualRightWheelsVelocityPropertyDescriptor(object);
			addCommandedLeftWheelsVelocityPropertyDescriptor(object);
			addActualLeftWheelsVelocityPropertyDescriptor(object);
			addCommandedAngularVelocityPropertyDescriptor(object);
			addActualAngularVelocityPropertyDescriptor(object);
			addCommandedTranslationVelocityPropertyDescriptor(object);
			addActualTranslationVelocityPropertyDescriptor(object);
			addEffectiveSteeringWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Commanded Right Wheels Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandedRightWheelsVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_commandedRightWheelsVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_commandedRightWheelsVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Right Wheels Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualRightWheelsVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_actualRightWheelsVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_actualRightWheelsVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Left Wheels Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandedLeftWheelsVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_commandedLeftWheelsVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_commandedLeftWheelsVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Left Wheels Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualLeftWheelsVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_actualLeftWheelsVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_actualLeftWheelsVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Angular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandedAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_commandedAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_commandedAngularVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Angular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_actualAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_actualAngularVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Commanded Translation Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandedTranslationVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_commandedTranslationVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_commandedTranslationVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Actual Translation Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActualTranslationVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_actualTranslationVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_actualTranslationVelocity_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Effective Steering Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEffectiveSteeringWidthPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SkidSteeredMobilePlatform_effectiveSteeringWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SkidSteeredMobilePlatform_effectiveSteeringWidth_feature", "_UI_SkidSteeredMobilePlatform_type"),
				 ApogyAddonsMobilityPackage.Literals.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SkidSteeredMobilePlatform.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SkidSteeredMobilePlatform"));
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
		String label = ((SkidSteeredMobilePlatform)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SkidSteeredMobilePlatform_type") :
			getString("_UI_SkidSteeredMobilePlatform_type") + " " + label;
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

		switch (notification.getFeatureID(SkidSteeredMobilePlatform.class)) {
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_RIGHT_WHEELS_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_RIGHT_WHEELS_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_LEFT_WHEELS_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_LEFT_WHEELS_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_ANGULAR_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_ANGULAR_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__COMMANDED_TRANSLATION_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__ACTUAL_TRANSLATION_VELOCITY:
			case ApogyAddonsMobilityPackage.SKID_STEERED_MOBILE_PLATFORM__EFFECTIVE_STEERING_WIDTH:
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
