/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleRasterScanRangeScannerSimulatorItemProvider.java,v 1.2.4.2 2015/05/21 15:49:57 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.range.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.addons.sensors.range.Symphony__AddonsSensorsRangePackage;
import org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.addons.sensors.range.SimpleRasterScanRangeScannerSimulator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRasterScanRangeScannerSimulatorItemProvider
	extends RangeScannerSimulatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRasterScanRangeScannerSimulatorItemProvider(AdapterFactory adapterFactory) {
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

			addRangeNoiseAmplitudePropertyDescriptor(object);
			addAzimuthNoiseAmplitudePropertyDescriptor(object);
			addElevationNoiseAmplitudePropertyDescriptor(object);
			addHorizonDetectionEnabledPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Range Noise Amplitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRangeNoiseAmplitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleRasterScanRangeScannerSimulator_rangeNoiseAmplitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleRasterScanRangeScannerSimulator_rangeNoiseAmplitude_feature", "_UI_SimpleRasterScanRangeScannerSimulator_type"),
				 Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Azimuth Noise Amplitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAzimuthNoiseAmplitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleRasterScanRangeScannerSimulator_azimuthNoiseAmplitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleRasterScanRangeScannerSimulator_azimuthNoiseAmplitude_feature", "_UI_SimpleRasterScanRangeScannerSimulator_type"),
				 Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elevation Noise Amplitude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElevationNoiseAmplitudePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleRasterScanRangeScannerSimulator_elevationNoiseAmplitude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleRasterScanRangeScannerSimulator_elevationNoiseAmplitude_feature", "_UI_SimpleRasterScanRangeScannerSimulator_type"),
				 Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizon Detection Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizonDetectionEnabledPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleRasterScanRangeScannerSimulator_horizonDetectionEnabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleRasterScanRangeScannerSimulator_horizonDetectionEnabled_feature", "_UI_SimpleRasterScanRangeScannerSimulator_type"),
				 Symphony__AddonsSensorsRangePackage.Literals.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SimpleRasterScanRangeScannerSimulator.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleRasterScanRangeScannerSimulator"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SimpleRasterScanRangeScannerSimulator)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_SimpleRasterScanRangeScannerSimulator_type") :
			getString("_UI_SimpleRasterScanRangeScannerSimulator_type") + " " + label;
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

		switch (notification.getFeatureID(SimpleRasterScanRangeScannerSimulator.class)) {
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__RANGE_NOISE_AMPLITUDE:
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__AZIMUTH_NOISE_AMPLITUDE:
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__ELEVATION_NOISE_AMPLITUDE:
			case Symphony__AddonsSensorsRangePackage.SIMPLE_RASTER_SCAN_RANGE_SCANNER_SIMULATOR__HORIZON_DETECTION_ENABLED:
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
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Symphony__CommonTopologyPackage.Literals.GROUP_NODE__CHILDREN ||
			childFeature == Symphony__CommonTopologyPackage.Literals.AGGREGATE_GROUP_NODE__AGGREGATED_CHILDREN;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
