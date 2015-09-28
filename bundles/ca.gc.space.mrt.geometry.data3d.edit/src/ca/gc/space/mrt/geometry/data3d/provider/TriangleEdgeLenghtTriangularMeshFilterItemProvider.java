/**
 * Canadian Space Agency 2008.
 */
package ca.gc.space.mrt.geometry.data3d.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter;

/**
 * This is the item provider adapter for a {@link ca.gc.space.mrt.geometry.data3d.TriangleEdgeLenghtTriangularMeshFilter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriangleEdgeLenghtTriangularMeshFilterItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
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
	public TriangleEdgeLenghtTriangularMeshFilterItemProvider(AdapterFactory adapterFactory) {
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

			addMinimumRangePropertyDescriptor(object);
			addMaximumRangePropertyDescriptor(object);
			addMaximumEdgeLenghtPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Minimum Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangleEdgeLenghtTriangularMeshFilter_minimumRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangleEdgeLenghtTriangularMeshFilter_minimumRange_feature", "_UI_TriangleEdgeLenghtTriangularMeshFilter_type"),
				 Data3dPackage.Literals.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Range feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumRangePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangleEdgeLenghtTriangularMeshFilter_maximumRange_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangleEdgeLenghtTriangularMeshFilter_maximumRange_feature", "_UI_TriangleEdgeLenghtTriangularMeshFilter_type"),
				 Data3dPackage.Literals.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Edge Lenght feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaximumEdgeLenghtPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TriangleEdgeLenghtTriangularMeshFilter_maximumEdgeLenght_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TriangleEdgeLenghtTriangularMeshFilter_maximumEdgeLenght_feature", "_UI_TriangleEdgeLenghtTriangularMeshFilter_type"),
				 Data3dPackage.Literals.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TriangleEdgeLenghtTriangularMeshFilter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TriangleEdgeLenghtTriangularMeshFilter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		TriangleEdgeLenghtTriangularMeshFilter triangleEdgeLenghtTriangularMeshFilter = (TriangleEdgeLenghtTriangularMeshFilter)object;
		return getString("_UI_TriangleEdgeLenghtTriangularMeshFilter_type") + " " + triangleEdgeLenghtTriangularMeshFilter.getMinimumRange();
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

		switch (notification.getFeatureID(TriangleEdgeLenghtTriangularMeshFilter.class)) {
			case Data3dPackage.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MINIMUM_RANGE:
			case Data3dPackage.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MAXIMUM_RANGE:
			case Data3dPackage.TRIANGLE_EDGE_LENGHT_TRIANGULAR_MESH_FILTER__MAXIMUM_EDGE_LENGHT:
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
		return Data3dEditPlugin.INSTANCE;
	}

}
