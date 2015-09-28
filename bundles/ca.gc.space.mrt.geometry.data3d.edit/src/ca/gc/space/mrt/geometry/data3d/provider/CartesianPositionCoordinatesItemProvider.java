/**
 * Canadian Space Agency 2007.
 *
 * $Id: CartesianPositionCoordinatesItemProvider.java,v 1.3.4.2 2015/05/21 15:50:27 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d.provider;


import java.text.DecimalFormat;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.geometry.data.provider.CoordinatesItemProvider;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianPositionCoordinatesItemProvider
	extends CoordinatesItemProvider 
		{
	
	private DecimalFormat decimalFormat = new DecimalFormat("0.000");
	
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
	public CartesianPositionCoordinatesItemProvider(AdapterFactory adapterFactory) {
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

			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
			addZPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianPositionCoordinates_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianPositionCoordinates_x_feature", "_UI_CartesianPositionCoordinates_type"),
				 Data3dPackage.Literals.CARTESIAN_POSITION_COORDINATES__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianPositionCoordinates_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianPositionCoordinates_y_feature", "_UI_CartesianPositionCoordinates_type"),
				 Data3dPackage.Literals.CARTESIAN_POSITION_COORDINATES__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianPositionCoordinates_z_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianPositionCoordinates_z_feature", "_UI_CartesianPositionCoordinates_type"),
				 Data3dPackage.Literals.CARTESIAN_POSITION_COORDINATES__Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CartesianPositionCoordinates.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianPositionCoordinates"));
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
		CartesianPositionCoordinates coords = (CartesianPositionCoordinates) object;
		
		String label = getString("_UI_CartesianPositionCoordinates_type") + " (";
		label += decimalFormat.format( coords.getX()) + ", ";
		label +=  decimalFormat.format( coords.getY()) + ", ";
		label +=  decimalFormat.format( coords.getZ()) + ")";
		
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

		switch (notification.getFeatureID(CartesianPositionCoordinates.class)) {
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES__X:
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES__Y:
			case Data3dPackage.CARTESIAN_POSITION_COORDINATES__Z:
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
	public ResourceLocator getResourceLocator()
	{
		return Data3dEditPlugin.INSTANCE;
	}

}
