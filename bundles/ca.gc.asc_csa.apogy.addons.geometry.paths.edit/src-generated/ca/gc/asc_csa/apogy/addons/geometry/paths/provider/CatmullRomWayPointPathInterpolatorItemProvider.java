package ca.gc.asc_csa.apogy.addons.geometry.paths.provider;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator;
import ca.gc.asc_csa.apogy.addons.geometry.paths.ApogyAddonsGeometryPathsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.geometry.paths.CatmullRomWayPointPathInterpolator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CatmullRomWayPointPathInterpolatorItemProvider
	extends WayPointPathInterpolatorItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatmullRomWayPointPathInterpolatorItemProvider(AdapterFactory adapterFactory)
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

			addTensionPropertyDescriptor(object);
			addMaximumWayPointsDistancePropertyDescriptor(object);
			addEndControlPointGenerationModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTensionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CatmullRomWayPointPathInterpolator_tension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CatmullRomWayPointPathInterpolator_tension_feature", "_UI_CatmullRomWayPointPathInterpolator_type"),
				 ApogyAddonsGeometryPathsPackage.Literals.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Way Points Distance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumWayPointsDistancePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CatmullRomWayPointPathInterpolator_maximumWayPointsDistance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CatmullRomWayPointPathInterpolator_maximumWayPointsDistance_feature", "_UI_CatmullRomWayPointPathInterpolator_type"),
				 ApogyAddonsGeometryPathsPackage.Literals.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Control Point Generation Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndControlPointGenerationModePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CatmullRomWayPointPathInterpolator_endControlPointGenerationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CatmullRomWayPointPathInterpolator_endControlPointGenerationMode_feature", "_UI_CatmullRomWayPointPathInterpolator_type"),
				 ApogyAddonsGeometryPathsPackage.Literals.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CatmullRomWayPointPathInterpolator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CatmullRomWayPointPathInterpolator"));
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
		IProgressMonitor labelValue = ((CatmullRomWayPointPathInterpolator)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CatmullRomWayPointPathInterpolator_type") :
			getString("_UI_CatmullRomWayPointPathInterpolator_type") + " " + label;
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

		switch (notification.getFeatureID(CatmullRomWayPointPathInterpolator.class)) {
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__TENSION:
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__MAXIMUM_WAY_POINTS_DISTANCE:
			case ApogyAddonsGeometryPathsPackage.CATMULL_ROM_WAY_POINT_PATH_INTERPOLATOR__END_CONTROL_POINT_GENERATION_MODE:
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
