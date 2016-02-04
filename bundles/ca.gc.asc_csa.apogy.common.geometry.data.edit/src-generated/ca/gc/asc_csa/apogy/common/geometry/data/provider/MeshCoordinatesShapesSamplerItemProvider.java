package ca.gc.asc_csa.apogy.common.geometry.data.provider;
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
import ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage;
import ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler;
import ca.gc.asc_csa.apogy.common.processors.provider.ProcessorItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MeshCoordinatesShapesSamplerItemProvider
	extends ProcessorItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshCoordinatesShapesSamplerItemProvider(AdapterFactory adapterFactory)
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

			addCoordinatesSamplingShapesPropertyDescriptor(object);
			addShapeSamplingModePropertyDescriptor(object);
			addPolygonSamplingModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Coordinates Sampling Shapes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCoordinatesSamplingShapesPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MeshCoordinatesShapesSampler_coordinatesSamplingShapes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MeshCoordinatesShapesSampler_coordinatesSamplingShapes_feature", "_UI_MeshCoordinatesShapesSampler_type"),
				 ApogyCommonGeometryDataPackage.Literals.MESH_COORDINATES_SHAPES_SAMPLER__COORDINATES_SAMPLING_SHAPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shape Sampling Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShapeSamplingModePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MeshCoordinatesShapesSampler_shapeSamplingMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MeshCoordinatesShapesSampler_shapeSamplingMode_feature", "_UI_MeshCoordinatesShapesSampler_type"),
				 ApogyCommonGeometryDataPackage.Literals.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Polygon Sampling Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPolygonSamplingModePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MeshCoordinatesShapesSampler_polygonSamplingMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MeshCoordinatesShapesSampler_polygonSamplingMode_feature", "_UI_MeshCoordinatesShapesSampler_type"),
				 ApogyCommonGeometryDataPackage.Literals.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
		IProgressMonitor labelValue = ((MeshCoordinatesShapesSampler<?, ?>)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_MeshCoordinatesShapesSampler_type") :
			getString("_UI_MeshCoordinatesShapesSampler_type") + " " + label;
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

		switch (notification.getFeatureID(MeshCoordinatesShapesSampler.class)) {
			case ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__SHAPE_SAMPLING_MODE:
			case ApogyCommonGeometryDataPackage.MESH_COORDINATES_SHAPES_SAMPLER__POLYGON_SAMPLING_MODE:
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
