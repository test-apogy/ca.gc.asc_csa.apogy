/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.provider;


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
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;

import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.robotic_arm.RoboticArm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboticArmItemProvider extends ItemProviderAdapter
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
	public RoboticArmItemProvider(AdapterFactory adapterFactory)
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

			addTurretAnglePropertyDescriptor(object);
			addShoulderAnglePropertyDescriptor(object);
			addElbowAnglePropertyDescriptor(object);
			addWristAnglePropertyDescriptor(object);
			addInitializedPropertyDescriptor(object);
			addArmMovingPropertyDescriptor(object);
			addSpeedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_RoboticArm_speed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_speed_feature", "_UI_RoboticArm_type"),
				 EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__SPEED,
				 false,
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
	protected void addTurretAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_RoboticArm_turretAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_turretAngle_feature", "_UI_RoboticArm_type"),
				EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__TURRET_ANGLE,
				false,
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
				getString("_UI_RoboticArm_shoulderAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_shoulderAngle_feature", "_UI_RoboticArm_type"),
				EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__SHOULDER_ANGLE,
				false,
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
				getString("_UI_RoboticArm_elbowAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_elbowAngle_feature", "_UI_RoboticArm_type"),
				EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__ELBOW_ANGLE,
				false,
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
				getString("_UI_RoboticArm_wristAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_wristAngle_feature", "_UI_RoboticArm_type"),
				EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__WRIST_ANGLE,
				false,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_JointAnglesPropertyCategory"),
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
				 getString("_UI_RoboticArm_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_initialized_feature", "_UI_RoboticArm_type"),
				 EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__INITIALIZED,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Arm Moving feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArmMovingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RoboticArm_armMoving_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RoboticArm_armMoving_feature", "_UI_RoboticArm_type"),
				 EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM__ARM_MOVING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
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
		
		RoboticArm roboticArm = (RoboticArm)object;
		
		// Get the default label
		String label = getString("_UI_RoboticArm_type");
		
		// If the robotic arm isn't null
		if (roboticArm != null)
		{
			// Add the appropriate values
			label += " (T=" + roboticArm.getTurretAngle() +
					  DEGREE_SYM + ", S=" + roboticArm.getShoulderAngle() +
					  DEGREE_SYM + ", E=" + roboticArm.getElbowAngle() +
					  DEGREE_SYM + ", W=" + roboticArm.getWristAngle() +
					  DEGREE_SYM + ")";
		}
		
		// Just return the label
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

		switch (notification.getFeatureID(RoboticArm.class)) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE:
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE:
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE:
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE:
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__INITIALIZED:
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING:
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SPEED:
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
