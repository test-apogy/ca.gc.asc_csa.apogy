package ca.gc.asc_csa.apogy.common.geometry.data3d.provider;
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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianPositionCoordinates} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ColoredCartesianPositionCoordinatesItemProvider extends CartesianPositionCoordinatesItemProvider 
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.000");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredCartesianPositionCoordinatesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAlphaPropertyDescriptor(object);
			addRedPropertyDescriptor(object);
			addGreenPropertyDescriptor(object);
			addBluePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Alpha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlphaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBAColor_alpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBAColor_alpha_feature", "_UI_RGBAColor_type"),
				 ApogyCommonGeometryData3DPackage.Literals.RGBA_COLOR__ALPHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_ColorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Red feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBAColor_red_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBAColor_red_feature", "_UI_RGBAColor_type"),
				 ApogyCommonGeometryData3DPackage.Literals.RGBA_COLOR__RED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_ColorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Green feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGreenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBAColor_green_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBAColor_green_feature", "_UI_RGBAColor_type"),
				 ApogyCommonGeometryData3DPackage.Literals.RGBA_COLOR__GREEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_ColorPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Blue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBluePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBAColor_blue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBAColor_blue_feature", "_UI_RGBAColor_type"),
				 ApogyCommonGeometryData3DPackage.Literals.RGBA_COLOR__BLUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_ColorPropertyCategory"),
				 null));
	}

	/**
	 * This returns ColoredCartesianPositionCoordinates.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ColoredCartesianPositionCoordinates"));
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
		ColoredCartesianPositionCoordinates coords = (ColoredCartesianPositionCoordinates)object;
		
		String label = getString("_UI_ColoredCartesianPositionCoordinates_type") + " (";
		label += decimalFormat.format( coords.getX()) + ", ";
		label +=  decimalFormat.format( coords.getY()) + ", ";
		label +=  decimalFormat.format( coords.getZ()) + ", RGB ";
		
		label += coords.getRed() + ", " + coords.getGreen() + ", " + coords.getBlue() + ")";
		
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
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ColoredCartesianPositionCoordinates.class)) {
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__ALPHA:
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__RED:
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__GREEN:
			case ApogyCommonGeometryData3DPackage.COLORED_CARTESIAN_POSITION_COORDINATES__BLUE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
