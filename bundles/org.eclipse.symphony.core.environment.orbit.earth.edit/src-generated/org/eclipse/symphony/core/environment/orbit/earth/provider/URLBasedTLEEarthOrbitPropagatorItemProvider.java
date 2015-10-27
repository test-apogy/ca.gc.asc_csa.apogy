/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;
import org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.URLBasedTLEEarthOrbitPropagator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class URLBasedTLEEarthOrbitPropagatorItemProvider extends TLEEarthOrbitPropagatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLBasedTLEEarthOrbitPropagatorItemProvider(AdapterFactory adapterFactory) {
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

			addTleURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tle URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTleURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_URLBasedTLEEarthOrbitPropagator_tleURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_URLBasedTLEEarthOrbitPropagator_tleURL_feature", "_UI_URLBasedTLEEarthOrbitPropagator_type"),
				 Symphony__CoreEnvironmentOrbitEarthPackage.Literals.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_TLE_RAW_DATAPropertyCategory"),
				 null));
	}

	/**
	 * This returns URLBasedTLEEarthOrbitPropagator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/URLBasedTLEEarthOrbitPropagator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((URLBasedTLEEarthOrbitPropagator)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_URLBasedTLEEarthOrbitPropagator_type") :
			getString("_UI_URLBasedTLEEarthOrbitPropagator_type") + " " + label;
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

		switch (notification.getFeatureID(URLBasedTLEEarthOrbitPropagator.class)) {
			case Symphony__CoreEnvironmentOrbitEarthPackage.URL_BASED_TLE_EARTH_ORBIT_PROPAGATOR__TLE_URL:
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
