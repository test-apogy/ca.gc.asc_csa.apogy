/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui.provider;


import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;

import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpacecraftLocationWorldWindLayerItemProvider extends AbstractWorldWindLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftLocationWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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
			addOrbitModelPropertyDescriptor(object);
			addTimeSourcePropertyDescriptor(object);
			addShowGroundProjectionPropertyDescriptor(object);
			addShowLatLonPropertyDescriptor(object);
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
				 EMFEcorePackage.Literals.NAMED__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Orbit Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrbitModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftLocationWorldWindLayer_orbitModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftLocationWorldWindLayer_orbitModel_feature", "_UI_SpacecraftLocationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__ORBIT_MODEL,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_ORBIT_MODELPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftLocationWorldWindLayer_timeSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftLocationWorldWindLayer_timeSource_feature", "_UI_SpacecraftLocationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__TIME_SOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_TIMEPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Ground Projection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowGroundProjectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftLocationWorldWindLayer_showGroundProjection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftLocationWorldWindLayer_showGroundProjection_feature", "_UI_SpacecraftLocationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Show Lat Lon feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShowLatLonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpacecraftLocationWorldWindLayer_showLatLon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpacecraftLocationWorldWindLayer_showLatLon_feature", "_UI_SpacecraftLocationWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SpacecraftLocationWorldWindLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpacecraftLocationWorldWindLayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SpacecraftLocationWorldWindLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SpacecraftLocationWorldWindLayer_type") :
			getString("_UI_SpacecraftLocationWorldWindLayer_type") + " " + label;
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

		switch (notification.getFeatureID(SpacecraftLocationWorldWindLayer.class)) {
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__NAME:
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_GROUND_PROJECTION:
			case SymphonyEarthOrbitEnvironmentUIPackage.SPACECRAFT_LOCATION_WORLD_WIND_LAYER__SHOW_LAT_LON:
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
