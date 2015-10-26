/**
 * Canadian Space Agency 2008.
 *
 * $Id: PointsRangeGagerItemProvider.java,v 1.3.4.2 2015/05/21 15:50:28 pallard Exp $
 */
package org.eclipse.symphony.common.geometry.data3d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.PointsRangeGager;
import org.eclipse.symphony.common.processors.provider.ProcessorItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.PointsRangeGager} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PointsRangeGagerItemProvider
	extends ProcessorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointsRangeGagerItemProvider(AdapterFactory adapterFactory) {
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

			addMinXPropertyDescriptor(object);
			addMaxXPropertyDescriptor(object);
			addMinYPropertyDescriptor(object);
			addMaxYPropertyDescriptor(object);
			addMinZPropertyDescriptor(object);
			addMaxZPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointsRangeGager_minX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PointsRangeGager_minX_feature", "_UI_PointsRangeGager_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.POINTS_RANGE_GAGER__MIN_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxXPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointsRangeGager_maxX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PointsRangeGager_maxX_feature", "_UI_PointsRangeGager_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.POINTS_RANGE_GAGER__MAX_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointsRangeGager_minY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PointsRangeGager_minY_feature", "_UI_PointsRangeGager_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.POINTS_RANGE_GAGER__MIN_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxYPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointsRangeGager_maxY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PointsRangeGager_maxY_feature", "_UI_PointsRangeGager_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.POINTS_RANGE_GAGER__MAX_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointsRangeGager_minZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PointsRangeGager_minZ_feature", "_UI_PointsRangeGager_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.POINTS_RANGE_GAGER__MIN_Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Z feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxZPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PointsRangeGager_maxZ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PointsRangeGager_maxZ_feature", "_UI_PointsRangeGager_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.POINTS_RANGE_GAGER__MAX_Z,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns PointsRangeGager.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PointsRangeGager"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IProgressMonitor labelValue = ((PointsRangeGager)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PointsRangeGager_type") :
			getString("_UI_PointsRangeGager_type") + " " + label;
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

		switch (notification.getFeatureID(PointsRangeGager.class)) {
			case Symphony__CommonGeometryData3DPackage.POINTS_RANGE_GAGER__MIN_X:
			case Symphony__CommonGeometryData3DPackage.POINTS_RANGE_GAGER__MAX_X:
			case Symphony__CommonGeometryData3DPackage.POINTS_RANGE_GAGER__MIN_Y:
			case Symphony__CommonGeometryData3DPackage.POINTS_RANGE_GAGER__MAX_Y:
			case Symphony__CommonGeometryData3DPackage.POINTS_RANGE_GAGER__MIN_Z:
			case Symphony__CommonGeometryData3DPackage.POINTS_RANGE_GAGER__MAX_Z:
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
