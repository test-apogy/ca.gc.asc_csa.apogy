/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.provider;


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
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehicleFactory;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderFactory;
import org.eclipse.symphony.examples.lander.EMFEcoreExampleLanderPackage;
import org.eclipse.symphony.examples.lander.Lander;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.lander.Lander} object.
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
	 * @generated_NOT
	 */
	protected void addLegAPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Lander_legAPosition_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Lander_legAPosition_feature", "_UI_Lander_type"),
				EMFEcoreExampleLanderPackage.Literals.LANDER__LEG_APOSITION,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__LEG_AEXTENSION,
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
	 * @generated_NOT
	 */
	protected void addLegBPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Lander_legBPosition_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Lander_legBPosition_feature", "_UI_Lander_type"),
				EMFEcoreExampleLanderPackage.Literals.LANDER__LEG_BPOSITION,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__LEG_BEXTENSION,
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
	 * @generated_NOT
	 */
	protected void addLegCPositionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Lander_legCPosition_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Lander_legCPosition_feature", "_UI_Lander_type"),
				EMFEcoreExampleLanderPackage.Literals.LANDER__LEG_CPOSITION,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__LEG_CEXTENSION,
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
	 * @generated_NOT
	 */
	protected void addXAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Lander_xAngularVelocity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lander_xAngularVelocity_feature", "_UI_Lander_type"),
						EMFEcoreExampleLanderPackage.Literals.LANDER__XANGULAR_VELOCITY,
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
	 * @generated_NOT
	 */
	protected void addYAngularVelocityPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Lander_yAngularVelocity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lander_yAngularVelocity_feature", "_UI_Lander_type"),
						EMFEcoreExampleLanderPackage.Literals.LANDER__YANGULAR_VELOCITY,
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
	 * @generated_NOT
	 */
	protected void addMassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Lander_mass_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lander_mass_feature", "_UI_Lander_type"),
						EMFEcoreExampleLanderPackage.Literals.LANDER__MASS,
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
	 * @generated_NOT
	 */
	protected void addGravitationalPullPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Lander_gravitationalPull_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Lander_gravitationalPull_feature", "_UI_Lander_type"),
						EMFEcoreExampleLanderPackage.Literals.LANDER__GRAVITATIONAL_PULL,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__FLYING_ENABLED,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__INITIALIZED,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__DISPOSED,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__CHANGING_LEGS,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__CHANGING_ATTITUDE,
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
				 EMFEcoreExampleLanderPackage.Literals.LANDER__CHANGING_LOCATION,
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
			childrenFeatures.add(EMFEcoreExampleLanderPackage.Literals.LANDER__POSITION);
			childrenFeatures.add(EMFEcoreExampleLanderPackage.Literals.LANDER__THRUSTER);
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
		
		// If the lander isn't null
		if (lander != null)
		{
			// If the position is present
			if (lander.getPosition() != null)
			{
				// Add the coordinates to the label
				label = label + " (X=" + lander.getPosition().getX() +
								", Y=" + lander.getPosition().getY() +
								", Z=" + lander.getPosition().getZ();
				
				// If the thruster is also present
				if (lander.getThruster() != null)
				{
					// Add the thrust level to the label
					label = label + ", Thrust=" + lander.getThruster().getCurrentThrust();
				}
				
				// Finish off the label
				label = label + ")";
			}
			// Otherwise if the position is not present
			// but the thruster is
			else if (lander.getThruster() != null)
			{
				// Add the thrust level to the label
				label = "(Thrust=" + lander.getThruster().getCurrentThrust() +")";
			}
		}
		
		// Return the generated label
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

		switch (notification.getFeatureID(Lander.class)) {
			case EMFEcoreExampleLanderPackage.LANDER__LEG_AEXTENSION:
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BEXTENSION:
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CEXTENSION:
			case EMFEcoreExampleLanderPackage.LANDER__LEG_APOSITION:
			case EMFEcoreExampleLanderPackage.LANDER__LEG_BPOSITION:
			case EMFEcoreExampleLanderPackage.LANDER__LEG_CPOSITION:
			case EMFEcoreExampleLanderPackage.LANDER__XANGULAR_VELOCITY:
			case EMFEcoreExampleLanderPackage.LANDER__YANGULAR_VELOCITY:
			case EMFEcoreExampleLanderPackage.LANDER__MASS:
			case EMFEcoreExampleLanderPackage.LANDER__GRAVITATIONAL_PULL:
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LEGS:
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_ATTITUDE:
			case EMFEcoreExampleLanderPackage.LANDER__CHANGING_LOCATION:
			case EMFEcoreExampleLanderPackage.LANDER__FLYING_ENABLED:
			case EMFEcoreExampleLanderPackage.LANDER__INITIALIZED:
			case EMFEcoreExampleLanderPackage.LANDER__DISPOSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EMFEcoreExampleLanderPackage.LANDER__POSITION:
			case EMFEcoreExampleLanderPackage.LANDER__THRUSTER:
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
				(EMFEcoreExampleLanderPackage.Literals.LANDER__POSITION,
				 EMFEcoreExampleLanderFactory.eINSTANCE.createPosition()));

		newChildDescriptors.add
			(createChildParameter
				(EMFEcoreExampleLanderPackage.Literals.LANDER__THRUSTER,
				 SymphonyToolsVehicleFactory.eINSTANCE.createThruster()));
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
