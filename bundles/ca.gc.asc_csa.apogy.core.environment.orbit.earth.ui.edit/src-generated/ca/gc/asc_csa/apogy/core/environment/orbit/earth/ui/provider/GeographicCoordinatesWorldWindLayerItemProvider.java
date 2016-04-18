/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.provider;


import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GeographicCoordinatesWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GeographicCoordinatesWorldWindLayerItemProvider extends AbstractWorldWindLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeographicCoordinatesWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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

			addGeographicCoordinatesListPropertyDescriptor(object);
			addLockSelectionPropertyDescriptor(object);
			addDisplayLocationPropertyDescriptor(object);
			addDisplayedRadiusPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Geographic Coordinates List feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGeographicCoordinatesListPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeographicCoordinatesWorldWindLayer_geographicCoordinatesList_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinatesWorldWindLayer_geographicCoordinatesList_feature", "_UI_GeographicCoordinatesWorldWindLayer_type"),
				 ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__GEOGRAPHIC_COORDINATES_LIST,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lock Selection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLockSelectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeographicCoordinatesWorldWindLayer_lockSelection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinatesWorldWindLayer_lockSelection_feature", "_UI_GeographicCoordinatesWorldWindLayer_type"),
				 ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Display Location feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayLocationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeographicCoordinatesWorldWindLayer_displayLocation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinatesWorldWindLayer_displayLocation_feature", "_UI_GeographicCoordinatesWorldWindLayer_type"),
				 ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_VISUALSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Displayed Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDisplayedRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GeographicCoordinatesWorldWindLayer_displayedRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinatesWorldWindLayer_displayedRadius_feature", "_UI_GeographicCoordinatesWorldWindLayer_type"),
				 ApogyCoreEnvironmentOrbitEarthUIPackage.Literals.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_VISUALSPropertyCategory"),
				 null));
	}

	/**
	 * This returns GeographicCoordinatesWorldWindLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GeographicCoordinatesWorldWindLayer"));
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
		GeographicCoordinatesWorldWindLayer geographicCoordinatesWorldWindLayer = (GeographicCoordinatesWorldWindLayer)object;
		
		String label = getString("_UI_GeographicCoordinatesWorldWindLayer_type");
		
		int size = geographicCoordinatesWorldWindLayer.getGeographicCoordinatesList().size(); 
		if(size > 0)
		{
			label += " [" + size + "]";
		}
				
		String text = getAbstractWorldWindLayerText(geographicCoordinatesWorldWindLayer);
		
		if(text != null)
		{
			label += " (" + text;
			if(geographicCoordinatesWorldWindLayer.isLockSelection())
			{
				label += ", locked";
			}		
			
	
			label += ")";
		}
		
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

		switch (notification.getFeatureID(GeographicCoordinatesWorldWindLayer.class)) {
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__GEOGRAPHIC_COORDINATES_LIST:
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__LOCK_SELECTION:
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAY_LOCATION:
			case ApogyCoreEnvironmentOrbitEarthUIPackage.GEOGRAPHIC_COORDINATES_WORLD_WIND_LAYER__DISPLAYED_RADIUS:
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
