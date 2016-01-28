/**
 * <copyright>
 * </copyright>
 *
 * $Id: RangeScannerSimulatorItemProvider.java,v 1.3.4.2 2015/05/21 15:49:57 pallard Exp $
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RangeScannerSimulator;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.range.RangeScannerSimulator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RangeScannerSimulatorItemProvider
	extends RangeScannerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeScannerSimulatorItemProvider(AdapterFactory adapterFactory) {
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

			addMeshNodePropertyDescriptor(object);
			addNoiseEnabledPropertyDescriptor(object);
			addTimeCroppingMeshPropertyDescriptor(object);
			addTimeFindingIntersectionsPropertyDescriptor(object);
			addTimeGettingSimulatedRaysPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Mesh Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RangeScannerSimulator_meshNode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeScannerSimulator_meshNode_feature", "_UI_RangeScannerSimulator_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RANGE_SCANNER_SIMULATOR__MESH_NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Noise Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoiseEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RangeScannerSimulator_noiseEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeScannerSimulator_noiseEnabled_feature", "_UI_RangeScannerSimulator_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Cropping Mesh feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeCroppingMeshPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RangeScannerSimulator_timeCroppingMesh_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeScannerSimulator_timeCroppingMesh_feature", "_UI_RangeScannerSimulator_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Finding Intersections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeFindingIntersectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RangeScannerSimulator_timeFindingIntersections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeScannerSimulator_timeFindingIntersections_feature", "_UI_RangeScannerSimulator_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time Getting Simulated Rays feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeGettingSimulatedRaysPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RangeScannerSimulator_timeGettingSimulatedRays_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RangeScannerSimulator_timeGettingSimulatedRays_feature", "_UI_RangeScannerSimulator_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RangeScannerSimulator<?>)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_RangeScannerSimulator_type") :
			getString("_UI_RangeScannerSimulator_type") + " " + label;
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

		switch (notification.getFeatureID(RangeScannerSimulator.class)) {
			case ApogyAddonsSensorsRangePackage.RANGE_SCANNER_SIMULATOR__NOISE_ENABLED:
			case ApogyAddonsSensorsRangePackage.RANGE_SCANNER_SIMULATOR__TIME_CROPPING_MESH:
			case ApogyAddonsSensorsRangePackage.RANGE_SCANNER_SIMULATOR__TIME_FINDING_INTERSECTIONS:
			case ApogyAddonsSensorsRangePackage.RANGE_SCANNER_SIMULATOR__TIME_GETTING_SIMULATED_RAYS:
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
