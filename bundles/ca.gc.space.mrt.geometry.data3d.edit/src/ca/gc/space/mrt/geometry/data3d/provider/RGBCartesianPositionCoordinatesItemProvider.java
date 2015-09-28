/**
 * Canadian Space Agency 2008.
 */
package ca.gc.space.mrt.geometry.data3d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.RGBCartesianPositionCoordinates;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.geometry.data3d.RGBCartesianPositionCoordinates} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RGBCartesianPositionCoordinatesItemProvider
	extends CartesianPositionCoordinatesItemProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGBCartesianPositionCoordinatesItemProvider(AdapterFactory adapterFactory) {
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

			addRedPropertyDescriptor(object);
			addGreenPropertyDescriptor(object);
			addBluePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Red feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBCartesianPositionCoordinates_red_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBCartesianPositionCoordinates_red_feature", "_UI_RGBCartesianPositionCoordinates_type"),
				 Data3dPackage.Literals.RGB_CARTESIAN_POSITION_COORDINATES__RED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Green feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGreenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBCartesianPositionCoordinates_green_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBCartesianPositionCoordinates_green_feature", "_UI_RGBCartesianPositionCoordinates_type"),
				 Data3dPackage.Literals.RGB_CARTESIAN_POSITION_COORDINATES__GREEN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Blue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBluePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RGBCartesianPositionCoordinates_blue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RGBCartesianPositionCoordinates_blue_feature", "_UI_RGBCartesianPositionCoordinates_type"),
				 Data3dPackage.Literals.RGB_CARTESIAN_POSITION_COORDINATES__BLUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns RGBCartesianPositionCoordinates.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RGBCartesianPositionCoordinates"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		RGBCartesianPositionCoordinates rgbCartesianPositionCoordinates = (RGBCartesianPositionCoordinates)object;
		return getString("_UI_RGBCartesianPositionCoordinates_type") + " " + rgbCartesianPositionCoordinates.getX();
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

		switch (notification.getFeatureID(RGBCartesianPositionCoordinates.class)) {
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__RED:
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__GREEN:
			case Data3dPackage.RGB_CARTESIAN_POSITION_COORDINATES__BLUE:
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
