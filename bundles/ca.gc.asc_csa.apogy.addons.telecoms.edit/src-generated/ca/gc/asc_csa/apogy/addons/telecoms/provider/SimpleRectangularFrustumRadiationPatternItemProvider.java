package ca.gc.asc_csa.apogy.addons.telecoms.provider;
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
import ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern;
import ca.gc.asc_csa.apogy.addons.telecoms.ApogyAddonsTelecomsPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.telecoms.SimpleRectangularFrustumRadiationPattern} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRectangularFrustumRadiationPatternItemProvider extends AbstractAntennaRadiationPatternItemProvider 
{
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRectangularFrustumRadiationPatternItemProvider(AdapterFactory adapterFactory) {
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

			addHorizontalFieldOfViewPropertyDescriptor(object);
			addVerticalFieldOfViewPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Horizontal Field Of View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalFieldOfViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleRectangularFrustumRadiationPattern_horizontalFieldOfView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleRectangularFrustumRadiationPattern_horizontalFieldOfView_feature", "_UI_SimpleRectangularFrustumRadiationPattern_type"),
				 ApogyAddonsTelecomsPackage.Literals.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Field Of View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalFieldOfViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleRectangularFrustumRadiationPattern_verticalFieldOfView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleRectangularFrustumRadiationPattern_verticalFieldOfView_feature", "_UI_SimpleRectangularFrustumRadiationPattern_type"),
				 ApogyAddonsTelecomsPackage.Literals.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimpleRectangularFrustumRadiationPattern.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleRectangularFrustumRadiationPattern"));
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
		SimpleRectangularFrustumRadiationPattern simpleRectangularFrustumRadiationPattern = (SimpleRectangularFrustumRadiationPattern) object;
		
		String label = simpleRectangularFrustumRadiationPattern.getName();
		if(label == null || label.length() == 0)
		{
			label = getString("_UI_SimpleRectangularFrustumRadiationPattern_type");
		}

		label += " (" + decimalFormat.format(Math.toDegrees(simpleRectangularFrustumRadiationPattern.getHorizontalFieldOfView())) + " deg h X " +
				 decimalFormat.format(Math.toDegrees(simpleRectangularFrustumRadiationPattern.getVerticalFieldOfView())) + " v deg )";
		
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

		switch (notification.getFeatureID(SimpleRectangularFrustumRadiationPattern.class)) {
			case ApogyAddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__HORIZONTAL_FIELD_OF_VIEW:
			case ApogyAddonsTelecomsPackage.SIMPLE_RECTANGULAR_FRUSTUM_RADIATION_PATTERN__VERTICAL_FIELD_OF_VIEW:
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
