/**
 * Canadian Space Agency 2007.
 *
 * $Id: SimulatedPositionSensorItemProvider.java,v 1.3.4.2 2015/05/21 15:50:00 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.pose.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.sensors.pose.Symphony__AddonsSensorsPosePackage;
import org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.pose.SimulatedPositionSensor} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatedPositionSensorItemProvider
	extends PositionSensorItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulatedPositionSensorItemProvider(AdapterFactory adapterFactory)
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
			addUpdatePeriodPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SimulatedPositionSensor_xVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPositionSensor_xVelocity_feature", "_UI_SimulatedPositionSensor_type"),
				 Symphony__AddonsSensorsPosePackage.Literals.SIMULATED_POSITION_SENSOR__XVELOCITY,
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
				 getString("_UI_SimulatedPositionSensor_yVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPositionSensor_yVelocity_feature", "_UI_SimulatedPositionSensor_type"),
				 Symphony__AddonsSensorsPosePackage.Literals.SIMULATED_POSITION_SENSOR__YVELOCITY,
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
				 getString("_UI_SimulatedPositionSensor_zVelocity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPositionSensor_zVelocity_feature", "_UI_SimulatedPositionSensor_type"),
				 Symphony__AddonsSensorsPosePackage.Literals.SIMULATED_POSITION_SENSOR__ZVELOCITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_SimulatedPositionSensor_updatePeriod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedPositionSensor_updatePeriod_feature", "_UI_SimulatedPositionSensor_type"),
				 Symphony__AddonsSensorsPosePackage.Literals.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimulatedPositionSensor.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulatedPositionSensor"));
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
		String label = ((SimulatedPositionSensor)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SimulatedPositionSensor_type") :
			getString("_UI_SimulatedPositionSensor_type") + " " + label;
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

		switch (notification.getFeatureID(SimulatedPositionSensor.class)) {
			case Symphony__AddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__XVELOCITY:
			case Symphony__AddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__YVELOCITY:
			case Symphony__AddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__ZVELOCITY:
			case Symphony__AddonsSensorsPosePackage.SIMULATED_POSITION_SENSOR__UPDATE_PERIOD:
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
