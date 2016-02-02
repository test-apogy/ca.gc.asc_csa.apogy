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


import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler;
import ca.gc.asc_csa.apogy.common.processors.provider.ProcessorItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VoxelBased3DPointCloudResamplerItemProvider
	extends ProcessorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoxelBased3DPointCloudResamplerItemProvider(AdapterFactory adapterFactory) {
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

			addResolutionXPropertyDescriptor(object);
			addResolutionYPropertyDescriptor(object);
			addResolutionZPropertyDescriptor(object);
			addMinimumNumberOfPointPerVoxelPropertyDescriptor(object);
			addTileResolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Resolution X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VoxelBased3DPointCloudResampler_resolutionX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VoxelBased3DPointCloudResampler_resolutionX_feature", "_UI_VoxelBased3DPointCloudResampler_type"),
				 ApogyCommonGeometryData3DPackage.Literals.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VoxelBased3DPointCloudResampler_resolutionY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VoxelBased3DPointCloudResampler_resolutionY_feature", "_UI_VoxelBased3DPointCloudResampler_type"),
				 ApogyCommonGeometryData3DPackage.Literals.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VoxelBased3DPointCloudResampler_resolutionZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VoxelBased3DPointCloudResampler_resolutionZ_feature", "_UI_VoxelBased3DPointCloudResampler_type"),
				 ApogyCommonGeometryData3DPackage.Literals.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Number Of Point Per Voxel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumNumberOfPointPerVoxelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VoxelBased3DPointCloudResampler_minimumNumberOfPointPerVoxel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VoxelBased3DPointCloudResampler_minimumNumberOfPointPerVoxel_feature", "_UI_VoxelBased3DPointCloudResampler_type"),
				 ApogyCommonGeometryData3DPackage.Literals.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tile Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTileResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VoxelBased3DPointCloudResampler_tileResolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VoxelBased3DPointCloudResampler_tileResolution_feature", "_UI_VoxelBased3DPointCloudResampler_type"),
				 ApogyCommonGeometryData3DPackage.Literals.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns VoxelBased3DPointCloudResampler.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VoxelBased3DPointCloudResampler"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IProgressMonitor labelValue = ((VoxelBased3DPointCloudResampler)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_VoxelBased3DPointCloudResampler_type") :
			getString("_UI_VoxelBased3DPointCloudResampler_type") + " " + label;
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

		switch (notification.getFeatureID(VoxelBased3DPointCloudResampler.class)) {
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_X:
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Y:
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__RESOLUTION_Z:
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__MINIMUM_NUMBER_OF_POINT_PER_VOXEL:
			case ApogyCommonGeometryData3DPackage.VOXEL_BASED3_DPOINT_CLOUD_RESAMPLER__TILE_RESOLUTION:
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
