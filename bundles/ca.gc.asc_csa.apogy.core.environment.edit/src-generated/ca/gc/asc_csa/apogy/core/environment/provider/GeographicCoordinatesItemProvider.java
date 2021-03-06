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
import org.eclipse.emf.common.util.ResourceLocator;
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
import ca.gc.asc_csa.apogy.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class GeographicCoordinatesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	public static final String DEGREE_STRING = "\u00b0";
	private DecimalFormat decimalFormat = new DecimalFormat("0.0###########");

	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GeographicCoordinatesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLongitudePropertyDescriptor(object);
			addLatitudePropertyDescriptor(object);
			addElevationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Longitude feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addLongitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), 
				getResourceLocator(),
				getString("_UI_GeographicCoordinates_longitude_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinates_longitude_feature",
						"_UI_GeographicCoordinates_type"),
				ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LONGITUDE, 
				true, 
				false, 
				false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, 
				getString("_UI_GEOGRAPHIC_COORDINATESPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Latitude feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addLatitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GeographicCoordinates_latitude_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinates_latitude_feature",
						"_UI_GeographicCoordinates_type"),
				ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__LATITUDE, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_GEOGRAPHIC_COORDINATESPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Elevation feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addElevationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_GeographicCoordinates_elevation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_GeographicCoordinates_elevation_feature",
						"_UI_GeographicCoordinates_type"),
				ApogyCoreEnvironmentPackage.Literals.GEOGRAPHIC_COORDINATES__ELEVATION, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, getString("_UI_GEOGRAPHIC_COORDINATESPropertyCategory"),
				null));
	}

	/**
	 * This returns GeographicCoordinates.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GeographicCoordinates"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		GeographicCoordinates geographicCoordinates = (GeographicCoordinates) object;
		String string = getString("_UI_GeographicCoordinates_type");
		string += getSuffix(geographicCoordinates);
		return string;
	}

	protected String getSuffix(GeographicCoordinates geographicCoordinates)
	{
		String string = " (" + decimalFormat.format(Math.toDegrees(geographicCoordinates.getLatitude())) + DEGREE_STRING;
		string += ", ";
		string += decimalFormat.format(Math.toDegrees(geographicCoordinates.getLongitude())) + DEGREE_STRING + ")";
		return string;
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GeographicCoordinates.class)) {
			case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LONGITUDE:
			case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__LATITUDE:
			case ApogyCoreEnvironmentPackage.GEOGRAPHIC_COORDINATES__ELEVATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
