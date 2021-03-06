package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.provider;
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
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DistanceAndRoverFootprintCostFunctionItemProvider
	extends DistanceAndSlopesCostFunctionItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceAndRoverFootprintCostFunctionItemProvider(AdapterFactory adapterFactory)
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

			addRoverFootPrintRadiusPropertyDescriptor(object);
			addMaximumRoughnessPropertyDescriptor(object);
			addMaximumCrossSlopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rover Foot Print Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRoverFootPrintRadiusPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndRoverFootprintCostFunction_roverFootPrintRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndRoverFootprintCostFunction_roverFootPrintRadius_feature", "_UI_DistanceAndRoverFootprintCostFunction_type"),
				 ApogyAddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Roughness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumRoughnessPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndRoverFootprintCostFunction_maximumRoughness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndRoverFootprintCostFunction_maximumRoughness_feature", "_UI_DistanceAndRoverFootprintCostFunction_type"),
				 ApogyAddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Cross Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumCrossSlopePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DistanceAndRoverFootprintCostFunction_maximumCrossSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DistanceAndRoverFootprintCostFunction_maximumCrossSlope_feature", "_UI_DistanceAndRoverFootprintCostFunction_type"),
				 ApogyAddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DistanceAndRoverFootprintCostFunction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DistanceAndRoverFootprintCostFunction"));
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
		DistanceAndRoverFootprintCostFunction distanceAndRoverFootprintCostFunction = (DistanceAndRoverFootprintCostFunction)object;
		return getString("_UI_DistanceAndRoverFootprintCostFunction_type") + " " + distanceAndRoverFootprintCostFunction.getUpSlopeCostFactor();
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

		switch (notification.getFeatureID(DistanceAndRoverFootprintCostFunction.class)) {
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__ROVER_FOOT_PRINT_RADIUS:
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_ROUGHNESS:
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_ROVER_FOOTPRINT_COST_FUNCTION__MAXIMUM_CROSS_SLOPE:
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
