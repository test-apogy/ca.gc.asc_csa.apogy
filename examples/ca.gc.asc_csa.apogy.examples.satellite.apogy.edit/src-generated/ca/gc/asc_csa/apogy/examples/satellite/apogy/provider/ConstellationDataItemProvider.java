package ca.gc.asc_csa.apogy.examples.satellite.apogy.provider;
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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;

import ca.gc.asc_csa.apogy.core.provider.ApogyInitializationDataItemProvider;

import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstellationDataItemProvider extends ApogyInitializationDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDataItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__SATELLITES_LIST);
			childrenFeatures.add(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST);
			childrenFeatures.add(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__DOWNLINKS_LISTS);
			childrenFeatures.add(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST);
			childrenFeatures.add(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST);
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
	 * This returns ConstellationData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstellationData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConstellationData_type");
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

		switch (notification.getFeatureID(ConstellationData.class)) {
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS:
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST:
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST:
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
				(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__SATELLITES_LIST,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createSatellitesList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStationReferencesList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__DOWNLINKS_LISTS,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationDownlinksList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationRequestsList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationCommandPlansList()));
	}

}
