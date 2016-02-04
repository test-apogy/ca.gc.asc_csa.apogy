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
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.RectangleShapeImageLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RectangleShapeImageLayerItemProvider extends AbstractShapeImageLayerItemProvider 
{
	protected DecimalFormat decimalFormat = new DecimalFormat("0.0");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangleShapeImageLayerItemProvider(AdapterFactory adapterFactory) {
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

			addRectangleWidthPropertyDescriptor(object);
			addRectangleHeightPropertyDescriptor(object);
			addShowCenterLinesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Rectangle Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRectangleWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangleShapeImageLayer_rectangleWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangleShapeImageLayer_rectangleWidth_feature", "_UI_RectangleShapeImageLayer_type"),
				 ApogyCoreEnvironmentPackage.Literals.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_RECTANGLE_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Rectangle Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRectangleHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangleShapeImageLayer_rectangleHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangleShapeImageLayer_rectangleHeight_feature", "_UI_RectangleShapeImageLayer_type"),
				 ApogyCoreEnvironmentPackage.Literals.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_RECTANGLE_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Center Lines feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowCenterLinesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RectangleShapeImageLayer_showCenterLines_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RectangleShapeImageLayer_showCenterLines_feature", "_UI_RectangleShapeImageLayer_type"),
				 ApogyCoreEnvironmentPackage.Literals.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_RECTANGLE_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This returns RectangleShapeImageLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RectangleShapeImageLayer"));
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
		RectangleShapeImageLayer rectangleShapeImageLayer = (RectangleShapeImageLayer) object;
		
		String label = rectangleShapeImageLayer.getName();
		
		if(label == null || label.length() == 0)
		{
			label = getString("_UI_RectangleShapeImageLayer_type");
		}
		
		label += " (" + decimalFormat.format(rectangleShapeImageLayer.getRectangleWidth()) + " m X " + decimalFormat.format(rectangleShapeImageLayer.getRectangleHeight()) + " m )";
				
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

		switch (notification.getFeatureID(RectangleShapeImageLayer.class)) {
			case ApogyCoreEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_WIDTH:
			case ApogyCoreEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__RECTANGLE_HEIGHT:
			case ApogyCoreEnvironmentPackage.RECTANGLE_SHAPE_IMAGE_LAYER__SHOW_CENTER_LINES:
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
			childFeature == ApogyCoreEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE ||
			childFeature == ApogyCoreEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
