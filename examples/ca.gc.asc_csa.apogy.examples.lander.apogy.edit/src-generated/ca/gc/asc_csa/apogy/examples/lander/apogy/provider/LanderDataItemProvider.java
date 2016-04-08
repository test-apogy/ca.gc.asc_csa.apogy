package ca.gc.asc_csa.apogy.examples.lander.apogy.provider;
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
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.core.provider.ApogyInitializationDataItemProvider;
import ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData;
import ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LanderDataItemProvider extends ApogyInitializationDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderDataItemProvider(AdapterFactory adapterFactory) {
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

			addInitializedPropertyDescriptor(object);
			addDisposedPropertyDescriptor(object);
			addFlyingEnabledPropertyDescriptor(object);
			addLegAExtensionPropertyDescriptor(object);
			addLegBExtensionPropertyDescriptor(object);
			addLegCExtensionPropertyDescriptor(object);
			addCurrThrustLevelPropertyDescriptor(object);
			addMinThrustLevelPropertyDescriptor(object);
			addMaxThrustLevelPropertyDescriptor(object);
			addXAngularVelocityPropertyDescriptor(object);
			addYAngularVelocityPropertyDescriptor(object);
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
				 getString("_UI_LanderData_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_initialized_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__INITIALIZED,
				 true,
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
				 getString("_UI_LanderData_disposed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_disposed_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__DISPOSED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Flying Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFlyingEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_flyingEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_flyingEnabled_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__FLYING_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg AExtension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegAExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_legAExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_legAExtension_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__LEG_AEXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LegsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg BExtension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegBExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_legBExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_legBExtension_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__LEG_BEXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LegsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg CExtension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegCExtensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_legCExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_legCExtension_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__LEG_CEXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LegsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Curr Thrust Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrThrustLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_currThrustLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_currThrustLevel_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__CURR_THRUST_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Thrust Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinThrustLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_minThrustLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_minThrustLevel_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__MIN_THRUST_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Thrust Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxThrustLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_maxThrustLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_maxThrustLevel_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__MAX_THRUST_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the XAngular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAngularVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_xAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_xAngularVelocity_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__XANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the YAngular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYAngularVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LanderData_yAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LanderData_yAngularVelocity_feature", "_UI_LanderData_type"),
				 ApogyExamplesLanderApogyPackage.Literals.LANDER_DATA__YANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	/**
	 * This returns LanderData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LanderData"));
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
		return getString("_UI_LanderData_type");
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

		switch (notification.getFeatureID(LanderData.class)) {
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__INITIALIZED:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__DISPOSED:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__FLYING_ENABLED:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_AEXTENSION:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_BEXTENSION:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__LEG_CEXTENSION:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__CURR_THRUST_LEVEL:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MIN_THRUST_LEVEL:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__MAX_THRUST_LEVEL:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__XANGULAR_VELOCITY:
			case ApogyExamplesLanderApogyPackage.LANDER_DATA__YANGULAR_VELOCITY:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ApogyExamplesLanderApogyEditPlugin.INSTANCE;
	}

}
