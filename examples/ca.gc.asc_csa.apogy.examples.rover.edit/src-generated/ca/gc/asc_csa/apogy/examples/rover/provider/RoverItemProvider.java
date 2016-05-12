package ca.gc.asc_csa.apogy.examples.rover.provider;
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



import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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
import ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverFactory;
import ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage;
import ca.gc.asc_csa.apogy.examples.rover.Rover;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.rover.Rover} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoverItemProvider extends ItemProviderAdapter
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
	public RoverItemProvider(AdapterFactory adapterFactory)
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

			addNamePropertyDescriptor(object);
			addRoboticArmPropertyDescriptor(object);
			addMobilePlatformPropertyDescriptor(object);
			addArmCameraPropertyDescriptor(object);
			addCenterCameraPropertyDescriptor(object);
			addLinearVelocityPropertyDescriptor(object);
			addAngularVelocityPropertyDescriptor(object);
			addInitializedPropertyDescriptor(object);
			addDisposedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 ApogyCommonEMFPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Robotic Arm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoboticArmPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rover_roboticArm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_roboticArm_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__ROBOTIC_ARM,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SubcomponentsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mobile Platform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMobilePlatformPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rover_mobilePlatform_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_mobilePlatform_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__MOBILE_PLATFORM,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SubcomponentsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Arm Camera feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArmCameraPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rover_armCamera_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_armCamera_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__ARM_CAMERA,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SubcomponentsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Center Camera feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenterCameraPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rover_centerCamera_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_centerCamera_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__CENTER_CAMERA,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SubcomponentsPropertyCategory"),
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
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rover_linearVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_linearVelocity_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__LINEAR_VELOCITY,
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
			(new AbstractUnitItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Rover_angularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_angularVelocity_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__ANGULAR_VELOCITY,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
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
				 getString("_UI_Rover_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_initialized_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__INITIALIZED,
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
				 getString("_UI_Rover_disposed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Rover_disposed_feature", "_UI_Rover_type"),
				 ApogyExamplesRoverPackage.Literals.ROVER__DISPOSED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
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
			childrenFeatures.add(ApogyExamplesRoverPackage.Literals.ROVER__ROBOTIC_ARM);
			childrenFeatures.add(ApogyExamplesRoverPackage.Literals.ROVER__MOBILE_PLATFORM);
			childrenFeatures.add(ApogyExamplesRoverPackage.Literals.ROVER__ARM_CAMERA);
			childrenFeatures.add(ApogyExamplesRoverPackage.Literals.ROVER__CENTER_CAMERA);
			childrenFeatures.add(ApogyExamplesRoverPackage.Literals.ROVER__POWER_SYSTEM);
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
		
		Rover rover = (Rover)object;
		
		// Get the default label
		String label = getString("_UI_Rover_type");
		
		// If the rover is not null
		if (rover != null)
		{
			// Add specific values
			label += " (LinVel=" + rover.getLinearVelocity() +
					 ", AngVel=" + Math.toDegrees(rover.getAngularVelocity()) +
					 "(" + DEGREE_SYM + "/s))";
		}
		
		// Return the label
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

		switch (notification.getFeatureID(Rover.class)) {
			case ApogyExamplesRoverPackage.ROVER__NAME:
			case ApogyExamplesRoverPackage.ROVER__LINEAR_VELOCITY:
			case ApogyExamplesRoverPackage.ROVER__ANGULAR_VELOCITY:
			case ApogyExamplesRoverPackage.ROVER__INITIALIZED:
			case ApogyExamplesRoverPackage.ROVER__DISPOSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM:
			case ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM:
			case ApogyExamplesRoverPackage.ROVER__ARM_CAMERA:
			case ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA:
			case ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM:
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
				(ApogyExamplesRoverPackage.Literals.ROVER__POWER_SYSTEM,
				 ApogyExamplesRoverFactory.eINSTANCE.createPowerSystem()));
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
