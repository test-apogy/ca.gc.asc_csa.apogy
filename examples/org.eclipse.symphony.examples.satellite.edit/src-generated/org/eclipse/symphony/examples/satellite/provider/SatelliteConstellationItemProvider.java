/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.provider;


import java.util.Collection;
import java.util.Date;
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
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthFactory;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatelliteFactory;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;
import org.eclipse.symphony.examples.satellite.SatelliteConstellation;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.examples.satellite.SatelliteConstellation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SatelliteConstellationItemProvider 
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
	public SatelliteConstellationItemProvider(AdapterFactory adapterFactory) {
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

			addSatellitesPropertyDescriptor(object);
			addGroundStationsPropertyDescriptor(object);
			addPendingImageOrdersPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
			addEndDatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Satellites feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSatellitesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SatelliteConstellation_satellites_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SatelliteConstellation_satellites_feature", "_UI_SatelliteConstellation_type"),
				 Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__SATELLITES,
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
				 getString("_UI_SatelliteConstellation_groundStations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SatelliteConstellation_groundStations_feature", "_UI_SatelliteConstellation_type"),
				 Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__GROUND_STATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pending Image Orders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPendingImageOrdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SatelliteConstellation_pendingImageOrders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SatelliteConstellation_pendingImageOrders_feature", "_UI_SatelliteConstellation_type"),
				 Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SatelliteConstellation_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SatelliteConstellation_startDate_feature", "_UI_SatelliteConstellation_type"),
				 Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SatelliteConstellation_endDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SatelliteConstellation_endDate_feature", "_UI_SatelliteConstellation_type"),
				 Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__END_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__SATELLITES);
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
	 * This returns SatelliteConstellation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SatelliteConstellation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Date labelValue = ((SatelliteConstellation)object).getStartDate();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SatelliteConstellation_type") :
			getString("_UI_SatelliteConstellation_type") + " " + label;
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

		switch (notification.getFeatureID(SatelliteConstellation.class)) {
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION__GROUND_STATIONS:
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS:
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION__START_DATE:
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION__END_DATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE_CONSTELLATION__SATELLITES:
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
				(Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__SATELLITES,
				 Symphony__ExamplesSatelliteFactory.eINSTANCE.createSatelliteSimulated()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__SATELLITES,
				 Symphony__ExamplesSatelliteFactory.eINSTANCE.createSatelliteStub()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__GROUND_STATIONS,
				 Symphony__CoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStation()));

		newChildDescriptors.add
			(createChildParameter
				(Symphony__ExamplesSatellitePackage.Literals.SATELLITE_CONSTELLATION__PENDING_IMAGE_ORDERS,
				 Symphony__ExamplesSatelliteFactory.eINSTANCE.createImageOrder()));
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
