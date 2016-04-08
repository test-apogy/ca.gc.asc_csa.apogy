/**
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
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.provider;


import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFactory;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;

import ca.gc.asc_csa.apogy.examples.robotic_arm.provider.RoboticArmItemProvider;

import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmPackage;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboticArmROSItemProvider extends RoboticArmItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArmROSItemProvider(AdapterFactory adapterFactory) {
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

			addServiceManagerPropertyDescriptor(object);
			addTopicLauncherPropertyDescriptor(object);
			addPublisherManagerPropertyDescriptor(object);
			addNodePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	
	/**
	 * This adds a property descriptor for the Service Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSInterface_serviceManager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSInterface_serviceManager_feature", "_UI_ROSInterface_type"),
				 ApogyAddonsROSPackage.Literals.ROS_INTERFACE__SERVICE_MANAGER,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ROS_INTERFACEPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Topic Launcher feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTopicLauncherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSInterface_topicLauncher_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSInterface_topicLauncher_feature", "_UI_ROSInterface_type"),
				 ApogyAddonsROSPackage.Literals.ROS_INTERFACE__TOPIC_LAUNCHER,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ROS_INTERFACEPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Publisher Manager feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublisherManagerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSInterface_publisherManager_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSInterface_publisherManager_feature", "_UI_ROSInterface_type"),
				 ApogyAddonsROSPackage.Literals.ROS_INTERFACE__PUBLISHER_MANAGER,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ROS_INTERFACEPropertyCategory"),
				 null));
	}

	
	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ROSInterface_node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ROSInterface_node_feature", "_UI_ROSInterface_type"),
				 ApogyAddonsROSPackage.Literals.ROS_INTERFACE__NODE,
				 false,
				 false,
				 true,
				 null,
				 getString("_UI_ROS_INTERFACEPropertyCategory"),
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyAddonsROSPackage.Literals.ROS_INTERFACE__SERVICE_MANAGER);
			childrenFeatures.add(ApogyAddonsROSPackage.Literals.ROS_INTERFACE__TOPIC_LAUNCHER);
			childrenFeatures.add(ApogyAddonsROSPackage.Literals.ROS_INTERFACE__PUBLISHER_MANAGER);
			childrenFeatures.add(ApogyAddonsROSPackage.Literals.ROS_INTERFACE__NODE);
			childrenFeatures.add(ApogyExamplesRoboticArmPackage.Literals.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RoboticArmROS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoboticArmROS"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RoboticArmROS roboticArmROS = (RoboticArmROS)object;
		return getString("_UI_RoboticArmROS_type") + " " + roboticArmROS.getTurretAngle();
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

		switch (notification.getFeatureID(RoboticArmROS.class)) {
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER:
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER:
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER:
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_ROS__NODE:
			case ApogyExamplesRoboticArmPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesRoboticArmPackage.Literals.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE,
				 ApogyAddonsROSFactory.eINSTANCE.createROSNode()));
	}

}
