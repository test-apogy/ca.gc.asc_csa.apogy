/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.symphony.environment.orbit.earth.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VisibilityPassSpacecraftPositionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource 
		{
	
	public static final String DEGREE_STRING = 	"\u00b0";	
	
	protected DecimalFormat azimuthFormat = new DecimalFormat("0.0");
	protected DecimalFormat elevationFormat = new DecimalFormat("0.0");
	protected DecimalFormat rangeFormat = new DecimalFormat("0.#");
	
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPassSpacecraftPositionItemProvider(AdapterFactory adapterFactory) {
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

			addTimePropertyDescriptor(object);
			addAzimuthPropertyDescriptor(object);
			addElevationPropertyDescriptor(object);
			addRangePropertyDescriptor(object);
			addRangeRatePropertyDescriptor(object);
			addSpacecraftCrossTrackAnglePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Timed_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Timed_time_feature", "_UI_Timed_type"),
				 Symphony__CommonEMFPackage.Literals.TIMED__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Azimuth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addAzimuthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VisibilityPassSpacecraftPosition_azimuth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VisibilityPassSpacecraftPosition_azimuth_feature", "_UI_VisibilityPassSpacecraftPosition_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Elevation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addElevationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VisibilityPassSpacecraftPosition_elevation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VisibilityPassSpacecraftPosition_elevation_feature", "_UI_VisibilityPassSpacecraftPosition_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VisibilityPassSpacecraftPosition_range_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VisibilityPassSpacecraftPosition_range_feature", "_UI_VisibilityPassSpacecraftPosition_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Range Rate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addRangeRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VisibilityPassSpacecraftPosition_rangeRate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VisibilityPassSpacecraftPosition_rangeRate_feature", "_UI_VisibilityPassSpacecraftPosition_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spacecraft Cross Track Angle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addSpacecraftCrossTrackAnglePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VisibilityPassSpacecraftPosition_spacecraftCrossTrackAngle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VisibilityPassSpacecraftPosition_spacecraftCrossTrackAngle_feature", "_UI_VisibilityPassSpacecraftPosition_type"),
				 SymphonyEarthOrbitEnvironmentPackage.Literals.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns VisibilityPassSpacecraftPosition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VisibilityPassSpacecraftPosition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) 
	{
		VisibilityPassSpacecraftPosition position = (VisibilityPassSpacecraftPosition) object;
		String label = getString("_UI_VisibilityPassSpacecraftPosition_type"); 
		
		try
		{
			label += " (az " + azimuthFormat.format(Math.toDegrees(position.getAzimuth())) + DEGREE_STRING;
			label += ", el " + elevationFormat.format(Math.toDegrees(position.getElevation())) + DEGREE_STRING;
			label += ", range " + rangeFormat.format(position.getRange() * 0.001) + " km)";  
		}
		catch(Throwable t)
		{			
		}
		
		return label;
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

		switch (notification.getFeatureID(VisibilityPassSpacecraftPosition.class)) {
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__TIME:
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__AZIMUTH:
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__ELEVATION:
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE:
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__RANGE_RATE:
			case SymphonyEarthOrbitEnvironmentPackage.VISIBILITY_PASS_SPACECRAFT_POSITION__SPACECRAFT_CROSS_TRACK_ANGLE:
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
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
