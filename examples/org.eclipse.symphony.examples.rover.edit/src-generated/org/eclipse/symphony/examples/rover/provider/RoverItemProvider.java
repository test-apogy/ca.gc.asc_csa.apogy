/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.provider;



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
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.examples.rover.EMFEcoreExampleRoverFactory;
import org.eclipse.symphony.examples.rover.EMFEcoreExampleRoverPackage;
import org.eclipse.symphony.examples.rover.Rover;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.rover.Rover} object.
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
				 EMFEcoreExampleRoverPackage.Literals.ROVER__ROBOTIC_ARM,
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
				 EMFEcoreExampleRoverPackage.Literals.ROVER__MOBILE_PLATFORM,
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
				 EMFEcoreExampleRoverPackage.Literals.ROVER__ARM_CAMERA,
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
				 EMFEcoreExampleRoverPackage.Literals.ROVER__CENTER_CAMERA,
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
	 * @generated_NOT
	 */
	protected void addLinearVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Rover_linearVelocity_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Rover_linearVelocity_feature", "_UI_Rover_type"),
				EMFEcoreExampleRoverPackage.Literals.ROVER__LINEAR_VELOCITY,
				false,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_VELOCITIESPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Angular Velocity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addAngularVelocityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Rover_angularVelocity_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Rover_angularVelocity_feature", "_UI_Rover_type"),
				EMFEcoreExampleRoverPackage.Literals.ROVER__ANGULAR_VELOCITY,
				false,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_VELOCITIESPropertyCategory"),
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
				 EMFEcoreExampleRoverPackage.Literals.ROVER__INITIALIZED,
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
				 EMFEcoreExampleRoverPackage.Literals.ROVER__DISPOSED,
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
			childrenFeatures.add(EMFEcoreExampleRoverPackage.Literals.ROVER__ROBOTIC_ARM);
			childrenFeatures.add(EMFEcoreExampleRoverPackage.Literals.ROVER__MOBILE_PLATFORM);
			childrenFeatures.add(EMFEcoreExampleRoverPackage.Literals.ROVER__ARM_CAMERA);
			childrenFeatures.add(EMFEcoreExampleRoverPackage.Literals.ROVER__CENTER_CAMERA);
			childrenFeatures.add(EMFEcoreExampleRoverPackage.Literals.ROVER__POWER_SYSTEM);
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
			case EMFEcoreExampleRoverPackage.ROVER__LINEAR_VELOCITY:
			case EMFEcoreExampleRoverPackage.ROVER__ANGULAR_VELOCITY:
			case EMFEcoreExampleRoverPackage.ROVER__INITIALIZED:
			case EMFEcoreExampleRoverPackage.ROVER__DISPOSED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EMFEcoreExampleRoverPackage.ROVER__ROBOTIC_ARM:
			case EMFEcoreExampleRoverPackage.ROVER__MOBILE_PLATFORM:
			case EMFEcoreExampleRoverPackage.ROVER__ARM_CAMERA:
			case EMFEcoreExampleRoverPackage.ROVER__CENTER_CAMERA:
			case EMFEcoreExampleRoverPackage.ROVER__POWER_SYSTEM:
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
				(EMFEcoreExampleRoverPackage.Literals.ROVER__POWER_SYSTEM,
				 EMFEcoreExampleRoverFactory.eINSTANCE.createPowerSystem()));
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
