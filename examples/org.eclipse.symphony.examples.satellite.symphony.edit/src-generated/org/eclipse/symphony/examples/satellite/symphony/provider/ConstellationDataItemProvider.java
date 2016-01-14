/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015-2016
 */
package org.eclipse.symphony.examples.satellite.symphony.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthFactory;

import org.eclipse.symphony.core.provider.SymphonyInitializationDataItemProvider;

import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatelliteFactory;
import org.eclipse.symphony.examples.satellite.symphony.ConstellationData;
import org.eclipse.symphony.examples.satellite.symphony.Symphony__ExamplesSatelliteSymphonyPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.satellite.symphony.ConstellationData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstellationDataItemProvider extends SymphonyInitializationDataItemProvider {
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
			childrenFeatures.add(Symphony__ExamplesSatelliteSymphonyPackage.Literals.CONSTELLATION_DATA__SATELLITES_LIST);
			childrenFeatures.add(Symphony__ExamplesSatelliteSymphonyPackage.Literals.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST);
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
			case Symphony__ExamplesSatelliteSymphonyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
			case Symphony__ExamplesSatelliteSymphonyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
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
				(Symphony__ExamplesSatelliteSymphonyPackage.Literals.CONSTELLATION_DATA__SATELLITES_LIST,
				 Symphony__ExamplesSatelliteFactory.eINSTANCE.createSatellitesList()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__ExamplesSatelliteSymphonyPackage.Literals.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST,
				 Symphony__CoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStationReferencesList()));
	}

}
