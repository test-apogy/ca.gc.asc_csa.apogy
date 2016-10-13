package ca.gc.asc_csa.apogy.examples.lander.provider;
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


import java.text.DecimalFormat;
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

import ca.gc.asc_csa.apogy.addons.vehicle.ApogyAddonsVehicleFactory;
import ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderFactory;
import ca.gc.asc_csa.apogy.examples.lander.ApogyExamplesLanderPackage;
import ca.gc.asc_csa.apogy.examples.lander.Lander;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.lander.Lander} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LanderItemProvider extends ItemProviderAdapter
								implements
								IEditingDomainItemProvider,
								IStructuredItemContentProvider,
								ITreeItemContentProvider,
								IItemLabelProvider,
								IItemPropertySource
{
	private DecimalFormat fuelMassFormat = new DecimalFormat("0.0");
	private DecimalFormat thrustFormat = new DecimalFormat("0");
	
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanderItemProvider(AdapterFactory adapterFactory)
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

			addLegAExtensionPropertyDescriptor(object);
			addLegBExtensionPropertyDescriptor(object);
			addLegCExtensionPropertyDescriptor(object);
			addLegAPositionPropertyDescriptor(object);
			addLegBPositionPropertyDescriptor(object);
			addLegCPositionPropertyDescriptor(object);
			addXAngularVelocityPropertyDescriptor(object);
			addYAngularVelocityPropertyDescriptor(object);
			addMassPropertyDescriptor(object);
			addFuelMassPropertyDescriptor(object);
			addGravitationalPullPropertyDescriptor(object);
			addChangingLegsPropertyDescriptor(object);
			addChangingAttitudePropertyDescriptor(object);
			addChangingLocationPropertyDescriptor(object);
			addFlyingEnabledPropertyDescriptor(object);
			addInitializedPropertyDescriptor(object);
			addDisposedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Leg APosition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegAPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_legAPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_legAPosition_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__LEG_APOSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_LegPositionsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg AExtension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegAExtensionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_legAExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_legAExtension_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__LEG_AEXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LegExtensionLevelsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg BPosition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegBPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_legBPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_legBPosition_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__LEG_BPOSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_LegPositionsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg BExtension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegBExtensionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_legBExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_legBExtension_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__LEG_BEXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LegExtensionLevelsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg CPosition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegCPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_legCPosition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_legCPosition_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__LEG_CPOSITION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_LegPositionsPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Leg CExtension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLegCExtensionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_legCExtension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_legCExtension_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__LEG_CEXTENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_LegExtensionLevelsPropertyCategory"),
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
				 getString("_UI_Lander_xAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_xAngularVelocity_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__XANGULAR_VELOCITY,
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
	protected void addYAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_yAngularVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_yAngularVelocity_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__YANGULAR_VELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VelocitiesPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Mass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_mass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_mass_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__MASS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Fuel Mass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFuelMassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_fuelMass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_fuelMass_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__FUEL_MASS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Gravitational Pull feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGravitationalPullPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_gravitationalPull_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_gravitationalPull_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__GRAVITATIONAL_PULL,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
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
				 getString("_UI_Lander_flyingEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_flyingEnabled_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__FLYING_ENABLED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_FlightPropertyCategory"),
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
				 getString("_UI_Lander_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_initialized_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__INITIALIZED,
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
				 getString("_UI_Lander_disposed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_disposed_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__DISPOSED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Changing Legs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangingLegsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_changingLegs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_changingLegs_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__CHANGING_LEGS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Changing Attitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangingAttitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_changingAttitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_changingAttitude_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__CHANGING_ATTITUDE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Changing Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangingLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Lander_changingLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Lander_changingLocation_feature", "_UI_Lander_type"),
				 ApogyExamplesLanderPackage.Literals.LANDER__CHANGING_LOCATION,
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyExamplesLanderPackage.Literals.LANDER__POSITION);
			childrenFeatures.add(ApogyExamplesLanderPackage.Literals.LANDER__THRUSTER);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object)
	{
		// Cast the object to a lander
		Lander lander = (Lander) object;
		
		// The label to be displayed for the lander
		String label = getString("UI_Lander_type"); 
		
		label += getLanderSuffixText(lander);
		
		// Return the generated label
		return label;
	}	
	
	protected String getLanderSuffixText(Lander lander)
	{
		String text = "";
			
		text += "(Fuel : " + fuelMassFormat.format(lander.getFuelMass()) + " kg";
		if(lander.getThruster() != null)
		{
			text += ", Thrust : " + thrustFormat.format(lander.getThruster().getCurrentThrust()) + " N";
		}
		
		text += ")";
		
		return text;
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

		switch (notification.getFeatureID(Lander.class)) {
			case ApogyExamplesLanderPackage.LANDER__LEG_AEXTENSION:
			case ApogyExamplesLanderPackage.LANDER__LEG_BEXTENSION:
			case ApogyExamplesLanderPackage.LANDER__LEG_CEXTENSION:
			case ApogyExamplesLanderPackage.LANDER__LEG_APOSITION:
			case ApogyExamplesLanderPackage.LANDER__LEG_BPOSITION:
			case ApogyExamplesLanderPackage.LANDER__LEG_CPOSITION:
			case ApogyExamplesLanderPackage.LANDER__XANGULAR_VELOCITY:
			case ApogyExamplesLanderPackage.LANDER__YANGULAR_VELOCITY:
			case ApogyExamplesLanderPackage.LANDER__MASS:
			case ApogyExamplesLanderPackage.LANDER__FUEL_MASS:
			case ApogyExamplesLanderPackage.LANDER__GRAVITATIONAL_PULL:
			case ApogyExamplesLanderPackage.LANDER__CHANGING_LEGS:
			case ApogyExamplesLanderPackage.LANDER__CHANGING_ATTITUDE:
			case ApogyExamplesLanderPackage.LANDER__CHANGING_LOCATION:
			case ApogyExamplesLanderPackage.LANDER__FLYING_ENABLED:
			case ApogyExamplesLanderPackage.LANDER__INITIALIZED:
			case ApogyExamplesLanderPackage.LANDER__DISPOSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyExamplesLanderPackage.LANDER__POSITION:
			case ApogyExamplesLanderPackage.LANDER__THRUSTER:
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
				(ApogyExamplesLanderPackage.Literals.LANDER__POSITION,
				 ApogyExamplesLanderFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesLanderPackage.Literals.LANDER__THRUSTER,
				 ApogyAddonsVehicleFactory.eINSTANCE.createThruster()));
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
