/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.las.provider;


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

import org.eclipse.symphony.common.geometry.data3d.las.LASPoint;
import org.eclipse.symphony.common.geometry.data3d.las.Symphony__CommonGeometryData3DLASPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.las.LASPoint} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LASPointItemProvider 
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
	public LASPointItemProvider(AdapterFactory adapterFactory) {
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
			addIntensityPropertyDescriptor(object);
			addReturnNumberPropertyDescriptor(object);
			addNumberOfReturnsPropertyDescriptor(object);
			addScanDirectionPropertyDescriptor(object);
			addEdgeOfFlightLinePropertyDescriptor(object);
			addClassificationPropertyDescriptor(object);
			addScanAngleRankPropertyDescriptor(object);
			addUserDataPropertyDescriptor(object);
			addPointSourceIdPropertyDescriptor(object);
			addGpsTimePropertyDescriptor(object);
			addRedPropertyDescriptor(object);
			addGreenPropertyDescriptor(object);
			addBluePropertyDescriptor(object);
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
				 getString("_UI_LASPoint_x_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_x_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_LASPoint_y_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_y_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_LASPoint_z_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_z_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intensity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntensityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_intensity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_intensity_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__INTENSITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Return Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_returnNumber_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_returnNumber_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__RETURN_NUMBER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Returns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfReturnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_numberOfReturns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_numberOfReturns_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__NUMBER_OF_RETURNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scan Direction feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScanDirectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_scanDirection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_scanDirection_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__SCAN_DIRECTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Edge Of Flight Line feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEdgeOfFlightLinePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_edgeOfFlightLine_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_edgeOfFlightLine_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__EDGE_OF_FLIGHT_LINE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_classification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_classification_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__CLASSIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scan Angle Rank feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScanAngleRankPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_scanAngleRank_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_scanAngleRank_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__SCAN_ANGLE_RANK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_userData_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_userData_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__USER_DATA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Point Source Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPointSourceIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_pointSourceId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_pointSourceId_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__POINT_SOURCE_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gps Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGpsTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LASPoint_gpsTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_gpsTime_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__GPS_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_LASPoint_red_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_red_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__RED,
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
				 getString("_UI_LASPoint_green_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_green_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__GREEN,
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
				 getString("_UI_LASPoint_blue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LASPoint_blue_feature", "_UI_LASPoint_type"),
				 Symphony__CommonGeometryData3DLASPackage.Literals.LAS_POINT__BLUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LASPoint.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LASPoint"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		LASPoint lasPoint = (LASPoint)object;
		return getString("_UI_LASPoint_type") + " " + lasPoint.getX();
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

		switch (notification.getFeatureID(LASPoint.class)) {
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__X:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__Y:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__Z:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__INTENSITY:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__RETURN_NUMBER:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__NUMBER_OF_RETURNS:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__SCAN_DIRECTION:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__EDGE_OF_FLIGHT_LINE:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__CLASSIFICATION:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__SCAN_ANGLE_RANK:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__USER_DATA:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__POINT_SOURCE_ID:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__GPS_TIME:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__RED:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__GREEN:
			case Symphony__CommonGeometryData3DLASPackage.LAS_POINT__BLUE:
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
