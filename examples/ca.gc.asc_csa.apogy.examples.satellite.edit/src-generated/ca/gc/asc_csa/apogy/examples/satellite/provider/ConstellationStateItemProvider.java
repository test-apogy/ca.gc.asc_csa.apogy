/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.provider;


import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;

import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationState} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstellationStateItemProvider 
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
	public ConstellationStateItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST);
			childrenFeatures.add(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__SATELLITES_LIST);
			childrenFeatures.add(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST);
			childrenFeatures.add(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__DOWNLINKS_LISTS);
			childrenFeatures.add(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LISTS_CONTAINER);
			childrenFeatures.add(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__CONSTELLATION_PLANNERS_CONTAINER);
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
	 * This returns ConstellationState.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConstellationState"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ConstellationState_type");
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

		switch (notification.getFeatureID(ConstellationState.class)) {
			case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST:
			case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__SATELLITES_LIST:
			case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST:
			case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__DOWNLINKS_LISTS:
			case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LISTS_CONTAINER:
			case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNERS_CONTAINER:
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
				(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationCommandPlansList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__SATELLITES_LIST,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createSatellitesList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST,
				 ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStationReferencesList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__DOWNLINKS_LISTS,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationDownlinksList()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LISTS_CONTAINER,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationRequestsListsContainer()));

		newChildDescriptors.add
			(createChildParameter
				(ApogyExamplesSatellitePackage.Literals.CONSTELLATION_STATE__CONSTELLATION_PLANNERS_CONTAINER,
				 ApogyExamplesSatelliteFactory.eINSTANCE.createConstellationPlannersContainer()));
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
