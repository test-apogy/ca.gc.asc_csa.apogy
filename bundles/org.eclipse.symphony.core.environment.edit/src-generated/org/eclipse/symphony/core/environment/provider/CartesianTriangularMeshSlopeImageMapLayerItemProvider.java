/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.CartesianTriangularMeshSlopeImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianTriangularMeshSlopeImageMapLayerItemProvider extends CartesianTriangularMeshDerivedImageMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianTriangularMeshSlopeImageMapLayerItemProvider(AdapterFactory adapterFactory) {
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

			addAutoScalePropertyDescriptor(object);
			addMinimumSlopePropertyDescriptor(object);
			addMaximumSlopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshSlopeImageMapLayer_autoScale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshSlopeImageMapLayer_autoScale_feature", "_UI_CartesianTriangularMeshSlopeImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMinimumSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshSlopeImageMapLayer_minimumSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshSlopeImageMapLayer_minimumSlope_feature", "_UI_CartesianTriangularMeshSlopeImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Maximum Slope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addMaximumSlopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CartesianTriangularMeshSlopeImageMapLayer_maximumSlope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CartesianTriangularMeshSlopeImageMapLayer_maximumSlope_feature", "_UI_CartesianTriangularMeshSlopeImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This returns CartesianTriangularMeshSlopeImageMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CartesianTriangularMeshSlopeImageMapLayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((CartesianTriangularMeshSlopeImageMapLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CartesianTriangularMeshSlopeImageMapLayer_type") : label;
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

		switch (notification.getFeatureID(CartesianTriangularMeshSlopeImageMapLayer.class)) {
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__AUTO_SCALE:
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MINIMUM_SLOPE:
			case SymphonyEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_SLOPE_IMAGE_MAP_LAYER__MAXIMUM_SLOPE:
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
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE ||
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}