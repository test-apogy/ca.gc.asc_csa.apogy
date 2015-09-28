/**
 */
package ca.gc.space.mrt.sensors.gps.sim.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.sensors.gps.sim.SimPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulatedDataInterpreterItemProvider
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
	public SimulatedDataInterpreterItemProvider(AdapterFactory adapterFactory) {
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

			addUpdateFrequencyPropertyDescriptor(object);
			addStartLatitudePropertyDescriptor(object);
			addStartLongitudePropertyDescriptor(object);
			addLatitudeIncrementPropertyDescriptor(object);
			addLongitudeIncrementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Update Frequency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUpdateFrequencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedDataInterpreter_updateFrequency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedDataInterpreter_updateFrequency_feature", "_UI_SimulatedDataInterpreter_type"),
				 SimPackage.Literals.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Latitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartLatitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedDataInterpreter_startLatitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedDataInterpreter_startLatitude_feature", "_UI_SimulatedDataInterpreter_type"),
				 SimPackage.Literals.SIMULATED_DATA_INTERPRETER__START_LATITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Longitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartLongitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedDataInterpreter_startLongitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedDataInterpreter_startLongitude_feature", "_UI_SimulatedDataInterpreter_type"),
				 SimPackage.Literals.SIMULATED_DATA_INTERPRETER__START_LONGITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Latitude Increment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLatitudeIncrementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedDataInterpreter_latitudeIncrement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedDataInterpreter_latitudeIncrement_feature", "_UI_SimulatedDataInterpreter_type"),
				 SimPackage.Literals.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Longitude Increment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLongitudeIncrementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimulatedDataInterpreter_longitudeIncrement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimulatedDataInterpreter_longitudeIncrement_feature", "_UI_SimulatedDataInterpreter_type"),
				 SimPackage.Literals.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimulatedDataInterpreter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimulatedDataInterpreter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		SimulatedDataInterpreter simulatedDataInterpreter = (SimulatedDataInterpreter)object;
		return getString("_UI_SimulatedDataInterpreter_type") + " " + simulatedDataInterpreter.getUpdateFrequency();
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

		switch (notification.getFeatureID(SimulatedDataInterpreter.class)) {
			case SimPackage.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY:
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LATITUDE:
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LONGITUDE:
			case SimPackage.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT:
			case SimPackage.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimEditPlugin.INSTANCE;
	}

}
