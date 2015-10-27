/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.antenna.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.examples.antenna.Symphony__ExamplesAntennaPackage;
import org.eclipse.symphony.examples.antenna.PTUDishAntenna;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.antenna.PTUDishAntenna} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PTUDishAntennaItemProvider extends DishAntennaItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUDishAntennaItemProvider(AdapterFactory adapterFactory)
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

			addPanAnglePropertyDescriptor(object);
			addTiltAnglePropertyDescriptor(object);
			addTrackingSunPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pan Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addPanAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PTUDishAntenna_panAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntenna_panAngle_feature", "_UI_PTUDishAntenna_type"),
				Symphony__ExamplesAntennaPackage.Literals.PTU_DISH_ANTENNA__PAN_ANGLE,
				false,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_ANTENNA_PTU_INFOPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Tilt Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTiltAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
		(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_PTUDishAntenna_tiltAngle_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntenna_tiltAngle_feature", "_UI_PTUDishAntenna_type"),
				Symphony__ExamplesAntennaPackage.Literals.PTU_DISH_ANTENNA__TILT_ANGLE,
				false,
				false,
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				getString("_UI_ANTENNA_PTU_INFOPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Tracking Sun feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrackingSunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PTUDishAntenna_trackingSun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntenna_trackingSun_feature", "_UI_PTUDishAntenna_type"),
				 Symphony__ExamplesAntennaPackage.Literals.PTU_DISH_ANTENNA__TRACKING_SUN,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_TrackingPropertyCategory"),
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
		
		// Cast down to a PTUDishAntenna
		PTUDishAntenna ptuDishAntenna = (PTUDishAntenna) object;

		// Basic label for the antenna
		String label = getString("_UI_PTUDishAntenna_type");

		// If the antenna isn't null
		if (ptuDishAntenna != null)
		{
			// Add the pan and tilt angles to the label
			label += " (Pan=" +
					 Math.toDegrees(ptuDishAntenna.getPanAngle()) +
					 DEGREE_SYM + ", Tilt=" +
					 Math.toDegrees(ptuDishAntenna.getTiltAngle()) +
					 DEGREE_SYM + ")";
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

		switch (notification.getFeatureID(PTUDishAntenna.class)) {
			case Symphony__ExamplesAntennaPackage.PTU_DISH_ANTENNA__PAN_ANGLE:
			case Symphony__ExamplesAntennaPackage.PTU_DISH_ANTENNA__TILT_ANGLE:
			case Symphony__ExamplesAntennaPackage.PTU_DISH_ANTENNA__TRACKING_SUN:
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
