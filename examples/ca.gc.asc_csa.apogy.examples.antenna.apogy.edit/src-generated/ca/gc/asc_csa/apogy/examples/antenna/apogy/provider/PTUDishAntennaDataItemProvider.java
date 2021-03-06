package ca.gc.asc_csa.apogy.examples.antenna.apogy.provider;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVFactory;
import ca.gc.asc_csa.apogy.core.provider.ApogyInitializationDataItemProvider;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData;
import ca.gc.asc_csa.apogy.examples.antenna.apogy.ApogyExamplesAntennaApogyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PTUDishAntennaDataItemProvider
extends ApogyInitializationDataItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUDishAntennaDataItemProvider(AdapterFactory adapterFactory)
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

			addFovPropertyDescriptor(object);
			addPanAnglePropertyDescriptor(object);
			addTiltAnglePropertyDescriptor(object);
			addTrackingSunPropertyDescriptor(object);
			addInitializedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Fov feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFovPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PTUDishAntennaData_fov_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntennaData_fov_feature", "_UI_PTUDishAntennaData_type"),
				 ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__FOV,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_FieldOfViewPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Pan Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPanAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PTUDishAntennaData_panAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntennaData_panAngle_feature", "_UI_PTUDishAntennaData_type"),
				 ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__PAN_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Tilt Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTiltAnglePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PTUDishAntennaData_tiltAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntennaData_tiltAngle_feature", "_UI_PTUDishAntennaData_type"),
				 ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__TILT_ANGLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PanTiltUnitPropertyCategory"),
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
				 getString("_UI_PTUDishAntennaData_trackingSun_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntennaData_trackingSun_feature", "_UI_PTUDishAntennaData_type"),
				 ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__TRACKING_SUN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_StatusPropertyCategory"),
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
				 getString("_UI_PTUDishAntennaData_initialized_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PTUDishAntennaData_initialized_feature", "_UI_PTUDishAntennaData_type"),
				 ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__INITIALIZED,
				 true,
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
			childrenFeatures.add(ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__FOV);
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
	 * This returns PTUDishAntennaData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PTUDishAntennaData"));
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
		PTUDishAntennaData ptuDishAntennaData = (PTUDishAntennaData)object;
		return getString("_UI_PTUDishAntennaData_type") + " " + ptuDishAntennaData.getPanAngle();
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

		switch (notification.getFeatureID(PTUDishAntennaData.class)) {
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_DATA__PAN_ANGLE:
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_DATA__TILT_ANGLE:
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_DATA__TRACKING_SUN:
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_DATA__INITIALIZED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyExamplesAntennaApogyPackage.PTU_DISH_ANTENNA_DATA__FOV:
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
				(ApogyExamplesAntennaApogyPackage.Literals.PTU_DISH_ANTENNA_DATA__FOV,
				 ApogyAddonsSensorsFOVFactory.eINSTANCE.createConicalFieldOfView()));
	}

}
