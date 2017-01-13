/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.ApogySurfaceEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.surface.ui.MapViewConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MapViewConfigurationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapViewConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addBackgroundColorPropertyDescriptor(object);
			addDefaultRectangularRegionPropertyDescriptor(object);
			addMapImageRectangularRegionPropertyDescriptor(object);
			addExtentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Named_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Named_name_feature", "_UI_Named_type"),
				 ApogyCommonEMFPackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Described_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Described_description_feature", "_UI_Described_type"),
				 ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Background Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBackgroundColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewConfiguration_backgroundColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewConfiguration_backgroundColor_feature", "_UI_MapViewConfiguration_type"),
				 ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Rectangular Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRectangularRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewConfiguration_defaultRectangularRegion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewConfiguration_defaultRectangularRegion_feature", "_UI_MapViewConfiguration_type"),
				 ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__DEFAULT_RECTANGULAR_REGION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Map Image Rectangular Region feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMapImageRectangularRegionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewConfiguration_mapImageRectangularRegion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewConfiguration_mapImageRectangularRegion_feature", "_UI_MapViewConfiguration_type"),
				 ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MapViewConfiguration_extent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MapViewConfiguration_extent_feature", "_UI_MapViewConfiguration_type"),
				 ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__EXTENT,
				 false,
				 false,
				 true,
				 null,
				 null,
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
			childrenFeatures.add(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_LAYERS);
			childrenFeatures.add(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS);
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
	 * This returns MapViewConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MapViewConfiguration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MapViewConfiguration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MapViewConfiguration_type") :
			getString("_UI_MapViewConfiguration_type") + " " + label;
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

		switch (notification.getFeatureID(MapViewConfiguration.class)) {
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__NAME:
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__DESCRIPTION:
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__BACKGROUND_COLOR:
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE:
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_IMAGE_RECTANGULAR_REGION:
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__EXTENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_LAYERS:
			case ApogySurfaceEnvironmentUIPackage.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_LAYERS,
				 ApogySurfaceEnvironmentFactory.eINSTANCE.createImageMapLayerPresentation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS,
				 ApogySurfaceEnvironmentUIFactory.eINSTANCE.createMapRuler()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS,
				 ApogySurfaceEnvironmentUIFactory.eINSTANCE.createFeaturesOfInterestMapLayerPresentation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS,
				 ApogySurfaceEnvironmentUIFactory.eINSTANCE.createTrajectoryPickingTool()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS,
				 ApogySurfaceEnvironmentUIFactory.eINSTANCE.createPoseVariableAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS,
				 ApogySurfaceEnvironmentUIFactory.eINSTANCE.createVariableTrajectoryAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION__MAP_ANNOTATIONS,
				 ApogySurfaceEnvironmentUIFactory.eINSTANCE.createVehicleVariableAnnotation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}