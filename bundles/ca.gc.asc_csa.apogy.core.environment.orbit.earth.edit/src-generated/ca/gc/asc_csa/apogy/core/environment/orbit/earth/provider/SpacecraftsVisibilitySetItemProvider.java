package ca.gc.asc_csa.apogy.core.environment.orbit.earth.provider;
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
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacecraftsVisibilitySetItemProvider 
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
	public SpacecraftsVisibilitySetItemProvider(AdapterFactory adapterFactory) {
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
			addUpdatingPropertyDescriptor(object);
			addAutoUpdateEnabledPropertyDescriptor(object);
			addStartTimePropertyDescriptor(object);
			addEndTimePropertyDescriptor(object);
			addOrbitModelsPropertyDescriptor(object);
			addGroundStationsPropertyDescriptor(object);
			addPassesPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Updating feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdatingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatable_updating_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatable_updating_feature", "_UI_Updatable_type"),
				 ApogyCorePackage.Literals.UPDATABLE__UPDATING,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_UPDATABLEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Auto Update Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoUpdateEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Updatable_autoUpdateEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Updatable_autoUpdateEnabled_feature", "_UI_Updatable_type"),
				 ApogyCorePackage.Literals.UPDATABLE__AUTO_UPDATE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_UPDATABLEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftsVisibilitySet_startTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftsVisibilitySet_startTime_feature", "_UI_SpacecraftsVisibilitySet_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__START_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TIME_PERIODPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the End Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftsVisibilitySet_endTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftsVisibilitySet_endTime_feature", "_UI_SpacecraftsVisibilitySet_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__END_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TIME_PERIODPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Orbit Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrbitModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftsVisibilitySet_orbitModels_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftsVisibilitySet_orbitModels_feature", "_UI_SpacecraftsVisibilitySet_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ground Stations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGroundStationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftsVisibilitySet_groundStations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftsVisibilitySet_groundStations_feature", "_UI_SpacecraftsVisibilitySet_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Passes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftsVisibilitySet_passes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftsVisibilitySet_passes_feature", "_UI_SpacecraftsVisibilitySet_type"),
				 ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__PASSES,
				 false,
				 false,
				 false,
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
			childrenFeatures.add(ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS);
			childrenFeatures.add(ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS);
			childrenFeatures.add(ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__PASSES);
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
	 * This returns SpacecraftsVisibilitySet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpacecraftsVisibilitySet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SpacecraftsVisibilitySet)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SpacecraftsVisibilitySet_type") :
			getString("_UI_SpacecraftsVisibilitySet_type") + " " + label;
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

		switch (notification.getFeatureID(SpacecraftsVisibilitySet.class)) {
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__NAME:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__DESCRIPTION:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__UPDATING:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__AUTO_UPDATE_ENABLED:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__START_TIME:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__END_TIME:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATION_TO_VISIBILITY_MAP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__ORBIT_MODELS:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__GROUND_STATIONS:
			case ApogyCoreEnvironmentOrbitEarthPackage.SPACECRAFTS_VISIBILITY_SET__PASSES:
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
				(ApogyCoreEnvironmentOrbitEarthPackage.Literals.SPACECRAFTS_VISIBILITY_SET__PASSES,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createVisibilityPass()));
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
