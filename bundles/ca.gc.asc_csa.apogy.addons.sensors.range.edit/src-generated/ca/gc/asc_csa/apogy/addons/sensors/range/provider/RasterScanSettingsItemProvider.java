/**
 * <copyright>
 * </copyright>
 *
 * $Id: RasterScanSettingsItemProvider.java,v 1.2.4.2 2015/05/21 15:49:57 pallard Exp $
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
import ca.gc.asc_csa.apogy.addons.sensors.fov.provider.RectangularFrustrumFieldOfViewItemProvider;
import ca.gc.asc_csa.apogy.addons.sensors.range.ApogyAddonsSensorsRangePackage;
import ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.addons.sensors.range.RasterScanSettings} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RasterScanSettingsItemProvider
	extends RectangularFrustrumFieldOfViewItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RasterScanSettingsItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addVerticalResolutionPropertyDescriptor(object);
			addHorizontalResolutionPropertyDescriptor(object);
			addNumberOfPointsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vertical Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalResolutionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RasterScanSettings_verticalResolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RasterScanSettings_verticalResolution_feature", "_UI_RasterScanSettings_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Resolution feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalResolutionPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RasterScanSettings_horizontalResolution_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RasterScanSettings_horizontalResolution_feature", "_UI_RasterScanSettings_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Points feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfPointsPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RasterScanSettings_numberOfPoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RasterScanSettings_numberOfPoints_feature", "_UI_RasterScanSettings_type"),
				 ApogyAddonsSensorsRangePackage.Literals.RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RasterScanSettings.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RasterScanSettings"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((RasterScanSettings)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_RasterScanSettings_type") :
			getString("_UI_RasterScanSettings_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(RasterScanSettings.class)) {
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__VERTICAL_RESOLUTION:
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__HORIZONTAL_RESOLUTION:
			case ApogyAddonsSensorsRangePackage.RASTER_SCAN_SETTINGS__NUMBER_OF_POINTS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
