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
package ca.gc.asc_csa.apogy.core.environment.surface.provider;


import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;

import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.surface.ImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageMapLayerItemProvider extends AbstractMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayerItemProvider(AdapterFactory adapterFactory) {
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

			addWidthPropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addOpaquePropertyDescriptor(object);
			addResolutionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_width_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_width_feature", "_UI_ImageMapLayer_type"),
				 ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SIZE_AND_RESOLUTIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_height_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_height_feature", "_UI_ImageMapLayer_type"),
				 ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SIZE_AND_RESOLUTIONPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Opaque feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpaquePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_opaque_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_opaque_feature", "_UI_ImageMapLayer_type"),
				 ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__OPAQUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ImageMapLayer_resolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayer_resolution_feature", "_UI_ImageMapLayer_type"),
				 ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__RESOLUTION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_SIZE_AND_RESOLUTIONPropertyCategory"),
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
			childrenFeatures.add(ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE);
			childrenFeatures.add(ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND);
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
	 * This returns ImageMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageMapLayer"));
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
		ImageMapLayer imageMapLayer = (ImageMapLayer) object;
		
		String label = ((ImageMapLayer)object).getName();
		if(imageMapLayer.getName() != null && imageMapLayer.getName().length() > 0)
		{
			label = imageMapLayer.getName();
		}
		else
		{
			label = getString("_UI_ImageMapLayer_type");
		}
		
		return label ;	
			
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

		switch (notification.getFeatureID(ImageMapLayer.class)) {
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__WIDTH:
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__HEIGHT:
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__OPAQUE:
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__RESOLUTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__IMAGE:
			case ApogySurfaceEnvironmentPackage.IMAGE_MAP_LAYER__LEGEND:
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
				(ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE,
				 ApogyCommonImagesFactory.eINSTANCE.createEImage()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE,
				 ApogyCommonImagesFactory.eINSTANCE.createURLEImage()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND,
				 ApogyCommonImagesFactory.eINSTANCE.createEImage()));

		newChildDescriptors.add
			(createChildParameter
				(ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND,
				 ApogyCommonImagesFactory.eINSTANCE.createURLEImage()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE ||
			childFeature == ApogySurfaceEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
