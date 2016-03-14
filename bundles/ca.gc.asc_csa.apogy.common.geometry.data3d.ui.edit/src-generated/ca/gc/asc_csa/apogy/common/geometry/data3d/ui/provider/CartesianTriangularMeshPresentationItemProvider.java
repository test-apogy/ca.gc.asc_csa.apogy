package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.provider;
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
import org.eclipse.swt.graphics.RGB;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.provider.NodePresentationItemProvider;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshPresentationItemProvider extends NodePresentationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshPresentationItemProvider(AdapterFactory adapterFactory) {
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

			addMeshPropertyDescriptor(object);
			addPointSizePropertyDescriptor(object);
			addNumberOfPointsPropertyDescriptor(object);
			addNumberOfPolygonsPropertyDescriptor(object);
			addPresentationModePropertyDescriptor(object);
			addTransparencyPropertyDescriptor(object);
			addUseShadingPropertyDescriptor(object);
			addTextureImagePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mesh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_mesh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_mesh_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MESH,
				 false,
				 false,
				 false,
				 null,
				 getString("_UI_PRESENTATION_INTERNAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_pointSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_pointSize_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__POINT_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_numberOfPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_numberOfPoints_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_MESH_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Polygons feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPolygonsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_numberOfPolygons_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_numberOfPolygons_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 getString("_UI_MESH_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Presentation Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPresentationModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_presentationMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_presentationMode_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Transparency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransparencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_transparency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_transparency_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Shading feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseShadingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_useShading_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_useShading_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_SHADING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Texture Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextureImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshPresentation_textureImage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshPresentation_textureImage_feature", "_UI_CartesianTriangularMeshPresentation_type"),
				 ApogyCommonGeometryData3DUIPackage.Literals.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_VISUAL_INFORMATIONPropertyCategory"),
				 null));
	}

	/**
	 * This returns CartesianTriangularMeshPresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianTriangularMeshPresentation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RGB labelValue = ((CartesianTriangularMeshPresentation)object).getColor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CartesianTriangularMeshPresentation_type") :
			getString("_UI_CartesianTriangularMeshPresentation_type") + " " + label;
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

		switch (notification.getFeatureID(CartesianTriangularMeshPresentation.class)) {
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__MESH:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__POINT_SIZE:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POINTS:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__NUMBER_OF_POLYGONS:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__PRESENTATION_MODE:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TRANSPARENCY:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__USE_SHADING:
			case ApogyCommonGeometryData3DUIPackage.CARTESIAN_TRIANGULAR_MESH_PRESENTATION__TEXTURE_IMAGE:
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
