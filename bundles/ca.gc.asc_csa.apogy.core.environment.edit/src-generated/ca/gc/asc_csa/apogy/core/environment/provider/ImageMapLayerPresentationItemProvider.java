package ca.gc.asc_csa.apogy.core.environment.provider;
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
import ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayerPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageMapLayerPresentationItemProvider extends MapLayerPresentationItemProvider 
{
	protected DecimalFormat alphaDecimalFormat = new DecimalFormat("0.00");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageMapLayerPresentationItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_ImageMapLayerPresentation_alpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ImageMapLayerPresentation_alpha_feature", "_UI_ImageMapLayerPresentation_type"),
				 ApogyCoreEnvironmentPackage.Literals.IMAGE_MAP_LAYER_PRESENTATION__ALPHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_PRESENTATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This returns ImageMapLayerPresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ImageMapLayerPresentation"));
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
		ImageMapLayerPresentation imageMapLayerPresentation = (ImageMapLayerPresentation) object;
		
		String label = null;
		
		if(imageMapLayerPresentation.getName() != null && imageMapLayerPresentation.getName().length() > 0)
		{
			label = imageMapLayerPresentation.getName();
		}
		else
		{
			label = getString("_UI_ImageMapLayerPresentation_type");
		}
		
		label += " (" + getImageMapLayerPresentationText(imageMapLayerPresentation) + ")";
		
		return label;
	}
	
	protected String getImageMapLayerPresentationText(ImageMapLayerPresentation imageMapLayerPresentation)
	{
		String text = getMapLayerPresentationText(imageMapLayerPresentation);
	
		if(text.length() > 0)
		{
			text += ", ";			
		}
		
		text += alphaDecimalFormat.format(imageMapLayerPresentation.getAlpha());
		
		return text;
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

		switch (notification.getFeatureID(ImageMapLayerPresentation.class)) {
			case ApogyCoreEnvironmentPackage.IMAGE_MAP_LAYER_PRESENTATION__ALPHA:
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
