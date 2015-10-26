/**
 * Canadian Space Agency 2008.
 *
 * $Id: DelaunayMesherItemProvider.java,v 1.2.4.2 2015/05/21 15:50:28 pallard Exp $
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
import org.eclipse.symphony.common.geometry.data3d.DelaunayMesher;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.geometry.data3d.DelaunayMesher} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DelaunayMesherItemProvider
	extends CartesianPositionCoordinatesMesherItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelaunayMesherItemProvider(AdapterFactory adapterFactory) {
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

			addTolerancePropertyDescriptor(object);
			addAlphaPropertyDescriptor(object);
			addOffsetPropertyDescriptor(object);
			addBoundingTriangulationPropertyDescriptor(object);
			addMeshingPlanePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tolerance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTolerancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelaunayMesher_tolerance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelaunayMesher_tolerance_feature", "_UI_DelaunayMesher_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.DELAUNAY_MESHER__TOLERANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alpha feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlphaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelaunayMesher_alpha_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelaunayMesher_alpha_feature", "_UI_DelaunayMesher_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.DELAUNAY_MESHER__ALPHA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelaunayMesher_offset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelaunayMesher_offset_feature", "_UI_DelaunayMesher_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.DELAUNAY_MESHER__OFFSET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Bounding Triangulation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBoundingTriangulationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelaunayMesher_boundingTriangulation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelaunayMesher_boundingTriangulation_feature", "_UI_DelaunayMesher_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.DELAUNAY_MESHER__BOUNDING_TRIANGULATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Meshing Plane feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMeshingPlanePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelaunayMesher_meshingPlane_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelaunayMesher_meshingPlane_feature", "_UI_DelaunayMesher_type"),
				 Symphony__CommonGeometryData3DPackage.Literals.DELAUNAY_MESHER__MESHING_PLANE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns DelaunayMesher.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DelaunayMesher"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		IProgressMonitor labelValue = ((DelaunayMesher)object).getProgressMonitor();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_DelaunayMesher_type") :
			getString("_UI_DelaunayMesher_type") + " " + label;
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

		switch (notification.getFeatureID(DelaunayMesher.class)) {
			case Symphony__CommonGeometryData3DPackage.DELAUNAY_MESHER__TOLERANCE:
			case Symphony__CommonGeometryData3DPackage.DELAUNAY_MESHER__ALPHA:
			case Symphony__CommonGeometryData3DPackage.DELAUNAY_MESHER__OFFSET:
			case Symphony__CommonGeometryData3DPackage.DELAUNAY_MESHER__BOUNDING_TRIANGULATION:
			case Symphony__CommonGeometryData3DPackage.DELAUNAY_MESHER__MESHING_PLANE:
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
