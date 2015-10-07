/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.symphony.provider;


import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.provider.SymphonyInitializationDataItemProvider;
import org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData;
import org.eclipse.symphony.examples.robotic_arm.symphony.SymphonyExampleRoboticArmPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.robotic_arm.symphony.RoboticArmData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboticArmDataItemProvider extends SymphonyInitializationDataItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArmDataItemProvider(AdapterFactory adapterFactory)
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
			addSpeedPropertyDescriptor(object);
			addTurretAnglePropertyDescriptor(object);
			addShoulderAnglePropertyDescriptor(object);
			addElbowAnglePropertyDescriptor(object);
			addWristAnglePropertyDescriptor(object);
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
				 getString("_UI_RoboticArmData_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoboticArmData_initialized_feature", "_UI_RoboticArmData_type"),
				 SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_DATA__INITIALIZED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Speed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoboticArmData_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoboticArmData_speed_feature", "_UI_RoboticArmData_type"),
				 SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_DATA__SPEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Turret Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTurretAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RoboticArmData_turretAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArmData_turretAngle_feature", "_UI_RoboticArmData_type"),
				SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_DATA__TURRET_ANGLE,
				true,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_JointAnglesPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Shoulder Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addShoulderAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RoboticArmData_shoulderAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArmData_shoulderAngle_feature", "_UI_RoboticArmData_type"),
				SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_DATA__SHOULDER_ANGLE,
				true,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_JointAnglesPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Elbow Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addElbowAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RoboticArmData_elbowAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArmData_elbowAngle_feature", "_UI_RoboticArmData_type"),
				SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_DATA__ELBOW_ANGLE,
				true,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_JointAnglesPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Wrist Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addWristAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RoboticArmData_wristAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArmData_wristAngle_feature", "_UI_RoboticArmData_type"),
				SymphonyExampleRoboticArmPackage.Literals.ROBOTIC_ARM_DATA__WRIST_ANGLE,
				true,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_JointAnglesPropertyCategory"),
				null));
	}

	/**
	 * This returns RoboticArmData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RoboticArmData"));
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
		RoboticArmData roboticArmData = (RoboticArmData)object;
		return getString("_UI_RoboticArmData_type") + " " + roboticArmData.isInitialized();
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

		switch (notification.getFeatureID(RoboticArmData.class)) {
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA__INITIALIZED:
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA__SPEED:
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA__TURRET_ANGLE:
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA__SHOULDER_ANGLE:
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA__ELBOW_ANGLE:
			case SymphonyExampleRoboticArmPackage.ROBOTIC_ARM_DATA__WRIST_ANGLE:
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
		return SymphonyExampleRoboticArmEditPlugin.INSTANCE;
	}

}
