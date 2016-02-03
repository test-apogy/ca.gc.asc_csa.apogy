package ca.gc.asc_csa.apogy.addons.sensors.pose.provider;
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
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPoseSensor;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPoseSensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatedPoseSensorItemProvider
	extends PoseSensorItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedPoseSensorItemProvider(AdapterFactory adapterFactory)
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

			addXVelocityPropertyDescriptor(object);
			addYVelocityPropertyDescriptor(object);
			addZVelocityPropertyDescriptor(object);
			addXAngularVelocityPropertyDescriptor(object);
			addYAngularVelocityPropertyDescriptor(object);
			addZAngularVelocityPropertyDescriptor(object);
			addUpdatePeriodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Update Period feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatePeriodPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_updatePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_updatePeriod_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__UPDATE_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XVelocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_xVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_xVelocity_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__XVELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YVelocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_yVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_yVelocity_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__YVELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZVelocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_zVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_zVelocity_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__ZVELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XAngular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_xAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_xAngularVelocity_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YAngular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_yAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_yAngularVelocity_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZAngular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedPoseSensor_zAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPoseSensor_zAngularVelocity_feature", "_UI_SimulatedPoseSensor_type"),
				 ApogyAddonsSensorsPosePackage.Literals.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimulatedPoseSensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulatedPoseSensor"));
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
		String label = ((SimulatedPoseSensor)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SimulatedPoseSensor_type") :
			getString("_UI_SimulatedPoseSensor_type") + " " + label;
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

		switch (notification.getFeatureID(SimulatedPoseSensor.class)) {
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__XVELOCITY:
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__YVELOCITY:
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__ZVELOCITY:
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__XANGULAR_VELOCITY:
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__YANGULAR_VELOCITY:
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__ZANGULAR_VELOCITY:
			case ApogyAddonsSensorsPosePackage.SIMULATED_POSE_SENSOR__UPDATE_PERIOD:
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
