/**
 * Canadian Space Agency 2008.
 */
package org.eclipse.symphony.common.geometry.data3d.provider;


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
import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.Data3dPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianCoordinatesSetExtentItemProvider 
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
	public CartesianCoordinatesSetExtentItemProvider(AdapterFactory adapterFactory) {
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

			addXMinPropertyDescriptor(object);
			addXMaxPropertyDescriptor(object);
			addYMinPropertyDescriptor(object);
			addYMaxPropertyDescriptor(object);
			addZMinPropertyDescriptor(object);
			addZMaxPropertyDescriptor(object);
			addXDimensionPropertyDescriptor(object);
			addYDimensionPropertyDescriptor(object);
			addZDimensionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the XMin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_xMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_xMin_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__XMIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XMax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_xMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_xMax_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__XMAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YMin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_yMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_yMin_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__YMIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YMax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_yMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_yMax_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__YMAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZMin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZMinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_zMin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_zMin_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZMax feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZMaxPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_zMax_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_zMax_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the XDimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_xDimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_xDimension_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the YDimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_yDimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_yDimension_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ZDimension feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addZDimensionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianCoordinatesSetExtent_zDimension_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianCoordinatesSetExtent_zDimension_feature", "_UI_CartesianCoordinatesSetExtent_type"),
				 Data3dPackage.Literals.CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CartesianCoordinatesSetExtent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianCoordinatesSetExtent"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CartesianCoordinatesSetExtent cartesianCoordinatesSetExtent = (CartesianCoordinatesSetExtent)object;
		return getString("_UI_CartesianCoordinatesSetExtent_type") + " " + cartesianCoordinatesSetExtent.getXMin();
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

		switch (notification.getFeatureID(CartesianCoordinatesSetExtent.class)) {
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMIN:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XMAX:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMIN:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YMAX:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMIN:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZMAX:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__XDIMENSION:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__YDIMENSION:
			case Data3dPackage.CARTESIAN_COORDINATES_SET_EXTENT__ZDIMENSION:
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
